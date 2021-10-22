package com.pack.controller;

import com.pack.repository.mongo.entity.EndTestDocument;
import com.pack.service.impl.EndTestServiceImpl;
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
  public List<EndTestDocument> getResultBasedOnFieldValue(@PathVariable String field, @RequestParam(value = "value") String value){
    return endTestServiceImpl.getResultBasedOnFieldValue(field, value);
  }

}
