package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression_Colombia_MTO extends WebDriverHelper {

  @Test
  public void CO__ETwoE_apply_Discount_coupon__CCCThreeSevenFourThree() {
    javascriptExecution("lambda-name=CO  ETwoE apply Discount coupon  CCCThreeSevenFourThree");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL(" https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title = \"Perfumes\"]" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Add Assertion For Add To Cart Button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Write text in Voucher Code Texbox
    typeText(new String[] { CSS, "input[class=\"js-voucher-code cart-voucher__input form-control input-sm\"]" },
      "BIENVENIDO20");
    // Click on Apply Button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'promotion\']" })) {
      // Add Assertion For Discount Bar
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'promotion\']" }));
      // Add Assertion For Discount amount
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'col-xs-6 cart-totals-right text-right discount\']" }));
      // End if statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else Statement
    }
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Login as a guest user
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
    // Checkout Using Credit card
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
    // Add Assertion for Order Confirmation Message
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
    // scroll
    scrollIntoElementView(new String[] { CSS, "div.continue__shopping.hidden-xs.hidden-sm > button" });
    // Click on
    clickOnElement(new String[] { CSS, "div.continue__shopping.hidden-xs.hidden-sm > button" });
    // Click On For You section
    clickOnElement(new String[] { CSS, "li:nth-child(12) > div > div > a" });
    // start if statement
    if (isDisplayed(new String[] { CSS, "div#EsikaBicPromotionsLandingPageSection1 img" }, 0)) {
      // Add Assertion For Promotion Section
      Assert.assertTrue(isElementDisplayed(new String[] { CSS, "div#EsikaBicPromotionsLandingPageSection1 img" }));
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"Promotion Section Is not Present\"");
      // End Else statement
    }

    status = "passed";
  }

  @Test
  public void CO__ETwoE_Access_from_the_brand_guest_user_and_checkout__CEightThreeFive() {
    javascriptExecution("lambda-name=CO  ETwoE Access from the brand guest user and checkout  CEightThreeFive");

    // clear cache and cookies
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
    clickOnElement(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button" });
    // click on \"go pay\" button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
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
    // Checkout using agency option
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
    // Add assertion for \"name\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
    // Add assertion \"Shipping Address\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"well-headline orderPending\"]" }));

    status = "passed";
  }

  @Test
  public void CO__ETwoE_Add_supported_from_link__Free_Shipping__Agency_CThreeSevenOneTwo() {
    javascriptExecution("lambda-name=CO  ETwoE Add supported from link  Free Shipping  Agency CThreeSevenOneTwo");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // click on \"add to cart\" button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on \"go pay\" button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Check  For  Free shipping
    if (isElementAvailable(new String[] { XPATH, "(//span[@class=\'cart-popup-progress-highlight\'])[2]" })) {
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
      // Add assertion for \"successful message\"
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
      // Add assertion \"Shipping Address\"
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"well-headline orderPending\"]" }));
      // End If Statement
    }
    // Start Else Statement
    else {
      // Print result
      printResults("PrintNote", "\"Free Shipping not Available\"");
      // End Else statement
    }

    status = "passed";
  }

  @Test
  public void CO__ETwoE_Add_supported_from_carousel_in_PDP__Free_Sample_COneSevenFiveSixSixThree() {
    javascriptExecution(
      "lambda-name=CO  ETwoE Add supported from carousel in PDP  Free Sample COneSevenFiveSixSixThree");

    // Clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // Click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // select product
    clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
    // cross out price assertion
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
    // add quantity assertion
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']" }));
    // add quantity
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']" });
    // Reduce quantity assertion
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']" }));
    // if add to cart present
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // assertion on \"Add to cart\"
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // end if add to cart present
  }
  // if add to cart clickable
Assert.assertTrue(

  isElementClickable(new String[] {
    XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"
  }));

  // add to cart
  clickOnElement( new String[] {
    XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"
  });
  // assertion on \"keep buying\"
Assert.assertTrue(

  isElementDisplayed(new String[] {
    XPATH, "//a[contains(text(),\'Seguir Comprando\')]"
  }));
  // assertion on \"Go Pay\"
Assert.assertTrue(

  isElementAvailable(new String[] {
    XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"
  }));
  // Click on go pay
  // if condition for \"go pay\" present
