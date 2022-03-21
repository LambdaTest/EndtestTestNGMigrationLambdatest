package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Regression_Mexico_MTO extends WebDriverHelper {

  @Test
  public void SCENARIO_Three_Purchase_in_virtual_store__Google_User__cash_OXXOCSixzeroSevenCTwoSevenOneSix() {
    javascriptExecution(
      "lambda-name=SCENARIO Three Purchase in virtual store  Google User  cash OXXOCSixzeroSevenCTwoSevenOneSix");

    // clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // User login
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
    // Click on Personal care
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Click on search Bar
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" });
    // Write text in Search bar
    typeText(new String[] { CSS,
        "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" },
      "perfume");
    // Click on Search Symbol
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > span > button > i" });
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on Perfume De Muje
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // Click on Keep Buying
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__right\']/../..//a[contains(@class,\'continueShopping\')]" });
    // Click on Esika
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on  second product from carousel
    clickOnElement(
      new String[] { XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[2]" });
    // Click on Add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // Add Assertion for Subtotal
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[text() = \"Subtotal\"]" }));
    // Click on Keep Buying
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__right\']/../..//a[contains(@class,\'continueShopping\')]" });
    // Click on cyzone
    clickOnElement(new String[] { XPATH, "//header/nav/div[1]/div[@class=\'row\']/div[1]/div/div/a[3]" });
    // Click on search Bar
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" });
    // Write text in search Bar
    typeText(new String[] { CSS,
        "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" },
      "perfume");
    // Click on Search Symbol
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > span > button > i" });
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text()=\'perfumes\']" });
    // Click on Mon L\'Bel Perfu...
    clickOnElement(
      new String[] { XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[3]" });
    // Click on Add to cart
    clickOnElement(new String[] { ID, "addToCartButton" });
    // Add Assertion for SubTotal
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[text() = \"Subtotal\"]" }));
    // Click on Go Pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click on Again Go Pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'priceContainer\']/parent::div/parent::div/child::div[2]/child::div/child::button[contains(text(),\'Ir a pagar\')]" });
    // Guest user
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
    // shipping address details
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
    // click on OXXo option
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
    // Add assertion for success message
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));

    status = "passed";
  }

  @Test
  public void MX__ETwoE_Access_from_the_landing_of_brands__guest_user_and_checkout___CEightThreeSix() {
    javascriptExecution(
      "lambda-name=MX  ETwoE Access from the landing of brands  guest user and checkout   CEightThreeSix");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // Mouse hover on  personal care
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on  \"Linea\"
    clickOnElement(new String[] { CSS, "a[href=\"/mx/c/lbel-0405/mx202108\"]" });
    // Click on Ligne Experte E
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]" });
    // Add assertion for \"Ligne experte image1\"
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(1) > div > li > a > img" }));
    // Add assertion for \"Ligne experte image2\"
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img" }));
    // Add assertion for \"Ligne experte image3\"
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img" }));
    // Add assertion for \"Ligne experte image4\"
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img" }));
    // Add assertion for price
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > span:nth-of-type(2)" }));
    // Add assertion for quantity
    Assert.assertTrue(isElementAvailable(new String[] { ID, "pdpAddtoCartInput" }));
    // Add assertion for \"share link\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"share-btn-icon shareBtnShare\"]" }));
    // Add assertion for add to cart button
    Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
    // Click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
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
    // shipping address details
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
    // agency banking
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
    // start if
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // success messgae
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // end if
    }

    status = "passed";
  }

  @Test
  public void Validate_button_Add_Set_to_bag_when_choosing_tone__option_is_missingCFourEightFive() {
    javascriptExecution(
      "lambda-name=Validate button Add Set to bag when choosing tone  option is missingCFourEightFive");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=BelcorpJess");
    // Scroll Down
    scroll("ScrollDown", 577);
    // Click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"item-details-panel\"]/a" });
    // Add Assertion for name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
    // Scroll Down
    scroll("ScrollDown", 448);
    // Add Assertion for Recomendación s...
    Assert.assertTrue(
      getText(new String[] { XPATH, "//h3[contains(@class,\"commercialCarousel-pdp-title\")]" }).contains(
        "Promociones exclusivas"));
    // start if statement for recomendation just for you
    if (isElementAvailable(new String[] { XPATH,
      "//h3[con//div[text() = \"Recomendación solo para ti\"]tains(@class,\"commercialCarousel-pdp-title\")]" })) {
      // Add Assertion for Recomendación just for you
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Recomendación solo para ti\"]" }));
      // Click on see details of set
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" });
      // Click on add set to cart
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent button#recommendationBundleAddToCartButton" });
      // Add Assertion for added to bag
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//p[text() = \"Agregado a la bolsa\"]" }));
      // Add Assertion for product name in cart
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//span[text() = \"Labial Dúo Hydra Matte + Gel Retexturizante Primer de Maquillaje\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Recomendación solo para ti coupon is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void MX__ETwoE_create_account__Tiered_Discount__CCCThreeSevenFourzero() {
    javascriptExecution("lambda-name=MX  ETwoE create account  Tiered Discount  CCCThreeSevenFourzero");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/?consultanturl=tiendaprueba");
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
    // start if statement for promotion exclusives
    if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]" })) {
      // start if statement for conditional promotions
      if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Promoción condicionada\')]" })) {
        // click on see combinations
        clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ver combinaciones\')]" });
        // Add Assertion for conditional promotion products
        Assert.assertTrue(checkCurrentUrlContains("isConditionOf"));
        // Take a screen shot to Validate that the list of products conditional for the promotion is displayed
        takeScreenshot("logs/Screenshoots/SvEtkM.png");
        // Go back to PDP
        goBack();
        // wait until add to cart button clickeble
        waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10", "disabled");
        // end if statement for conditional promotion
      }
      // start else statement
      else {
        // print in results
        printResults("PrintNote", "\"conditional promotion gift card for product not found \"");
        // end else statement
      }
      // end if statement for promotion exclusives
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"promotional conditions not found\"");
      // end else statement
    }
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
      // add assertion for qty increase/decrease btn
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]" }));
      // take a snip to validate product title /CUV/stock
      takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" }, "logs/Screenshots/CqfWAX.png");
      // add assertion for eliminate link
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
      // start if statement for tiered discount
      if (isElementAvailable(new String[] { XPATH, "//span[@class=\"cart-entry-message\"]" })) {
        // change the qty of product
        pressKey(
          new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
          "BACKSPACE");
        // increase the qty
        typeText(
          new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
          "2");
        // press enter
        pressKey(
          new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" },
          "ENTER");
        // add assertion for tiered discount
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]" }));
        // end if statement
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"tiered discount not found\"");
        // end else statement
      }
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
    // mexico credit card details
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
    // start if statement for sucess message
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // Add assertion for sucess message
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // End if statement for sucess message
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"the entered credit card number is not proper\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Scenario_OneEight_MX__Payment_rejected_with_debit_cardCTwoEightFourOne_PHASETwo() {
    javascriptExecution("lambda-name=Scenario OneEight MX  Payment rejected with debit cardCTwoEightFourOne PHASETwo");

    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/?consultantUrl=tiendaprueba");
    // Click on Personal Care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Login As Guest User
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
    // Shipping Address Details
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
    // Checkout Using  Debit Card
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
    // Add Assertion For Rejected Payment
    Assert.assertTrue(getText(new String[] { CSS, "div#cboxLoadedContent div > span" }).contains(
      "Lo sentimos, en este momento no podemos procesar tu pago, intenta de nuevo mas tarde o elige otro método de pago"));
    // Take Snip
    takeScreenshotOfParticularElement(new String[] { CSS, "div#cboxLoadedContent div > span" },
      "logs/Screenshots/ImzYro.png");

    status = "passed";
  }

  @Test
  public void Validate_gift_modalCFourSevenThree() {
    javascriptExecution("lambda-name=Validate gift modalCFourSevenThree");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/?consultantUrl=BelcorpJess");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
    // Add Assertion forproduct name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
    // Scroll Down
    scroll("ScrollDown", 383);
    // Add Assertion for Promociones exclusives
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]" }));
    // Add Assertion for gift products
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h3[contains(text(),\'Promociones exclusivas\')]/..//div[@class=\"owl-wrapper-outer\"]" }));

    status = "passed";
  }

  @Test
  public void MX__ETwoE_Set_variable_conditional__supported__Free_Shipping__Agency__BankingCThreeSevenOneOnephaseTwo() {
    javascriptExecution(
      "lambda-name=MX  ETwoE Set variable conditional  supported  Free Shipping  Agency  BankingCThreeSevenOneOnephaseTwo");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL(
      "https://s1-esika.tiendabelcorp.com/mx/multiprotector-rostro-acabado-mate-perfect-block/p/200098648/BelcorpJess");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
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
      // start if statement for promotion exclusives
      if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]" })) {
        // start if statement for see combination
        if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Promoción condicionada\')]" })) {
          // add assertion for see product
          Assert.assertTrue(
            isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Promoción condicionada\')]" }));
          // click on see product
          javascriptExecution("document.querySelector(\"div#lazyLoadCommercialCarousel a\").click();");
          // add assertion for condition of
          Assert.assertTrue(checkCurrentUrlContains("Condition"));
          // Take a screen shot to Validate that the list of products conditional for the promotion is displayed
          takeScreenshot("logs/Screenshoots/XchAcx.png");
          // Go back to PDP
          goBack();
          // wait until add to cart button clickeble
          waitUntil("CheckClickableElement", new String[] { XPATH, "//button[@id='addToCartButton']" }, "10",
            "disabled");
          // end if statement for conditional promotion
        }
        // start else statement
        else {
          // print in results
          printResults("PrintNote", "\"see products gift card for product not found \"");
          // end else statement
        }
        // end if statement for promotion exclusives
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"promotional conditions not found\"");
        // end else statement
      }
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
        takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" }, "logs/Screenshots/KTuFrv.png");
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
      // mexico guest user login
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
      // mexico shipping address
      // start if statement for postal code
      if (isElementAvailable(new String[] { XPATH, "//input[@id=\'address.postalCode\']" })) {
        // wait until postal code
        waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@id='address.postalCode']" }, "10",
          "disabled");
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
      // mexico
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
      // start if statement for sucess message
      if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
        // Add assertion for sucess message
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
        // End if statement for sucess message
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"the entered credit card number is not proper\"");
        // end else statement
      }
      // end if
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"the product with see combinations is not available\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void MX_ETwoE_apply_Discount__CC_couponCFiveSixFiveCThreeSevenFourFive() {
    javascriptExecution("lambda-name=MX ETwoE apply Discount  CC couponCFiveSixFiveCThreeSevenFourFive");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to Mexico consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/?consultanturl=tiendaprueba");
    // Click on personal care
    clickOnElement(new String[] { XPATH, "//a[text()=\'cuidado personal\']" });
    // Click on Second Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a" });
    // Click on add to cart button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Validate \"Not Free \" is not Present
    Assert.assertFalse(getText(new String[] { XPATH, "//span[@class=\'free-delivery-amount\']" }).contains("Gratis"));
    // Write text in Coupon Text field
    typeText(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" },
      "AHORAONUNCA");
    // Click on Apply button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // Coupon successfully applied is present
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class=\'voucherSuccessMessage desktop\']/child::span[text()=\'Cupón aplicado exitosamente\']" })) {
      // Validate Coupon successfully applied
      Assert.assertTrue(getText(new String[] { XPATH,
        "//div[@class=\'voucherSuccessMessage desktop\']/child::span[text()=\'Cupón aplicado exitosamente\']" }).contains(
        "aplicado exitosamente"));
      // End If Statement
    }
    // Coupon is not  applied Text is present
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class=\'js-voucher-validation-container help-block cart-voucher__help-block\']" })) {
      // Validate Coupon is not  applied
      Assert.assertTrue(getText(new String[] { XPATH,
        "//div[@class=\'js-voucher-validation-container help-block cart-voucher__help-block\']" }).contains(
        "El cupón no es válido"));
      // End of If Loop
    }
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
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
    // shipping address details
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
    // credit card details
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
  public void Purchase_in_virtual_store__registered_user__cash_BBVA_Bancomer__CSixzeroSixCTwoSixEightTwo() {
    javascriptExecution(
      "lambda-name=Purchase in virtual store  registered user  cash BBVA Bancomer  CSixzeroSixCTwoSixEightTwo");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // Mouse hover on  personal care
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on  \"Linea\"
    clickOnElement(new String[] { CSS, "a[href=\"/mx/c/lbel-0405/mx202108\"]" });
    // Click on Ligne Experte E
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]" });
    // Add assertion for add to cart button
    Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
    // Click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // Click on continue shopping button
    clickOnElement(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)" });
    // click on esika link
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']" });
    // Mouse hover on  Cuidado personal
    mouseHoverOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // click on hair
    clickOnElement(new String[] { XPATH, "//a[text() = \"Cabello\"]" });
    // click on shampoo
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200090337-FotoFondoBlancoSB.jpg\"]" });
    // Add assertion for add to cart button
    Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
    // click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // click on continue shopping button
    clickOnElement(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)" });
    // click on cyzone link
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']" });
    // Mouse hover on  Cuidado personal
    mouseHoverOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // click on product \"Click on Cuerpo\"
    clickOnElement(new String[] { XPATH, "//a[text() = \"Cuerpo\"]" });
    // Click on \"jabón íntimo xp\"
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200092282_fotocrosselling.jpg\"]" });
    // Add assertion for  \"add to cart\" button
    Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
    // click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
    // click on go pay button
    clickOnElement(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // click on user name
    clickOnElement(new String[] { ID, "j_username" });
    // write text in user name
    typeText(new String[] { ID, "j_username" }, "test_user_92792380@testuser.com");
    // Write text in password
    typeText(new String[] { ID, "j_password" }, "Qatest2042");
    // click on login button
    clickOnElement(new String[] { CSS, "form#loginForm > button" });
    // start if
    if (isElementAvailable(new String[] { CSS,
      "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" })) {
      // click on gopay
      clickOnElement(new String[] { CSS,
        "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
      // end if
    }
    // if go pay present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\' Ir a pagar\')]" })) {
      // click in cart go pay button
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
      // end if go pay present
    }
    // Guest user login
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
    // credit card details
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
      // add assertion for checkout success
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // end if
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"payment unsuccessful\"");
      // extra steps for deleting
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
      // end else
    }

    status = "passed";
  }

  @Test
  public void Validate_modal_Product_informationCFourEightTwo() {
    javascriptExecution("lambda-name=Validate modal Product informationCFourEightTwo");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=BelcorpJess");
    // Click on tratamiento facial
    clickOnElement(new String[] { XPATH, "//a[text() = \"tratamiento facial\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
    // add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
    // Scroll Down
    scroll("ScrollDown", 315);
    // start if statement for promotion exclusive
    if (isElementAvailable(new String[] { CSS, "div#lazyLoadCommercialCarousel h3" })) {
      // Add Assertion for Promociones exclusive
      Assert.assertTrue(
        getText(new String[] { XPATH, "//h3[contains(@class,\"commercialCarousel-pdp-title\")]" }).contains(
          "Promociones exclusivas"));
      // Add Assertion for Recomendación just for you
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Recomendación solo para ti\"]" }));
      // Click on See set detail
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" });
      // Add Assertion for just for you
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Solo para ti\"]" }));
      // Click on close button
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if statement
    }
    // start else statement
    else {
      // print in results
      printResults("PrintNote", "\"Recomendación solo para ti coupon is not present\"");
      // end else statements
    }

    status = "passed";
  }

  @Test
  public void MX__ETwoE_Access_from_the_landing_of_brands_categories__guest_user_and_checkout_Agency__BankingCFiveFiveFour() {
    javascriptExecution(
      "lambda-name=MX  ETwoE Access from the landing of brands categories  guest user and checkout Agency  BankingCFiveFiveFour");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to chili consultant URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/?consultanturl=tiendaprueba");
    // Click on Bela product
    clickOnElement(new String[] { XPATH, "//a[text() = \"Bela\"]" });
    // Add Assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Click on change img 1
    clickOnElement(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img" });
    // Click on change img 2
    clickOnElement(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img" });
    // Click on change img 3
    clickOnElement(
      new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img" });
    // Add Assertion crossed out price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]" }));
    // add assertion for qty selector
    Assert.assertTrue(isElementAvailable(new String[] { ID, "pdpAddtoCartInput" }));
    // Add Assertion for Descripción
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h2[text() = \"Descripción\"]" }));
    // Add Assertion for add to cart button
    Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
    // Click on add to cart button
    clickOnElement(new String[] { ID, "addToCartButton" });
    // Click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for product info title
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]" }));
    // Add Assertion for remove link
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a" }));
    // Add Assertion for go pay button
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" }));
    // Add Assertion for Bela
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Bela\"]" }));
    // Add Assertion for price
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(4)" }));
    // Add Assertion for total price
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(5)" }));
    // Click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for return Bag
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "a[class=\"returnBag\"]" }));
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
    // shipping address
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
    // credit card details
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
    // Add Assertion for order placement successful
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));

    status = "passed";
  }
}