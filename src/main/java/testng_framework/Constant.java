package testng_framework;

import java.util.HashMap;
import java.util.Map;

public class Constant {

  protected static final String CLASS = "class";
  protected static final String ID = "id";
  protected static final String CSS = "css";
  protected static final String XPATH = "xpath";
  protected static final String NAME = "name";
  protected static final String TAG_NAME = "tagname";
  protected static final String LINK = "link";
  protected static final String LINK_TEXT = "Link Text";
  protected static final String PARTIAL_LINK = "partial_link";
  protected static final String TEXT_INSIDE = "Text Inside";
  protected static final String HREF = "href";
  protected static final String SUITE_XML_PATH = System.getProperty("user.dir").split(
    "EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "src/main/java/testNgRunnerXML/";
  //  protected static final String DYNAMIC_XML_BODY = "<!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\">\n" + "\n" + "<suite thread-count=\"1\" verbose=\"1\" name=\"Lambdatest Suite\"\n" + "\tannotations=\"JDK\" parallel=\"tests\">\n" + "\n" + "\t<test name=\"Test1\">\n" + "\t\t<parameter name=\"browser\" value=\"Chrome\" />\n" + "\t\t<parameter name=\"version\" value=\"latest-1\" />\n" + "\t\t<parameter name=\"platform\" value=\"win10\" />\n" + "\t\t<classes>\n" + "\t\t\t<class name=\"generated_tests.<addSuiteName>\" />\n" + "\t\t</classes>\n" + "\t</test>\n" + "\n" + "</suite>";
  protected static final String DYNAMIC_XML_BODY = "<!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\">\n" + "\n" + "<suite thread-count=\"1\" verbose=\"1\" name=\"Lambdatest Suite\"\n" + "\tannotations=\"JDK\" parallel=\"tests\">\n" + "\n" + "\t<test name=\"Test1\">\n" + "\t\t<parameter name=\"browser\" value=\"Chrome\" />\n" + "\t\t<parameter name=\"version\" value=\"latest-1\" />\n" + "\t\t<parameter name=\"platform\" value=\"win10\" />\n" + "\t\t<parameter name=\"build\" value=\"<addSuiteName>\" />\n" + "\t\t<parameter name=\"name\" value=\"<addSuiteName>\" />\n" + "\t\t<classes>\n" + "\t\t\t<class name=\"generated_tests.<addSuiteName>\" />\n" + "\t\t</classes>\n" + "\t</test>\n" + "\n" + "</suite>";
  protected static final String CLASS_NAME_PLACE_HOLDER_IN_XML = "<addSuiteName>";
  protected static final String SUITE_CLASS_PATH = System.getProperty("user.dir").split(
    "EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "src/main/java/generated_tests/";
  protected static final String SUITE_FEATURE_PATH = System.getProperty("user.dir").split(
    "EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "src/main/java/features/";
  protected static final String SUITE_STEP_FILE_PATH = System.getProperty("user.dir")
    .split("EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "src/main/java/StepDef/";
  protected static final String SUITE_CLASS_END_BODY = "}";
  protected static final String DYNAMIC_SUITE_CLASS_BODY = "package generated_tests;\n" + "\n" + "import testng_framework.WebDriverHelper;\n" + "import org.testng.Assert;\n" + "import org.testng.annotations.Test;\n" + "import java.io.File;\n" + "\n" + "public class <addSuiteName> extends WebDriverHelper {\n" + "\n" + " \n" + "}";
  protected static final String TEST_PATH = System.getProperty("user.dir")
    .split("EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "logs/testsFiles/";
  protected static final String TEST_FILE_EXTENSION = "";
  protected static final String SUITE_TEST_SEPARATOR = "--_--";
  protected static final String TEST_START_BODY = "  @Test\n" + "  public void <addTestName>() {\n" + "javascriptExecution(\"lambda-name=<SCENARIO_NAME>\");" + "\n";
  protected static final String TEST_END_BODY = "    status = \"passed\"; \n " + "  }\n";
  protected static final String TEST_NAME_PLACEHOLDER_IN_TEST = "<addTestName>";
  protected static final String DYNAMIC_FEATURE_BODY = "@<FEATURE_FILE_TAG>\n" + "Feature: <FEATURE_NAME> \n";
  protected static final String FEATURE_FILE_TAG = "<FEATURE_FILE_TAG>";
  protected static final String FEATURE_NAME = "<FEATURE_NAME>";
  protected static final String DYNAMIC_SCENARIO_BODY = "\n" + "  @<TEST_TAG>\n" + "  Scenario: <SCENARIO_NAME>\n" + "    Given <SCENARIO_NAME>\n";
  protected static final String SCENARIO_TEST_TAG_PLACEHOLDER = "<TEST_TAG>";
  protected static final String SCENARIO_NAME_PLACEHOLDER = "<SCENARIO_NAME>";
  protected static final String DYNAMIC_STEP_DEF_BODY = "package StepDef;\n" + "\n" + "import generated_tests.<SUITE_CLASS_NAME_IN_STEP>;\n" + "import io.cucumber.java.en.Given;\n" + "\n" + "public class <SUITE_CLASS_NAME_IN_STEP>_StepDef {\n" + "  <SUITE_CLASS_NAME_IN_STEP> <SUITE_CLASS_OBJECT_NAME_IN_STEP> = new <SUITE_CLASS_NAME_IN_STEP>();\n" + "\n" + "}";
  protected static final String SUITE_CLASS_NAME_IN_STEP = "<SUITE_CLASS_NAME_IN_STEP>";
  protected static final String SUITE_CLASS_OBJECT_NAME_IN_STEP = "<SUITE_CLASS_OBJECT_NAME_IN_STEP>";
  protected static final String SCENARIO_STEP_BODY = "\n" + "  @Given(\"<SCENARIO_NAME>\")\n" + "  public void <TEST_STEP_SCENARIO_METHOD>Step() {\n" + "    <SUITE_CLASS_OBJECT_NAME_IN_STEP>.<TEST_STEP_METHOD>();\n" + "  }" + "\n";
  protected static final String TEST_STEP_METHOD = "<TEST_STEP_METHOD>";
  protected static final String TEST_STEP_SCENARIO_METHOD = "<TEST_STEP_SCENARIO_METHOD>";
  protected static final String CONSOLE_LOGS = "consoleLogs";
  protected static final String CONSOLE = "console";
  protected static final String VIDEO = "video";
  protected static final String VISUAL = "visual";
  protected static final String NETWORK = "network";
  protected static final String TRUE = "true";
  protected static final String FALSE = "false";

  public static Map<String, String> locatorUsing = getLocatorUsing();

  public static Map<String, String> getLocatorUsing() {
    Map<String, String> locatorUsing = new HashMap<>();
    locatorUsing.put(ID, "ID");
    locatorUsing.put("css_selector", "CSS");
    locatorUsing.put(XPATH, "XPATH");
    locatorUsing.put("class_name", "CLASS");
    locatorUsing.put(NAME, "NAME");
    locatorUsing.put("tag_name", "TAG_NAME");
    locatorUsing.put(LINK, "LINK");
    locatorUsing.put(PARTIAL_LINK, "PARTIAL_LINK");
    return locatorUsing;
  }
}
