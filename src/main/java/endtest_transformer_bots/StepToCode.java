package endtest_transformer_bots;

import mongo_services.DTO.response.TestCaseStepsDTO;
import org.testng.Assert;
import testng_framework.Constant;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StepToCode extends Constant {

  public void addCodeFromStep(String fileName, TestCaseStepsDTO givenTestCaseStepsDTO) {
    fileName = TEST_PATH + fileName;
    String switchCondition;
    switchCondition = givenTestCaseStepsDTO.getType();

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
    case "write":
      writeIntoElement(fileName, givenTestCaseStepsDTO);
      break;
    case "PickOptionFromSelect":
      pickOptionFromSelect(fileName, givenTestCaseStepsDTO);
      break;
    default:
      break;
    }
  }

  private void pickOptionFromSelect(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter1());
    writeInFile(fileName,
      "selectOption(new String[] { " + locator[0] + ", \" + locator[1] + \" }, \"" + testCaseStepsDTO.getParameter2() + "\");");
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
    case "WaitUntil":
    default:
      break;
    }
  }

  private void assertWithCondition(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter2());
    String switchCondition = testCaseStepsDTO.getParameter1();
    switch (switchCondition) {
    case "CheckVisibleElement":
      writeInFile(fileName,
        "Assert.assertTrue(isDisplayed(new String[] {" + locator[0] + ", \"" + locator[1] + "\"}));");
      break;
    case "CheckContainsValue":
      writeInFile(fileName,
        "Assert.assertTrue(getText(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }).contains(\"" + testCaseStepsDTO.getParameter3() + "\"));");
      break;
    case "CheckElement":
      writeInFile(fileName,
        "Assert.assertTrue(isElementAvailable(new String[] { " + locator[0] + ", \"" + locator[1] + "\" }));");
      break;
    default:
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
    return new String[] { Constant.locatorUsing.get(using), Locator.replace("\\\\", "") };
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
      dirPath = "/logs";
    }
    boolean status = false;
    try {
      FileUtils.forceMkdir(new File(dirPath));
      status = new File(filePath).createNewFile();
      System.out.println(status);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println(status);
    }
  }
}
