package cucumberRunnerFiles.hooks;

import cucumberRunnerFiles.testrunner.EnvSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testng_framework.Constant;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Hooks extends Constant {

  org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(Hooks.class);
  private boolean noBrowser = false;
  private boolean mobile = false;

  public Hooks() {
    super();
  }

  private Capabilities getCapabilities() {
    Map<String, String> givenClientCap = getHasMapFromString(System.getProperty("GIVEN_CLIENT_CAPS", "video=true"));
    DesiredCapabilities capabilities = new DesiredCapabilities();
    if (mobile) {
      capabilities.setCapability("platformName", givenClientCap.getOrDefault("platformName", "Android"));
      capabilities.setCapability("deviceName", givenClientCap.getOrDefault("deviceName", "Galaxy S20 Plus"));
      capabilities.setCapability("platformVersion", givenClientCap.getOrDefault("platformVersion", "10"));
      capabilities.setCapability("appiumVersion", givenClientCap.getOrDefault("appiumVersion", "1.17.0"));
      capabilities.setCapability("build",
        "Automation_suit_Client_browser_Build_Mobile_" + EnvSetup.JENKINS_JOB_IDENTIFIER.get());
      ChromeOptions options = new ChromeOptions();
      options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
      options.setExperimentalOption("w3c", false);
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
      capabilities.setCapability("geoLocation", "ES");
    } else {
      capabilities.setCapability("browserName", givenClientCap.getOrDefault("browserName", "Chrome"));
      capabilities.setCapability("version", givenClientCap.getOrDefault("version", "latest-2"));
      capabilities.setCapability("platform", givenClientCap.getOrDefault("platform", "Windows 10"));
      capabilities.setCapability("resolution", givenClientCap.getOrDefault("resolution", "1920x1080"));
      capabilities.setCapability("build",
        "Automation_suit_Client_browser_Build_Desktop_" + EnvSetup.JENKINS_JOB_IDENTIFIER.get());
    }
    capabilities.setCapability(NETWORK, givenClientCap.getOrDefault(NETWORK, TRUE).equalsIgnoreCase(TRUE));
    capabilities.setCapability(VIDEO, givenClientCap.getOrDefault(VIDEO, TRUE).equalsIgnoreCase(TRUE));
    // set to true will reduce speed. use it for debug only.
    capabilities.setCapability(CONSOLE, givenClientCap.getOrDefault(CONSOLE, TRUE).equalsIgnoreCase(TRUE));
    // set to true will reduce speed. use it for debug only.
    capabilities.setCapability(VISUAL, givenClientCap.getOrDefault(VISUAL, TRUE).equalsIgnoreCase(TRUE));
    capabilities.setCapability("user", EnvSetup.CLIENT_ENV_USERNAME);
    capabilities.setCapability("accessKey", EnvSetup.CLIENT_ENV_USERNAME);
    // set all capability which are not can be given as string and not added above
    for (Map.Entry<String, String> entry : givenClientCap.entrySet()) {
      if (capabilities.getCapability(entry.getKey()) == null) {
        capabilities.setCapability(entry.getKey(), entry.getValue());
      }
    }
    System.out.println(capabilities);
    ltLogger.info("capabilities: -{}", capabilities);
    return capabilities;
  }

  private void createDriver() {
    Capabilities caps = getCapabilities();
    String gridURL = "https://" + EnvSetup.CLIENT_ENV_USERNAME + ":" + EnvSetup.CLIENT_ENV_KEY + "@" + EnvSetup.CLIENT_ENV_HUB_SUB_STR + ".lambdatest.com/wd/hub";
    System.out.println(gridURL);
    try {
      RemoteWebDriver testDriver = new RemoteWebDriver(new URL(gridURL), caps);
      testDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      testDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
      if (!mobile) {
        testDriver.manage().window().maximize();
      }
      EnvSetup.driver.set(testDriver);
      System.out.println("hook" + EnvSetup.driver.get());
      EnvSetup.CLIENT_ENV_SESSION_ID.set(testDriver.getSessionId().toString());
    } catch (MalformedURLException e) {
      ltLogger.error(
        "ERROR: cucumber.yaml file has incorrect values in mentioned fields: client_env_username, client_env_key");
      e.printStackTrace();
    }
  }

  @Before(order = 10, value = "@nobrowser")
  public void beforeNoBrowser(Scenario scenario) {
    noBrowser = true;
  }

  @Before(order = 11, value = "@mobile")
  public void beforeMobile(Scenario scenario) {
    mobile = true;
  }

  @Before(order = 100)
  public void initateBrowser(Scenario scenario) {
    EnvSetup.JENKINS_JOB_IDENTIFIER.set(System.getProperty("JENKINS_JOB_IDENTIFIER"));
    if (!noBrowser) {
      String localBrowser = System.getProperty("LOCAL_BROWSER", "false");
      ltLogger.info("localBrowser is '{}' ", localBrowser);
      createDriver();
    }
  }

  @After(order = 100)
  public void closeTheBrowser(Scenario scenario) {
    if (scenario.isFailed()) {
      //taking a screenshot
      final byte[] screenshot = ((TakesScreenshot) EnvSetup.driver.get()).getScreenshotAs(OutputType.BYTES);
      //adding the screenshot to the report
      scenario.attach(screenshot, "image/jpg", scenario.getName());
    }
    scenario.log("https://automation.lambdatest.com/logs/?testID=" + EnvSetup.CLIENT_ENV_SESSION_ID.get());
    EnvSetup.driver.get().executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
    EnvSetup.driver.get().quit();
  }

  public Map<String, String> getHasMapFromString(String commaSeparatedList) {
    String[] list = commaSeparatedList.split(",");
    HashMap<String, String> hashmapList = new HashMap<>();
    for (int i = 0; i < list.length; i++) {
      hashmapList.put(list[i].split("=")[0], list[i].split("=")[1]);
    }
    return hashmapList;
  }

}
