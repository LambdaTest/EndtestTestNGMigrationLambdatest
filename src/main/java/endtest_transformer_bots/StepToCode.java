package endtest_transformer_bots;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mongo_services.DTO.response.TestCaseStepsDTO;
import org.apache.logging.log4j.LogManager;
import testng_framework.Constant;
import org.apache.commons.io.FileUtils;
import testng_framework.WebDriverHelper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;

public class StepToCode extends Constant {

  private final org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(WebDriverHelper.class);

  public void addCodeFromStep(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    String justFileName = fileName;
    fileName = TEST_PATH + fileName;
    String switchCondition;
    switchCondition = givenTestCaseStepsDTO.getType();
    writeInFile(fileName, "// " + givenTestCaseStepsDTO.getStep_name());
    switch (switchCondition) {
    case "GetLink":
      getLinkT(fileName, givenTestCaseStepsDTO);
      break;
    case "Click":
      clickT(fileName, givenTestCaseStepsDTO);
      break;
    case "Assert":
      assertWithCondition(fileName, givenTestCaseStepsDTO);
      break;
    case "Miscellaneous":
      miscellaneous(fileName, givenTestCaseStepsDTO);
      break;
    case "StartIf":
      startIf(fileName, givenTestCaseStepsDTO);
      break;
    case "EndIf":
      endIf(fileName);
      break;
    case "Write":
      writeIntoElement(fileName, givenTestCaseStepsDTO);
      break;
    case "PickOptionFromSelect":
      pickOptionFromSelect(fileName, givenTestCaseStepsDTO);
      break;
    case "SnippingTool":
      snippingTool(fileName, givenTestCaseStepsDTO);
      break;
    case "TakeScreenshot":
      takeScreenshot(fileName, givenTestCaseStepsDTO);
      break;
    case "Pause":
      pause(fileName, givenTestCaseStepsDTO);
      break;
    case "ExecuteJS":
      executeJS(fileName, givenTestCaseStepsDTO);
      break;
    case "SetVariable":
      setVariable(fileName, givenTestCaseStepsDTO);
      break;
    case "ImportCase":
      new EndTestTransformer().createSeleniumStepForTestID(justFileName, givenTestCaseStepsDTO.getParameter1());
      break;
    case "StartElse":
      startElse(fileName, givenTestCaseStepsDTO);
      break;
    case "EndElse":
      endElse(fileName, givenTestCaseStepsDTO);
      break;
    case "Print":
      print(fileName, givenTestCaseStepsDTO);
      break;
    case "PressKey":
      pressKey(fileName, givenTestCaseStepsDTO);
      break;
    case "Scroll":
      scroll(fileName, givenTestCaseStepsDTO);
      break;
    case "Loop":
      loop(justFileName, givenTestCaseStepsDTO);
      break;
    default:
      System.out.println("step not automated" + givenTestCaseStepsDTO);
      break;
    }
  }

  private void endElse(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    writeInFile(fileName, "}");
  }

  private void startElse(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    writeInFile(fileName, "else{");
  }

  public void setVariable(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String setVariableType = testCaseStepsDTO.getParameter2();
    switch (setVariableType) {
    case "EnterValue":
      setVariableEnterValue(fileName, testCaseStepsDTO.getParameter1(), testCaseStepsDTO.getParameter3());
      break;
    case "ExtractFromElement":
      setVariableFromElement(fileName, testCaseStepsDTO, testCaseStepsDTO.getParameter1());
      break;
    case "EnterPassword":
    case "GenerateRandomNumber":
    case "GenerateRandomString":
    case "GenerateRandomEmail":
    case "Timestamp":
    case "ExtractFromElementOCR":
    case "ExtractAttributeFromElement":
    case "ExtractFromJS":
    case "ExtractSelectorFromElement":
    case "ExtractResultFromQuery":
    case "ExtractUrl":
    case "ExtractTitle":
    case "ExtractNumberOfElements":
    case "ExtractNumberOfChildElements":
    default:
      System.out.println("This parameter 2 is not implemented " + setVariableType);
      System.out.println("Test Case DTO " + testCaseStepsDTO);
    }
  }

