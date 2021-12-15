package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New_Checkout_Step_Two__Peru__Mobile extends WebDriverHelper {

  @Test
  public void Verify_criteria_in_Payment_Rejected__in_new_checkoutCTwoThreezeroThree() {
    javascriptExecution("lambda-name=Verify criteria in Payment Rejected  in new checkoutCTwoThreezeroThree");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe");
    // add product and proceed to checkout
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Click on credit card
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // Wrire text in CVV
    typeText(new String[] { XPATH, "(//input[@placeholder=\'CVV*\'])[1]" }, "123");
    // click on \"I accept terms and conditions\"
    javascriptExecution("document.querySelector(\"input[id=\'Terms1_mpagoCreditCardForm\']\").click();");
    // Click on \"I accept terms and conditions\"
    javascriptExecution(
      "document.querySelector(\"input[id=\'agreeToReceiveWhatsappNotificationsCheck_mpagoCreditCardForm\']\").click();");
    // Wait
    waitForTime(5);
    // Start If Statement
    if (isElementClickable(
      new String[] { XPATH, "(//button[@class=\'btn btn-block submit_mpagoForm checkout-next\'])[1]" })) {
      // click on  pay button
      clickOnElement(new String[] { XPATH, "(//button[@class=\'btn btn-block submit_mpagoForm checkout-next\'])[1]" });
      // End If Statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" })) {
      // Validate  error messeage
      Assert.assertTrue(getText(new String[] { CSS, "div#cboxLoadedContent div > span" }).contains(
        "Recuerda que tu tarjeta debe estar autorizada para hacer pagos por internet. Contacta a tu banco"));
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End If Statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"Error Message is not comming\"");
      // End Else Statement
    }
    // Validate pay button
    Assert.assertFalse(isElementClickable(
      new String[] { XPATH, "(//button[@class=\'btn btn-block submit_mpagoForm checkout-next\'])[1]" }));
    // Validate another payment method
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" }));
    // Validation for \"redirection\"
    Assert.assertTrue(checkCurrentUrlContains("checkout"));

    status = "passed";
  }

  @Test
  public void Verify_behavior_of_old_CheckoutCTwoTwoEightSeven() {
    javascriptExecution("lambda-name=Verify behavior of old CheckoutCTwoTwoEightSeven");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "20", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "APRO");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160033004714834");
    // select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // write text in doc number
    typeText(new String[] { CSS, "input#docNumberDebit" }, "12345678");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // wait until submit button clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // start if statement for sucess message
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // add aseertion for checkout success
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
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // login as first user and procced upto checkout
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait untill add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "20", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "100",
      "disabled");
    // write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "APRO");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160 0330 0471 4834");
    // select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // wait until submit button
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // start if statement for sucess message
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // add aseertion for pending message
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }));
      // print in result
      printResults("PrintNote", "\"Payment is successfull\"");
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
  public void Verify_criteria_in_Payment_Rejected_in_new_checkoutCTwoTwoEightFive() {
    javascriptExecution("lambda-name=Verify criteria in Payment Rejected in new checkoutCTwoTwoEightFive");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "20", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "CALL");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160 0330 0471 4834");
    // select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // write text in doc number
    typeText(new String[] { CSS, "input#docNumberDebit" }, "12345678");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // wait until submit button clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // start if statement for error message
    if (isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" })) {
      // add aseertion for error messeage
      Assert.assertTrue(getText(new String[] { CSS, "div#cboxLoadedContent div > span" }).contains(
        "Recuerda que tu tarjeta debe estar autorizada para hacer pagos por internet. Contacta a tu banco"));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"the error message is wrong\"");
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
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // add a product and proceed upto checkout
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait untill add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "100",
      "disabled");
    // write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "FUND");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160 0330 0471 4834");
    // select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // wait until submit button
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // start if statement for error message
    if (isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" })) {
      // add aseertion for error messeage
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#cboxLoadedContent div > span" }));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"the error message is wrong \"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Verify_the_type_of_cash_payment_Agents_and_agenciesCTwoOneNinezero() {
    javascriptExecution("lambda-name=Verify the type of cash payment Agents and agenciesCTwoOneNinezero");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // add a product and proceed upto checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // click on cash on delivery address
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashPE > label" });
    // add assertion for banner
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div#mpago_mpago_pagoefectivo_atm_pe div.js-payment-option.js-payment-option-1 > div.alert.alert-info.cash-method-alert" }));
    // Verify that the 5 steps to complete the payment appear Steps
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ol[@class=\"bullet-list list-margin\"]" }));
    // Go To consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // add a product and proceed upto checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // click on cash payment
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashPE > label" });
    // add assertion for banner
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div#mpago_mpago_pagoefectivo_atm_pe div.js-payment-option.js-payment-option-1 > div.alert.alert-info.cash-method-alert" }));
    // add assertion for Verify that the 5 steps to complete the payment appear. Steps
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ol[@class=\"bullet-list list-margin\"]" }));

    status = "passed";
  }

  @Test
  public void Validate_that_the_banner_must_appear_in_each_step_as_part_of_the_headerCTwoOneThreeEight() {
    javascriptExecution(
      "lambda-name=Validate that the banner must appear in each step as part of the headerCTwoOneThreeEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Add one product to cart
    // Go to URL
    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // wait
    waitForTime(5);
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitForTime(5);
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // Select Option from Departamento*A...
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "AMAZONAS");
    // Select Option from Provincia*CANG...
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "BAGUA");
    // Select Option from Distrito*AUCAR...
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "BAGUA");
    // Click on address.line1
    clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" });
    // Write text in address.line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "abc");
    // Click on address.line2
    clickOnElement(new String[] { CSS,
      "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" });
    // Write text in address.line2
    typeText(new String[] { CSS,
      "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "bcd");
    // Click on address.referen...
    clickOnElement(
      new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" });
    // Write text in address.referen...
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "cde");
    // Click on address.phone
    clickOnElement(
      new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" });
    // Write text in address.phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "12345678");
    // Click on Continue
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Validation on checkout step
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[contains(text(),\'Checkout\')]" }));
    // Step Assertion on \"100 % secure\" banner
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"info\"]" }));
    // scroll
    scroll("ScrollDown", 778);
    // Check for cash on delivery method
    if (isElementAvailable(new String[] { XPATH, "//label[text()=\'Pago Efectivo\']" })) {
      // Select cash payment method
      clickOnElement(new String[] { XPATH, "//label[text()=\'Pago Efectivo\']" });
      // Select agent and agencies payment
      clickOnElement(new String[] { CSS, "label[for=\"mpago_agencia\"]" });
      // Click on checkbox 1
      clickOnElement(new String[] { XPATH, "//input[@id=\"Terms1_mpagoCashForm\"]" });
      // Click on pay
      clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'Pagar\')])[1]" });
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Check_layout__Billing_Address_for_TJ_Credit_CTwoThreezeroSeven() {
    javascriptExecution("lambda-name=Check layout  Billing Address for TJ Credit CTwoThreezeroSeven");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
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
    // click on accept terms and condition checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // refresh
    pageRefresh();
    // Add shipping charge
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
    // Write text in address line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "7867876788");
    // wait
    waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
      "disabled");
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
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
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=BeautyEsika");
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
    // click on accept terms and condition checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // Fill address details
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
    // Write text in address line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "7867876788");
    // wait
    waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
      "disabled");
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Pending_Payment_in_new_checkoutCTwoTwoEightSix() {
    javascriptExecution("lambda-name=Verify criteria in Pending Payment in new checkoutCTwoTwoEightSix");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait untill add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "20", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "CONT");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160033004714834");
    // select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // write text in doc number
    typeText(new String[] { CSS, "input#docNumberDebit" }, "12345678");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // wait until submit button clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
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
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait for add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "20", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "100",
      "disabled");
    // write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "CONT");
    // write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160 0330 0471 4834");
    // select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // wait until submit button
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
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
  public void Verify_criteria_in_Payment_Approved__in_new_checkoutCTwoThreezeroTwo() {
    javascriptExecution("lambda-name=Verify criteria in Payment Approved  in new checkoutCTwoThreezeroTwo");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on hemberger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Check if product is available
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // click on product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on go pay continue
      clickOnElement(new String[] { CSS,
        "button[id=\"checkout-display-continueCheckout\"][class=\"checkout-display-continueCheckout btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\"]" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "test");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "test_user_86292523@testuser.com");
      // Click on agree terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on continue
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Select Option from department
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
      // Select Option from province
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
      // Select Option from district
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
      // Write text in address
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "New Colony 123");
      // Write text in phone
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
      // Click on continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Click on credit card
      clickOnElement(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
      // Wrire text in name of owner
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[1]" }, "APRO");
      // Wrire text in card number
      typeText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[1]" }, "5031755734530604");
      // Select Option from expiry month
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationMonth\'])[1]" }, "11");
      // Select Option from expiry year
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[1]" }, "2025");
      // Wrire text in CVV
      typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[1]" }, "123");
      // Select Option from document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "DNI");
      // Write text in document number
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "98765432");
      // navigate back
      goBack();
      // Click on continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Valiadate \"data is not saved\"
      Assert.assertFalse(
        getText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[1]" }).contains(
          "5031755734530604"));
      // Validate mandatory fields are empty
      takeScreenshot("logs/Screenshoots/sKUasn.png");
      // Click on credit card
      clickOnElement(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
      // Wrire text in name of owner
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[1]" }, "APRO");
      // Wrire text in card number
      typeText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[1]" }, "5031755734530604");
      // select Option from expiry month
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationMonth\'])[1]" }, "11");
      // Select Option from expiry year
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[1]" }, "2025");
      // Wrire text in CVV
      typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[1]" }, "123");
      // Select Option from document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "DNI");
      // Write text in document number
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "98765432");
      // click on \"I accept terms\"
      javascriptExecution("document.querySelector(\"input[id=\'Terms1_mpagoCreditCardForm\']\").click();");
      // Click on \"I accept terms and conditions\"
      javascriptExecution(
        "document.querySelector(\"input[id=\'agreeToReceiveWhatsappNotificationsCheck_mpagoCreditCardForm\']\").click();");
      // Add Assertion for pay button
      Assert.assertTrue(isElementClickable(
        new String[] { XPATH, "(//button[@class=\"btn btn-block submit_mpagoForm checkout-next\"])[1]" }));
      // click on  pay button
      clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block submit_mpagoForm checkout-next\"])[1]" });
      // end of if
    }
    // start if statement
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
        takeScreenshot("logs/Screenshoots/CDErbJ.png");
        // end if statement
      }
      // switch back to initial tab
      switchToPreviousTab();
      // start else statemnet
