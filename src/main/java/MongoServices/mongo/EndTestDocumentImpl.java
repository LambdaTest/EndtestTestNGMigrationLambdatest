package com.pack.repository.mongo;

import com.pack.repository.mongo.entity.EndTestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EndTestDocumentImpl extends MongoRepository<EndTestDocument,String> {
}
