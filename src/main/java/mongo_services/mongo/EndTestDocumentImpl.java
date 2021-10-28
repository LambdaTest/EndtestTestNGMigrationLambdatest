package mongo_services.mongo;

import mongo_services.mongo.entity.EndTestDocumentDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EndTestDocumentImpl extends MongoRepository<EndTestDocumentDAO,String> {
}