else{
        // print in result
        printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
        // end else statement
      }
      // End If Statement
    }
    // Start Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available/card details not proper\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_behavior_in_Billing_Address__CTwoThreeOnezero() {
    javascriptExecution("lambda-name=Verify behavior in Billing Address  CTwoThreeOnezero");

    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to Ecom URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe");
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
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait for add to cart button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { CSS, "div#deliveryAddressesSelector div:nth-child(3) > label" },
        "20", "disabled");
      // start if statement
      if (isElementAvailable(new String[] { CSS, "div#deliveryAddressesSelector div:nth-child(3) > label" })) {
        // Click on second saved address
        javascriptExecution(
          "document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
        // End if statement
      }
      // start else statement
      else {
        // print result
        printResults("PrintNote", "\"second saved address is not present\"");
        // End else
      }
      // wait until continue button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
      // click on address submit
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // if credit card present
      if (isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" })) {
        // Add assertion for credit card
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" }));
        // Add assertion for same shipping address
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_on_debitSaved\']" }));
        // Add assertion for other directions
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_off_debitSaved\']" }));
        // end if credit card present
      }
      // clear cache
      // Clear cookies
      deleteAllCookies();
      // Clear storage
      javascriptExecution("window.localStorage.clear();");
      // Clear session storage
      javascriptExecution("window.sessionStorage.clear();");
      // Go to Mto URL
      getURL("https://s1-esika.tiendabelcorp.com/pe?consultantUrl=pruebitas");
      // Add product from esika and proceed to checkout
      // Go to login URL
      getURL("https://s1-esika.tiendabelcorp.com/pe/login");
      // wait
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
      // Write text in username
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // wait
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
      // wait
      waitUntil("CheckVisibleElement",
        new String[] { CSS, "div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a" }, "5",
        "disabled");
      // Click on second   product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait
      waitForTime(5);
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // if credit card present
      if (isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" })) {
        // Add assertion for credit card
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" }));
        // Add assertion for same shipping address
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_on_debitSaved\']" }));
        // Add assertion for other directions
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_off_debitSaved\']" }));
        // end if credit card present
      }
      // end if home page present
    }

    status = "passed";
  }

  @Test
  public void Chose_HYBRISVOneOneFivezeroOneTwo() {
    javascriptExecution("lambda-name=Chose HYBRISVOneOneFivezeroOneTwo");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on hemberger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[1]" })) {
      // click on second product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on go pay continue
      clickOnElement(new String[] { CSS,
        "button[id=\"checkout-display-continueCheckout\"][class=\"checkout-display-continueCheckout btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\"]" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on continue
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Select Option from department
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
      // Select Option from province
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
      // Select Option from district
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
      // Write text in address
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "New Colony 123");
      // Write text in phone
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
      // Click on continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Add assertion for shipping address
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//span[@class=\'title shipping-address-title\'])[3]" }));
      // Click on edit  button
      javascriptExecution("document.querySelector(\"a[class=\'go-back-link\']\").click();");
      // Validation it reditects to checkout step 1
      Assert.assertTrue(checkCurrentUrlContains("checkout"));
      // End If Statement
    }
    // Start Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Check_criteria_of_selected_TJCTwoTwoNineSeven() {
    javascriptExecution("lambda-name=Check criteria of selected TJCTwoTwoNineSeven");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // refresh
    pageRefresh();
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // click on Add New Card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // Write  Text In cardholder Name
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
    // Write Text In Card Number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumberDebit\']" }, "5160033004714834");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select Option From Year Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write Text In Cvv
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // navigate backward
    goBack();
    // wait
    waitUntil("CheckEnabledElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "15", "disabled");
    // click on  Address submit Button
    javascriptExecution("document.querySelector(\"button#addressSubmit\").click();");
    // Enter cvv in saved card
    typeText(new String[] { XPATH, "//input[@name=\'securityCodeCardSaved\']" }, "123");
    // Scroll
    scrollIntoElementView(new String[] { CSS, "label[for=\"Terms1_MPagoCardSavedForm_mpago_debmaster\"]" });
    // Click on checkbox
    javascriptExecution("document.querySelector(\"#Terms1_MPagoCardSavedForm_mpago_debmaster\").click();");
    // Add Assertion For pay Button
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" }));
    // Click on pay button
    clickOnElement(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" });
    // Add Assertion for successfull order
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // Click on Add New Card button
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // Wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//input[@id='cardholderName'])[2]" }, "10", "disabled");
    // Write Text In Card Holder Name
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
    // Write Text In Card Number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumberDebit\']" }, "5160033004714834");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write Text in Cvv TextBox
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // navigate backward
    goBack();
    // wait
    waitUntil("CheckEnabledElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "15", "disabled");
    // Click On address submit Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Enter cvv
    typeText(new String[] { CSS,
        "form#mpago_card_saved div:nth-child(1) > div > div.card-saved-cvv-content-container > div > div.form-group > div.tooltip-group > input[name=\"securityCodeCardSaved\"]" },
      "123");
    // click on checkbox
    javascriptExecution("document.querySelector(\"#Terms1_MPagoCardSavedForm_mpago_debmaster\").click();");
    // Add Assertion For Pay Button
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" }));
    // Click on Pay
    clickOnElement(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" });
    // Add Assertion For Successful Purchase
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));

    status = "passed";
  }

  @Test
  public void Check_layout_Billing_Address__for_TJ_Debit__CTwoThreezeroNine() {
    javascriptExecution("lambda-name=Check layout Billing Address  for TJ Debit  CTwoThreezeroNine");

    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to  Ecom URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe");
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
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait for add to cart button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { CSS, "div#deliveryAddressesSelector div:nth-child(3) > label" },
        "20", "disabled");
      // start if statement
      if (isElementAvailable(new String[] { CSS, "div#deliveryAddressesSelector div:nth-child(3) > label" })) {
        // Click on second saved address
        javascriptExecution(
          "document.querySelector(\"div#deliveryAddressesSelector div:nth-child(3) > label\").click();");
        // End if statement
      }
      // start else statement
      else {
        // print result
        printResults("PrintNote", "\"second saved address is not present\"");
        // End else
      }
      // wait until continue button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
      // click on address submit
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // if debit card present
      if (isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" })) {
        // Add assertion for debit card
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" }));
        // Add assertion for same shipping address
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_on_debitSaved\']" }));
        // Add assertion for other directions
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_off_debitSaved\']" }));
        // end if debit card present
      }
      // clear cache
      // Clear cookies
      deleteAllCookies();
      // Clear storage
      javascriptExecution("window.localStorage.clear();");
      // Clear session storage
      javascriptExecution("window.sessionStorage.clear();");
      // Go to Mto URL
      getURL("https://s1-esika.tiendabelcorp.com/pe?consultantUrl=pruebitas");
      // Add product from esika and proceed to checkout
      // Go to login URL
      getURL("https://s1-esika.tiendabelcorp.com/pe/login");
      // wait
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
      // Write text in username
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // wait
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
      // wait
      waitUntil("CheckVisibleElement",
        new String[] { CSS, "div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a" }, "5",
        "disabled");
      // Click on second   product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
      // wait
      waitForTime(5);
      // Click on click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // click on gopay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
      // if debit card present
      if (isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" })) {
        // Add assertion for debit card
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']" }));
        // Add assertion for same shipping address
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_on_debitSaved\']" }));
        // Add assertion for other directions
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[@for=\'mpagoUseDeliveryAddress_off_debitSaved\']" }));
        // end if debit card present
      }
      // end if for home page present
    }

    status = "passed";
  }

  @Test
  public void Validate_that_the_banner_for_ecom_was_displayedCTwozeroNineFour() {
    javascriptExecution("lambda-name=Validate that the banner for ecom was displayedCTwozeroNineFour");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // GoToURL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // add a product to cart and proceed to checkout
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS,
        "div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > div.mt-12.helpMessage > div" }, "10",
      "disabled");
    // Add assertion for help email
    Assert.assertTrue(isElementDisplayed(new String[] { CSS,
      "div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > div.mt-12.helpMessage > div" }));

    status = "passed";
  }

  @Test
  public void Verify_the_payment_method_CashCTwoOneEightEight() {
    javascriptExecution("lambda-name=Verify the payment method CashCTwoOneEightEight");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // add a product and proceed upto checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // click on cash on delivery address
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashPE > label" });
    // add assertion for cash payment
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"payment-method-container\"]" }));
    // Go To consulatnat URL
    getURL("https://s1-esika.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // add a product and proceed upto checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // click on cash payment
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashPE > label" });
    // add assertion for cash payment
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "div#mpago_mpago_pagoefectivo_atm_pe > div.payment-method-container" }));

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Payment_Approved_in_new_checkoutCTwoTwoNineEight() {
    javascriptExecution("lambda-name=Verify criteria in Payment Approved in new checkoutCTwoTwoNineEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // refresh
    pageRefresh();
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // click on Add New Card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // Write  Text In cardholder Name
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
    // Write Text In Card Number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumberDebit\']" }, "5160033004714834");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select Option From Year Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write Text In Cvv
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // navigate backward
    goBack();
    // wait
    waitUntil("CheckEnabledElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "15", "disabled");
    // click on  Address submit Button
    javascriptExecution("document.querySelector(\"button#addressSubmit\").click();");
    // Enter cvv in saved card
    typeText(new String[] { XPATH, "//input[@name=\'securityCodeCardSaved\']" }, "123");
    // Click on checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_MPagoCardSavedForm_mpago_debmaster\").click();");
    // Add Assertion For pay Button
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" }));
    // Click on pay button
    clickOnElement(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" });
    // Add Assertion for successfull order
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
    // Mail Validation
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
      takeScreenshot("logs/Screenshoots/AObTpE.png");
      // end if statement
    }
    // switch back to initial tab
    switchToPreviousTab();
    // start else statemnet
else{
      // print in result
      printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
      // end else statement
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // Click on Add New Card button
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // Wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//input[@id='cardholderName'])[2]" }, "10", "disabled");
    // Write Text In Card Holder Name
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
    // Write Text In Card Number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumberDebit\']" }, "5160033004714834");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write Text in Cvv TextBox
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // navigate backward
    goBack();
    // wait
    waitUntil("CheckEnabledElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "15", "disabled");
    // Click On address submit Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Enter cvv
    typeText(new String[] { CSS,
        "form#mpago_card_saved div:nth-child(1) > div > div.card-saved-cvv-content-container > div > div.form-group > div.tooltip-group > input[name=\"securityCodeCardSaved\"]" },
      "123");
    // click on checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_MPagoCardSavedForm_mpago_debmaster\").click();");
    // Add Assertion For Pay Button
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" }));
    // Click on Pay
    clickOnElement(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" });
    // Add Assertion For Successful Purchase
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
    // Mail validation
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
      takeScreenshot("logs/Screenshoots/oYeuqd.png");
      // end if statement
    }
    // switch back to initial tab
    switchToPreviousTab();
    // start else statemnet
else{
      // print in result
      printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Verify_layout_Step_Two_Payment_with_TJ_Debit__New_CheckoutCTwoTwoNineSix() {
    javascriptExecution("lambda-name=Verify layout Step Two Payment with TJ Debit  New CheckoutCTwoTwoNineSix");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Add assertion for TJ Debit
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_debit\"]" }));
    // Click on Debit card method
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_debit\']\").click();");
    // Assertion on Saved Cards
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"contentCardsSaved\"])[1]" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Add assertion for TJ Debit
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_debit\"]" }));
    // Click on Debit card method
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_debit\"]" });
    // Assertion on Saved Cards
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"contentCardsSaved\"])[1]" }));

    status = "passed";
  }

  @Test
  public void Check_criteria_of_selected_TJCTwoTwoNinezero() {
    javascriptExecution("lambda-name=Check criteria of selected TJCTwoTwoNinezero");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit.radiompago_debitPE" },
      "logs/Screenshots/lXYdaR.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditPE > label\").click();");
    // wait until page loads saved cards
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//form[@id='mpago_card_saved']/div)[1]" }, "10",
      "disabled");
    // take a snip to verify The order of the cards
    takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
      "logs/Screenshots/VozlKN.png");
    // start if statement To divide the payment into installments, you must coordinate it directly with your bank.
    if (isElementAvailable(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" })) {
      // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
      Assert.assertTrue(
        getText(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" }).contains(
          "Para dividir el pago en cuotas deberás coordinarlo directamente con tu banco."));
      // end if statment
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote",
        "\"To divide the payment into installments, you must coordinate it directly with your bank. not found\"");
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
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "100",
      "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit.radiompago_debitPE" },
      "logs/Screenshots/UlOCHH.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditPE > label\").click();");
    // wait until page loads saved cards
    waitUntil("CheckVisibleElement",
      new String[] { XPATH, "form#mpago_card_saved div.payment-installments-outer > div" }, "10", "disabled");
    // take a snip to verify The order of the cards
    takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
      "logs/Screenshots/nEmYmU.png");
    // start if statement for To divide the payment into installments, you must coordinate it directly with your bank.
    if (isElementAvailable(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" })) {
      // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
      Assert.assertTrue(
        getText(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" }).contains(
          "Para dividir el pago en cuotas deberás coordinarlo directamente con tu banco."));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"To divide the payment into installments, you must coordinate it directly with your bank. is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Payment_Approved_in_new_checkoutCTwoTwoEightFour() {
    javascriptExecution("lambda-name=Verify criteria in Payment Approved in new checkoutCTwoTwoEightFour");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//p[@class=\"empty-screen-info-label\"]" })) {
      // go back to LBel
      goBack();
      // click on hamburger menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // Click on Makeup category
      clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
      // Add 1st product to cart
      clickOnElement(
        new String[] { XPATH, "(//button[@class=\"btn btn-black btn-block js-enable-btn js-add-to-cart\"])[1]" });
      // Click on keep buying
      clickOnElement(new String[] { XPATH,
        "//li//div//div//div[@class=\'nav-cart\']//div//div[@class=\'add-to-cart add-to-cart-cross\']//a[contains(text(),\'     Seguir Comprando\')]" });
      // Add 2nd product to cart
      clickOnElement(
        new String[] { XPATH, "(//button[@class=\"btn btn-black btn-block js-enable-btn js-add-to-cart\"])[2]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
      // Click on confirm  go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
      // End of if loop
    }
    // Wait
    waitUntil("CheckElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // Click on Add another card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // write text in  card holder textbox
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[2]" }, "APRO");
    // Write text in card number textbox
    typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[2]" },
      "5178781622202455");
    // Select expiry month
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[2]" }, "11");
    // Select expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[2]" }, "2025");
    // Enter cvv
    typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[2]" }, "123");
    // Click on checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // Click on Pay
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block submit_mpagoForm checkout-next\"])[2]" });
    // Assertion on successfull order
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]" }));
    // Mail validation
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
      takeScreenshot("logs/Screenshoots/feiCpJ.png");
      // end if statement
    }
    // switch back to initial tab
    switchToPreviousTab();
    // start else statemnet
