package cucumberRunnerFiles.testrunner;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class EnvSetup {

  private static org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(EnvSetup.class);

  public static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
  public static final ThreadLocal<String> JENKINS_JOB_IDENTIFIER = new ThreadLocal<>();
  public static final ThreadLocal<SoftAssert> SOFT_ASSERT = new ThreadLocal<>();
  public static final ThreadLocal<String> CLIENT_ENV_SESSION_ID = new ThreadLocal<>();
  public static final ThreadLocal<Map<String, String>> GIVEN_CAPS = new ThreadLocal<>();
  public static final ThreadLocal<Map<String, String>> ML_TEST_RESULTS = new ThreadLocal<>();
  
  public static final String TEST_ENV_NAME = "prod";
  protected static Map<String, String> config = getEnvConfig();
  public static final String CLIENT_ENV_USERNAME = System.getProperty("CLIENT_ENV_USERNAME", "").isEmpty() ? config.get("client_env_username") : System.getProperty("CLIENT_ENV_USERNAME");
  public static final String CLIENT_ENV_KEY = System.getProperty("CLIENT_ENV_KEY", "").isEmpty() ? config.get("client_env_key") : System.getProperty("CLIENT_ENV_KEY");
  public static final String CLIENT_ENV_HUB_SUB_STR = config.get("client_env_hubUrlStr");
  public static final String CLIENT_ENV_URL_SUB_STR = config.get("client_env_url_sub_str");


  EnvSetup() {
    super();
  }

  @SuppressWarnings("unchecked")
  private static Map<String, String> getEnvConfig() {
    File yamlFile = new File("src/main/java/cucumberRunnerFiles/testrunner/cucumber.yaml");
    Yaml ymlFileReader = new Yaml();
    Object envValue = null;
    try {
      InputStream inStr = new FileInputStream(yamlFile);
      Map<String, Object> ymlObj = ymlFileReader.load(inStr);
      envValue = ymlObj.get(TEST_ENV_NAME);
      return (HashMap<String, String>) envValue;
    } catch (FileNotFoundException e) {
      ltLogger.error("ERROR: Cucumber.yaml file is not found / Error came while getting TEST_ENV_NAME");
      e.printStackTrace();
    }
    return (Map<String, String>) envValue;
  }
  

}