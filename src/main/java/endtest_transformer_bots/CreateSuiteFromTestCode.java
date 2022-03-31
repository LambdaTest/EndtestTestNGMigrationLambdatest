package endtest_transformer_bots;

import testng_framework.Constant;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CreateSuiteFromTestCode extends Constant {

  @Test
  public void generateSuiteFromTest() {
    List<Path> allFilesPath = getAllFilePathIn(TEST_PATH);
    for (Path filePath : allFilesPath) {
      String filename = filePath.getFileName().toString();
      String suiteName = filename.split(SUITE_TEST_SEPARATOR)[0];
      String testName = filename.split(SUITE_TEST_SEPARATOR)[1].replaceAll(".txt", "").replaceAll(" ", "_")
        .replaceAll("[^a-zA-Z_]]", "");
      // create feature and step file if not exist
      createFeatureAndStepIfNotExist(suiteName);
      // add scenario and step definitions
      addScenarioToFeatureFile(suiteName, testName);
      addStepToStepDefFile(suiteName, testName);
      // add scenario to feature file and step file.
      createXMLAndClassIfNotExist(suiteName);
      addTestToSuiteClass(suiteName, testName);
    }
  }

  private void addStepToStepDefFile(String suiteName, String testName) {
    String stepDefFileContent = null;
    String stepContents = null;
    try {
      stepDefFileContent = new String(
        Files.readAllBytes(Paths.get(SUITE_STEP_FILE_PATH + suiteName + "_StepDef.java")));
    } catch (Exception e) {
      e.printStackTrace();
    }
    int lastIndex = 0;

    if (stepDefFileContent != null && !stepDefFileContent.equalsIgnoreCase("")) {
      lastIndex = stepDefFileContent.lastIndexOf("}");
      stepDefFileContent = stepDefFileContent.substring(0, lastIndex);
    } else {
      System.out.println("file is empty");
    }
    stepContents = SCENARIO_STEP_BODY.replaceAll(SCENARIO_NAME_PLACEHOLDER,
        suiteName.replaceAll("_", " ") + " : " + testName.replaceAll("_", " "))
      .replaceAll(TEST_STEP_SCENARIO_METHOD, suiteName + testName).replaceAll(TEST_STEP_METHOD, testName)
      .replaceAll(SUITE_CLASS_OBJECT_NAME_IN_STEP, suiteName.replaceAll("_", ""));
    writeToFile(SUITE_STEP_FILE_PATH + suiteName + "_StepDef.java",
      stepDefFileContent + stepContents + SUITE_CLASS_END_BODY);
  }

  private void addScenarioToFeatureFile(String suiteName, String testName) {
    String scenarioContents = null;
    String featureFileContent = null;
    try {
      featureFileContent = new String(Files.readAllBytes(Paths.get(SUITE_FEATURE_PATH + suiteName + ".feature")));
      Integer suiteTagCount = featureFileContent.split(suiteName).length - 1;
      String currtestTag = suiteName + "_" + suiteTagCount;
      scenarioContents = DYNAMIC_SCENARIO_BODY.replaceAll(SCENARIO_NAME_PLACEHOLDER,
          suiteName.replaceAll("_", " ") + " : " + testName.replaceAll("_", " "))
        .replaceAll(SCENARIO_TEST_TAG_PLACEHOLDER, currtestTag);

      writeToFile(SUITE_FEATURE_PATH + suiteName + ".feature", featureFileContent + scenarioContents);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void createFeatureAndStepIfNotExist(String suiteName) {
    boolean isFeatureFileExist = new File(SUITE_FEATURE_PATH + suiteName + ".feature").isFile();
    boolean isStepFileExist = new File(SUITE_STEP_FILE_PATH + suiteName + "_StepDef.java").isFile();
    if (!isFeatureFileExist) {
      boolean status = false;
      try {
        FileUtils.forceMkdir(new File(SUITE_FEATURE_PATH));
        status = new File(SUITE_FEATURE_PATH + suiteName + ".feature").createNewFile();
        String featureTxt = DYNAMIC_FEATURE_BODY.replace(FEATURE_FILE_TAG, suiteName)
          .replace(FEATURE_NAME, suiteName.replaceAll("_", " "));
        writeToFile(SUITE_FEATURE_PATH + suiteName + ".feature", featureTxt);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    if (!isStepFileExist) {
      boolean status = false;
      try {
        FileUtils.forceMkdir(new File(SUITE_STEP_FILE_PATH));
        status = new File(SUITE_STEP_FILE_PATH + suiteName + "_StepDef.java").createNewFile();
        String stepTxt = DYNAMIC_STEP_DEF_BODY.replace(SUITE_CLASS_NAME_IN_STEP, suiteName)
          .replace(SUITE_CLASS_OBJECT_NAME_IN_STEP, suiteName.replaceAll("_", ""));
        writeToFile(SUITE_STEP_FILE_PATH + suiteName + "_StepDef.java", stepTxt);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public List<Path> getAllFilePathIn(String folderPath) {
    try {
      return Files.list(Paths.get(folderPath)).filter(Files::isRegularFile).collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void createXMLAndClassIfNotExist(String suiteName) {
    boolean isSuiteClassExist = new File(SUITE_CLASS_PATH + suiteName + ".java").isFile();
    boolean isSuiteXmlExist = new File(SUITE_XML_PATH + suiteName + ".xml").isFile();
    if (!isSuiteXmlExist) {
      System.out.println("file not existed");
      boolean status = false;
      try {
        FileUtils.forceMkdir(new File(SUITE_XML_PATH));
        status = new File(SUITE_XML_PATH + suiteName + ".xml").createNewFile();
        String xmlTxt = DYNAMIC_XML_BODY.replace(CLASS_NAME_PLACE_HOLDER_IN_XML, suiteName);
        writeToFile(SUITE_XML_PATH + suiteName + ".xml", xmlTxt);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    if (!isSuiteClassExist) {
      System.out.println("file not existed");
      boolean status = false;
      try {
        FileUtils.forceMkdir(new File(SUITE_CLASS_PATH));
        status = new File(SUITE_CLASS_PATH + suiteName + ".java").createNewFile();
        //        String classText = DYNAMIC_SUITE_CLASS_BODY.replace(CLASS_NAME_PLACE_HOLDER_IN_XML, SuiteName);
        writeToFile(SUITE_CLASS_PATH + suiteName + ".java",
          DYNAMIC_SUITE_CLASS_BODY.replace(CLASS_NAME_PLACE_HOLDER_IN_XML, suiteName));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void writeToFile(String path, String textToWrite) {
    try (FileWriter myWriter = new FileWriter(path);) {
      myWriter.write(textToWrite);
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void addTestToSuiteClass(String suiteName, String testName) {
    String testFileContent = null;
    String suiteClassFileContent = null;
    try {
      suiteClassFileContent = new String(Files.readAllBytes(Paths.get(SUITE_CLASS_PATH + suiteName + ".java")));
      testFileContent = new String(
        Files.readAllBytes(Paths.get(TEST_PATH + suiteName + SUITE_TEST_SEPARATOR + testName + ".txt")));
    } catch (Exception e) {
      e.printStackTrace();
    }
    int lastIndex = 0;
    if (suiteClassFileContent != null && !suiteClassFileContent.equalsIgnoreCase("")) {
      lastIndex = suiteClassFileContent.lastIndexOf("}");
      suiteClassFileContent = suiteClassFileContent.substring(0, lastIndex);
    } else {
      System.out.println("file is empty");
    }
    String finalSuitClassBody = suiteClassFileContent + TEST_START_BODY.replaceAll(TEST_NAME_PLACEHOLDER_IN_TEST,
      testName).replaceAll(SCENARIO_NAME_PLACEHOLDER,
      testName.replaceAll("_", " ")) + "\n" + testFileContent + "\n" + TEST_END_BODY + SUITE_CLASS_END_BODY;
    writeToFile(SUITE_CLASS_PATH + suiteName + ".java", finalSuitClassBody);
  }
}
