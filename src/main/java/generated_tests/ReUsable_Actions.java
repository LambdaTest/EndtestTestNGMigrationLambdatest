package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReUsable_Actions extends WebDriverHelper {

  @Test
  public void Mail_Validation_Gmail_User_ecescTwomtofbgmailcom() {
    javascriptExecution("lambda-name=Mail Validation Gmail User ecescTwomtofbgmailcom");

    // Open New Tab
    openNewTab("OpenNewTab");
    pageRefresh();
    // Go To URL
    getURL("https://www.mailinator.com/");
    // if search  present
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'search\']" })) {
      // Write Text In search bar text field
      typeText(new String[] { XPATH, "//input[@id=\'search\']" }, "ec.esc2.mto.fb@gmail.com");
      // Press Enter Key
      pressKey(new String[] { XPATH, "//input[@id=\'search\']" }, "//input[@id=\'search\']");
      // end if  search present
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"search bar is not present\"");
      // end else statement
    }
    // wait until order email
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[contains(text(),'just now')]" }, "60", "ten");
    // start if statement for mail
    if (isDisplayed(new String[] { XPATH, "//div[contains(text(),\'just now\')]" }, 0)) {
      // click  on first email
      clickOnElement(new String[] { XPATH, "(//tr[@ng-repeat=\"email in emails\"])[1]" });
      // take a screen shot for mail validation
      takeScreenshot("logs/Screenshoots/sISkNe.png");
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
  public void Ec_mto_Guest_user_login_as_Facebook_mail_details() {
    javascriptExecution("lambda-name=Ec mto Guest user login as Facebook mail details");

    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "ec.esc2.mto.fb@gmail.com");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on seconde checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Ec__Mto__click_here_to_continue_button() {
    javascriptExecution("lambda-name=Ec  Mto  click here to continue button");

    // if condition for \" click here to continue button\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
      // if condition for \"  click here to continue button\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
        // click on \" click here to continue button\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
        // end if for \" click here to continue button\" clickable
      }
      // Else statement \" click here to continue button\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "click here to continue button is not clickable");
        // end else \" click here to continue button\" clickable
      }
      // end if for  \"go pay\" present
    }
    // else statement   \" click here to continue button\" present
    else {
      // print message
      printResults("PrintNote", "click here to continue button is not present");
      // end else statement  \" click here to continue button\" present
    }

    status = "passed";
  }

  @Test
  public void URL__Peru__Ecom() {
    javascriptExecution("lambda-name=URL  Peru  Ecom");

    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");

    status = "passed";
  }

  @Test
  public void Ec__Mto_cart_continue_shopping_button() {
    javascriptExecution("lambda-name=Ec  Mto cart continue shopping button");

    // if condition for \"continue shopping\" present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" })) {
      // if condition for \"continue shopping\" clickable
      if (isElementClickable(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" })) {
        // click on \"continue shopping\" button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" });
        // end if for \"continue shopping\" clickable
      }
      // Else statement \"continue shopping\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "continue shopping is not clickable");
        // end else \"continue shopping\" clickable
      }
      // end if for  \"continue shopping\" present
    }
    // else statement   \"continue shopping\" present
    else {
      // print message
      printResults("PrintNote", "continue shopping is not present");
      // end else statement  \"continue shopping\" present
    }

    status = "passed";
  }

  @Test
  public void Mx_mto_credit_cart_detailspaleta() {
    javascriptExecution("lambda-name=Mx mto credit cart detailspaleta");

    // if for payment options
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment options
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "mpago_credit");
      // wait untill card number
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='cardNumber']" }, "10", "disabled");
      // write card number
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4509953566233704");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
      // write card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // Write security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if submit button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" })) {
        // click on submit button
        clickOnElement(
          new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" });
        // end if submit button clickable
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"submit button is not clickable\"");
        // end else statement
      }
      // end if payment method
    }
    // else payment method
    else {
      // Print message
      printResults("PrintNote", "Payment page is not present");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Ec_mto_final_order_page_actions() {
    javascriptExecution("lambda-name=Ec mto final order page actions");

    // if for terms1 present
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']" })) {
      // click on terms1 checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
      // if \"finalize your purchase\" button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" })) {
        // Add assertion for \"finalize your purchase\"
        Assert.assertTrue(
          isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" }));
        // click on \"finalize your purchase\" button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" });
        // Add Assertion For successful purchase message
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
        // end if \"finalize your purchase\" button clickable
      }
      // else  \"finalize your purchase\" button clickable
      else {
        // print message
        printResults("PrintNote", "finalize your purchase button is not clickable");
        // end else  \"finalize your purchase\" button clickable
      }
      // end if for terms1 present
    }
    // else if for terms1 present
    else {
      // print message
      printResults("PrintNote", "terms1 checkbox is not present");
      // end else for terms1 present
    }

    status = "passed";
  }

  @Test
  public void Add_first_product_from_esika_and_proceed_upto_checkoutCL_mobile() {
    javascriptExecution("lambda-name=Add first product from esika and proceed upto checkoutCL mobile");

    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
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
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
    // start if statement
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // popup close
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // End if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
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
    // Write text in guest firstName
    typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
    // Write text in guest lastName
    typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "test");
    // write text in email text field
    typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "photontest@endtest-mail.io");
    // Click on Continue as guest Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });

    status = "passed";
  }

  @Test
  public void New_checkout_credit_card_detailsMX_PENDING_PAYMENT() {
    javascriptExecution("lambda-name=New checkout credit card detailsMX PENDING PAYMENT");

    // wait for credit card
    waitUntil("CheckClickableElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" },
      "10", "disabled");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // start if statement for card holder name
    if (isElementClickable(new String[] { CSS, "form#mpago_credit input#cardholderName" })) {
      // wait for card holder name
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_credit input#cardholderName" }, "10",
        "disabled");
      // write cardholder name
      typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "CONT");
      // write card number
      typeText(new String[] { CSS, "input#cardNumber" }, "4075595716483764");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
      // write CVV number
      typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
      // click on terms and condition
      clickOnElement(new String[] { CSS, "input#Terms1_mpagoCreditCardForm" });
      // wait for pay button
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']" }, "10",
        "disabled");
      // click on pay button
      clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
      // endif statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"credit card data is not proper\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void New_checkoutGuest_user_loginMX_duplicate() {
    javascriptExecution("lambda-name=New checkoutGuest user loginMX duplicate");

    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "test");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "photontest@endtest-mail.io");
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // start statement
    else {
      // print message
      printResults("PrintNote", "guest user login page is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void PE_Pending_Payment_in_new_checkout_Debit_card_details_mobile() {
    javascriptExecution("lambda-name=PE Pending Payment in new checkout Debit card details mobile");

    // if add new card present
    if (isElementAvailable(new String[] { CSS, "a#add-new-card" })) {
      // click on add new card
      clickOnElement(new String[] { CSS, "a#add-new-card" });
      // wait until debit card text field
      waitUntil("CheckVisibleElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
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
      // write text in doc number
      typeText(new String[] { CSS, "input#docNumberDebit" }, "12345678");
      // click on card terms and condition checkbox
      javascriptExecution("document.querySelector(\"input#Terms1_mpagoDebitCardForm\").click();");
      // wait until submit button clickeble
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }, "10", "disabled");
      // Add assertion for submit button
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" }));
      // click on submit button
      clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button" });
      // end if add new debit card
    }
    // Start else
    else {
      // Print Result
      printResults("PrintNote", "\"add new card is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Login_as_fb_user() {
    javascriptExecution("lambda-name=Login as fb user");

    // Click on Ingresar con Fa...
    clickOnElement(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]" });
    // switch to child window
    switchToNextWindow();
    // Write text in email
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Write text in pass
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
    // Click on Login button for facebook
    clickOnElement(new String[] { ID, "loginbutton" });
    // switch to parent window
    switchToPreviousTab();
    // Wait
    waitForTime(6);

    status = "passed";
  }

  @Test
  public void New_checkoutGuest_user_loginMX() {
    javascriptExecution("lambda-name=New checkoutGuest user loginMX");

    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "photon");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "test");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "photontest@endtest-mail.io");
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // start statement
    else {
      // print message
      printResults("PrintNote", "guest user login page is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void guest_user_login_details_NEWperu() {
    javascriptExecution("lambda-name=guest user login details NEWperu");

    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // click on guest belcorp T&c checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-08");
    // Select Option from COMMUNE
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "08-CARAVELI");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "CARAVELI-BELLA UNION");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "church street");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });

    status = "passed";
  }

  @Test
  public void Add_first_product_from_LBEL_and_proceed_upto_checkoutmobile_Using_loginFREE_PRODUCT() {
    javascriptExecution(
      "lambda-name=Add first product from LBEL and proceed upto checkoutmobile Using loginFREE PRODUCT");

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
    clickOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
    // Click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
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
    // increase product qty
    pressKey(new String[] { XPATH, "//input[@id=\"quantity_0\"]" }, "//input[@id=\"quantity_0\"]");
    // write text in qty field
    typeText(new String[] { XPATH, "//input[@id=\"quantity_0\"]" }, "5");
    // press enter key
    pressKey(new String[] { XPATH, "//input[@id=\"quantity_0\"]" }, "//input[@id=\"quantity_0\"]");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });
    // wait until continue button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");

    status = "passed";
  }

  @Test
  public void Add_first_product_from_esika_and_proceed_upto_checkoutPE_mobile_Using_login() {
    javascriptExecution("lambda-name=Add first product from esika and proceed upto checkoutPE mobile Using login");

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
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//button[@id=\"checkout-display-continueCheckout\"]" });

    status = "passed";
  }

  @Test
  public void mx_mto_Guest_user_login_detailspaleta() {
    javascriptExecution("lambda-name=mx mto Guest user login detailspaleta");

    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Guest_user_detailschili_New_checkout() {
    javascriptExecution("lambda-name=Guest user detailschili New checkout");

    // if first name present
    if (isElementAvailable(new String[] { ID, "guest.firstName" })) {
      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // if terms present
      if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" })) {
        // click on terms2
        clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
        // end if terms2 present
      }
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // end if first name present
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"guest first name textbox not resent\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void URL_PeruMTO() {
    javascriptExecution("lambda-name=URL PeruMTO");

    // URL Peru-MTO
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");

    status = "passed";
  }

  @Test
  public void guest_user_login_details_NEWEC_MTO() {
    javascriptExecution("lambda-name=guest user login details NEWEC MTO");

    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // click on guest belcorp T&c checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // start if
    if (isElementAvailable(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" });
      // end if
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"consultant go pay page not found\"");
      // end else
    }
    // write text in address document
    typeText(new String[] { XPATH, "//input[@id=\"address.documentNumber\"]" }, "1234567890");
    // write text in adress billing name
    typeText(new String[] { XPATH, "//input[@id=\"address.billingName\"]" }, "billie elish");
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "CARCHI");
    // Select Option from COMMUNE
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "BOLIVAR");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "BOLIVAR");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "church street");
    // write text in adress street name
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "edin berg");
    // write text in adress number
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "n70-306");
    // write text in address 2nd steet name
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "johan berg");
    // write text in adress neighbourhood
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "simpson");
    // write text in adress referernce
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "banfield");
    // WRITE TEXT IN MOBILE NUMBER
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//button[@id='deliveryMethodSubmit']" }, "10", "disabled");
    // Click on delivery Method Submit
    clickOnElement(new String[] { XPATH, "//button[@id=\"deliveryMethodSubmit\"]" });

    status = "passed";
  }

  @Test
  public void URL__Chile__Ecom() {
    javascriptExecution("lambda-name=URL  Chile  Ecom");

    // Enter URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/");

    status = "passed";
  }

  @Test
  public void New_checkoutRegistered_userMX() {
    javascriptExecution("lambda-name=New checkoutRegistered userMX");

    // wait for address submit button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "20", "disabled");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // click on address submit button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // end if statment
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"shipping address page not loaded properly\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void PERU_Shipping_Address_Details_New_Checkout_COD__For_MTO_Ask_For_Gift() {
    javascriptExecution("lambda-name=PERU Shipping Address Details New Checkout COD  For MTO Ask For Gift");

    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-06");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "06-LIMA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "LIMA-LIMA");
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
    // Write Character and number with Special Character in From Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Odish1@");
    // Validate Error Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'address.from-error\']" }));
    // Clear input
    clearText(new String[] { XPATH, "//input[@id=\'address.from\']" });
    // Write text in From Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Odisha");
    // Write Character and number with Special Character in For Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Soumya12*");
    // Validate Error Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'address.to-error\']" }));
    // Clear input From For Textbox
    clearText(new String[] { XPATH, "//input[@id=\'address.to\']" });
    // Write Text in For Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Vishal");
    // Write Character and number with Special Character in Person To giveaway  Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "Vishal1@");
    // Validate Error Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'address.completeNameTo-error\']" }));
    // Clear input
    clearText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" });
    // Write Text In Person to Give away textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "vishal das");
    // Validate Gift Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'gift-checkout-base-store-message\']" }));
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });

    status = "passed";
  }

  @Test
  public void User_loginGeneric() {
    javascriptExecution("lambda-name=User loginGeneric");

    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Click on username
    clickOnElement(new String[] { ID, "j_username" });
    // Write text in password
    typeText(new String[] { ID, "j_password" }, "Photon@7980163882");
    // Write text in username
    typeText(new String[] { ID, "j_username" }, "sairam@endtest-mail.io");
    // Click on login
    clickOnElement(new String[] { CSS, "form#loginForm > button" });

    status = "passed";
  }

  @Test
  public void guest_user_detailsmexico() {
    javascriptExecution("lambda-name=guest user detailsmexico");

    // Wait
    waitUntil("CheckElement", new String[] { ID, "guest.firstName" }, "15", "disabled");
    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { ID, "address.postalCode" }, "10", "disabled");
    // start else
