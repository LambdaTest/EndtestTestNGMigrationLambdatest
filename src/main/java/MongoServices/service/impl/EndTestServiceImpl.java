package com.pack.service.impl;

import com.pack.repository.mongo.entity.EndTestDocument;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EndTestServiceImpl {
        List<String> getDistinctValuesBasedOnField(String field);

        List<EndTestDocument> getResultBasedOnFieldValue(String field, String value);
}
