package MongoServices.mongo;

import MongoServices.mongo.entity.EndTestProjectSuiteLinkingDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EndTestProjectSuiteLinkingImpl extends MongoRepository<EndTestProjectSuiteLinkingDAO,String> {
}