else{
      // print in result
      printResults("PrintNote", "\"Click on go pay button not present\"");
      // end else statement
    }
    // Write text in address postal code
    typeText(new String[] { ID, "address.postalCode" }, "44600");
    // Select Option from REGION
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "SANTA TERESITA");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "church street");
    // write Text in address line 2
    typeText(new String[] { ID, "address.line2" }, "n70-306");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "7876586476");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // start if statement
    if (isElementAvailable(new String[] { ID, "deliveryMethodSubmit" })) {
      // Click on delivery Method Submit
      clickOnElement(new String[] { ID, "deliveryMethodSubmit" });
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End else statment
    }

    status = "passed";
  }

  @Test
  public void Add_first_product_from_esika_and_proceed_upto_checkoutPE_mobile_MTO() {
    javascriptExecution("lambda-name=Add first product from esika and proceed upto checkoutPE mobile MTO");

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

    status = "passed";
  }

  @Test
  public void eclog_in_with_FB_UsercashPayment() {
    javascriptExecution("lambda-name=eclog in with FB UsercashPayment");

    // enter document type
    selectOption(new String[] { XPATH, "//select[@id=\"address.documentType\"]" }, "RUC");
    // enter ruc number
    typeText(new String[] { XPATH, "//input[@id=\"address.documentNumber\"]" }, "1234567891234");
    // enter billing name
    typeText(new String[] { XPATH, "//input[@id=\"address.billingName\"]" }, "patil");
    // dropdown1
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LOJA");
    // dropdown2
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LOJA");
    // sector
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LOJA");
    // write text in address.line1
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "a");
    // write text in address.line2
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "b");
    // street name
    typeText(new String[] { XPATH, "//input[@id=\"address.secondaryStreetName\"]" }, "asdfgh");
    // neighborhood
    typeText(new String[] { XPATH, "//input[@id=\"address.neighborhood\"]" }, "asdfghj");
    // address.referencia
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "c");
    // enter telephone number
    typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "123456");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@id=\"addressSubmit\"]" });
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@id=\"deliveryMethodSubmit\"]" });
    // select payment method
    selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "PAGO EN AGENTES");
    // cash option
    selectOption(new String[] { XPATH, "//select[@id=\"belpayDocTypeCash\"]" }, "RUC");
    // ruc number
    typeText(new String[] { XPATH, "//input[@id=\"belpayDocNumberCash\"]" }, "1234567891234");
    // Click on Continue
    clickOnElement(new String[] { XPATH,
      "//button[@class=\"btn btn-magenta btn-primary btn-block submit_belpayCashForm checkout-next\"]" });
    // Click on checkbox1
    clickOnElement(new String[] { XPATH, "//input[@id=\"Terms1\"]" });
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@type=\"submit\"]" });

    status = "passed";
  }

  @Test
  public void Add_first_product_from_LBEL_and_proceed_upto_checkoutPE_mobile_Using_loginMTO() {
    javascriptExecution("lambda-name=Add first product from LBEL and proceed upto checkoutPE mobile Using loginMTO");

    // wait until hamburgur menu clickeble
    waitUntil("CheckClickableElement", new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" },
      "10", "disabled");
    // click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // wait until login
    waitUntil("CheckClickableElement", new String[] { CSS, "li.auto.liUserSign > a > p > span" }, "10", "disabled");
    // click on login
    clickOnElement(new String[] { CSS, "li.auto.liUserSign > a > p > span" });
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

    status = "passed";
  }

  @Test
  public void Registered_user_details___Peru() {
    javascriptExecution("lambda-name=Registered user details   Peru");

    // Write text in guest first Name
    typeText(new String[] { ID, "guest.firstName" }, "belcorp");
    // Write text in guest last Name
    typeText(new String[] { ID, "guest.lastName" }, "registered");
    // Write text in guest email
    typeText(new String[] { ID, "guest.email" }, "belcorpregisteredtestuser@endtest-mail.io");
    // Click on guest agree To Receive
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on guest agree
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Click on Continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });

    status = "passed";
  }

  @Test
  public void New_checkout_credit_card_detailsMX() {
    javascriptExecution("lambda-name=New checkout credit card detailsMX");

    // wait for credit card
    waitUntil("CheckClickableElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" },
      "10", "disabled");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // start if statement for card holder name
    if (isElementClickable(new String[] { CSS, "form#mpago_credit input#cardholderName" })) {
      // wait for card holder name
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_credit input#cardholderName" }, "10",
        "disabled");
      // write cardholder name
      typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "APRO");
      // write card number
      typeText(new String[] { CSS, "input#cardNumber" }, "4075595716483764");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
      // write CVV number
      typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
      // click on terms and condition
      clickOnElement(new String[] { CSS, "input#Terms1_mpagoCreditCardForm" });
      // wait for pay button
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']" }, "10",
        "disabled");
      // click on pay button
      clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
      // endif statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"credit card data is not proper\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void if__else_loop_for_free_shipping() {
    javascriptExecution("lambda-name=if  else loop for free shipping");

    // start if statement for free delivery eligible?
    if (checkContainsValue(
      new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" },
      "¡Felicitaciones, alcanzaste el envío gratis!")) {
      // end if
    }
    // start else to increase the qty
    else {
      // click on add button in qty selector
      clickOnElement(
        new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)" });
      // end else
    }

    status = "passed";
  }

  @Test
  public void Add_first_product_proceed_upto_checkoutPE_mobile_COD_duplicate() {
    javascriptExecution("lambda-name=Add first product proceed upto checkoutPE mobile COD duplicate");

    // Click on Add New Address Button
    clickOnElement(new String[] { XPATH, "//a[@id=\'checkout-add-new-address\']" });
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

    status = "passed";
  }

  @Test
  public void Ec_mto_Guest_user_login_details() {
    javascriptExecution("lambda-name=Ec mto Guest user login details");

    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on seconde checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void New_Checkout_using_Agency_COLOMBIA() {
    javascriptExecution("lambda-name=New Checkout using Agency COLOMBIA");

    // Wait
    waitUntil("CheckVisibleElement", new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label" },
      "10", "disabled");
    // Click on Payment in Agents section
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label\").click();");
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "input#docNumberCash" }, "5", "disabled");
    // WriteText in Document number
    typeText(new String[] { CSS, "input#docNumberCash" }, "1234567890");
    // scroll
    scrollIntoElementView(new String[] { CSS, "input#Terms1_mpagoCashForm" });
    // Click on T&C chec
    javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();");
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoCashForm checkout-next']" }, "6", "disabled");
    // Click on Pay Button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoCashForm checkout-next\']" });

    status = "passed";
  }

  @Test
  public void Add_address_details_PERUregistered_user() {
    javascriptExecution("lambda-name=Add address details PERUregistered user");

    // start if for go pay button
    if (isElementAvailable(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" });
      // end if
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"consultant go pay page not found\"");
      // end else
    }
    // Start if statement for saved address
    if (isElementAvailable(
      new String[] { CSS, "div#deliveryAddressesSelector > div.address-selector.delivery-address-selector" })) {
      // click on address submit
      clickOnElement(new String[] { CSS, "button#addressSubmit" });
      // end if statement
    }
    // start else statement
    else {
      // click on add new address
      clickOnElement(new String[] { CSS, "a#checkout-add-new-address" });
      // Select Option from REGION
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "PE-DEP-21");
      // wait for select drop down clickeble
      waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIsoParent1']" }, "10",
        "disabled");
      // Select Option from COMMUNE
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "21-SAN ROMAN");
      // wait until drop down clickeble
      waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIso']" }, "10", "disabled");
      // Select Option from location
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "SAN ROMAN-CABANA");
      // Write text in STREET AND NUMBER
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "Aliaga Felipe Pardo");
      // Click on addressSubmit
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // end else
    }

    status = "passed";
  }

  @Test
  public void Add_product_from_esika_and_proceed_to_checkoutPE_desktop() {
    javascriptExecution("lambda-name=Add product from esika and proceed to checkoutPE desktop");

    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // click on cuidado personal
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'cuidado personal\')]" });
    // click on first product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
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

    status = "passed";
  }

  @Test
  public void New_checkout_credit_card_detailsCO_PENDING_PAYMENT() {
    javascriptExecution("lambda-name=New checkout credit card detailsCO PENDING PAYMENT");

    // wait for credit card
    waitUntil("CheckClickableElement", new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label" },
      "10", "disabled");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
    // start if statement for card holder name
    if (isElementClickable(new String[] { CSS, "form#mpago_credit input#cardholderName" })) {
      // wait for card holder name
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_credit input#cardholderName" }, "10",
        "disabled");
      // write cardholder name
      typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "CONT");
      // write card number
      typeText(new String[] { CSS, "input#cardNumber" }, "4013540682746260");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
      // write CVV number
      typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
      // write text in document number
      typeText(new String[] { CSS, "input#docNumber" }, "1234567890");
      // click on terms and condition
      clickOnElement(new String[] { CSS, "input#Terms1_mpagoCreditCardForm" });
      // wait for pay button
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']" }, "10",
        "disabled");
      // click on pay button
      clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
      // endif statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"credit card data is not proper\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void guest_user_loginPanama() {
    javascriptExecution("lambda-name=guest user loginPanama");

    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Consultant gopay page not found\"");
      // end else statement
    }
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "000003");
    // Select Option from department
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "000003000003");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "000003000003000005");
    // write text in address district
    typeText(new String[] { ID, "address.district" }, "Symentry");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "churchil street");
    // write text in address. referencia
    typeText(new String[] { ID, "address.referencia" }, "hilton road");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // Click on delivery Method Submit
    clickOnElement(new String[] { ID, "deliveryMethodSubmit" });

    status = "passed";
  }

  @Test
  public void Guest_User_Login_detailsPeru() {
    javascriptExecution("lambda-name=Guest User Login detailsPeru");

    // Write text in first Name
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in  last Name
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in email
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on agree to receive checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on t&c privacy policy checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Click on Continue as guest button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Add Assertion for Dirección de En...
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Dirección de Envío\"]" }));
    // Select Option from Department dropdown
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-21");
    // Select Option from province dropdown
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "21-SAN ROMAN");
    // Select Option from district dropdown
    selectOption(new String[] { ID, "address.regionIso" }, "SAN ROMAN-CABANA");
    // Write text in address line1
    typeText(new String[] { ID, "address.line1" }, "delhi");
    // Write text in address phone
    typeText(new String[] { ID, "address.phone" }, "7895346784");
    // Click on CLICK here to continue button
    clickOnElement(new String[] { ID, "addressSubmit" });
    // Click on CLICK here to continue for delivery.
    clickOnElement(new String[] { ID, "deliveryMethodSubmit" });
    // Select Option from Payment method
    selectOption(new String[] { ID, "paymentOptions" }, "mpago_credit");
    // Click on cardNumber
    clickOnElement(new String[] { CSS,
      "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][id=\"cardNumber\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" });
    // Write text in cardNumber
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][id=\"cardNumber\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" },
      "4009175332806176");
    // Write text in docNumber
    typeText(new String[] { CSS, "form#mpago_credit > div:nth-of-type(5) > input" }, "12345678");
    // Select Option from Year Dropdown
    selectOption(
      new String[] { CSS, "form#mpago_credit > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(2) > select" },
      "2025");
    // Select Option from Month Dropdown
    selectOption(
      new String[] { CSS, "form#mpago_credit > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" },
      "11");
    // Write text in cardholderName
    typeText(new String[] { CSS, "form#mpago_credit > div:nth-of-type(7) > input" }, "APRO");
    // Write text in securityCode
    typeText(new String[] { CSS, "form#mpago_credit > div:nth-of-type(9) > input" }, "123");
    // Click on CLICK  here to continue button 2
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Click on Terms1
    clickOnElement(new String[] { ID, "Terms1" });
    // Click on Finalize your purchase button
    clickOnElement(new String[] { ID, "placeOrder" });

    status = "passed";
  }

  @Test
  public void PERU_Guest_User_Login_Details() {
    javascriptExecution("lambda-name=PERU Guest User Login Details");

    // Write text in guest first Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
    // Write text in guest last Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in guest email
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Click on Agree To Receive Pubicity Checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
    // Click on  T&C checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
    // Click on Continue as Guest Button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });

    status = "passed";
  }

  @Test
  public void PA_checkout_with_Credit_Card_Address_Details() {
    javascriptExecution("lambda-name=PA checkout with Credit Card Address Details");

    // Select PROVINCE address
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PANAMA");
    // Select district address
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "PANAMA");
    // Select TOWNSHIP address
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "SAN FRANCISCO");
    // Write  NEIGHBORHOOD address
    typeText(new String[] { XPATH, "//input[@id=\"address.district\"]" }, "apilo jas");
    // Write ADDRESS (STREET AND NUMBER)
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "14,west side");
    // Write REFERENCE
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "asdfghj");
    // Write telephone number
    typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "12345678");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@id=\"addressSubmit\"]" });
    // click on submit  button
    clickOnElement(new String[] { XPATH, "//button[@id=\"deliveryMethodSubmit\"]" });
    // Select credit card option for payment
    selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "1");
    // Write text in card  number
    typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" },
      "4013540682746260");
    // Write document number
    typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456789789");
    // Select expiry month
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
    // Select expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
    // Write card holder name
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
    // Write security code(cvv)
    typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
    // Click on Continue
    clickOnElement(
      new String[] { XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_belpayForm checkout-next\"])[1]" });
    // Click on checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"Terms1\"]" });
    // Click on place order button
    clickOnElement(new String[] { XPATH, "//button[@id=\"placeOrder\"]" });

    status = "passed";
  }

  @Test
  public void Reusable_Cash_On_Delivery_DetailsPeru() {
    javascriptExecution("lambda-name=Reusable Cash On Delivery DetailsPeru");

    // Select option from payment options
    selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "mpago_cash");
    // Click on CLICK here to continue button
    clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'CLICK AQUÍ PARA CONTINUAR\')])" });
    // Click on Terms1 check box
    clickOnElement(new String[] { XPATH, "//input[@type=\'checkbox\']" });
    // Click on place order button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Finalizar tu compra\')]" });

    status = "passed";
  }

  @Test
  public void Consultant_search_engine__LBEL_till_Select_Province_Option() {
    javascriptExecution("lambda-name=Consultant search engine  LBEL till Select Province Option");

    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
      // click on close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if statement
    }
    // start else statement
    else {
      // Print result
      printResults("PrintNote", "\"popup is not present\"");
      // end else
    }
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");

    status = "passed";
  }

  @Test
  public void PERU_New_Checkout_Using_Credit_Card_Registered_User() {
    javascriptExecution("lambda-name=PERU New Checkout Using Credit Card Registered User");

    // Click On Credit Card Section
    javascriptExecution(
      "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
    // Write Text In CVV Textbox
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCodeCardSaved-error\"]" },
      "123");
    // Cick On Terms1 Checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_MPagoCardSavedForm_mpago_visa\']" });
    // Cick On Pay Button
    clickOnElement(
      new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoCardSavedForm checkout-next\']" });

    status = "passed";
  }

  @Test
  public void guest_user_detailschili_ECOM() {
    javascriptExecution("lambda-name=guest user detailschili ECOM");

    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
    // Select Option from COMMUNE
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "churchil street");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });

    status = "passed";
  }

  @Test
  public void Add_first_product_from_esika_and_proceed_upto_checkoutPE_desktop() {
    javascriptExecution("lambda-name=Add first product from esika and proceed upto checkoutPE desktop");

    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Scroll Down
    scroll("ScrollDown", 796);
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a" });
    // Click on click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // click on gopay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
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

    status = "passed";
  }

  @Test
  public void Ec__Mto__go_pay_button() {
    javascriptExecution("lambda-name=Ec  Mto  go pay button");

    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
      // if condition for \"go pay\" clickable
      if (isElementClickable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
        // click on \"go pay\" button
        clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
        // end if for \"go pay\" clickable
      }
      // Else statement \"go pay\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "go pay is not clickable");
        // end else \"go pay\" clickable
      }
      // end if for  \"go pay\" present
    }
    // else statement   \"go pay\" present
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }

    status = "passed";
  }

  @Test
  public void guest_user_login_details_NEWperu_ECOM() {
    javascriptExecution("lambda-name=guest user login details NEWperu ECOM");

    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // click on guest belcorp T&c checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // WAIT
    waitUntil("CheckVisibleElement", new String[] { ID, "address.regionIsoParent2" }, "10", "disabled");
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-08");
    // Select Option from COMMUNE
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "08-CARAVELI");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "CARAVELI-BELLA UNION");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "church street");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // Click on delivery Method Submit
    clickOnElement(new String[] { ID, "deliveryMethodSubmit" });

    status = "passed";
  }

  @Test
  public void Add_first_product_from_esika_and_proceed_upto_checkout_mobile() {
    javascriptExecution("lambda-name=Add first product from esika and proceed upto checkout mobile");

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

    status = "passed";
  }

  @Test
  public void Ec__Mto_add_to_cart_button() {
    javascriptExecution("lambda-name=Ec  Mto add to cart button");

    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Add assertion \"add to cart\" clickable
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }

    status = "passed";
  }

  @Test
  public void Cart_cleaning_COneEightzeroOneEightEight() {
    javascriptExecution("lambda-name=Cart cleaning COneEightzeroOneEightEight");

    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // click on cart
    clickOnElement(new String[] { XPATH, "//div[@id=\'header-nav-cart\']" });
    // if first product present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'item__info\']/div[@class=\'item__remove-action\']" })) {
      // click on delete first product
      clickOnElement(new String[] { XPATH, "//div[@class=\'item__info\']/div[@class=\'item__remove-action\']" });
      // end if first product present
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // if second product present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'item__info\']/div[@class=\'item__remove-action\']" })) {
      // Click on delete second product
      clickOnElement(new String[] { XPATH, "//div[@class=\'item__info\']/div[@class=\'item__remove-action\']" });
      // end if second product present
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"second product is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Peru_New_Checkout_Login_Using_Registered_User() {
    javascriptExecution("lambda-name=Peru New Checkout Login Using Registered User");

    // Write text in j_username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "test_user_86292523@testuser.com");
    // Write text in j_password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Qatest2042");
    // Click on Iniciar sesión
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(2) > form > button" });

    status = "passed";
  }

  @Test
  public void Pe_Mto_add_to_cart_button_for_paleta_variable_sets() {
    javascriptExecution("lambda-name=Pe Mto add to cart button for paleta variable sets");

    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
        // wait until
        waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5", "disabled");
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }

    status = "passed";
  }

  @Test
  public void guest_user_login_details_NEWEC_MTOregistered_user() {
    javascriptExecution("lambda-name=guest user login details NEWEC MTOregistered user");

    // start if
    if (isElementAvailable(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" });
      // end if
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"consultant go pay page not found\"");
      // end else
    }
    // write text in address document
    typeText(new String[] { XPATH, "//input[@id=\"address.documentNumber\"]" }, "1234567890");
    // write text in adress billing name
    typeText(new String[] { XPATH, "//input[@id=\"address.billingName\"]" }, "billie elish");
    // Select Option from REGION
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "CARCHI");
    // wait until clickable
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIsoParent1']" }, "10",
      "disabled");
    // Select Option from COMMUNE
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "BOLIVAR");
    // wait untill clickeble
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIso']" }, "10", "disabled");
    // Select Option from location
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "BOLIVAR");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "church street");
    // write text in adress street name
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "edin berg");
    // write text in adress number
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "n70-306");
    // write text in address 2nd steet name
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "johan berg");
    // write text in adress neighbourhood
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "simpson");
    // write text in adress referernce
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "banfield");
    // WRITE TEXT IN MOBILE NUMBER
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//button[@id='deliveryMethodSubmit']" }, "10", "disabled");
    // Click on delivery Method Submit
    clickOnElement(new String[] { XPATH, "//button[@id=\"deliveryMethodSubmit\"]" });

    status = "passed";
  }

  @Test
  public void cl_mto_secure_pay_shipping_address_details() {
    javascriptExecution("lambda-name=cl mto secure pay shipping address details");

    // if region
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" })) {
      // select region
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "CL-REG-02");
      // select commune
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "02-ANTOFAGASTA");
      // select location
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "ANTOFAGASTA-ANTOFAGASTA");
      // write text in street and number
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "12");
      // write text in house number
      typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "12");
      // write text in telephone
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "9876543210");
      // if  \"click here to continue\" button
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
        // click \"click here to continue\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
        // end if   \"click here to continue\" button
      }
      // else \"click here to continue\" button
      else {
        // print message
        printResults("PrintNote", "button is not clickable");
        // end else  \"click here to continue\" button
      }
      // end if region
    }
    // else region
    else {
      // print message
      printResults("PrintNote", "page is not available");
      // end else region
    }

    status = "passed";
  }

  @Test
  public void Reusable_wrong_registered_details() {
    javascriptExecution("lambda-name=Reusable wrong registered details");

    // wrong registered email
    typeText(new String[] { ID, "j_username" }, "cyzonapp11@gmail.com");
    // wrong registered password
    typeText(new String[] { ID, "j_password" }, "Abc@12345ab");
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });

    status = "passed";
  }

  @Test
  public void CLBSP_Consultant_Login() {
    javascriptExecution("lambda-name=CLBSP Consultant Login");

    // click On close Popup
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Click on  User Icon
    clickOnElement(new String[] { XPATH, "(//a[@class=\'cms-image-link\'])[1]" });
    // Write text in j_username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "test_user_85552041@testuser.com");
    // Write text in j_password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "9907250378Jh");
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[text() = \" Iniciar sesión\"]" });
    // Add Assertion For Hello Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));

    status = "passed";
  }

  @Test
  public void Add_first_product_from_LBEL_and_proceed_upto_checkoutPE_mobile_Using_loginNew_Testuser() {
    javascriptExecution(
      "lambda-name=Add first product from LBEL and proceed upto checkoutPE mobile Using loginNew Testuser");

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

    status = "passed";
  }

  @Test
  public void New_checkout_credit_card_detailsCO() {
    javascriptExecution("lambda-name=New checkout credit card detailsCO");

    // wait for credit card
    waitUntil("CheckClickableElement", new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label" },
      "10", "disabled");
    // click on credit card
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
    // start if statement for card holder name
    if (isElementClickable(new String[] { CSS, "form#mpago_credit input#cardholderName" })) {
      // wait for card holder name
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_credit input#cardholderName" }, "10",
        "disabled");
      // write cardholder name
      typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "APRO");
      // write card number
      typeText(new String[] { CSS, "input#cardNumber" }, "4013540682746260");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
      // write CVV number
      typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
      // write text in document number
      typeText(new String[] { CSS, "input#docNumber" }, "1234567890");
      // click on terms and condition
      clickOnElement(new String[] { CSS, "input#Terms1_mpagoCreditCardForm" });
      // wait for pay button
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']" }, "10",
        "disabled");
      // click on pay button
      clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
      // endif statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"credit card data is not proper\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void guest_user_detailsmexico_ECOM() {
    javascriptExecution("lambda-name=guest user detailsmexico ECOM");

    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='checkout-headline mx']" }, "20", "disabled");
    // Write text in address postal code
    typeText(new String[] { ID, "address.postalCode" }, "44600");
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIso" }, "MX-JAL-GUADALAJARA-SANTATERESITA");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "church street");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // Click on delivery Method Submit
    clickOnElement(new String[] { ID, "deliveryMethodSubmit" });

    status = "passed";
  }

  @Test
  public void Add_first_product_proceed_upto_checkoutPE_mobile_COD() {
    javascriptExecution("lambda-name=Add first product proceed upto checkoutPE mobile COD");

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

    status = "passed";
  }

  @Test
  public void PERU_Shipping_Address_Details_New_Checkout_COD() {
    javascriptExecution("lambda-name=PERU Shipping Address Details New Checkout COD");

    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-06");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "06-LIMA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "LIMA-LIMA");
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

    status = "passed";
  }

  @Test
  public void CO_Checkout_Using_Credit_Card() {
    javascriptExecution("lambda-name=CO Checkout Using Credit Card");

    // Select Option from Department Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > select" },
      "CO-DEP-13");
    // Select Option from  Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"][aria-invalid=\"true\"]" }, "13-BOYACA");
    // Write text in address line1
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(3) > input" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(4) > input" },
      "n70-306");
    // Write text in address reference
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > input" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(6) > input" },
      "7867876788");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Select Option from Payment Method Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > select" },
      "mpago_credit");
    // Write text in cardNumber
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" },
      "4013540682746260");
    // Write text in docNumber
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > form > div:nth-of-type(5) > input" },
      "12345678");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" },
      "11");
    // Select Option From Year Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(2) > select" },
      "2025");
    // Write text in cardholderName
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > form > div:nth-of-type(7) > input" },
      "APRO");
    // Write text in securityCode
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > form > div:nth-of-type(9) > input" },
      "123");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Click on Terms1
    clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
    // Click on Pay Button
    clickOnElement(new String[] { XPATH, "//button[text() = \" Pagar\"]" });

    status = "passed";
  }

  @Test
  public void Consultant_Checkout_GO_PAY_BUTTON_using_if_else() {
    javascriptExecution("lambda-name=Consultant Checkout GO PAY BUTTON using if else");

    // start if
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" })) {
      // click on Go pay Button
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
      // end if
    }
    // Start Else
    else {
      // Print
      printResults("PrintNote", "\"element is not present\"");
      // End else
    }

    status = "passed";
  }

  @Test
  public void Reusable_Credit_card_DetailsPeru() {
    javascriptExecution("lambda-name=Reusable Credit card DetailsPeru");

    // Select option from payment options
    selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "mpago_credit");
    // Write text in card Number
    typeText(new String[] { XPATH, "(//input[@id=\'cardNumber\'])[1]" }, "4009 1753 3280 6176");
    // Select Option from DNI DD
    selectOption(new String[] { XPATH, "(//select[@id=\'docType\'])[1]" }, "DNI");
    // Write text in doc number
    typeText(new String[] { XPATH, "(//input[@id=\'docNumber\'])[2]" }, "12345678");
    // Select option for Month DD
    selectOption(new String[] { XPATH, "(//select[@name=\'expirationMonth\'])[1]" }, "12");
    // Select option for Year DD
    selectOption(new String[] { XPATH, "(//select[@name=\'expirationYear\'])[1]" }, "2025");
    // Write cardholder name text field
    typeText(new String[] { ID, "cardholderName" }, "APRO");
    // Write Security code text field
    typeText(new String[] { ID, "securityCode" }, "123");
    // Click on CLICK here to continue button
    clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'CLICK AQUÍ PARA CONTINUAR\')])[2]" });
    // Full Screen
    takeScreenshotOfEntirePage(logs / Screenshoots / FcMRaN.png);

    status = "passed";
  }

  @Test
  public void URL__Peru__Consultant() {
    javascriptExecution("lambda-name=URL  Peru  Consultant");

    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");

    status = "passed";
  }

  @Test
  public void Ec_mto_secure_pay_details() {
    javascriptExecution("lambda-name=Ec mto secure pay details");

    // Select document type from drop down
    selectOption(new String[] { XPATH, "//select[@id=\'address.documentType\']" }, "CI");
    // Write text in \"RUC no\"
    typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "9876543210");
    // Write text in \"NAME AND SURNAME / COMPANY\"
    typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "Photon");
    // Select province from drop dwon
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000023");
    // Select \"canton\" from drop down
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000023000006");
    // select PARISH / SECTOR from drop down
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000023000006000053");
    // Write text in \"Main street\"
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "near main road");
    // Write text in \"Numbering\"
    typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "N70-306");
    // Write text in secondary street
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "next to church");
    // Write text in \"NEIGHBORHOOD\"
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "First phase");
    // write text \"HOUSE / APARTMENT. / BLOCK / OFFICE AND REFERENCE\"
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "house 4");
    // Write text in postal code
    typeText(new String[] { XPATH, "//input[@id=\'address.postalCode\']" }, "010201");
    // Write text in \"telephone contact\"
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "9876543210");
    // if statement \"click here to continue\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // if statement \"click here to continue\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
        // click on  \"click here to continue\"
        clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
        // end if for if statement \"click here to continue\" clickable
      }
      // else statement if statement \"click here to continue\" clickable
      else {
        // print message
        printResults("PrintNote", "button is not clickable");
        // end statement t \"click here to continue\" clickable
      }
      // end if  \"click here to continue\" present
    }
    // else statement  \"click here to continue\" present
    else {
      // print messgage
      printResults("PrintNote", "button is not present");
      // end else statement  \"click here to continue\" present
    }

    status = "passed";
  }

  @Test
  public void New_checkoutagency_bankingOXXO__MX() {
    javascriptExecution("lambda-name=New checkoutagency bankingOXXO  MX");

    // wait for agency banking
    waitUntil("CheckClickableElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']" },
      "10", "disabled");
    // start if
    if (isElementAvailable(new String[] { CSS, "input#Terms1_mpagoCashForm" })) {
      // click on agency banking
      javascriptExecution(
        "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();");
      // click on oxxo
      clickOnElement(new String[] { CSS, "div#mpago_cash div:nth-child(2) > label" });
      // click on terms and condition checkbox
      clickOnElement(new String[] { CSS, "input#Terms1_mpagoCashForm" });
      // wait for pay button
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpagoCashForm button[type='button']" }, "10",
        "disabled");
      // click on pay button
      clickOnElement(new String[] { CSS, "form#mpagoCashForm button[type=\'button\']" });
      // end if statement
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"agency banking option error\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void URL__Chile__Consultant() {
    javascriptExecution("lambda-name=URL  Chile  Consultant");

    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");

    status = "passed";
  }

  @Test
  public void MXNew_checkoutdebit_card_details_For_Rejected_Payment() {
    javascriptExecution("lambda-name=MXNew checkoutdebit card details For Rejected Payment");

    // wait untill debit card
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10", "disabled");
    // start if statement
    if (isElementClickable(new String[] { CSS, "form#mpago_debit input#cardholderName" })) {
      // write card holder name
      typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "OTHE");
      // write card number
      typeText(new String[] { CSS, "input#cardNumberDebit" }, "4189141221267633");
      // select expiration month
      selectOption(new String[] { XPATH, "(//select[@id=\'expirationMonth\'])[2]" }, "11");
      // select expiration year
      selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[2]" }, "2025");
      // write CVV number
      typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
      // Click on Terms and Condition Checkbox
      clickOnElement(new String[] { CSS, "input#Terms1_mpagoDebitCardForm" });
      // wait for pay button
      waitUntil("CheckClickableElement",
        new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button[type='button']" }, "10",
        "disabled");
      // Click on Pay Button
      clickOnElement(new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button[type=\'button\']" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"debit card data is not available\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void New_checkout_Shipping_address_detailsMX() {
    javascriptExecution("lambda-name=New checkout Shipping address detailsMX");

    // start if statement for postal code
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'address.postalCode\']" })) {
      // wait until postal code
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='address.postalCode']" }, "10", "disabled");
      // Fill postal code details
      typeText(new String[] { XPATH, "//input[@id=\'address.postalCode\']" }, "44600");
      // select address region
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "SANTA TERESITA");
      // fill address line 1
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "mississippi");
      // fill telephone number
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
      // wait for address submit
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "10", "disabled");
      // click on address submit button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"shipping address page not found\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void CL_ECOM_credit_cart_detailspaleta() {
    javascriptExecution("lambda-name=CL ECOM credit cart detailspaleta");

    // if for payment options
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment options
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "mpago_credit");
      // write card number Text Field
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168 8188 4444 7115");
      // Select Doc Type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "RUT");
      // Write Document NumberText Field
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567865473");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
      // write card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // Write security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if submit button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" })) {
        // click on submit button
        clickOnElement(
          new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" });
        // end if submit button clickable
      }
      // end if payment method
    }
    // start else payment method
    else {
      // Print message
      printResults("PrintNote", "Payment page is not present");
      // end else
    }
    // start else statement
