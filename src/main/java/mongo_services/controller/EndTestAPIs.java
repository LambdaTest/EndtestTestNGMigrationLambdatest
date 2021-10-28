package mongo_services.controller;

import mongo_services.DTO.request.EndTestProjectSuiteLinkingDTO;
import mongo_services.DTO.response.ResponseDto;
import mongo_services.DTO.response.SuiteIdProjectIdForTestIdDTO;
import mongo_services.mongo.entity.EndTestDocumentDAO;
import mongo_services.service.impl.EndTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/endTest")
public class EndTestAPIs {

  @Autowired EndTestServiceImpl endTestServiceImpl;

  @GetMapping("/{fieldName}")
  public List<String> getDistictValueOfFieldPassed(@PathVariable String fieldName){
    return endTestServiceImpl.getDistinctValuesBasedOnField(fieldName);
  }

  @GetMapping("/getResultBasedOnFieldValue/{field}")
  public List<EndTestDocumentDAO> getResultBasedOnFieldValue(@PathVariable String field, @RequestParam(value = "value") String value){
    return endTestServiceImpl.getResultBasedOnFieldValue(field, value);
  }

  @PostMapping("/savingLinkingDataInMongo")
  public ResponseDto savingLinkingDataInMongo(@RequestBody EndTestProjectSuiteLinkingDTO endTestProjectSuiteLinkingDTO) {
    return endTestServiceImpl.saveTheLinkingData(endTestProjectSuiteLinkingDTO);
  }

  @GetMapping("/getSuiteIdLinkedData")
  public EndTestProjectSuiteLinkingDTO getDataFromLinkingDB(@RequestParam(name = "suiteId") String suiteId){
    return endTestServiceImpl.getDataFromLinkingDB(suiteId);
  }

  @GetMapping("/getSuiteIdFromTestId")
  public SuiteIdProjectIdForTestIdDTO getSuiteIdProjectIdForTestIdDTO(@RequestParam String testId){
      return endTestServiceImpl.getSuiteIdProjectIdForTestIdDTO(testId);
  }

  @GetMapping("/getSuiteTestIdDateAndSaveInLinkingDB")
  public ResponseDto getSuiteTestIdDateAndSaveInLinkingDB(@RequestParam(name = "appId") String appId, @RequestParam(name = "appCode") String appCode){
    return endTestServiceImpl.getSuiteTestIdDateAndSaveInLinkingDB(appId,appCode);
  }
}
