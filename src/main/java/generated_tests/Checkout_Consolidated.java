package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkout_Consolidated extends WebDriverHelper {

  @Test
  public void scenario_OneCOneSevenEightNineEightSixCOneTwoOneNineCTwoEightNineNine() {
    javascriptExecution("lambda-name=scenario OneCOneSevenEightNineEightSixCOneTwoOneNineCTwoEightNineNine");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/");
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "(//div[@class=\"mini-cart-icon\"])[2]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//p[@class='empty-cart-label'])[2]" }, "10", "disabled");
    // Add Assertion for Your bag is empty
    Assert.assertTrue(
      getText(new String[] { XPATH, "(//p[@class=\"empty-cart-label\"])[2]" }).contains("Tu bolsa se encuentra vacía"));
    // Click on Continue Shopping
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Seguir Comprando\')])[2]" });
    // click on first product in carosul
    clickOnElement(new String[] { XPATH,
      "(//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a)[3]" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion for Added to the bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // Click on continue shopping btn
    clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
    // write text in search box
    typeText(new String[] { XPATH, "(//input[@id=\"js-site-search-input\"])[1]" }, "perfume");
    // Click on search
    clickOnElement(new String[] { XPATH, "//img[@src=\'/_ui/custom-theme/images/esikaLupaIco.svg\']" });
    // Click on first perfume
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" })) {
      // Click on add To Cart Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
      // Add Assertion for Added to the bag
      Assert.assertTrue(
        getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
      // Click on continue shopping
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
      // end if
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // End else statement
    }
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//div[@class=\"details\"]/a)[2]" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion for added to bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // start if statement
    if (checkContainsValue(new String[] { XPATH, "//span[@class=\'cart-popup-progress-highlight\']" },
      "¡Felicitaciones, alcanzaste el envío gratis!")) {
      // Add Assertion for Congratulations, you reached free shipping
      Assert.assertTrue(getText(new String[] { XPATH, "//span[@class=\'cart-popup-progress-highlight\']" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // end if statement
    }
    // Start Else statement
    else {
      // Print Result
      printResults("PrintNote", "\"free shipping message is not present\"");
      // End else statement
    }
    // click on go pay btn
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"cartFreeGiftCarousel-wrapper cart-panel\"]" })) {
      // Add Assertion for gift title
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"panel-title\"]" }));
      // Add Assertion for free gift
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(@class,\"cartFreeGift\")]" }));
      // Add assertion for  thanks to your purchases!
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"gift-info\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"free gift card is not available\"");
      // end else statement
    }
    // Scroll Down
    scroll("ScrollDown", 350);
    // change the qantity of the product in cart
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "4");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // start if statement for reduce amount
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" })) {
      // Add Assertion for please reduce the order to this amount.
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" }));
      // end if statement
    }
    // scroll
    scroll("ScrollDown", 350);
    // decrease qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "3");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // Add Assertion for The quantity of the product has been updated.
    Assert.assertTrue(
      getText(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }).contains(
        "La cantidad del producto ha sido actualizada."));
    // scroll
    scroll("ScrollDown", 305);
    // click on remove link
    clickOnElement(new String[] { XPATH, "(//A[@href=\'#\'][text()=\'Eliminar\'])[8]" });
    // Add Assertion for The quantity of the product has been updated.
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
    // scroll down
    scroll("ScrollDown", 305);
    // clear qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]");
    // write text in qty selector
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "2");
    // click on enter
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]");
    // Add Assertion for Congratulations, you\'ve reached free shipping!
    Assert.assertTrue(getText(new String[] { XPATH,
      "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" }).contains(
      "¡Felicitaciones, alcanzaste el envío gratis!"));
    // Scroll Down
    scroll("ScrollDown", 442);
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "extraordinario");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Add Assertion for The coupon is not valid
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'El cupón no es válido\')]" }));
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "reactiva1");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cupón aplicado exitosamente\')]" })) {
      // Add Assertion for Coupon applied successfully
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cupón aplicado exitosamente\')]" }));
      // Scroll Down
      scroll("ScrollDown", 870);
      // Add Assertion for discount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text() ,\'Descuento\')]" }));
      // Scroll Up
      scroll("ScrollUp", 290);
      // Click on voucher collapse icon
      clickOnElement(new String[] { XPATH, "//span[@class=\"toggle-button panel-title active\"]" });
      // take a snip to confirm voucher collapse successfully
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"scroll-mobile-coupon\"]" },
        "logs/Screenshots/RikTTs.png");
      // End if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // End Else Statement
    }
    // Click on gopay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
    // Click On Address Submit Button
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
    // Checkout using credit card
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
    // Add Assertion for order placement successful
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));

    status = "passed";
  }

  @Test
  public void ECOM_Mandatory_checkbox_in_guest_formCOneTwoSixSix() {
    javascriptExecution("lambda-name=ECOM Mandatory checkbox in guest formCOneTwoSixSix");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // Mouse Hover on perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']/parent::div" });
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Perfumes\')])[2]" });
    // Click on perfume de hombre nitro air
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'perfume de hombre nitro air\')]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // Write text in first name text box
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
    // Write text in last Name textbox
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in email textbox
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "photontest@endtest-mail.io");
    // Add Assertion Receive publicity
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.agreeToReceivePublicity" }));
    // Add Assertion T&C checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.belcorpToC" }));
    // Add Assertion Mark common regime checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "Marca si perteneces al régimen común." }));
    // Click on  agree To Receive publicity
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on T&C checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Click on Mark common regime checkbox
    clickOnElement(new String[] { ID, "Marca si perteneces al régimen común." });
    // Add Assertion for login button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // mouse hover perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']/parent::div" });
    // click  on perfumes
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Perfumes\')])[2]" });
    // Click on perfume de hombre nitro air
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'perfume de hombre forze\')]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(text(),\'Ir a pagar\')]" });
    // Write text in first name text box
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon");
    // Write text in last Name textbox
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in email textbox
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "photontest@endtest-mail.io");
    // Add Assertion for agree to receive publicity checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.agreeToReceivePublicity" }));
    // Add Assertion for T&C  checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.belcorpToC" }));
    // Add Assertion for mark common regime checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "Marca si perteneces al régimen común." }));
    // click on agree to receive checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // click on T&C checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // click on mark common regime checkbox
    clickOnElement(new String[] { ID, "Marca si perteneces al régimen común." });
    // Add Assertion For login button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" }));

    status = "passed";
  }

  @Test
  public void MTOEC__Free_shipping_bar_settingCOneTwoThreeOne() {
    javascriptExecution("lambda-name=MTOEC  Free shipping bar settingCOneTwoThreeOne");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=asdsadas111");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Uno Perfume para hombre
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // clear input
    clearText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" });
    // write text in qty selector textbox
    typeText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }, "15");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // wait
    waitForTime(3);
    // start if statement
    if (isElementAvailable(
      new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" })) {
      // Add Assertion for free shipping bar
      Assert.assertTrue(getText(
        new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // Add Assertion For free shipment
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }).contains("Gratis"));
      // End if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // End else statement
    }

    status = "passed";
  }

  @Test
  public void ECOMCOChange_of_message_of_Maximum_amount_per_orderCOneTwoThreeFour() {
    javascriptExecution("lambda-name=ECOMCOChange of message of Maximum amount per orderCOneTwoThreeFour");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//p[text() = \"maquillaje\"]" });
    // Click on máscara
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[3]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Write text in quantity
    typeText(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }, "25");
    // press enter key
    pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
      "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)");
    // Check for exceed limit
    if (isElementAvailable(new String[] { XPATH,
      "//span[text() = \"El monto máximo permitido por pedido es de $ 700,000, por favor reducir el pedido a este monto.\"]" })) {
      // Assertion on exceed limit
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//span[text() = \"El monto máximo permitido por pedido es de $ 700,000, por favor reducir el pedido a este monto.\"]" }));
      // Assertion on \"reaches to maximum amount\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//p[text()=\'Cantidad máxima.\'])[2]" }));
      // End of if loop
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else statement
    }

    status = "passed";
  }

  @Test
  public void HYBRISVOneOneEightzerozeroFour() {
    javascriptExecution("lambda-name=HYBRISVOneOneEightzerozeroFour");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/");
    // click on  login
    clickOnElement(new String[] { CSS, "li.liOffcanvas.bicHeaderLinks-container > a > img" });
    // write text in username text field
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_92792380@testuser.com");
    // write text in password text field
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // wait untill maquillaje
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[text()='maquillaje']" }, "10", "disabled");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
    // click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
    // Add Assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
    // add assertion for crossed out prce
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]" }));
    // add assertion for sale price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
    // Add assertion for qty selector
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@id=\'pdpAddtoCartInput\']" }));
    // add assertion for share
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]" }));
    // start if statement for add to cart button
    if (isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" })) {
      // click on add to cart button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
      // click on go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // add assertion for qty increase/decrease btn
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]" }));
      // take a snip to validate product title /CUV/stock
      takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" }, "logs/Screenshots/PFQluH.png");
      // add assertion for eliminate link
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
      // wait until go pay button clikable
      waitUntil("CheckClickableElement",
        new String[] { XPATH, "//div[@class='actions']/child::button[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // click on go pay button
      clickOnElement(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
      // end if statement for add to cart
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"add to cart button not clickeble\"");
      // end else statement
    }
    // start if statement for consultant gopay
    if (isElementAvailable(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" })) {
      // click on gopay button
      clickOnElement(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" });
      // end if statement
    }
    // mexico registered user login
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
    // wait untill crdit card
    waitUntil("CheckVisibleElement", new String[] { CSS,
        "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditMX > label > span.hidden-mobile" },
      "15", "disabled");
    // click on credit card section
    javascriptExecution(
      "document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditMX > label > span.hidden-mobile\").click();");
    // wait for add new card
    waitUntil("CheckClickableElement", new String[] { CSS, "div#mpagoCreditCardDiv a#add-new-card" }, "10", "disabled");
    // click on add new card
    javascriptExecution("document.querySelector(\"div#mpagoCreditCardDiv a#add-new-card\").click();");
    // wait untill card holder name
    waitUntil("CheckClickableElement", new String[] { CSS, "form#mpago_credit input#cardholderName" }, "10",
      "disabled");
    // write card holder name
    typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "APRO");
    // write card number
    typeText(new String[] { CSS, "input#cardNumber" }, "4075595716483764");
    // select expiry month
    selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
    // select expiry year
    selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
    // write CVV number
    typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
    // Click on Terms and Condition Checkbox
    clickOnElement(new String[] { CSS, "input#Terms1_mpagoCreditCardForm" });
    // wait for other direction
    waitUntil("CheckClickableElement", new String[] { CSS,
      "form#mpago_credit div.address-selector.billing-address-selector > div:nth-child(2) > label" }, "10", "disabled");
    // select other direction
    clickOnElement(new String[] { CSS,
      "form#mpago_credit div.address-selector.billing-address-selector > div:nth-child(2) > label" });
    // click on place order
    clickOnElement(new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
    // start if statement for sucess message
    if (!isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // Add assertion for sucess message
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // End if statement for sucess message
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"the order placed without selcting other direction address\"");
      // take a snip of order placed successfully
      takeScreenshot("logs/Screenshoots/Qlvscj.png");
      // take a snip of oder placement
      takeScreenshotOfParticularElement(
        new String[] { CSS, "div.account-orderdetail.well.well-tertiary.js-account-orderdetail > div.well-content" },
        "logs/Screenshots/EQnYJn.png");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void ECOMMX_Free_shipping_bar_settingCOneTwoTwoSix() {
    javascriptExecution("lambda-name=ECOMMX Free shipping bar settingCOneTwoTwoSix");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/");
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "( //div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a)[3]" });
    // Add Assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Click on add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on gopay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for product info title
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]" }));
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
      // end else statement
    }
    // add assertion for Congratulations, you\'ve reached free shipping!
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" }));
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
    // Click On Address Submit Button
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
    // Checkout using credit card
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
    // Add Assertion for order placement successful
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
    // scroll down
    scroll("ScrollDown", 1000);
    // take screen shot to validate free shipping
    takeScreenshot("logs/Screenshoots/sNctax.png");

    status = "passed";
  }

  @Test
  public void Send_as_gift_optionCTwoNineOneOnephaseTwo() {
    javascriptExecution("lambda-name=Send as gift optionCTwoNineOneOnephaseTwo");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // wait untill maquillaje
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[text()='maquillaje']" }, "10", "disabled");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
    // click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
    // validation of crossed price
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div > span.old-price" }));
    // validation of new price
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div > span.active-price" }));
    // validation of qty selector
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "input#pdpAddtoCartInput" }));
    // validation of add to bag
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
    // validation of share option
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]" }));
    // start if statement for add to cart button
    if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // click on add to cart button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // click on go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // add aseertion for eliminate btn
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
      // add assertion for qty selector
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0" }));
      // take a snip to verify CUV stock title
      takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" }, "logs/Screenshots/qUipeH.png");
      // start if statement
      if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Regalo\')]" })) {
        // add assertion for gift
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Regalo\')]" }));
        // take a snip to verify the gift
        takeScreenshotOfParticularElement(new String[] { CSS, "div.send-gift > div" }, "logs/Screenshots/ZDjqry.png");
        // click on send gift card link
        clickOnElement(new String[] { CSS, "div.send-gift > div > a" });
        // switch to  next tab
        switchToNextWindow();
        // take a screen shot to verify that clicked leads to a PDF
        takeScreenshot("logs/Screenshoots/WfKuBl.png");
        // end if statement
      }
      // end if statement for add to cart
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"add to cart button not clickeble\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void MTO_CO_Change_of_message_of_Maximum_amount_per_order_COneTwoThreeEight() {
    javascriptExecution("lambda-name=MTO CO Change of message of Maximum amount per order COneTwoThreeEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Hover on  personal care
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/co/c/lbel-04/tiendaCO98\"]" });
    // Click on Linea
    clickOnElement(new String[] { CSS, "a[href=\"/co/c/lbel-0405/tiendaCO98\"]" });
    // Click on \"Ligne Experte S\"
    clickOnElement(
      new String[] { CSS, "a[class=\"name\"][href=\"/co/ligne-experte-shampoo-ultra-nutritif/p/200059969\"]" });
    // Add assertion for \"ligne experte img1\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > ul > div > div > div:nth-of-type(1) > div > li > a > img" }));
    // Add assertion for \"ligne experte img2\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > ul > div > div > div:nth-of-type(2) > div > li > a > img" }));
    // Add assertion for \"ligne experte img3\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > ul > div > div > div:nth-of-type(3) > div > li > a > img" }));
    // Add assertion for price
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > span:nth-of-type(2)" }));
    // Add assertion for quantity
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(2) > div > input" }));
    // Add assertion for \"share link\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"share-btn-icon shareBtnShare\"]" }));
    // click on \"add to cart\" button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on \"go pay\" button
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // back key
    pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
      "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)");
    // click on quantity
    typeText(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }, "21");
    // click enter
    pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
      "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)");
    // if for max reach
    if (isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > p" })) {
      // Add assertion for  \"reaches the maximum amount\"
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > p" }));
      // end if max reach
    }

    status = "passed";
  }

  @Test
  public void MTO_Mandatory_checkbox_in_guest_formCOneTwoSixFive() {
    javascriptExecution("lambda-name=MTO Mandatory checkbox in guest formCOneTwoSixFive");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // click on cyzone
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img" });
    // mouse hover on perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']/parent::div" });
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Perfumes\')])[2]" });
    // Click on perfume de hombre nitro air
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'perfume de hombre nitro air\')]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(text(),\'Ir a pagar\')]" });
    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Add Assertion for agree to receive publicity
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.agreeToReceivePublicity" }));
    // Add Assertion for T&C checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.belcorpToC" }));
    // Add Assertion Mark common regime checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "Marca si perteneces al régimen común." }));
    // click on agree to receive checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // click on  T&C checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // click on mark common regime checkbox
    clickOnElement(new String[] { ID, "Marca si perteneces al régimen común." });
    // Add Assertion Login button is enabled
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" }));
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // click on cyzone
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[3]" });
    // mouse hover perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']/parent::div" });
    // click  on perfumes
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Perfumes\')])[2]" });
    // Click on perfume de hombre forze
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'perfume de hombre forze\')]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(text(),\'Ir a pagar\')]" });
    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Add Assertion for agree to receive publicity
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.agreeToReceivePublicity" }));
    // Add Assertion for T&C checkbox
    Assert.assertTrue(isElementAvailable(new String[] { ID, "guest.belcorpToC" }));
    // click on agree to receive publicity
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // click on T&C checkbox
    clickOnElement(new String[] { ID, "guest.belcorpToC" });
    // Add Assertion for login button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" }));

    status = "passed";
  }

  @Test
  public void MTO_Go_back_to_the_bagCOneEightThreeNineNineFourCOneTwoFourNineCTwoNineTwoOne() {
    javascriptExecution("lambda-name=MTO Go back to the bagCOneEightThreeNineNineFourCOneTwoFourNineCTwoNineTwoOne");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on Imprevist Perfume
    clickOnElement(new String[] { XPATH, "//a[text() = \"Imprevist Perfume para Hombre\"]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on go pay
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // add assertion for shopping bag
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'cart-headline\']" }));
    // Click on go pay continue
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // Add Assertion for checkout
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[contains(text(),\'Checkout\')]" }));
    // add assertion for consultant name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-name\']" }));
    // add assertion for message displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
    // Click on  return to bag
    clickOnElement(new String[] { XPATH, "//a[@class=\'returnBag\']" });
    // Add Assertion for shopping bag
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'cart-headline\']" }));
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/wtcBVI.png");

    status = "passed";
  }

  @Test
  public void Ecomm_MX_Change_of_message_of_Maximum_amount_per_order_COneTwoThreeSix() {
    javascriptExecution("lambda-name=Ecomm MX Change of message of Maximum amount per order COneTwoThreeSix");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/login");
    // write text in email
    typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "belcorpregisteredtestuser@endtest-mail.io");
    // Write text in password
    typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "PhotonTest@9876543210");
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Mouse hover on  personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on Ligne Experte E
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]" });
    // Click on add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // increase the quantity
    typeText(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }, "21");
    // click enter
    pressKey(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" },
      "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)");
    // if reach max
    if (isElementAvailable(
      new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" })) {
      // Add assertion for  \"reaches the maximum amount\"
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" }));
      // end if reach max
    }

    status = "passed";
  }

  @Test
  public void MTO_MX_Change_of_message_of_Maximum_amount_per_orderCOneTwoFourzero() {
    javascriptExecution("lambda-name=MTO MX Change of message of Maximum amount per orderCOneTwoFourzero");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=tiendaprueba");
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // click on  product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[3]" });
    // select product quantity
    typeText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }, "1000");
    // click on enter key
    pressKey(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" },
      "//input[@class=\'form-control js-qty-selector-input\']");
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "(//p[@class=\'item__quantity_max_reached_message\'])[2]" })) {
      // Add Assertion for \"reaches maximum amount\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//p[@class=\'item__quantity_max_reached_message\'])[2]" }));
      // END If loop
    }

    status = "passed";
  }

  @Test
  public void Cart_IDTwoNinezeroSix() {
    javascriptExecution("lambda-name=Cart IDTwoNinezeroSix");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on  Add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on Go Pay Button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion For ID present under shopping Bag section
    Assert.assertTrue(isElementDisplayed(new String[] { CSS, "span > span > span" }));
    // Take snip Of shopping Bag with ID
    takeScreenshotOfParticularElement(new String[] { CSS, "h1 > span" }, "logs/Screenshots/bQqHAi.png");
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on Add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add assertion For ID present under Shopping Bag
    Assert.assertTrue(isElementDisplayed(new String[] { CSS, "span > span > span" }));
    // Take ship Of Shopping Bag With ID
    takeScreenshotOfParticularElement(new String[] { CSS, "h1 > span" }, "logs/Screenshots/sSIJdT.png");

    status = "passed";
  }

  @Test
  public void MTO_EC_Change_of_message_of_Maximum_amount_per_orderCOneTwoFourOne() {
    javascriptExecution("lambda-name=MTO EC Change of message of Maximum amount per orderCOneTwoFourOne");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=erergergr");
    // Click on Imprevist Perfu...
    clickOnElement(new String[] { XPATH, "//a[text() = \"Imprevist Perfume para Hombre\"]" });
    // Click on Agregar a la bo...
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on Ir a pagar
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on  plus button
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
    // Click on  increase product quantity
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
    // increase product quantity
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
    // increase product quantity to maximum
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'item__quantity hidden-xs hidden-sm\']/child::form/child::button[text()=\'+\']" });
    // Start If Statement
    if (isElementAvailable(
      new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" })) {
      // Add Assertion  \"reaches the maximum amount\"
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" }));
      // End  If Statement
    }

    status = "passed";
  }

  @Test
  public void MTO_Form_adjustment_of_my_personal_data_COneTwoFourFive() {
    javascriptExecution("lambda-name=MTO Form adjustment of my personal data COneTwoFourFive");

    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Write text in username
    typeText(new String[] { NAME, "j_username" }, "belcorpregisteredtestuser@endtest-mail.io");
    // Write text in password
    typeText(new String[] { NAME, "j_password" }, "PhotonTest@9876543210");
    // Click on Login Button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Click on again loginSymbol
    clickOnElement(new String[] { CSS,
      "a[class=\"myAccountLinksHeader collapsed js-myAccount-toggle\"][data-toggle=\"collapse\"][data-parent=\".nav__right\"]" });
    // Click on My Personal Information
    clickOnElement(new String[] { XPATH, "//a[text() = \"mis datos personales\"]" });
    // Select Option from Conventions
    selectOption(new String[] { NAME, "titleCode" }, "mr");
    // Scroll Down
    scroll("ScrollDown", 180);
    // Write text in firstName
    typeText(new String[] { NAME, "firstName" }, "9876543");
    // Write text in lastName
    typeText(new String[] { NAME, "lastName" }, "#$%^&*@");
    // Write text in firstName
    clearText(new String[] { NAME, "firstName" });
    // Write text in lastName
    clearText(new String[] { NAME, "lastName" });
    // Write text in firstName
    typeText(new String[] { NAME, "firstName" }, "karthik");
    // Write text in lastName
    typeText(new String[] { NAME, "lastName" }, "belcorp");
    // Click on Save Changes button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Guardar Cambios\')]" });
    // Add Assertion for updated successfully message
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"alert alert-success alert-dismissable\"]" }));
    // Add Assertion for Hola karthik
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[contains(text(),\'Hola karthik\')]" }));

    status = "passed";
  }

  @Test
  public void ECOMCO_Free_shipping_bar_settingCOneTwoTwoFour() {
    javascriptExecution("lambda-name=ECOMCO Free shipping bar settingCOneTwoTwoFour");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // click on Perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click On First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Refresh
    pageRefresh();
    // click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on  go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on qty selector button to add product
    clickOnElement(new String[] { XPATH, "(//button[text()=\'+\'])[2]" });
    // click on qty selector button to add product
    clickOnElement(new String[] { XPATH, "(//button[text()=\'+\'])[2]" });
    // start if statement
    if (checkContainsValue(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }, "Gratis")) {
      // Add assertion for free shipment
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }).contains("Gratis"));
      // Add Assertion for shipping  bar
      Assert.assertTrue(getText(
        new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // end if statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"Free Shipping Bar is not enabled\"");
      // End else statement
    }

    status = "passed";
  }

  @Test
  public void MTOMX_Free_shipping_bar_settingCOneTwoThreezero() {
    javascriptExecution("lambda-name=MTOMX Free shipping bar settingCOneTwoThreezero");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/tiendaprueba");
    // click on Labial de Larga Duración Colorfix Duo Tattoo
    clickOnElement(new String[] { XPATH, "//a[text()=\'Labial de Larga Duración Colorfix Duo Tattoo\']" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // click on cyzone
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img" });
    // scroll to element
    scrollIntoElementView(new String[] { CSS, "a[class=\'spanTitle ecarousel_product_productName_200097894\']" });
    // Click on crema hidratant...
    clickOnElement(new String[] { XPATH, "//a[text() = \"crema hidratante facial en gel skin first\"]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on qty selector button to add product
    clickOnElement(new String[] { XPATH, "(//button[text()=\'+\'])[2]" });
    // start if statement
    if (isElementAvailable(
      new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" })) {
      // Add Assertion for free shipping bar
      Assert.assertTrue(getText(
        new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // Add Assertion For free shipment
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }).contains("Gratis"));
      // End if
    }
    // Start else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void MTOCOFree_shipping_bar_settingCOneTwoTwoEight() {
    javascriptExecution("lambda-name=MTOCOFree shipping bar settingCOneTwoTwoEight");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Click on Facial Treatment
    clickOnElement(new String[] { XPATH, "//div[@name=\"Tratamiento facial\"]" });
    // Click on Crema Facial
    clickOnElement(new String[] { XPATH, "//img[@alt=\"Crema Facial Nutritiva 45+ Oxygen Supreme\"]" });
    // refresh
    pageRefresh();
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Refresh Page
    pageRefresh();
    // go back
    goBack();
    // Click on Limpiadora Facial
    clickOnElement(new String[] { XPATH, "//img[@alt=\"Limpiadora Facial Oxygen Supreme\"]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // scroll
    scroll("ScrollDown", 700);
    // Assertion on free condition
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'col-md-4\']//div[@class=\'cart-popup-progress-text\']//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\']" }));
    // Assertion on free message
    Assert.assertTrue(getText(new String[] { XPATH,
      "//div[@class=\'col-md-4\']//div[@class=\'cart-popup-progress-text\']//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\']" }).contains(
      "¡Felicitaciones, alcanzaste el envío gratis!"));
    // Assertion on Gratis
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//span[text()=\'Gratis\']" }));
    // take screenshot of free offer
    takeScreenshot("logs/Screenshoots/eiidCN.png");
    // Click on Eliminar
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(2) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a" });
    // scroll
    scroll("ScrollDown", 700);

    status = "passed";
  }

  @Test
  public void ECOM_Login_as_a_guestCOneEightThreeNineNineSevenCOneTwoFiveSixCTwoNineTwoFour() {
    javascriptExecution("lambda-name=ECOM Login as a guestCOneEightThreeNineNineSevenCOneTwoFiveSixCTwoNineTwoFour");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/co/login/checkout");
    // Write text in first Name
    typeText(new String[] { XPATH, "//input[@placeholder=\'Nombre*\']" }, "purva");
    // add assertion for first name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Nombre*\']" }));
    // Write text in lastName
    typeText(new String[] { XPATH, "//input[@placeholder=\'Apellido*\']" }, "gupta");
    // add assertion for last name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Apellido*\']" }));
    // Write text in  email
    typeText(new String[] { XPATH, "//input[@placeholder=\'Correo electrónico*\']" }, "purvagupta@endtest-mail.io");
    // add assertion for email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@placeholder=\'Correo electrónico*\']" }));
    // Click on agree To Receive
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
    // add assertion for agree to receive
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" }));
    // Click on I accept terms and conditions
    clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
    // add assertion  for I accept terms and conditions
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" }));
    // Click on  Mark if you belong to the common regime
    clickOnElement(new String[] { XPATH, "//input[@id=\'Marca si perteneces al régimen común.\']" });
    // add assertion for  Mark if you belong to the common regime
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//input[@id=\'Marca si perteneces al régimen común.\']" }));

    status = "passed";
  }

  @Test
  public void MTO_RegisterCOneTwoFiveOne() {
    javascriptExecution("lambda-name=MTO RegisterCOneTwoFiveOne");

    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click On Second Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a" });
    // Click on ADD TO CART
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click Go Pay Button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Again Go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
    // Click on Signup Link
    clickOnElement(new String[] { XPATH, "//a[@class=\'linktoRegister\']" });
    // Write text in register first Name
    typeText(new String[] { NAME, "firstName" }, "78965");
    // Write text in register.lastName
    typeText(new String[] { NAME, "lastName" }, "654632");
    // Write text in register.email
    typeText(new String[] { NAME, "email" }, "com");
    // Write text in register Email
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
    // Click on register.agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Refresh page
    pageRefresh();
    // Write text in firstName
    typeText(new String[] { NAME, "firstName" }, "9876qwertymnbvcxzyuiopfdsaghjklramgf");
    // Write text in  last Name
    typeText(new String[] { NAME, "lastName" }, "6789qwertymnbvcxzyuiopfdsaghjjhklbnvfdsa");
    // Write text in email
    typeText(new String[] { NAME, "email" }, "@com");
    // Write text in Confirm Email
    typeText(new String[] { NAME, "checkEmail" }, "@com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "Ram@963");
    // Write text in Confirm password
    typeText(new String[] { NAME, "checkPwd" }, "ram@963");
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
    // Click on register agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Refresh page
    pageRefresh();
    // Write text in  firstName
    typeText(new String[] { NAME, "firstName" }, "karthik");
    // Write text in  last Name
    typeText(new String[] { NAME, "lastName" }, "babu");
    // Write text in email
    typeText(new String[] { NAME, "email" }, "rammedikonda.test@gmail.com");
    // Write text in Confirm Email
    typeText(new String[] { NAME, "checkEmail" }, "rammedikonda.test@gmail.com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "Sairam9");
    // Write text in Confirm Password
    typeText(new String[] { NAME, "checkPwd" }, "Sairam9");
    // Click on register agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });

    status = "passed";
  }

  @Test
  public void ECOM_Go_back_to_the_stock_marketCOneEightThreeNineNinezeroCOneTwoFivezero() {
    javascriptExecution("lambda-name=ECOM Go back to the stock marketCOneEightThreeNineNinezeroCOneTwoFivezero");

    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/mx/");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Second Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div/child::a" });
    // Click on ADD TO CART
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on Go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for Bolsa de Compra...
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]" }));
    // Click on Again Go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
    // Click on Return to the Bag
    clickOnElement(new String[] { CSS, "a[class=\"returnBag\"]" });
    // Add Assertion for Bolsa de Compra...
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]" }));

    status = "passed";
  }

  @Test
  public void MTOKeep_Floating_Buttons_COneTwoFourSeven() {
    javascriptExecution("lambda-name=MTOKeep Floating Buttons COneTwoFourSeven");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Hover on  personal care
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/co/c/lbel-04/tiendaCO98\"]" });
    // Click on Linea
    clickOnElement(new String[] { CSS, "a[href=\"/co/c/lbel-0405/tiendaCO98\"]" });
    // Click on \"Ligne Experte S\"
    clickOnElement(
      new String[] { CSS, "a[class=\"name\"][href=\"/co/ligne-experte-shampoo-ultra-nutritif/p/200059969\"]" });
    // click on add to cart button
    clickOnElement(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // click on remove product link
    clickOnElement(new String[] { CSS,
      "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a" });
    // click on continue shopping
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a comprar\')]" });
    // click on lbel module
    getURL("https://s1-lbel.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Hover on  personal care
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/co/c/lbel-04/tiendaCO98\"]" });
    // Click on Linea
    clickOnElement(new String[] { CSS, "a[href=\"/co/c/lbel-0405/tiendaCO98\"]" });
    // Click on \"Ligne Experte S\"
    clickOnElement(
      new String[] { CSS, "a[class=\"name\"][href=\"/co/ligne-experte-shampoo-ultra-nutritif/p/200059969\"]" });
    // Add assertion for price
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > span:nth-of-type(2)" }));
    // Add assertion for quantity
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(2) > div > input" }));
    // click on \"add to cart\" button
    clickOnElement(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button" });
    // Validate the \"go to pay\"
    Assert.assertTrue(isElementClickable(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" }));
    // click on \"go pay\" button
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // Validate \"continue shopping\" button
    Assert.assertTrue(isElementClickable(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(5) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" }));
    // click on \"continue go pay\" button
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(5) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // Login as guest user
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
    // Checkout Using Agency option
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
    // Add assertion \"Shipping Address\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"well-headline orderPending\"]" }));

    status = "passed";
  }

  @Test
  public void scenario_ThreeCOneSevenEightNineEightNineCOneTwoTwoOneCTwoNinezeroOne() {
    javascriptExecution("lambda-name=scenario ThreeCOneSevenEightNineEightNineCOneTwoTwoOneCTwoNinezeroOne");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/mx/");
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "//div[@class=\"mini-cart-icon\"]" });
    // Add Assertion for Your bag is empty
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\"empty-cart-label\"]" }).contains("Tu bolsa se encuentra vacía"));
    // Click on Continue Shopping
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // click on first product in carosul
    clickOnElement(new String[] { XPATH, "(//div[@class=\"item-details-panel\"]/a)[1]" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion for Added to the bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // Click on continue shopping btn
    clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
    // write text in search box
    typeText(new String[] { XPATH, "//input[@id=\"js-site-search-input\"]" }, "perfume");
    // click on search
    clickOnElement(
      new String[] { CSS, "img[class=\"lazy loaded\"][data-src=\"/_ui/custom-theme/images/esikaLupaIco.svg\"]" });
    // Click on first perfume
    clickOnElement(new String[] { XPATH, "(//div[@class=\"details\"]/a)[8]" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion for Added to the bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // Click on continue shopping
    clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion for added to bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // Start if statement
    if (checkContainsValue(new String[] { XPATH, "//div[@class=\"cart-popup-progress-text\"]" },
      "¡Felicitaciones, alcanzaste el envío gratis!")) {
      // Add Assertion for Congratulations, you reached free shipping
      Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\"cart-popup-progress-text\"]" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // End if statement
    }
    // Start Else Staement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End else statement
    }
    // click on go pay btn
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"cartFreeGiftCarousel-wrapper cart-panel\"]" })) {
      // Add Assertion for gift title
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"panel-title\"]" }));
      // Add Assertion for free gift
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(@class,\"cartFreeGift\")]" }));
      // Add assertion for  thanks to your purchases!
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\"gift-info\"]" }).contains("gracias a tus compras!"));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"free gift card is not present\"");
      // end else statement
    }
    // Scroll Down
    scroll("ScrollDown", 350);
    // change the qantity of the product in cart
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "4");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // scroll
    scroll("ScrollDown", 350);
    // decrease qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "3");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // Add Assertion for The quantity of the product has been updated.
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
    // scroll
    scroll("ScrollDown", 305);
    // Click on remove link for last product
    mouseHoverOnElement(new String[] { XPATH, "(//A[@href=\'#\'][text()=\'Eliminar\'])[8]" });
    // click
    clickOnElement(new String[] { XPATH, "(//A[@href=\'#\'][text()=\'Eliminar\'])[8]" });
    // Add Assertion for The quantity of the product has been updated.
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
    // scroll down
    scroll("ScrollDown", 350);
    // clear qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]");
    // write text in qty selector
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "3");
    // click on enter
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]");
    // start if statement for free shipping
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" })) {
      // Add Assertion for Congratulations, you\'ve reached free shipping!
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" }));
      // end if statement
    }
    // Scroll Down
    scroll("ScrollDown", 442);
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "extraordinario");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Add Assertion for The coupon is not valid
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'El cupón no es válido\')]" }));
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "DESCUENTO");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cupón aplicado exitosamente\')]" })) {
      // Add Assertion for Coupon applied successfully
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cupón aplicado exitosamente\')]" }));
      // Scroll Down
      scroll("ScrollDown", 870);
      // Add Assertion for discount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'DESCUENTO\')]" }));
      // Scroll Up
      scroll("ScrollUp", 290);
      // Click on voucher collapse icon
      clickOnElement(new String[] { XPATH, "//span[@class=\"toggle-button panel-title active\"]" });
      // take a snip to confirm voucher collapse successfully
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"scroll-mobile-coupon\"]" },
        "logs/Screenshots/oxeNPR.png");
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"voucher not applied successfully\"");
      // End else
    }
    // Click on gopay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" })) {
      // click on go pay button
      clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"go pay button is not present\"");
      // End else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" })) {
      // Login as gest user
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
      // end if statement
    }
    // Print Result
    printResults("PrintNote", "\"element is not present\"");
    // start else statement
