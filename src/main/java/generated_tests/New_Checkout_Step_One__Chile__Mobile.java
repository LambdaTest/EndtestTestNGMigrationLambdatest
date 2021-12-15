package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New_Checkout_Step_One__Chile__Mobile extends WebDriverHelper {

  @Test
  public void Check_criteria_of_the_Reference_fieldCTwoOneSixOne() {
    javascriptExecution("lambda-name=Check criteria of the Reference fieldCTwoOneSixOne");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "Jiron María");
    // write  text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "Parado de Bellido");
    // write  text in reference
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "/.>//");
    // start if statement for error message
    if (isElementAvailable(new String[] { XPATH, "//span[contains(@id,\'errors\')]" })) {
      // Add assertion for reference error
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[contains(@id,\'errors\')]" }));
      // end if statement
    }
    // start else statement
    else {
      // take screen shot to verify the error message
      takeScreenshot("logs/Screenshoots/aYptao.png");
      // end else statement
    }
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
      "logs/Screenshots/YMxitn.png");

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Dept_int__floor_fieldCTwoOneSixzero() {
    javascriptExecution("lambda-name=Check criteria of the Dept int  floor fieldCTwoOneSixzero");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "Jiron María");
    // write  text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "/.>//");
    // start if statement for error message
    if (isElementAvailable(new String[] { XPATH, "//span[contains(@id,\'errors\')]" })) {
      // Add assertion for Apartment / int / floor
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[contains(@id,\'errors\')]" }));
      // end if statement
    }
    // start else statement
    else {
      // take screen shot to verify error message
      takeScreenshot("logs/Screenshoots/GObens.png");
      // end else statement
    }
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
      "logs/Screenshots/qgPaWG.png");

    status = "passed";
  }

  @Test
  public void Verify_View_saved_addresses_as_Recurring_RegisteredCTwoOneSevenOne() {
    javascriptExecution("lambda-name=Verify View saved addresses as Recurring RegisteredCTwoOneSevenOne");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go   To Url
    getURL("https://s1-lbel.tiendabelcorp.com/cl/login");
    // add a product to cart and proceed to checkout
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
    // wait
    waitForTime(5);
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'title-widget\'])[1]" })) {
      // assert for shipping Address
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'title-widget\'])[1]" }));
      // take a snip to verify shipping address stored
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
        "logs/Screenshots/FvmNoo.png");
      // End If Statement
    }
    // Start Else Statement
    else {
      // Element not present
      printResults("PrintNote", "\"element is not peresent\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Check_the_shipping_cost_and_delivery_time_criteriaTwoOneSixFour() {
    javascriptExecution("lambda-name=Check the shipping cost and delivery time criteriaTwoOneSixFour");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
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
    // wait for hamburgur menu
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//button[@class='navbar-toggle js-toggle-sm-navigation']" }, "10", "disabled");
    // add a product to cart and proceed to checkout
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
    // wait for  user email
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='headerRegisterUser']/span" }, "10",
      "disabled");
    // assert for user email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"headerRegisterUser\"]/span" }));
    // take a snip to verify shipping address stored
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
      "logs/Screenshots/vaCLNn.png");
    // take a snip to verify the delivery time and shipping cost
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"delivery_method\"]" },
      "logs/Screenshots/SZdLGe.png");
    // click on next address
    clickOnElement(new String[] { XPATH, "(//label[@for])[2]" });
    // wait for page load
    waitForTime(5);
    // take a snip to verify the delivery time and shipping cost
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"delivery_method\"]" },
      "logs/Screenshots/PXmnVL.png");

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_Cart_DiscountsCTwoTwoOneTwo() {
    javascriptExecution("lambda-name=Validate the total amount with Cart DiscountsCTwoTwoOneTwo");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Inicia sesión | Registrate aquí\'])[2]" });
    // enter registered id
    typeText(new String[] { XPATH, "//input[@name=\"j_username\"]" }, "test_user_86292523@testuser.com");
    // enter registered password
    typeText(new String[] { XPATH, "//input[@name=\"j_password\"]" }, "Qatest2042");
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//button[@type=\"button\"])[7]" });
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // click on popup \"access exclusive offer\"
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[1]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[5]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[11]" });
    // wait
    waitForTime(3);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\' Ir a pagar\')]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'Ir a pagar\')])[2]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" })) {
      // Assertion on order details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"subtotals__item--state-discount\"])[1]" })) {
      // Assertion on Cart Discount amount
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\"subtotals__item--state-discount\"])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" })) {
      // Assertion on Total amount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_cost_or_without_shipping_costCTwoTwoOneOne() {
    javascriptExecution("lambda-name=Validate the total amount with cost or without shipping costCTwoTwoOneOne");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Inicia sesión | Registrate aquí\'])[2]" });
    // enter registered id
    typeText(new String[] { XPATH, "//input[@name=\"j_username\"]" }, "test_user_86292523@testuser.com");
    // enter registered password
    typeText(new String[] { XPATH, "//input[@name=\"j_password\"]" }, "Qatest2042");
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//button[@type=\"button\"])[7]" });
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // click on popup \"access exclusive offer\"
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[1]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[5]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[11]" });
    // wait
    waitForTime(3);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\' Ir a pagar\')]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on go pay
    clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'Ir a pagar\')])[2]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" })) {
      // Assertion on order details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" })) {
      // Assertion on Total
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//dd[@id=\"delivery_price\"]" })) {
      // Assertion on shipping amount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//dd[@id=\"delivery_price\"]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Check_the_order_of_the_added_productsCTwoOneNineEight() {
    javascriptExecution("lambda-name=Check the order of the added productsCTwoOneNineEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Inicia sesión | Registrate aquí\'])[2]" });
    // enter registered id
    typeText(new String[] { XPATH, "//input[@name=\"j_username\"]" }, "test_user_86292523@testuser.com");
    // enter registered password
    typeText(new String[] { XPATH, "//input[@name=\"j_password\"]" }, "Qatest2042");
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//button[@type=\"button\"])[7]" });
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // click on popup \"access exclusive offer\"
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[1]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[5]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[11]" });
    // wait
    waitForTime(3);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\' Ir a pagar\')]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on confirm go pay
    clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'Ir a pagar\')])[2]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" })) {
      // Assertion on order details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { CSS,
      "div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > button#collapsible-button" })) {
      // click on expand symbol(+)
      javascriptExecution(
        "document.querySelector(\"div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > button#collapsible-button\").click();");
      // Assertion on first product
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"name name-item\"])[1]" }));
      // Assertion on 2nd product
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"name name-item\"])[2]" }));
      // Assertion on 3rd product
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"name name-item\"])[3]" }));
      // Assertion on 4th product
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"name name-item\"])[4]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_Product_DiscountsCTwoTwoOneThree() {
    javascriptExecution("lambda-name=Validate the total amount with Product DiscountsCTwoTwoOneThree");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // If statement to Handle popup
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // click on hamburger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Inicia sesión | Registrate aquí\'])[2]" });
    // enter registered id
    typeText(new String[] { XPATH, "//input[@name=\"j_username\"]" }, "test_user_86292523@testuser.com");
    // enter registered password
    typeText(new String[] { XPATH, "//input[@name=\"j_password\"]" }, "Qatest2042");
    // Click on login button
    clickOnElement(new String[] { XPATH, "(//button[@type=\"button\"])[7]" });
    // click on menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // click on popup \"access exclusive offer\"
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[1]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[5]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'   Seguir Comprando\')]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "(//span[text()=\'Agregar a la bolsa\'])[11]" });
    // wait
    waitForTime(3);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\' Ir a pagar\')]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on confirm go pay
    clickOnElement(new String[] { XPATH, "(//button[contains(text(),\'Ir a pagar\')])[2]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" })) {
      // Assertion on order details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"subtotal\"])[1]" })) {
      // Assertion on subtotal
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"subtotal\"])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" })) {
      // Assertion on Total
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//button[contains(text(),\'Ver mis productos\')])[1]" })) {
      // Assertion on see my products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//button[contains(text(),\'Ver mis productos\')])[1]" }));
      // click on expand symbol(+)
      javascriptExecution(
        "document.querySelector(\"div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > button#collapsible-button\").click();");
      // End of if loop
    }
    // start of if loop to check gratis offer
    if (isElementAvailable(new String[] { XPATH, "(//span[contains(text(),\'GRATIS\')])[1]" })) {
      // Assertion on product discount gratis offer
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[contains(text(),\'GRATIS\')])[1]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Contact_phone_fieldCTwoOneSixTwo() {
    javascriptExecution("lambda-name=Check criteria of the Contact phone fieldCTwoOneSixTwo");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "Jiron María");
    // write  text in Apartment / int / floor
    typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "Parado de Bellido");
    // write  text in reference
    typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "hilton sylvie");
    // write  text in  Contact phone field
    typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "/.>//");
    // start if statement for error message
    if (isElementAvailable(new String[] { XPATH, "//span[contains(@id,\'errors\')]" })) {
      // Add assertion for  Contact phone field error
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[contains(@id,\'errors\')]" }));
      // end if statement
    }
    // start else staement
    else {
      // take screen shot for error message
      takeScreenshot("logs/Screenshoots/ERzkeh.png");
      // end else statement
    }
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
      "logs/Screenshots/MchsDG.png");

    status = "passed";
  }

  @Test
  public void Verify_My_Addresses_as_Recurring_RegistrarCTwoOneSevenzero() {
    javascriptExecution("lambda-name=Verify My Addresses as Recurring RegistrarCTwoOneSevenzero");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URl
    getURL("https://s1-lbel.tiendabelcorp.com/cl/login");
    // add a product to cart and proceed to checkout
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
    // wait
    waitForTime(5);
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" })) {
      // take a snip to verify my  address stored
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'deliveryAddressesSelector\']" },
        "logs/Screenshots/zMcREi.png");
      // add assertion for my addresses
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\"newAddressAlert5\"]" }));
      // click on my address link
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
        "logs/Screenshots/VVhHTx.png");
      // End  If Statement
    }
    // Start Else Statement
    else {
      // Element not present
      printResults("PrintNote", "\"element is not peresent\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Check_criteria_for_Department__Province__DistrictCTwoOneFiveEight() {
    javascriptExecution("lambda-name=Check criteria for Department  Province  DistrictCTwoOneFiveEight");

    // Clear Cache Cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Add a Product and Proceed to Checkout
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
    // Wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIsoParent2']" }, "30",
      "disabled");
    // Select From Region Option
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "CL-REG-02");
    // Take a Snip to Verify By Filling lvl 1 lvl 2 is Enabled
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/EZSfzM.png");
    // Add  Assertion For Region Dropdown
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }));
    // Click On Commune
    clickOnElement(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" });
    // Take a Snip To Verify by Skipping lvl 2 lvl3 Options Are Not Enabled
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/HVXNmq.png");
    // Wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIsoParent1']" }, "30",
      "disabled");
    // Select Option From Commune
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "ANTOFAGASTA");
    // Take a Snip To Verify Filling lvl1 and 2 Enables lvl 3
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/IjBIEI.png");
    // Add Assertion For Commune Dropdown
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }));
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='address.regionIso']" }, "30", "disabled");
    // Select From Location Dropdown
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "ANTOFAGASTA-ANTOFAGASTA");
    // Take a Snip To Verify Location and All lvl1,2,3 is Filled
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"i18nAddressForm\"]" },
      "logs/Screenshots/ToaJVg.png");
    // Add Assertion for Location Dropdown
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }));

    status = "passed";
  }

  @Test
  public void Check_criteria_of_the_Address_fieldCTwoOneFiveNine() {
    javascriptExecution("lambda-name=Check criteria of the Address fieldCTwoOneFiveNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // select product and proceed upto checkout
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
    // write  text in address text field
    typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "/.>//");
    // start if statement for error message
    if (isElementAvailable(new String[] { XPATH, "//span[contains(@id,\'errors\')]" })) {
      // Add assertion for adress line error
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[contains(@id,\'errors\')]" }));
      // end if statement
    }
    // else statement
    else {
      // take screen shot to verify the error message
      takeScreenshot("logs/Screenshoots/rNBszk.png");
      // end else
    }
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
      "logs/Screenshots/fOZoeX.png");

    status = "passed";
  }
}