  private void setVariableFromElement(String fileName, TestCaseStepsDTO testCaseStepsDTO, String variableName) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter3());
    writeInFile(fileName,
      "String " + variableName + " = getText(new String[] { " + locator[0] + ", \"" + locator[1] + "\"  } );");
  }

  private void setVariableEnterValue(String fileName, String variableName, String variableValue) {
    writeInFile(fileName, "String " + variableName + "= \"" + variableValue + "\";");
  }

  private void executeJS(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "javascriptExecution(\"" + testCaseStepsDTO.getParameter1() + "\");");
  }

  private void loop(String justFileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(TEST_PATH + justFileName, "for(int i=0;i<" + testCaseStepsDTO.getParameter2() + ";i++){");
    new EndTestTransformer().createSeleniumStepForTestID(justFileName, testCaseStepsDTO.getParameter1());
    writeInFile(TEST_PATH + justFileName, "}");
  }

  private void pause(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "waitForTime(" + testCaseStepsDTO.getParameter1() + ");");
  }

  private void snippingTool(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter1());
    writeInFile(fileName,
      "takeScreenshotOfParticularElement(new String[] { " + locator[0] + ", \"" + locator[1] + "\" },\"logs/Screenshots/" + getRandomString(
        6) + ".png\");");
  }

  private void takeScreenshot(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    //do we have to make filepath and file name different for image
    writeInFile(fileName, "takeScreenshot(\"logs/Screenshoots/" + getRandomString(6) + ".png\");");
  }

  private void pickOptionFromSelect(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter1());
    writeInFile(fileName,
      "selectOption(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }, \"" + testCaseStepsDTO.getParameter2() + "\");");
  }

  private void writeIntoElement(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter1());
    writeInFile(fileName,
      "typeText(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }, \"" + testCaseStepsDTO.getParameter2() + "\");");
  }

  private void endIf(String fileName) {
    writeInFile(fileName, "}");
  }

  private void startIf(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter2());
    String switchCondition;
    switchCondition = testCaseStepsDTO.getParameter1();

    switch (switchCondition) {
    case "ifClickableElement":
      writeInFile(fileName, "if (isElementClickable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"})){");
      break;
    case "ifClickableNotElement":
      writeInFile(fileName, "if (!isElementClickable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"})){");
      break;
    case "ifContainsValue":
      writeInFile(fileName,
        "if (checkContainsValue(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}, \"" + testCaseStepsDTO.getParameter3() + "\")){");
      break;
    case "ifElement":
      writeInFile(fileName, "if (isElementAvailable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"})){");
      break;
    case "ifNotElement":
      writeInFile(fileName, "if (!isElementAvailable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"})){");
      break;
    case "ifUrlContains":
      writeInFile(fileName, "if (checkCurrentUrlContains(\"" + locator[1] + "\")) {");
      break;
    case "ifVariableAssertion":
      writeInFile(fileName,
        "if (Assert.assertEqual(" + testCaseStepsDTO.getParameter2() + "," + testCaseStepsDTO.getParameter3() + ")) {");
      break;
    case "ifVisibleElement":
      writeInFile(fileName, "if (isDisplayed(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}, 0)) {");
      break;
    default:
      System.out.println("step not automated" + testCaseStepsDTO);
    }

  }

  private void miscellaneous(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter2());
    String switchCondition = testCaseStepsDTO.getParameter1();
    String[] offSetCoordinate;

    switch (switchCondition) {
    case "DoubleClick":
      writeInFile(fileName, "doubleClickOnElement(new String[] {" + locator[0] + ", \"" + locator[1] + "\"});");
      break;
    case "ClearInput":
      writeInFile(fileName, "clearText(new String[] {" + locator[0] + ", \"" + locator[1] + "\"});");
      break;
    case "CloseAlert":
      writeInFile(fileName, "closeAlert();");
      break;
    case "CloseTab":
      writeInFile(fileName, "closeTab();");
      break;
    case "GoBack":
      writeInFile(fileName, "goBack();");
      break;
    case "GoForward":
      writeInFile(fileName, "goForward();");
      break;
    case "Hover":
      writeInFile(fileName, "mouseHoverOnElement(new String[] {" + locator[0] + ", \"" + locator[1] + "\"});");
      break;
    case "OpenNewTab":
      writeInFile(fileName, "openNewTab(\"" + testCaseStepsDTO.getParameter1() + "\");");
    case "Refresh":
      writeInFile(fileName, "pageRefresh();");
      break;
    case "RightClick":
      writeInFile(fileName, "rightClick(new String[] {" + locator[0] + ", \"" + locator[1] + "\"});");
      break;
    case "SwitchBack":
      writeInFile(fileName, "backToMainFrame();");
      break;
    case "SwitchToFrame":
      writeInFile(fileName, "switchToIFrame(new String[] {" + locator[0] + ", \"" + locator[1] + "\"});");
      break;
    case "SwitchToNextTab":
      writeInFile(fileName, "switchToNextWindow();");
      break;
    case "MoveAndClickWithOffset":
      offSetCoordinate = testCaseStepsDTO.getParameter3().split(",");
      writeInFile(fileName,
        "moveAndClickWithOffset(new String[] {" + locator[0] + ", \"" + locator[1] + "\"}, " + offSetCoordinate[0].toString() + "," + offSetCoordinate[1] + ");");
      break;
    case "DoubleClickWithOffset":
      offSetCoordinate = testCaseStepsDTO.getParameter3().split(",");
      writeInFile(fileName,
        "moveAndDoubleClickWithOffset(new String[]{" + locator[0] + ", \"" + locator[1] + "\"}, " + offSetCoordinate[0].toString() + "," + offSetCoordinate[1] + ");");
      break;
    case "SwitchToPreviousTab":
      writeInFile(fileName, "switchToPreviousTab();");
      break;
    case "Utilities":
      utilities(fileName, testCaseStepsDTO);
      break;
    case "WaitUntil":
      waitUntil(fileName, testCaseStepsDTO);
      break;
    case "DeleteCookies":
      deleteCookies(fileName, testCaseStepsDTO);
      break;
    case "ClearLocalStorage":
      clearLocalStorage(fileName, testCaseStepsDTO);
      break;
    case "ClearSessionStorage":
      clearSessionStorage(fileName, testCaseStepsDTO);
      break;
    case "GenerateFullPageScreenshot":
      generateFullPageScreenshoot(fileName, testCaseStepsDTO);
      break;
    default:
      //      ltLogger.info(testCaseStepsDTO);
      System.out.println("step not automated" + testCaseStepsDTO);
      break;
    }
  }

  private void generateFullPageScreenshoot(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "takeScreenshotOfEntirePage(logs/Screenshoots/" + getRandomString(6) + ".png);");

  }

  private void utilities(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    HashMap<String, String> map = storeParamValuesInHashmap(testCaseStepsDTO.getParameter2());
    String method = map.get("method");
    switch (method) {
    case "GetTextLength":
      writeInFile(fileName, "String" + map.get("value_two") + " = getTextLength(" + map.get("value_one") + ");");
      break;
    default:
      System.out.println("Test Case DTO " + testCaseStepsDTO);
      break;
    }
  }

  private void deleteCookies(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String deleteCookieType = testCaseStepsDTO.getParameter2();

    switch (deleteCookieType) {
    case "DeleteAllCookies":
      writeInFile(fileName, "deleteAllCookies();");
      break;
    case "DeleteCookie":
      writeInFile(fileName, "deleteSpecificCookie(" + testCaseStepsDTO.getParameter3() + ");");
      break;
    default:
      System.out.println("Test Case DTO " + testCaseStepsDTO);
      break;
    }
  }

  private void waitUntil(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    HashMap<String, String> map = storeParamValuesInHashmap(testCaseStepsDTO.getParameter2());
    String[] locator = locatorTransform(map.get("locatorType"), map.get("locator"));
    String waitCondition = map.get("waitCondition");

    writeInFile(fileName,
      "waitUntil(\"" + waitCondition + "\", new String[]{" + locator[0] + ", \"" + locator[1] + "\"}, \"" + map.get(
        "maxTime") + "\",\"" + map.get("theRefresh") + "\");");
  }

  public void clearLocalStorage(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "javascriptExecution(\"window.localStorage.clear();\");");
  }

  public void clearSessionStorage(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "javascriptExecution(\"window.sessionStorage.clear();\");");
  }

  private void assertWithCondition(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter2());
    String assertionType = testCaseStepsDTO.getParameter1();
    switch (assertionType) {
    case "CheckClickableElement":
      writeInFile(fileName,
        "Assert.assertTrue(isElementClickable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckClickableNotElement":
      writeInFile(fileName,
        "Assert.assertFalse(isElementClickable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckElement":
      writeInFile(fileName,
        "Assert.assertTrue(isElementAvailable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckNotElement":
      writeInFile(fileName,
        "Assert.assertFalse(isElementAvailable(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckVisibleElement":
      writeInFile(fileName,
        "Assert.assertTrue(isElementDisplayed(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckVisibleNotElement":
      writeInFile(fileName,
        "Assert.assertFalse(isElementDisplayed(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckContainsValue":
      writeInFile(fileName,
        "Assert.assertTrue(getText(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }).contains(\"" + testCaseStepsDTO.getParameter3() + "\"));");
      break;
    case "CheckNotContainsValue":
      writeInFile(fileName,
        "Assert.assertFalse(getText(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }).contains(\"" + testCaseStepsDTO.getParameter3() + "\"));");
      break;
    case "CheckUrlContains":
      writeInFile(fileName,
        "Assert.assertTrue(checkCurrentUrlContains( \"" + testCaseStepsDTO.getParameter2() + "\"));");
      break;
    case "CountChildElements":
      writeInFile(fileName,
        "Assert.assertEquals(getChildElements(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }).size(), \"" + testCaseStepsDTO.getParameter3() + "\");");
      break;
    case "CheckElementScreenshot":
      writeInFile(fileName,
        "getURL(" + testCaseStepsDTO.getParameter3() + "\");\n" + "takeScreenshotOfParticularElement(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }, System.getProperty(\"user.dir\") + \"src/main/resources/files/actual_Image.png\");\n" + "compareImage(new File(System.getProperty(\"user.dir\") + \"src/main/resources/files/expected_Image.png\"), new File(System.getProperty(\"user.dir\") + \"src/main/resources/files/actual_Image.png\"));");
      break;
    case "CheckPageScreenshot":
      writeInFile(fileName,
        "getURL(" + testCaseStepsDTO.getParameter2() + "\");\n" + "takeScreenshot(System.getProperty(\"user.dir\") + \"src/main/resources/files/actual_Image.png\");\n" + "compareImage(new File(System.getProperty(\"user.dir\") + \"src/main/resources/files/expected_Image.png\"), new File(System.getProperty(\"user.dir\") + \"src/main/resources/files/actual_Image.png\"));");
      break;
    case "VariableAssertion":
      writeInFile(fileName,
        "Assert.assertEquals(checkVariableAssertion(" + testCaseStepsDTO.getLocator() + ", \"" + testCaseStepsDTO.getParameter3() + ", \"" + testCaseStepsDTO.getParameter3() + "\");");
      break;
    default:
      System.out.println("step not automated" + testCaseStepsDTO);
      break;
    }
  }

  public void clickT(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter1());
    writeInFile(fileName, "clickOnElement( new String[] {" + locator[0] + ", \"" + locator[1] + "\"});");
  }

  public void getLinkT(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "getURL(\"" + testCaseStepsDTO.getParameter1() + "\");");
  }

  public String[] locatorTransform(String using, String Locator) {
    return new String[] { Constant.locatorUsing.get(using), Locator.replace("\\\\", "").replaceAll("\'", "'") };
  }

  public static void writeInFile(String fileName, String codeLine) {
    createDirectoryAndFile(fileName);
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
      writer.append(codeLine);
      writer.append("\n");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  public static void createDirectoryAndFile(String filePath) {
    // need to revisit this code
    String dirPath;
    if (filePath.contains("/")) {
      int lastIndex = filePath.lastIndexOf("/");
      dirPath = filePath.substring(0, lastIndex);
    } else {
      dirPath = "logs/";
    }
    boolean status = false;
    try {
      File theDir = new File(dirPath);
      if (!theDir.exists()) {
        theDir.mkdirs();
      }
      status = new File(filePath).createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getRandomString(int size) {
    byte[] bytArray = new byte[256];
    new Random().nextBytes(bytArray);

    String randomStr = new String(bytArray, StandardCharsets.UTF_8);
    StringBuilder strBuilder = new StringBuilder();
    // remove all special char
    String alphaStr = randomStr.replaceAll("[^A-Za-z]", "");

    for (int i = 0; i < alphaStr.length(); i++) {
      if (size > 0 && (Character.isLetter(alphaStr.charAt(i)) || Character.isDigit(alphaStr.charAt(i)))) {
        strBuilder.append(alphaStr.charAt(i));
      }
      size--;
    }
    return strBuilder.toString();
  }

  public HashMap storeParamValuesInHashmap(String parameter) {
    String str = parameter.replace("\\\\", "").replace("\\", "");
    return new Gson().fromJson(str, new TypeToken<HashMap<String, String>>() {
    }.getType());
  }

  public void print(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    writeInFile(fileName,
      "printResults(\"" + givenTestCaseStepsDTO.getParameter1() + "\", \"" + givenTestCaseStepsDTO.getParameter2() + "\");");
  }

  public void pressKey(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    String[] locator = locatorTransform(givenTestCaseStepsDTO.getLocator(), givenTestCaseStepsDTO.getParameter2());
    writeInFile(fileName,
      "pressKey(new String[] { " + locator[0] + ", \"" + locator[1] + "\"}, \"" + givenTestCaseStepsDTO.getParameter2() + "\");");
  }

  public void scroll(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    String condition = givenTestCaseStepsDTO.getParameter1();
    String[] locator = locatorTransform(CSS, givenTestCaseStepsDTO.getParameter2());
    switch (condition) {
    case "ScrollElem":
      writeInFile(fileName, "scrollIntoElementView( new String[] {CSS, \"" + locator[1] + "\"});");
      break;
    case "ScrollTop":
    case "ScrollBottom":
      writeInFile(fileName, "scroll(\"" + givenTestCaseStepsDTO.getParameter1() + "\");");
      break;
    case "ScrollLeft":
    case "ScrollRight":
    case "ScrollUp":
    case "ScrollDown":
      writeInFile(fileName,
        "scroll(\"" + givenTestCaseStepsDTO.getParameter1() + "\", " + givenTestCaseStepsDTO.getParameter2() + ");");
      break;
    default:
      System.out.println("Condition not matched.. " +condition);
      break;
    }
  }
}