if(

  isElementAvailable(new String[] {
    XPATH, "//a[contains(text(),\'Ir a pagar\')]"
  }))

  {
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
else

  {
    // print message
    printResults("PrintNote", "go pay is not present");
    // end else statement  \"go pay\" present
  }
  // if free sample present
if(

  isElementAvailable(new String[] {
    XPATH, "//div[@class=\'owl-wrapper-outer autoHeight\']"
  }))

  {
    // Add assertion free sample
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'owl-wrapper-outer autoHeight\']" }));
    // end if free sample present
  }
  // if \"go pay\" cart  is present
if(

  isElementAvailable(new String[] {
    XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"
  }))

  {
    // click on cart go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // end if go pay cart present
  }

  // Proceed as guest user
  // Write text in guest firstName text field
  typeText(new String[] {
    ID, "guest.firstName"
  },"photon");

  // Write text in guest lastName text field
  typeText(new String[] {
    ID, "guest.lastName"
  },"test");

  // Write text in  guest email textfield
  typeText(new String[] {
    ID, "guest.email"
  },"photontest@endtest-mail.io");

  // Click on guest agree To Receive publicity checkbox
  clickOnElement( new String[] {
    ID, "guest.agreeToReceivePublicity"
  });

  // click on guest belcorp T&c checkbox
  clickOnElement( new String[] {
    ID, "guest.belcorpToC"
  });

  // click on billing Common System checkbox
  clickOnElement( new String[] {
    NAME, "billingCommonSystem"
  });

  // Click on guest login submit button
  clickOnElement( new String[] {
    XPATH, "//button[text() = \"Continuar como invitado\"]"
  });

  // wait for address fields
  waitUntil("CheckVisibleElement",new String[] {
    ID, "address.regionIsoParent1"
  },"10","disabled");

  // Select Option from department
  selectOption(new String[] {
    XPATH, "//select[@id=\'address.regionIsoParent1\']"
  },"CO-DEP-76");

  // Select Option from location
  selectOption(new String[] {
    XPATH, "//select[@id=\'address.regionIso\']"
  },"76-BOGOTA");

  // Write text in STREET AND NUMBER
  typeText(new String[] {
    NAME, "line1"
  },"church street");

  // Write text in Appartment TextBox
  typeText(new String[] {
    NAME, "line2"
  },"n70-306");

  // Write text in Address Reference TextBox
  typeText(new String[] {
    NAME, "referencia"
  },"206");

  // Write text in phone number textbox
  typeText(new String[] {
    NAME, "phone"
  },"7875675765");

  // Click on addressSubmit
  clickOnElement( new String[] {
    XPATH, "//button[@class=\'btn btn-magenta btn-block checkout-next\']"
  });

  // Checkout Using Agency option
  // Wait
  waitUntil("CheckVisibleElement",new String[] {
    CSS, "div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label"
  },"10","disabled");

  // Click on Payment in Agents section
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label\").click();");

  // wait
  waitUntil("CheckVisibleElement",new String[] {
    CSS, "input#docNumberCash"
  },"5","disabled");

  // WriteText in Document number
  typeText(new String[] {
    CSS, "input#docNumberCash"
  },"1234567890");

  // scroll
  scrollIntoElementView( new String[] {
    CSS, "input#Terms1_mpagoCashForm"
  });

  // Click on T&C chec
  javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();");

  // wait
  waitUntil("CheckClickableElement",new String[] {
    XPATH, "//button[@class='btn btn-block submit_mpagoCashForm checkout-next']"
  },"6","disabled");

  // Click on Pay Button
  clickOnElement( new String[] {
    XPATH, "//button[@class=\'btn btn-block submit_mpagoCashForm checkout-next\']"
  });
  // if confirmation page present
if(

  isElementAvailable(new String[] {
    XPATH, "//div[@class=\'checkout-success__body__headline\']"
  }))

  {
    // Add assertion for confirmation
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
    // end if confirmation page present
  }
  // end if add to cart clickable
}

    status="passed";
      }
@Test public void CO__ETwoE_Add_supported_from_link__Free_Shipping__Agency_BankingCThreeSixNineEight(){
  javascriptExecution("lambda-name=CO  ETwoE Add supported from link  Free Shipping  Agency BankingCThreeSixNineEight");

  // clear cache
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to URL
  getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // wait
  waitUntil("CheckVisibleElement",new String[]{XPATH,"//a[@title='Maquillaje']"},"10","disabled");
  // Click On Makeup Section
  clickOnElement(new String[]{XPATH,"//a[@title=\'Maquillaje\']"});
  // Click on first product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // Start if Satement
  if(isElementAvailable(new String[]{XPATH,"//a[text() = \"Ver productos\"]"})){
  // Click On See Products
  javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
  // Click On First Product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // Add Assertion for old price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
  // Add Assertion for active price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
  // Add Assertion for qty selector button (+)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//button[@class=\'btn js-qty-selector-plus\']"}));
  // Add Assertion for qty selector button (-)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//button[@class=\'btn js-qty-selector-minus\']"}));
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//button[@class=\'variantSelectorButton \']"})){
  // Click On Choose Variant
  clickOnElement(new String[]{XPATH,"//button[@class=\'variantSelectorButton \']"});
  // Click On 1st Tone
  clickOnElement(new String[]{XPATH,"(//div[@class=\'selectorContainer\'][@data-value=\'0\'])[2]"});
  // Click on Applicar Button
  javascriptExecution("document.querySelector(\"div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton \").click();");
  // End If statement
  }
  // Start Else
  else{
  // Print Result
  printResults("PrintNote","\"Choose Tone Button Is Not Present\"");
  // End else statement
  }
  // end if statement
  }
  // Start Else Statement
  else{
  // Print Result
  printResults("PrintNote","\"See Products Is Not Present\"");
  // End Else Statement
  }
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//a[text() = \"Ver combinaciones\"]"})){
  // Add Assertion For Product Present For Combination
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//a[text() = \"Ver combinaciones\"]"}));
  // Click On See Combination
  javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
  // Click On First Product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // Click on Add to cart button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // Click On Go Pay Button
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Add Assertion for qty selector(+) button
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//button[text()=\'+\'])[2]"}));
  // Add Assertion for qty selector(-) button is not enabled
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//button[text()=\'-\'])[2]"}));
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"(//div[@class=\'cart-popup-progress-text\'])[2]/span[2]"})){
  // Add Assertion For Free Shipping Bar
  Assert.assertTrue(getText(new String[]{XPATH,"(//div[@class=\'cart-popup-progress-text\'])[2]/span[2]"}).contains("¡Felicitaciones, alcanzaste el envío gratis!"));
  // Add Assertion For free shipment
  Assert.assertTrue(getText(new String[]{XPATH,"//span[@class=\'free-delivery-amount\']"}).contains("Gratis"));
  // End If statement
  }
  // start else statement
  else{
  // Print Result
  printResults("PrintNote","\"element is not present\"");
  // End Else Statement
  }
  // click on go pay button
  clickOnElement(new String[]{XPATH,"//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
  // Login as guest user
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout Using Agency Banking
  // Wait
  waitUntil("CheckVisibleElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label"},"10","disabled");
  // Click on Payment in Agents section
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label\").click();");
  // wait
  waitUntil("CheckVisibleElement",new String[]{CSS,"input#docNumberCash"},"5","disabled");
  // WriteText in Document number
  typeText(new String[]{CSS,"input#docNumberCash"},"1234567890");
  // scroll
  scrollIntoElementView(new String[]{CSS,"input#Terms1_mpagoCashForm"});
  // Click on T&C chec
  javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();");
  // wait
  waitUntil("CheckClickableElement",new String[]{XPATH,"//button[@class='btn btn-block submit_mpagoCashForm checkout-next']"},"6","disabled");
  // Click on Pay Button
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-block submit_mpagoCashForm checkout-next\']"});
  // Add Assertion for congratulation message
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"}));
  // End if Statement
  }
  // start else Statement
  else{
  // Print Result
  printResults("PrintNote","\"See Combination Is Not present\"");
  // End else Statement
  }

  status="passed";
  }