else{
      // Print Result
      printResults("PrintNote", "\"payment option is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void PERU_New_Checkout_Using_Credit_Card_Guest_User() {
    javascriptExecution("lambda-name=PERU New Checkout Using Credit Card Guest User");

    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" },
      "10", "disabled");
    // Click On Credit Card Section
    clickOnElement(new String[] { CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Write Text In CardHolder name
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" },
      "APRO");
    // Write  Text In Card No
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" },
      "4168818844447115");
    // select Option From Month Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
    // Select Option From Year Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
    // Write Text In CVV Textbox
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" },
      "123");
    // Select Option From DNI
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" },
      "12345678");
    // scroll
    scrollIntoElementView(new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']" });
    // Cick On Terms1 Checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']" });
    // Cick On Pay Button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });

    status = "passed";
  }

  @Test
  public void Ec_Mto_payment_method_credit_card() {
    javascriptExecution("lambda-name=Ec Mto payment method credit card");

    // if payment option present
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment option as credit card
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
      // Write text in credit card
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
      // select document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Cédula");
      // select doc no
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567892");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
      // Write text in card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // write text in security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if statement click here to continue payment button present
      if (isElementAvailable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" })) {
        // if statement click here to continue payment button clickable
        if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" })) {
          // click on click here to continue payment button
          clickOnElement(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" });
          // end if statement click here to contineue payment button clickable
        }
        // else statement click here to continue payment button clickable
        else {
          // print message
          printResults("PrintNote", "not clickable");
          // end if click here continue button present
        }
        // else statement click here continue button present
else{
          // print message
          printResults("PrintNote", "button is not present");
          // end else statement click here continue button present
        }
        // End if payment option present
      }
      // else payment option present
      else {
        // print message
        printResults("PrintNote", "Payment option is not present");
        // end else payment option present
      }

      status = "passed";
    } @Test public void Mx_mto_paleta_shipping_address_details () {
      javascriptExecution("lambda-name=Mx mto paleta shipping address details");

      // if postal code present
      if (isElementAvailable(new String[] { XPATH, "//input[@id=\'address.postalCode\']" })) {
        // write text in postal code
        typeText(new String[] { XPATH, "//input[@id=\'address.postalCode\']" }, "01020");
        // wait until street number present
        waitUntil("CheckVisibleElement", new String[] { XPATH, "//input[@id='address.line1']" }, "5", "disabled");
        // write street number
        typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "12");
        // write additional infomartion
        typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "main road");
        // write telephone contact
        typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567788");
        // if submit button clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
          // click on submit
          clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
          // end if submit button
        }
        // start else statement
        else {
          // Print Result
          printResults("PrintNote", "\"submit button is not clickable\"");
          // end else statement
        }
        // end if postal code
      }
      // else statement postal code
      else {
        // Print message
        printResults("PrintNote", "page is not visible");
        // end else posatl code
      }

      status = "passed";
    }
    @Test public void CO__Checkout_Using_Agency_Banking () {
      javascriptExecution("lambda-name=CO  Checkout Using Agency Banking");

      // Select Option from Department Dropdown
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > select" },
        "CO-DEP-13");
      // Select Option from Province Dropdown
      selectOption(new String[] { CSS, "select[class=\"form-control\"][aria-invalid=\"true\"]" }, "13-BOYACA");
      // Write text in address.line1
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(3) > input" },
        "near temple");
      // Write text in address.line2
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(4) > input" },
        "n70-306");
      // Write text in address.referen...
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > input" },
        "100");
      // Write text in address.phone
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(6) > input" },
        "7867876788");
      // click on click here to continue button
      clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
      // click on click here to continue button
      clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
      // Select Option from Payment Method Dropdown
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > select" },
        "mpago_cash");
      // Write text in mPagoDocNumberC...
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"mPagoDocNumberCash\"]" },
        "12345678");
      // click on click here to continue button
      clickOnElement(new String[] { XPATH, "//button[text() = \" CLICK AQUÍ PARA CONTINUAR\"]" });
      // Click on Terms 1
      clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
      // Click on Pay Button
      clickOnElement(new String[] { XPATH, "//button[text() = \" Pagar\"]" });

      status = "passed";
    }
    @Test public void Consultant_search_engine__LBEL_till_Select_Province_Option_ECUADOR () {
      javascriptExecution("lambda-name=Consultant search engine  LBEL till Select Province Option ECUADOR");

      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
      // Add Assertion For Commercial Banner
      Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
        "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
        // click on close popup
        clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
        // end if statement
      }
      // start else statement
      else {
        // print result
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }
      // Click on Commercial Banner
      clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
      // Write text in consultant Surname
      typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
      // Write text in consultant Surname
      typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");

      status = "passed";
    }
    @Test public void Consultant_search_engine_Lbel_After_Selecting_Province_Dropdown () {
      javascriptExecution("lambda-name=Consultant search engine Lbel After Selecting Province Dropdown");

      // Click On Look For Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='resultConsultantsSearch-message']" }, "15",
        "disabled");
      // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
      // Add Assertion For Total no of consultant Result showing
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'results-table-cell results-left results-strong\']" }));
      // if present
      if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" })) {
        // Click on Assign Me A Consultant Button
        clickOnElement(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" });
        // wait
        waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='cboxContent']" }, "20", "disabled");
        // start if statement
        if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxContent\']" }, 0)) {
          // Take Snip Of Consultant Popup
          takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
            "logs/Screenshots/okqPCG.png");
          // Click On Shop With me Button
          clickOnElement(new String[] { XPATH, "//a[@id=\'js-buy-with-me\']" });
          // if present
          if (isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" })) {
            // Add Assertion For Homepage Contains That Particular Consultant Name
            Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
            // Click On That Commercial Banner For Particular Consultant
            clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
            // click on Choose Another Consultant In The Popup
            clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Elige otra consultora\')]" });
            // end if
          }
          // Take ScreenShot
          takeScreenshot("logs/Screenshoots/tiigfg.png");
          // start else statement
