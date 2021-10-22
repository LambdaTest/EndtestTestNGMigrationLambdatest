package TestngFramwork;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LocalTest {

  // Lambdatest Credentails can be found here at
  // https://www.lambdatest.com/capabilities-generator
  String username = System.getenv("LT_USERNAME") == null ? "YOUR LT_USERNAME" : System.getenv("LT_USERNAME");
  String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "YOUR LT_ACCESS_KEY" : System.getenv("LT_ACCESS_KEY");

  public static WebDriver driver;
  public static String status = "failed";

  @BeforeTest(alwaysRun = true)
  @Parameters(value = { "browser", "version", "platform" })
  public void setUp(String browser, String version, String platform) throws Exception {

    DesiredCapabilities capability = new DesiredCapabilities();
    capability.setCapability(CapabilityType.BROWSER_NAME, browser);
    capability.setCapability(CapabilityType.VERSION, version);
    capability.setCapability(CapabilityType.PLATFORM, platform);
    capability.setCapability("build", "TestNG Single Test1");
    capability.setCapability("name", "TestNG Single");
    capability.setCapability("tunnel", true);
    capability.setCapability("tunnelName", "GCloud");
    //capability.setCapability("network", false);
    //capability.setCapability("video", true);
    //capability.setCapability("console", false);
    //capability.setCapability("visual", false);

    String gridURL = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
    try {
      driver = new RemoteWebDriver(new URL(gridURL), capability);
    } catch (Exception e) {
      System.out.println("driver error");
      System.out.println(e.getMessage());
    }
  }

  @Test
  public static void test() {
    try {
      // verify local tunnel
      driver.get("http://localhost:15000/api/v1.0/info");
      try {
        driver.findElement(By.xpath("//pre[contains(text(),'status\":\"SUCCESS')]"));
        status = "passed";
      } catch (Exception e) {
        e.printStackTrace();
      }
      AssertJUnit.assertEquals("tunnel is not started", status, "passed");
    } catch (Exception e) {
      e.printStackTrace();
    } catch (Error e) {
      e.printStackTrace();
    }

  }

  @AfterTest
  public static void afterTest() {
    System.out.println(status);
    ((JavascriptExecutor) driver).executeScript("lambda-status=" + status + "");
    driver.quit();
  }

}