@Test public void COETwoE_create_account__Tiered_Discount__CCCFiveFiveEight(){
  javascriptExecution("lambda-name=COETwoE create account  Tiered Discount  CCCFiveFiveEight");

  // Clear cache cookies
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to consultant URL
  getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // Click on makeup
  clickOnElement(new String[]{XPATH,"//a[text()=\'maquillaje\']"});
  // click on first product
  clickOnElement(new String[]{XPATH,"(//a[@class=\"name\"])[1]"});
  // Increase quantity for discount
  typeText(new String[]{XPATH,"//input[@class=\'form-control js-qty-selector-input\']"},"0");
  // Click on enter key
  pressKey(new String[]{XPATH,"//input[@class=\'form-control js-qty-selector-input\']"},"//input[@class=\'form-control js-qty-selector-input\']");
  // Click on add to cart button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // Click on go pay button
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Check if discount is present
  if(isElementAvailable(new String[]{XPATH,"//div[@class=\'col-xs-6 cart-totals-left discount\']"})){
  // Validation For Tiered discount
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'col-xs-6 cart-totals-left discount\']"}));
  // End If Statement
  }
  // Start Else Statement
  else{
  // Print Result
  printResults("PrintNote","\"Tiered discount is not Available\"");
  // End Else Statement
  }
  // Click on go pay button
  clickOnElement(new String[]{XPATH,"//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
  // guest user login
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout Using Credit Card
  // wait for credit card
  waitUntil("CheckClickableElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label"},"10","disabled");
  // click on credit card
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
  // start if statement for card holder name
  if(isElementClickable(new String[]{CSS,"form#mpago_credit input#cardholderName"})){
  // wait for card holder name
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit input#cardholderName"},"10","disabled");
  // write cardholder name
  typeText(new String[]{CSS,"form#mpago_credit input#cardholderName"},"APRO");
  // write card number
  typeText(new String[]{CSS,"input#cardNumber"},"4013540682746260");
  // select expiry month
  selectOption(new String[]{XPATH,"//select[@id=\"expirationMonth\"]"},"11");
  // select expiry year
  selectOption(new String[]{XPATH,"//select[@id=\"expirationYear\"]"},"2025");
  // write CVV number
  typeText(new String[]{CSS,"form#mpago_credit input#securityCode"},"123");
  // write text in document number
  typeText(new String[]{CSS,"input#docNumber"},"1234567890");
  // click on terms and condition
  clickOnElement(new String[]{CSS,"input#Terms1_mpagoCreditCardForm"});
  // wait for pay button
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type='button']"},"10","disabled");
  // click on pay button
  clickOnElement(new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
  // endif statement
  }
  // start else statemnet
  else{
  // print in result
  printResults("PrintNote","\"credit card data is not proper\"");
  // end else
  }
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"})){
  // Validation for\" checkout success message\"
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"}));
  // end if statement
  }
  // start else statement
  else{
  // Add assertion for \"successful message\"
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div[class=\"checkout-success__body__headline\"]"}));
  // end else statement
  }

  status="passed";
  }
