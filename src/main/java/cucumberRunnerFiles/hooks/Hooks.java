package cucumberRunnerFiles.hooks;

import cucumberRunnerFiles.testrunner.EnvSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import testng_framework.Constant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks extends Constant {

  org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(Hooks.class);
  private boolean noBrowser = false;

  public Hooks() {
    super();
  }

  private Capabilities getCapabilities() {
    System.out.println("get capability inside");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "Chrome");
    capabilities.setCapability("version", "latest");
    capabilities.setCapability("platform", "Windows 10");
    capabilities.setCapability("resolution", "1920x1080");
    capabilities.setCapability("build",
      "Automation_suit_Client_browser_Build_" + EnvSetup.JENKINS_JOB_IDENTIFIER.get());
    capabilities.setCapability("network", false);
    capabilities.setCapability("video", true);
    capabilities.setCapability("console", true);
    // switch on if you need debugging
    capabilities.setCapability("visual", false);
    capabilities.setCapability("user", EnvSetup.CLIENT_ENV_USERNAME);
    capabilities.setCapability("accessKey", EnvSetup.CLIENT_ENV_USERNAME);
    return capabilities;
  }

  private void createDriver() {
    Capabilities caps = getCapabilities();
    String gridURL = "https://" + EnvSetup.CLIENT_ENV_USERNAME + ":" + EnvSetup.CLIENT_ENV_KEY + "@" + EnvSetup.CLIENT_ENV_HUB_SUB_STR + ".lambdatest.com/wd/hub";
    System.out.println(gridURL);
    try {
      RemoteWebDriver testDriver = new RemoteWebDriver(new URL(gridURL), caps);
      testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      testDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      testDriver.manage().window().maximize();
      EnvSetup.driver.set(testDriver);
      System.out.println("hook"+EnvSetup.driver.get());
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
    EnvSetup.driver.get().executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
    EnvSetup.driver.get().quit();
  }

}
