package Autobots;

import MongoServices.DTO.response.TestCaseStepsDTO;
import TestngFramwork.ApiHelper;
import com.google.common.reflect.TypeToken;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class EndTestTransformer {

  // 1- To get all the testId,
  // 2- For loop on all the testId,
  // 3- Based on testId get all steps, and steps should be sorted by there number,
  // 4- Read each step and generate java code.
  // 5- Read import step from mongo and follow step number 4.

  @Test
  public void testWriter(){
    ApiHelper apiHelper = new ApiHelper();
    List<TestCaseStepsDTO> listOfTestCaseSteps = new ArrayList<>();
    List<String> testcasesId = apiHelper.convertJsonToObject(apiHelper
          .getReqAsString("http://localhost:9990/endTest/test_case_id"),
          new TypeToken<List<String>>(){}.getType());
    for (String s : testcasesId){
      listOfTestCaseSteps = apiHelper.convertJsonToObject(apiHelper
        .getReqAsString("http://localhost:9990/endTest/getResultBasedOnFieldValue/test_case_id?value="+s)
        , new TypeToken<List<TestCaseStepsDTO>>(){}.getType());
    }
    System.out.println(listOfTestCaseSteps);

  }

}
