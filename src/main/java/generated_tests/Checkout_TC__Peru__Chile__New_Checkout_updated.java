package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Checkout_TC__Peru__Chile__New_Checkout_updated extends WebDriverHelper {

  @Test
  public void MTO_Login_with_an_accountCOneTwoEightFour() {
    javascriptExecution("lambda-name=MTO Login with an accountCOneTwoEightFour");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // click on cyzone
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img" });
    // Click on user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img" });
    // Write text in correct username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdasnew@endtest-mail.io");
    // Write text in incorrect password password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@1234");
    // Click on login
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Add assertion for forgot password button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[@class='js-password-forgotten']" }));
    // Write text correct username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdasnew@endtest-mail.io");
    // Write text incorrect password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@1996");
    // Click on login
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Write text  correct username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdasnew@endtest-mail.io");
    // Write text incorrect password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@4321");
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//li[@class='logged_in js-logged_in']" }, "10", "disabled");
    // Add Assertion for welcome message
    Assert.assertTrue(getText(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }).contains("Hola"));

    status = "passed";
  }

  @Test
  public void ScenarioFourCOneTwoTwoTwoCTwoNinezeroTwo() {
    javascriptExecution("lambda-name=ScenarioFourCOneTwoTwoTwoCTwoNinezeroTwo");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // Close Consultant popup
    clickOnElement(new String[] { CSS, "button#cboxClose > span" });
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "//div[@class=\"mini-cart-icon\"]" });
    // Add Assertion for Your bag is empty
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\"empty-cart-label\"]" }).contains("Tu bolsa se encuentra vacía"));
    // Click on Continue Shopping
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Skin First
    clickOnElement(new String[] { XPATH, "//a[text() = \"skin first\"]" });
    // start if statement
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // handle the popup
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"popup is not present\"");
      // End else statement
    }
    // GEL LIMPIADOR FACIAL SKIN FIRST Product
    if (isDisplayed(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div/child::a" },
      0)) {
      // Click on GEL LIMPIADOR FACIAL SKIN FIRST Product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
      // End If Statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on continue shopping btn
    clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "//a[text()=\'perfumes\']" });
    // Click on Second perfume
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a" });
    // ADD TO CART is present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on ADD TO CART
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Click on continue shopping
      clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
      // End If Statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Add Assertion for added to bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // click on go pay btn
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Close Consultant popup
    clickOnElement(new String[] { CSS, "button#cboxClose > span" });
    // Scroll Down
    scroll("ScrollDown", 350);
    // change the qantity of the product in cart
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "BACKSPACE");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "7");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "ENTER");
    // please reduce the order to this amount is present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" })) {
      // Add Assertion for please reduce the order to this amount.
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" }));
      // End If Statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // scroll
    scroll("ScrollDown", 350);
    // decrease qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "BACK_SPACE");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "6");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "ENTER");
    // The quantity of the product has been updated. is  present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" })) {
      // Validate  The quantity of the product has been updated.
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" }));
      // End If Statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // scroll
    scroll("ScrollDown", 305);
    // Remove link for last product is present
    if (isElementAvailable(new String[] { XPATH, "(//a[@href=\'#\'][text()=\'Eliminar\'])[8]" })) {
      // Click on remove link for last product
      mouseHoverOnElement(new String[] { XPATH, "(//a[@href=\'#\'][text()=\'Eliminar\'])[8]" });
      // click
      clickOnElement(new String[] { XPATH, "(//a[@href=\'#\'][text()=\'Eliminar\'])[8]" });
      // Add Assertion for The quantity of the product has been updated.
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
      // End If Statement
    }
    // Start else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end else statement
    }
    // Scroll Down
    scroll("ScrollDown", 442);
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "DESCUENTO");
    // Explicit wait For Apply Button
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//button[text() = ' Aplicar']" }, "5", "disabled");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Coupon applied successfully is present
    if (isElementAvailable(new String[] { XPATH, "//span[text() = \"Cupón aplicado exitosamente\"]" })) {
      // Add Assertion for Coupon applied successfully
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Cupón aplicado exitosamente\"]" }));
      // End If Statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "extraordinario");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Add Assertion for The coupon is not valid
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class = \"js-voucher-validation-container help-block cart-voucher__help-block\"]" }));
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "GRACIAS10");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Add Assertion for The coupon is not valid
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class = \"js-voucher-validation-container help-block cart-voucher__help-block\"]" }));
    // Scroll Down
    scroll("ScrollDown", 870);
    // Add Assertion for discount
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'col-xs-6 cart-totals-left discount\']" }));
    // Scroll Up
    scroll("ScrollUp", 290);
    // Click on gopay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
      // Start else
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // End else
      }
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\"Continuar como invitado\")]" });
      // end if first name present
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"guest first name textbox not resent\"");
      // end else statement
    }
    // Click On Address Submit Button
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
    // Checkout using credit card
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
    // Start If Statement
    if (isElementAvailable(
      new String[] { XPATH, "(//div[@class=\'mpago-error alert alert-danger alert-dismissible\'])[1]" })) {
      // Print Message
      printResults("PrintNote", "Visa Credit Card Not Working");
      // End If Statement
    }
    // Start Else Statement
    else {
      // Add Assertion for order placement successful
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void ECOM_Forgot_your_passwordCOneTwoSixzeroCOneTwoSevenEight() {
    javascriptExecution("lambda-name=ECOM Forgot your passwordCOneTwoSixzeroCOneTwoSevenEight");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // go to url
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Go to checkout
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // Click on did you forget password
    clickOnElement(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" });
    // Add Assertion for did you forget password
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" }));
    // Write  wrong  email  first time
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "1  *g.com");
    // Write wrong email second time
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "1_23");
    // add assertion for restore password when giving wrong email
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'btn-forgot-pass\']" }));
    // Write correct  email
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "purvagupta@endtest-mail.io");
    // add assertion for email field
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Correo electrónico\']" }));
    // Click on restore password
    clickOnElement(new String[] { XPATH, "//button[@id=\'btn-forgot-pass\']" });
    // Add Assertion for restore password
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Restablecer contraseña\']" }));
    // add assertion for displayed message
    clickOnElement(new String[] { XPATH, "//div[@class=\'alert alert-info\']" });
    // go to url
    getURL("https://endtest.io/mailbox?email=purvagupta@endtest-mail.io");
    // refresh
    pageRefresh();
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//div[text() = '=?utf-8?Q?=C3=89sika=20L'Bel=20y=20Cyzone?=']" }, "30", "ten");
    // click on first email
    clickOnElement(new String[] { XPATH, "//div[text() = \"=?utf-8?Q?=C3=89sika=20L\'Bel=20y=20Cyzone?=\"]" });
    // click on update password link
    clickOnElement(
      new String[] { XPATH, "//font[text() = \"https://s1-esika.tiendabelcorp.com/pe/my-account/update-password\"]" });
    // Click on toupdate button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]" });
    // Write text in password
    typeText(new String[] { XPATH, "//input[@id=\'password\']" }, "Belcorp@12345");
    // Write text in repeat your passord
    typeText(new String[] { XPATH, "//input[@id=\'updatePwd.checkPwd\']" }, "Belcorp@12345");
    // Click on update
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]" });

    status = "passed";
  }

  @Test
  public void MTO__Forgot_your_password_COneTwoSevenSeven_CTwoNineTwoSix() {
    javascriptExecution("lambda-name=MTO  Forgot your password COneTwoSevenSeven CTwoNineTwoSix");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
    // Click on login logo
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']" });
    // Add assertion f for \"Did you forget your password?\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" }));
    // Click on  forgotten Pwd
    clickOnElement(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" });
    // write text in email
    typeText(new String[] { XPATH, "//input[@class=\'inputEmail form-control\']" }, "rejected@reject.com");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for invalid mail id
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'help-block\']" }));
    // write text in email
    typeText(new String[] { XPATH, "//input[@class=\'inputEmail form-control\']" }, "prernadewangan@photon.in");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for \"recovery password\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class='aligncenter']" }));

    status = "passed";
  }

  @Test
  public void MTO_Forgot_your_passwordCOneTwoFiveNineCOneTwoSevenSeven() {
    javascriptExecution("lambda-name=MTO Forgot your passwordCOneTwoFiveNineCOneTwoSevenSeven");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // go to url
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Go to checkout
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // Click on did you forget password
    clickOnElement(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" });
    // Add Assertion for did you forget password
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" }));
    // Write  wrong  email  first time
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "1  *g.com");
    // Write wrong email second time
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "1_23");
    // add assertion for restore password when giving wrong email
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'btn-forgot-pass\']" }));
    // Write correct  email
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "purvagupta@endtest-mail.io");
    // add assertion for email field
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Correo electrónico\']" }));
    // Click on restore password
    clickOnElement(new String[] { XPATH, "//button[@id=\'btn-forgot-pass\']" });
    // Add Assertion for restore password
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Restablecer contraseña\']" }));
    // add assertion for displayed message
    clickOnElement(new String[] { XPATH, "//div[@class=\'alert alert-info\']" });
    // go to url
    getURL("https://endtest.io/mailbox?email=purvagupta@endtest-mail.io");
    // refresh
    pageRefresh();
    // click on first email
    clickOnElement(new String[] { XPATH, "//div[text() = \"=?utf-8?Q?=C3=89sika=20L\'Bel=20y=20Cyzone?=\"]" });
    // click on update password link
    clickOnElement(
      new String[] { XPATH, "//font[text() = \"https://s1-esika.tiendabelcorp.com/pe/my-account/update-password\"]" });
    // Click on toupdate button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]" });
    // Write text in password
    typeText(new String[] { XPATH, "//input[@id=\'password\']" }, "Belcorp@12345");
    // Write text in repeat your passord
    typeText(new String[] { XPATH, "//input[@id=\'updatePwd.checkPwd\']" }, "Belcorp@12345");
    // Click on update
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]" });

    status = "passed";
  }

  @Test
  public void MTOPE_Free_shipping_bar_settingCOneTwoTwoSeven__CTwoNinezeroSeven() {
    javascriptExecution("lambda-name=MTOPE Free shipping bar settingCOneTwoTwoSeven  CTwoNinezeroSeven");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to peru consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a" });
    // Add Assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on gopay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for product info title
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]" }));
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
    // Fill the details for shipping address
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
    // Fill the credit card details and proceed to checkout
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
    // scroll down
    scroll("ScrollDown", 1000);
    // start if
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // Add Assertion for order placement successful
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // start if
      if (isElementAvailable(new String[] { XPATH, "//span[contains(text(),\"GRATIS\")]" })) {
        // add assertion for free shipping
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[contains(text(),\"GRATIS\")]" }));
        // end if
      }
      // Start else statement
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end else statement
      }
      // end if statement
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"free shipping not available\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void MTOCL_Free_shipping_bar_settingCOneTwoTwoNine() {
    javascriptExecution("lambda-name=MTOCL Free shipping bar settingCOneTwoTwoNine");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to chili consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a" });
    // Add Assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on gopay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for product info title
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]" }));
    // start if statement for free delivery eligible?
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" })) {
      // add assertion for free shipping
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" }));
      // end if
    }
    // start else to increase the qty
    else {
      // click on add button in qty selector
      clickOnElement(
        new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)" });
      // end else statement
    }
    // start if statement for free shipping
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" })) {
      // add assertion for Congratulations, you\'ve reached free shipping!
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" }));
      // end if stament
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"free shipping bar not visible\"");
      // end else statement
    }
    // start if statement
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\"cart-totals\"]//div[@class=\"col-xs-12 col-cart-totals-row\"]" })) {
      // add assertion for free shipping
      Assert.assertTrue(getText(new String[] { XPATH,
        "//div[@class=\"cart-totals\"]//div[@class=\"col-xs-12 col-cart-totals-row\"]" }).contains("Gratis"));
      // end if statement
    }
    // Start else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end else statement
    }
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
      // Start else
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // End else
      }
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\"Continuar como invitado\")]" });
      // end if first name present
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"guest first name textbox not resent\"");
      // end else statement
    }
    // shipping address details
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
    // credit card details
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
    // start if statement for success message
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // Add Assertion for order placement successful
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // end if statement
    }
    // else statement start
    else {
      // print in result
      printResults("PrintNote", "\"checkout is not successfull check credit card details\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void ECOM_Login_with_your_account__COneTwoFiveEight() {
    javascriptExecution("lambda-name=ECOM Login with your account  COneTwoFiveEight");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Write text in username
    typeText(new String[] { NAME, "j_username" }, "sairam");
    // Write text in j_password
    typeText(new String[] { NAME, "j_password" }, "789654321");
    // Click on guest.agreeTo check box
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Click on guest.belcorpTo check box
    clickOnElement(new String[] { NAME, "belcorpToC" });
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/bjPsIE.png");
    // Refresh page
    pageRefresh();
    // Write text in j_username
    typeText(new String[] { NAME, "j_username" }, "belcorpregisteredtestuser@endtest-mail.io");
    // Write text in j_password
    typeText(new String[] { NAME, "j_password" }, "PhotonTest@9876543210");
    // Assertion for \"Eye icon \"
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "(//div[@class=\'form-group withpwdShow\']/child::div)[1]" }));
    // Click on Eye Icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\'form-group withpwdShow\']/child::div)[1]" });
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Add assertion for New user
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));

    status = "passed";
  }

  @Test
  public void Ecom__Forgot_your_password_COneTwoSevenEight_CTwoNineThreeThree() {
    javascriptExecution("lambda-name=Ecom  Forgot your password COneTwoSevenEight CTwoNineThreeThree");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Click on login logo
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']" });
    // Add assertion f for \"Did you forget your password?\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" }));
    // Click on  forgotten Pwd
    clickOnElement(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" });
    // write text in email
    typeText(new String[] { XPATH, "//input[@class=\'inputEmail form-control\']" }, "rejected@reject.com");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for invalid mail id
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'help-block\']" }));
    // write text in email
    typeText(new String[] { XPATH, "//input[@class=\'inputEmail form-control\']" }, "prernadewangan@photon.in");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for \"recovery password\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'alert alert-info\']" }));

    status = "passed";
  }

  @Test
  public void Ecomm__Mail_password_recovery_COneTwoEightzero() {
    javascriptExecution("lambda-name=Ecomm  Mail password recovery COneTwoEightzero");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // Add assertion f for \"Did you forget your password?\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" }));
    // Click on  \"Did you forget your password?\"
    clickOnElement(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" });
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "rejected@reject.com");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for invalid mail id
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'help-block\']" }));
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "prernadewangan@photon.in");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for \"recovery password\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'alert alert-info\']" }));
    // Validate mail sent to mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'aligncenter\']" }));

    status = "passed";
  }

  @Test
  public void ECOMCL_Free_shipping_bar_settingCOneTwoTwoFive() {
    javascriptExecution("lambda-name=ECOMCL Free shipping bar settingCOneTwoTwoFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
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
    // Click on Perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click On First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // clear input
    clearText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" });
    // write text in qty selector textbox
    typeText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }, "5");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // if cbox popup present
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
      // click on close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if cbox popup present
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // click on Perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[2]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for shipping bar
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//DIV[@CLASS=\'promotion\']" }));

    status = "passed";
  }

  @Test
  public void MTO_Fill_out_the_form_and_log_in_as_a_guest__COneTwoSixThree() {
    javascriptExecution("lambda-name=MTO Fill out the form and log in as a guest  COneTwoSixThree");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // write text alphanumeric in user name
    typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "belcorp12");
    // write text special character in last name
    typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "belcorp@");
    // write wrong mail in mail text box
    typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "jose.com");
    // Add assertion for \"continue guest user\"
    Assert.assertFalse(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" }));
    // write correct first name
    typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "belcorp");
    // write correct last name
    typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "register");
    // write correct mail
    typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "prernadewangan@photon.in");
    // Add assertion for \"continue guest user\"
    Assert.assertFalse(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" }));
    // write text in first name
    typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "belcorp");
    // write text in last name
    typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "register");
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "prernadewangan@photon.in");
    // click on terms1
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
    // clcik on terms2
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
    // Add assertion \"continue as guest\" button
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" }));
    // click on \"continue as guest\" button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });

    status = "passed";
  }

  @Test
  public void ECOMPEChange_of_message_of_Maximum_amount_per_orderCOneTwoThreeThree() {
    javascriptExecution("lambda-name=ECOMPEChange of message of Maximum amount per orderCOneTwoThreeThree");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to Peru URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//div[@name=\"Maquillaje\"]" });
    // select one product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // add product to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // select product quantity
    typeText(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }, "000");
    // click on enter key
    pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
      "ENTER");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//span[text()=\'El monto máximo permitido por pedido es de S/ 600.00, por favor reducir el pedido a este monto.\']" })) {
      // Assertion on exceed limit
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//span[text()=\'El monto máximo permitido por pedido es de S/ 600.00, por favor reducir el pedido a este monto.\']" }));
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//p[text()=\'Cantidad máxima.\'])[2]" })) {
      // Assertion on product reaches to maximum amount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//p[text()=\'Cantidad máxima.\'])[2]" }));
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void MTO_Login_with_accountCOneTwoFiveSevenCTwoNineTwoFive() {
    javascriptExecution("lambda-name=MTO Login with accountCOneTwoFiveSevenCTwoNineTwoFive");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // giving wrong email first time
    typeText(new String[] { ID, "j_username" }, "purvagupta@endtest-mail.io");
    // giving wrong password first time
    typeText(new String[] { ID, "j_password" }, "Belcorp");
    // Click on  \"eye icon\"
    clickOnElement(new String[] { CSS, "div[class=\"btn-pwdShow btnKeypassword\"]" });
    // Click on login
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // wrong registered details
    for (int i = 0; i < 5; i++) {
      // wrong registered email
      typeText(new String[] { ID, "j_username" }, "cyzonapp11@gmail.com");
      // wrong registered password
      typeText(new String[] { ID, "j_password" }, "Abc@12345ab");
      // click on login button
      clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    }
    // Write text in j_username
    typeText(new String[] { ID, "j_username" }, "srdasnew@endtest-mail.io");
    // Write text in j_password
    typeText(new String[] { ID, "j_password" }, "Srdas@4321");
    // Click on  \"eye icon\"
    clickOnElement(new String[] { CSS, "div[class=\"btn-pwdShow btnKeypassword\"]" });
    // add assertion for email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Correo electrónico\']" }));
    // add assertion for password
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Contraseña\']" }));
    // add assertion for login button
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" }));
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Add Assertion for shopping bag
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'cart-headline\']" }));

    status = "passed";
  }

  @Test
  public void MTO__Mail_password_recovery_COneTwoSevenNineCTwoNineThreeFour() {
    javascriptExecution("lambda-name=MTO  Mail password recovery COneTwoSevenNineCTwoNineThreeFour");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // Add assertion f for \"Did you forget your password?\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" }));
    // Click on  \"Did you forget your password?\"
    clickOnElement(new String[] { XPATH, "//a[@class=\'js-password-forgotten\']" });
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "rejected@reject.com");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for invalid mail id
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'help-block\']" }));
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'forgottenPwd.email\']" }, "prernadewangan@photon.in");
    // Click on Restore password button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block btn-forgot-pass mt-15\']" });
    // Add assertion for \"recovery password\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'alert alert-info\']" }));
    // Validate mail sent to mail
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'aligncenter\']" }));

    status = "passed";
  }

  @Test
  public void Ecomm_Fill_out_the_form_and_log_in_as_a_guest__COneTwoSixFour() {
    javascriptExecution("lambda-name=Ecomm Fill out the form and log in as a guest  COneTwoSixFour");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/pe/login/checkout");
    // write text alphanumeric in user name
    typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "belcorp12");
    // write text special character in last name
    typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "belcorp@");
    // write wrong mail in mail text box
    typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "jose.com");
    // Add assertion for \"continue guest user\"
    Assert.assertFalse(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" }));
    // write correct first name
    typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "belcorp");
    // write correct last name
    typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "register");
    // write correct mail
    typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "prernadewangan@photon.in");
    // Add assertion for \"continue guest user\"
    Assert.assertFalse(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" }));
    // write text in first name
    typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "belcorp");
    // write text in last name
    typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "register");
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "prernadewangan@photon.in");
    // click on terms1
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
    // clcik on terms2
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
    // Add assertion \"continue as guest\" button
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" }));
    // click on \"continue as guest\" button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });

    status = "passed";
  }

  @Test
  public void ECOM_Login_with_an_accountCOneTwoEightThree() {
    javascriptExecution("lambda-name=ECOM Login with an accountCOneTwoEightThree");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img" });
    // Write text in correct username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdasnew@endtest-mail.io");
    // Write text in incorrect password password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@1234");
    // Click on login
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Add assertion for forgot password button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[@class='js-password-forgotten']" }));
    // Write text correct username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdasnew@endtest-mail.io");
    // Write text incorrect password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@1996");
    // Click on login
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Write text  correct username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdasnew@endtest-mail.io");
    // Write text incorrect password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@4321");
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//li[@class='logged_in js-logged_in']" }, "10", "disabled");
    // Add Assertion for welcome message
    Assert.assertTrue(getText(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }).contains("Hola"));

    status = "passed";
  }

  @Test
  public void Ecom_Keep_Floating_Buttons__COneTwoFourEight() {
    javascriptExecution("lambda-name=Ecom Keep Floating Buttons  COneTwoFourEight");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on personal care
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // click on product
    clickOnElement(new String[] { XPATH, "//a[@id=\'product_thumb_200097893\']" });
    // click on add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Validate go pay button
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[@id=\'checkout-display-continueCheckout\']" }));
    // remove product from cart
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Eliminar\')])[2]" });
    // Validate go pay button
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//a[@class=\'btn btn-magenta btn-block btn--continue-checkout empty-screen-action\']" }));
    // Go to continue shopping
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on personal care
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // click on product
    clickOnElement(new String[] { XPATH, "//a[@id=\'product_thumb_200097893\']" });
    // click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on \"go pay\" button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on  go pay checkout
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[@id=\'checkout-display-continueCheckout\']" });
    // Login as guest user
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
    // Fill the details for shipping address
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
    // Fill the credit card details and proceed to checkout
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
  public void ECOMPE_Free_shipping_bar_adjustmentCOneTwoTwoThree() {
    javascriptExecution("lambda-name=ECOMPE Free shipping bar adjustmentCOneTwoTwoThree");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // Click on Cuidado personal category
    clickOnElement(new String[] { XPATH, "(//a[@title=\"Cuidado personal\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // \" Yes, I want\" or \"no\" popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[3]" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // end if add to cart present
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // refresh
    pageRefresh();
    // go back
    goBack();
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[11]" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // end if  add to cart present
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // refresh
    pageRefresh();
    // go back
    goBack();
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[12]" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\'  Ir a pagar\')]" });
      // refresh
      pageRefresh();
      // scroll down
      scroll("ScrollDown", 700);
      // start of if loop
      if (isElementAvailable(new String[] { XPATH,
        "//div[@class=\'col-md-4\']//div[@class=\'cart-popup-progress-text\']//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\']" })) {
        // Assertion on free condition
        Assert.assertTrue(isElementAvailable(new String[] { XPATH,
          "//div[@class=\'col-md-4\']//div[@class=\'cart-popup-progress-text\']//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\']" }));
        // Assertion on free message
        Assert.assertTrue(getText(new String[] { XPATH,
          "//div[@class=\'col-md-4\']//div[@class=\'cart-popup-progress-text\']//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\']" }).contains(
          "¡Felicitaciones, alcanzaste el envío gratis!"));
        // Assertion on Gratis
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//span[text()=\'Gratis\']" }));
        // End of if loop
      }
      // Start  else statement
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end  else statement
      }
      // take screenshot of gratis offer
      takeScreenshot("logs/Screenshoots/dvYbrN.png");
      // Click on Remove
      clickOnElement(new String[] { XPATH,
        "(//div[@class=\'item__remove-action\']//ancestor::div[@class=\'col-md-8\']//descendant::div[@class=\'js-execute-entry-action-button\'])[1]" });
      // refresh
      pageRefresh();
      // Click on Remove
      clickOnElement(new String[] { XPATH,
        "(//div[@class=\'item__remove-action\']//ancestor::div[@class=\'col-md-8\']//descendant::div[@class=\'js-execute-entry-action-button\'])[1]" });
      // scroll down
      scroll("ScrollDown", 700);
      // end if add to cart present
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void MTO_Login_with_registered_userCOneTwoSixNineCTwoNineTwoNine() {
    javascriptExecution("lambda-name=MTO Login with registered userCOneTwoSixNineCTwoNineTwoNine");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
    // click  on user icon
    clickOnElement(new String[] { XPATH, "//li[@class=\"liOffcanvas bicHeaderLinks-container\"]" });
    // Assertion on
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Ingresar con Facebook\']" }));
    // login as fb registered user
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
    // start of if loop
    if (isElementAvailable(
      new String[] { XPATH, "//li[@class=\"logged_in js-logged_in\"][text()=\' Hola Patricia\']" })) {
      // Assertion on \"logged in as registered user in fb\"
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//li[@class=\"logged_in js-logged_in\"][text()=\' Hola Patricia\']" }));
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void ECOM_Login_with_registered_userCOneTwoSevenzero() {
    javascriptExecution("lambda-name=ECOM Login with registered userCOneTwoSevenzero");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on lipstick
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[4]" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // wait
      waitForTime(3);
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
      // Click on Register me
      clickOnElement(new String[] { XPATH, "//a[text() = \"Registrarme\"]" });
      // Click on register.firstName
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombres*\"]" });
      // Write text in register.firstN...
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombres*\"]" }, "adg1");
      // Click on register.lastNa...
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellidos*\"]" });
      // Write text in register.lastNa...
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellidos*\"]" },
        "patil12");
      // Assertion on Error message
      Assert.assertTrue(isElementDisplayed(
        new String[] { XPATH, "//div[text()=\'No puede llevar números ni caracteres especiales\']" }));
      // Click on register.email
      clickOnElement(
        new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Correo electrónico*\"]" });
      // Write text in register.email
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Correo electrónico*\"]" },
        "a@gmail.com");
      // Click on register.checkE...
      clickOnElement(
        new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Confirmación de correo*\"]" });
      // Write text in register.checkE...
      typeText(
        new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Confirmación de correo*\"]" },
        "a@gmail.com");
      // Click on password
      clickOnElement(new String[] { CSS, "input[class=\"form-control pwdShow\"]" });
      // Write text in password
      typeText(new String[] { CSS, "input[class=\"form-control pwdShow\"]" }, "Abc123");
      // Click on register.checkP...
      clickOnElement(new String[] { CSS, "input[class=\"form-control \"]" });
      // Write text in register.checkP...
      typeText(new String[] { CSS, "input[class=\"form-control \"]" }, "Abc123");
      // Click on checkbox1
      clickOnElement(new String[] { CSS,
        "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > div > form > div:nth-of-type(15) > div > div > div > input:nth-of-type(1)" });
      // Click on checkbox2
      clickOnElement(new String[] { CSS,
        "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > div > form > div:nth-of-type(16) > div > div > input:nth-of-type(1)" });
      // Click on register.firstN...
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombres*\"]" });
      // Write text in register.firstN...
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombres*\"]" }, "riya");
      // Write text in register.lastNa...
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellidos*\"]" }, "patil");
      // Click on Create Account
      clickOnElement(new String[] { CSS, "button[type=\"submit\"]" });
      // start of if loop
      if (isElementAvailable(
        new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Correo electrónico*\"]" })) {
        // Write text in register.email
        typeText(
          new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Correo electrónico*\"]" },
          "belcorp11@gmail.com");
        // Write text in register.checkE...
        typeText(
          new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Confirmación de correo*\"]" },
          "belcorp11@gmail.com");
        // Write text in password
        typeText(new String[] { CSS, "input[class=\"form-control pwdShow\"]" }, "Abc12345");
        // Write text in register.checkP...
        typeText(new String[] { CSS, "input[class=\"form-control \"]" }, "Abc12345");
        // Assertion on continue button
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button[type=\"submit\"]" }));
        // Click on Create Account
        clickOnElement(new String[] { CSS, "button[type=\"submit\"]" });
        // End of if loop
      }
      // Start  else statement
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end  else statement
      }
      // end if  add to cart present
    }
    // start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void MTO_new_user_registrationCOneTwoSixSevenCTwoNineTwoEight() {
    javascriptExecution("lambda-name=MTO new user registrationCOneTwoSixSevenCTwoNineTwoEight");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Write text in firstName
    typeText(new String[] { NAME, "firstName" }, "78965");
    // Write text in lastName
    typeText(new String[] { NAME, "lastName" }, "9876ram");
    // Write text in email
    typeText(new String[] { NAME, "email" }, "com");
    // Write text in Confirm Email
    typeText(new String[] { NAME, "checkEmail" }, "sai.com");
    // Validate \"Cannot carry numbers or special characters\" message For First Name
    Assert.assertTrue(
      getText(new String[] { XPATH, "//div[@id=\'invalid_chars_register.firstName_error_msg\']" }).contains(
        "No puede llevar números ni caracteres especiales"));
    // Validate \"Cannot carry numbers or special characters\" message For Last Name
    Assert.assertTrue(
      getText(new String[] { XPATH, "//div[@id=\'invalid_chars_register.lastName_error_msg\']" }).contains(
        "No puede llevar números ni caracteres especiales"));
    // Validate \"Please enter a valid email\"  mesage
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@id=\'invalid_chars_register.email_error_msg\']" }).contains(
      "Ingresa un correo electrónico válido"));
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "][]]");
    // Write text in Confirm Password
    typeText(new String[] { NAME, "checkPwd" }, "][][");
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/diDHFY.png");
    // Click on register.agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Click on register  checkbox
    clickOnElement(new String[] { NAME, "belcorpToC" });
    // Refresh page
    pageRefresh();
    // Write text in firstName
    typeText(new String[] { NAME, "firstName" }, "karthik");
    // Write text in lastName
    typeText(new String[] { NAME, "lastName" }, "babu");
    // Write text in email
    typeText(new String[] { NAME, "email" }, "rammedikonda.test@gmail.com");
    // Write text in Confirm Email
    typeText(new String[] { NAME, "checkEmail" }, "rammedikonda.test@gmail.com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "Sairam9");
    // Write text in Confirm password
    typeText(new String[] { NAME, "checkPwd" }, "Sairam9");
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/OBqPGD.png");
    // Click on register agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Click on register  checkbox
    clickOnElement(new String[] { NAME, "belcorpToC" });
    // Add Assertion for Create user
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//button[@class=\'btn btn-black btn-block register-submit-button\']" }));

    status = "passed";
  }

  @Test
  public void MTO_CL_Change_of_message_of_Maximum_amount_per_orderCOneTwoThreeNine() {
    javascriptExecution("lambda-name=MTO CL Change of message of Maximum amount per orderCOneTwoThreeNine");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "(//a[text()=\'Rose D’Amelie Perfume de Mujer\'])[1]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "(//a[text()=\'Rose D’Amelie Perfume de Mujer\'])[1]" });
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // Click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // increase product quantity
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
      // increase product quantity
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
      // increase product quantity
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
      // increase product quantity
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
      // increases product quantity to maximum
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
      // increases product quantity to maximum
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
      // Start If  statement
      if (isElementAvailable(
        new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" })) {
        // add  assertion for \"reaches maximum amount\"
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" }));
        // end  if statement
      }
      // Start else
      else {
        // Not reaches to maximum
        printResults("PrintNote", "\"not reaches to maximum quantity\"");
        // End else
      }
      // End if
    }
    // else statement
    else {
      // product is not available
      printResults("PrintNote", "product is not available");
      // end else staement
    }

    status = "passed";
  }

  @Test
  public void MTO_Copy_and_paste_in_formsCOneTwoEightFive() {
    javascriptExecution("lambda-name=MTO Copy and paste in formsCOneTwoEightFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
    // Click on fragrance category
    clickOnElement(new String[] { XPATH,
      "(//h3[@class=\"belcorp-cms-carousel-item__title js-belcorp-cms-carousel-item-link-trigger\"])[3]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Start else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[8]" })) {
      // Click on Satin Rouge Perfume
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[8]" });
      // Handle popup
      moveAndClickWithOffset(new String[] { XPATH, "(//div[@class=\'yCmsComponent brand-logo\'])[1]" }, 30, 40);
      // if add to cart clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Click on Add to cart
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // Click on go pay
        clickOnElement(new String[] { CSS,
          "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
        // Click on go pay
        clickOnElement(new String[] { XPATH,
          "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
        // Click on guest.firstName...
        clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" });
        // Write text in guest.firstName...
        typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "abc20");
        // Click on guest.lastName
        clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" });
        // Write text in guest.lastName
        typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" },
          "patil11");
        // Click on guest.email
        clickOnElement(new String[] { CSS, "input[class=\"guestEmail form-control\"]" });
        // Write text in guest.email
        typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "cyzoneapp11@e.io");
        // Assertion on error msg
        Assert.assertTrue(isElementDisplayed(
          new String[] { XPATH, "//div[text()=\'No puede llevar números ni caracteres especiales\']" }));
        // Click on guest.firstName...
        clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" });
        // Write text in guest.firstName...
        typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "a");
        // Click on guest.lastName
        clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" });
        // Write text in guest.lastName
        typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" },
          "patil");
        // Click on guest.email
        clickOnElement(new String[] { CSS, "input[class=\"guestEmail form-control\"]" });
        // Write text in guest.email
        typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "cyzonapp11@gmail.com");
        // Click on checkbox1
        clickOnElement(new String[] { CSS,
          "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
        // Click on checkbox2
        clickOnElement(new String[] { CSS,
          "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
        // Assertion on continue button
        Assert.assertTrue(
          isElementClickable(new String[] { XPATH, "//div//button[text()=\'Continuar como invitado\']" }));
        // Click on Continue
        clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
        // end if add to cart clickable
      }
      // Start  else statement
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end  else statement
      }
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void MTO_Go_back_to_the_bagCOneTwoFivezeroCTwoNineTwoOne() {
    javascriptExecution("lambda-name=MTO Go back to the bagCOneTwoFivezeroCTwoNineTwoOne");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on Imprevist Perfume
    clickOnElement(new String[] { XPATH, "//a[text() = \"Imprevist Perfume para Hombre\"]" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Click on go pay
      clickOnElement(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
      // add assertion for shopping bag
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'cart-headline\']" }));
      // Click on go pay continue
      clickOnElement(new String[] { CSS,
        "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
      // add assertion for consultant name
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-name\']" }));
      // add assertion for message displayed
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
      // Click on  return to bag
      clickOnElement(new String[] { XPATH, "//a[@class=\'returnBag\']" });
      // Add Assertion for shopping bag
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'cart-headline\']" }));
      // Take Screenshot
      takeScreenshot("logs/Screenshoots/AjibJF.png");
      // end if add to cart present
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void ECOM_Copy_and_paste_in_formsCOneTwoEightSix() {
    javascriptExecution("lambda-name=ECOM Copy and paste in formsCOneTwoEightSix");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "(//a[@title=\"Maquillaje\"])[1]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on lipstick
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[4]" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Click on Add to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
      // Click on go pay
      clickOnElement(new String[] { XPATH,
        "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
      // Click on guest.firstName...
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" });
      // Write text in guest.firstName...
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "abc12@.");
      // Click on guest.lastName
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" });
      // Write text in guest.lastName
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" },
        "patil12");
      // Click on guest.email
      clickOnElement(new String[] { CSS, "input[class=\"guestEmail form-control\"]" });
      // Write text in guest.email
      typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "7865433254@g.io");
      // Click on checkbox1
      clickOnElement(new String[] { CSS,
        "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
      // Click on checkbox2
      clickOnElement(new String[] { CSS,
        "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
      // Click on Regresar a bols...
      clickOnElement(new String[] { CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1)" });
      // Write text in guest.email
      typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "cyzoneapp11@end.io");
      // Assertion on Error message
      Assert.assertTrue(isElementDisplayed(
        new String[] { XPATH, "//div[text()=\'No puede llevar números ni caracteres especiales\']" }));
      // Click on guest.firstName...
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" });
      // Write text in guest.firstName...
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "a");
      // Click on guest.lastName
      clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" });
      // Write text in guest.lastName
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "patil");
      // Click on guest.email
      clickOnElement(new String[] { CSS, "input[class=\"guestEmail form-control\"]" });
      // Write text in guest.email
      typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "cyzonapp11@gmail.com");
      // Assertion on continue button
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "//div//button[text()=\'Continuar como invitado\']" }));
      // Click on Continue
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // end if add to cart present
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void ECOMCLChange_of_message_of_Maximum_amount_per_orderCOneTwoThreeFive() {
    javascriptExecution("lambda-name=ECOMCLChange of message of Maximum amount per orderCOneTwoThreeFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Start else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on fragancias category
    clickOnElement(new String[] { XPATH, "(//div[@id=\"cyzone-03\"])[2]" });
    // Click on one product
    clickOnElement(new String[] { XPATH, "//a[@id=\"product_productName_200060760\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Click on quantity selector
    typeText(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }, "000");
    // click on enter
    pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
      "ENTER");
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" })) {
      // Assertion on updated quantity
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // start of if loop
    if (isElementAvailable(new String[] { XPATH,
      "//span[text()=\'El monto máximo permitido por pedido es de $ 150,000, por favor reducir el pedido a este monto.\']" })) {
      // Assertion on exceed limit message
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//span[text()=\'El monto máximo permitido por pedido es de $ 150,000, por favor reducir el pedido a este monto.\']" }));
      // End of if loop
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }

    status = "passed";
  }

  @Test
  public void ECOM_RegisterCOneTwoFiveTwoCTwoNineTwoTwo() {
    javascriptExecution("lambda-name=ECOM RegisterCOneTwoFiveTwoCTwoNineTwoTwo");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Close Consultant popup
    clickOnElement(new String[] { CSS, "button#cboxClose > span" });
    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Write text in register first Name
    typeText(new String[] { NAME, "firstName" }, "78965");
    // Write text in register.lastName
    typeText(new String[] { NAME, "lastName" }, "$%^&*");
    // Write text in register.email
    typeText(new String[] { NAME, "email" }, "sai.com");
    // Write text in register.checkEmail
    typeText(new String[] { NAME, "checkEmail" }, "sai.com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "][]]");
    // Write text in register check Password
    typeText(new String[] { NAME, "checkPwd" }, "][][");
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/EYdoML.png");
    // Click on register.agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // scroll down
    scroll("ScrollDown", 60);
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/BLaNBE.png");
    // Refresh page
    pageRefresh();
    // Write text in register.firstName
    typeText(new String[] { NAME, "firstName" }, "qwertymnbvcxzyuiopfdsaghjklramgf");
    // Write text in register last Name
    typeText(new String[] { NAME, "lastName" }, "qwertymnbvcxzyuiopfdsaghjjhklbnvfdsa");
    // Write text in register.email
    typeText(new String[] { NAME, "email" }, "rammedikonda.test@gmail.com");
    // Write text in register.checkEmail
    typeText(new String[] { NAME, "checkEmail" }, "medikonda9@gmail.com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "Ram@963");
    // Write text in register password
    typeText(new String[] { NAME, "checkPwd" }, "ram@963");
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/XjRELN.png");
    // Click on register agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Refresh page
    pageRefresh();
    // Write text in register firstName
    typeText(new String[] { NAME, "firstName" }, "karthik");
    // Write text in register last Name
    typeText(new String[] { NAME, "lastName" }, "babu");
    // Write text in register.email
    typeText(new String[] { NAME, "email" }, "rammedikonda.test@gmail.com");
    // Write text in register.checkEmail
    typeText(new String[] { NAME, "checkEmail" }, "rammedikonda.test@gmail.com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "Sairam9");
    // Write text in register.checkPassword
    typeText(new String[] { NAME, "checkPwd" }, "Sairam9");
    // Scroll Down
    scroll("ScrollDown", 300);
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/kVPiBW.png");
    // Scroll Down
    scroll("ScrollDown", 224);
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/xlvBnT.png");
    // Click on register agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Add Assertion for Create user
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//button[@class=\'btn btn-black btn-block register-submit-button\']" }));

    status = "passed";
  }

  @Test
  public void MTO__PE_Change_of_message_of_Maximum_amount_per_order___COneTwoThreeSeven__CTwoNineOneTwo() {
    javascriptExecution(
      "lambda-name=MTO  PE Change of message of Maximum amount per order   COneTwoThreeSeven  CTwoNineOneTwo");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Marianelladelivery");
    // Mouse hover on  personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on Ligne Experte E
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]" });
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on add to cart button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // click on go pay
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // increase the quantity
      typeText(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }, "21");
      // click enter
      pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
        "ENTER");
      // start of if loop
      if (isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > p" })) {
        // Add assertion for  \"reaches the maximum amount\"
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > p" }));
        // End of if loop
      }
      // Start else statement
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end else statement
      }
      // end if add to cart present
    }
    // Start else statement add to cart
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void ECOM_Adjustment_of_my_personal_data_formCOneTwoFourSix() {
    javascriptExecution("lambda-name=ECOM Adjustment of my personal data formCOneTwoFourSix");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img" });
    // write text in email
    typeText(new String[] { ID, "j_username" }, "piyush1989agarwal@gmail.com");
    // Write text innpassword
    typeText(new String[] { ID, "j_password" }, "Piyush123");
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Click on esika
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']" });
    // Click on user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > svg" });
    // hover on personal data
    mouseHoverOnElement(new String[] { ID, "lnk-nav-misdatospersonales" });
    // Click on my personal data
    clickOnElement(new String[] { ID, "lnk-nav-misdatospersonales" });
    // Select Option from title
    selectOption(new String[] { ID, "profile.title" }, "mr");
    // Write text in first name
    typeText(new String[] { ID, "profile.firstName" }, "piyush123");
    // Write text in last name
    typeText(new String[] { ID, "profile.lastName" }, "agarwal45");
    // Write text in first name
    typeText(new String[] { ID, "profile.firstName" }, "piyush");
    // Write text in last name
    typeText(new String[] { ID, "profile.lastName" }, "agarwal");
    // Click on save changes
    clickOnElement(new String[] { ID, "personalDataSubmitBtn" });
    // Add Assertion for \"your profile has been updated\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"alert alert-success alert-dismissable\"]" }));

    status = "passed";
  }

  @Test
  public void MTO_login_as_guestCOneTwoFiveFive() {
    javascriptExecution("lambda-name=MTO login as guestCOneTwoFiveFive");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on Perfume de Muje
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a" });
    // if add to cart present
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }, 0)) {
      // Click on ADD TO CART
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Click on Go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on Again Go pay button
      clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
      // Write text in guest.firstName...
      typeText(new String[] { NAME, "firstName" }, "sairam@6577");
      // Write text in guest.lastName
      typeText(new String[] { NAME, "lastName" }, "89076");
      // Write text in guest.email
      typeText(new String[] { NAME, "email" }, "belcorpregisteredtestus5467");
      // Agree To Belcorp Checkbox
      clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
      // Click belcorp T&c checkbox
      clickOnElement(new String[] { NAME, "belcorpToC" });
      // Add Assertion for Continuar como ...
      Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" }));
      // Take Screenshot
      takeScreenshot("logs/Screenshoots/gpJfGj.png");
      // Refresh page
      pageRefresh();
      // Write text in guest firstName...
      typeText(new String[] { NAME, "firstName" }, "sairam");
      // Write text in guest lastName
      typeText(new String[] { NAME, "lastName" }, "test");
      // Write text in guest email
      typeText(new String[] { NAME, "email" }, "belcorpregisteredtestus5467@endtest-mail.io");
      // Agree To Belcorp Checkbox
      clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
      // Click belcorp T&c checkbox
      clickOnElement(new String[] { NAME, "belcorpToC" });
      // Login as guest button assertion
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" }));
      // Click on guest user button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // Fill the details for shipping address
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
      // Fill the credit card details and proceed to checkout
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
      // end if add to cart
    }
    // Start else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end else statement
    }

    status = "passed";
  }
}