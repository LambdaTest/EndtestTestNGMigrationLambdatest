package testng_framework;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base extends Constant {
  private final org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(Base.class);
  // Lambdatest Credentials can be found here at https://www.lambdatest.com/capabilities-generator
  String username = System.getenv("LT_USERNAME") == null ? "YOUR LT_USERNAME" : System.getenv("LT_USERNAME");
  String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "YOUR LT_ACCESS_KEY" : System.getenv("LT_ACCESS_KEY");
  RemoteWebDriver driver;
  public String status = "failed";
  protected Actions actions;

//  @BeforeTest(alwaysRun = true)
//  @Parameters(value = { "browser", "version", "platform", "build", "name", "platformName", "deviceName",
//    "platformVersion" })
//  public void setUp(String browser, String version, String platform, String build, String name, String platformName,
//    String deviceName, String platformVersion) {
//    System.out.println("before test");
//    DesiredCapabilities capability = new DesiredCapabilities();
//    if (isProvided(browser)) {
//      capability.setCapability(CapabilityType.BROWSER_NAME, browser);
//    }
//    if (isProvided(version)) {
//      capability.setCapability(CapabilityType.VERSION, version);
//    }
//    if (isProvided(platform)) {
//      capability.setCapability(CapabilityType.PLATFORM, platform);
//    }
//    if (isProvided(build)) {
//      capability.setCapability("build", build);
//    }
//    if (isProvided(name)) {
//      capability.setCapability("name", name);
//    }
//    if (isProvided(platformName)) {
//      capability.setCapability("platformName", platformName);
//    }
//    if (isProvided(deviceName)) {
//      capability.setCapability("deviceName", deviceName);
//    }
//    if (isProvided(platformVersion)) {
//      capability.setCapability("platformVersion", platformVersion);
//    }
//
//    capability.setCapability("network", false);
//    capability.setCapability("video", true);
//    capability.setCapability("console", false);
//    capability.setCapability("visual", false);
//
//    String gridURL = "http://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
//    try {
//      driver = new RemoteWebDriver(new URL(gridURL), capability);
//      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//      actions = new Actions(driver);
//      EnvSetup.driver.set(driver);
//    } catch (Exception e) {
//      ltLogger.error("driver creation fail");
//      ltLogger.error(e.getMessage());
//    }
//  }
//
//  @AfterTest
//  public void afterTest() {
//    EnvSetup.driver.get().quit();
//  }
//
//  public boolean isProvided(String givenValue) {
//    return !(givenValue == null || givenValue.isEmpty());
//  }

}
