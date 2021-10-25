package MongoServices.mongo;

import MongoServices.mongo.entity.EndTestDocumentDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EndTestDocumentImpl extends MongoRepository<EndTestDocumentDAO,String> {
}