@Test public void COETwoE_apply_Discount_coupon__CCCThreeSevenOneSix(){
  javascriptExecution("lambda-name=COETwoE apply Discount coupon  CCCThreeSevenOneSix");

  // Clear cache cookies
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to consultant URL
  getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // click on personal care
  clickOnElement(new String[]{XPATH,"//a[@title=\'Cuidado personal\']"});
  // click on first product
  clickOnElement(new String[]{XPATH,"(//a[@class=\"name\"])[1]"});
  // Add Assertion for old price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
  // Add Assertion for active price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
  // Add Assertion for qty selector button (+)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//button[@class=\'btn js-qty-selector-plus\']"}));
  // Add Assertion for qty selector button (-)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//button[@class=\'btn js-qty-selector-minus\']"}));
  // Click on add to cart button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // Click on go pay button
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Write text in coupon text field
  typeText(new String[]{CSS,"input#js-voucher-code-text"},"AHORAONUNCA");
  // Check If Coupon is Available
  if(isElementAvailable(new String[]{CSS,"button#js-voucher-apply-btn"})){
  // click on apply coupon button
  clickOnElement(new String[]{CSS,"button#js-voucher-apply-btn"});
  // start if discount amount is coming
  if(isElementAvailable(new String[]{CSS,"div#voucherSuccessMessageDesktop > span"})){
  // Add Assertion For Coupon apply message
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div#voucherSuccessMessageDesktop > span"}));
  // end if statement
  }
  // start else statement
  else{
  // Print Result
  printResults("PrintNote","\"Discount amount is not present\"");
  // End else statement
  }
  // End  If Statement
  }
  // start else statement
  else{
  // Print Result
  printResults("PrintNote","\"element is not present\"");
  // End Else Statement
  }
  // Click on go pay button
  clickOnElement(new String[]{XPATH,"//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
  // guest user login
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout using credit card
  // wait for credit card
  waitUntil("CheckClickableElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label"},"10","disabled");
  // click on credit card
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
  // start if statement for card holder name
  if(isElementClickable(new String[]{CSS,"form#mpago_credit input#cardholderName"})){
  // wait for card holder name
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit input#cardholderName"},"10","disabled");
  // write cardholder name
  typeText(new String[]{CSS,"form#mpago_credit input#cardholderName"},"APRO");
  // write card number
  typeText(new String[]{CSS,"input#cardNumber"},"4013540682746260");
  // select expiry month
  selectOption(new String[]{XPATH,"//select[@id=\"expirationMonth\"]"},"11");
  // select expiry year
  selectOption(new String[]{XPATH,"//select[@id=\"expirationYear\"]"},"2025");
  // write CVV number
  typeText(new String[]{CSS,"form#mpago_credit input#securityCode"},"123");
  // write text in document number
  typeText(new String[]{CSS,"input#docNumber"},"1234567890");
  // click on terms and condition
  clickOnElement(new String[]{CSS,"input#Terms1_mpagoCreditCardForm"});
  // wait for pay button
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type='button']"},"10","disabled");
  // click on pay button
  clickOnElement(new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
  // endif statement
  }
  // start else statemnet
  else{
  // print in result
  printResults("PrintNote","\"credit card data is not proper\"");
  // end else
  }
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"})){
  // Validation for\" checkout success message\"
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"}));
  // end if statement
  }

  status="passed";
  }
@Test public void CO__ETwoE_apply_Discount_coupon__CCCFiveSixThree(){
  javascriptExecution("lambda-name=CO  ETwoE apply Discount coupon  CCCFiveSixThree");

  // clear cache
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to URL
  getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // Wait for element to visible
  waitUntil("CheckElement",new String[]{XPATH,"//a[@title='Maquillaje']"},"15","disabled");
  // Click on personal care
  clickOnElement(new String[]{XPATH,"//a[@title=\"Maquillaje\"]"});
  // select product
  clickOnElement(new String[]{XPATH,"(//a[@class=\"name\"])[4]"});
  // Assertion on add to cart button
  Assert.assertTrue(isElementClickable(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"}));
  // add to cart
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // start of if loop
  if(isElementAvailable(new String[]{XPATH,"//div[@class=\"commercialCarousel-pdp-wrapper\"]"})){
  // Assertion on product discount coupon
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\"commercialCarousel-pdp-wrapper\"]"}));
  // End of if loop
  }
  // Click on go pay
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Click on \"+\"to add more quantity
  clickOnElement(new String[]{XPATH,"(//button[@class=\"item__quantity__action_btn item__quantity__action_plus_btn\"])[2]"});
  // Assertion on discount promotion is applied
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\"promo\"]"}));
  // Write coupon code
  typeText(new String[]{XPATH,"//input[@id=\"js-voucher-code-text\"]"},"COLOMBIA15");
  // Click on apply button
  clickOnElement(new String[]{XPATH,"//button[@id=\"js-voucher-apply-btn\"]"});
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//span[@id=\"voucher-code-COLOMBIA15\"]"})){
  // Assertion on coupon code
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//span[@id=\"voucher-code-COLOMBIA15\"]"}));
  // Assertion on Discount amount
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
  // End if statement
  }
  // Start Else statement
  else{
  // Print Result
  printResults("PrintNote","\"element is not present\"");
  // End Else statement
  }
  // click on cart go pay button
  clickOnElement(new String[]{XPATH,"//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
  // Proceed as guest user
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout using Credit card
  // wait for credit card
  waitUntil("CheckClickableElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label"},"10","disabled");
  // click on credit card
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
  // start if statement for card holder name
  if(isElementClickable(new String[]{CSS,"form#mpago_credit input#cardholderName"})){
  // wait for card holder name
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit input#cardholderName"},"10","disabled");
  // write cardholder name
  typeText(new String[]{CSS,"form#mpago_credit input#cardholderName"},"APRO");
  // write card number
  typeText(new String[]{CSS,"input#cardNumber"},"4013540682746260");
  // select expiry month
  selectOption(new String[]{XPATH,"//select[@id=\"expirationMonth\"]"},"11");
  // select expiry year
  selectOption(new String[]{XPATH,"//select[@id=\"expirationYear\"]"},"2025");
  // write CVV number
  typeText(new String[]{CSS,"form#mpago_credit input#securityCode"},"123");
  // write text in document number
  typeText(new String[]{CSS,"input#docNumber"},"1234567890");
  // click on terms and condition
  clickOnElement(new String[]{CSS,"input#Terms1_mpagoCreditCardForm"});
  // wait for pay button
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type='button']"},"10","disabled");
  // click on pay button
  clickOnElement(new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
  // endif statement
  }
  // start else statemnet
  else{
  // print in result
  printResults("PrintNote","\"credit card data is not proper\"");
  // end else
  }
  // Assertion on successful order
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\"checkout-success\"]"}));

  status="passed";
  }
