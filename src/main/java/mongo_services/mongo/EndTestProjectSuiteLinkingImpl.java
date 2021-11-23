package mongo_services.mongo;

import mongo_services.mongo.entity.EndTestProjectSuiteLinkingDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EndTestProjectSuiteLinkingImpl extends MongoRepository<EndTestProjectSuiteLinkingDAO,String> {
}
