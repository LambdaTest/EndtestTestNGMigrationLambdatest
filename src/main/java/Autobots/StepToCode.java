package Autobots;

import MongoServices.DTO.response.TestCaseStepsDTO;
import TestngFramwork.Constant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

  public void writeInFile(String fileName, String codeLine) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("logs/" + fileName,true))) {
      writer.append(codeLine);
      writer.append("\n");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    /*try {
      FileWriter myWriter = new FileWriter("logs/" + fileName);
      myWriter.write(codeLine);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }*/

  }
}