@Test public void Validate_that_the_product_name_is_displayed_as_it_is_from_MDM__CyzoneCOneSevenFiveNineFourSeven(){
  javascriptExecution("lambda-name=Validate that the product name is displayed as it is from MDM  CyzoneCOneSevenFiveNineFourSeven");

  // clear cache
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to URL Colombia MTO
  getURL("https://s1-cyzone.tiendabelcorp.com/co/tiendaCO98");
  // Click on Perfumes
  clickOnElement(new String[]{XPATH,"//a[@title=\'Perfumes\']"});
  // Click on first product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // Add Assertion for Product Title Present Above Price Section
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//h1[@class=\'name\']"}));
  // Add Assertion for Product Title Present in static bar(Add To Bag Section)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'product-name-sticky product-name-sticky-cyzone\']"}));
  // Click on Add to cart button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // Add Assertion For Product Title Present in Confirmation Pop-up
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//a[@class=\'name\'])[1]"}));
  // clear cache
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to url Colombia ECOM
  getURL("https://s1-cyzone.tiendabelcorp.com/co/");
  // Click on Perfumes
  clickOnElement(new String[]{XPATH,"(//a[@title=\'Perfumes\'])[1]"});
  // Click on first product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // Add Assertion for Product Title Present Above Price Section
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//h1[@class=\'name\']"}));
  // Add Assertion for Product Title Present in static bar(Add To Bag Section)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'product-name-sticky product-name-sticky-cyzone\']"}));
  // Click on Add to cart button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // Add Assertion For Product Title Present in Confirmation Pop-up
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//a[@class=\'name\'])[1]"}));

  status="passed";
  }
@Test public void CO_ETwoE_apply_Discount__CC_couponCFiveSixThree(){
  javascriptExecution("lambda-name=CO ETwoE apply Discount  CC couponCFiveSixThree");

  // clear cache and cookies
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to URL
  getURL("https://s1-lbel.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // Click on personal care
  clickOnElement(new String[]{XPATH,"//a[text()=\'cuidado personal\']"});
  // Click on \"Second Product\"
  clickOnElement(new String[]{XPATH,"//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"});
  // click on \"add to cart\" button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // click on \"go pay\" button
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Validate \"Free Shipping \" is not Available
  Assert.assertFalse(getText(new String[]{XPATH,"//span[@class=\'free-delivery-amount\']"}).contains("Gratis"));
  // Write text In Coupon TextField
  typeText(new String[]{XPATH,"//input[@placeholder=\'Código de cupón\']"},"AHORAONUNCA");
  // Click on Apply Button
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-black cart-voucher__btn\']"});
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//span[text()=\'Cupón aplicado exitosamente\']"})){
  // Validate Coupon Success message
  Assert.assertTrue(getText(new String[]{XPATH,"//span[text()=\'Cupón aplicado exitosamente\']"}).contains("Cupón aplicado exitosamente"));
  // Endif statement
  }
  // start else statement
  else{
  // Print Result
  printResults("PrintNote","\"element is not present\"");
  // End Else Statement
  }
  // Click on Again Go pay
  clickOnElement(new String[]{XPATH,"//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
  // Login as Guest user
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout using credit card
  // wait for credit card
  waitUntil("CheckClickableElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label"},"10","disabled");
  // click on credit card
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
  // start if statement for card holder name
  if(isElementClickable(new String[]{CSS,"form#mpago_credit input#cardholderName"})){
  // wait for card holder name
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit input#cardholderName"},"10","disabled");
  // write cardholder name
  typeText(new String[]{CSS,"form#mpago_credit input#cardholderName"},"APRO");
  // write card number
  typeText(new String[]{CSS,"input#cardNumber"},"4013540682746260");
  // select expiry month
  selectOption(new String[]{XPATH,"//select[@id=\"expirationMonth\"]"},"11");
  // select expiry year
  selectOption(new String[]{XPATH,"//select[@id=\"expirationYear\"]"},"2025");
  // write CVV number
  typeText(new String[]{CSS,"form#mpago_credit input#securityCode"},"123");
  // write text in document number
  typeText(new String[]{CSS,"input#docNumber"},"1234567890");
  // click on terms and condition
  clickOnElement(new String[]{CSS,"input#Terms1_mpagoCreditCardForm"});
  // wait for pay button
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type='button']"},"10","disabled");
  // click on pay button
  clickOnElement(new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
  // endif statement
  }
  // start else statemnet
  else{
  // print in result
  printResults("PrintNote","\"credit card data is not proper\"");
  // end else
  }
  // Validate Success Message
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div[class=\"checkout-success__body__headline\"]"}));
  // Add assertion \"Shipping Address\"
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div[class=\"well-headline orderPending\"]"}));

  status="passed";
  }
