package MongoServices.service.impl;

import MongoServices.mongo.entity.EndTestDocumentDAO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EndTestServiceImpl {
        List<String> getDistinctValuesBasedOnField(String field);

        List<EndTestDocumentDAO> getResultBasedOnFieldValue(String field, String value);
}