else{
      // print in result
      printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
      // end else statement
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // Add product to cart
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // Select address1
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "AMAZONAS");
    // Select address2
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "BAGUA");
    // Select address3
    selectOption(new String[] { ID, "address.regionIso" }, "BAGUA");
    // Write text in direction box
    typeText(new String[] { ID, "address.line1" }, "14,west side");
    // Write text in telephone number box
    typeText(new String[] { ID, "address.phone" }, "12345667");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // Wait
    waitUntil("CheckElement", new String[] { XPATH, "(//input[@id='cardholderName'])[2]" }, "15", "disabled");
    // write text in  card holder textbox
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[2]" }, "APRO");
    // Write text in card number textbox
    typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[2]" },
      "5178781622202455");
    // Select expiry month
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[2]" }, "11");
    // Select expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[2]" }, "2025");
    // Write cvv
    typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[2]" }, "123");
    // Click on checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // Write Document Number
    typeText(new String[] { XPATH, "//input[@id=\"docNumberDebit\"]" }, "12345672");
    // Click on Pay
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block submit_mpagoForm checkout-next\"])[2]" });
    // Assertion on Payment Approved
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//p[text()=\'Tu Número de Orden es:\']" }));
    // Mail validation
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
      takeScreenshot("logs/Screenshoots/kSDdcF.png");
      // end if statement
    }
    // switch back to initial tab
    switchToPreviousTab();
    // start else statemnet
