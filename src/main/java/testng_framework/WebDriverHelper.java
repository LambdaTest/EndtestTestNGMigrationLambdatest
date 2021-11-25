package testng_framework;

import endtest_transformer_bots.StepToCode;
import io.github.sukgu.Shadow;
import io.restassured.RestAssured;
import mongo_services.DTO.response.TestCaseStepsDTO;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebDriverHelper extends Base {
  private final org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(WebDriverHelper.class);
  StepToCode stepToCode = new StepToCode();

  public WebDriverHelper() {
    super();
  }

  public WebDriverHelper(RemoteWebDriver testDriver) {
    super();
    if (testDriver == null) {
      driver = EnvSetup.driver.get();
    } else {
      driver = testDriver;
    }
  }

  public void getURL(String url) {
    ltLogger.info("Open URL : ['{}'] ", url);
    try {
      driver.get(url);
    } catch (Exception e) {
      ltLogger.info("url {} is not loaded in given time.", url);
    }
  }

  public String getCurrentURL() {
    return driver.getCurrentUrl();
  }

  public String getTitle() {
    return driver.getTitle();
  }

  public void pageRefresh() {
    driver.navigate().refresh();
  }

  public WebElement getElement(String[] locator, int waitTime) {
    if (waitTime > 0) {
      waitForElement(locator, waitTime);
    }
    ltLogger.info("find element via,using ['{}','{}'] ", locator[0], locator[1]);
    String using = locator[0].toLowerCase();
    String locatorValue = locator[1];
    WebElement ele = null;
    if (using.contentEquals(ID)) {
      ele = driver.findElementById(locatorValue);
    } else if (using.contentEquals(CLASS)) {
      ele = driver.findElementByClassName(locatorValue);
    } else if (using.contentEquals(NAME)) {
      ele = driver.findElementByName(locatorValue);
    } else if (using.contentEquals(XPATH)) {
      ele = driver.findElementByXPath(locatorValue);
    } else if (using.contentEquals(CSS)) {
      ele = driver.findElementByCssSelector(locatorValue);
    } else if (using.contentEquals(TAG_NAME)) {
      ele = driver.findElementByTagName(locatorValue);
    } else if (using.contentEquals(LINK)) {
      ele = driver.findElementByLinkText(locatorValue);
    } else if (using.contentEquals(PARTIAL_LINK)) {
      ele = driver.findElementByPartialLinkText(locatorValue);
    } else if (using.contentEquals(TEXT_INSIDE))
      ele = driver.findElementByXPath("//*[ text() = ‘" + locatorValue + "’]");
    ltLogger.info("element '{}' found", ele);
    return ele;
  }

  public WebElement getElement(String[] locator) {
    return getElement(locator, 30);
  }

  public List<WebElement> getElements(String[] locator) {
    List<WebElement> ele = null;
    String using = locator[0].toLowerCase();
    String locatorValue = locator[1];
    if (using.contentEquals("id")) {
      ele = driver.findElementsById(locatorValue);
    } else if (using.contentEquals(CLASS)) {
      ele = driver.findElementsByClassName(locatorValue);
    } else if (using.contentEquals(NAME)) {
      ele = driver.findElementsByName(locatorValue);
    } else if (using.contentEquals(XPATH)) {
      ele = driver.findElementsByXPath(locatorValue);
    } else if (using.contentEquals(CSS)) {
      ele = driver.findElementsByCssSelector(locatorValue);
    }
    return ele;
  }

  public void typeText(String[] locator, String text) {
    WebElement ele = getElement(locator);
    ele.sendKeys(text);
  }

  public void typeText(WebElement ele, String text) {
    ele.sendKeys(text);
  }

  public void clickAndTypeText(String[] locator, String text) {
    WebElement ele = getElement(locator);
    ele.click();
    typeText(ele, text);
  }

  public void clearText(String[] locator) {
    WebElement ele = getElement(locator);
    clearText(ele);
    ltLogger.info("clear text '{}' successful", ele);
  }

  public void clearText(WebElement ele) {
    ele.clear();
  }

  public void clickOnElement(String[] locator) {
    WebElement ele = getElement(locator);
    clickOnElement(ele);
    ltLogger.info("click on element '{}' successful", ele);
  }

  public void clickOnElementIfPresent(String[] locator) {
    try {
      WebElement ele = getElement(locator);
      clickOnElement(ele);
      ltLogger.info("click on element '{}' successful", ele);
    } catch (Exception e) {
      ltLogger.info("element not click as it is not present");
    }
  }

  public void clickOnElement(WebElement ele) {
    ele.click();
  }

  public void scrollIntoElementView(String[] locator) {
    String methodName = new Object() {
    }.getClass().getEnclosingMethod().getName();
    ltLogger.info("scroll into provided element: by {} with locator {}", locator[0], locator[1]);
    try {
      javascriptExecution("arguments[0].scrollIntoView(true);", getElement(locator));
    } catch (Exception e) {
      ltLogger.error("Error: Element not found is: {} and the error came from method: {}", locator, methodName);
      e.printStackTrace();
    }
  }

  public void waitForElement(String[] locator, int timeout) {
    ltLogger.info("wait for element via, using ['{}','{}'] ", locator[0], locator[1]);
    WebDriverWait wait = new WebDriverWait(driver, timeout);
    String using = locator[0].toLowerCase();
    String locatorValue = locator[1];

    if (using.contentEquals("id")) {
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(locatorValue)));
    } else if (using.contentEquals("class")) {
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(locatorValue)));
    } else if (using.contentEquals("name")) {
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(locatorValue)));
    } else if (using.contentEquals("xpath")) {
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locatorValue)));
    } else if (using.contentEquals("css")) {
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(locatorValue)));
    }
  }

  public void waitForElementTillClickable(String[] locator, int timeout) {
    ltLogger.info("wait for element via, using ['{}','{}'] ", locator[0], locator[1]);
    WebDriverWait wait = new WebDriverWait(driver, timeout);
    String using = locator[0].toLowerCase();
    String locatorValue = locator[1];

    if (using.contentEquals(ID)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementById(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById(locatorValue)));
    } else if (using.contentEquals(CLASS)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByClassName(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByClassName(locatorValue)));
    } else if (using.contentEquals(NAME)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByName(locatorValue)));
    } else if (using.contentEquals(XPATH)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath(locatorValue)));
    } else if (using.contentEquals(CSS)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByCssSelector(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByCssSelector(locatorValue)));
    } else if (using.contentEquals(TEXT_INSIDE)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//*[ text() = ‘" + locatorValue + "’]")));
      wait.until(
        ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//*[ text() = ‘" + locatorValue + "’]")));
    } else if (using.contentEquals(LINK_TEXT)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByLinkText(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByLinkText(locatorValue)));
    } else if (using.contentEquals(PARTIAL_LINK)) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByPartialLinkText(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByPartialLinkText(locatorValue)));
    }
  }

  public long waitForElementToDisappear(String[] locator, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, timeout);
    String using = locator[0].toLowerCase();
    String locatorValue = locator[1];
    long start = 0;
    long stop = 0;
    if (using.contentEquals("id")) {
      start = System.currentTimeMillis();
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locatorValue)));
      stop = System.currentTimeMillis();
    } else if (using.contentEquals("class")) {
      start = System.currentTimeMillis();
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locatorValue)));
      stop = System.currentTimeMillis();
    } else if (using.contentEquals("name")) {
      start = System.currentTimeMillis();
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locatorValue)));
      stop = System.currentTimeMillis();
    } else if (using.contentEquals("xpath")) {
      start = System.currentTimeMillis();
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locatorValue)));
      stop = System.currentTimeMillis();
    } else if (using.contentEquals("css")) {
      start = System.currentTimeMillis();
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locatorValue)));
      stop = System.currentTimeMillis();
    }
    return (start - stop) / 1000;
  }

  public void waitForElement(String[] locator) {
    waitForElement(locator, 30);
  }

  public boolean isDisplayed(String[] locator) {
    String methodName = new Object() {
    }.getClass().getEnclosingMethod().getName();
    try {
      boolean elementFound = getElement(locator, 0).isDisplayed();
      ltLogger.info(
        "INFO: Locator successfully found displaying using locator {} method used " + "for operation is: {}", locator,
        methodName);
      return elementFound;
    } catch (Exception e) {
      ltLogger.error("ERROR: locator that is not visble: {} method that threw this error {}", locator, methodName);
      return false;
    }
  }

  public boolean isDisplayed(String[] locator, int waitTime) {
    try {
      return getElement(locator, waitTime).isDisplayed();
    } catch (Exception e) {
      return false;
    }
  }

  public boolean isDisplayed(WebElement ele) {
    return ele.isDisplayed();
  }

  public String getAttributeValue(WebElement ele, String attributeName) {
    ltLogger.info("get attribute value for webelement '{}' for attribute '{}' ", ele, attributeName);
    return ele.getAttribute(attributeName);
  }

  public String getAttributeValue(String[] locator, String attributeName) {
    WebElement ele = getElement(locator);
    return getAttributeValue(ele, attributeName);
  }

  public String getText(String[] locator) {
    WebElement ele = getElement(locator);
    return getText(ele);
  }

  public String getText(WebElement ele) {
    return ele.getText();
  }

  public void javascriptExecution(String script, RemoteWebDriver testDriver) {
    try {
      JavascriptExecutor js = testDriver;
      js.executeScript(script);
      ltLogger.info("INFO: script executed successfully: {}", script);
    } catch (Exception e) {
      ltLogger.error("ERROR: script executed failed: {}", script);
      throw e;
    }
  }

  public String executeJSFetchValue(String script, RemoteWebDriver testDriver) {
    JavascriptExecutor js = testDriver;
    return js.executeScript(script).toString();
  }

  public String getJavaScriptReturnValue(RemoteWebDriver remoteWebDriver, String javaScript) {
    return (String) remoteWebDriver.executeScript("return " + javaScript);
  }

  public String getJavaScriptReturnValue(String javaScript) {
    return (String) driver.executeScript("return " + javaScript);
  }

  public String executeJSFetchValue(String script) {
    JavascriptExecutor js = EnvSetup.driver.get();
    return js.executeScript(script).toString();
  }

  public void javascriptExecution(String script) {
    javascriptExecution(script, driver);
  }

  public void javascriptExecution(String script, WebElement element) {
    driver.executeScript(script, element);
  }

  public void openUrlAndWaitForElement(String url, String[] locator, Boolean eleVisibility, int retryCount,
    int waitTime) {
    // page load wait time is added in total wait time of this function.
    for (int i = 0; i < retryCount; i++) {
      getURL(url);
      ltLogger.info("INFO: element visibility should be '{}' and element displayed is '{}' ", eleVisibility,
        isDisplayed(locator));
      boolean eleVisible = isDisplayed(locator, waitTime);
      ltLogger.info("element visibility condition fulfilled as : '{}' ",
        (eleVisibility && eleVisible) || (!eleVisibility && !eleVisible));
      if ((eleVisibility && eleVisible) || (!eleVisibility && !eleVisible)) {
        break;
      }
    }
    Assert.assertTrue((eleVisibility && isDisplayed(locator)) || (!eleVisibility && !isDisplayed(locator)),
      "element visibility is not not equal to '" + eleVisibility + "'. ");
  }

  public void openUrlAndWaitForElement(String url, String[] locator, boolean eleVisibility) {
    int waitForElementTime = 10;
    int retryCount = 3;
    openUrlAndWaitForElement(url, locator, eleVisibility, retryCount, waitForElementTime);
  }

  public void jsClick(WebElement ele) {
    driver.executeScript("arguments[0].click()", ele);
  }

  public void sendKeyViaAction(String chars) {
    actions.sendKeys(chars);
  }

  public void pressKey(Keys givenKey) {
    actions.sendKeys(givenKey);
    actions.build().perform();
  }

  public void mouseHoverOnElement(String[] locator) {
    WebElement ele = getElement(locator);
    actions.moveToElement(ele).build().perform();
  }

  public void clickInsideCanvas(String[] locator, Integer x, Integer y) {
    WebElement ele = getElement(locator);
    actions.moveToElement(ele, x, y).click().build().perform();
  }

  public void sendKeysInsideCanvas(String[] locator, String text) {
    WebElement ele = getElement(locator);
    actions.moveToElement(ele).click().sendKeys(text).build().perform();
  }

  public void waitForTime(int timeout) {
    String methodName = new Object() {
    }.getClass().getEnclosingMethod().getName();
    try {
      TimeUnit.SECONDS.sleep(timeout);
      ltLogger.info("INFO: Wait for specified timout in method {} executed successfully", methodName);
    } catch (InterruptedException e) {
      ltLogger.error("ERROR: Error came while waiting for specified timeout in method: {}", methodName);
      e.printStackTrace();
    }
  }

  public void waitForTimeInMS(int timeout) {
    try {
      TimeUnit.MILLISECONDS.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public boolean isAttribtuePresent(String[] locator, String attribute) {
    WebElement element = getElement(locator);
    Boolean result = false;
    try {
      String value = element.getAttribute(attribute);
      if (value != null) {
        result = true;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return result;
  }

  public boolean isSelected(String[] locator) {
    try {
      return getElement(locator, 0).isSelected();
    } catch (Exception e) {
      return false;
    }
  }

  public boolean isImageBroken(WebElement image) {
    return image.getAttribute("naturalWidth").equals("0");
  }

  public int httpResponseCodeViaGet(String url) {
    return RestAssured.get(url).statusCode();
  }

  public void switchFrame(String frameId) {
    driver.switchTo().frame(frameId);
  }

  public void switchWindow(String windowId) {
    driver.switchTo().window(windowId);
  }

  public List<String> getWindows() {
    return new ArrayList<>(driver.getWindowHandles());
  }

  public Boolean isChildWindowDisplayed(String url) {
    List<String> tabs = getWindows();
    switchWindow(tabs.get(1));
    String currentUrl = driver.switchTo().window(tabs.get(1)).getCurrentUrl();
    System.out.println("Current url is: " + currentUrl);
    driver.close();
    switchWindow(tabs.get(0));
    return currentUrl.contains(url);
  }

  public void backToMainFrame() {
    driver.switchTo().defaultContent();
  }

  public WebElement getShadowElement(String locator) {
    Shadow shadow = new Shadow(driver);
    return shadow.findElement(locator);
  }

  public void switchToTabAndcloseTab(int tabToBeClosed, int tabToBeSwitchedAfterClosingTheTag) {
    try {
      ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
      driver.switchTo().window(tab.get(tabToBeClosed));
      driver.close();
      driver.switchTo().window(tab.get(tabToBeSwitchedAfterClosingTheTag));
      ltLogger.info("INFO: Tab is successfully closed and switched to other tab");
    } catch (Exception e) {
      ltLogger.error("ERROR: Tab is not successfully closed and switched");
    }
  }

  public void switchToTab(int fromTab, int toTab) {
    try {
      ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
      driver.switchTo().window(tab.get(fromTab));
      driver.switchTo().window(tab.get(toTab));
      ltLogger.info("INFO: Tab is successfully switched to other tab");
    } catch (Exception e) {
      ltLogger.error("ERROR: Tab is not successfully switched");
    }
  }

  public String getTextFromInputTag(String[] locator) {
    WebElement ele = getElement(locator);
    return ele.getAttribute("value");
  }

  public void doubleClickOnElement(String[] locator) {
    WebElement ele = getElement(locator);
    actions.doubleClick(ele).perform();
  }

  public void closeAlert() {
    driver.switchTo().alert().dismiss();
  }

  public void closeTab() {
    driver.close();
  }

  public void goBack() {
    driver.navigate().back();
  }

  public void goForward() {
    driver.navigate().forward();
  }

  public void switchToIFrame(String[] locator) {
    WebElement frameElement = getElement(locator);
    driver.switchTo().frame(frameElement);
  }

  public void openNewTab(String url) {
    driver.executeScript("window.open('" + url + "');");
  }

  public void refreshChildWindow() {
    List<String> tabs = getWindows();
    switchWindow(tabs.get(1));
    for (int j = 0; j < 5; j++) {
      waitForTime(60);
      pageRefresh();
    }
    waitForTime(3);
    switchWindow(tabs.get(0));
  }

  public void moveAndClickWithOffset(String[] locator, int x_Coordinate, int y_Coordinate) {
    WebElement ele = getElement(locator);
    actions.moveToElement(ele).moveByOffset(x_Coordinate, y_Coordinate).click().perform();
  }

  public void clearInput(String[] locator) {
    WebElement ele = getElement(locator);
    ele.click();
    ele.clear();
  }

  public void rightClick(String[] locator) {
    WebElement ele = getElement(locator);
    actions.contextClick(ele).perform();
  }

  public void moveAndDoubleClickWithOffset(String[] locator, int x_Coordinate, int y_Coordinate) {
    WebElement ele = getElement(locator);
    actions.moveToElement(ele).moveByOffset(x_Coordinate, y_Coordinate).doubleClick().perform();
  }

  public boolean isElementClickable(String[] locator) {
    try {
      WebElement ele = getElement(locator);
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.elementToBeClickable(ele));
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public void switchToNextWindow() {
    Set<String> allWindows = driver.getWindowHandles();
    String currentWindowID = driver.getWindowHandle();
    Iterator<String> itr = allWindows.iterator();
    boolean currWindowFound = false;
    while (itr.hasNext()) {
      String itrWindowID = itr.next();
      if (itrWindowID.equals(currentWindowID)) {
        currWindowFound = true;
      }
      if (currWindowFound) {
        driver.switchTo().window(itrWindowID);
      }
    }
  }

  public void switchToPreviousTab() {
    Set<String> st = driver.getWindowHandles();
    Iterator<String> it = st.iterator();
    driver.switchTo().window(it.next());
  }

  public void selectOption(String[] locator, String valueToSelect) {
    WebElement ele = getElement(locator);
    Select select = new Select(ele);
    select.selectByValue(valueToSelect);
  }

  public boolean isElementAvailable(String[] locator) {
    boolean isAvailable = false;
    try {
      getElement(locator);
      isAvailable = true;
    } catch (Exception e) {
      isAvailable = false;
    }
    return isAvailable;
  }
  //
  //  public void assertion(String assertionType, String[] locator, String value, String variableAssertionType)
  //    throws IOException {
  //    SoftAssert softAssert = EnvSetup.SOFT_ASSERT.get();
  //    switch (assertionType) {
  //    case "CheckClickableElement":
  //      softAssert.assertTrue(isElementClickable(locator));
  //      break;
  //    case "CheckClickableNotElement":
  //      softAssert.assertFalse(isElementClickable(locator));
  //      break;
  //    case "CheckElement":
  //    case "CheckVisibleElement":
  //      softAssert.assertTrue(isElementDisplayed(locator));
  //      break;
  //    case "CheckNotElement":
  //    case "CheckVisibleNotElement":
  //      softAssert.assertFalse(isElementDisplayed(locator));
  //      break;
  //    case "CheckContainsValue":
  //      softAssert.assertTrue(checkContainsValue(locator, value), "Value not present");
  //      break;
  //    case "CheckNotContainsValue":
  //      softAssert.assertFalse(checkContainsValue(locator, value), "Value is present");
  //      break;
  //    case "CheckUrlContains":
  //      softAssert.assertFalse(checkUrlContains(locator, value), "URL is present");
  //      break;
  //    case "CountChildElements":
  //      softAssert.assertEquals(getChildElements(locator).size(), value, "Count of child elements are not matched");
  //      break;
  //    case "CheckElementScreenshot":
  //      takeScreenshootOfParticularElement(locator, RESOURCES_DIRECTORY + "files/actual_Image.png");
  //      compareImage(new File(RESOURCES_DIRECTORY + "files/expected_Image.png"),
  //        new File(RESOURCES_DIRECTORY + "files/actual_Image.png"));
  //      break;
  //    case "CheckPageScreenshot":
  //      takeScreenshoot(RESOURCES_DIRECTORY + "files/actual_Image.png");
  //      compareImage(new File(RESOURCES_DIRECTORY + "files/expected_Image.png"),
  //        new File(RESOURCES_DIRECTORY + "files/actual_Image.png"));
  //      break;
  //    case "VariableAssertion":
  //      softAssert.assertEquals(value,"");
  //    default:
  ////      ltLogger.info("testCaseStepsDTO not available step not created for case" + assertionType);
  //      System.out.println("testCaseStepsDTO not available step not created for case" + assertionType);
  //    }
  //    EnvSetup.SOFT_ASSERT.set(softAssert);
  //  }

  public boolean isElementDisplayed(String[] locator) {
    ltLogger.info("wait for element via, using ['{}','{}'] ", locator[0], locator[1]);
    return getElement(locator).isDisplayed();
  }

  public boolean checkContainsValue(String[] locator, String value) {
    ltLogger.info("wait for element via, using ['{}','{}'] ", locator[0], locator[1]);
    return getElement(locator).getText().contains(value);
  }

  public boolean checkUrlContains(String[] locator, String value) {
    ltLogger.info("wait for element via, using ['{}','{}'] ", locator[0], locator[1]);
    return getElement(locator).getAttribute(HREF).contains(value);
  }

  public List<WebElement> getChildElements(String[] locator) {
    return getElement(locator).findElements(By.xpath("./child::*"));
  }

  public void compareImage(File expected, File actual) throws IOException {
    SoftAssert softAssert = EnvSetup.SOFT_ASSERT.get();
    waitForTime(5);
    BufferedImage expectedFile = ImageIO.read(expected);
    BufferedImage actualFile = ImageIO.read(actual);
    try {
      for (int i = 10; i < expectedFile.getWidth() - 1; i++) {
        for (int j = 10; j < expectedFile.getHeight() - 1; j++) {
          Color c1 = new Color(expectedFile.getRGB(i, j));
          Color c2 = new Color(actualFile.getRGB(i, j));
          softAssert.assertEquals(c2.getRed(), c1.getRed(), "Red value of RGB is not 0");
          softAssert.assertEquals(c2.getGreen(), c1.getGreen(), "Green value of RGB is not 0");
          softAssert.assertEquals(c2.getBlue(), c1.getBlue(), "Blue value of RGB is not 0");
        }
      }
    } catch (Exception ignored) {
      ltLogger.info(ignored);
    }
    EnvSetup.SOFT_ASSERT.set(softAssert);
  }

  public boolean checkVariableAssertion(String variableAssertionType, String value, String variable) {
    switch (variableAssertionType) {
    case "variableMatchesValue":
      return variable.equalsIgnoreCase(value);
    case "variableContainsValue":
      return variable.contains(value);
    case "variableGreaterThanValue":
      return Integer.parseInt(variable) > Integer.parseInt(value);
    case "variableGreaterThanOrEqualsValue":
      return Integer.parseInt(variable) >= Integer.parseInt(value);
    case "variableLessThanValue":
      return Integer.parseInt(variable) < Integer.parseInt(value);
    case "variableEmpty":
      return (variable == null);
    default:
      System.out.println("Variable assertion is not valid : " + variableAssertionType);
    }
    return false;
  }

  //pathToFile should contain path + FileName.png
  public void takeScreenshoot(String pathToFile) {
    try {
      TakesScreenshot scrShot = ((TakesScreenshot) driver);
      File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
      //Move image file to new destination
      ltLogger.info("Screenshoot taken");
      File destinationFile = new File(pathToFile);
      //Copy file at destination
      FileUtils.copyFile(srcFile, destinationFile);
    } catch (Exception e) {
      ltLogger.error("Not able to capture and transfer file");
    }
  }

  //pathToFile should contain path + FileName.png
  public void takeScreenshootOfParticularElement(String[] locator, String pathToFile) {
    WebElement webElement = getElement(locator);
    try {
      File destinationFile = new File(pathToFile);
      File f = webElement.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(f, new File("screenshots.png"));
    } catch (Exception e) {
      ltLogger.error("Not able to capture and transfer file for Element");
    }
  }

  public int getTextLength(String str) {
    return str.length();
  }

  public void pressKey(String[] locator, String key) {
    switch (key) {
    case "ENTER":
      getElement(locator).sendKeys(Keys.ENTER);
      break;
    case "BACK_SPACE":
      getElement(locator).sendKeys(Keys.BACK_SPACE);
      break;
    default:
      System.out.println("The key provided is not available: " + key);
    }
  }

  public void printResults(String item, String message) {
    switch (item) {
    case "Note":
    case "Variable":
      javascriptExecution("console.error('" + message + " via error command" + "')", driver);
      System.out.println(message);
    }
  }
}
