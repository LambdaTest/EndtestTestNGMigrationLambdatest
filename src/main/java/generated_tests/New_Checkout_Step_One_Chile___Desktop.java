package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class New_Checkout_Step_One_Chile___Desktop extends WebDriverHelper {

  @Test
  public void Verify_the_no_impact_on_the_functionality__Order_as_a_giftCTwoOneEightOne() {
    javascriptExecution("lambda-name=Verify the no impact on the functionality  Order as a giftCTwoOneEightOne");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
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
    waitForTime(12);
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    waitForTime(5);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // refresh
    pageRefresh();
    // if guest first name visible
    if (isDisplayed(new String[] { XPATH, "//input[@name=\"firstName\"]" }, 5)) {
      // enter guest first name
      typeText(new String[] { XPATH, "//input[@name=\"firstName\"]" }, "riya");
      // Enter guest last name
      typeText(new String[] { XPATH, "//input[@name=\"lastName\"]" }, "patil");
      // Enter guest Email
      typeText(new String[] { XPATH, "//input[@name=\"email\"]" }, "cyzonapp11@gmail.com");
      // select checkbox
      clickOnElement(new String[] { XPATH, "//input[@name='agreeToReceivePublicity']" });
      // Click on Continue
      clickOnElement(new String[] { XPATH, "(//button[@type=\"submit\"])[3]" });
      // scroll
      scroll("ScrollDown", 443);
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "//label[contains(text(),\'Pedir como regalo\')]" })) {
        // Assertion on \"order as a gift\"
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//label[contains(text(),\'Pedir como regalo\')]" }));
        // select checkbox order as a gift
        clickOnElement(new String[] { XPATH, "(//input[@id=\"address.giftAddress\"])[1]" });
        // scroll
        scroll("ScrollDown", 987);
        // Assertion on continue button is disabled
        Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Continuar\')]" }));
        // write wrong text in  \"From\" textbox
        typeText(new String[] { XPATH, "//input[@id=\"address.from\"]" }, "riya1");
        // Assertion on wrong details error msg
        Assert.assertTrue(isElementDisplayed(
          new String[] { XPATH, "(//div[text()=\'No puede llevar números ni caracteres especiales\'])[1]" }));
        // write text in  \"From\" textbox
        typeText(new String[] { XPATH, "//input[@id=\"address.from\"]" }, "riya");
        // write wrong text in  \"To\" textbox
        typeText(new String[] { XPATH, "//input[@id=\"address.to\"]" }, "supriya@");
        // Assertion on wrong details error msg
        Assert.assertTrue(isElementDisplayed(
          new String[] { XPATH, "//div[text()=\'No puede llevar números ni caracteres especiales\']" }));
        // write text in  \"To\" textbox
        typeText(new String[] { XPATH, "//input[@id=\"address.to\"]" }, "supriya");
        // write wrong text in  \"name and surname\" textbox
        typeText(new String[] { XPATH, "//input[@id=\"address.completeNameTo\"]" }, "patil@1");
        // Assertion on wrong details error msg
        Assert.assertTrue(isElementDisplayed(
          new String[] { XPATH, "//div[text()=\'No puede llevar números ni caracteres especiales\']" }));
        // write text in  \"name and surname\" textbox
        typeText(new String[] { XPATH, "//input[@id=\"address.completeNameTo\"]" }, "patil");
        // End of if loop
      }
      // end if guest first name visible
    }

    status = "passed";
  }

  @Test
  public void Verify_No_impact_with_registered_userCTwoOneEightzero() {
    javascriptExecution("lambda-name=Verify No impact with registered userCTwoOneEightzero");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle cbox popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End If statement
    }
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
    // click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Start If statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End Else Statement
    }
    // Click on  first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // add product to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//main//li//a[contains(text(),\' Ir a pagar\')]" });
    // Handle cbox popup
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
    // Click on go pay continue
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" })) {
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
      // End  If Statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"Order as gift checkbox is not present\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_the_completeness_of_the_data_to_continue_to_step_TwoCTwoOneSevenEight() {
    javascriptExecution("lambda-name=Verify the completeness of the data to continue to step TwoCTwoOneSevenEight");

    // Clearing cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End If Statement
    }
    // click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Start If statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End if Statement
    }
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Handle cbox popup
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
    // Click on Continue as guest
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Select Option from region
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "CL-REG-02");
    // Select Option from commune
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "02-ANTOFAGASTA");
    // Select Option from Localidad
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "ANTOFAGASTA-ANTOFAGASTA");
    // Write text in address
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "123");
    // Write text in phone
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
    // click on \"order as  gift\"
    clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
    // write text in from
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "photon");
    // Write text in for
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "belcorp");
    // Write text for name and surname
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "purva gupta");
    // add assertion for continue button
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));
    // Check If Continue Button Is Enable
    if (isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // Click On Continue Button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Close If Statement
    }

    status = "passed";
  }

  @Test
  public void Verify_that_the_checkbox_is_optional_to_continue_to_step_TwoCTwoOneSevenSeven() {
    javascriptExecution("lambda-name=Verify that the checkbox is optional to continue to step TwoCTwoOneSevenSeven");

    // Clearing cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Close cbox  popup
    clickOnElement(new String[] { CSS, "button#cboxClose" });
    // click on makeup
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Start If statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End if Statement
    }
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle cbox popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End IF Statement
    }
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
    // Click on Continue as guest
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Select Option from region
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "CL-REG-02");
    // Select Option from commune
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "02-ANTOFAGASTA");
    // Select Option from location
    selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "ANTOFAGASTA-ANTOFAGASTA");
    // Write text in address
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "123");
    // Write text in phone
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "123456789");
    // click on \"order as  gift\"
    clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
    // click on \"order as  gift\"
    clickOnElement(new String[] { XPATH, "(//input[@id=\'address.giftAddress\'])[1]" });
    // add assertion for continue button
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" }));

    status = "passed";
  }
}