package endtest_transformer_bots;

import DTO.response.SuiteIdProjectIdForTestIdDTO;
import DTO.response.TestCaseStepsDTO;
import testng_framework.ApiHelper;
import com.google.common.reflect.TypeToken;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
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

      SuiteIdProjectIdForTestIdDTO suiteIdProjectIdForTestIdDTO = apiHelper.convertJsonToObject(
        apiHelper.getReqAsString("http://localhost:9990/endTest/getSuiteIdFromTestId?testId=" + s),
        SuiteIdProjectIdForTestIdDTO.class);

      createSeleniumStepFromJsonStep(listOfTestCaseSteps, suiteIdProjectIdForTestIdDTO);
    }
  }

  public void createSeleniumStepFromJsonStep(List<TestCaseStepsDTO> listOfTestCaseSteps,
    SuiteIdProjectIdForTestIdDTO suiteIdProjectIdForTestIdDTO) {
    for (TestCaseStepsDTO t : listOfTestCaseSteps) {
      String fileName = numberCharsToWord(suiteIdProjectIdForTestIdDTO.getSuiteName().replace(" ", "_"))
        .replaceAll("[^a-zA-Z_]", "") + "--_--" + numberCharsToWord(t.getName().replace(" ", "_")).replaceAll("[^a-zA-Z_]", "") + ".txt";
      stepToCode.addCodeFromStep(fileName, t);
    }
  }

  public void createSeleniumStepForTestID(String filename, String testID) {
    ApiHelper apiHelper = new ApiHelper();
    List<TestCaseStepsDTO> listOfTestCaseSteps = apiHelper.convertJsonToObject(
      apiHelper.getReqAsString("http://localhost:9990/endTest/getResultBasedOnFieldValue/test_case_id?value=" + testID),
      new TypeToken<List<TestCaseStepsDTO>>() {
      }.getType());

    for (TestCaseStepsDTO t : listOfTestCaseSteps) {
      stepToCode.addCodeFromStep(filename, t);
    }
  }

  public String numberCharsToWord(String givenName) {
    char[] charArr = givenName.toCharArray();
    String finalName = "";
    for (char c : charArr) {
      switch (String.valueOf(c)) {
      case "0":
        finalName = finalName.concat("zero");
        break;
      case "1":
        finalName = finalName.concat("One");
        break;
      case "2":
        finalName = finalName.concat("Two");
        break;
      case "3":
        finalName = finalName.concat("Three");
        break;
      case "4":
        finalName = finalName.concat("Four");
        break;
      case "5":
        finalName = finalName.concat("Five");
        break;
      case "6":
        finalName = finalName.concat("Six");
        break;
      case "7":
        finalName = finalName.concat("Seven");
        break;
      case "8":
        finalName = finalName.concat("Eight");
        break;
      case "9":
        finalName = finalName.concat("Nine");
        break;
      default:
        finalName = finalName.concat(String.valueOf(c));
        break;
      }
    }
    return finalName;
  }

}
