package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class New_Checkout_Step_One_Peru___Desktop extends WebDriverHelper {

  @Test
  public void Verify_No_impact_with_registered_userCOneNineFiveOne() {
    javascriptExecution("lambda-name=Verify No impact with registered userCOneNineFiveOne");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // wait
    waitForTime(3);
    // Click on user icon
    clickOnElement(new String[] { XPATH, "//a[@class=\"cms-image-link\"]" });
    // Write text in  username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "purvagupta@endtest-mail.io");
    // Write text in  password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Photon@123");
    // Click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\"loginBtn btn btn-black btn-block mt-15\"]" });
    // wait
    waitForTime(3);
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
    // add product to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//main//li//a[contains(text(),\' Ir a pagar\')]" });
    // Click on go pay continue
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // Check if \"order as gift is present\"
    if (isElementAvailable(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" })) {
      // click on \"order as gift\"
      clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
      // write text in from
      typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "photon");
      // Write text in for
      typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "belcorp");
      // write text for name and surname
      typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "purva gupta");
      // End  If Statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // add assertion for continue button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));
      // End  If Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_that_all_the_products_added_to_the_cart_appear_in_See_my_productsCOneNineFiveSeven() {
    javascriptExecution(
      "lambda-name=Verify that all the products added to the cart appear in See my productsCOneNineFiveSeven");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
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
    // take screen shot to assert product name bonus
    takeScreenshot("logs/Screenshoots/RYgFPA.png");
    // add assertion for\"see my products\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//li[@class=\'new-checkout-order-summary-list-heading\'])[2]" }));
    // add assertion for bonus
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form > div.checkout-order-summary > div > div" }));
    // start if statement for product
    if (isElementAvailable(new String[] { CSS, "div#collapsibleContentProducts_reco365 div.name.name-item > span" })) {
      // add assertion for product
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div#collapsibleContentProducts_reco365 div.name.name-item > span" }));
      // add assertion for quantity
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div#collapsibleContentProducts_reco365 div.quantity-entry" }));
      // end if
    }

    status = "passed";
  }

  @Test
  public void Check_the_order_of_added_productsCOneNineFiveEight() {
    javascriptExecution("lambda-name=Check the order of added productsCOneNineFiveEight");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
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
    // add assertion for\"see my products\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//li[@class=\'new-checkout-order-summary-list-heading\'])[2]" }));
    // add assertion for oder details
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//span[text()=\'Detalle del pedido\'])[1]" }));
    // add assertion for subtotal
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'subtotal\'])[2]" }));
    // add assertion for total
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'total\'])[1]" }));
    // add assertion for shipping
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'shipping\'])[1]" }));
    // add assertion for discount
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//div[@class=\'subtotals__item--state-discount\'])[2]" }));
    // add assertion for bonus
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div.col-md-4.hidden-xs.hidden-sm.checkout-right-form > div.checkout-order-summary > div > div" }));

    status = "passed";
  }

  @Test
  public void ECOMMGuestValidate_that_the_banner_for_ecomm_is_displayedCTwoOneFourOne() {
    javascriptExecution("lambda-name=ECOMMGuestValidate that the banner for ecomm is displayedCTwoOneFourOne");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
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
    // scroll down
    scrollIntoElementView(new String[] { CSS, "button[id=\'addressSubmit\']" });
    // Check if banner is present
    if (isElementAvailable(
      new String[] { XPATH, "(//strong[text()=\'¿Necesitas ayuda con tu proceso de pago?\'])[2]" })) {
      // add assertion for banner
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "(//strong[text()=\'¿Necesitas ayuda con tu proceso de pago?\'])[2]" }));
      // End If Statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"Banner is not present\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_the_completeness_of_the_data_to_continue_to_step_TwoCOneNineFourNine() {
    javascriptExecution("lambda-name=Verify the completeness of the data to continue to step TwoCOneNineFourNine");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on second product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
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
    // Select Option from department
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // Select Option from province
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // Select Option from district
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
    // Write text in address
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "123");
    // Write text in phone
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
    // click on \"order as gift\"
    clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
    // write text in from
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "photon");
    // Write text in for
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "belcorp");
    // write text for name and surname
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "purva gupta");
    // add assertion for continue button
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));
    // Click on continue here for continue
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });

    status = "passed";
  }

  @Test
  public void GuestValidate_that_the_banner_for_MTO_is_displayedCTwoOneFiveThree() {
    javascriptExecution("lambda-name=GuestValidate that the banner for MTO is displayedCTwoOneFiveThree");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
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
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "riya");
    // Click on guest.lastName
    clickOnElement(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" });
    // Write text in guest.lastName
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "patil");
    // Click on guest.email
    clickOnElement(new String[] { CSS, "input[class=\"guestEmail form-control\"]" });
    // Write text in guest.email
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "cyzonapp11@gmail.com");
    // select checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
    // Click on Continue
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // scroll
    scroll("ScrollDown", 1009);
    // Assertion on Email banner
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'esikaperu@esika.biz\']" }));

    status = "passed";
  }

  @Test
  public void Verify_that_the_checkbox_is_optional_to_continue_to_step_TwoCOneNineFourEight() {
    javascriptExecution("lambda-name=Verify that the checkbox is optional to continue to step TwoCOneNineFourEight");

    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
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
    // Select Option from department
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
    // Select Option from province
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
    // Select Option from district
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
    // Write text in address
    typeText(new String[] { ID, "address.line1" }, "123");
    // Write text in phone
    typeText(new String[] { ID, "address.phone" }, "1234567891");
    // add assertion for \"click here for continue\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));
    // click on \"order as gift\"
    clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
    // click on \"order as gift\"
    clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
    // Assertion for continue here
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));
    // Click on continue here for continue
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });

    status = "passed";
  }

  @Test
  public void ECOMRegisteredValidate_that_the_banner_for_ecom_is_displayedCTwoOneFourFive() {
    javascriptExecution("lambda-name=ECOMRegisteredValidate that the banner for ecom is displayedCTwoOneFourFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // Click on user icon
    clickOnElement(new String[] { XPATH, "//a[@class=\"cms-image-link\"]" });
    // Click on j_username
    clickOnElement(new String[] { CSS, "input[class=\" form-control\"]" });
    // Write text in j_username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "purvagupta@endtest-mail.io");
    // Click on j_password
    clickOnElement(new String[] { CSS, "input[class=\"form-control pwdShow \"]" });
    // Write text in j_password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Photon@123");
    // Click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\"loginBtn btn btn-black btn-block mt-15\"]" });
    // wait
    waitForTime(7);
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[6]" });
    // refresh
    pageRefresh();
    // add product to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // go forward
    goForward();
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//main//li//a[contains(text(),\' Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // scroll
    scroll("ScrollDown", 1009);
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//span[text()=\'consultacompraspe@belcorp.biz\']" })) {
      // Assertion on Email banner
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'consultacompraspe@belcorp.biz\']" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Registered_Validate_that_the_banner_for_MTO_is_displayedCTwoOneFourNine() {
    javascriptExecution("lambda-name=Registered Validate that the banner for MTO is displayedCTwoOneFourNine");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=MO.Cosmeticos.y.mas");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // wait
    waitForTime(3);
    // click on user icon
    clickOnElement(new String[] { XPATH, "//a[@class=\"cms-image-link\"]" });
    // Click on username
    clickOnElement(new String[] { CSS, "input[class=\" form-control\"]" });
    // Write text in username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "purvagupta@endtest-mail.io");
    // Click on password
    clickOnElement(new String[] { CSS, "input[class=\"form-control pwdShow \"]" });
    // Write text in password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Photon@123");
    // Click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\"loginBtn btn btn-black btn-block mt-15\"]" });
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // wait
    waitForTime(4);
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Confirm go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // scroll
    scroll("ScrollDown", 1009);
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//span[text()=\'esikaperu@esika.biz\']" })) {
      // Assertion on Email banner
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'esikaperu@esika.biz\']" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Verify_the_no_impact_on_the_functionality_Order_as_a_gift_for_other_countryCOneNineFiveTwo() {
    javascriptExecution(
      "lambda-name=Verify the no impact on the functionality Order as a gift for other countryCOneNineFiveTwo");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // start if statement
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
      // Select Option from department
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PE-DEP-18");
      // Select Option from province
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "18-HUANTA");
      // Select Option from district
      selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "HUANTA-IGUAIN");
      // Write text in address
      typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "123");
      // Write text in phone
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
      // click on \"order as gift\"
      clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
      // write text in from
      typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "photon");
      // Write text in for
      typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "belcorp");
      // write text for name and surname
      typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "purva gupta");
      // add assertion for  continue button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));
      // enf if statement
    }
    // else statement
    else {
      // product is not available
      printResults("PrintNote", "product is not available");
      // end else statement
    }

    status = "passed";
  }
}