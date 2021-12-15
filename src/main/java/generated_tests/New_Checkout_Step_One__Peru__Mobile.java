package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New_Checkout_Step_One__Peru__Mobile extends WebDriverHelper {

  @Test
  public void Validate_that_it_does_not_impact_other_countriesCTwoOneThreeFour() {
    javascriptExecution("lambda-name=Validate that it does not impact other countriesCTwoOneThreeFour");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // peru order detail
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
        "logs/Screenshots/KFSOof.png");
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

  @Test
  public void Verify_My_Addresses_as_Recurring_RegistrarCOneNineThreeSix() {
    javascriptExecution("lambda-name=Verify My Addresses as Recurring RegistrarCOneNineThreeSix");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // add a product to cart and proceed to checkout
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
    // wait until checkout
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='headerRegisterUser']/span" }, "20",
      "disabled");
    // assert for user email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"headerRegisterUser\"]/span" }));
    // take a snip to verify shipping address stored
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
      "logs/Screenshots/zDVapH.png");
    // add assertion for alert
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\"newAddressAlert5\"]" }));
    // click on my address link in the alert
    clickOnElement(new String[] { XPATH, "//div[@id=\"newAddressAlert5\"]//a" });
    // switch to new tab
    switchToNextWindow();
    // add assertion for my address section
    Assert.assertTrue(checkCurrentUrlContains("address-book"));
    // click on add new adress button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Agregar nueva dirección\')]" });
    // wait
    waitForTime(5);
    // take a snip to verify the add new adress
    takeScreenshotOfParticularElement(new String[] { XPATH, "//section[@class=\"account-section\"]" },
      "logs/Screenshots/krNhYr.png");

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
  public void Validate_the_total_amount_with_cost_or_without_shipping_costCTwoOneThreeThree() {
    javascriptExecution("lambda-name=Validate the total amount with cost or without shipping costCTwoOneThreeThree");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // add product
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
    // scroll down
    scrollIntoElementView(new String[] { CSS, "div[class=\'checkout-order-summary\']" });
    // add assertion for oder details
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
    // add assertion for shipping cost
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'shipping\'])[1]" }));
    // add assertion for total without shipping cost
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'total\'])[1]" }));

    status = "passed";
  }

  @Test
  public void Check_criteria_for_Department__Province__DistrictCOneNineOneEight() {
    javascriptExecution("lambda-name=Check criteria for Department  Province  DistrictCOneNineOneEight");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Add a product and proceed to checkout
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
    // select from department option
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // take a snip to verify by filling lvl 1 lvl 2 is enabled
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/BtyGrA.png");
    // add assertion for department drop down
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }));
    // click on district
    clickOnElement(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" });
    // take a snip to verify by skipping lvl 2 lvl3 options are not enabled
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/WQWIns.png");
    // select option from province
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // take a snip to verify filling lvl1 and 2 enables lvl 3
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/OQRHmL.png");
    // add assertion for province drop down
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }));
    // select from district
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-HUAMANGUILLA");
    // take a snip to verify district and all lvl1,2,3 is filled
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/EKtCeG.png");
    // add assertion for district drop down
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }));

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Reference_fieldCOneNineTwoOne() {
    javascriptExecution("lambda-name=Check criteria of the Reference fieldCOneNineTwoOne");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // select from dept drp down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // select from province drpdown PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // select from district drop down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-HUAMANGUILLA");
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "Jiron María");
    // write  text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "Parado de Bellido");
    // write  text in reference
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "/.>//");
    // Add assertion for reference error
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\"address.referencia-error\"]" }));
    // write text in  reference
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" },
      "asdfghjklpoiuytrewqaaaaaaaaaaaaaaaaaaaaaaaddddddddaaaaaaaaaaawwwwwwwwweeeef");
    // extract value from reference
    String $referenceTextField = getText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" });
    // get length of  reference
    int $referenceTextFieldLength = getTextLength($referenceTextField);
    // add assertion for number of characters
    Assert.assertTrue(
      checkVariableAssertion("variableLessThanOrEqualsValue", String.valueOf($referenceTextFieldLength), "50"));
    // write text in  reference
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "ÁÉÍÓÚáéíóúüÜ");
    // take a snip to verify the adress is accepting character
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/mViEGP.png");

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Contact_phone_fieldCOneNineTwoTwo() {
    javascriptExecution("lambda-name=Check criteria of the Contact phone fieldCOneNineTwoTwo");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // select from dept drp down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // select from province drpdown PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // select from district drop down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-HUAMANGUILLA");
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "Jiron María");
    // write  text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "Parado de Bellido");
    // write  text in reference
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "hilton sylvie");
    // write  text in  Contact phone field
    typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "/.>//");
    // Add assertion for  Contact phone field error
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\"address.phone-error\"]" }));
    // write text in   Contact phone field
    typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" },
      "asdfghjklpoiuytrewqaaaaaaaaaaaaaaaaaaaaaaaddddddddaaaaaaaaaaawwwwwwwwweeeef");
    // extract value from  Contact phone field
    String $contactTextField = getText(new String[] { XPATH, "//input[@id=\"address.phone\"]" });
    // get length of  Contact phone field
    int $contactTextFieldLength = getTextLength($contactTextField);
    // add assertion for  Contact phone field
    Assert.assertTrue(
      checkVariableAssertion("variableLessThanOrEqualsValue", String.valueOf($contactTextFieldLength), "20"));
    // take a snip to verify the  Contact phone field is accepting character
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/JWfidP.png");

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_or__without_Product_discountsCOneNineSixOne() {
    javascriptExecution("lambda-name=Validate the total amount with or  without Product discountsCOneNineSixOne");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on  icon
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on cuidado persona...
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // click on product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
      // click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // wait
      waitUntil("CheckClickableElement", new String[] { CSS,
          "div#StickySidebar div.col-sm-5.col-md-12.pull-right.checkout__cart_actions_btn_container.js-gift-popup-candidate > button#checkout-display-continueCheckout" },
        "5", "disabled");
      // click on go pay continue
      clickOnElement(new String[] { CSS,
        "div#StickySidebar div.col-sm-5.col-md-12.pull-right.checkout__cart_actions_btn_container.js-gift-popup-candidate > button#checkout-display-continueCheckout" });
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
      // End  If Statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"Product is not available\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_or_without_Cart_DiscountsCTwoOneThreeTwo() {
    javascriptExecution("lambda-name=Validate the total amount with or without Cart DiscountsCTwoOneThreeTwo");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    // Enter URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on  icon
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on cuidado persona...
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // click on product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(4) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
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

    status = "passed";
  }

  @Test
  public void Verify_View_saved_addresses_as_Recurring_RegisteredCOneNineThreeSeven() {
    javascriptExecution("lambda-name=Verify View saved addresses as Recurring RegisteredCOneNineThreeSeven");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // add a product to cart and proceed to checkout
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
    // wait untill checkout
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='headerRegisterUser']/span" }, "20",
      "disabled");
    // assert for user email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"headerRegisterUser\"]/span" }));
    // take a snip to verify shipping address stored
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
      "logs/Screenshots/JGeRpg.png");

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Dept_int__floor_fieldCOneNineTwozero() {
    javascriptExecution("lambda-name=Check criteria of the Dept int  floor fieldCOneNineTwozero");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // select from dept drp down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // select from province drpdown PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // select from district drop down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-HUAMANGUILLA");
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "Jiron María");
    // write  text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "/.>//");
    // Add assertion for Apartment / int / floor
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\"address.line2-error\"]" }));
    // write text in Dpto. / Int / Piso / Edificio (Opcional)
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "asdfghjklpoiuytrewqa");
    // extract value from Apartment / int / floor text field
    String $deptTextField = getText(new String[] { XPATH, "//input[@id=\"address.line2\"]" });
    // get length of the Apartment / int / floor  text from the address text field
    int $deptTextFieldLength = getTextLength($deptTextField);
    // add assertion for number of characters
    Assert.assertTrue(
      checkVariableAssertion("variableLessThanOrEqualsValue", String.valueOf($deptTextFieldLength), "10"));
    // write text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "ÁÉÍÓÚáéíóúüÜ");
    // take a snip to verify the adress is accepting character
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/uwnHdu.png");

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Address_fieldCOneNineOneNine() {
    javascriptExecution("lambda-name=Check criteria of the Address fieldCOneNineOneNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // select from dept drp down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // select from province drpdown PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // select from district drop down PE
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-HUAMANGUILLA");
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "/.>//");
    // Add assertion for adress line error
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\"address.line1-error\"]" }));
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" },
      "ihjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuueeeeeeeeaaaaaaaaaaaaccccccc");
    // extract value from text field
    String $addressTextField = getText(new String[] { XPATH, "//input[@id=\"address.line1\"]" });
    // get length of the text from the address text field
    int $addressTextFieldLength = getTextLength($addressTextField);
    // add assertion for number of characters
    Assert.assertTrue(
      checkVariableAssertion("variableLessThanOrEqualsValue", String.valueOf($addressTextFieldLength), "60"));
    // write text in address line
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "ÁÉÍÓÚáéíóúüÜ");
    // take a snip to verify the adress is accepting character
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/icnfso.png");

    status = "passed";
  }

  @Test
  public void Filter_COD_delivery_method_on_new_checkout_groupCOneNineFourFive() {
    javascriptExecution("lambda-name=Filter COD delivery method on new checkout groupCOneNineFourFive");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // add a product to cart and proceed to checkout
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
    // wait untill chekout
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='headerRegisterUser']/span" }, "20",
      "disabled");
    // assert for user email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"headerRegisterUser\"]/span" }));
    // take a snip to verify shipping address stored
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
      "logs/Screenshots/CllKIa.png");
    // click on add new address
    javascriptExecution("document.querySelector(\"a#checkout-add-new-address\").click();");
    // wait until adress dropdowns
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIsoParent2']" }, "10",
      "disabled");
    // select lima from dept dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "LIMA");
    // wait for province dropdown
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIsoParent1']" }, "10",
      "disabled");
    // select lima from provincia dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "LIMA");
    // wait for district drpdown
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIso']" }, "10", "disabled");
    // select lima from district drpdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "LIMA");
    // wait for address line 1
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='address.line1']" }, "10", "disabled");
    // fill address line 1
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "prada desika");
    // wait for telephone number TF
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='address.phone']" }, "10", "disabled");
    // fill telephone number
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
    // wait for address submit
    waitUntil("CheckEnabledElement", new String[] { XPATH, "//button[@id='addressSubmit']" }, "20", "disabled");
    // click on address submit
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // wait untill COD
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//label[@for='belcorpNewCheckoutPaymentMode_belc_cash_delivery']" }, "10", "disabled");
    // start if statement
    if (isElementClickable(
      new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_belc_cash_delivery\"]" })) {
      // click on cash on delivery
      javascriptExecution(
        "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiobelc_cash_delivery.radiobelc_cash_deliveryPE > label\").click();");
      // click on cash on delivery checkbox
      javascriptExecution("document.querySelector(\"input#Terms1_cashOnDeliveryForm\").click();");
      // wait until submit button clickeble
      waitUntil("CheckEnabledElement", new String[] { CSS, "form#cashOnDeliveryForm button[type='button']" }, "10",
        "disabled");
      // click on submit
      javascriptExecution("document.querySelector(\"form#cashOnDeliveryForm button[type=\'button\']\").click();");
      // wait until success messgae
      waitUntil("CheckElement", new String[] { XPATH, "//div[@class='account-section']" }, "10", "disabled");
      // add assertion for successful COD
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"account-section\"]" }));
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"COD is not enabled\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Check_the_shipping_cost_and_delivery_time_criteriaCOneNineTwoNine() {
    javascriptExecution("lambda-name=Check the shipping cost and delivery time criteriaCOneNineTwoNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // add a product to cart and proceed to checkout
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
    // wait
    waitUntil("CheckElement", new String[] { XPATH, "//div[@class='headerRegisterUser']/span" }, "10", "disabled");
    // assert for user email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"headerRegisterUser\"]/span" }));
    // take a snip to verify shipping address stored
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
      "logs/Screenshots/sqbbrf.png");
    // take a snip to verify the delivery time and shipping cost
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"delivery_method\"]" },
      "logs/Screenshots/xbdAhM.png");
    // click on next address
    clickOnElement(new String[] { XPATH, "(//label[@for])[2]" });
    // wait
    waitUntil("CheckElement", new String[] { XPATH, "//div[@id='delivery_method']" }, "10", "disabled");
    // take a snip to verify the delivery time and shipping cost
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"delivery_method\"]" },
      "logs/Screenshots/zbiQyX.png");
    // add assertion for continue button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));

    status = "passed";
  }

  @Test
  public void Verify_the_criteria_as_a_Recurring_RegistrarCOneNineThreeFive() {
    javascriptExecution("lambda-name=Verify the criteria as a Recurring RegistrarCOneNineThreeFive");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // add a product to cart and proceed to checkout
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
    // assert for user email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"headerRegisterUser\"]/span" }));

    status = "passed";
  }
}