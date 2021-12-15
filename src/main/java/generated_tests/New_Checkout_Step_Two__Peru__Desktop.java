package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New_Checkout_Step_Two__Peru__Desktop extends WebDriverHelper {

  @Test
  public void Check_the_order_of_added_productsCTwoOnezeroFive() {
    javascriptExecution("lambda-name=Check the order of added productsCTwoOnezeroFive");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // Click on second  product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on checkout
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree to receive
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on I accept terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on Continue as guest
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // add assertion for right side see my products
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" }));
      // take a snip of see my product
      takeScreenshotOfParticularElement(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" },
        "logs/Screenshots/SwmqnL.png");
      // add assertion for oder details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // End If Statement
    }
    // Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available:");
      // End Else Statement
    }
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to  Consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // Click on second product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on checkout
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in last Name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree to receive
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on I accept terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on Continue as guest
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // add assertion for right side see my products
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" }));
      // take a snip of see my product
      takeScreenshotOfParticularElement(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" },
        "logs/Screenshots/zwJZqG.png");
      // add assertion for oder details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // End If
    }
    // Start else
    else {
      // product is not available
      printResults("PrintNote", "\"product is not available\"");
      // End else
    }

    status = "passed";
  }

  @Test
  public void Validate_that_it_does_not_impact_other_countriesCTwoOneTwoSeven() {
    javascriptExecution("lambda-name=Validate that it does not impact other countriesCTwoOneTwoSeven");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // Click on first product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on checkout
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree to receive
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on I accept terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on Continue as guest
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // add assertion for right side see my products
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" }));
      // take a snip of see my product
      takeScreenshotOfParticularElement(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" },
        "logs/Screenshots/vTJgAH.png");
      // if product present
      if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'name name-item\'])[3]" })) {
        // add assertion for product
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'name name-item\'])[3]" }));
        // end if product present
      }
      // add assertion for oder details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // add assertion for total with discounts
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'total\'])[1]" }));
      // add assertion for shipping cost
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'shipping\'])[1]" }));
      // add assertion for discount
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\'subtotals__item--state-discount\'])[2]" }));
      // End If Statement
    }
    // Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available:");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void CThreeFourzeroSix_Payment_with_Pago_Efectivo__Phase_Two() {
    javascriptExecution("lambda-name=CThreeFourzeroSix Payment with Pago Efectivo  Phase Two");

    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Scroll down
    scroll("ScrollDown", 1800);
    // if image present
    if (isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(6) > div > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > a > img" })) {
      // Click on img
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(6) > div > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > a > img" });
      // Click on Agregar a la bo...
      clickOnElement(new String[] { ID, "addToCartButton" });
      // Click on Ir a pagar
      clickOnElement(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
      // Click on Ir a pagar
      clickOnElement(new String[] { CSS,
        "button[id=\"checkout-display-continueCheckout\"][class=\"btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\"]" });
      // Click on guest.firstName...
      clickOnElement(new String[] { ID, "guest.firstName" });
      // Write text in guest.firstName...
      typeText(new String[] { ID, "guest.firstName" }, "kiruba");
      // Click on guest.lastName
      clickOnElement(new String[] { ID, "guest.lastName" });
      // Write text in guest.lastName
      typeText(new String[] { ID, "guest.lastName" }, "nithi");
      // Click on guest.email
      clickOnElement(new String[] { ID, "guest.email" });
      // Write text in guest.email
      typeText(new String[] { ID, "guest.email" }, "kirubanithi100@yahoo.com");
      // Click on guest.agreeToRe...
      clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
      // Click on guest.belcorpTo...
      clickOnElement(new String[] { ID, "guest.belcorpToC" });
      // Click on Continuar como ...
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Click on Departamento*
      clickOnElement(new String[] { XPATH, "(//span[@class=\"select2-selection select2-selection--single\"])[1]" });
      // Click on AMAZONAS
      clickOnElement(new String[] { XPATH, "(//span[@class=\"select2-results\"]/ul/li)[1]" });
      // Click on Provincia*
      clickOnElement(new String[] { XPATH, "(//span[@class=\"select2-selection select2-selection--single\"])[2]" });
      // Click on BAGUA
      clickOnElement(new String[] { XPATH, "(//span[@class=\"select2-results\"]/ul/li)[1]" });
      // Click on Distrito*
      clickOnElement(new String[] { XPATH, "(//span[@class=\"select2-selection select2-selection--single\"])[3]" });
      // Click on BAGUA
      clickOnElement(new String[] { XPATH, "(//span[@class=\"select2-results\"]/ul/li)[1]" });
      // Click on address.line1
      clickOnElement(new String[] { ID, "address.line1" });
      // Write text in address.line1
      typeText(new String[] { ID, "address.line1" }, "main road");
      // Click on address.line2
      clickOnElement(new String[] { ID, "address.line2" });
      // Write text in address.line2
      typeText(new String[] { ID, "address.line2" }, "near temp");
      // Click on address.referen...
      clickOnElement(new String[] { ID, "address.referencia" });
      // Write text in address.referen...
      typeText(new String[] { ID, "address.referencia" }, "bridge");
      // Click on address.phone
      clickOnElement(new String[] { ID, "address.phone" });
      // Write text in address.phone
      typeText(new String[] { ID, "address.phone" }, "987654321");
      // Click on Continuar
      clickOnElement(new String[] { ID, "addressSubmit" });
      // Click on newcheckout.add...
      clickOnElement(new String[] { CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_cash\"]" });
      // Click on Agentes y agenc...
      clickOnElement(new String[] { CSS, "label[for=\"mpago_agencia\"]" });
      // Click on Terms1_mpagoCas...
      clickOnElement(new String[] { ID, "Terms1_mpagoCashForm" });
      // Click on agreeToReceiveW...
      clickOnElement(new String[] { ID, "agreeToReceiveWhatsappNotificationsCheck_mpagoCashForm" });
      // Click on Pagar
      clickOnElement(
        new String[] { CSS, "button[type=\"button\"][class=\"btn btn-block submit_mpagoCashForm checkout-next\"]" });
      // if present
      if (isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" })) {
        // Add Assertion for ¡Gracias kiruba...
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
        // end if present
      }
      // end if image present
    }

    status = "passed";
  }

  @Test
  public void Verify_that_all_the_products_added_to_the_cart_appear_in_See_my_productsCTwoOnezeroThree() {
    javascriptExecution(
      "lambda-name=Verify that all the products added to the cart appear in See my productsCTwoOnezeroThree");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // Click on Second product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on checkout
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree to receive
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on I accept terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on Continue as guest
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // add assertion for right side see my products
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" }));
      // take a snip of see my product
      takeScreenshotOfParticularElement(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" },
        "logs/Screenshots/ylqajq.png");
      // End If Statement
    }
    // Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available:");
      // End Else Statement
    }
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to Consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // Click on second product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on checkout
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in last Name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree to receive
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on I accept terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on Continue as guest
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // add assertion for right side see my products
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" }));
      // take a snip of see my product
      takeScreenshotOfParticularElement(new String[] { CSS, "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form" },
        "logs/Screenshots/eZkQCP.png");
      // End If
    }
    // Start else
    else {
      // product is not available
      printResults("PrintNote", "\"product is not available\"");
      // End else
    }

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_Cart_DiscountsCTwoOneTwoFive() {
    javascriptExecution("lambda-name=Validate the total amount with Cart DiscountsCTwoOneTwoFive");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[2]" })) {
      // Click on first product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // click on checkout
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
      // Write text in firstName
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "purva");
      // Write text in lastName
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "gupta");
      // Write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "purvagupta@endtest-mail.io");
      // Click on agree to receive
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // Click on I accept terms and conditions
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // Click on Continue as guest
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // if product present
      if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'name name-item\'])[3]" })) {
        // add assertion for product
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'name name-item\'])[3]" }));
        // end if product present
      }
      // add assertion for oder details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // add assertion for total with cart discount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'total\'])[1]" }));
      // add assertion for discount
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\'subtotals__item--state-discount\'])[2]" }));
      // End If Statement
    }
    // Else Statement
    else {
      // Product is not available
      printResults("PrintNote", "\"product is not available:");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_cost_or_without_shipping_costCTwoOneTwoEight() {
    javascriptExecution("lambda-name=Validate the total amount with cost or without shipping costCTwoOneTwoEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // click on popup \"access exclusive offer\"
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // select one product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[4]" });
    // wait
    waitForTime(7);
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Assertion on shipping charge
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }));
    // Enter more product quantity to check free shipping offer
    typeText(new String[] { XPATH, "(//input[@id=\"quantity_0\"])[2]" }, "50");
    // Press ENTER key
    pressKey(new String[] { XPATH, "(//input[@id=\"quantity_0\"])[2]" }, "(//input[@id=\"quantity_0\"])[2]");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div[text()=\'Prueba envio gratis\']" })) {
      // Assertion on free shipping offer
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Prueba envio gratis\']" }));
      // End of if loop
    }
    // Click on confirm go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // refresh
    pageRefresh();
    // enter guest first name
    typeText(new String[] { XPATH, "//input[@name=\"firstName\"]" }, "riya");
    // Enter guest last name
    typeText(new String[] { XPATH, "//input[@name=\"lastName\"]" }, "patil");
    // Enter guest Email
    typeText(new String[] { XPATH, "//input[@name=\"email\"]" }, "cyzonapp11@gmail.com");
    // select checkbox
    clickOnElement(new String[] { XPATH, "//input[@name=\"belcorpToC\"]" });
    // Click on Continue
    clickOnElement(new String[] { XPATH, "(//button[@type=\"submit\"])[3]" });
    // scroll
    scroll("ScrollDown", 443);
    // Assertion on order details
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
    // Assertion on Total
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" }));
    // Assertion on shipping charge
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//dd[@id=\"delivery_price\"]" }));
    // end if add to cart present
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

  // click on personal care
  clickOnElement( new String[] {
    XPATH, "//a[text() = \"cuidado personal\"]"
  });

  // Click on one product
  clickOnElement( new String[] {
    XPATH, "(//a[@class=\"name\"])[4]"
  });
  // if add to cart present
