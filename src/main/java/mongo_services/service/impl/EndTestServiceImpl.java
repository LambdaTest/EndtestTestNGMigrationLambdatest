package mongo_services.service.impl;

import mongo_services.DTO.request.EndTestProjectSuiteLinkingDTO;
import mongo_services.DTO.response.ResponseDto;
import mongo_services.DTO.response.SuiteIdProjectIdForTestIdDTO;
import mongo_services.mongo.entity.EndTestDocumentDAO;

import java.util.List;

public interface EndTestServiceImpl {
  List<String> getDistinctValuesBasedOnField(String field);

  List<EndTestDocumentDAO> getResultBasedOnFieldValue(String field, String value);

  ResponseDto saveTheLinkingData(EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO);

  EndTestProjectSuiteLinkingDTO getDataFromLinkingDB(String suiteId);

  SuiteIdProjectIdForTestIdDTO getSuiteIdProjectIdForTestIdDTO(String testId);

  ResponseDto getSuiteTestIdDateAndSaveInLinkingDB(String appId, String appCode);
}
