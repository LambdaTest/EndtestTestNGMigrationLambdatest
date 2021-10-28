package testng_framework;

import io.github.sukgu.Shadow;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverHelper extends Base {
  private final org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(WebDriverHelper.class);

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
    if (using.contentEquals("id")) {
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
    }
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

  public void cleartext(String[] locator) {
    WebElement ele = getElement(locator);
    cleartext(ele);
    ltLogger.info("clear text '{}' successful", ele);
  }

  public void cleartext(WebElement ele) {
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

    if (using.contentEquals("id")) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementById(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById(locatorValue)));
    } else if (using.contentEquals("class")) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByClassName(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByClassName(locatorValue)));
    } else if (using.contentEquals("name")) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByName(locatorValue)));
    } else if (using.contentEquals("xpath")) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath(locatorValue)));
    } else if (using.contentEquals("css")) {
      wait.until(ExpectedConditions.visibilityOf(driver.findElementByCssSelector(locatorValue)));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByCssSelector(locatorValue)));
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

}