else{
            // print result
            printResults("PrintNote", "\"consultant popup is not visible\"");
            // end else
          }
          // end if
        }
        // start else
        else {
          // Print Result
          printResults("PrintNote", "\"element is not present\"");
          // end else statement
        }
        // end if statement
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"element not present\"");
        // end else
      }

      status = "passed";
    } @Test public void Price_assertion () {
      javascriptExecution("lambda-name=Price assertion");

      // Price assertion
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"S/ 25.90\"]" }));

      status = "passed";
    }
    @Test public void Clear_Cache_and_Cookies () {
      javascriptExecution("lambda-name=Clear Cache and Cookies");

      // Clear cookies
      deleteAllCookies();
      // Clear storage
      javascriptExecution("window.localStorage.clear();");
      // Clear session storage
      javascriptExecution("window.sessionStorage.clear();");

      status = "passed";
    }
    @Test public void Ec_mto__checkout_registered_user_login () {
      javascriptExecution("lambda-name=Ec mto  checkout registered user login");

      // if email
      if (isElementAvailable(new String[] { XPATH, "//input[@id=\'j_username\']" })) {
        // write text in email
        typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "belcorpregisteredtestuser@endtest-mail.io");
        // Write text in password
        typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "PhotonTest@9876543210");
        // click on login
        clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
        // end if email
      }
      // else email
      else {
        // print message
        printResults("PrintNote", "login page is not available");
        // end else email
      }

      status = "passed";
    }
    @Test public void New_Checkout_Guest_user_details_COLOMBIA_till_address_submit () {
      javascriptExecution("lambda-name=New Checkout Guest user details COLOMBIA till address submit");

      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // click on guest belcorp T&c checkbox
      clickOnElement(new String[] { ID, "guest.belcorpToC" });
      // click on billing Common System checkbox
      clickOnElement(new String[] { NAME, "billingCommonSystem" });
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // wait for address fields
      waitUntil("CheckVisibleElement", new String[] { ID, "address.regionIsoParent1" }, "10", "disabled");
      // Select Option from department
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "CO-DEP-76");
      // Select Option from location
      selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "76-BOGOTA");
      // Write text in STREET AND NUMBER
      typeText(new String[] { NAME, "line1" }, "church street");
      // Write text in Appartment TextBox
      typeText(new String[] { NAME, "line2" }, "n70-306");
      // Write text in Address Reference TextBox
      typeText(new String[] { NAME, "referencia" }, "206");
      // Write text in phone number textbox
      typeText(new String[] { NAME, "phone" }, "7875675765");
      // Click on addressSubmit
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block checkout-next\']" });

      status = "passed";
    }
    @Test public void guest_user_detailscolumbia () {
      javascriptExecution("lambda-name=guest user detailscolumbia");

      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // click on guest belcorp T&c checkbox
      clickOnElement(new String[] { ID, "guest.belcorpToC" });
      // click on billing Common System checkbox
      clickOnElement(new String[] { NAME, "billingCommonSystem" });
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // wait for address fields
      waitUntil("CheckVisibleElement", new String[] { ID, "address.regionIsoParent1" }, "15", "disabled");
      // Select Option from department
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "CO-DEP-21");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "21-HATO COROZAL");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "1234567898");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // Click on delivery Method Submit
      clickOnElement(new String[] { ID, "deliveryMethodSubmit" });

      status = "passed";
    }
    @Test public void Handle_Cbox_popup () {
      javascriptExecution("lambda-name=Handle Cbox popup");

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

      status = "passed";
    }
    @Test public void PERU_New_Checkout_Using_Debit_Card_Guest_User () {
      javascriptExecution("lambda-name=PERU New Checkout Using Debit Card Guest User");

      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "(//input[@id='cardholderName'])[2]" }, "10", "disabled");
      // write text in card holder name
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
      // Write Text In Card Number
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumberDebit-error\"]" },
        "5333099529782376");
      // Select Option From Month Dropdown
      selectOption(new String[] { XPATH, "(//select[@name=\'expirationMonth\'])[2]" }, "11");
      // Select Option From Year Dropdown
      selectOption(new String[] { XPATH, "(//select[@name=\'expirationYear\'])[2]" }, "2025");
      // Write Text In CVV Textbox
      typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[2]" }, "123");
      // Write Text In Document No
      typeText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" }, "12345678");
      // scroll
      scrollIntoElementView(new String[] { CSS, "input[id=\'Terms1_mpagoDebitCardForm\']" });
      // Cick On Terms1 Checkbox
      clickOnElement(new String[] { ID, "Terms1_mpagoDebitCardForm" });
      // Click On Pay Button
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(4) > div > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(6) > div > div > form > div:nth-of-type(7) > div > button" });

      status = "passed";
    }
    @Test public void New_Checkout_Add_first_product_from_esika_and_proceed_upto_checkoutCLmobile_Using_login () {
      javascriptExecution(
        "lambda-name=New Checkout Add first product from esika and proceed upto checkoutCLmobile Using login");

      // wait for username text field visible
      waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='j_username']" }, "10", "disabled");
      // Write text in username
      typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "purvagupta@endtest-mail.io");
      // Write text in  password
      typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Photon@123");
      // Click on Log in
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
      // click on hamburgur menu
      clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
      // click on makeup
      clickOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
      // Click on first product
      javascriptExecution(
        "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
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

      status = "passed";
    }
    @Test public void PERU_Checkout_Using_Banking_Agency_Option () {
      javascriptExecution("lambda-name=PERU Checkout Using Banking Agency Option");

      // Wait untill agency banking
      waitUntil("CheckClickableElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']" },
        "20", "disabled");
      // Click on Pago Efectivo  Section
      javascriptExecution(
        "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();");
      // Click on Agents & Agencies
      javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();");
      // Click on Terms1 Checkbox
      javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();");
      // Click on Pay Button
      javascriptExecution(
        "document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");

      status = "passed";
    }
    @Test public void New_checkoutdebit_card_detailsMX () {
      javascriptExecution("lambda-name=New checkoutdebit card detailsMX");

      // wait untill debit card
      waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_debit input#cardholderName" }, "10",
        "disabled");
      // start if statement
      if (isElementClickable(new String[] { CSS, "form#mpago_debit input#cardholderName" })) {
        // write card holder name
        typeText(new String[] { CSS, "form#mpago_debit input#cardholderName" }, "APRO");
        // write card number
        typeText(new String[] { CSS, "input#cardNumberDebit" }, "4189141221267633");
        // select expiration month
        selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
        // select expiration year
        selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
        // write CVV number
        typeText(new String[] { CSS, "form#mpago_debit input#securityCode" }, "123");
        // Click on Terms and Condition Checkbox
        clickOnElement(new String[] { CSS, "input#Terms1_mpagoDebitCardForm" });
        // wait for pay button
        waitUntil("CheckClickableElement",
          new String[] { CSS, "form#mpago_debit div.action-fixed-bottom > div > button[type='button']" }, "10",
          "disabled");
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"debit card data is not available\"");
        // end else statement
      }

      status = "passed";
    }
    @Test public void Add_first_product_from_esika_and_proceed_upto_checkoutPE_mobile () {
      javascriptExecution("lambda-name=Add first product from esika and proceed upto checkoutPE mobile");

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
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
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

      status = "passed";
    }
    @Test public void Guest_user_login_details_specific_scenario_peru () {
      javascriptExecution("lambda-name=Guest user login details specific scenario peru");

      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // click on guest belcorp T&c checkbox
      clickOnElement(new String[] { ID, "guest.belcorpToC" });
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-08");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "08-CARAVELI");
      // alert handling
      closeAlert();
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CARAVELI-ATICO");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "1234567898");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // Click on delivery Method Submit
      clickOnElement(new String[] { ID, "deliveryMethodSubmit" });

      status = "passed";
    }
    @Test public void CLAdd_first_product_from_LBEL_and_proceed_upto_checkoutmobile_Using_loginECOM () {
      javascriptExecution("lambda-name=CLAdd first product from LBEL and proceed upto checkoutmobile Using loginECOM");

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
      // click on address submit
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });

      status = "passed";
    }
    @Test public void Mx_Mto_payment_method_credit_card_paleta () {
      javascriptExecution("lambda-name=Mx Mto payment method credit card paleta");

      // if payment option present
      if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
        // select payment option as credit card
        selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
        // Write text in credit card
        typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
        // select document type
        selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Otro");
        // select doc no
        typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "9876543211");
        // select expiry month
        selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
        // select expiry year
        selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
        // Write text in card holder name
        typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
        // write text in security code
        typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
        // if statement click here to continue payment button present
        if (isElementAvailable(
          new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" })) {
          // if statement click here to continue payment button clickable
          if (isElementClickable(
            new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" })) {
            // click on click here to continue payment button
            clickOnElement(
              new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_mpagoForm checkout-next\']" });
            // nd if statement click here to contineue payment button clickable
          }
          // else statement click here to continue payment button clickable
          else {
            // print message
            printResults("PrintNote", "not clickable");
            // end else statement
          }
          // end if click here continue button present
        }
        // else statement click here continue button present
        else {
          // print message
          printResults("PrintNote", "button is not present");
          // end else statement click here continue button present
        }
        // End if payment option present
      }
      // else payment option present
      else {
        // print message
        printResults("PrintNote", "Payment option is not present");
        // end else payment option present
      }

      status = "passed";
    }
    @Test public void Action_Back__and_Forward () {
      javascriptExecution("lambda-name=Action Back  and Forward");

      // Go backward
      goBack();
      // Go Forward
      goForward();

      status = "passed";
    }
    @Test public void CL_credit_card_details_New_checkout_PENDING_PAYMENT () {
      javascriptExecution("lambda-name=CL credit card details New checkout PENDING PAYMENT");

      // if credit card present
      if (isElementAvailable(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" })) {
        // click on credit cart
        clickOnElement(new String[] { CSS,
          "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" });
        // Write text in card holder Name
        typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "CONT");
        // Write text in card Number
        typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "5160033004714834");
        // Select expiry month
        selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
        // Select expiry year
        selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
        // Write cvv number
        typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
        // Select document type
        selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Otro");
        // Write text in docNumber
        typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "12345678");
        // Click on Terms1
        clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']" });
        // Click on pay button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
        // end if
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }

      status = "passed";
    }
    @Test public void CL_credit_card_details_New_checkout () {
      javascriptExecution("lambda-name=CL credit card details New checkout");

      // if credit card present
      if (isElementAvailable(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" })) {
        // click on credit cart
        clickOnElement(new String[] { CSS,
          "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" });
        // Write text in card holder Name
        typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
        // Write text in card Number
        typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "5160033004714834");
        // Select expiry month
        selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
        // Select expiry year
        selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
        // Write cvv number
        typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
        // Select document type
        selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Otro");
        // Write text in docNumber
        typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "12345678");
        // Click on Terms1
        clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']" });
        // Click on pay button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
        // end if
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"credit card section is not present\"");
        // End else statement
      }

      status = "passed";
    }
    @Test public void CLAdd_first_product_from_LBEL_and_Back_To_Shipping_Pagemobile_Using_login () {
      javascriptExecution("lambda-name=CLAdd first product from LBEL and Back To Shipping Pagemobile Using login");

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

      status = "passed";
    }
    @Test public void pe_Mto__shipping_options_click_here_continue_button () {
      javascriptExecution("lambda-name=pe Mto  shipping options click here continue button");

      // if condition for \" click here continue button \" present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
        // if condition for \" click here continue button \" clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
          // click on \"click here continue button \" button
          clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
          // end if for \"click here continue button \" clickable
        }
        // Else statement \"click here continue button \" clickable
        else {
          // Print message not clickable
          printResults("PrintNote", "click here continue button  is not clickable");
          // end else \"click here continue button \" clickable
        }
        // end if for  \"click here continue button \" present
      }
      // else statement   \"click here continue button \" present
      else {
        // print message
        printResults("PrintNote", "click here continue button  is not present");
        // end else statement  \"click here continue button \" present
      }

      status = "passed";
    }
    @Test public void Mail_Validation () {
      javascriptExecution("lambda-name=Mail Validation");

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
        takeScreenshot("logs/Screenshoots/bncPzT.png");
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
    } @Test public void guest_user_login_details_MTOPeru () {
      javascriptExecution("lambda-name=guest user login details MTOPeru");

      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // click on guest belcorp T&c checkbox
      clickOnElement(new String[] { ID, "guest.belcorpToC" });
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" });
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-08");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "08-CARAVELI");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CARAVELI-BELLA UNION");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "1234567898");
      // Click on giftAddress
      clickOnElement(new String[] { XPATH, "//input[@class=\'js-checkout-gift-checkbox\']" });
      // Write text in address from
      typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "karthik");
      // Write text in address.to
      typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Chaitanya");
      // Write text in address complete Name
      typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "Tarak Bala");
      // Click on CLICK here to continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Click on Again CLICK here to continue button
      clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });

      status = "passed";
    }
    @Test public void PA__Guest_User_Login () {
      javascriptExecution("lambda-name=PA  Guest User Login");

      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });

      status = "passed";
    }
    @Test public void New_checkoutagency_bankingBBVA_bancomer_MX () {
      javascriptExecution("lambda-name=New checkoutagency bankingBBVA bancomer MX");

      // wait for agency banking
      waitUntil("CheckClickableElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']" },
        "10", "disabled");
      // start if
      if (isElementAvailable(new String[] { CSS, "input#Terms1_mpagoCashForm" })) {
        // click on agency banking
        javascriptExecution(
          "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();");
        // click on terms and condition checkbox
        clickOnElement(new String[] { CSS, "input#Terms1_mpagoCashForm" });
        // wait for pay button
        waitUntil("CheckClickableElement", new String[] { CSS, "form#mpagoCashForm button[type='button']" }, "10",
          "disabled");
        // click on pay button
        clickOnElement(new String[] { CSS, "form#mpagoCashForm button[type=\'button\']" });
        // end if statement
      }
      // start else
      else {
        // print in result
        printResults("PrintNote", "\"agency banking option error\"");
        // end else
      }

      status = "passed";
    }
    @Test public void Add_first_product_from_LBEL_and_proceed_upto_checkoutPE_mobile_Using_loginECOM () {
      javascriptExecution("lambda-name=Add first product from LBEL and proceed upto checkoutPE mobile Using loginECOM");

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

      status = "passed";
    }
    @Test public void PERU_New_Checkout_Using_Debit_Card_Registered_User () {
      javascriptExecution("lambda-name=PERU New Checkout Using Debit Card Registered User");

      // Write Text In CVV Textbox
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCodeCardSaved-error\"]" },
        "123");
      // Cick On Terms1 Checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_MPagoCardSavedForm_mpago_debmaster\']" });
      // Cick On Pay Button
      clickOnElement(
        new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoCardSavedForm checkout-next\']" });

      status = "passed";
    }
    @Test public void PERU_New_Checkout_Using_Credit_Card_Guest_User_PENDING_PAYMENT () {
      javascriptExecution("lambda-name=PERU New Checkout Using Credit Card Guest User PENDING PAYMENT");

      // wait
      waitUntil("CheckVisibleElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" },
        "10", "disabled");
      // Click On Credit Card Section
      clickOnElement(new String[] { CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
      // Write Text In CardHolder name
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" },
        "CONT");
      // Write  Text In Card No
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" },
        "4168818844447115");
      // select Option From Month Dropdown
      selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
      // Select Option From Year Dropdown
      selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
      // Write Text In CVV Textbox
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" },
        "123");
      // Select Option From DNI
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" },
        "12345678");
      // scroll
      scrollIntoElementView(new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']" });
      // Cick On Terms1 Checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']" });
      // Cick On Pay Button
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });

      status = "passed";
    }
    @Test public void guest_user_detailschili () {
      javascriptExecution("lambda-name=guest user detailschili");

      // Write text in guest firstName text field
      typeText(new String[] { ID, "guest.firstName" }, "photon");
      // Write text in guest lastName text field
      typeText(new String[] { ID, "guest.lastName" }, "test");
      // Write text in  guest email textfield
      typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
      // Click on guest agree To Receive publicity checkbox
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // start if statement
      if (isElementAvailable(new String[] { XPATH, "//strong[text() = \"¿Cómo quisieras recibir tu pedido?\"]" })) {
        // Add Assertion for How would you like to receive your order
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//strong[text() = \"¿Cómo quisieras recibir tu pedido?\"]" }));
        // Click on go pay
        clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
        // end if
      }
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "churchil street");
      // Write text in TELEPHONE CONTACT
      typeText(new String[] { ID, "address.phone" }, "1234567898");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // wait
      waitUntil("CheckElement", new String[] { ID, "deliveryMethodSubmit" }, "15", "disabled");

      status = "passed";
    }
    @Test public void Mx_Mto__click_here_to_continue_button_Paleta_shipping_option () {
      javascriptExecution("lambda-name=Mx Mto  click here to continue button Paleta shipping option");

      // if condition for \" click here to continue button\" present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
        // if condition for \" click here to continue button\" clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
          // click on \" click here to continue button\" button
          clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
          // end if for \" click here to continue button\" clickable
        }
        // Else statement \" click here to continue button\" clickable
        else {
          // Print message not clickable
          printResults("PrintNote", "click here to continue button is not clickable");
          // end else \" click here to continue button\" clickable
        }
        // end if for  \" click here to continue button\" present
      }
      // else statement   \" click here to continue button\" present
      else {
        // print message
        printResults("PrintNote", "click here to continue button is not present");
        // end else statement  \" click here to continue button\" present
      }

      status = "passed";
    }
    @Test public void Handle_random_popup () {
      javascriptExecution("lambda-name=Handle random popup");

      // Handle hidden pop up
      javascriptExecution("self.close();");
      // Wait
      waitForTime(3);

      status = "passed";
    }
    @Test public void CLAdd_first_product_and_proceed_upto_checkout_mobileGuest_user () {
      javascriptExecution("lambda-name=CLAdd first product and proceed upto checkout mobileGuest user");

      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
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

      status = "passed";
    }
    @Test public void Click_on_go_pay__generic () {
      javascriptExecution("lambda-name=Click on go pay  generic");

      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });

      status = "passed";
    }
    @Test public void PERU_Shipping_Address_Details_New_Checkout () {
      javascriptExecution("lambda-name=PERU Shipping Address Details New Checkout");

      // wait
      waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10",
        "disabled");
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
      typeText(
        new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" },
        "100");
      // Write text in address phone
      typeText(
        new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" },
        "7867876788");
      // wait
      waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" }, "10",
        "disabled");
      // Click on Continue Button
      clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });

      status = "passed";
    }
    @Test public void New_Checkout_Peru_order_detail () {
      javascriptExecution("lambda-name=New Checkout Peru order detail");

      // Click on Hamburger Menu
      clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
      // Click on cuidado personal
      clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
      // start if statement
      if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
        // wait
        waitUntil("CheckVisibleElement",
          new String[] { CSS, "div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a" }, "5",
          "disabled");
        // click on  second product
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
        // scroll down
        scroll("ScrollBottom");
        // add assertion for oder details
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
        // add assertion for discount
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\'subtotals__item--state-discount\'])[1]" }));
        // add assertion for total without product discount
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'total\'])[1]" }));
        // take a snip to verify oreder details
        takeScreenshotOfParticularElement(new String[] { XPATH, "(//div[@class=\'checkout-order-summary\'])[1]" },
          "logs/Screenshots/miQqbl.png");
        // end if statement
      }
      // else statement
      else {
        // product is not available
        printResults("PrintNote", "product is not available");
        // end else statement
      }

      status = "passed";
    }
    @Test public void PE_credit_card_details_New_checkout () {
      javascriptExecution("lambda-name=PE credit card details New checkout");

      // click on credit cart
      javascriptExecution(
        "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();");
      // start if
      if (isElementAvailable(new String[] { CSS, "div#mpagoCreditCardDiv a#add-new-card" })) {
        // click on add new card
        clickOnElement(new String[] { CSS, "div#mpagoCreditCardDiv a#add-new-card" });
        // end if
      }
      // Write text in card holder Name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // Write text in card Number
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "5031755734530604");
      // Select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
      // Select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
      // Write cvv number
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // Select document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Otro");
      // Write text in docNumber
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "12345678");
      // Click on Terms1
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']" });
      // Click on pay button
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });

      status = "passed";
    }
    @Test public void PEAdd_first_product_and_proceed_upto_checkout_mobileGuest_user () {
      javascriptExecution("lambda-name=PEAdd first product and proceed upto checkout mobileGuest user");

      // wait until hamburgur menu clickeble
      waitUntil("CheckClickableElement",
        new String[] { CSS, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
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
      // click on accept terms and condition checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
      // click on continue button
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });

      status = "passed";
    }
    @Test public void CL_shipping_address_New_checkout () {
      javascriptExecution("lambda-name=CL shipping address New checkout");

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

      status = "passed";
    }
    @Test public void New_Checkout_using_COD_COLOMBIA () {
      javascriptExecution("lambda-name=New Checkout using COD COLOMBIA");

      // Wait
      waitUntil("CheckVisibleElement", new String[] { CSS,
          "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label" },
        "10", "disabled");
      // Click on Payment in Upon Delivery
      javascriptExecution(
        "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiobelc_cash_delivery.radiobelc_cash_deliveryCO > label\").click();");
      // wait
      waitUntil("CheckVisibleElement", new String[] { CSS, "input#docNumberCashOnDelivery" }, "5", "disabled");
      // WriteText in Document number
      typeText(new String[] { CSS, "input#docNumberCashOnDelivery" }, "1234567890");
      // scroll
      scrollIntoElementView(new String[] { CSS, "input#isBillingCommonSystem_cashOnDeliveryForm" });
      // Click on T&C chec
      javascriptExecution("document.querySelector(\"input#Terms1_cashOnDeliveryForm\").click();");
      // wait
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//button[@class='btn btn-block submit_cashOnDeliveryForm checkout-next']" }, "6",
        "disabled");
      // Click on Pay Button
      clickOnElement(
        new String[] { XPATH, "//button[@class=\"btn btn-block submit_cashOnDeliveryForm checkout-next\"]" });

      status = "passed";
    }
    @Test public void Ec__Mto___cart_go_pay_button () {
      javascriptExecution("lambda-name=Ec  Mto   cart go pay button");

      // if condition for \" go pay\" present
      if (isElementAvailable(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" })) {
        // if condition for \" go pay\" clickable
        if (isElementClickable(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" })) {
          // click on \"go pay\" button
          clickOnElement(
            new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
          // end if for \"go pay\" clickable
        }
        // Else statement \"go pay\" clickable
        else {
          // Print message not clickable
          printResults("PrintNote", "go pay is not clickable");
          // end else \"go pay\" clickable
        }
        // end if for  \"go pay\" present
      }
      // else statement   \"go pay\" present
      else {
        // print message
        printResults("PrintNote", "go pay is not present");
        // end else statement  \"go pay\" present
      }

      status = "passed";
    }
    @Test public void Mx_mto_paleta_summary_of_purchase_page () {
      javascriptExecution("lambda-name=Mx mto paleta summary of purchase page");

      // if terms
      if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']" })) {
        // Click on terms checkbox
        clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
        // Click on place order button
        clickOnElement(new String[] { XPATH, "//button[@id=\'placeOrder\']" });
        // end if terms
      }
      // else terms
      else {
        // Print message
        printResults("PrintNote", "Purchase order summary page is not present");
        // end else terms
      }

      status = "passed";
    }
  }