@Test public void CO__ETwoE_create_account__Tiered_Discount__CCCThreeSevenThreeEight(){
  javascriptExecution("lambda-name=CO  ETwoE create account  Tiered Discount  CCCThreeSevenThreeEight");

  // clear cache
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to URL
  getURL(" https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // Click on Makeup
  clickOnElement(new String[]{XPATH,"//a[@title=\'Maquillaje\']"});
  // Click On Fifth Product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[5]"});
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//a[text() = \"Ver productos\"]"})){
  // Click on See Products For Combination
  javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
  // Click On  First Product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // end if
  }
  // start else statement
  else{
  // print
  printResults("PrintNote","\"element is not present\"");
  // End else
  }
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//a[text() = \"Ver combinaciones\"]"})){
  // Add Assertion For See Combination
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//a[text() = \"Ver combinaciones\"]"}));
  // Click On See Combination
  javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
  // Add Assertion For Product Present
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//a[@class=\'name\']"}));
  // Click On Fifth Product(Máscara de Pestañas Mega Full Size APA)
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[5]"});
  // Add Assertion for qty selector button (+)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//button[@class=\'btn js-qty-selector-plus\']"}));
  // Add Assertion for qty selector button (-)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//button[@class=\'btn js-qty-selector-minus\']"}));
  // Add Assertion For Share Link
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//span[@class=\'share-btn-icon shareBtnShare\']"}));
  // Add Assertion for add To Cart Button
  Assert.assertTrue(isElementClickable(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"}));
  // clear qty selector Textbox
  clearText(new String[]{XPATH,"//input[@class=\'form-control js-qty-selector-input\']"});
  // Write Text in qty Selector Textbox
  typeText(new String[]{XPATH,"//input[@class=\'form-control js-qty-selector-input\']"},"5");
  // end if
  }
  // start else statement
  else{
  // print
  printResults("PrintNote","\"element is not present\"");
  // end else
  }
  // end if
  }
  // Click on Add to cart button
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // click on go pay button
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Add Assertion For Remove Button
  Assert.assertTrue(isElementClickable(new String[]{CSS,"div.item__remove-action > div#actionEntry_0 > a"}));
  // Add Assertion for qty selector button (+)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//button[text()=\'+\'])[2]"}));
  // Add Assertion for qty selector button (+)
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//button[text()=\'-\'])[2]"}));
  // click on qty selector button(+) to add product
  clickOnElement(new String[]{XPATH,"(//button[text()=\'+\'])[2]"});
  // Add Assertion For Discount
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'col-xs-6 cart-totals-right text-right discount\']"}));
  // Click on Go Pay Button
  clickOnElement(new String[]{XPATH,"//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
  // Login As a Guest user
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout Using Credit Card
  // wait for credit card
  waitUntil("CheckClickableElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label"},"10","disabled");
  // click on credit card
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_credit.radiompago_creditCO > label\").click();");
  // start if statement for card holder name
  if(isElementClickable(new String[]{CSS,"form#mpago_credit input#cardholderName"})){
  // wait for card holder name
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit input#cardholderName"},"10","disabled");
  // write cardholder name
  typeText(new String[]{CSS,"form#mpago_credit input#cardholderName"},"APRO");
  // write card number
  typeText(new String[]{CSS,"input#cardNumber"},"4013540682746260");
  // select expiry month
  selectOption(new String[]{XPATH,"//select[@id=\"expirationMonth\"]"},"11");
  // select expiry year
  selectOption(new String[]{XPATH,"//select[@id=\"expirationYear\"]"},"2025");
  // write CVV number
  typeText(new String[]{CSS,"form#mpago_credit input#securityCode"},"123");
  // write text in document number
  typeText(new String[]{CSS,"input#docNumber"},"1234567890");
  // click on terms and condition
  clickOnElement(new String[]{CSS,"input#Terms1_mpagoCreditCardForm"});
  // wait for pay button
  waitUntil("CheckClickableElement",new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type='button']"},"10","disabled");
  // click on pay button
  clickOnElement(new String[]{CSS,"form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
  // endif statement
  }
  // start else statemnet
  else{
  // print in result
  printResults("PrintNote","\"credit card data is not proper\"");
  // end else
  }
  // Add Assertion For Congratulation Message
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div[class=\"checkout-success__body__headline\"]"}));

  status="passed";
  }
