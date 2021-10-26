package EndTestTransformerBots;

import MongoServices.DTO.response.SuiteIdProjectIdForTestIdDTO;
import MongoServices.DTO.response.TestCaseStepsDTO;
import TestngFramwork.ApiHelper;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class EndTestTransformer {

  // 1- To get all the testId,
  // 2- For loop on all the testId,
  // 3- Based on testId get all steps, and steps should be sorted by there number,
  // 4- Read each step and generate java code.
  // 5- Read import step from mongo and follow step number 4.


  // Another api to get projectId and suiteId from provided testId

  StepToCode stepToCode = new StepToCode();

  @Test
  public void testWriter() {
    ApiHelper apiHelper = new ApiHelper();
    List<TestCaseStepsDTO> listOfTestCaseSteps = new ArrayList<>();
    List<String> testcasesId = apiHelper.convertJsonToObject(
      apiHelper.getReqAsString("http://localhost:9990/endTest/test_case_id"), new TypeToken<List<String>>() {
      }.getType());
    for (String s : testcasesId) {
      listOfTestCaseSteps = apiHelper.convertJsonToObject(
        apiHelper.getReqAsString("http://localhost:9990/endTest/getResultBasedOnFieldValue/test_case_id?value=" + s),
        new TypeToken<List<TestCaseStepsDTO>>() {
        }.getType());

      SuiteIdProjectIdForTestIdDTO suiteIdProjectIdForTestIdDTO = apiHelper.convertJsonToObject(apiHelper
          .getReqAsString("http://localhost:9990/endTest/getSuiteIdFromTestId?testId="+s)
        ,SuiteIdProjectIdForTestIdDTO.class);

      createSeleniumStepFromJsonStep(listOfTestCaseSteps,suiteIdProjectIdForTestIdDTO);
    }
  }

  public void createSeleniumStepFromJsonStep(List<TestCaseStepsDTO> listOfTestCaseSteps, SuiteIdProjectIdForTestIdDTO suiteIdProjectIdForTestIdDTO) {
    for (TestCaseStepsDTO t : listOfTestCaseSteps){
      String fileName = suiteIdProjectIdForTestIdDTO.getSuiteName().replace(" ","_")
              +"______"+t.getName().replace(" ","_").replace("[","")
                  .replace("]","")+".txt";
      stepToCode.addCodeFromStep(fileName,t);
    }
  }

}
