package MongoServices.controller;

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

}
