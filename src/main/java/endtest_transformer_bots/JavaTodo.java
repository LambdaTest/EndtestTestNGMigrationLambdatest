package endtest_transformer_bots;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaTodo {
  String username = "vikashsingh";
  String accesskey = "sdQgXLlBNm9cF446YyqyxO4GraQ4F4oqkvcGUU8nQ0NJQPwHY7";
  static RemoteWebDriver driver = null;
  String gridURL = "@hub.lambdatest.com/wd/hub";
  boolean status = false;

  public static void main(String[] args) {
    new JavaTodo().test();
  }

  public void test() {        // To Setup driver
    setUp();
    try {

      driver.get("https://www.lambdatest.com/test-on-chrome-browsers");
      //Let's mark done first two items in the list.
      //takeScreenshoot("screenshoot.png");
      takeScreenshootOfParticularElement(new String[] { "css", "a[title=\"Try It For Free\"]" },"screenshots.png");
      }
     catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      tearDown();
    }
  }
  public void takeScreenshoot(String pathToFile) {
    try {
      TakesScreenshot scrShot = ((TakesScreenshot) driver);
      File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
      //Move image file to new destination
      System.out.println("Screenshoot taken");
      File destinationFile = new File(pathToFile);
      //Copy file at destination
      FileUtils.copyFile(srcFile, destinationFile);
    } catch (Exception e) {
      System.out.println("Not able to capture and transfer file");
    }
  }

  private void setUp() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "chrome");
    capabilities.setCapability("version", "70.0");
    capabilities.setCapability("platform", "win10");
    // If this cap isn't specified, it will just get any available one.
    capabilities.setCapability("build", "LambdaTestSampleApp");
    capabilities.setCapability("name", "LambdaTestJavaSample");
    try {
      driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
    } catch (MalformedURLException e) {
      System.out.println("Invalid grid URL");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private void tearDown() {
    if (driver != null) {
      ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
      driver.quit(); //really important statement for preventing your test execution from a timeout.
    }
  }


  public void takeScreenshootOfParticularElement(String[] locator, String pathToFile) {
    WebElement webElement = getElement(locator);
    try {
      File destinationFile = new File(pathToFile);
      File f = webElement.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(f, new File(pathToFile));
    } catch (Exception e) {
      //ltLogger.error("Not able to capture and transfer file for Element");
    }
  }


  public WebElement getElement(String[] locator, int waitTime) {
    if (waitTime > 0) {
      //waitForElement(locator, waitTime);
    }
    //ltLogger.info("find element via,using ['{}','{}'] ", locator[0], locator[1]);
    String using = locator[0].toLowerCase();
    String locatorValue = locator[1];
    WebElement ele = null;
    if (using.contentEquals("id")) {
      ele = driver.findElementById(locatorValue);
    } else if (using.contentEquals("class")) {
      ele = driver.findElementByClassName(locatorValue);
    } else if (using.contentEquals("name")) {
      ele = driver.findElementByName(locatorValue);
    } else if (using.contentEquals("xpath")) {
      ele = driver.findElementByXPath(locatorValue);
    } else if (using.contentEquals("css")) {
      ele = driver.findElementByCssSelector(locatorValue);
    } else if (using.contentEquals("tagname")) {
      ele = driver.findElementByTagName(locatorValue);
    } else if (using.contentEquals("link")) {
      ele = driver.findElementByLinkText(locatorValue);
    } else if (using.contentEquals("partial_link")) {
      ele = driver.findElementByPartialLinkText(locatorValue);
    }
    //ltLogger.info("element '{}' found", ele);
    return ele;
  }

  public WebElement getElement(String[] locator) {
    return getElement(locator, 30);
  }

}