package MongoServices.service;

import MongoServices.mongo.entity.EndTestDocumentDAO;
import MongoServices.service.impl.EndTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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

}
