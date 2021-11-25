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
  protected static final String PARTIAL_LINK = "partial_link";
  protected static final String TEXT_INSIDE = "Text Inside";
  protected static final String SUITE_XML_PATH = System.getProperty("user.dir")
    .split("EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "src/main/resources/";
  protected static final String DYNAMIC_XML_BODY = "<!DOCTYPE suite SYSTEM \"http://testng.org/testng-1.0.dtd\">\n" + "\n" + "<suite thread-count=\"1\" verbose=\"1\" name=\"Lambdatest Suite\"\n" + "\tannotations=\"JDK\" parallel=\"tests\">\n" + "\n" + "\t<test name=\"Test1\">\n" + "\t\t<parameter name=\"browser\" value=\"Chrome\" />\n" + "\t\t<parameter name=\"version\" value=\"latest-1\" />\n" + "\t\t<parameter name=\"platform\" value=\"win10\" />\n" + "\t\t<classes>\n" + "\t\t\t<class name=\"generated_tests.<addSuiteName>\" />\n" + "\t\t</classes>\n" + "\t</test>\n" + "\n" + "</suite>";
  protected static final String CLASS_NAME_PLACE_HOLDER_IN_XML = "<addSuiteName>";
  protected static final String SUITE_CLASS_PATH = System.getProperty("user.dir").split(
    "EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "src/main/java/generated_tests/";
  protected static final String SUITE_CLASS_END_BODY = "}";
  protected static final String DYNAMIC_SUITE_CLASS_BODY = "package generated_tests;\n" + "\n" + "import testng_framework.WebDriverHelper;\n" + "import org.testng.annotations.Test;\n" + "\n" + "public class <addSuiteName> extends WebDriverHelper {\n" + "\n" + " \n" + "}";
  protected static final String TEST_PATH = System.getProperty("user.dir")
    .split("EndtestTestNGMigrationLambdatest")[0] + "EndtestTestNGMigrationLambdatest" + "/" + "logs/testsFiles/";
  protected static final String TEST_FILE_EXTENSION = "";
  protected static final String SUITE_TEST_SEPARATOR = "--_--";
  protected static final String TEST_START_BODY = "  @Test\n" + "  public void <addTestName>() {";
  protected static final String TEST_END_BODY = "    status = \"passed\"; \n " + "  }\n";
  protected static final String TEST_NAME_PLACEHOLDER_IN_TEST = "<addTestName>";

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
