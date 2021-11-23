package testng_framework;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base extends Constant {
  private final org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(Base.class);
  // Lambdatest Credentials can be found here at https://www.lambdatest.com/capabilities-generator
  String username = System.getenv("LT_USERNAME") == null ? "YOUR LT_USERNAME" : System.getenv("LT_USERNAME");
  String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "YOUR LT_ACCESS_KEY" : System.getenv("LT_ACCESS_KEY");
  RemoteWebDriver driver;
  public String status = "failed";
  protected Actions actions;

  @BeforeTest(alwaysRun = true)
  @Parameters(value = { "browser", "version", "platform" })
  public void setUp(String browser, String version, String platform){
    DesiredCapabilities capability = new DesiredCapabilities();
    capability.setCapability(CapabilityType.BROWSER_NAME, browser);
    capability.setCapability(CapabilityType.VERSION, version);
    capability.setCapability(CapabilityType.PLATFORM, platform);
    capability.setCapability("build", "TestNG Single Test");
    capability.setCapability("name", "TestNG Single");
    capability.setCapability("network", true);
    capability.setCapability("video", true);
    capability.setCapability("console", true);
    capability.setCapability("visual", true);

    String gridURL = "http://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
    try {
      driver = new RemoteWebDriver(new URL(gridURL), capability);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      actions = new Actions(driver);
      EnvSetup.driver.set(driver);
    } catch (Exception e) {
      ltLogger.error("driver creation fail");
      ltLogger.error(e.getMessage());
    }
  }

  @AfterTest
  public void afterTest() {
    driver = EnvSetup.driver.get();
    try{
      ((JavascriptExecutor) driver).executeScript("lambda-status=" + status + "");
    }catch (Exception e){

    } finally {
      if (driver != null) {
        driver.quit();
      }
    }
  }

}
