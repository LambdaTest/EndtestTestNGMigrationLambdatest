package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression_Mexico_ECOM extends WebDriverHelper {

  @Test
  public void MX__ETwoE_apply_Discount_coupon__CCCTwoNineEightSixCThreeSevenFourFive() {
    javascriptExecution("lambda-name=MX  ETwoE apply Discount coupon  CCCTwoNineEightSixCThreeSevenFourFive");

    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/");
    // wait untill maquillaje
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[text()='maquillaje']" }, "10", "disabled");
    // click on  product from esika carousel
    clickOnElement(new String[] { XPATH,
      "(//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a)[3]" });
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
      // start if statement for promo
      if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]" })) {
        // click on go pay
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
        // end if statement
      }
      // start else statement
      else {
        // apply gift coupon code
        typeText(new String[] { CSS, "input#js-voucher-code-text" }, "REACTIVA1");
        // click on apply
        clickOnElement(new String[] { CSS, "button#js-voucher-apply-btn" });
        // start if statement for coupun apply message
        if (isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" })) {
          // add assertion for success message for coupon
          Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" }));
          // end if for coupon msg
        }
        // click on go pay button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
        // end else statement
      }
      // end if statement for add to cart
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"add to cart button not clickeble\"");
      // end else statement
    }
    // mexico guest user login
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
      // Add Assertion for Your payment was declined. Choose another of the available payment methods
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//span[text() = \"Tu pago fue rechazado. Elige otro de los medios de pago disponibles\"]" }));
      // print in result
      printResults("PrintNote", "\"the entered credit card number is not proper\"");
      // end else statement
    }

    status = "passed";
  }
}