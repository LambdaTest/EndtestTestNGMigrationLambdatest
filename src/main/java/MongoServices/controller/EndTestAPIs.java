package MongoServices.controller;

import MongoServices.DTO.request.EndTestProjectSuiteLinkingDTO;
import MongoServices.DTO.response.ResponseDto;
import MongoServices.mongo.entity.EndTestDocumentDAO;
import MongoServices.service.impl.EndTestServiceImpl;
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

}