@Test public void CO__ETwoE_Access_from_the_brands__categories_landing__guest_user_and_checkout_Agency__BankingCTwoNineFiveFour(){
  javascriptExecution("lambda-name=CO  ETwoE Access from the brands  categories landing  guest user and checkout Agency  BankingCTwoNineFiveFour");

  // Clear cache cookies
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to chili consultant URL
  getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // click on Makeup section
  clickOnElement(new String[]{XPATH,"//a[@title=\'Maquillaje\']"});
  // Click on first product
  clickOnElement(new String[]{XPATH,"(//a[@class=\'name\'])[1]"});
  // Add Assertion for product name
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"h1[class=\"name\"]"}));
  // Click on change img 1
  clickOnElement(new String[]{CSS,"ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img"});
  // Click on change img 2
  clickOnElement(new String[]{CSS,"ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img"});
  // Click on change img 3
  clickOnElement(new String[]{CSS,"ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img"});
  // Add Assertion crossed out price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//span[@class=\"old-price\"]"}));
  // add assertion for qty selector
  Assert.assertTrue(isElementAvailable(new String[]{ID,"pdpAddtoCartInput"}));
  // start if statement for copy and share
  if(isElementAvailable(new String[]{XPATH,"//span[@class=\"share-btn-icon shareBtnShare\"]"})){
  // Add Assertion for copy and share
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//span[@class=\"share-btn-icon shareBtnShare\"]"}));
  // end if statement
  }
  // start else statemnt
  else{
  // print in result
  printResults("PrintNote","\"copy and share link not found\"");
  // end else statement
  }
  // Add Assertion for Descripción
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//h2[text() = \"Descripción\"]"}));
  // Add Assertion for add to cart button
  Assert.assertTrue(isElementAvailable(new String[]{ID,"addToCartButton"}));
  // Click on add to cart button
  clickOnElement(new String[]{ID,"addToCartButton"});
  // Click on go pay button
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Add Assertion for remove link
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div.item__remove-action > div#actionEntry_0 > a"}));
  // Add Assertion for go pay button
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"}));
  // Add Assertion for product name
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//span[@class=\'item__name\']"}));
  // Add Assertion for price
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"td > li:nth-of-type(1) > div:nth-of-type(4)"}));
  // Add Assertion for total price
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"td > li:nth-of-type(1) > div:nth-of-type(5)"}));
  // Click on go pay button
  clickOnElement(new String[]{XPATH,"//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
  // Add Assertion for return Bag
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"a[class=\"returnBag\"]"}));
  // guest user login
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Add Assertion for checkout-headline
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'col-xs-12 col-sm-8 col-md-9 relative\']"}));
  // Add Assertion For Product name
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"(//span[@class=\'product-item-link co\'])[4]"}));
  // Checkout Using Agency option
  // Wait
  waitUntil("CheckVisibleElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label"},"10","disabled");
  // Click on Payment in Agents section
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label\").click();");
  // wait
  waitUntil("CheckVisibleElement",new String[]{CSS,"input#docNumberCash"},"5","disabled");
  // WriteText in Document number
  typeText(new String[]{CSS,"input#docNumberCash"},"1234567890");
  // scroll
  scrollIntoElementView(new String[]{CSS,"input#Terms1_mpagoCashForm"});
  // Click on T&C chec
  javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();");
  // wait
  waitUntil("CheckClickableElement",new String[]{XPATH,"//button[@class='btn btn-block submit_mpagoCashForm checkout-next']"},"6","disabled");
  // Click on Pay Button
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-block submit_mpagoCashForm checkout-next\']"});
  // start if statement
  if(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"})){
  // assertion for checkout success message
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'checkout-success__body__headline\']"}));
  // end if statement
  }
  // start else statement
  else{
  // Add Assertion for Your payment was declined. Choose another of the available payment methods
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//span[text() = \"Tu pago fue rechazado. Elige otro de los medios de pago disponibles\"]"}));
  // end else statement
  }

  status="passed";
  }