if(

  isElementAvailable(new String[] {
    XPATH, "//button[@id=\'addToCartButton\']"
  }))

  {
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on Go Pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Assertion on shipping charge
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }));
    // Enter more product quantity to check free shipping offer
    typeText(new String[] { XPATH, "(//input[@id=\"quantity_0\"])[2]" }, "50");
    // Press ENTER key
    pressKey(new String[] { XPATH, "(//input[@id=\"quantity_0\"])[2]" }, "(//input[@id=\"quantity_0\"])[2]");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'GRATIS!!!!\')]" })) {
      // Assertion on free shipping offer
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'GRATIS!!!!\')]" }));
      // End of if loop
    }
    // Click on Confirm Go Pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // if guest first name visible
    if (isDisplayed(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, 0)) {
      // enter guest name
      typeText(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" }, "Photon");
      // Enter Guest last name
      typeText(new String[] { XPATH, "//input[@id=\"guest.lastName\"]" }, "Test");
      // Enter Guest Email id
      typeText(new String[] { XPATH, "//input[@id=\"guest.email\"]" }, "purvagupta@endtest-mail.io");
      // Click on checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\"guest.belcorpToC\"]" });
      // Click on Continue button
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block guestCheckoutBtn\"]" });
      // refresh
      pageRefresh();
      // Assertion on order details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
      // Assertion on Total
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" }));
      // Assertion on shipping amount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//dd[@id=\"delivery_price\"]" }));
      // end if guest user first name
    }

    status = "passed";
  }

  @Test
  public void Validate_the_total_amount_with_Product_DiscountsCTwoOneTwoSix() {
    javascriptExecution("lambda-name=Validate the total amount with Product DiscountsCTwoOneTwoSix");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // click on popup \"access exclusive offer\"
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // select one product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // wait
    waitForTime(7);
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Click on confirm go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // refresh
    pageRefresh();
    // enter guest first name
    typeText(new String[] { XPATH, "//input[@name=\"firstName\"]" }, "riya");
    // Enter guest last name
    typeText(new String[] { XPATH, "//input[@name=\"lastName\"]" }, "patil");
    // Enter guest Email
    typeText(new String[] { XPATH, "//input[@name=\"email\"]" }, "cyzonapp11@gmail.com");
    // select checkbox
    clickOnElement(new String[] { XPATH, "//input[@name=\"belcorpToC\"]" });
    // Click on Continue
    clickOnElement(new String[] { XPATH, "(//button[@type=\"submit\"])[3]" });
    // scroll
    scroll("ScrollDown", 443);
    // Assertion on order details
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
    // Assertion on subtotal
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"subtotal\"])[1]" }));
    // Assertion on Total
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"total\"])[1]" }));
    // Assertion on see my products
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "(//button[contains(text(),\'Ver mis productos\')])[1]" }));
    // click on expand symbol(+)
    javascriptExecution(
      "document.querySelector(\"div.multiSteps-widget.help-message-wrapper.hidden-md.hidden-lg > button#collapsible-button\").click();");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//span[contains(text(),\'GRATIS\')])[1]" })) {
      // Assertion on product discount gratis offer
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[contains(text(),\'GRATIS\')])[1]" }));
      // End of if loop
    }

    status = "passed";
  }
}