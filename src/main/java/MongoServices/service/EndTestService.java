package MongoServices.service;

import MongoServices.DTO.request.EndTestProjectSuiteLinkingDTO;
import MongoServices.DTO.response.EndTestSuitesUnderProjectDto;
import MongoServices.DTO.response.ErrorDto;
import MongoServices.DTO.response.ResponseDto;
import MongoServices.DTO.response.SuiteIdProjectIdForTestIdDTO;
import MongoServices.common.ApiURLs;
import MongoServices.common.Constants;
import MongoServices.mongo.entity.EndTestDocumentDAO;
import MongoServices.mongo.entity.EndTestProjectSuiteLinkingDAO;
import MongoServices.service.impl.EndTestServiceImpl;
import MongoServices.transformer.TransformingDtoToDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.result.UpdateResult;
import org.bson.BsonArray;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service public class EndTestService implements EndTestServiceImpl {

  @Qualifier("mongoDbReference") @Autowired MongoTemplate mongoTemplate;

  @Autowired RestTemplateService restTemplateService;

  @Override
  public List<String> getDistinctValuesBasedOnField(String field) {
    return mongoTemplate.findDistinct(field, EndTestDocumentDAO.class, String.class);
  }

  @Override
  public List<EndTestDocumentDAO> getResultBasedOnFieldValue(String field, String value) {
    Query query = new Query();
    query.addCriteria(Criteria.where(field).is(value));
    return mongoTemplate.find(query, EndTestDocumentDAO.class);
  }

  @Override
  public ResponseDto saveTheLinkingData(EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO) {
    ResponseDto responseDto = new ResponseDto();
    Query query = new Query();
    query.addCriteria(Criteria.where("suiteId").is(endTestProjectSuiteLinkingDTO.getSuiteId()));
    Document document = new Document();
    mongoTemplate.getConverter().write(endTestProjectSuiteLinkingDTO, document);
    UpdateResult updateResult = mongoTemplate.upsert(query, Update.fromDocument(document),
      EndTestProjectSuiteLinkingDAO.class, Constants.endTestSuite);

    if ((updateResult.getMatchedCount() == 0 && updateResult.getUpsertedId() != null) || (updateResult.getMatchedCount() > 0 && updateResult.getUpsertedId() == null)) {
      responseDto.setSuccessCode(Constants.statusCode);
      responseDto.setSuccessMessage(Constants.successMessage);
    } else {
      responseDto.setErrorCode(Constants.errorCode);
      responseDto.setErrorMessage(Constants.errorMessage);
    }
    return responseDto;
  }

  @Override
  public EndTestProjectSuiteLinkingDTO getDataFromLinkingDB(String suiteId) {
    TransformingDtoToDao transformingDtoToDao = new TransformingDtoToDao();
    Query query = new Query().addCriteria(Criteria.where("suiteId").is(suiteId));
    return transformingDtoToDao.getTransformedData(mongoTemplate.findOne(query, EndTestProjectSuiteLinkingDAO.class));
  }

  @Override
  public SuiteIdProjectIdForTestIdDTO getSuiteIdProjectIdForTestIdDTO(String testId) {
    TransformingDtoToDao transformingDtoToDao = new TransformingDtoToDao();
    Query query = new Query();
    query.addCriteria(Criteria.where("tests._id").is(testId));
    EndTestProjectSuiteLinkingDAO endTestProjectSuiteLinkingDAO = mongoTemplate.findOne(query,
      EndTestProjectSuiteLinkingDAO.class);
    return transformingDtoToDao.getSuiteIdProjectId(endTestProjectSuiteLinkingDAO, testId);
  }

  @Override
  public ResponseDto getSuiteTestIdDateAndSaveInLinkingDB(String appId, String appCode) {
    TransformingDtoToDao transformingDtoToDao = new TransformingDtoToDao();

    List<EndTestSuitesUnderProjectDto> endTestIdUnderTestSuite;
    EndTestProjectSuiteLinkingDAO endTestProjectSuiteLinkingDAO;

    //Getting suiteId and suiteName from below api hit on line 91 and 92.
    List<EndTestSuitesUnderProjectDto> endTestSuitesUnderProjectDto = restTemplateService
            .getSuiteIdListUsingAppCodeAndAppId(ApiURLs.getTestSuites, appId, appCode);

    for (EndTestSuitesUnderProjectDto e : endTestSuitesUnderProjectDto) {
      //Getting testId and name from below api hit based on individual suiteIds. line 97-98
      endTestIdUnderTestSuite = restTemplateService.getTestIdListUnderSuiteId(ApiURLs.getTestSuites, appId, appCode,
        e.getId());
      endTestProjectSuiteLinkingDAO = transformingDtoToDao.getDaoFromDto(endTestIdUnderTestSuite);
      endTestProjectSuiteLinkingDAO.setSuiteId(e.getId());
      endTestProjectSuiteLinkingDAO.setSuiteName(e.getName());
      try {
        Query query = new Query();
        query.addCriteria(Criteria.where("suiteId").is(endTestProjectSuiteLinkingDAO.getSuiteId()));
        Document document = new Document();
        mongoTemplate.getConverter().write(endTestProjectSuiteLinkingDAO, document);
        document.put("tests",endTestProjectSuiteLinkingDAO.getTests());
        mongoTemplate.upsert(query,Update.fromDocument(document),EndTestProjectSuiteLinkingDAO.class);
      } catch (Exception exception) {
        return (ResponseDto) new ErrorDto(400,
          "Server was not able to save the appId and appCode related suite information in the database");
      }
    }
    return new ResponseDto(200, "Server saved the suiteId and TestId in database based on the appId and appCode given");
  }

}