@Test public void SCENARIO_Five_Purchase_in_virtual_store__COD_CTwoSixSixNineCTwoSixSevenFour(){
  javascriptExecution("lambda-name=SCENARIO Five Purchase in virtual store  COD CTwoSixSixNineCTwoSixSevenFour");

  // clear cookies and cache
  // Clear cookies
  deleteAllCookies();
  // Clear storage
  javascriptExecution("window.localStorage.clear();");
  // Clear session storage
  javascriptExecution("window.sessionStorage.clear();");
  // Go to URL
  getURL("https://s1-lbel.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
  // Click on Consultant Banner
  clickOnElement(new String[]{XPATH,"//span[@class=\'consultant-info\']"});
  // Add Assertion For Consultant name
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//li[@class=\'consultant-name\']"}));
  // Add Assertion For Consultant Photo
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//li[@class=\'consultant-thumb\']"}));
  // Add Assertion For Consultant Mail
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'consultant-mail\']"}));
  // Add Assertion For Consultant Phone
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'consultant-phone\']"}));
  // Add Assertion For Consultant Description
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//li[@class=\'consultant-description\']"}));
  // Click on Close Consultant Popup
  clickOnElement(new String[]{XPATH,"//button[@id=\'cboxClose\']"});
  // start if statement
  if(isElementAvailable(new String[]{CSS,"div#cyzone-03 a"})){
  // Click on perfumes
  javascriptExecution("document.querySelector(\"div#cyzone-03 a\").click();");
  // Click on Men Active
  clickOnElement(new String[]{XPATH,"//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"});
  // Add Assertion for old price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
  // Add Assertion for active  price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
  // Click on Add to cart
  clickOnElement(new String[]{ID,"addToCartButton"});
  // Click on Keep Buying Button
  clickOnElement(new String[]{XPATH,"//a[contains(@class,\'continueShopping\')]"});
  // end if statement
  }
  // Start else statement
  else{
  // Print Result
  printResults("PrintNote","\"product is not present\"");
  // End else statement
  }
  // Click on Cyzone Feature
  clickOnElement(new String[]{XPATH,"(//img[@data-parent=\'cyzone\'])[2]"});
  // Write  Text in Search textfield
  typeText(new String[]{XPATH,"(//input[contains(@placeholder,\'Estoy buscando\')])[1]"},"perfume");
  // Mouse hover on Suggested Product
  mouseHoverOnElement(new String[]{XPATH,"//div[@class=\'name\']"});
  // Suggestions is Present
  if(isElementAvailable(new String[]{XPATH,"//div[@class=\'name\']"})){
  // Validate Suggestions are Displayed
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'name\']"}));
  // End of If Loop
  }
  // scroll to bottom
  scroll("ScrollBottom");
  // Scroll to perfumes
  scrollIntoElementView(new String[]{CSS,"a[title=\'Perfumes\']"});
  // Click on Perfume
  javascriptExecution("document.querySelector(\"div#cyzone-03 a\").click();");
  // Click on Second Product
  clickOnElement(new String[]{XPATH,"//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"});
  // Add Assertion for old price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
  // Add Assertion for active  price
  Assert.assertTrue(isElementAvailable(new String[]{XPATH,"//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
  // clear text
  clearText(new String[]{XPATH,"//input[@class=\'form-control js-qty-selector-input\']"});
  // write text in qty selector textbox
  typeText(new String[]{XPATH,"//input[@class=\'form-control js-qty-selector-input\']"},"10");
  // Click on ADD TO CART
  clickOnElement(new String[]{XPATH,"//button[contains(text(),\'Agregar a la bolsa\')]"});
  // click on go pay
  // explicit wait for Go Pay Button
  waitUntil("CheckClickableElement",new String[]{XPATH,"//a[contains(text(),'Ir a pagar')]"},"10","disabled");
  // Click on go pay
  clickOnElement(new String[]{XPATH,"//a[contains(text(),\'Ir a pagar\')]"});
  // Click on Again Go Pay
  clickOnElement(new String[]{XPATH,"//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
  // Guest user
  // Write text in guest firstName text field
  typeText(new String[]{ID,"guest.firstName"},"photon");
  // Write text in guest lastName text field
  typeText(new String[]{ID,"guest.lastName"},"test");
  // Write text in  guest email textfield
  typeText(new String[]{ID,"guest.email"},"photontest@endtest-mail.io");
  // Click on guest agree To Receive publicity checkbox
  clickOnElement(new String[]{ID,"guest.agreeToReceivePublicity"});
  // click on guest belcorp T&c checkbox
  clickOnElement(new String[]{ID,"guest.belcorpToC"});
  // click on billing Common System checkbox
  clickOnElement(new String[]{NAME,"billingCommonSystem"});
  // Click on guest login submit button
  clickOnElement(new String[]{XPATH,"//button[text() = \"Continuar como invitado\"]"});
  // wait for address fields
  waitUntil("CheckVisibleElement",new String[]{ID,"address.regionIsoParent1"},"10","disabled");
  // Select Option from department
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIsoParent1\']"},"CO-DEP-76");
  // Select Option from location
  selectOption(new String[]{XPATH,"//select[@id=\'address.regionIso\']"},"76-BOGOTA");
  // Write text in STREET AND NUMBER
  typeText(new String[]{NAME,"line1"},"church street");
  // Write text in Appartment TextBox
  typeText(new String[]{NAME,"line2"},"n70-306");
  // Write text in Address Reference TextBox
  typeText(new String[]{NAME,"referencia"},"206");
  // Write text in phone number textbox
  typeText(new String[]{NAME,"phone"},"7875675765");
  // Click on addressSubmit
  clickOnElement(new String[]{XPATH,"//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
  // Checkout Using Agency option
  // Wait
  waitUntil("CheckVisibleElement",new String[]{CSS,"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiompago_cash.radiompago_cashCO > label"},"10","disabled");
  // Click on Payment in Upon Delivery
  javascriptExecution("document.querySelector(\"div#belcorpNewCheckoutPaymentModeSelector div.paymentMethod-radio.radiobelc_cash_delivery.radiobelc_cash_deliveryCO > label\").click();");
  // wait
  waitUntil("CheckVisibleElement",new String[]{CSS,"input#docNumberCashOnDelivery"},"5","disabled");
  // WriteText in Document number
  typeText(new String[]{CSS,"input#docNumberCashOnDelivery"},"1234567890");
  // scroll
  scrollIntoElementView(new String[]{CSS,"input#isBillingCommonSystem_cashOnDeliveryForm"});
  // Click on T&C chec
  javascriptExecution("document.querySelector(\"input#Terms1_cashOnDeliveryForm\").click();");
  // wait
  waitUntil("CheckClickableElement",new String[]{XPATH,"//button[@class='btn btn-block submit_cashOnDeliveryForm checkout-next']"},"6","disabled");
  // Click on Pay Button
  clickOnElement(new String[]{XPATH,"//button[@class=\"btn btn-block submit_cashOnDeliveryForm checkout-next\"]"});
  // Add Assertion For Success messagr
  Assert.assertTrue(isElementAvailable(new String[]{CSS,"div > div.checkout-success__body__headline.cash-on-delivery"}));

  status="passed";
  }
  }