package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FB_test_cases___from_regression extends WebDriverHelper {

  @Test
  public void MTO_Login_with_Facebook_for_the_first_time_C_C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on Rose D’Amelie P
    clickOnElement(new String[] { XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]" });
    // Add Assertion for Rose D’Amelie P...
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Add Assertion for old price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class='simple-price-container hidden-xs hidden-sm']/child::span[@class='old-price']" }));
    // Add assertion for active price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class='simple-price-container hidden-xs hidden-sm']/child::span[@class='active-price']" }));
    // click on add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // Add assertion for add to cart
    Assert.assertTrue(isElementAvailable(new String[] { ID, "pdpAddtoCartInput" }));
    // Click on go pay
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // Click on  go pay checkout
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1)" });
    // Add Assertion for go pay checkout
    Assert.assertTrue(isElementAvailable(new String[] { ID, "checkout-display-continueCheckout" }));
    // Add Assertion for remove link
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//div[@class='item__remove-action']/child::div/child::a[text()='Eliminar']" }));
    // Add Assertion for Price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Precio\"]" }));
    // Add Assertion for Total
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Total\"]" }));
    // Add assertion for  Product Title
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "p[class=\"cart-items-title\"]" }));
    // Click on go pay continue
    clickOnElement(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // add assertion for social network
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]" }));
    // login fb
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
    // wait
    waitForTime(3);
    // refresh page
    pageRefresh();
    // if \"go pay\" is present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class='actions']/child::button[@id='checkout-display-continueCheckout']" })) {
      // click on go pay button
      clickOnElement(
        new String[] { XPATH, "//div[@class='actions']/child::button[@id='checkout-display-continueCheckout']" });
      // end if go pay present
    }
    // select dpartment
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-11");
    // select province
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "11-BAGUA");
    // select district
    selectOption(new String[] { ID, "address.regionIso" }, "BAGUA-ARAMANGO");
    // write direction
    typeText(new String[] { ID, "address.line1" }, "Next to civil line");
    // write phone no
    typeText(new String[] { ID, "address.phone" }, "9425243478");
    // click submit button
    clickOnElement(new String[] { XPATH, "//button[@id='addressSubmit']" });
    // click continue submit button
    clickOnElement(new String[] { XPATH, "//button[@id='deliveryMethodSubmit']" });
    // select payment option
    selectOption(new String[] { XPATH, "//select[@id='paymentOptions']" }, "mpago_cash");
    // click on agent and agencies
    clickOnElement(new String[] { XPATH, "//div[@id='mpago_accordion-inner-headingTwo']" });
    // click on submit
    clickOnElement(new String[] { XPATH,
      "//button[@class='btn btn-magenta btn-primary btn-block submit_mpagoCashForm checkout-next']" });
    // click on terms1
    clickOnElement(new String[] { XPATH, "//input[@id='Terms1']" });
    // Validate \"place order\"  button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id='placeOrder']" }));
    // click on \"place order\" button
    clickOnElement(new String[] { XPATH, "//button[@id='placeOrder']" });

    status = "passed";
  }

  @Test
  public void ECOM_Login_with_Facebook_previously_registeredCC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // launch URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on user icon
    clickOnElement(new String[] { XPATH, "//li[@class=\"liOffcanvas bicHeaderLinks-container\"]" });
    // Assertion on \"login with registered user on fb\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//span[text()='Ingresar con Facebook']" }));
    // login as fb user
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
    // Assertion on  registered account
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\"logged_in js-logged_in\"]" }));
    // select fragrance category
    clickOnElement(new String[] { XPATH, "//a//p[text()='fragancias']" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[11]" });
    // add product to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),' Ir a pagar')]" });
    // Assertion on checkout
    Assert.assertTrue(getText(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" }).contains(
      "Ir a pagar"));
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });

    status = "passed";
  }

  @Test
  public void ECOMLogin_with_FacebookC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on one  product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on go pay
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // Assertion on  \"login with fb\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"btn btn-facebook btn-block pe\"]" }));
    // login as fb user
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
    // refresh
    pageRefresh();

    status = "passed";
  }

  @Test
  public void MTO_Cancellation_of_Facebook_account_linkCC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on Rose D’Amelie P
    clickOnElement(new String[] { XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]" });
    // click on add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Click on  go pay checkout
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1)" });
    // Click on go pay continue
    clickOnElement(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // Click on  login facebook
    clickOnElement(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]" });
    // switch to child window
    switchToNextWindow();
    // Write text in email
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Write text in pass
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "123");
    // click on Login button for facebook
    clickOnElement(new String[] { ID, "loginbutton" });
    // switch to parent window
    switchToPreviousTab();

    status = "passed";
  }

  @Test
  public void Purchase_in_virtual_store__login_with_facebook_credit_cardC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Assertion on consultant
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"consultant-name\"]" }));
    // Click on  personal care category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH,
      "//li//div//div//div[@class='nav-cart']//div//div[@class='add-to-cart add-to-cart-cross']//a[contains(text(),'     Seguir Comprando')]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-lbel']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "lipstick");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // select one product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cyzone
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-cyzone']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "rose");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\"mini-cart-icon\"])[1]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // go forward
    goForward();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" });
      // End of if loop
    }
    // Wait
    waitUntil("CheckElement", new String[] { ID, "checkout-add-new-address" }, "15", "disabled");
    // Click on add new address
    clickOnElement(new String[] { ID, "checkout-add-new-address" });
    // Select  address
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "PE-DEP-11");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name='regionIsoParent1']" }, "11-BAGUA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name='regionIso']" }, "BAGUA-ARAMANGO");
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
    // start of if loop
    if (isElementAvailable(new String[] { ID, "docTypeRegister" })) {
      // Select RUT document type
      selectOption(new String[] { ID, "docTypeRegister" }, "2");
      // Write text in document type
      typeText(new String[] { ID, "docNumberRegister" }, "712345667");
      // Click on Continue
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-black btn-block m-t-16\"]" });
      // End of if loop
    }
    // Select credit card payment
    // click on credit cart
    clickOnElement(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" });
    // Write text in card holder Name
    typeText(new String[] { XPATH, "//input[@id='cardholderName']" }, "APRO");
    // Write text in card Number
    typeText(new String[] { XPATH, "//input[@id='cardNumber']" }, "5031755734530604");
    // Select expiry month
    selectOption(new String[] { XPATH, "//select[@id='expirationMonth']" }, "11");
    // Select expiry year
    selectOption(new String[] { XPATH, "//select[@id='expirationYear']" }, "2025");
    // Write cvv number
    typeText(new String[] { XPATH, "//input[@id='securityCode']" }, "123");
    // Select document type
    selectOption(new String[] { XPATH, "//select[@id='docType']" }, "Otro");
    // Write text in docNumber
    typeText(new String[] { XPATH, "//input[@id='docNumber']" }, "12345678");
    // Click on Terms1
    clickOnElement(new String[] { XPATH, "//input[@id='Terms1_mpagoCreditCardForm']" });
    // Click on pay button
    clickOnElement(new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoForm checkout-next']" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//p//b[text()='ec.esc2.mto.fb@gmail.com']" })) {
      // Assertion on fb registered mail
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//p//b[text()='ec.esc2.mto.fb@gmail.com']" }));
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"alert alert-danger payment-error-message\"])[2]" })) {
      // Assertion on Error message
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\"alert alert-danger payment-error-message\"])[2]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void MTO_Link_Facebook_accountC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=hohammed");
    // click on cyzone
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img" });
    // click on user symbol
    clickOnElement(new String[] { XPATH, "//a[@class='cms-image-link']" });
    // scroll to login with fb button
    scrollIntoElementView(new String[] { CSS, "div[id='loginFB']" });
    // click on login with facebook
    clickOnElement(new String[] { ID, "loginFB" });
    // switch to window
    switchToNextWindow();
    // Write text in email-positive scenario
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Write text in password-negative scenario
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "srd123");
    // Click on login button for facebook
    clickOnElement(new String[] { NAME, "login" });
    // pause
    waitForTime(5);
    // clear text from email text box
    clearText(new String[] { CSS, "input[type=\"text\"]" });
    // write text in email textbox-negative scenario
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc@gmail.com");
    // write text in password textbox-positive scenario
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
    // click on login button
    clickOnElement(new String[] { NAME, "login" });
    // wait
    waitForTime(3);
    // Write text in email-negative scenario
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc@gmail.com");
    // write text in password-negative scenario
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp12");
    // click on login button
    clickOnElement(new String[] { NAME, "login" });
    // wait
    waitForTime(3);
    // close child window
    closeTab();
    // Add Assertion for create new account  ection
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),'Crea tu nueva cuenta')]" }));

    status = "passed";
  }

  @Test
  public void ECSCENARIO__Purchase_in_virtual_store__log_in_with_FB_User__Cash_PaymentC__C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Add Assertion for consultant banner present
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class='consultant-info']" }));
    // Click on commercial banner
    clickOnElement(new String[] { XPATH, "//span[@class='consultant-info']" });
    // Add Assertion for consultant name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class='consultant-name']" }));
    // Add Assertion for consultant email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='consultant-mail']" }));
    // Add Assertion For Consultant phone
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='consultant-phone']" }));
    // Click on close popup
    clickOnElement(new String[] { XPATH, "//button[@id='cboxClose']" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title='Perfumes']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class='name'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),'Agregar a la bolsa')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Add Assertion for total price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='priceContainer']/span" }));
    // Click on go pay button for checkout
    clickOnElement(new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" });
    // click on login with facebook
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
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" }, "20", "ten");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" })) {
      // click on go pay button
      clickOnElement(new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" });
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"go pay button is not present\"");
      // end else statement
    }
    // Click on go pay button for checkout using consultant
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
    // Add Assertion for shipping address page
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class='title'])[1]" }));
    // click on cyzone
    clickOnElement(new String[] { XPATH, "(//a[@id='lnk-sup-cyzone'])[2]" });
    // click on cart symbol
    clickOnElement(new String[] { XPATH, "(//div[@class='mini-cart-icon'])[1]" });
    // Add Assertion for cart is not empty
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"item__name\"]" }));
    // navigate backward
    goBack();
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title='Perfumes'])[1]" });
    // Click on third product
    clickOnElement(new String[] { XPATH, "(//a[@class='name'])[3]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),'Agregar a la bolsa')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Seguir Comprando')]" });
    // Click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id='lnk-sup-esika'])[2]" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title='Perfumes']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class='name'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),'Agregar a la bolsa')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" });
    // click on go pay button for checkout with consultant
    clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
    // Write text in address document
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(2) > input" },
      "1234567890");
    // Write text in address billing name
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(3) > input" },
      "soumya");
    // Select Option from provnce dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(1) > div > select" },
      "000023");
    // Select Option from canton dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(2) > div > select" },
      "000023000006");
    // Select Option from sector dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(3) > div > select" },
      "000023000006000053");
    // Write text in address line1
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(4) > input" },
      "bengaluru");
    // Write text in address line2
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(5) > input" },
      "n70-306");
    // Write text in address secondary street
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(6) > input" },
      "vanivihar");
    // Write text in address neighbourhood
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(7) > input" },
      "rasulgarh");
    // Write text in address postal code
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(10) > input" },
      "100");
    // Write text in address phone
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(16) > input" },
      "7867876788");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Add Assertion for Subtotal
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"subtotal\"]" }));
    // Click on CLICK AQUÍ PARA...
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Select Option from Payment Method Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" },
      "belpay_credit");
    // Write text in cardNumber
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" },
      "4168818844447115");
    // Select Option from month dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" },
      "12");
    // Select Option from Year dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(2) > select" },
      "2025");
    // Write text in cardholderName
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(7) > input" },
      "APRO");
    // Write text in securityCode
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(9) > input" },
      "123");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // wait
    waitUntil("CheckEnabledElement", new String[] { ID, "Terms1" }, "10", "disabled");
    // Click on Terms1
    clickOnElement(new String[] { ID, "Terms1" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[text() = ' Finalizar tu compra']" }, "10",
      "disabled");
    // Click on Finalize your purchase
    clickOnElement(new String[] { XPATH, "//button[text() = \" Finalizar tu compra\"]" });
    // Add Assertion For successful purchase message
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='checkout-success__body__headline']" }));
    // Add Assertion for ec.esc2.mto.fb@...
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div > div:nth-of-type(1) > div > div > div:nth-of-type(2) > p:nth-of-type(2) > b" }));
    // Add Assertion for ec.esc2.mto.fb@...
    Assert.assertTrue(
      getText(new String[] { XPATH, "//b[text()='ec.esc2.mto.fb@gmail.com']" }).contains("ec.esc2.mto.fb@gmail.com"));
    // open new tab
    openNewTab("OpenNewTab");
    pageRefresh();
    // Enter Mailinator URL
    getURL("https://www.mailinator.com/");
    // Write Text In search bar text field
    typeText(new String[] { XPATH, "//input[@class='form-control input-text h-auto']" }, "ec.esc2.mto.fb@gmail.com");
    // press enter key
    pressKey(new String[] { XPATH, "//input[@class='form-control input-text h-auto']" },
      "//input[@class='form-control input-text h-auto']");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "(//tr[@ng-repeat='email in emails'])[1]" }, "120", "ten");
    // click on first email
    clickOnElement(new String[] { XPATH, "(//tr[@ng-repeat=\"email in emails\"])[1]" });
    // take screenshot
    takeScreenshot("logs/Screenshoots/lYxPNM.png");

    status = "passed";
  }

  @Test
  public void Purchase_in_virtual_store__login_with_facebook_credit_cardcC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Assertion on consultant
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"consultant-name\"]" }));
    // Click on  personal care category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH,
      "//li//div//div//div[@class='nav-cart']//div//div[@class='add-to-cart add-to-cart-cross']//a[contains(text(),'     Seguir Comprando')]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-lbel']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "lipstick");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // select one product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cyzone
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-cyzone']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "rose");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\"mini-cart-icon\"])[1]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // go forward
    goForward();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" });
      // End of if loop
    }
    // Select address1
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "ATLANTICO");
    // Select address2
    selectOption(new String[] { ID, "address.regionIso" }, "GALAPA");
    // Write text in direction textbox
    typeText(new String[] { ID, "address.line1" }, "14,west side");
    // Write text in telephone number textbox
    typeText(new String[] { ID, "address.phone" }, "12345667");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // Click on confirm continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { ID, "register.documentType" })) {
      // Select  document type
      selectOption(new String[] { ID, "docTypeRegister" }, "Pasaporte");
      // Write text in document type
      typeText(new String[] { ID, "register.documentNumber" }, "6742345678");
      // Click on Continue
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-black btn-block\"]" });
      // End of if loop
    }
    // Select payment method option
    selectOption(new String[] { ID, "paymentOptions" }, "2");
    // Write credit card number
    typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" },
      "4013540682746260");
    // Select expiry month
    selectOption(new String[] { ID, "expirationMonth" }, "11");
    // Select expiry year
    selectOption(new String[] { ID, "expirationYear" }, "2025");
    // Write card holder name
    typeText(new String[] { ID, "cardholderName" }, "APRO");
    // Write security code
    typeText(new String[] { ID, "securityCode" }, "123");
    // Click on Continue
    clickOnElement(
      new String[] { XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_mpagoForm checkout-next\"])[1]" });
    // Click on Terms1
    clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
    // Click on Pay Button
    clickOnElement(new String[] { XPATH, "//button[text() = \" Pagar\"]" });
    // Assertion on consulting firm
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]" }));
    // Assertion on fb registered mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//p//b[text()='ec.esc2.mto.fb@gmail.com']" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/bela/p/200098267/tiendaprueba");
    // Assertion on consultant
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"consultant-name\"]" }));
    // Click on  personal care category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH,
      "//li//div//div//div[@class='nav-cart']//div//div[@class='add-to-cart add-to-cart-cross']//a[contains(text(),'     Seguir Comprando')]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-lbel']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "lipstick");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // select one product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cyzone
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-cyzone']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "rose");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\"mini-cart-icon\"])[1]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // go forward
    goForward();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" });
      // End of if loop
    }
    // Write text in postal code
    typeText(new String[] { ID, "address.postalCode" }, "45668");
    // Write text in street address
    typeText(new String[] { ID, "address.line1" }, "14,west side");
    // Write text in telephone number textbox
    typeText(new String[] { ID, "address.phone" }, "12345667");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // Wait
    waitUntil("CheckElement", new String[] { XPATH, "//button[@class='btn btn-magenta btn-block checkout-next']" },
      "15", "disabled");
    // Click on confirm continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='paymentOptions']" }, "15", "disabled");
    // Select payment method option
    selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "2");
    // Write text in credit card number
    typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" },
      "4168818844447115");
    // Write text in document number textbox
    typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456722234");
    // Select expiry month
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
    // Select expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
    // Write text in card holder textbox
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
    // Write text in security code textbox
    typeText(new String[] { ID, "securityCode" }, "123");
    // Click on Continue
    clickOnElement(
      new String[] { XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_mpagoForm checkout-next\"])[1]" });
    // Click on checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"Terms1\"]" });
    // Click on place order button
    clickOnElement(new String[] { XPATH, "//button[@id=\"placeOrder\"]" });
    // Assertion on consulting firm
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]" }));
    // Assertion on fb registered mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//p//b[text()='ec.esc2.mto.fb@gmail.com']" }));
    // Clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pa/crema-hidratante-facial-en-gel-skin-first/p/200097894/VICTOR23");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-lbel']" });
    // Assertion on consultant
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"consultant-name\"]" }));
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-black btn-block js-enable-btn js-add-to-cart\"]" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH,
      "//li//div//div//div[@class='nav-cart']//div//div[@class='add-to-cart add-to-cart-cross']//a[contains(text(),'     Seguir Comprando')]" });
    // refresh
    pageRefresh();
    // Click on cyzone
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-cyzone']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "lipstick");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // select one product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\"mini-cart-icon\"])[1]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // go forward
    goForward();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" });
      // End of if loop
    }
    // Select address1
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "COCLE");
    // Wait
    waitUntil("CheckClickableElement", new String[] { ID, "address.regionIsoParent1" }, "15", "disabled");
    // Select address2
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "NATA");
    // Wait
    waitUntil("CheckClickableElement", new String[] { ID, "address.regionIso" }, "15", "disabled");
    // Select address3
    selectOption(new String[] { ID, "address.regionIso" }, "EL CAÑO");
    // Write text in district textbox
    typeText(new String[] { ID, "address.district" }, "panama");
    // Write text in street textbox
    typeText(new String[] { ID, "address.line1" }, "14,west side");
    // Write text in reference textbox
    typeText(new String[] { ID, "address.referencia" }, "werhj");
    // Write text in telephone number textbox
    typeText(new String[] { ID, "address.phone" }, "12345667");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // Wait
    waitUntil("CheckElement", new String[] { XPATH, "//button[@class='btn btn-magenta btn-block checkout-next']" },
      "15", "disabled");
    // Click on confirm continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@id='paymentOptions']" }, "15", "disabled");
    // Select payment method option
    selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "1");
    // Write text in credit card number
    typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" },
      "4168818844447115");
    // Write text in document number textbox
    typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456722234");
    // Select expiry month
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
    // Select expiry year
    selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
    // Write text in card holder textbox
    typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
    // Write text in security code textbox
    typeText(new String[] { ID, "securityCode" }, "123");
    // Click on Continue
    clickOnElement(
      new String[] { XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_belpayForm checkout-next\"])[1]" });
    // Click on checkbox
    clickOnElement(new String[] { XPATH, "//input[@id=\"Terms1\"]" });
    // Click on place order button
    clickOnElement(new String[] { XPATH, "//button[@id=\"placeOrder\"]" });
    // Assertion on consulting firm
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]" }));
    // Assertion on fb registered mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//p//b[text()='ec.esc2.mto.fb@gmail.com']" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/vibranza/p/200098673/MaryEmy");
    // Assertion on consultant
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"consultant-name\"]" }));
    // Click on  personal care category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH,
      "//li//div//div//div[@class='nav-cart']//div//div[@class='add-to-cart add-to-cart-cross']//a[contains(text(),'     Seguir Comprando')]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-lbel']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "lipstick");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // select one product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cyzone
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-cyzone']" });
    // write text in  searchbox
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "rose");
    // Click on search icon
    clickOnElement(new String[] { XPATH, "(//i[@class=\"glyphicon glyphicon-search\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\"mini-cart-icon\"])[1]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // go forward
    goForward();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" });
      // End of if loop
    }
    // Wait
    waitUntil("CheckElement", new String[] { ID, "checkout-add-new-address" }, "15", "disabled");
    // Click on add new address
    clickOnElement(new String[] { ID, "checkout-add-new-address" });
    // Select  address
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
    // start of if loop
    if (isElementAvailable(new String[] { ID, "docTypeRegister" })) {
      // Select RUT document type
      selectOption(new String[] { ID, "docTypeRegister" }, "2");
      // Write text in document type
      typeText(new String[] { ID, "docNumberRegister" }, "712345667");
      // Click on Continue
      clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-black btn-block m-t-16\"]" });
      // End of if loop
    }
    // Select credit card payment
    // if credit card present
    if (isElementAvailable(new String[] { CSS,
      "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" })) {
      // click on credit cart
      clickOnElement(new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)" });
      // Write text in card holder Name
      typeText(new String[] { XPATH, "//input[@id='cardholderName']" }, "APRO");
      // Write text in card Number
      typeText(new String[] { XPATH, "//input[@id='cardNumber']" }, "5160033004714834");
      // Select expiry month
      selectOption(new String[] { XPATH, "//select[@id='expirationMonth']" }, "11");
      // Select expiry year
      selectOption(new String[] { XPATH, "//select[@id='expirationYear']" }, "2025");
      // Write cvv number
      typeText(new String[] { XPATH, "//input[@id='securityCode']" }, "123");
      // Select document type
      selectOption(new String[] { XPATH, "//select[@id='docType']" }, "Otro");
      // Write text in docNumber
      typeText(new String[] { XPATH, "//input[@id='docNumber']" }, "12345678");
      // Click on Terms1
      clickOnElement(new String[] { XPATH, "//input[@id='Terms1_mpagoCreditCardForm']" });
      // Click on pay button
      clickOnElement(new String[] { XPATH, "//button[@class='btn btn-block submit_mpagoForm checkout-next']" });
      // end if
    }
    // Assertion on consulting firm
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]" }));
    // Assertion on fb registered mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//p//b[text()='ec.esc2.mto.fb@gmail.com']" }));

    status = "passed";
  }

  @Test
  public void ECOM_Login_with_Facebook_for_the_first_time__C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Cuidado personal
    clickOnElement(new String[] { XPATH,
      "//div[@class='category_menu_item_principal nav__link']/../..//a[@title='Cuidado personal']" });
    // click on product
    clickOnElement(new String[] { XPATH, "//a[@id='product_thumb_200097893']" });
    // click on add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Click on  go pay checkout
    clickOnElement(
      new String[] { XPATH, "//div[@class='actions']/child::button[@id='checkout-display-continueCheckout']" });
    // login fb
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
    // wait
    waitForTime(3);
    // refresh page
    pageRefresh();
    // if department present
    if (isElementAvailable(new String[] { ID, "address.regionIsoParent2" })) {
      // select dpartment
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-11");
      // select province
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "11-BAGUA");
      // select district
      selectOption(new String[] { ID, "address.regionIso" }, "BAGUA-ARAMANGO");
      // write direction
      typeText(new String[] { ID, "address.line1" }, "Next to civil line");
      // write phone no
      typeText(new String[] { ID, "address.phone" }, "9425243478");
      // click submit button
      clickOnElement(new String[] { XPATH, "//button[@id='addressSubmit']" });
      // click continue submit button
      clickOnElement(new String[] { XPATH, "//button[@id='deliveryMethodSubmit']" });
      // select payment option
      selectOption(new String[] { XPATH, "//select[@id='paymentOptions']" }, "mpago_cash");
      // click on agent and agencies
      clickOnElement(new String[] { XPATH, "//div[@id='mpago_accordion-inner-headingTwo']" });
      // click on submit
      clickOnElement(new String[] { XPATH,
        "//button[@class='btn btn-magenta btn-primary btn-block submit_mpagoCashForm checkout-next']" });
      // click on terms1
      clickOnElement(new String[] { XPATH, "//input[@id='Terms1']" });
      // Validate \"place order\"  button
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id='placeOrder']" }));
      // click on \"place order\" button
      clickOnElement(new String[] { XPATH, "//button[@id='placeOrder']" });
      // end if department
    }

    status = "passed";
  }

  @Test
  public void MTO_Linking_accounts_with_FacebookCC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // launch URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
    // click on user icon
    clickOnElement(new String[] { XPATH, "//li[@class=\"liOffcanvas bicHeaderLinks-container\"]" });
    // Assertion on \"login with registered user on fb\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//span[text()='Ingresar con Facebook']" }));
    // login as fb user
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
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//span[text()='Ingresar con Facebook']" })) {
      // Assertion on my registered account
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//span[text()='Ingresar con Facebook']" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void MTO_Login_with_Facebook_previously_registeredC() {
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Click on user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > a > img" });
    // scroll to facebook button
    scrollIntoElementView(new String[] { CSS, "div[id='loginFB']" });
    // Click on login with facebook
    clickOnElement(new String[] { ID, "loginFB" });
    // Switch to next tab
    switchToNextWindow();
    // Write text in email
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Write text in pass
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
    // Click on login with fb
    clickOnElement(new String[] { NAME, "login" });
    // switch to previous tab
    switchToPreviousTab();
    // pause
    waitForTime(3);
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Men Active
    clickOnElement(new String[] { XPATH, "//a[@id=\"product_productName_200093883\"]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),'Agregar a la bolsa')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" })) {
      // Click on go pay button for checkout as consultant
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
      // end if
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Add Assertion for checkout page is displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='checkout-headline co']" }));

    status = "passed";
  }

  @Test
  public void MTOLogin_with_FacebookCC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH,
      "(//h3[@class=\"belcorp-cms-carousel-item__title js-belcorp-cms-carousel-item-link-trigger\"])[2]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class='name'])[4]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),' Ir a pagar')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // pause
    waitForTime(5);
    // refresh
    pageRefresh();
    // click on login with facebook
    clickOnElement(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]" });
    // Assertion on second time fb login
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]" }));

    status = "passed";
  }

  @Test
  public void Purchase_in_virtual_store__log_in_with_FB_User__Cash_PaymentCC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=bdfhdfdfhdhd");
    // Assertion on consultant
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"consultant-name\"]" }));
    // Click on  personal care category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Click on confirm go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // login as fb user
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
    // go forward
    goForward();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" })) {
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//div//div//a[text()='Ir a pagar']" });
      // End of if loop
    }
    // Click on esika
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id='lnk-sup-esika']" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "//a[@class=\"name\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id='addToCartButton']" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Click on confirm go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class='down-bar-actions col-md-6 col-xs-12']//button[@id='checkout-display-continueCheckout']" });
    // Select document type
    selectOption(new String[] { ID, "address.documentType" }, "1");
    // Write document number
    typeText(new String[] { ID, "address.documentNumber" }, "1390000991001");
    // Write text in billing name
    typeText(new String[] { ID, "address.billingName" }, "trewefghjm");
    // Select address1
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "COTOPAXI");
    // Select address2
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "PANGUA");
    // Select address3
    selectOption(new String[] { ID, "address.regionIso" }, "MORASPUNGO");
    // Write  direction address
    typeText(new String[] { ID, "address.line1" }, "14,west side");
    // Write street address
    typeText(new String[] { ID, "address.line2" }, "xcvhg 12");
    // Write street number
    typeText(new String[] { ID, "address.secondaryStreetName" }, "12345tgfd");
    // Write another address
    typeText(new String[] { ID, "address.neighborhood" }, "sdfgbhnm");
    // Write reference address
    typeText(new String[] { ID, "address.referencia" }, "werhj");
    // Write telephone number
    typeText(new String[] { ID, "address.phone" }, "12345667");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // wait
    waitUntil("CheckElement", new String[] { XPATH, "//button[@class='btn btn-magenta btn-block checkout-next']" },
      "15", "disabled");
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[@class=\"btn btn-magenta btn-block checkout-next\"]" });
    // Select payment method option
    selectOption(new String[] { ID, "paymentOptions" }, "3");
    // Click on Continue
    clickOnElement(new String[] { XPATH,
      "//button[@class=\"btn btn-magenta btn-primary btn-block submit_belpayCashForm checkout-next\"]" });
    // Click on checkbox
    clickOnElement(new String[] { ID, "Terms1" });
    // Click on confirm place order
    clickOnElement(new String[] { ID, "placeOrder" });
    // Assertion on consulting firm
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]" }));
    // Assertion on fb registered mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text()='ec.esc2.mto.fb@gmail.com']" }));

    status = "passed";
  }

  @Test
  public void EC_Verify_Register_as_a_FB_User_from_the_BrandC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // click on user symbol
    clickOnElement(new String[] { XPATH, "//a[@class='cms-image-link']" });
    // Add Assertion For Login Screen Display
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class='title text-center'])[1]" }));
    // Click On Login With Facebook
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
    // wait
    waitUntil("CheckElement", new String[] { XPATH, "//li[@class='logged_in js-logged_in']" }, "10", "disabled");
    // Add Assertion For Hello Username Present
    Assert.assertTrue(getText(new String[] { XPATH, "//li[@class='logged_in js-logged_in']" }).contains("Hola"));

    status = "passed";
  }

  @Test
  public void MTO_Login_with_Facebook_previously_registeredCC() {
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Click on user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > a > img" });
    // scroll to facebook button
    scrollIntoElementView(new String[] { CSS, "div[id='loginFB']" });
    // Click on login with facebook
    clickOnElement(new String[] { ID, "loginFB" });
    // Switch to next tab
    switchToNextWindow();
    // Write text in email
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Write text in pass
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
    // Click on login with fb
    clickOnElement(new String[] { NAME, "login" });
    // switch to previous tab
    switchToPreviousTab();
    // pause
    waitForTime(3);
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Men Active
    clickOnElement(new String[] { XPATH, "//a[@id=\"product_productName_200093883\"]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),'Agregar a la bolsa')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" });
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" })) {
      // Click on go pay button for checkout as consultant
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
      // end if
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Add Assertion for checkout page is displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='checkout-headline co']" }));

    status = "passed";
  }

  @Test
  public void ECOM_Link_Facebook_accountCC() {
    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on user symbol
    clickOnElement(new String[] { XPATH, "//a[@class='cms-image-link']" });
    // scroll to login with fb button
    scrollIntoElementView(new String[] { CSS, "div[id='loginFB']" });
    // click on login with facebook
    clickOnElement(new String[] { ID, "loginFB" });
    // switch to window
    switchToNextWindow();
    // Write text in email-positive scenario
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Write text in password-negative scenario
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "srd123");
    // Click on login button for facebook
    clickOnElement(new String[] { NAME, "login" });
    // pause
    waitForTime(5);
    // clear text from email text box
    clearText(new String[] { CSS, "input[type=\"text\"]" });
    // Write text in email-negative scenario
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc@gmail.com");
    // write text in password-positive scenario
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
    // click on login button
    clickOnElement(new String[] { NAME, "login" });
    // wait
    waitForTime(3);
    // Write text in email-negative scenario
    typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc@gmail.com");
    // write text in password-negative scenario
    typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcor12");
    // click on login button
    clickOnElement(new String[] { NAME, "login" });
    // wait
    waitForTime(3);
    // close tab
    closeTab();
    // Add Assertion for create new account  ection
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=' Crea tu nueva cuenta']" }));

    status = "passed";
  }
}