else{
      // End else statement
    }
    // Click On Address Submit Button
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
    // checkout using credit card
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
    // Add Assertion for order placement successful
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));

    status = "passed";
  }

  @Test
  public void MTOPA_Free_shipping_bar_settingCOneTwoThreeTwo() {
    javascriptExecution("lambda-name=MTOPA Free shipping bar settingCOneTwoThreeTwo");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pa/?consultantUrl=lbelpaulaonline");
    // click on Biphasic Makeup Remover Lotion
    clickOnElement(new String[] { XPATH, "(//div[@class=\'item-details-panel\'])[7]" });
    // clear input
    clearText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" });
    // write text in qty selector
    typeText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }, "5");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // click on cyzone
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[2]" });
    // Click on Perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on qty selector button to add product
    clickOnElement(new String[] { XPATH, "(//button[text()=\'+\'])[2]" });
    // Start if statement
    if (isElementAvailable(
      new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" })) {
      // Add Assertion for free shipping bar
      Assert.assertTrue(getText(
        new String[] { XPATH, "(//span[text()=\'¡Felicitaciones, alcanzaste el envío gratis!\'])[2]" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // Add Assertion For free shipment
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\"col-xs-12 col-cart-totals-row\"]" }).contains("Gratis"));
      // End if statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void MTO_PA_Change_of_Message_from_Maximum_Amount_per_Order_COneTwoFourTwo() {
    javascriptExecution("lambda-name=MTO PA Change of Message from Maximum Amount per Order COneTwoFourTwo");

    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pa/?consultantUrl=lbelpaulaonline");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::div[2]/child::form" });
    // Click on keep buying Button
    clickOnElement(new String[] { XPATH, "(//a[contains(text(),\'Seguir Comprando\')])[1]" });
    // Again Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::div[2]/child::form" });
    // Click on Go pay button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // clear input
    clearText(new String[] { XPATH, "(//input[@class=\'form-control js-update-entry-quantity-input\'])[2]" });
    // Fill maximum quantity in text field
    typeText(new String[] { XPATH, "(//input[@class=\'form-control js-update-entry-quantity-input\'])[2]" }, "10");
    // handle the popup
    moveAndDoubleClickWithOffset(
      new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" }, 60, 60);
    // Add Assertion for The maximum amount allowed per order
    Assert.assertTrue(getText(
      new String[] { XPATH, "//span[contains(text(),\'El monto máximo permitido por pedido es de\')]" }).contains(
      "El monto máximo permitido por pedido es de"));
    // Validate Go pay button is disabled
    Assert.assertFalse(isElementClickable(
      new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" }));

    status = "passed";
  }

  @Test
  public void ECOM_Registro_de_nuevo_usuarioCOneTwoSixEight() {
    javascriptExecution("lambda-name=ECOM Registro de nuevo usuarioCOneTwoSixEight");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-compra.tiendabelcorp.com/co/login/checkout");
    // click on register name
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Registrarme\')]" });
    // add assertion for create new account
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Crea tu nueva cuenta\')]" }));
    // Write text in first name
    typeText(new String[] { XPATH, "//input[@placeholder=\'Nombres*\']" }, "purva 1");
    // Write text in first name
    typeText(new String[] { XPATH, "//input[@placeholder=\'Nombres*\']" }, "Purva");
    // Write text in last  name
    typeText(new String[] { XPATH, "//input[@placeholder=\'Apellidos*\']" }, "gupta 1");
    // Write text in last Name
    typeText(new String[] { XPATH, "//input[@placeholder=\'Apellidos*\']" }, "Gupta");
    // Write text in email
    typeText(new String[] { XPATH, "//input[@placeholder=\'Correo electrónico*\']" }, "cyzoneapp11@gmail.com");
    // Write text in confirm email
    typeText(new String[] { XPATH, "//input[@placeholder=\'Confirmación de correo*\']" }, "purvagupta@endtest-mail.io");
    // Write text in confirm email
    typeText(new String[] { XPATH, "//input[@placeholder=\'Confirmación de correo*\']" }, "cyzoneapp11@gmail.com");
    // Write text in password
    typeText(new String[] { XPATH, "//input[@placeholder=\'Contraseña*\']" }, "Belcorp123");
    // Write text in confirm password
    typeText(new String[] { XPATH, "//input[@placeholder=\'Confirmación de contraseña*\']" }, "1");
    // Write text in confirm password
    typeText(new String[] { XPATH, "//input[@placeholder=\'Confirmación de contraseña*\']" }, "Belcorp123");
    // Select Option from Tipo de documen...
    selectOption(new String[] { XPATH, "//select[@class=\'form-control register-docType registerDocType\']" }, "CC");
    // write text for document number
    typeText(new String[] { XPATH, "//input[@id=\'register.documentNumber\']" }, "987654323412");
    // Click on agree To  receive
    clickOnElement(new String[] { XPATH, "//input[@id=\'register.agreeToReceivePublicity\']" });
    // Click on I accept  terms and conditions
    clickOnElement(new String[] { XPATH, "//input[@id=\'register.belcorpToC\']" });
    // Click on mark if you belong to common regime
    clickOnElement(new String[] { XPATH, "//input[@id=\'Marca si perteneces al régimen común.\']" });
    // add assertion for create account button
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@type=\'submit\']" }));

    status = "passed";
  }

  @Test
  public void scenario_TwoCOneSevenEightNineEightSevenCOneTwoTwozeroCTwoNinezerozero() {
    javascriptExecution("lambda-name=scenario TwoCOneSevenEightNineEightSevenCOneTwoTwozeroCTwoNinezerozero");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultanturl=tiendaprueba");
    // Click on cart icon
    clickOnElement(new String[] { XPATH, "//div[@class=\"mini-cart-icon\"]" });
    // Add Assertion for Your bag is empty
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\"empty-cart-label\"]" }).contains("Tu bolsa se encuentra vacía"));
    // Click on Continue Shopping
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // click on first product in carosul
    clickOnElement(new String[] { XPATH, "(//div[@class=\"item-details-panel\"]/a)[6]" });
    // Click on add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion for Added to the bag
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
    // Click on continue shopping btn
    clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
    // write text in search box
    typeText(new String[] { XPATH, "//input[@id=\"js-site-search-input\"]" }, "perfume");
    // Click on search
    clickOnElement(new String[] { XPATH, "//i[@class=\"glyphicon glyphicon-search\"]" });
    // Click on perfume product
    clickOnElement(new String[] { XPATH, "(//div[@class=\"details\"]/a)[1]" });
    // start if statement
    if (isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" })) {
      // Click on add To Cart Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
      // Add Assertion for Added to the bag
      Assert.assertTrue(
        getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
      // Click on continue shopping
      clickOnElement(new String[] { XPATH, "//a[contains(@class,\"continueShopping btn\")]" });
      // Click on maquillaje
      clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
      // Click on first product
      clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
      // Click on add To Cart Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
      // Add Assertion for added to bag
      Assert.assertTrue(
        getText(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }).contains("Agregado a la bolsa"));
      // Add Assertion for Congratulations, you reached free shipping
      Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\"cart-popup-progress-text\"]" }).contains(
        "¡Felicitaciones, alcanzaste el envío gratis!"));
      // click on go pay btn
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // End if statement
    }
    // Start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else Statement
    }
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"cartFreeGiftCarousel-wrapper cart-panel\"]" })) {
      // Add Assertion for gift title
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"panel-title\"]" }));
      // Add Assertion for free gift
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(@class,\"cartFreeGift\")]" }));
      // Add assertion for thanks to your purchases!
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\"gift-info\"]" }).contains("gracias a tus compras!"));
      // End if statement
    }
    // start else statement
    else {
      // print message in result
      printResults("PrintNote", "\"gift card is not present\"");
      // end else statement
    }
    // Scroll Down
    scroll("ScrollDown", 350);
    // change the qantity of the product in cart
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "4");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // start if statement for alert
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" })) {
      // Add Assertion for please reduce the order to this amount.
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-danger alert-dismissable\"]" }));
      // end if statement
    }
    // scroll
    scroll("ScrollDown", 350);
    // decrease qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // write text in quantity
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "3");
    // click on enter key
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
    // Add Assertion for The quantity of the product has been updated.
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
    // scroll
    scroll("ScrollDown", 350);
    // Click on remove link for last product
    mouseHoverOnElement(new String[] { XPATH, "(//A[@href=\'#\'][text()=\'Eliminar\'])[8]" });
    // Add Assertion for The quantity of the product has been updated.
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"alert alert-success alert-dismissable\"]" }));
    // scroll down
    scroll("ScrollDown", 305);
    // clear qty
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]");
    // write text in qty selector
    typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "3");
    // click on enter
    pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]" },
      "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_1\"]");
    // Add Assertion for Congratulations, you\'ve reached free shipping!
    Assert.assertTrue(getText(new String[] { XPATH,
      "//div[@class=\"visible-md visible-lg\"]//div[@class=\"cart-popup-progress-text\"]" }).contains(
      "¡Felicitaciones, alcanzaste el envío gratis!"));
    // Scroll Down
    scroll("ScrollDown", 442);
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "extraordinario");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Add Assertion for The coupon is not valid
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'El cupón no es válido\')]" }));
    // Write text in voucher code
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "DESCUENTO");
    // Click on apply voucher
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cupón aplicado exitosamente\')]" })) {
      // Add Assertion for Coupon applied successfully
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cupón aplicado exitosamente\')]" }));
      // Scroll Down
      scroll("ScrollDown", 870);
      // Add Assertion for discount
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text() ,\'Descuento\')]" }));
      // Scroll Up
      scroll("ScrollUp", 290);
      // Click on voucher collapse icon
      clickOnElement(new String[] { XPATH, "//span[@class=\"toggle-button panel-title active\"]" });
      // take a snip to confirm voucher collapse successfully
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"scroll-mobile-coupon\"]" },
        "logs/Screenshots/QVESob.png");
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"voucher not applied successfully\"");
      // End else statement
    }
    // Click on gopay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // guest user login
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
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" })) {
      // click on go pay button
      clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\"guest.firstName\"]" })) {
      // login as guest user
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
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End else statement
    }
    // Click On Address Submit Button
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
    // checkout using credit card
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
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // Add Assertion for order placement successful
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // end if
    }
    // start else
    else {
      // Add Assertion for Your payment was declined. Choose another of the available payment methods
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//span[text() = \"Tu pago fue rechazado. Elige otro de los medios de pago disponibles\"]" }));
      // end else
    }

    status = "passed";
  }
}