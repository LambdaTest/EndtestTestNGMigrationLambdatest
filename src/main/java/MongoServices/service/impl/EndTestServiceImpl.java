package MongoServices.service.impl;

import MongoServices.DTO.request.EndTestProjectSuiteLinkingDTO;
import MongoServices.DTO.response.ResponseDto;
import MongoServices.DTO.response.SuiteIdProjectIdForTestIdDTO;
import MongoServices.mongo.entity.EndTestDocumentDAO;

import java.util.List;

public interface EndTestServiceImpl {
  List<String> getDistinctValuesBasedOnField(String field);

  List<EndTestDocumentDAO> getResultBasedOnFieldValue(String field, String value);

  ResponseDto saveTheLinkingData(EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO);

  EndTestProjectSuiteLinkingDTO getDataFromLinkingDB(String suiteId);

  SuiteIdProjectIdForTestIdDTO getSuiteIdProjectIdForTestIdDTO(String testId);

  ResponseDto getSuiteTestIdDateAndSaveInLinkingDB(String appId, String appCode);
}
