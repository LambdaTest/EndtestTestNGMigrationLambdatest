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
  public static void generateSuiteFromTest() {
    List<Path> allFilesPath = getAllFilePathIn(TEST_PATH);
    for (Path filePath : allFilesPath) {
      String filename = filePath.getFileName().toString();
      String suitName = filename.split(SUITE_TEST_SEPARATOR)[0];
      String testName = filename.split(SUITE_TEST_SEPARATOR)[1].replaceAll(".txt", "").replaceAll(" ", "_")
        .replaceAll("[^a-zA-Z_]]", "");
      createXMLAndClassIfNotExist(suitName);
      addTestToSuiteClass(suitName, testName);
    }
  }

  public static List<Path> getAllFilePathIn(String folderPath) {
    try {
      return Files.list(Paths.get(folderPath)).filter(Files::isRegularFile).collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void createXMLAndClassIfNotExist(String suiteName) {
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

  public static void writeToFile(String path, String textToWrite) {
    try (FileWriter myWriter = new FileWriter(path);) {
      myWriter.write(textToWrite);
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public static void addTestToSuiteClass(String suiteName, String testName) {
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
      testName) + "\n" + testFileContent + "\n" + TEST_END_BODY + SUITE_CLASS_END_BODY;
    writeToFile(SUITE_CLASS_PATH + suiteName + ".java", finalSuitClassBody);
  }
}
