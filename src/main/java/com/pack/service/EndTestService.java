package com.pack.service;

import com.mongodb.client.DistinctIterable;
import com.pack.repository.mongo.entity.EndTestDocument;
import com.pack.service.impl.EndTestServiceImpl;
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
    return mongoTemplate.findDistinct(field, EndTestDocument.class,String.class);
  }

  @Override
  public List<EndTestDocument> getResultBasedOnFieldValue(String field,String value) {
    Query query = new Query();
    query.addCriteria(Criteria.where(field).is(value));
    return mongoTemplate.find(query,EndTestDocument.class);
  }

}