else{
      // print in result
      printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Desktop_and_Mobile__Validate_that_the_banner_for_mto_is_displayedCTwozeroNineNine() {
    javascriptExecution(
      "lambda-name=Desktop and Mobile  Validate that the banner for mto is displayedCTwozeroNineNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // add a product to cart and proceed to checkout
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // wait
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "div.consultant-header-cart.visible-xs.multi-checkout-consultantHeader" }, "10", "disabled");
    // assert for user email
    Assert.assertTrue(
      getText(new String[] { CSS, "div.consultant-header-cart.visible-xs.multi-checkout-consultantHeader" }).contains(
        "Estás en la tienda online de:"));
    // take a snip to verify shipping address stored
    takeScreenshotOfParticularElement(
      new String[] { CSS, "div.consultant-header-cart.visible-xs.multi-checkout-consultantHeader" },
      "logs/Screenshots/SemoVl.png");
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS,
        "div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > div.mt-12.helpMessage > div" }, "10",
      "disabled");
    // Add assertion for help email
    Assert.assertTrue(isElementDisplayed(new String[] { CSS,
      "div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > div.mt-12.helpMessage > div" }));

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Rejected_Payment_in_new_checkoutCTwoTwoNineNine() {
    javascriptExecution("lambda-name=Verify criteria in Rejected Payment in new checkoutCTwoTwoNineNine");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add product to cart
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Refresh
    pageRefresh();
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // Click on Add new Card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // Write Text In CardHolder Name
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "CALL");
    // Write Text In Card Number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumberDebit\']" }, "5160033004714834");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select Option From Year Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write Text In Cvv textbox
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // Clixck on Terms and Condition Checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // Add Assertion For Pay Button
    Assert.assertTrue(
      isElementDisplayed(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }));
    // Click on Pay Button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // Add Assertion For Error Message
    Assert.assertTrue(getText(new String[] { CSS, "div#cboxLoadedContent div > span" }).contains(
      "Recuerda que tu tarjeta debe estar autorizada para hacer pagos por internet. Contacta a tu banco"));
    // click on close Error message Popup
    javascriptExecution("document.querySelector(\"button#cboxClose\").click();");
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL PERU MTO
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // Click on first product
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // Click On Add New Card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//input[@id='cardholderName'])[2]" }, "10", "disabled");
    // Write Text In Card Holder Name
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "CALL");
    // Write Text in Card Number
    typeText(new String[] { XPATH, "//input[@id=\'cardNumberDebit\']" }, "5160033004714834");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select Option From Year Dropdown
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write Text In Cvv textbox
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // Click on T&cC checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // Add Assertion For Pay Button
    Assert.assertTrue(
      isElementClickable(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }));
    // Click On Pay Button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // start if statement
    if (isDisplayed(new String[] { CSS, "div#cboxLoadedContent div > span" }, 0)) {
      // Add Assertion For Error Message
      Assert.assertTrue(getText(new String[] { CSS, "div#cboxLoadedContent div > span" }).contains(
        "Recuerda que tu tarjeta debe estar autorizada para hacer pagos por internet. Contacta a tu banco"));
      // end if
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // start if statement
    if (isElementAvailable(new String[] { CSS, "button#cboxClose" })) {
      // Click On Close Error Mesaage Popup
      javascriptExecution("document.querySelector(\"button#cboxClose\").click();");
      // end if statement
    }
    // start else statement
    else {
      // Print result
      printResults("PrintNote", "\"error message popup is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Check_Type_of_DocumentCTwoTwoEightThree() {
    javascriptExecution("lambda-name=Check Type of DocumentCTwoTwoEightThree");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    // click on accept terms and condition checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // refresh
    pageRefresh();
    // go forward
    goForward();
    // Select credit card payment option
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
    // Write text in address line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "7867876788");
    // wait
    waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
      "disabled");
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Validation on Document type
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Método de pago\']" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { CSS, "div#mpagoCreditCardDiv a#add-new-card" })) {
      // Click on Add another card
      javascriptExecution("document.querySelector(\"div#mpagoCreditCardDiv a#add-new-card\").click();");
      // End of if loop
    }
    // Enter card holder name
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
    // Enter card number
    typeText(new String[] { XPATH, "//input[@id=\"cardNumber\"]" }, "5031755734530604");
    // Select month of expiration
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
    // Select year of expiration
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
    // Enter cvv
    typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
    // CASE-1
    printResults("PrintNote", "Started DNI document type");
    // Assertion on default document type DNI
    Assert.assertTrue(getText(new String[] { XPATH, "//select[@id=\"docType\"]" }).contains("DNI"));
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "1234567");
    // Assertion on error message
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[text()=\'El documento debe tener 8 caracteres\']" }));
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678");
    // CASE-2
    printResults("PrintNote", "Started C.E document type");
    // Select another document type\"C.E\"
    selectOption(new String[] { XPATH, "(//select[@class=\"form-control input--doc-type\"])[1]" }, "C.E");
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678123a");
    // Assertion on error message
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[text()=\'Los siguientes caracteres ingresados no son válidos: (a), solo se aceptan números\']" }));
    // Enter correct document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "123456781234");
    // CASE-3
    printResults("PrintNote", "Started RUC  document type");
    // Select another document type\"RUC\"
    selectOption(new String[] { XPATH, "(//select[@class=\"form-control input--doc-type\"])[1]" }, "RUC");
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678123a");
    // Assertion on error message
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[text()=\'Los siguientes caracteres ingresados no son válidos: (a), solo se aceptan números\']" }));
    // Enter correct document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "123456781234");
    // CASE-4
    printResults("PrintNote", "Started Otro  document type");
    // Select another document type\"OTHER\"
    selectOption(new String[] { XPATH, "(//select[@class=\"form-control input--doc-type\"])[1]" }, "Otro");
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678123899@");
    // Enter correct document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678123899");
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
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
    // click on accept terms and condition checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // refresh
    pageRefresh();
    // go forward
    goForward();
    // Select credit card payment option
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
    // Write text in address line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "7867876788");
    // wait
    waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
      "disabled");
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Validation on document type
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Método de pago\']" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "div#mpagoCreditCardDiv a#add-new-card" })) {
      // Click on Add another card
      javascriptExecution("document.querySelector(\"div#mpagoCreditCardDiv a#add-new-card\").click();");
      // End of if loop
    }
    // Enter card holder name
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
    // Enter card number
    typeText(new String[] { XPATH, "//input[@id=\"cardNumber\"]" }, "5031755734530604");
    // Select month of expiration
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
    // Select year of expiration
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
    // Enter cvv
    typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
    // CASE-1
    printResults("PrintNote", "Started DNI  document type");
    // Assertion on default document type DNI
    Assert.assertTrue(getText(new String[] { XPATH, "//select[@id=\"docType\"]" }).contains("DNI"));
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "1234567");
    // Assertion on error message
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[text()=\'El documento debe tener 8 caracteres\']" }));
    // Enter correct document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678");
    // CASE-2
    printResults("PrintNote", "Started C.E  document type");
    // Select another document type\"C.E\"
    selectOption(new String[] { XPATH, "(//select[@class=\"form-control input--doc-type\"])[1]" }, "C.E");
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678123a");
    // Assertion on error message
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[text()=\'Los siguientes caracteres ingresados no son válidos: (a), solo se aceptan números\']" }));
    // Enter correct document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "123456781234");
    // CASE-3
    printResults("PrintNote", "Started RUC  document type");
    // Select another document type\"RUC\"
    selectOption(new String[] { XPATH, "(//select[@class=\"form-control input--doc-type\"])[1]" }, "RUC");
    // Enter document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678123a");
    // Assertion on error message
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[text()=\'Los siguientes caracteres ingresados no son válidos: (a), solo se aceptan números\']" }));
    // Enter correct document number
    typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "123456781234");

    status = "passed";
  }

  @Test
  public void Validate_that_the_banner_is_displayed_above_the_text_Payment_methodCTwoOneThreeSeven() {
    javascriptExecution(
      "lambda-name=Validate that the banner is displayed above the text Payment methodCTwoOneThreeSeven");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Add one product to cart
    // Go to URL
    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // wait
    waitForTime(5);
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitForTime(5);
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // Select Option from Departamento*A...
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "AMAZONAS");
    // Select Option from Provincia*CANG...
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "BAGUA");
    // Select Option from Distrito*AUCAR...
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "BAGUA");
    // Click on address.line1
    clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" });
    // Write text in address.line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "a");
    // Click on address.line2
    clickOnElement(new String[] { CSS,
      "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" });
    // Write text in address.line2
    typeText(new String[] { CSS,
      "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "b");
    // Click on address.referen...
    clickOnElement(
      new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" });
    // Write text in address.referen...
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "c");
    // Click on address.phone
    clickOnElement(
      new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" });
    // Write text in address.phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "12345667");
    // Click on Continue
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Assertion on \"Método de pago\" text
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Método de pago\']" }));
    // Assertion on \"100 % secure\" banner
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"info\"]" }));

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Pending_Payment_in_new_checkout__CTwoThreezerozero() {
    javascriptExecution("lambda-name=Verify criteria in Pending Payment in new checkout  CTwoThreezerozero");

    // Clear cache and  cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To  Ecom URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // New  user login and add a product to cart and proceed to checkout
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
    // Click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
    // Wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // Write text in card name
    typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "CONT");
    // Write text in card number
    typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160033004714834");
    // Select option from month drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
    // Select option from year drop down
    selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
    // Write text in CVV
    typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
    // Write text in doc number
    typeText(new String[] { CSS, "input#docNumberDebit" }, "12345678");
    // Click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
    // Wait until submit button clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" },
      "10", "disabled");
    // Add assertion submit button enabled
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }));
    // Click on submit button
    clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // Add aseertion for pending payment
      Assert.assertTrue(getText(new String[] { XPATH, "//span[@id=\"order-status\"]" }).contains("EN PROCESO"));
      // end if statement
    }
    // start else statement
    else {
      // Print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Verify_type_of_cash_payment_Internet_banking_and_mobile_bankingCTwoOneEightNine() {
    javascriptExecution("lambda-name=Verify type of cash payment Internet banking and mobile bankingCTwoOneEightNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // GoToURL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // add a product and proceed upto checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // click on cash on delivery address
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashPE > label" });
    // Verify that the 5 steps to complete the payment appear.Steps
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ol[@class=\"bullet-list list-margin\"]" }));
    // Go To consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // add a product and proceed upto checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // click on cash payment
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashPE > label" });
    // add assertion for Verify that the 5 steps to complete the payment appear Steps
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ol[@class=\"bullet-list list-margin\"]" }));

    status = "passed";
  }

  @Test
  public void Verify_layout_Step_Two_Payment_with_TJ_Debit__New_CheckoutCTwoTwoEightOne() {
    javascriptExecution("lambda-name=Verify layout Step Two Payment with TJ Debit  New CheckoutCTwoTwoEightOne");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on hemberger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[1]" })) {
      // click on second product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on go pay continue
      clickOnElement(new String[] { CSS,
        "button[id=\"checkout-display-continueCheckout\"][class=\"checkout-display-continueCheckout btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\"]" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on continue
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Select Option from department
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
      // Select Option from province
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
      // Select Option from district
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
      // Write text in address
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "New Colony 123");
      // Write text in phone
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
      // Click on continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Add assertion for TJ debit
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//input[@id=\"belcorpNewCheckoutPaymentMode_mpago_debit\"]" }));
      // End If Statement
    }
    // Start Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_behavior_of_old_CheckoutCTwoThreezeroFive() {
    javascriptExecution("lambda-name=Verify behavior of old CheckoutCTwoThreezeroFive");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add a product to cart and proceed to checkout
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait
    waitUntil("CheckVisibleElement",
      new String[] { XPATH, "//button[@class='btn btn-magenta btn-block checkout-next']" }, "20", "disabled");
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Write cvv
    typeText(new String[] { XPATH, "(//input[@name=\"securityCodeCardSaved\"])[1]" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCreditCardForm\").click();");
    // wait until submit button clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoCardSavedForm checkout-next']" }, "10",
      "disabled");
    // Click on Continue
    clickOnElement(
      new String[] { XPATH, "//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // add aseertion for checkout success
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }));
      // End of if loop
    }
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To consultant URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
    // login as first user and procced upto checkout
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Select credit card option
    waitUntil("CheckVisibleElement",
      new String[] { XPATH, "//button[@class='btn btn-magenta btn-block checkout-next']" }, "30", "disabled");
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // write cvv
    typeText(new String[] { XPATH, "(//input[@name=\"securityCodeCardSaved\"])[1]" }, "123");
    // click on card terms and condition checkbox
    javascriptExecution("document.querySelector(\"Terms1_MPagoCardSavedForm_mpago_master\").click();");
    // wait until submit button
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "(//button[@class='btn btn-block submit_mpagoCardSavedForm checkout-next'])[1]" }, "10",
      "disabled");
    // click on submit button
    clickOnElement(
      new String[] { XPATH, "(//button[@class=\"btn btn-block submit_mpagoCardSavedForm checkout-next\"])[1]" });
    // start if statement for sucess message
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" })) {
      // add aseertion on successful  message
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }));
      // print in result
      printResults("PrintNote", "\"Payment is successfull\"");
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
  public void Verify_behavior_in_Billing_Address_for_TJ_CreditCTwoThreezeroEight() {
    javascriptExecution("lambda-name=Verify behavior in Billing Address for TJ CreditCTwoThreezeroEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
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
    // click on accept terms and condition checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // Fill address details
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
    // Write text in address line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "7867876788");
    // wait
    waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
      "disabled");
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));
    // Click on Other direction address
    javascriptExecution(
      "document.querySelector(\"form#mpago_credit div.address-selector.billing-address-selector > div:nth-child(2) > label\").click();");
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
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=BeautyEsika");
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
    // click on accept terms and condition checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // click on continue button
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
    // Fill address details
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
    // Write text in address line1
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
      "7867876788");
    // wait
    waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
      "disabled");
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
    // Add assertion for Credit card
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" }));
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Assertion on Payment Address
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[contains(text(),\'Dirección de pago\')])[1]" }));
    // Assertion on same shipping address is available
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "(//div[@class=\"multiSteps-widget shipping-address\"])[2]" }));
    // Assertion on other address form is available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@id=\"billingAddressForm\"])[1]" }));
    // Click on Other direction address
    javascriptExecution(
      "document.querySelector(\"form#mpago_credit div.address-selector.billing-address-selector > div:nth-child(2) > label\").click();");
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
  public void Check_card_criteriaCTwoTwoEightTwo() {
    javascriptExecution("lambda-name=Check card criteriaCTwoTwoEightTwo");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on hemberger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[1]" })) {
      // click on second product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on go pay continue
      clickOnElement(new String[] { CSS,
        "button[id=\"checkout-display-continueCheckout\"][class=\"checkout-display-continueCheckout btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\"]" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on continue
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Select Option from department
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
      // Select Option from province
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
      // Select Option from district
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
      // Write text in address
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "New Colony 123");
      // Write text in phone
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
      // Click on continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Validate Case 1 Criteria
      printResults("PrintNote", "\'Invalid card number\' is displayed\'");
      // Wrire text in  wrong name of owner
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "photon");
      // Wrire text in  wrong card number
      typeText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[2]" }, "987654323456");
      // Validate Case 2 Criteria
      printResults("PrintNote", "\'\'The code security must have 3 numbers\"");
      // Wrire text in  wrong name of owner
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "test123");
      // Wrire text in  wrong card number
      typeText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[2]" }, "516003");
      // Wrire text in expiry month
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationMonth\'])[2]" }, "11");
      // Wrire text in expiry year
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[2]" }, "2025");
      // Wrire text in  wrong CVV
      typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[2]" }, "11");
      // Validate Case  3 Criteria
      printResults("PrintNote", "\"Valid data\"");
      // Giving right  text in name of owner
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
      // Wrire text in card number
      typeText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[2]" }, "5160033004714834");
      // select option from  expiry month
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationMonth\'])[2]" }, "11");
      // select option from  expiry year
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[2]" }, "2025");
      // Wrire text in CVV
      typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[2]" }, "123");
      // End If Statement
    }
    // Start Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void HYBRISVOneOneSixThreeNineFour__PEDelivery_InformationGuestReturn_from_StepTwo() {
    javascriptExecution("lambda-name=HYBRISVOneOneSixThreeNineFour  PEDelivery InformationGuestReturn from StepTwo");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // Wait
    waitForTime(3);
    // Add product to cart
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // Validation on Delivery Information
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"title deliveryAddress\"]" }));
    // Scroll
    scroll("ScrollDown", 1009);
    // Validation on continue button is disabled
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\"addressSubmit\"]" }));
    // Select department from dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "AMAZONAS");
    // Select region from dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "BAGUA");
    // Select district from dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "ARAMANGO");
    // Enter direction
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "west side");
    // Enter address2
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "lane no 14");
    // Enter phone number
    typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "12345678");
    // Validation on continue button is enabled
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\"addressSubmit\"]" }));
    // Click on Continue button
    clickOnElement(new String[] { XPATH, "//button[@id=\"addressSubmit\"]" });

    status = "passed";
  }

  @Test
  public void Verify_criteria_in_Pending_Payment_in_new_checkoutCTwoThreezeroFour() {
    javascriptExecution("lambda-name=Verify criteria in Pending Payment in new checkoutCTwoThreezeroFour");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to  Ecom URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // add product and proceed to checkout
    // WAIT for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on second product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on guest agreeToReceive publicity
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.agreeToReceivePublicity\"]" });
    // clcik on guest terms and condition check box
    clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
    // select option from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // select option from province drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // select option from district drop down
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // write text in direction
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Felipe Pardo y Aliaga");
    // write text in phone number text field
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // click on address submit  Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Click on credit card
    clickOnElement(new String[] { XPATH, "//label[@for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']" });
    // write  text in name of owner
    typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[1]" }, "CONT");
    // Wrire text in card number
    typeText(new String[] { XPATH, "(//input[@placeholder=\'Número de la tarjeta*\'])[1]" }, "5031755734530604");
    // select option from  expiry month
    selectOption(new String[] { XPATH, "(//select[@id=\'expirationMonth\'])[1]" }, "11");
    // select option from  expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\'expirationYear\'])[1]" }, "2025");
    // Wrire text in CVV
    typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[1]" }, "123");
    // click on \"I accept terms\"
    javascriptExecution("document.querySelector(\"input[id=\'Terms1_mpagoCreditCardForm\']\").click();");
    // Click on \"I accept terms and conditions\"
    javascriptExecution(
      "document.querySelector(\"input[id=\'agreeToReceiveWhatsappNotificationsCheck_mpagoCreditCardForm\']\").click();");
    // Wait until pay button is clickable
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "(//button[@class='btn btn-block submit_mpagoForm checkout-next'])[1]" }, "10", "ten");
    // click on  pay button
    clickOnElement(new String[] { XPATH, "(//button[@class=\'btn btn-block submit_mpagoForm checkout-next\'])[1]" });
    // Start If Statement
    if (checkCurrentUrlContains("orderConfirmation")) {
      // Add assertion for Order confirmation Page
      Assert.assertTrue(checkCurrentUrlContains("orderConfirmation"));
      // End  If Statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//span[@class=\'item-value\'])[1]" })) {
      // Validate status \"pending\"
      Assert.assertTrue(getText(new String[] { XPATH, "(//span[@class=\'item-value\'])[1]" }).contains("EN PROCESO"));
      // End If Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_layout_Step_Two_Payment_with_TJ_Credit__New_CheckoutCTwoTwoEightNine() {
    javascriptExecution("lambda-name=Verify layout Step Two Payment with TJ Credit  New CheckoutCTwoTwoEightNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit.radiompago_debitPE" },
      "logs/Screenshots/oHHDzN.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditPE > label\").click();");
    // wait until page loads saved cards
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//form[@id='mpago_card_saved']/div)[1]" }, "10",
      "disabled");
    // take a snip to verify The order of the cards
    takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
      "logs/Screenshots/dECFxn.png");
    // start if statement
    if (isElementAvailable(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" })) {
      // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
      Assert.assertTrue(
        getText(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" }).contains(
          "Para dividir el pago en cuotas deberás coordinarlo directamente con tu banco."));
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote",
        "\"To divide the payment into installments, you must coordinate it directly with your bank. not present\"");
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
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait until debit card text field
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "100",
      "disabled");
    // take a snip to verify debit card radio button is pre selected
    takeScreenshotOfParticularElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_debit.radiompago_debitPE" },
      "logs/Screenshots/tGTfHs.png");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditPE > label\").click();");
    // wait until page loads saved cards
    waitUntil("CheckVisibleElement",
      new String[] { XPATH, "form#mpago_card_saved div.payment-installments-outer > div" }, "10", "disabled");
    // take a snip to verify The order of the cards
    takeScreenshotOfParticularElement(new String[] { XPATH, "(//form[@id=\"mpago_card_saved\"]/div)[1]" },
      "logs/Screenshots/hceFaZ.png");
    // start if statement for To divide the payment into installments, you must coordinate it directly with your bank.
    if (isElementAvailable(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" })) {
      // add assertion for To divide the payment into installments, you must coordinate it directly with your bank.
      Assert.assertTrue(
        getText(new String[] { CSS, "form#mpago_card_saved div.payment-installments-outer > div" }).contains(
          "Para dividir el pago en cuotas deberás coordinarlo directamente con tu banco."));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"To divide the payment into installments, you must coordinate it directly with your bank. is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Verify_behavior_of_old_Checkout_CTwoThreezeroOne() {
    javascriptExecution("lambda-name=Verify behavior of old Checkout CTwoThreezeroOne");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To Ecom  URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
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
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_9496384@testuser.com");
    // Write text in  password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest8016");
    // Click on Log in
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Continue Button is present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // Print in console
      printResults("PrintNote", "\"New checkout is Displayed\"");
      // End of If Loop
    }
    // Start Else Statement
    else {
      // Add new card is Present
      if (isDisplayed(new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, 0)) {
        // click on add new card
        javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
        // wait until debit card text field
        waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10",
          "disabled");
        // Validate Payment Option
        Assert.assertTrue(getText(new String[] { XPATH, "//div[text()=\'Método de pago\']" }).contains("de pago"));
        // write text in card name
        typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "CONT");
        // write text in card number
        typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160033004714834");
        // select option from month drop down
        selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
        // select option from year drop down
        selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
        // write text in CVV
        typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
        // write text in doc number
        typeText(new String[] { CSS, "input#docNumberDebit" }, "12345678");
        // click on card terms and condition checkbox
        javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
        // Explicit wait  Submit Button Clickable
        waitUntil("CheckClickableElement",
          new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }, "10", "disabled");
        // Click on submit button
        clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
        // Validate Pending Message
        Assert.assertTrue(
          getText(new String[] { CSS, "div > div.checkout-success" }).contains("Tu transacción está pendiente"));
        // End of If Loop
      }
      // End Else Statement
    }
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To consultant URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe?consultantUrl=pruebitas");
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
    // Continue Button is present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // Print in Console
      printResults("PrintNote", "\"New checkout is Displayed\"");
      // End of If Loop
    }
    // Start Else Statement
    else {
      // wait
      waitUntil("CheckVisibleElement", new String[] { CSS, "div#mpagoDebitCardDiv a#add-new-card" }, "10", "disabled");
      // click on add new card
      javascriptExecution("document.querySelector(\"div#mpagoDebitCardDiv a#add-new-card\").click();");
      // wait until debit card text field
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "100",
        "disabled");
      // Validate Payment Option
      Assert.assertTrue(getText(new String[] { XPATH, "//div[text()=\'Método de pago\']" }).contains("de pago"));
      // write text in card name
      typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "CONT");
      // write text in card number
      typeText(new String[] { CSS, "input#cardNumberDebit" }, "5160 0330 0471 4834");
      // select option from month drop down
      selectOption(new String[] { CSS, "form#mpago_debit select#expirationMonth" }, "11");
      // select option from year drop down
      selectOption(new String[] { CSS, "form#mpago_debit select#expirationYear" }, "2025");
      // write text in CVV
      typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
      // click on card terms and condition checkbox
      javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
      // wait until submit button
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }, "10", "disabled");
      // click on submit button
      clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
      // start if statement for Pending message
      if (isDisplayed(new String[] { CSS, "div > div.checkout-success" }, 0)) {
        // add aseertion for pending message
        Assert.assertTrue(
          getText(new String[] { CSS, "div > div.checkout-success" }).contains("Tu transacción está pendiente"));
        // end if
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote",
          "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
        // End Else
      }
      // End Else Statement
    }

    status = "passed";
  }
}