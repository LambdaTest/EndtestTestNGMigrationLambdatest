package MongoServices.service;

import MongoServices.DTO.request.EndTestProjectSuiteLinkingDTO;
import MongoServices.DTO.response.ResponseDto;
import MongoServices.common.Constants;
import MongoServices.mongo.entity.EndTestDocumentDAO;
import MongoServices.mongo.entity.EndTestProjectSuiteLinkingDAO;
import MongoServices.service.impl.EndTestServiceImpl;
import MongoServices.transformer.TransformingDtoToDao;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndTestService implements EndTestServiceImpl {

  @Qualifier("mongoDbReference")
  @Autowired MongoTemplate mongoTemplate;

  @Override
  public List<String> getDistinctValuesBasedOnField(String field) {
    return mongoTemplate.findDistinct(field, EndTestDocumentDAO.class,String.class);
  }

  @Override
  public List<EndTestDocumentDAO> getResultBasedOnFieldValue(String field,String value) {
    Query query = new Query();
    query.addCriteria(Criteria.where(field).is(value));
    return mongoTemplate.find(query,EndTestDocumentDAO.class);
  }

  @Override
  public ResponseDto saveTheLinkingData(EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO) {
    ResponseDto responseDto = new ResponseDto();
    Query query = new Query();
    query.addCriteria(Criteria.where("suiteId").is(endTestProjectSuiteLinkingDTO.getSuiteId()));
      Document document = new Document();
      mongoTemplate.getConverter().write(endTestProjectSuiteLinkingDTO,document);
     UpdateResult updateResult = mongoTemplate.upsert(query, Update.fromDocument(document)
       , EndTestProjectSuiteLinkingDAO.class, Constants.endTestSuite);

     if ((updateResult.getMatchedCount() == 0 && updateResult.getUpsertedId()!=null) ||
       (updateResult.getMatchedCount() > 0 && updateResult.getUpsertedId() == null)) {
       responseDto.setSuccessCode(Constants.statusCode);
       responseDto.setSuccessMessage(Constants.successMessage);
     }else {
       responseDto.setErrorCode(Constants.errorCode);
       responseDto.setErrorMessage(Constants.errorMessage);
     }
    return responseDto;
  }

  public EndTestProjectSuiteLinkingDTO getDataFromLinkingDB(String suiteId){
    TransformingDtoToDao transformingDtoToDao = new TransformingDtoToDao();
    Query query = new Query().addCriteria(Criteria.where("suiteId").is(suiteId));
    return transformingDtoToDao.getTransformedData(mongoTemplate.findOne(query,EndTestProjectSuiteLinkingDAO.class));
  }

}
