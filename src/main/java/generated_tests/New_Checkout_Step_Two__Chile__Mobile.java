package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class New_Checkout_Step_Two__Chile__Mobile extends WebDriverHelper {

  @Test
  public void Verify_behavior_in_Billing_Address_for_TJ_Debit_CL_TSevenTwoEightzero() {
    javascriptExecution("lambda-name=Verify behavior in Billing Address for TJ Debit CL TSevenTwoEightzero");

    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to  Ecom URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl");
    // Handle \"Boost the business\" Pop up
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // if home page present
    if (isElementAvailable(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" })) {
      // Add product from esika and proceed to checkout
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
      // wait until login
      waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
      // click on login
      javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
      // wait
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
      // Write text in username
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // click On close Popup
      // start if for popup
      if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
        // click on close button
        clickOnElement(new String[] { CSS, "button#cboxClose > span" });
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Cbox Popup was not found \"");
        // end else statement
      }
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait for add to cart button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // wait until cart
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on Close Popup
      // start if for popup
      if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
        // click on close button
        clickOnElement(new String[] { CSS, "button#cboxClose > span" });
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Cbox Popup was not found \"");
        // end else statement
      }
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // click on second saved address
      javascriptExecution(
        "document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
      // wait until continue button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
      // Validate Shipping address  Text
      Assert.assertTrue(getText(
        new String[] { XPATH, "//div[@class=\'address-selector delivery-address-selector\']/child::div[1]" }).contains(
        "Dirección de envío"));
      // Validate Shipping Address
      takeScreenshotOfParticularElement(
        new String[] { XPATH, "//div[@class=\'address-selector delivery-address-selector\']" },
        "logs/Screenshots/vEOpQT.png");
      // Add New Address Link is Visible
      if (isDisplayed(new String[] { XPATH, "//a[@id=\'checkout-add-new-address\']" }, 0)) {
        // Click on Add New Address Link
        clickOnElement(new String[] { XPATH, "//a[@id=\'checkout-add-new-address\']" });
        // Continue Button is Visible
        if (isDisplayed(new String[] { ID, "addressSubmit" }, 0)) {
          // Validate Continue Button is Clickable
          Assert.assertFalse(isElementClickable(new String[] { ID, "addressSubmit" }));
          // End of if Loop
        }
        // Explicit wait Saved Address
        waitUntil("CheckElement",
          new String[] { XPATH, "//a[@class='checkout-view-saved-addresses js-checkout-view-saved-addresses']" }, "10",
          "disabled");
        // Click on Saved Address
        javascriptExecution(
          "document.querySelector(\"a[class=\'checkout-view-saved-addresses js-checkout-view-saved-addresses\']\").click();");
        // End of If Loop
      }
      // if debit card present
      if (isElementAvailable(
        new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" })) {
        // Validate for debit card
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" }));
        // Write Text in RUT TextField
        typeText(new String[] { XPATH, "//input[@id=\'documentId\']" }, "712345667");
        // Validate Shipping Address
        takeScreenshotOfParticularElement(
          new String[] { XPATH, "(//div[@class=\'multiSteps-widget shipping-address\'])[2]" },
          "logs/Screenshots/uAWxME.png");
        // Validate Shipping address  Text
        Assert.assertTrue(
          getText(new String[] { XPATH, "(//span[@class=\'title shipping-address-title\'])[2]" }).contains(
            "Dirección de envío"));
        // Validate Pay Button is Clickable
        Assert.assertFalse(
          isElementClickable(new String[] { XPATH, "//button[contains(@class,\'btn btn-block submit_mpagoW\')]" }));
        // End of If Loop
      }
      // End IF
    }
    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to Mto URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
    // if home page present
    if (isElementAvailable(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" })) {
      // Add product from esika and proceed to checkout
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
      // wait until login
      waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
      // click on login
      javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
      // wait
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
      // Write text in username
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // click On close Popup
      // start if for popup
      if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
        // click on close button
        clickOnElement(new String[] { CSS, "button#cboxClose > span" });
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Cbox Popup was not found \"");
        // end else statement
      }
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait for add to cart button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // wait until cart
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on Close Popup
      // start if for popup
      if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
        // click on close button
        clickOnElement(new String[] { CSS, "button#cboxClose > span" });
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Cbox Popup was not found \"");
        // end else statement
      }
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // click on second saved address
      javascriptExecution(
        "document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
      // wait until continue button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
      // Validate Shipping address  Text
      Assert.assertTrue(getText(
        new String[] { XPATH, "//div[@class=\'address-selector delivery-address-selector\']/child::div[1]" }).contains(
        "Dirección de envío"));
      // Validate Shipping Address
      takeScreenshotOfParticularElement(
        new String[] { XPATH, "//div[@class=\'address-selector delivery-address-selector\']" },
        "logs/Screenshots/XXgkFk.png");
      // Add New Address Link is Visible
      if (isDisplayed(new String[] { XPATH, "//a[@id=\'checkout-add-new-address\']" }, 0)) {
        // Click on Add New Address Link
        clickOnElement(new String[] { XPATH, "//a[@id=\'checkout-add-new-address\']" });
        // Continue Button is Present
        if (isElementAvailable(new String[] { ID, "addressSubmit" })) {
          // Validate Continue Button is Clickable
          Assert.assertFalse(isElementClickable(new String[] { ID, "addressSubmit" }));
          // End of If Loop
        }
        // Explicit wait  Saved Address
        waitUntil("CheckElement",
          new String[] { XPATH, "//a[@class='checkout-view-saved-addresses js-checkout-view-saved-addresses']" }, "10",
          "disabled");
        // Click on Saved Address
        javascriptExecution(
          "document.querySelector(\"a[class=\'checkout-view-saved-addresses js-checkout-view-saved-addresses\']\").click();");
        // End of If Loop
      }
      // if debit card present
      if (isElementAvailable(
        new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" })) {
        // Validate Debit Card present
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" }));
        // Write Text in RUT TextField
        typeText(new String[] { XPATH, "//input[@id=\'documentId\']" }, "712345667");
        // Validate Shipping Address
        takeScreenshotOfParticularElement(
          new String[] { XPATH, "(//div[@class=\'multiSteps-widget shipping-address\'])[2]" },
          "logs/Screenshots/AldRgD.png");
        // Validate Shipping address  Text
        Assert.assertTrue(
          getText(new String[] { XPATH, "(//span[@class=\'title shipping-address-title\'])[2]" }).contains(
            "Dirección de envío"));
        // Validate Pay Button is Clickable
        Assert.assertFalse(
          isElementClickable(new String[] { XPATH, "//button[contains(@class,\'btn btn-block submit_mpagoW\')]" }));
        // End of If Loop
      }
      // ENd if
    }

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Pending_Payment_in_new_checkoutTSevenTwoSevenFive() {
    javascriptExecution("lambda-name=Verify criteria in Pending Payment in new checkoutTSevenTwoSevenFive");

    // Clear cache cookies
    // Clear cookies
   // deleteAllCookies();
    // Clear storage
   // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    //javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    //wait
    waitForTime(10);
    // new  user login and add a product to cart and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Click on Credit Card Section
    clickOnElement(new String[] { CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
    // start if statement for  add new card
    if (isElementAvailable(new String[] { CSS, "a#add-new-card" })) {
      // click on add new card
      clickOnElement(new String[] { CSS, "a#add-new-card" });
      // end if statement
    }
    // Wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "input#cardholderName" }, "10", "disabled");
    // write text in card name
    typeText(new String[] { CSS, "input#cardholderName" }, "CONT");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumber" }, "5160033004714834");
    // select option from month drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // select option from year drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "input#securityCode" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait until submit button clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // add aseertion for pending payment
      Assert.assertTrue(getText(new String[] { XPATH, "//span[@id=\"order-status\"]" }).contains("EN PROCESO"));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else statement
    }
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // login asfirst user and procced upto checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // Click On Address Submit Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait
    waitUntil("CheckElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10",
      "disabled");
    // click on Credit Card Section
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // start if statement for add new card
    if (isElementAvailable(new String[] { CSS, "a#add-new-card" })) {
      // wait until add new card
      waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
      // click on add new card
      javascriptExecution("document.querySelector(\"a#add-new-card\").click();");
      // end if statement
    }
    // wait until credit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "input#cardholderName" }, "20", "disabled");
    // write text in card name
    typeText(new String[] { CSS, "input#cardholderName" }, "CONT");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumber" }, "5160 0330 0471 4834");
    // select option from month drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // select option from year drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "input#securityCode" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait until submit button
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoForm checkout-next']" }, "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
    // start if statement for sucess message
    if (isDisplayed(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }, 0)) {
      // add aseertion for pending message
      Assert.assertTrue(getText(new String[] { XPATH, "//span[@id=\"order-status\"]" }).contains("EN PROCESO"));
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Verify_behavior_in_Billing_Address_for_TJ_CreditTSevenTwoSevenEight() {
    javascriptExecution("lambda-name=Verify behavior in Billing Address for TJ CreditTSevenTwoSevenEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Handle popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Add product to cart
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // Click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait untill cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // enter guest first name
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // enter guest last name
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // enter guest user mail id
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // Fill address details
    // if region field present
    if (isDisplayed(new String[] { ID, "address.regionIsoParent2" }, 0)) {
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "456789842");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // end if
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"region field is not present\"");
      // end else statement
    }
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));
    // Click on Other direction address
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCL > label\").click();");
    // Assertion on region dropdown
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.regionIsoParent2" }));
    // Assertion on region 2 dropdown
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.regionIsoParent1" }));
    // Assertion on region 3 dropdown
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.regionIso" }));
    // Assertion on street address
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.line1" }));
    // Assertion on apartment number address
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.line2" }));
    // Assertion on reference address
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.referencia" }));
    // Assertion on telephone number
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.phone" }));
    // Click on same shipping address
    javascriptExecution(
      "document.querySelector(\"form#mpago_credit div.address-selector.billing-address-selector > div:nth-child(1) > label\").click();");
    // Assertion on same shipping address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"address\"])[1]" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to Mto URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=BeautyEsika");
    // Add product to cart
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // Click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait untill cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // enter guest first name
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // enter guest last name
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // enter guest user mail id
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // Fill address details
    // if region field present
    if (isDisplayed(new String[] { ID, "address.regionIsoParent2" }, 0)) {
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "456789842");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // end if
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"region field is not present\"");
      // end else statement
    }
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));
    // Click on Other direction address
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCL > label\").click();");
    // Assertion on region dropdown
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.regionIsoParent2" }));
    // Assertion on region 2 dropdown
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.regionIsoParent1" }));
    // Assertion on region 3 dropdown
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.regionIso" }));
    // Assertion on street address
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.line1" }));
    // Assertion on apartment number address
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.line2" }));
    // Assertion on reference address
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.referencia" }));
    // Assertion on telephone number
    Assert.assertTrue(isElementAvailable(new String[] { ID, "address.phone" }));
    // Click on same shipping address
    javascriptExecution(
      "document.querySelector(\"form#mpago_credit div.address-selector.billing-address-selector > div:nth-child(1) > label\").click();");
    // Assertion on same shipping address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"address\"])[1]" }));

    status = "passed";
  }

  @Test
  public void Check_criteria_of_selected_TJTSevenTwoSevenTwo() {
    javascriptExecution("lambda-name=Check criteria of selected TJTSevenTwoSevenTwo");

    // Clear cache cookies
    // Clear cookies
    //deleteAllCookies();
    // Clear storage
    //javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    //javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    //wait
    waitForTime(10);
    // handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // new  user login and add a product to cart and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "input#documentId" }, "10", "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit_w2w.radiompago_debit_w2wCL" },
      "logs/Screenshots/WpfkYD.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCL > label\").click();");
    // wait untill To divide the payment into installments, you must coordinate it directly with your bank  present
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }, "10",
      "disabled");
    // start if statement for message
    if (isElementAvailable(
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" })) {
      // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }));
      // end if
    }
    // start if statement for saved cards
    if (isElementAvailable(new String[] { XPATH, "(//form[@id=\'mpago_card_saved\']/div)[1]" })) {
      // wait until page loads saved cards
      waitUntil("CheckVisibleElement", new String[] { XPATH, "(//form[@id='mpago_card_saved']/div)[1]" }, "10",
        "disabled");
      // take a snip to verify The order of the cards
      takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
        "logs/Screenshots/IjEhdR.png");
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"saved cards are not present\"");
      // end else statement
    }
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To consultant URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // login asfirst user and procced upto checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "input#documentId" }, "10", "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit_w2w.radiompago_debit_w2wCL" },
      "logs/Screenshots/hNMTMn.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCL > label\").click();");
    // wait untill To divide the payment into installments, you must coordinate it directly with your bank  present
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }, "10",
      "disabled");
    // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }));
    // start if statement for saved cards
    if (isElementAvailable(new String[] { XPATH, "(//form[@id=\'mpago_card_saved\']/div)[1]" })) {
      // wait until page loads saved cards
      waitUntil("CheckVisibleElement",
        new String[] { XPATH, "form#mpago_card_saved div.payment-installments-outer > div" }, "10", "disabled");
      // take a snip to verify The order of the cards
      takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
        "logs/Screenshots/OrzijI.png");
      // end is statement
    }
    // start else statemt
    else {
      // print in result
      printResults("PrintNote", "\"saved cards not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Check_Billing_Address_layout_for_TJ_CreditTSevenTwoSevenSeven() {
    javascriptExecution("lambda-name=Check Billing Address layout for TJ CreditTSevenTwoSevenSeven");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Handle popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Add product to cart
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // Click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait untill cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // enter guest first name
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // enter guest last name
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // enter guest user mail id
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // refresh
    pageRefresh();
    // Fill address details
    // if region field present
    if (isDisplayed(new String[] { ID, "address.regionIsoParent2" }, 0)) {
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "456789842");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // end if
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"region field is not present\"");
      // end else statement
    }
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to Mto URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=BeautyEsika");
    // Add product to cart
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // Click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait untill cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // enter guest first name
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // enter guest last name
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // enter guest user mail id
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // Fill address details
    // if region field present
    if (isDisplayed(new String[] { ID, "address.regionIsoParent2" }, 0)) {
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "456789842");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // end if
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"region field is not present\"");
      // end else statement
    }
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Payment_Approved_in_new_checkoutTSevenTwoSevenThree() {
    javascriptExecution("lambda-name=Verify criteria in Payment Approved in new checkoutTSevenTwoSevenThree");

    // clear cache and cookies
    // Clear cookies
  //  deleteAllCookies();
    // Clear storage
   // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
   // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    //wait
    waitForTime(10);
    // Handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // add product and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait for credit card
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//label[@for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10", "disabled");
    // Click on credit card
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // wait for add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"a#add-new-card\").click();");
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//input[@id='cardholderName']" }, "10", "disabled");
    // write  text in name of owner
    typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
    // Wrire text in card number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4009175332806176");
    // select option from  expiry month
    selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
    // select option from  expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[1]" }, "2025");
    // Wrire text in CVV
    typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
    // click on \"I accept terms and conditions\"
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // Wait
    waitUntil("CheckClickableElement",
      new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']" }, "10",
      "disabled");
    // click on  pay button
    clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
    // Start If Statement
    if (checkCurrentUrlContains("orderConfirmation")) {
      // Validate \"Order confirmation\"
      Assert.assertTrue(checkCurrentUrlContains("orderConfirmation"));
      // mail validation
      // Open New Tab
      openNewTab("OpenNewTab");
      pageRefresh();
      // Go To URL
      getURL("https://www.mailinator.com/");
      // Write Text In search bar text field
      typeText(new String[] { CSS, "input#search-mobile" }, "belcorp_test_user_86292523@testuser.com");
      // Press Enter Key
      clickOnElement(new String[] { CSS, "header#site-mobile-header svg" });
      // wait until order email
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[contains(text(),'just now')]" }, "60", "ten");
      // start if statement for mail
      if (isDisplayed(new String[] { XPATH, "//div[contains(text(),\'just now\')]" }, 0)) {
        // click on first email
        javascriptExecution(
          "document.querySelector(\"div#main_inbox_area div:nth-child(1) > div > div.block-subject.w-100 > a\").click();");
        // take a screen shot for mail validation
        takeScreenshot("logs/Screenshoots/Slzvgi.png");
        // end if statement
      }
      // start else statemnet
      else {
        // print in result
        printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
        // end else statement
      }
      // switch back to initial tab
      switchToPreviousTab();
      // End  If Statement
    }
    // strt else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To Consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    //wait
    waitForTime(10);
    // Add product and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    //wait
    waitForTime(10);
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait for credit card
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//label[@for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10", "disabled");
    // Click on credit card
    clickOnElement(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
    // wait until add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"a#add-new-card\").click();");
    // write  text in name of owner
    typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
    // Wrire text in card number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4009175332806176");
    // select option from  expiry month
    selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
    // select option from  expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[1]" }, "2025");
    // Wrire text in CVV
    typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
    // click on \"I accept terms and conditions\"
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait for pay button
    waitUntil("CheckClickableElement",
      new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']" }, "10",
      "disabled");
    // click on  pay button
    clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
    // Start If Statement
    if (checkCurrentUrlContains("orderConfirmation")) {
      // Validate \"Order confirmation\"
      Assert.assertTrue(checkCurrentUrlContains("orderConfirmation"));
      // mail validation
      // Open New Tab
      openNewTab("OpenNewTab");
      pageRefresh();
      // Go To URL
      getURL("https://www.mailinator.com/");
      // Write Text In search bar text field
      typeText(new String[] { CSS, "input#search-mobile" }, "belcorp_test_user_86292523@testuser.com");
      // Press Enter Key
      clickOnElement(new String[] { CSS, "header#site-mobile-header svg" });
      // wait until order email
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[contains(text(),'just now')]" }, "60", "ten");
      // start if statement for mail
      if (isDisplayed(new String[] { XPATH, "//div[contains(text(),\'just now\')]" }, 0)) {
        // click on first email
        javascriptExecution(
          "document.querySelector(\"div#main_inbox_area div:nth-child(1) > div > div.block-subject.w-100 > a\").click();");
        // take a screen shot for mail validation
        takeScreenshot("logs/Screenshoots/XaLflP.png");
        // end if statement
      }
      // start else statemnet
      else {
        // print in result
        printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
        // end else statement
      }
      // switch back to initial tab
      switchToPreviousTab();
      // End if statement
    }
    // strt else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Verify_behavior_of_old_CheckoutTSevenTwoSevenSix() {
    javascriptExecution("lambda-name=Verify behavior of old CheckoutTSevenTwoSevenSix");

    // Clear cache cookies
    // Clear cookies
   // deleteAllCookies();
    // Clear storage
   // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    //javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    //wait
    waitForTime(10);
    // Add a product to cart and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    //wait
    waitForTime(10);
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Add assertion For Credit Card Section
    Assert.assertTrue(
      isElementFound(new String[] { CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" }));
    // Add assertion For  Debit Card Section
    Assert.assertTrue(
      isElementFound(new String[] { CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_debit_w2w\']" }));
    // Click on Credit Card Section
    clickOnElement(new String[] { CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
    // Wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
    // start if statement
    if (isElementAvailable(new String[] { CSS, "a#add-new-card" })) {
      // click on add new card
      clickOnElement(new String[] { CSS, "a#add-new-card" });
      // end if statement
    }
    // strt else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // write text in card name
    typeText(new String[] { CSS, "input#cardholderName" }, "APRO");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumber" }, "5160033004714834");
    // select option from month drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // select option from year drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "input#securityCode" }, "123");
    // write text in doc number
    typeText(new String[] { CSS, "input#docNumber" }, "712345667");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait until submit button clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
    // start if statement for sucess message
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // add aseertion for pending payment
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else statement
    }
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // login asfirst user and procced upto checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Add Assertion For Debit Card section
    Assert.assertTrue(
      isElementFound(new String[] { CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_debit_w2w\']" }));
    // Add Assertion For Credit card Section
    Assert.assertTrue(
      isElementFound(new String[] { CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" }));
    // Add assertion For100 percent Secure Payment Section
    Assert.assertTrue(isElementFound(new String[] { CSS, "div.securePay-container.hidden-securePay > div > span" }));
    // Click on Credit Card Section
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
    // start if statement for add new card
    if (isElementAvailable(new String[] { CSS, "a#add-new-card" })) {
      // wait until add new card
      waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
      // click on add new card
      javascriptExecution("document.querySelector(\"a#add-new-card\").click();");
      // end if statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // write text in card name
    typeText(new String[] { CSS, "input#cardholderName" }, "APRO");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumber" }, "5160 0330 0471 4834");
    // select option from month drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // select option from year drop down
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "input#securityCode" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait until submit button
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoForm checkout-next']" }, "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
    // start if statement for sucess message
    if (isDisplayed(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }, 0)) {
      // add aseertion for success message
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }));
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Payment_Rejected__in_new_checkoutTSevenTwoSevenFour() {
    javascriptExecution("lambda-name=Verify criteria in Payment Rejected  in new checkoutTSevenTwoSevenFour");

    // clear cache and cookies
    // Clear cookies
    //deleteAllCookies();
    // Clear storage
    //javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    //javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    waitForTime(10);
    // Handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // add product and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    //wait
    waitForTime(5);
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//label[@for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10", "disabled");
    // Click on credit card
    clickOnElement(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
    // wait for credit card
    waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"a#add-new-card\").click();");
    // write  text in name of owner
    typeText(new String[] { CSS, "input#cardholderName" }, "CALL");
    // Wrire text in card number
    typeText(new String[] { CSS, "input#cardNumber" }, "4168818844447115");
    // select option from  expiry month
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // select option from  expiry year
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // Wrire text in CVV
    typeText(new String[] { CSS, "input#securityCode" }, "123");
    // click on \"I accept terms and conditions\"
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait for pay btn
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on  pay button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='cboxClose']" }, "10", "disabled");
    // start if
    if (isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" })) {
      // Validate  error messeage
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" }));
      // end if
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=BeautyEsika");
    // Add product and procced to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait for credit card
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//label[@for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10", "disabled");
    // Click on credit card
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // wait for add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "a#add-new-card" }, "10", "disabled");
    // Click on add new card
    javascriptExecution("document.querySelector(\"a#add-new-card\").click();");
    // wait for name
    waitUntil("CheckClickableElement", new String[] { CSS, "input#cardholderName" }, "10", "disabled");
    // write  text in name of owner
    typeText(new String[] { CSS, "input#cardholderName" }, "CALL");
    // Wrire text in card number
    typeText(new String[] { CSS, "input#cardNumber" }, "4168818844447115");
    // select option from  expiry month
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // select option from  expiry year
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // Wrire text in CVV
    typeText(new String[] { CSS, "input#securityCode" }, "123");
    // click on \"I accept terms and conditions\"
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait untill pay
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoForm checkout-next']" }, "10", "disabled");
    // click on  pay button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='cboxClose']" }, "10", "disabled");
    // start if
    if (isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" })) {
      // Validate  error messeage
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" }));
      // end if
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Verify_layout_Billing_Address_for_TJ_DebitTSevenTwoSevenNine() {
    javascriptExecution("lambda-name=Verify layout Billing Address for TJ DebitTSevenTwoSevenNine");

    // Clear cache and cookies
    // Clear cookies
   // deleteAllCookies();
    // Clear storage
    //javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    //javascriptExecution("window.sessionStorage.clear();");
    // Go to  Ecom URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl");
    // Handle \"Boost the business\" Pop up
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // if home page present
    if (isElementAvailable(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" })) {
      // Add product from esika and proceed to checkout
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
      // Click on makeup
      clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait for add to cart button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // wait untill cart
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // handle cbox popup
      // start if for popup
      if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
        // click on close button
        clickOnElement(new String[] { CSS, "button#cboxClose > span" });
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Cbox Popup was not found \"");
        // end else statement
      }
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // enter guest first name
      typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
      // enter guest last name
      typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
      // enter guest user mail id
      typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
      // click on continue button
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
      // Shipping Address Details
      // if region field present
      if (isDisplayed(new String[] { ID, "address.regionIsoParent2" }, 0)) {
        // Select Option from REGION
        selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
        // Select Option from COMMUNE
        selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
        // Select Option from location
        selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
        // Write text in STREET AND NUMBER
        typeText(new String[] { ID, "address.line1" }, "church street");
        // Write text in TELEPHONE CONTACT
        typeText(new String[] { ID, "address.phone" }, "456789842");
        // Click on addressSubmit
        clickOnElement(new String[] { ID, "addressSubmit" });
        // end if
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"region field is not present\"");
        // end else statement
      }
      // if debit card present
      if (isElementAvailable(
        new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" })) {
        // Add assertion for debit card
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" }));
        // Write Text in RUT TextField
        typeText(new String[] { XPATH, "//input[@id=\'documentId\']" }, "712345667");
        // Validate Shipping Address
        takeScreenshotOfParticularElement(
          new String[] { XPATH, "(//div[@class=\'multiSteps-widget shipping-address\'])[2]" },
          "logs/Screenshots/iMHjRk.png");
        // Validate Shipping address  Text
        Assert.assertTrue(
          getText(new String[] { XPATH, "(//span[@class=\'title shipping-address-title\'])[2]" }).contains(
            "Dirección de envío"));
        // Validate Pay Button is Clickable
        Assert.assertFalse(
          isElementClickable(new String[] { XPATH, "//button[contains(@class,\'btn btn-block submit_mpagoW\')]" }));
        // end if debit card present
      }
      // start else
      else {
        // print
        printResults("PrintNote", "\"element is not present\"");
        // end else
      }
      // Clear cookies and cache
      // Clear cookies
      deleteAllCookies();
      // Clear storage
      javascriptExecution("window.localStorage.clear();");
      // Clear session storage
      javascriptExecution("window.sessionStorage.clear();");
      // Go to Mto URL
      getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
      // Add product from esika and proceed to checkout
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
      // Click on makeup
      clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait for add to cart button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // wait untill cart
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // handle cbox popup
      // start if for popup
      if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
        // click on close button
        clickOnElement(new String[] { CSS, "button#cboxClose > span" });
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Cbox Popup was not found \"");
        // end else statement
      }
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // enter guest first name
      typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
      // enter guest last name
      typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
      // enter guest user mail id
      typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
      // click on continue button
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
      // Shipping Address Details
      // if region field present
      if (isDisplayed(new String[] { ID, "address.regionIsoParent2" }, 0)) {
        // Select Option from REGION
        selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
        // Select Option from COMMUNE
        selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
        // Select Option from location
        selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
        // Write text in STREET AND NUMBER
        typeText(new String[] { ID, "address.line1" }, "church street");
        // Write text in TELEPHONE CONTACT
        typeText(new String[] { ID, "address.phone" }, "456789842");
        // Click on addressSubmit
        clickOnElement(new String[] { ID, "addressSubmit" });
        // end if
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"region field is not present\"");
        // end else statement
      }
      // if debit card present
      if (isElementAvailable(
        new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" })) {
        // Add assertion for debit card
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "//label[contains(@for,\'belcorpNewCheckoutPaymentMode_mpago_debit\')]" }));
        // Write Text in RUT TextField
        typeText(new String[] { XPATH, "//input[@id=\'documentId\']" }, "712345667");
        // Validate Shipping Address
        takeScreenshotOfParticularElement(
          new String[] { XPATH, "(//div[@class=\'multiSteps-widget shipping-address\'])[2]" },
          "logs/Screenshots/efXBRG.png");
        // Validate Shipping address  Text
        Assert.assertTrue(
          getText(new String[] { XPATH, "(//span[@class=\'title shipping-address-title\'])[2]" }).contains(
            "Dirección de envío"));
        // Validate Pay Button is Clickable
        Assert.assertFalse(
          isElementClickable(new String[] { XPATH, "//button[contains(@class,\'btn btn-block submit_mpagoW\')]" }));
        // end if debit card present
      }
      // end if for home page present
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Verify_layout_Step_Two_Payment_with_TJ_Credit__New_CheckoutTSevenTwoSevenOne() {
    javascriptExecution("lambda-name=Verify layout Step Two Payment with TJ Credit  New CheckoutTSevenTwoSevenOne");

    // Clear cache cookies
    // Clear cookies
    //deleteAllCookies();
    // Clear storage
    //javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    //javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    // handle cbox popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // new  user login and add a product to cart and proceed to checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    //wait
    waitForTime(10);
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "input#documentId" }, "10", "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit_w2w.radiompago_debit_w2wCL" },
      "logs/Screenshots/ZsjSoa.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCL > label\").click();");
    // wait untill To divide the payment into installments, you must coordinate it directly with your bank  present
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }, "10",
      "disabled");
    // start if statement for messgae
    if (isElementAvailable(
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" })) {
      // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }));
      // end if statement
    }
    // start if statement for saved cards
    if (isElementAvailable(new String[] { XPATH, "(//form[@id=\'mpago_card_saved\']/div)[1]" })) {
      // wait until page loads saved cards
      waitUntil("CheckVisibleElement", new String[] { XPATH, "(//form[@id='mpago_card_saved']/div)[1]" }, "10",
        "disabled");
      // take a snip to verify The order of the cards
      takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
        "logs/Screenshots/zejOcD.png");
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"saved cards are not present\"");
      // end else statement
    }
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To consultant URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // login asfirst user and procced upto checkout
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    javascriptExecution("document.querySelector(\"div.new-header.header-izq > button[type=\'button\']\").click();");
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    javascriptExecution("document.querySelector(\"li.auto.liUserSign > a > p > span\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
    // Write text in username
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_44913491@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    //wait
    waitForTime(5);
    // click On close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Close the popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait until cart
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Close Popup
    // start if for popup
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Cbox Popup was not found \"");
      // end else statement
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // click on second saved address
    javascriptExecution("document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "input#documentId" }, "10", "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit_w2w.radiompago_debit_w2wCL" },
      "logs/Screenshots/ruAmdi.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCL > label\").click();");
    // wait untill To divide the payment into installments, you must coordinate it directly with your bank  present
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }, "10",
      "disabled");
    // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "form#mpago_credit div.payment-installments-outer > div > span > div > div" }));
    // start if statement for saved cards
    if (isElementAvailable(new String[] { XPATH, "(//form[@id=\'mpago_card_saved\']/div)[1]" })) {
      // wait until page loads saved cards
      waitUntil("CheckVisibleElement",
        new String[] { XPATH, "form#mpago_card_saved div.payment-installments-outer > div" }, "10", "disabled");
      // take a snip to verify The order of the cards
      takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
        "logs/Screenshots/ioUJKM.png");
      // end is statement
    }
    // start else statemt
    else {
      // print in result
      printResults("PrintNote", "\"saved cards not present\"");
      // end else statement
    }

    status = "passed";
  }
}