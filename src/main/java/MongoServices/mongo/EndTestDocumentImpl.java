package MongoServices.mongo;

import MongoServices.mongo.entity.EndTestDocumentDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EndTestDocumentImpl extends MongoRepository<EndTestDocumentDAO,String> {
}
