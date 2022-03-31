package service.impl;

import DTO.request.EndTestProjectSuiteLinkingDTO;
import DTO.response.ResponseDto;
import DTO.response.SuiteIdProjectIdForTestIdDTO;
import mongo.entity.EndTestDocumentDAO;

import java.util.List;

public interface EndTestServiceImpl {
  List<String> getDistinctValuesBasedOnField(String field);

  List<EndTestDocumentDAO> getResultBasedOnFieldValue(String field, String value);

  ResponseDto saveTheLinkingData(EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO);

  EndTestProjectSuiteLinkingDTO getDataFromLinkingDB(String suiteId);

  SuiteIdProjectIdForTestIdDTO getSuiteIdProjectIdForTestIdDTO(String testId);

  ResponseDto getSuiteTestIdDateAndSaveInLinkingDB(String appId, String appCode);
}
