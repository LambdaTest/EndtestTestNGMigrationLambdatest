package Autobots;

import MongoServices.DTO.response.TestCaseStepsDTO;
import TestngFramwork.Constant;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StepToCode {

  public void addCodeFromStep(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    switch (testCaseStepsDTO.getType()) {
    case "GetLink":
      getLinkT(fileName, testCaseStepsDTO);
      break;
    case "Click":
      clickT(fileName, testCaseStepsDTO);
      break;
    default:
      break;
    }
  }

  public void clickT(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    String[] locator = locatorTransform(testCaseStepsDTO.getLocator(), testCaseStepsDTO.getParameter1());
    writeInFile(fileName, "clickOnElement( new String[] {\"" + locator[0] + "\", \"" + locator[1] + "\"});");
  }

  public void getLinkT(String fileName, TestCaseStepsDTO testCaseStepsDTO) {
    writeInFile(fileName, "getURL(" + testCaseStepsDTO.getParameter1() + ");");
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
    int lastIndex = filePath.lastIndexOf("/");
    String dirPath = filePath.substring(0, lastIndex);
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
