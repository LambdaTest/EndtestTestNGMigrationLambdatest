package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class BackEnd_Consolidated extends WebDriverHelper {

  @Test
  public void EC_Verify_Register_as_a_Registered_Account_from_the_Brand__CThreezeroOneSix() {
    javascriptExecution("lambda-name=EC Verify Register as a Registered Account from the Brand  CThreezeroOneSix");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // click on login icon
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']" });
    // verify the login page present
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'title text-center\']" }));
    // write text in email
    typeText(new String[] { XPATH, "//input[@name=\'j_username\']" }, "belcorpregisteredtestuser@endtest-mail.io");
    // write text in password
    typeText(new String[] { XPATH, "//input[@name=\'j_password\']" }, "PhotonTest@9876543210");
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Verify that it returns to the Home Page
    takeScreenshot("logs/Screenshoots/rTxAUy.png");
    // verify  upper left corner it says Hello \'Name\'
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));

    status = "passed";
  }

  @Test
  public void Scroll_down__up_with_the_scroll_bar__CThreezeroFiveEight() {
    javascriptExecution("lambda-name=Scroll down  up with the scroll bar  CThreezeroFiveEight");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://bic2-esika.tiendabelcorp.com/pe/");
    // search \"Paleta\" in search
    typeText(new String[] { XPATH, "//input[@id=\'js-site-search-input\']" }, "paleta");
    // Click Enter to search the product
    pressKey(new String[] { XPATH, "//input[@id=\'js-site-search-input\']" }, "ENTER");
    // Go to next steps if product is available
    if (isElementAvailable(new String[] { XPATH, "//a[@id=\'product_productName_200099629\']" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//a[@id=\'product_productName_200099629\']" });
      // End if statement of product
    }
    // start else statement for product
    else {
      // Else statement for product
      printResults("PrintNote", "Sorry product is not present");
      // End of else statement
    }
    // if condition for detail of product
    if (isElementAvailable(new String[] { XPATH, "//h2[@bucket-positon=\'Bloque 1\']" })) {
      // validate \"detail\" of product
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h2[@bucket-positon=\'Bloque 1\']" }));
      // End of if statement for detail of product
    }
    // Else statement for detail of product
    else {
      // Print detail of product is not present
      printResults("PrintNote", "Detail of product is not present");
      // End else statement of detail of product
    }
    // If statement for \"option to choose tones\"
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Validate option to choose tones
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" }));
      // click on \" choose tones\"
      clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" });
      // Mouse hover on choose tone popup
      mouseHoverOnElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" });
      // click on choose shade
      clickOnElement(new String[] { XPATH, "//div[@id=\'cboxTitle\']" });
      // scroll till element
      scrollIntoElementView(new String[] { CSS, "span[title=\'Labial: Vino Sexy – Mate\']" });
      // scroll down to end of tones
      scroll("ScrollBottom");
      // Assert scrolling down
      takeScreenshot("logs/Screenshoots/AsjGVj.png");
      // Scroll up to the start of the tones
      scroll("ScrollTop");
      // Assert scrolling up
      takeScreenshot("logs/Screenshoots/aHBarF.png");
      // End if statement \"option to choose tones\"
    }
    // Else statement \"option to choose tones\"
    else {
      // Print message \"option to choose tones\"
      printResults("PrintNote", "choose tones option is not present");
      // End else statement \"option to choose tones\"
    }

    status = "passed";
  }

  @Test
  public void ECSCENARIO_One_Purchase_in_virtual_store__guest_user__credit_card__CTwoNineNineSeven() {
    javascriptExecution(
      "lambda-name=ECSCENARIO One Purchase in virtual store  guest user  credit card  CTwoNineNineSeven");

    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // click on consultant url
    clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-name\']" });
    // Validate country flag name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-flag\']" }));
    // Validate Consultant name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']" }));
    // validate consultant surname
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']" }));
    // Validate \"Description \"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-description\']" }));
    // Validate consultant telephone number
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-phone\']" }));
    // close consultant popup window
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Click on \"personal care\"
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // Click on first product of lbel
    clickOnElement(new String[] { XPATH, "//span[@class=\'esika-content-image\']" });
    // Verify offerprice
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'active-price\']" }));
    // Verify catalog price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
    // click on \"add to cart\" button
    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Add assertion \"add to cart\" clickable
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }
    // click on go pay button
    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }
    // click on continue shopping button
    // if condition for \"continue shopping\" present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" })) {
      // if condition for \"continue shopping\" clickable
      if (isElementClickable(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" })) {
        // click on \"continue shopping\" button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" });
        // end if for \"continue shopping\" clickable
      }
      // Else statement \"continue shopping\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "continue shopping is not clickable");
        // end else \"continue shopping\" clickable
      }
      // end if for  \"continue shopping\" present
    }
    // else statement   \"continue shopping\" present
    else {
      // print message
      printResults("PrintNote", "continue shopping is not present");
      // end else statement  \"continue shopping\" present
    }
    // click on esika link
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']" });
    // click on esika personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado Personal\']" });
    // click on esika first product
    clickOnElement(new String[] { XPATH, "//span[@class=\'esika-content-image\']" });
    // Verify catalog price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
    // Verify offer price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'active-price\']" }));
    // click on \"add to cart\" button
    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Add assertion \"add to cart\" clickable
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }
    // click on go pay button
    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }
    // click on continue shopping button
    // if condition for \"continue shopping\" present
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" })) {
      // if condition for \"continue shopping\" clickable
      if (isElementClickable(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" })) {
        // click on \"continue shopping\" button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(), \'Seguir Comprando\')]" });
        // end if for \"continue shopping\" clickable
      }
      // Else statement \"continue shopping\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "continue shopping is not clickable");
        // end else \"continue shopping\" clickable
      }
      // end if for  \"continue shopping\" present
    }
    // else statement   \"continue shopping\" present
    else {
      // print message
      printResults("PrintNote", "continue shopping is not present");
      // end else statement  \"continue shopping\" present
    }
    // click on cyzone link
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']" });
    // click on cyzone personal care
    clickOnElement(new String[] { XPATH, "//a[@title=\'Cuidado personal\']" });
    // click on first product
    clickOnElement(new String[] { XPATH, "//span[@class=\'esika-content-image\']" });
    // click on \"add to cart\" button
    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Add assertion \"add to cart\" clickable
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }
    // click on \"go pay\" button
    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//div[@class='actions']/child::button[contains(text(),' Ir a pagar')]" }, "10",
      "disabled");
    // click on cart go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
    // checkout login as guest user
    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on seconde checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }
    // click on single go pay button
    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }
    // Entering details for secure pay
    // Select document type from drop down
    selectOption(new String[] { XPATH, "//select[@id=\'address.documentType\']" }, "CI");
    // Write text in \"RUC no\"
    typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "9876543210");
    // Write text in \"NAME AND SURNAME / COMPANY\"
    typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "Photon");
    // Select province from drop dwon
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000023");
    // Select \"canton\" from drop down
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000023000006");
    // select PARISH / SECTOR from drop down
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000023000006000053");
    // Write text in \"Main street\"
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "near main road");
    // Write text in \"Numbering\"
    typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "N70-306");
    // Write text in secondary street
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "next to church");
    // Write text in \"NEIGHBORHOOD\"
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "First phase");
    // write text \"HOUSE / APARTMENT. / BLOCK / OFFICE AND REFERENCE\"
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "house 4");
    // Write text in postal code
    typeText(new String[] { XPATH, "//input[@id=\'address.postalCode\']" }, "010201");
    // Write text in \"telephone contact\"
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "9876543210");
    // if statement \"click here to continue\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
      // if statement \"click here to continue\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']" })) {
        // click on  \"click here to continue\"
        clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
        // end if for if statement \"click here to continue\" clickable
      }
      // else statement if statement \"click here to continue\" clickable
      else {
        // print message
        printResults("PrintNote", "button is not clickable");
        // end statement t \"click here to continue\" clickable
      }
      // end if  \"click here to continue\" present
    }
    // else statement  \"click here to continue\" present
    else {
      // print messgage
      printResults("PrintNote", "button is not present");
      // end else statement  \"click here to continue\" present
    }
    // click \"click here to continue\" button
    // if condition for \" click here to continue button\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
      // if condition for \"  click here to continue button\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
        // click on \" click here to continue button\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
        // end if for \" click here to continue button\" clickable
      }
      // Else statement \" click here to continue button\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "click here to continue button is not clickable");
        // end else \" click here to continue button\" clickable
      }
      // end if for  \"go pay\" present
    }
    // else statement   \" click here to continue button\" present
    else {
      // print message
      printResults("PrintNote", "click here to continue button is not present");
      // end else statement  \" click here to continue button\" present
    }
    // select payment options
    // if payment option present
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment option as credit card
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
      // Write text in credit card
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
      // select document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Cédula");
      // select doc no
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567892");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
      // Write text in card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // write text in security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if statement click here to continue payment button clickable
      if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" })) {
        // click on aqui para button
        clickOnElement(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" });
        // end if statement click here to contineue payment button clickable
      }
      // else statement click here to continue payment button clickable
      else {
        // print message
        printResults("PrintNote", "not clickable");
        // end else
      }
      // end if click here continue button present
    }
    // else payment option present
    else {
      // print message
      printResults("PrintNote", "Payment option is not present");
      // end else payment option present
    }
    // click on finalize your purchase
    // if for terms1 present
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']" })) {
      // click on terms1 checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
      // if \"finalize your purchase\" button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" })) {
        // Add assertion for \"finalize your purchase\"
        Assert.assertTrue(
          isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" }));
        // click on \"finalize your purchase\" button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" });
        // start if statement
        if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" })) {
          // Add Assertion For successful purchase message
          Assert.assertTrue(
            isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
          // end if
        }
        // start else
        else {
          // print
          printResults("PrintNote", "\"element is not present\"");
          // end else
        }
        // end if \"finalize your purchase\" button clickable
      }
      // else  \"finalize your purchase\" button clickable
      else {
        // print message
        printResults("PrintNote", "finalize your purchase button is not clickable");
        // end else  \"finalize your purchase\" button clickable
      }
      // end if for terms1 present
    }
    // else if for terms1 present
    else {
      // print message
      printResults("PrintNote", "terms1 checkbox is not present");
      // end else for terms1 present
    }

    status = "passed";
  }

  @Test
  public void CL__Customizable_Palette_PDP_Average_Complete_ECOMCOneFiveSixzero() {
    javascriptExecution("lambda-name=CL  Customizable Palette PDP Average Complete ECOMCOneFiveSixzero");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/p/3_1000005_ecomm_cl");
    // Validate \"Shades of Shadows and / or lips\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'product-variant-container\']" }));
    // Validate \"Shades of Blush and / or Powders\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[2]" }));
    // Validate \"Single Paddle Sku\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[3]" }));
    // Validate that the Add to cart Button is disabled
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // Validate \"The price to be displayed is the price of the full pallet  \"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'title-product-down down-bar-title\']" }));
    // Validate \"Product name\"
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//div[@class=\'col-sm-6 product-details-col\']/div/child::h1[@class=\'name\']" }));
    // Validate \"Product content\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
    // Click on Choose Shade
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // Select First Shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
    // Select Second Shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
    // Add assertion for apply button enabled
    Assert.assertTrue(isElementClickable(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" }));
    // Cick on Apply Button
    clickOnElement(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
    // Add to cart button is still disabled
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // Click on Choose Shade
    javascriptExecution(
      "document.querySelector(\"div:nth-child(3) > div.bundleVariantDataContainer > div.product-select-variant-button.variantSelectorButtonContainer.bundleProductOptionButton > button#selectVariable\").click();");
    // Choose First Shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
    // Cick on Apply Button
    clickOnElement(new String[] { XPATH, "//div[@id=\'cboxLoadedContent\']/child::div/child::div[4]/child::div[2]" });
    // Add to cart is Enabled
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // Click on Add to Cart Button
    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
        // wait until
        waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5", "disabled");
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }
    // Verify Add to Cart Pop up
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'add-to-cart add-to-cart-cross\']" },
      "logs/Screenshots/ElEPpZ.png");
    // Click on Go Pay Button
    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }
    // Verify Quantity can\'t be Modified
    Assert.assertFalse(isElementClickable(
      new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }));
    // validate Delete link
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a" }));
    // Validate Discount coupon available
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" }));
    // Click on Again  Go Pay Button
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
    // Login as Guest User
    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
    // Select Option from COMMUNE
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "churchil street");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // Select Credit Card Option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Credit Card Details
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
    if (isDisplayed(
      new String[] { XPATH, "//div[@class=\'mpago-error alert alert-danger alert-dismissible\']/child::span" }, 0)) {
      // Print Message
      printResults("PrintNote", "\"Visa Payment is not available\"");
      // End If Statement
    }
    // Start Else Statement
    else {
      // Success Message is Present
      if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" })) {
        // Validate Success Message
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
        // End of If Loop
      }
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void MX__Customizable_Palette_PDP_Full_Palette_ECOMCOneFiveFiveSeven() {
    javascriptExecution("lambda-name=MX  Customizable Palette PDP Full Palette ECOMCOneFiveFiveSeven");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/beauty-box-%28paleta-completa%29/p/3_1_202108_mx/mx202108");
    // wait
    waitForTime(4);
    // Validate add to cart is disabled
    Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Add Assertion for product image
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "img[class=\"lazy loaded\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/210094759-FotoFondoBlanco.jpg\"]" }));
    // Add assertion for content
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
    // Click on Choose shades
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // select 1st shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[53]" });
    // select 2nd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[54]" });
    // select 3rd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[55]" });
    // select 4th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[56]" });
    // select 5th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[57]" });
    // select 6th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[58]" });
    // Assertion on 7th shade is disabled
    Assert.assertFalse(
      isElementClickable(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[59]" }));
    // Click on Apply
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block\"])[6]" });
    // Validate 6 shades are selected
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[contains(text(),\' x6\')]" }));
    // Scroll Down
    scroll("ScrollDown", 200);
    // Click on Choose shades
    javascriptExecution(
      "document.querySelector(\"div:nth-child(3) > div.bundleVariantDataContainer > div.product-select-variant-button.variantSelectorButtonContainer.bundleProductOptionButton > button#selectVariable\").click();");
    // select  1st shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[31]" });
    // select  2nd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[32]" });
    // Click on Apply
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block\"])[6]" });
    // Validate 2 shades are selected
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[contains(text(),\'x2\')]" }));
    // Scroll Down
    scroll("ScrollDown", 400);
    // Click on Add to cart
    clickOnElement(new String[] { CSS, "button#addToCartVariableSet" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//li//a[contains(text(),' Ir a pagar')]" }, "20",
      "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // Assertion on price
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//div[@class=\"item__price\"])[2]" }));
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//div[text()=\' Promociones Recibidas\']" })) {
      // Assertion on promotions  received
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\' Promociones Recibidas\']" }));
      // End of if loop
    }
    // Assertion on remove product option
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "(//a[text()=\'Eliminar\'])[2]" }));
    // Click on go pay
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']" });
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
    // shiping address
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
    // Complete payment(COD)
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

    status = "passed";
  }

  @Test
  public void ECSCENARIO_One_Purchase_in_virtual_store__With_Credit_card_and_Discount_Coupon__CThreezerozerozero() {
    javascriptExecution(
      "lambda-name=ECSCENARIO One Purchase in virtual store  With Credit card and Discount Coupon  CThreezerozerozero");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Validate Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-name\']" }));
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Random Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Lbel feature
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'lbel\'])[3]" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Cyzone feature
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'cyzone\'])[2]" });
    // Click on perfumes category
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on Go Pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Write text in Coupon Text field
    typeText(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" }, "ECMTO");
    // Click on Apply button
    clickOnElement(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::button" });
    // Click on Again Go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
    // Guest user
    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on seconde checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" })) {
      // Click on Again Go pay
      clickOnElement(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" });
      // End If Statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Validate shipping address is displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Write text in Document No text field
    typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "7865567892");
    // Write text in Billing Name text field
    typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "karthik bala");
    // Select Option  departartment DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000001");
    // Select Option from Canton DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000001000011");
    // Select Option from Sector DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000001000011000052");
    // Write text in address.line1
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "main road");
    // Write text in address.line2
    typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "M60-879");
    // Write text in Secondary Street
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "Church Street");
    // Write text in Neighbourhood
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "Tarak");
    // Write text in Reference Address text field
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "78-92A");
    // Write text in address.phone
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "678954");
    // Click on gift Address
    clickOnElement(new String[] { XPATH, "//input[@class=\'js-checkout-gift-checkbox\']" });
    // Write text in address
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Karthik");
    // Write text in address
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Chaitanya");
    // Write text in address complete Name
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "Tarak Bala");
    // Click on \"click here to continue\" button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Validate shipping methods
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate Shipping methods is Displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-indent\']" },
      "logs/Screenshots/ICxmHV.png");
    // Click on Again CLICK here to continue button
    clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
    // Validate payment options
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate payment options is displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[2]" },
      "logs/Screenshots/tFenhw.png");
    // Credit Card Details
    // if payment option present
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment option as credit card
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
      // Write text in credit card
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
      // select document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Cédula");
      // select doc no
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567892");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
      // Write text in card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // write text in security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if statement click here to continue payment button clickable
      if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" })) {
        // click on aqui para button
        clickOnElement(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" });
        // end if statement click here to contineue payment button clickable
      }
      // else statement click here to continue payment button clickable
      else {
        // print message
        printResults("PrintNote", "not clickable");
        // end else
      }
      // end if click here continue button present
    }
    // else payment option present
    else {
      // print message
      printResults("PrintNote", "Payment option is not present");
      // end else payment option present
    }
    // Validate Order Summary
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Place order Details
    // if for terms1 present
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']" })) {
      // click on terms1 checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
      // if \"finalize your purchase\" button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" })) {
        // Add assertion for \"finalize your purchase\"
        Assert.assertTrue(
          isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" }));
        // click on \"finalize your purchase\" button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" });
        // start if statement
        if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" })) {
          // Add Assertion For successful purchase message
          Assert.assertTrue(
            isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
          // end if
        }
        // start else
        else {
          // print
          printResults("PrintNote", "\"element is not present\"");
          // end else
        }
        // end if \"finalize your purchase\" button clickable
      }
      // else  \"finalize your purchase\" button clickable
      else {
        // print message
        printResults("PrintNote", "finalize your purchase button is not clickable");
        // end else  \"finalize your purchase\" button clickable
      }
      // end if for terms1 present
    }
    // else if for terms1 present
    else {
      // print message
      printResults("PrintNote", "terms1 checkbox is not present");
      // end else for terms1 present
    }

    status = "passed";
  }

  @Test
  public void EC__Customizable_Palette_PDP_Full_Palette__MTOCOneFiveFourSix() {
    javascriptExecution("lambda-name=EC  Customizable Palette PDP Full Palette  MTOCOneFiveFourSix");

    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/beauty-box-%28paleta-completa%29/p/3_1_202108_ec/ec08");
    // Add Assertion For Add To Cart Button
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // start if statement
    if (isElementClickable(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" })) {
      // Click on Elegir tonos
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // Click on 1st tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'1\'])[3]" });
      // Click on 2nd tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'2\'])[3]" });
      // Click on 3rd tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'3\'])[3]" });
      // Click on 4th tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'4\'])[3]" });
      // Click on 5th tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'5\'])[3]" });
      // Click on 6th tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'6\'])[3]" });
      // Add Assertion For Applicar Button
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" }));
      // Click on APLICAR
      clickOnElement(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" });
      // end if Statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // Add  Assertion for Add To Cart Button
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // start if statement
    if (isElementClickable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(18) > div:nth-of-type(3) > button" })) {
      // scroll till X2 tones
      scrollIntoElementView(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(18) > div:nth-of-type(3) > button" });
      // Click on X2 tones
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(18) > div:nth-of-type(3) > button" });
      // Click on 1st tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'1\'])[3]" });
      // Click on 2nd tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'2\'])[3]" });
      // Add Assertion for applicar
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" }));
      // Click on APLICAR
      clickOnElement(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" });
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // Add Assertion For Add To Cart Button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // Add assertion For active Price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']" }));
    // Add Assertion For img
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//a[@class=\'item active gallery-image__thumbnail-js\'])[1]" }));
    // Add Assertion For product title
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for qty selector button (+)
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
    // Add Assertion for qty selector button (+)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
    // Add Assertion for qty selector button (-)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'-\'])[2]" }));
    // Add Assertion For Discount Coupon Section
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@name=\'voucherCode\']" }));
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Write text in guest first Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
    // Write text in guest last Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in guest email
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
    // Click on T&C checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
    // Click on Continue as guest button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // click on go pay button
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
    // Write text in address document no
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(2) > input" },
      "1234567890");
    // Write text in address billing name
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(3) > input" },
      "soumya");
    // Select Option from province dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(1) > div > select" },
      "000023");
    // Select Option from canton dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(2) > div > select" },
      "000023000006");
    // Select Option from Sector Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(3) > div > select" },
      "000023000006000053");
    // Write text in address line1
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(4) > input" },
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(5) > input" },
      "n70-306");
    // Write text in address secondary street
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(6) > input" },
      "vanivihar");
    // Write text in address neighbour
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(7) > input" },
      "rasulgarh");
    // Write text in address house no
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(10) > input" },
      "100");
    // Write text in addres postal Code
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(12) > input" },
      "754215");
    // Write text in address phone
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(16) > input" },
      "7867876788");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Select Option from Payment Method DropDown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" },
      "belpay_cash");
    // Write text in belpayDocNumber...
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"belpayDocNumberCash\"]" },
      "1234567890");
    // click on click here to continue button
    clickOnElement(new String[] { CSS, "div#belpay_accordion > button[type=\'button\']" });
    // Click on Terms1
    clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[text() = ' Finalizar tu compra']" }, "10",
      "disabled");
    // Click on Finalize your purchase button
    clickOnElement(new String[] { XPATH, "//button[contains(text() ,\"Finalizar tu compra\")]" });
    // start if statement for success
    if (isElementAvailable(new String[] { XPATH, "div[class=\"checkout-success__body__headline\"]" })) {
      // Add Assertion for Success message
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"checkout was unsuccessful\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Verify_Footer_MTO_CThreezeroOneEight() {
    javascriptExecution("lambda-name=Verify Footer MTO CThreezeroOneEight");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Scroll Down
    scroll("ScrollBottom");
    // Click on Terms of use link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[4]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/condicion-de-uso-web"));
    // Close Tab
    closeTab();
    // Click on Privacy policy Link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[5]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/politica-de-privacidad"));
    // Close tab
    closeTab();
    // Click on Térms and Conditions Link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[6]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/terminos-y-condiciones-consumidor"));
    // Switch to previous tab
    closeTab();
    // Click on Arco Rights Procedure Link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[7]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/derechos-de-arco"));
    // Close tab
    closeTab();
    // Click on Advertising Sending Authorization link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[8]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/autorizacion-envio-de-publicidad"));
    // Switch to Close Tab
    closeTab();
    // Click on Cookies policy Link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[9]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/politica-de-cookies"));
    // Close tab
    closeTab();
    // Click on Changes and Returns Policy Link
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[10]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Legal/EC/politica-de-cambios-y-devoluciones"));
    // Close Tab
    closeTab();
    // Click On Esika
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[1]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://esika.tiendabelcorp.com/ec/"));
    // Close Tab
    closeTab();
    // Click on Lbel
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[2]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://lbel.tiendabelcorp.com/ec/"));
    // Close Tab
    closeTab();
    // Click on Cyzone
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[3]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://cyzone.tiendabelcorp.com/ec/"));
    // Close Tab
    closeTab();
    // Click On How To Buy
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[11]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("/Docs/Ayuda/MTO_PROCESO"));
    // Close Tab
    closeTab();
    // Click on Frequent Questions
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[12]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://drive.google.com/file/d/"));
    // Close Tab
    closeTab();
    // Validate Write To Us Is Clickable
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[13]/child::a" }));
    // Click on I Want To Be Consultant
    clickOnElement(new String[] { XPATH,
      "//ul[@class=\'bic-social-networks__list\']/ancestor::div[@class=\'row\']/descendant::li[14]/child::a" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://uneteabelcorp.com/ec?vieneDe=Directo"));
    // Close Tab
    closeTab();
    // Click on Facebook Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[1]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("www.facebook.com"));
    // Close Tab
    closeTab();
    // Click on Instagram Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[2]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.instagram.com/accounts/login/"));
    // Close Tab
    closeTab();
    // Click on Youtube Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[3]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.youtube.com/"));
    // Close Tab
    closeTab();
    // Click on Twitter Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[4]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://twitter.com/lbelonline"));
    // Close Tab
    closeTab();
    // Click on Esika
    clickOnElement(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[1]" });
    // Scroll to Bottom
    scroll("ScrollBottom");
    // Click on Facebook Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[1]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("esika.oficial"));
    // Close Tab
    closeTab();
    // Click on Instagram Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[2]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("www.instagram.com"));
    // Close Tab
    closeTab();
    // Click on Youtube Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[3]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.youtube.com/"));
    // Close Tab
    closeTab();
    // Click on Cyzone
    clickOnElement(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[3]" });
    // Scroll To Bottom
    scroll("ScrollBottom");
    // Click on Facebook Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[1]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.facebook.com/"));
    // Close Tab
    closeTab();
    // Click on Instagram Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[2]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.instagram.com/accounts/login/"));
    // Close Tab
    closeTab();
    // Click on Youtube Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[3]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.youtube.com/"));
    // Close Tab
    closeTab();
    // Click on TikTok Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[4]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://www.tiktok.com/"));
    // Close Tab
    closeTab();
    // Click on Twitter Symbol
    clickOnElement(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']/child::li[5]" });
    // Switch to next tab
    switchToNextWindow();
    // Validate URL
    Assert.assertTrue(checkCurrentUrlContains("https://twitter.com/Cyzone_Oficial"));
    // Close Tab
    closeTab();
    // Validate 100% Secure Payment
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "//ul[contains(@class,\'payment-quick-info\')]/child::li[1]" }));
    // Validate Deliveries throughout the country
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "//ul[contains(@class,\'payment-quick-info\')]/child::li[2]" }));
    // Validate Quality Products
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//h4[text()=\'PRODUCTOS DE CALIDAD\']" }));
    // Validate Claims Book
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "//ul[contains(@class,\'payment-quick-info\')]/child::li[4]" }));
    // Validate 3 attached logos
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[contains(@class,\'bic-payments\')]" },
      "logs/Screenshots/MqQhtS.png");

    status = "passed";
  }

  @Test
  public void CL_Customizable_PalettePDP_Full_Palette_ECOMCOneFiveFiveSix() {
    javascriptExecution("lambda-name=CL Customizable PalettePDP Full Palette ECOMCOneFiveFiveSix");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/beauty-box-%28paleta-completa%29/p/3_5_ecomm_cl");
    // Assertion on add to cart is disabled
    Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
    // Add Assertion for \"price to be displayed is the price of the full pallet  \"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Add assertion for content
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
    // Click on Choose shades
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // select first shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[32]" });
    // select second shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[33]" });
    // Click on Apply
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block\"])[6]" });
    // Assertion on 2 shades selected
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[contains(text(),\'x2\')]" }));
    // Scroll Down
    scroll("ScrollDown", 200);
    // Click on Choose shades
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // select  1st shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[53]" });
    // select  2nd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[54]" });
    // select  3rd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[55]" });
    // select 4th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[56]" });
    // select 5th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[57]" });
    // select 6th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[58]" });
    // Click on Apply
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block\"])[6]" });
    // Assertion on count=6
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[contains(text(),\' x6\')]" }));
    // Scroll Down
    scroll("ScrollDown", 400);
    // Click on Add to cart
    clickOnElement(new String[] { CSS, "button#addToCartVariableSet" });
    // wait
    waitForTime(10);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\'Ir a pagar\')]" });
    // Assertion on price
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//div[@class=\"item__price\"])[2]" }));
    // Assertion on remove product option
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "(//a[text()=\'Eliminar\'])[2]" }));
    // Handle popup
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
    clickOnElement(new String[] { XPATH, "(//button[@id=\"checkout-display-continueCheckout\"])[2]" });
    // login as guest user
    // Write text in guest firstName text field
    typeText(new String[] { ID, "guest.firstName" }, "photon");
    // Write text in guest lastName text field
    typeText(new String[] { ID, "guest.lastName" }, "test");
    // Write text in  guest email textfield
    typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity checkbox
    clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
    // Click on guest login submit button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Select Option from REGION
    selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
    // Select Option from COMMUNE
    selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
    // Select Option from location
    selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
    // Write text in STREET AND NUMBER
    typeText(new String[] { ID, "address.line1" }, "churchil street");
    // Write text in TELEPHONE CONTACT
    typeText(new String[] { ID, "address.phone" }, "1234567898");
    // Click on addressSubmit
    clickOnElement(new String[] { ID, "addressSubmit" });
    // Select credit card option
    clickOnElement(new String[] { XPATH, "//label[@for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Complete payment(credit card)
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

    status = "passed";
  }

  @Test
  public void PE_Customizable_PalettePDP_Full_Palette_MTOCOneFiveFourFive() {
    javascriptExecution("lambda-name=PE Customizable PalettePDP Full Palette MTOCOneFiveFourFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/beauty-box-%28paleta-completa%29/p/3_1_202108_pe/MaritaTO123");
    // start if statement for x6 section
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" })) {
      // start if statement for tone section
      if (isElementAvailable(new String[] { XPATH, "div.col-sm-6.product-details-col" })) {
        // add assertion for add to cart button
        Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
        // Add assertion for X6 Shades of Shadows and / or lips
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" }));
        // add assertion for X2 Shades of Blush and / or Powders
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[2]" }));
        // add assertion for X1 Case (Single Paddle Sku)
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[3]" }));
        // Click on Choose shades
        clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
        // select first shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
        // select second shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(2) > div.selectorContainer > div.checkboxContainer > input" });
        // select third shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(3) > div.selectorContainer > div.checkboxContainer > input" });
        // select 4th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
        // select 5th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" });
        // select 6th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" });
        // start if statement
        if (!isElementClickable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(7) > div.selectorContainer > div.checkboxContainer > input" })) {
          // print in result
          printResults("PrintNote", "\"7th color is not clickble after clicking 6 colors\"");
          // end if statement
        }
        // add assertion for + button
        Assert.assertTrue(isElementAvailable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.upAmount" }));
        // add assertion for - button
        Assert.assertTrue(isElementClickable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.downAmount" }));
        // add assertion for X close button
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button#cboxClose" }));
        // Click on Apply button
        clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
        // Assertion on X2 Shades of Blush and / or Powders
        Assert.assertTrue(isElementAvailable(
          new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" }));
        // take a snip of  X2 Shades of Blush and / or Powders
        takeScreenshotOfParticularElement(
          new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" },
          "logs/Screenshots/WpgauU.png");
        // Scroll Down
        scroll("ScrollDown", 200);
        // Click on Choose shades
        clickOnElement(new String[] { XPATH, "(//button[@id=\"selectVariable\"])[2]" });
        // select first shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
        // select 4th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
        // start if statement
        if (!isElementClickable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" })) {
          // print in result
          printResults("PrintNote", "\"3rd color is not clickable after selecting 2 colors\"");
          // end if statement
        }
        // Click on Apply
        clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
        // Scroll Down
        scroll("ScrollDown", 400);
        // start if statement add to cart button
        if (isElementClickable(new String[] { CSS, "button#addToCartVariableSet" })) {
          // add assertion for add to cart button
          Assert.assertTrue(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
          // add assertion for product name
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
          // add assertion for active price
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
          // click on add to cart button
          clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartVariableSet\"]" });
          // end if statement for add to cart button
        }
        // end if for customizable palette
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Customizable Palette not found\"");
        // end else statement
      }
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='addToCartLayer']" }, "30", "disabled");
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//p[@class=\"titleBar\"]" }, 0)) {
        // Add Assertion for product name
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//a[@class=\"name\"]" }));
        // add assertion for product price
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
        // click on go pay button
        // explicit wait for Go Pay Button
        waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
          "disabled");
        // Click on go pay
        clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
        // End if
      }
      // start else
      else {
        // print in results
        printResults("PrintNote", "\"go pay button popup not found\"");
        // end else statement
      }
      // start if statement
      if (checkCurrentUrlContains("cart")) {
        // taking screen shot to validate qty is greater than 1
        takeScreenshot("logs/Screenshoots/RKgIuk.png");
        // add assertion for qty increase button
        Assert.assertFalse(isElementClickable(new String[] { CSS,
          "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0 > button.item__quantity__action_btn.item__quantity__action_plus_btn" }));
        // add assertion for remove link
        Assert.assertTrue(isElementClickable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
        // write text in coupon text field
        typeText(new String[] { CSS, "input#js-voucher-code-text" }, "REGRESION");
        // click on apply coupon button
        clickOnElement(new String[] { CSS, "button#js-voucher-apply-btn" });
        // ADD ASSERTION FOR COUPON apply message
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" }));
        // click on go pay button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
        // end if statement
      }
      // start else
      else {
        // print in result
        printResults("PrintNote", "\"error in cart page\"");
        // end else
      }
      // start if statement
      if (checkCurrentUrlContains("checkout")) {
        // checkout scenario for peru
        // Write text in guest first Name
        typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" },
          "photon ");
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
        // peru shipping address details
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
        waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" },
          "10", "disabled");
        // Click on Continue Button
        clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
        // peru credit card
        // wait
        waitUntil("CheckVisibleElement",
          new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10", "disabled");
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
        // end if statement
      }
      // start if statement
      if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
        // add assertion for order placed successfully
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
        // print in result
        printResults("PrintNote", "\"order placed successfully\"");
        // end if
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote",
          "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
        // end else statement
      }
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"full palete not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void EC_Verify_data_shown_of_the_product_from_the_FileCThreezeroOneFour() {
    javascriptExecution("lambda-name=EC Verify data shown of the product from the FileCThreezeroOneFour");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Click on Makeup
    clickOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
    // Validate Product Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::div[1]/child::div/child::a" }));
    // Validate Crossed Product Price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::div[1]/child::div/child::div/child::div[@class=\'strikethrough\']/child::p" }));
    // Validate  Product offer price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::div[1]/child::div/child::div/child::div[@class=\'nuevoPrecio\']/child::p" }));
    // Validate Add to Bag Clickable
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::div[2]/child::form" }));
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//div[@class=\"details\"]/a)[4]" });
    // Validate Product Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Validate Share the product
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(@class,\'share show-text\')]" }));
    // Validate Image
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'owl-item\']" }));
    // Validate Ratings
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[@class=\'scroll_reviews\']" }));
    // Validate Crossed Product Price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']" }));
    // Validate  Product offer price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']" }));
    // Validate Rate The Product
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'leave_review\']" }));
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//p[@class=\'panel-body__description\'])" })) {
      // Validate Description
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//p[@class=\'panel-body__description\'])" }));
      // End If Statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a" })) {
      // Validate Exclusive Promotions
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a" }));
      // End If Statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Scroll Down
    scroll("ScrollDown", 1200);
    // Validate Add To Bag Button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
    // Click On Add To Bag Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Start If Statement
    if (isDisplayed(new String[] { XPATH, "(//p[@class=\'titleBar\'])[1]" }, 0)) {
      // Validate Added To Bag Text
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//p[@class=\'titleBar\'])[1]" }));
      // End If Statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void EC_Verify_Register_as_New_Account_from_BrandCThreezeroOneFive() {
    javascriptExecution("lambda-name=EC Verify Register as New Account from BrandCThreezeroOneFive");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Write text in firstName
    typeText(new String[] { NAME, "firstName" }, "Surya");
    // Write text in lastName
    typeText(new String[] { NAME, "lastName" }, "Rajini");
    // Write text in email
    typeText(new String[] { NAME, "email" }, "suryarajini.test@gmail.com");
    // Write text in Confirm Email
    typeText(new String[] { NAME, "checkEmail" }, "suryarajini.test@gmail.com");
    // Write text in password
    typeText(new String[] { NAME, "pwd" }, "Surya9");
    // Write text in Confirm password
    typeText(new String[] { NAME, "checkPwd" }, "Surya9");
    // Click on register agree checkbox
    clickOnElement(new String[] { NAME, "agreeToReceivePublicity" });
    // Click on register  checkbox
    clickOnElement(new String[] { NAME, "belcorpToC" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text() ,\"Crear cuenta\")]" })) {
      // Add Assertion for Create user
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text() ,\"Crear cuenta\")]" }));
      // end if
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void EC_Check_add_product_to_bag___CThreezeroTwoOne() {
    javascriptExecution("lambda-name=EC Check add product to bag   CThreezeroTwoOne");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // click on login icon
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']" });
    // write text in email
    typeText(new String[] { XPATH, "//input[@name=\'j_username\']" }, "belcorpregisteredtestuser@endtest-mail.io");
    // write text in password
    typeText(new String[] { XPATH, "//input[@name=\'j_password\']" }, "PhotonTest@9876543210");
    // click on login buttton
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Verify that it returns to the Home Page
    takeScreenshot("logs/Screenshoots/wQOhVr.png");
    // verify  upper left corner it says Hello \'Name\'
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));
    // click on make up
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Click on Product image
    clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Add assertion for offer price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'active-price\']" }));
    // Add assertion for qunatity
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }));
    // click on add to cart button
    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Add assertion \"add to cart\" clickable
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }
    // if \"go pay\" is present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
      // Add assertion for go pay
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" }));
      // Add assertion for continue shopping
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" }));
      // end if
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "Element is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void ECOM__CL_Pop_up_in_Piloto_Chile_CThreeOneOneFour() {
    javascriptExecution("lambda-name=ECOM  CL Pop up in Piloto Chile CThreeOneOneFour");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Explicit wait for \"Boost the business\" Pop up
    waitUntil("CheckVisibleNotElement", new String[] { CSS, "button#cboxClose > span" }, "10", "disabled");
    // Click on CLICK here  Text
    clickOnElement(new String[] { XPATH, "//span[contains(text() ,\"Clic aqui\")]" });
    // Validate Buy through an  Online consultant Text
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//div[@class=\'bic-consultant-top-bar\']/child::div/child::span" }));
    // Close  \"Boost the business\" Pop up
    clickOnElement(new String[] { CSS, "button#cboxClose > span" });
    // Click on Perfumes Category
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Validate \"Boost the business\" Pop up
    //Assert.assertFalse(isElementDisplayed(new String[] { CSS, "button#cboxClose > span" }));
    boolean elementDisplayed = isElementDisplayed(new String[] { CSS, "button#cboxClose > span" });
    if(elementDisplayed){
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
    }
    else{
      printResults("PrintNote", "\"cbox element is not present\"");
    }
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'lbel\'])[3]" });
    // Explicit wait for \"Boost the business\" Pop up
    waitUntil("CheckVisibleNotElement", new String[] { CSS, "button#cboxClose > span" }, "10", "disabled");
    // \"CLICK here  Text\" is visible
    if (isDisplayed(new String[] { XPATH, "//span[text() = \" Clic aqui\"]" }, 0)) {
      // Validate \"CLICK here  Text\"  is visible
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[text() = \" Clic aqui\"]" }));
      // Validate \"CLICK here  Text\" is Clickable
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text() = \" Clic aqui\"]" }));
      // End of If Loop
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Click on Cyzone
    clickOnElement(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[3]" });
    // \"Boost the business\" Pop up
    waitUntil("CheckVisibleNotElement", new String[] { CSS, "button#cboxClose > span" }, "10", "disabled");
    // \"CLICK here  Text\" is visible
    if (isDisplayed(new String[] { XPATH, "//span[text() = \" Clic aqui\"]" }, 0)) {
      // Validate \"CLICK here  Text\" is visible
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[text() = \" Clic aqui\"]" }));
      // Validate \"CLICK here  Text\" is Clickable
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text() = \" Clic aqui\"]" }));
      // End of If Loop
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void EC__Verify_displayed_product_data_from_categories___CThreezeroOneThree() {
    javascriptExecution("lambda-name=EC  Verify displayed product data from categories   CThreezeroOneThree");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // click on make up
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'name\']" }));
    // Add assertion for crossed out price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'strikethrough\']" }));
    // Add assertion for offer price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'nuevoPrecio\']" }));
    // if color variant present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'owl-wrapper-outer\']" })) {
      // Add assertion for color variants
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'owl-wrapper-outer\']" }));
      // Add assertion for variant tone
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'tone-name\']" }));
      // end if color variant present
    }
    // start else
    else {
      // printa
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // if \"add to cart\" button present
    if (isElementAvailable(
      new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-enable-btn js-add-to-cart\']" })) {
      // Add assertion for add to cart button
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-enable-btn js-add-to-cart\']" }));
      // if \"add to cart\" button present
    }
    // else \"out for stock\" button  present
    else {
      // print in result
      printResults("PrintNote", "\"product is out for stock\" button  present");
      // end else
    }

    status = "passed";
  }

  @Test
  public void HYBRISVOneOnezeroThreeThreeFourCOneSevenTwozero() {
    javascriptExecution("lambda-name=HYBRISVOneOnezeroThreeThreeFourCOneSevenTwozero");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl");
    // click on close popup
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Add Assertion for Commercial banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "Compra a través de una consultora online"));
    // Click on commercial banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // Add Assertion for prices and special discount
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][1]/a" }).contains(
        "Precios y descuentos especiales"));
    // Add Assertion for  20% OFF on your first purchase exclusive promotions and advice
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][2]/a" }).contains(
        "20% OFF en tu primer compra promociones exclusivas y asesoría"));
    // Add  Assertion for  Boost the business of an entrepreneur woman
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][3]/a" }).contains(
        "Impulsa el negocio de una mujer emprendedora"));
    // Add Assertion For Assign me as  consultant button
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-asign-consultant\']" }));
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" });
    // click on close popup
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
    // Add Assertion for Commercial banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // click on commercial banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Add Assertion for prices and special discount
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][1]/a" }).contains(
        "Precios y descuentos especiales"));
    // Add Assertion for  20% OFF on your first purchase exclusive promotions and advice
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][2]/a" }).contains(
        "20% OFF en tu primer compra promociones exclusivas y asesoría"));
    // Add  Assertion for  Boost the business of an entrepreneur woman
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][3]/a" }).contains(
        "Impulsa el negocio de una mujer emprendedora"));
    // Add Assertion For Assign me as  consultant button
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-asign-consultant\']" }));
    // Click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // click on close popup
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
    // Add Assertion for Commercial banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "Compra a través de una consultora online"));
    // click on commercial banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Add Assertion for prices and special discount
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][1]/a" }).contains(
        "Precios y descuentos especiales"));
    // Add Assertion for  20% OFF on your first purchase exclusive promotions and advice
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][2]/a" }).contains(
        "20% OFF en tu primer compra promociones exclusivas y asesoría"));
    // Add  Assertion for  Boost the business of an entrepreneur woman
    Assert.assertTrue(
      getText(new String[] { XPATH, "//p[@class=\'consultants-search-page-left-section-link\'][3]/a" }).contains(
        "Impulsa el negocio de una mujer emprendedora"));
    // Add Assertion For Assign me as  consultant button
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-asign-consultant\']" }));

    status = "passed";
  }

  @Test
  public void Flujo_Kit_InicioCThreezeroThreeTwo() {
    javascriptExecution("lambda-name=Flujo Kit InicioCThreezeroThreeTwo");

    // Clear Cache
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
    // Click on  User Icon
    clickOnElement(new String[] { XPATH, "(//a[@class=\'cms-image-link\'])[1]" });
    // Write text in j_username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "regresion@test.chile.com");
    // Write text in j_password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "0808008Re");
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[contains(text() ,\"Iniciar sesión\")]" });
    // Add Assertion For Hello Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));
    // Add Assertion for starter Kit Section
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//h2[@class=\'genericProductCarousel-title horizontal-slider__title\']" }));
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text()=\'perfume de hombre nitro\']" })) {
      // Click on first product under starter kit category
      clickOnElement(new String[] { XPATH, "(//a[text()=\'perfume de hombre nitro\'])[2]" });
      // End if statement
    }
    // Start else
    else {
      // End else
    }
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Clear input From qty selector TextBox
    clearText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" });
    // Write Text in qty selector Textbox
    typeText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }, "2");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\"cart_popup_error_msg\"])[2]" })) {
      // Add Assertion For message after adding more quantity
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"cart_popup_error_msg\"])[2]" }));
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"cart error message not coming\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void HYBRISVOneNineFourTwoFive__As_a_consumer_I_want_to_have_the_integration_with_custom_bundles_to_have_offers_recommended_just_for_me__ECCThreezerozeroFive() {
    javascriptExecution(
      "lambda-name=HYBRISVOneNineFourTwoFive  As a consumer I want to have the integration with custom bundles to have offers recommended just for me  ECCThreezerozeroFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/labial-mate-signature/p/210093053/MaritaTO123");
    // Click on User Icon
    clickOnElement(new String[] { CSS, "li.liOffcanvas.bicHeaderLinks-container > a > img" });
    // Write Text in Username Textbox
    typeText(new String[] { CSS, "input#j_username" }, "test_user_86292523@testuser.com");
    // Write Text in Password Textbox
    typeText(new String[] { CSS, "input#j_password" }, "Qatest2042");
    // Click on Login Button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // wait
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "h3[class='commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title']" }, "10",
      "disabled");
    // Scroll To Promotion section
    scrollIntoElementView(
      new String[] { CSS, "h3[class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']" });
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" }, 0)) {
      // Add Assertion For See set Details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" }));
      // Click on See Set Details
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" });
      // Add  Assertion For First Product
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.row.linkProductDetailModal > div.col-md-8 > div.title > p" }));
      // Add Assertion For Second Product
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(7) > div.row.linkProductDetailModal > div.col-md-8 > div > p" }));
      // end if statement
    }
    // Start Else Satement
    else {
      // Print Result
      printResults("PrintNote", "\"See Set Details is not Present\"");
      // End Else Statement
    }
    // Click on Signoff Button
    javascriptExecution("document.querySelector(\"li.liOffcanvas > a\").click()");
    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Refresh Page
    pageRefresh();
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" })) {
      // Add assertion For See Set Details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del set\"]" }));
      // Click on see Set Details
      javascriptExecution(
        "document.querySelector(\"div#lazyLoadCommercialCarousel div:nth-child(1) > div > div > div > div.commercialCarousel-pdp-footer > a\").click();");
      // Add Assertion For First Product
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.row.linkProductDetailModal > div.col-md-8 > div.title > p" }));
      // Add Assertion For Second  Product
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(7) > div.row.linkProductDetailModal > div.col-md-8 > div > p" }));
      // Click On Close Popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"See Set Details is not Present\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void EC__Customizable_Palette_PDP_Average_full_MTOCOneFiveFiveOne() {
    javascriptExecution("lambda-name=EC  Customizable Palette PDP Average full MTOCOneFiveFiveOne");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/beauty-box-%28paleta-completa%29/p/3_1_202108_ec/ec08");
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div.col-sm-6.product-details-col" })) {
      // add assertion for add to cart button
      Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
      // Add assertion for X6 Shades of Shadows and / or lips
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" }));
      // add assertion for X2 Shades of Blush and / or Powders
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[2]" }));
      // add assertion for X1 Case (Single Paddle Sku)
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[3]" }));
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // select second shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(2) > div.selectorContainer > div.checkboxContainer > input" });
      // select third shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(3) > div.selectorContainer > div.checkboxContainer > input" });
      // select 4th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // select 5th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" });
      // select 6th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" });
      // start if statement
      if (!isElementClickable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(7) > div.selectorContainer > div.checkboxContainer > input" })) {
        // print in result
        printResults("PrintNote", "\"7th color is not clickble after clicking 6 colors\"");
        // end if statement
      }
      // add assertion for + button
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.upAmount" }));
      // add assertion for - button
      Assert.assertTrue(isElementClickable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.downAmount" }));
      // add assertion for X close button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button#cboxClose" }));
      // Click on Apply button
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Assertion on X2 Shades of Blush and / or Powders
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" }));
      // take a snip of  X2 Shades of Blush and / or Powders
      takeScreenshotOfParticularElement(
        new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" },
        "logs/Screenshots/efFzNb.png");
      // Scroll Down
      scroll("ScrollDown", 200);
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "(//button[@id=\"selectVariable\"])[2]" });
      // select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // select 4th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // start if statement
      if (!isElementClickable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" })) {
        // print in result
        printResults("PrintNote", "\"3rd color is not clickable after selecting 2 colors\"");
        // end if statement
      }
      // Click on Apply
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Scroll Down
      scroll("ScrollDown", 400);
      // start if statement
      if (isElementClickable(new String[] { CSS, "button#addToCartVariableSet" })) {
        // add assertion for add to cart button
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
        // add assertion for product name
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
        // add assertion for active price
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
        // click on add to cart button
        clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartVariableSet\"]" });
        // end if
      }
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Customizable Palette not found\"");
      // end else statement
    }
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='addToCartLayer']" }, "30", "disabled");
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//p[@class=\"titleBar\"]" }, 0)) {
      // Add Assertion for product name
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//a[@class=\"name\"]" }));
      // add assertion for product price
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
      // click on go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // End if
    }
    // start else
    else {
      // print in results
      printResults("PrintNote", "\"go pay button popup not found\"");
      // end else statement
    }
    // start if statement
    if (checkCurrentUrlContains("cart")) {
      // add assertion for qty increase button
      Assert.assertFalse(isElementClickable(new String[] { CSS,
        "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0 > button.item__quantity__action_btn.item__quantity__action_plus_btn" }));
      // add assertion for remove link
      Assert.assertTrue(isElementClickable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
      // write text in coupon text field
      typeText(new String[] { CSS, "input#js-voucher-code-text" }, "ECMTO");
      // click on apply coupon button
      clickOnElement(new String[] { CSS, "button#js-voucher-apply-btn" });
      // start if statement for coupon msg
      if (isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" })) {
        // ADD ASSERTION FOR COUPON apply message
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" }));
        // end if statement for coupon msg
      }
      // click on go pay button
      clickOnElement(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
      // end if statement
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"error in cart page\"");
      // end else
    }
    // start if statement
    if (checkCurrentUrlContains("checkout")) {
      // checkout scenario for peru
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
      // Click on guest login submit button
      clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
      // start if
      if (isElementAvailable(
        new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" })) {
        // Click on go pay
        clickOnElement(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a" });
        // end if
      }
      // start else
      else {
        // print in result
        printResults("PrintNote", "\"consultant go pay page not found\"");
        // end else
      }
      // write text in address document
      typeText(new String[] { XPATH, "//input[@id=\"address.documentNumber\"]" }, "1234567890");
      // write text in adress billing name
      typeText(new String[] { XPATH, "//input[@id=\"address.billingName\"]" }, "billie elish");
      // Select Option from REGION
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "CARCHI");
      // Select Option from COMMUNE
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "BOLIVAR");
      // Select Option from location
      selectOption(new String[] { ID, "address.regionIso" }, "BOLIVAR");
      // Write text in STREET AND NUMBER
      typeText(new String[] { ID, "address.line1" }, "church street");
      // write text in adress street name
      typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "edin berg");
      // write text in adress number
      typeText(new String[] { XPATH, "//input[@id=\"address.line2\"]" }, "n70-306");
      // write text in address 2nd steet name
      typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "johan berg");
      // write text in adress neighbourhood
      typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "simpson");
      // write text in adress referernce
      typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "banfield");
      // WRITE TEXT IN MOBILE NUMBER
      typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
      // Click on addressSubmit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//button[@id='deliveryMethodSubmit']" }, "10",
        "disabled");
      // Click on delivery Method Submit
      clickOnElement(new String[] { XPATH, "//button[@id=\"deliveryMethodSubmit\"]" });
      // end if statement
    }
    // start if statement
    if (checkCurrentUrlContains("payment-method")) {
      // Select credit card option
      selectOption(new String[] { CSS, "select#paymentOptions" }, "belpay_credit");
      // Write text in card Number
      typeText(new String[] { CSS, "form#belpay_credit input#cardNumber" }, "4443753924973911");
      // Write text in docNumber
      typeText(new String[] { CSS, "form#belpay_credit input#docNumber" }, "1234567890");
      // Select month Option dropdown
      selectOption(new String[] { CSS, "form#belpay_credit select#expirationMonth" }, "11");
      // Select year Option from drop down
      selectOption(new String[] { CSS, "form#belpay_credit select#expirationYear" }, "2025");
      // Write text in cardholder Name
      typeText(new String[] { CSS, "form#belpay_credit input#cardholderName" }, "apro");
      // Write text in security Code
      typeText(new String[] { CSS, "form#belpay_credit input#securityCode" }, "123");
      // Click on CLICK HERE TO CONTINUE
      clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
      // end if statement
    }
    // start if statement
    if (isElementAvailable(new String[] { ID, "Terms1" })) {
      // click on accept terms and condition check box
      clickOnElement(new String[] { ID, "Terms1" });
      // click on finalize your order
      clickOnElement(new String[] { ID, "placeOrder" });
      // end if statement
    }
    // wait
    waitForTime(5);
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }, 0)) {
      // add assertion for order placed successfully
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]" }));
      // print in result
      printResults("PrintNote", "\"order placed successfully\"");
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void CL__Customizable_Palette__PDP_Average_full__MTOCOneFiveFiveTwo() {
    javascriptExecution("lambda-name=CL  Customizable Palette  PDP Average full  MTOCOneFiveFiveTwo");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/beauty-box-%28paleta-completa%29/p/3_1_202108_cl/pruebaqas222");
    // Add assertion For Add to Cart button
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // strat if statement
    if (isElementClickable(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" })) {
      // Click on Elegir tonos
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // Click on 1st tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'0\'])[3]" });
      // Click on 2nd tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'1\'])[3]" });
      // Click on 3rd tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'2\'])[3]" });
      // Click on 4th tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'3\'])[3]" });
      // Click on 5th tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'4\'])[3]" });
      // Click on 6th tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'5\'])[3]" });
      // Add Assertion For Aplicar Button
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" }));
      // Click on APLICAR
      clickOnElement(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" });
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // Add Assertion For add To cart button
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // start if statement
    if (isElementClickable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(18) > div:nth-of-type(3) > button" })) {
      // scroll till X2 select Tones
      scrollIntoElementView(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(18) > div:nth-of-type(3) > button" });
      // Click on Elegir tonos
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(18) > div:nth-of-type(3) > button" });
      // Click on 1st tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'0\'])[3]" });
      // Click on 2nd tone
      clickOnElement(new String[] { XPATH, "(//div[@class=\'selectorContainer\'][@data-value=\'1\'])[3]" });
      // Add Asertion For Aplicar Button
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" }));
      // Click on APLICAR
      clickOnElement(new String[] { XPATH, "(//div[@class=\'col-xs-8 col-md-8 applyButton\'])[3]" });
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // start else
    }
    // Add Assertion for add to cart button
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" }));
    // Add Assertion For Active Price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']" }));
    // Add assertion For Image
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//a[@class=\'item active gallery-image__thumbnail-js\'])[1]" }));
    // Add Assertion for product title
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Add Assertion For name of set
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//a[@class=\'name\']" }));
    // Add assertion For Subtotal Price
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'subtotal\']/following::div[1]" }));
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for qty selector button (+)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
    // Add Assertion for qty selector button (+)
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
    // Add Assertion for qty selector button (-)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'-\'])[2]" }));
    // Add Assertion for qty selector button (-)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
    // Add Assertion For Discount Coupon
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@name=\'voucherCode\']" }));
    // wait
    waitUntil("CheckClickableElement",
      new String[] { XPATH, "//div[@class='actions']/button[contains(.,'Ir a pagar')]" }, "10", "disabled");
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Write text in guest first Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
    // Write text in guest last Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in guest email
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "photontest@endtest-mail.io");
    // Click on Continue as guest button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // click on go pay button
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
    // Checkout Using Credit Card
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

    status = "passed";
  }

  @Test
  public void ECSCENARIO_Three_Purchase_in_virtual_store__start_Guest_User__debit_cardCTwoNineNineNine() {
    javascriptExecution(
      "lambda-name=ECSCENARIO Three Purchase in virtual store  start Guest User  debit cardCTwoNineNineNine");

    // clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to MTO URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Add Assertion for consultant banner present
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
    // Click on commercial banner
    clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
    // Validate Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']" }));
    // Add Assertion for consultant email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-mail\']" }));
    // Add Assertion For Consultant phone
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-phone\']" }));
    // Close  Consultant popup
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Random Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Lbel feature
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'lbel\'])[3]" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" })) {
      // Click on keep buying
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "Seguir Comprando not there");
      // end else
    }
    // Click on Cyzone feature
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'cyzone\'])[2]" });
    // Click on perfumes category
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on Go Pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Write text in Coupon Text field
    typeText(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" }, "ECMTO");
    // Click on Apply button
    clickOnElement(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::button" });
    // Click on Again Go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
    // Guest user
    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on seconde checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" })) {
      // Click on Again Go pay
      clickOnElement(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" });
      // End If Statement
    }
    // start else statemnet
    else {
      // print
      printResults("PrintNote", "Ir a pagar not there");
      // end else
    }
    // Validate shipping address is displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Write text in Document No text field
    typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "7865567892");
    // Write text in Billing Name text field
    typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "karthik bala");
    // Select Option  departartment DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000001");
    // Select Option from Canton DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000001000011");
    // Select Option from Sector DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000001000011000052");
    // Write text in address.line1  text field
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "main road");
    // Write text in address.line2  text field
    typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "M60-879");
    // Write text in Secondary Street  text field
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "Church Street");
    // Write text in Neighbourhood  text field
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "Tarak");
    // Write text in Reference Address text field
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "78-92A");
    // Write text in phone Textfield
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "678954");
    // Click on giftAddress
    clickOnElement(new String[] { XPATH, "//input[@class=\'js-checkout-gift-checkbox\']" });
    // Write text in address.from
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Karthik");
    // Write text in address to  text field
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Chaitanya");
    // Write text in address complete Name   text field
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "Tarak Bala");
    // Click on CLICK here to continue button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Validate shipping methods
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate Shipping methods is Displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-indent\']" },
      "logs/Screenshots/BpIZmh.png");
    // Click on Again CLICK here to continue button
    clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
    // Validate payment options
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate payment options is displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[2]" },
      "logs/Screenshots/pYHKby.png");
    // Credit Card Details
    // if payment option present
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment option as credit card
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
      // Write text in credit card
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
      // select document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Cédula");
      // select doc no
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567892");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
      // Write text in card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // write text in security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if statement click here to continue payment button clickable
      if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" })) {
        // click on aqui para button
        clickOnElement(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" });
        // end if statement click here to contineue payment button clickable
      }
      // else statement click here to continue payment button clickable
      else {
        // print message
        printResults("PrintNote", "not clickable");
        // end else
      }
      // end if click here continue button present
    }
    // else payment option present
    else {
      // print message
      printResults("PrintNote", "Payment option is not present");
      // end else payment option present
    }
    // Validate Order Summary
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate SubTotal
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'subtotal\']" }));
    // Place order Details
    // if for terms1 present
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']" })) {
      // click on terms1 checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
      // if \"finalize your purchase\" button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" })) {
        // Add assertion for \"finalize your purchase\"
        Assert.assertTrue(
          isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" }));
        // click on \"finalize your purchase\" button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" });
        // start if statement
        if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" })) {
          // Add Assertion For successful purchase message
          Assert.assertTrue(
            isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
          // end if
        }
        // start else
        else {
          // print
          printResults("PrintNote", "\"element is not present\"");
          // end else
        }
        // end if \"finalize your purchase\" button clickable
      }
      // else  \"finalize your purchase\" button clickable
      else {
        // print message
        printResults("PrintNote", "finalize your purchase button is not clickable");
        // end else  \"finalize your purchase\" button clickable
      }
      // end if for terms1 present
    }
    // else if for terms1 present
    else {
      // print message
      printResults("PrintNote", "terms1 checkbox is not present");
      // end else for terms1 present
    }
    // Validate Mail is present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b" })) {
      // Add Assertion for  mail
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b" }));
      // End of If Loop
    }
    // startelse
    else {
      // print
      printResults("PrintNote", "Mail is  not present");
      // end else
    }
    // open new tab
    openNewTab("OpenNewTab");
    pageRefresh();
    // Enter Mailinator URL
    getURL("https://www.mailinator.com/");
    // Write Text In search bar text field
    typeText(new String[] { XPATH, "//input[@id=\'search\']" }, "ec.esc2.mto.fb@gmail.com");
    // press enter key
    pressKey(new String[] { XPATH, "//input[@id=\'search\']" }, "ENTER");
    // Explicit wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "(//tr[@ng-repeat='email in emails'])[1]" }, "120",
      "disabled");
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//tr[@ng-repeat=\'email in emails\'])[1]" })) {
      // Click on First Email
      clickOnElement(new String[] { XPATH, "(//tr[@ng-repeat=\'email in emails\'])[1]" });
      // Screenshot of Mail
      takeScreenshot("logs/Screenshoots/USILtO.png");
      // End If Statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "First Email not open");
      // end else
    }

    status = "passed";
  }

  @Test
  public void ECSCENARIO_Three_Purchase_in_virtual_store__With_Cash_plus_Coupon_and_PromotionCThreezerozeroTwo() {
    javascriptExecution(
      "lambda-name=ECSCENARIO Three Purchase in virtual store  With Cash plus Coupon and PromotionCThreezerozeroTwo");

    // clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Add Assertion for consultant banner present
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
    // Click on commercial banner
    clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
    // Validate Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']" }));
    // Add Assertion for consultant email
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-mail\']" }));
    // Add Assertion For Consultant phone
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-phone\']" }));
    // Close  Consultant popup
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Random Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Lbel feature
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'lbel\'])[3]" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on keep buying
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Cyzone feature
    clickOnElement(new String[] { XPATH, "(//img[@data-parent=\'cyzone\'])[2]" });
    // Click on perfumes category
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on first product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a" });
    // Click on Add to cart
    clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
    // Click on Go Pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Write text in Coupon Text field
    typeText(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" }, "ECMTO");
    // Click on Apply button
    clickOnElement(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::button" });
    // Coupon applied successfully is present
    if (isElementAvailable(new String[] { XPATH, "//span[text() = \"Cupón aplicado exitosamente\"]" })) {
      // Add Assertion for Coupon applied successfully
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Cupón aplicado exitosamente\"]" }));
      // End of If Loop
    }
    // strt else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Coupon is not  applied Text is present
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class=\'js-voucher-validation-container help-block cart-voucher__help-block\']" })) {
      // Validate Coupon is not  applied
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//div[@class=\'js-voucher-validation-container help-block cart-voucher__help-block\']" }));
      // End of If Loop
    }
    // strt else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Click on Again Go pay
    clickOnElement(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]" });
    // Login as Facebook User
    // if statement
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']" })) {
      // write text in firsta name
      typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
      // write text in last name
      typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
      // write text in email
      typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
      // click on  first checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']" });
      // click on seconde checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']" });
      // click on login
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']" });
      // end if statement
    }
    // else statement
    else {
      // print message
      printResults("PrintNote", "guest user login is not present");
      // end else statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" })) {
      // Click on Again Go pay
      clickOnElement(new String[] { XPATH, "//a[text()=\'Ir a pagar\']" });
      // End If Statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Validate shipping address is displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Write text in Document No text field
    typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "7865567892");
    // Write text in Billing Name text field
    typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "karthik bala");
    // Select Option  departartment DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000001");
    // Select Option from Canton DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "CHORDELEG");
    // Select Option from Sector DD
    selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "LA UNION");
    // Write text in address.line1
    typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "main road");
    // Write text in address.line2
    typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "M60-879");
    // Write text in Secondary Street
    typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "Church Street");
    // Write text in Neighbourhood
    typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "Tarak");
    // Write text in Reference Address text field
    typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "78-92A");
    // Write text in address.phone
    typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "678954");
    // Click on CLICK here to continue button
    clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
    // Validate shipping methods
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate Shipping methods is Displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-indent\']" },
      "logs/Screenshots/rwelXt.png");
    // Click on Again CLICK here to continue button
    clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
    // Validate payment options
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate payment options is displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[2]" },
      "logs/Screenshots/OHNBMj.png");
    // Credit Card Details
    // if payment option present
    if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']" })) {
      // select payment option as credit card
      selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
      // Write text in credit card
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
      // select document type
      selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Cédula");
      // select doc no
      typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567892");
      // select expiry month
      selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
      // select expiry year
      selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
      // Write text in card holder name
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
      // write text in security code
      typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
      // if statement click here to continue payment button clickable
      if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" })) {
        // click on aqui para button
        clickOnElement(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]" });
        // end if statement click here to contineue payment button clickable
      }
      // else statement click here to continue payment button clickable
      else {
        // print message
        printResults("PrintNote", "not clickable");
        // end else
      }
      // end if click here continue button present
    }
    // else payment option present
    else {
      // print message
      printResults("PrintNote", "Payment option is not present");
      // end else payment option present
    }
    // Validate Order Summary
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]" }));
    // Validate SubTotal
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'subtotal\']" }));
    // Place order Details
    // if for terms1 present
    if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']" })) {
      // click on terms1 checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
      // if \"finalize your purchase\" button clickable
      if (isElementClickable(
        new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" })) {
        // Add assertion for \"finalize your purchase\"
        Assert.assertTrue(
          isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" }));
        // click on \"finalize your purchase\" button
        clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']" });
        // start if statement
        if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" })) {
          // Add Assertion For successful purchase message
          Assert.assertTrue(
            isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
          // end if
        }
        // start else
        else {
          // print
          printResults("PrintNote", "\"element is not present\"");
          // end else
        }
        // end if \"finalize your purchase\" button clickable
      }
      // else  \"finalize your purchase\" button clickable
      else {
        // print message
        printResults("PrintNote", "finalize your purchase button is not clickable");
        // end else  \"finalize your purchase\" button clickable
      }
      // end if for terms1 present
    }
    // else if for terms1 present
    else {
      // print message
      printResults("PrintNote", "terms1 checkbox is not present");
      // end else for terms1 present
    }
    // Validate Mail is present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b" })) {
      // Add Assertion for Facebook mail
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b" }));
      // End of If Loop
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // open new tab
    openNewTab("OpenNewTab");
    pageRefresh();
    // Enter Mailinator URL
    getURL("https://www.mailinator.com/");
    // Write Text In search bar text field
    typeText(new String[] { XPATH, "//input[@id=\'search\']" }, "ec.esc2.mto.fb@gmail.com");
    // press enter key
    pressKey(new String[] { XPATH, "//input[@id=\'search\']" }, "ENTER");
    // Explicit wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "(//tr[@ng-repeat='email in emails'])[1]" }, "120",
      "disabled");
    // start if statement for email
    if (isElementAvailable(new String[] { XPATH, "(//tr[@ng-repeat=\'email in emails\'])[1]" })) {
      // Click on First Email
      clickOnElement(new String[] { XPATH, "(//tr[@ng-repeat=\'email in emails\'])[1]" });
      // Screenshot of Mail
      takeScreenshot("logs/Screenshoots/tPbtzB.png");
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"email is not present for assertion \"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void HYBRISVOneEightNineOneThree__As_a_consumer_I_want_more_payment_options_in_agent__web_banking_to_be_able_to_secure_the_purchase__ECCThreezerozeroSeven() {
    javascriptExecution(
      "lambda-name=HYBRISVOneEightNineOneThree  As a consumer I want more payment options in agent  web banking to be able to secure the purchase  ECCThreezerozeroSeven");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // scroll to end
    scroll("ScrollBottom");
    // Take Snip of Payment Method Present In Footer
    takeScreenshotOfParticularElement(
      new String[] { XPATH, "//div[@class=\'bic-payments col-xs-12 col-sm-4 col-md-5 col-md-push-1\']" },
      "logs/Screenshots/oDqWyN.png");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on Body & Spirit P...
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
    // Write text in guest first Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
    // Write text in guest last Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in guest email
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "photontest@endtest-mail.io");
    // Click on guest agree To Receive publicity
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
    // Click on T&C checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
    // Click on continue as guest user
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" })) {
      // Click on go pay button
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
      // End if statement
    }
    // start if statement
    else {
      // Print
      printResults("PrintNote", "\"element is not present\"");
      // end else Satatement
    }
    // Write text in address document
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(2) > input" },
      "1234567890");
    // Write text in address billing name
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(3) > input" },
      "soumya");
    // Select Option from province dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(1) > div > select" },
      "000023");
    // Select Option from  Canton Dropdown
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
      "near temple");
    // Write text in address line2
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(5) > input" },
      "n70-306");
    // Write text in address secondary street
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(6) > input" },
      "vanivihar");
    // Write text in address neighbour
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(7) > input" },
      "rasulgarh");
    // Write text in address house no
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(10) > input" },
      "100");
    // Write text in address postal code
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(12) > input" },
      "754215");
    // Write text in address phone
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(16) > input" },
      "7856786679");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Add Assertion For Payment Method Section
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Método de Pago\']" }));
    // Add Assertion For Payment Through Agent
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']/option[4]" }));
    // Take Snip Of Checkout Page Deatils
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-order-summary\']" },
      "logs/Screenshots/kDhVJm.png");
    // Select Option from Payment Method Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" },
      "belpay_cash");
    // Write text in belpay Document Number
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"belpayDocNumberCash\"]" },
      "1234567890");
    // Add Assertion for Pago 100% secure payment
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(5)" }));
    // click on click here to continue button
    clickOnElement(new String[] { CSS, "div#belpay_accordion > button[type=\'button\']" });
    // Click on Terms1
    clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
    // Click on Finalize your purchase button
    clickOnElement(new String[] { XPATH, "//button[contains(text() ,\"Finalizar tu compra\")]" });
    // Add Assertion for successful message
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
    // Take snip of Summary your purchase section
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'order-detail-overview\']" },
      "logs/Screenshots/cKmmwG.png");
    // Add Assertion For Summary your purchase section
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'order-detail-overview\']" }));
    // Take Snip of Payment Number Section
    takeScreenshotOfParticularElement(new String[] { XPATH,
        "//div[@class=\'account-orderdetail account-orderdetail-payment-info well well-tertiary js-cash-order-confirmation js-account-orderdetail\']" },
      "logs/Screenshots/RiPInG.png");
    // Add Assertion For Payment Section Details
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'account-orderdetail account-orderdetail-payment-info well well-tertiary js-cash-order-confirmation js-account-orderdetail\']" }));

    status = "passed";
  }

  @Test
  public void CO__Customizable_Palette__PDP_Average_Complete_ECOM__COneFiveSixTwo() {
    javascriptExecution("lambda-name=CO  Customizable Palette  PDP Average Complete ECOM  COneFiveSixTwo");

    // Clear ache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/beauty-box-%28paleta-de-3-refills%29/p/3_1000004_ecomm_co");
    // Add Assertion for \"x1 Rubor HD \"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'product-variant-container\']" }));
    // Add Assertion for \"x2 Labial HD \"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[2]" }));
    // Add Assertion for \" x1 Empty Beauty Box (Customizable Palette)\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[3]" }));
    // Add assertion for add to cart disabled
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // Add Assertion for \"price to be displayed is the price of the full pallet  \"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Add Assertion for product image
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "img[class=\"lazy loaded\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/210094759-FotoFondoBlanco.jpg\"]" }));
    // Add assertion for content
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
    // click on choose shade button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tono\"]" });
    // Click on first tone
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add Assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
    // click on apply button
    clickOnElement(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
    // Add assertion for add to cart still disabled
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // click on choose shade
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // Click on first shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add Assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
    // Click on second shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add Assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
    // Click on apply button
    clickOnElement(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
    // Add assertion for add to cart enabled
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // Click on add to cart button
    clickOnElement(new String[] { ID, "addToCartVariableSet" });
    // if go pay button present
    if (isElementAvailable(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" })) {
      // click on go pay button
      clickOnElement(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
      // Add Assertion for quantity can\'t be changed
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(2) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }));
      // Scroll Down
      scroll("ScrollDown", 276);
      // click on go pay button
      clickOnElement(new String[] { CSS,
        "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
      // colombia guest user login
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
      // colombia credit card
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
        clickOnElement(
          new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
        // endif statement
      }
      // start else statemnet
      else {
        // print in result
        printResults("PrintNote", "\"credit card data is not proper\"");
        // end else
      }
      // Add Assertion for \"placed order\"
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
      // end if go pay button present
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"go pay button is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void ECSCENARIO_Two_Purchase_in_virtual_store__With_Debit_card_and_PromotionCThreezerozeroOne() {
    javascriptExecution(
      "lambda-name=ECSCENARIO Two Purchase in virtual store  With Debit card and PromotionCThreezerozeroOne");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/labial-mate-signature/p/210093053/MaritaTO123");
    // start if statement for LKT promotion
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-header bundle2Prod\']" })) {
      // Add Assertion For LKT promotion is displayed
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-header bundle2Prod\']" }));
      // end if statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title = \"Perfumes\"]" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Clear input from qty selector textbox
    clearText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" });
    // Write text in qty selector textbox
    typeText(new String[] { XPATH, "//input[@class=\'form-control js-qty-selector-input\']" }, "3");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion for Free Sample Product
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'item\']" }));
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//span[@class=\'cart-entry-message\']" })) {
      // click on qty selector button(+)
      clickOnElement(new String[] { XPATH, "(//button[text()=\'+\'])[2]" });
      // Add Assertion For Discount Amount
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'col-xs-6 cart-totals-right text-right discount\']" }));
      // end if statement
    }
    // Start Else Statement
    else {
      // Print result
      printResults("PrintNote", "\"Add Product To Get More Discount Message is not present\"");
      // End Else Statement
    }
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Write text in guest first Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
    // Write text in guest last Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
    // Write text in guest email
    typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
    // Click on   agree To Receive publicity Checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
    // Click on T&C Checkbox
    clickOnElement(new String[] { CSS,
      "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
    // Click on Continue as Guest Button
    clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
    // Write text in address document number
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(2) > input" },
      "1234567890");
    // Write text in address billing name
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(3) > input" },
      "soumya");
    // Select Option from Province Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(1) > div > select" },
      "000011");
    // Select Option from Canton Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(2) > div > select" },
      "000011000009");
    // Select Option from Department Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(3) > div > select" },
      "000011000009000050");
    // Write text in address.line1
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(4) > input" },
      "near temple");
    // Write text in address.line2
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(5) > input" },
      "n70-306");
    // Write text in secondary Address
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(6) > input" },
      "vanivihar");
    // Write text in address neighbourhood address
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(7) > input" },
      "rasulgarh");
    // Write text in address reference
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(10) > input" },
      "100");
    // Write text in postal code
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(12) > input" },
      "220564");
    // Write text in address phone
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(16) > input" },
      "7867876788");
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // click on click here to continue button
    clickOnElement(new String[] { XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]" });
    // Select Option from Payment Method Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" },
      "belpay_debit");
    // Write text in cardNumber
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off/\"]" },
      "4100448504907330");
    // Clear Input From Documnet Number TextBox
    clearText(new String[] { CSS, "form#belpay_debit input#docNumber" });
    // Write Text In Document Number Textbox
    typeText(new String[] { CSS, "form#belpay_debit input#docNumber" }, "1234567890");
    // Write text in docNumber
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > div > form > div:nth-of-type(5) > input" },
      "1234567890");
    // Select Option From Month Dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" },
      "11");
    // Select Option from year dropdown
    selectOption(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(2) > select" },
      "2025");
    // Write text in cardholderName
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > div > form > div:nth-of-type(7) > input" },
      "APRO");
    // Write text in securityCode
    typeText(new String[] { CSS,
        "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > div > form > div:nth-of-type(8) > input" },
      "123");
    // click on click here to continue button
    clickOnElement(new String[] { CSS,
      "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > div > form > button" });
    // wait
    waitUntil("CheckEnabledElement", new String[] { CSS, "input#Terms1" }, "10", "disabled");
    // Click on Terms1
    javascriptExecution("document.querySelector(\"input#Terms1\").click();");
    // wait
    waitUntil("CheckEnabledElement", new String[] { XPATH, "//button[text() = ' Finalizar tu compra']" }, "10",
      "disabled");
    // Click on Finalize your purchase button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\"Finalizar tu compra\")]" });
    // Add Assertion for success message
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
    // Scroll To Payment Details Section
    scrollIntoElementView(new String[] { CSS, "div[class=\'col-xs-12 col-sm-12 col-md-5 col-lg-4\']" });
    // Open New Tab
    openNewTab("OpenNewTab");
    pageRefresh();
    // Go To URL
    getURL("https://www.mailinator.com/");
    // Write Text In search bar text field
    typeText(new String[] { XPATH, "//input[@id=\'search\']" }, "ec.esc2.mto.fb@gmail.com");
    // Press Enter Key
    pressKey(new String[] { XPATH, "//input[@id=\'search\']" }, "ENTER");
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "(//tr[@ng-repeat='email in emails'])[1]" }, "120",
      "disabled");
    // click on first email
    clickOnElement(new String[] { XPATH, "(//tr[@ng-repeat=\"email in emails\"])[1]" });

    status = "passed";
  }

  @Test
  public void COCustomizable_PalettePDP__Average_Full_MTOCOneFiveFiveFour() {
    javascriptExecution("lambda-name=COCustomizable PalettePDP  Average Full MTOCOneFiveFiveFour");

    // Clear Cache And Cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/beauty-box-%28paleta-completa%29/p/3_1_202108_co/monicarey");
    // Start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" })) {
      // Validate add to cart button is disabled
      Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
      // Add assertion for X6 Shades of Shadows and / or lips
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" }));
      // Add assertion for X2 Shades of Blush and / or Powders
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[2]" }));
      // Add assertion for X1 Case (Single Paddle Sku)
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[3]" }));
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // Select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // Select second shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(2) > div.selectorContainer > div.checkboxContainer > input" });
      // Select third shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(3) > div.selectorContainer > div.checkboxContainer > input" });
      // Select fourth shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // Select fifth shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" });
      // Select sixth shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" });
      // Validate seventh shade is not clickable
      Assert.assertFalse(isElementDisplayed(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" }));
      // Add assertion for close button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button#cboxClose" }));
      // Click on Apply button
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Assertion on X2 Shades of Blush and / or Powders
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" }));
      // Scroll Down
      scroll("ScrollDown", 200);
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "(//button[@id=\"selectVariable\"])[2]" });
      // Select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // Select  Second Shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // Add Assertion for Third shade is not Clickable
      Assert.assertFalse(isElementDisplayed(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" }));
      // Click on Apply
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Scroll Down
      scroll("ScrollDown", 400);
      // Start if statement
      if (isElementClickable(new String[] { CSS, "button#addToCartVariableSet" })) {
        // Validate add to cart button is clickable
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
        // add assertion for product name
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
        // Add assertion for product Price
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
        // end if
      }
      // Start  else statement
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end  else statement
      }
      // end if
    }
    // Start else statement
    else {
      // Print in result
      printResults("PrintNote", "\" Palette not found\"");
      // End else statement
    }
    // Click On Add To Cart Button
    clickOnElement(new String[] { CSS, "button#addToCartVariableSet" });
    // Click on go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion on remove product option
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[text()=\'Eliminar\'])[2]" }));
    // start if statement  Promotion
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'cartproline\']" })) {
      // Add Assertion For Promotion
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'cartproline\']" }));
      // end if statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Add assertion for discount
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'title\']" }));
    // Validatioon for qty increase button
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0 > button.item__quantity__action_btn.item__quantity__action_plus_btn" }));
    // Click On Go Pay continue
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
    // Start if Statement
    if (checkCurrentUrlContains("checkout")) {
      // Login as Guest User
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
      // credit card details
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
        clickOnElement(
          new String[] { CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']" });
        // endif statement
      }
      // start else statemnet
      else {
        // print in result
        printResults("PrintNote", "\"credit card data is not proper\"");
        // end else
      }
      // End If statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" })) {
      // add assertion for order placed successfully
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // Order Placed
      printResults("PrintNote", "\"order is placed successfully\"");
      // End If Statement
    }
    // Start Else Statement
    else {
      // Result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void Exclusive_Offers_FlowCThreezeroThreezero() {
    javascriptExecution("lambda-name=Exclusive Offers FlowCThreezeroThreezero");

    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // click On close Popup
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Click on  User Icon
    clickOnElement(new String[] { XPATH, "(//a[@class=\'cms-image-link\'])[1]" });
    // Write text in j_username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "test_user_85552041@testuser.com");
    // Write text in j_password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "9907250378Jh");
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    // Add Assertion For Hello Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));
    // Add Assertion for Productos para ...
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h2[text() = \"Productos para ti\"]" }));
    // Click on My Business Section
    clickOnElement(new String[] { XPATH, "//a[@title=\'Mi Negocio\']" });
    // Scroll To Offer can\'t be used with other promotion Section
    scrollIntoElementView(
      new String[] { CSS, "h3[class=\'genericProductCarousel-disclaimer horizontal-slider__description\']" });
    // Click on perfume de hombre nitro
    clickOnElement(new String[] { XPATH, "(//a[text()=\'perfume de hombre nitro\'])[2]" });
    // wait for add to cart button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[contains(text(),'Agregar a la bolsa')]" }, "10",
      "disabled");
    // Click on Add To Cart Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click On close Popup
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'promo\']" })) {
      // Add Assertion For Discount Cuopon
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'promo\']" }));
      // Add Assertion For Discount  Amount
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'col-xs-6 cart-totals-right text-right discount\']" }));
      // end if statement
    }
    // Start Else Statement
    else {
      // print Result
      printResults("PrintNote", "\"promo message is not present\"");
      // End else statement
    }

    status = "passed";
  }

  @Test
  public void Creation_of_spinner_by_clicking_on_the_add_to_cart_Set_Variables_and_Palette___CThreezeroFiveNineCThreezeroSixFour() {
    javascriptExecution(
      "lambda-name=Creation of spinner by clicking on the add to cart Set Variables and Palette   CThreezeroFiveNineCThreezeroSixFour");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL to check different variable sets spinner
    getURL("https://bic-esika.tiendabelcorp.com/pe/slug/p/3_14473_202109_pe/adripe");
    // start if statement for choose tone
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Add assertion for choose shade
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }));
      // click on  \"x1 Scented Lotion Images \" choose shade
      clickOnElement(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" });
      // choose the tone
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // click on \"x1 Mini Pictures\" choose tone button
      clickOnElement(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" });
      // choose the tone
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // click on \"add to cart\" button
      // if condition for \"add to cart\" present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // if condition for \"add to cart\" clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
          // click on \"add to cart\" button
          clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
          // wait until
          waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5",
            "disabled");
          // end if for \"add to cart\" clickable
        }
        // Else statement \"add to cart\" clickable
        else {
          // Print message not clickable
          printResults("PrintNote", "add to cart is not clickable");
          // end else \"add to cart\" clickable
        }
        // end if for  \"add to cart\" present
      }
      // else statement   \"add to cart\" present
      else {
        // print message
        printResults("PrintNote", "add to cart is not present");
        // end else statement  \"add to cart\" present
      }
      // end if statement
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // click on \"SET PURE RED\"
    getURL("https://bic-lbel.tiendabelcorp.com/pe/set-pure-red/p/3_17102_202109_pe/adripe");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // click on \"x1 LB LL DUO HIDRA- MAT PURE RED\" choose shade button
      clickOnElement(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" });
      // choose the tone
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // click on \"add to cart\" button
      // if condition for \"add to cart\" present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // if condition for \"add to cart\" clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
          // click on \"add to cart\" button
          clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
          // wait until
          waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5",
            "disabled");
          // end if for \"add to cart\" clickable
        }
        // Else statement \"add to cart\" clickable
        else {
          // Print message not clickable
          printResults("PrintNote", "add to cart is not clickable");
          // end else \"add to cart\" clickable
        }
        // end if for  \"add to cart\" present
      }
      // else statement   \"add to cart\" present
      else {
        // print message
        printResults("PrintNote", "add to cart is not present");
        // end else statement  \"add to cart\" present
      }
      // end if statement
    }
    // click on cyzone variable sets product
    getURL("https://bic-cyzone.tiendabelcorp.com/pe/cz-taste-cool-col-200-ml/p/3_20113_202109_pe/adripe");
    // start if statment
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // Add assertion for choose shade
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }));
      // click on \"x1 CZ TASTE COOL COL 200 ML\" choose shades button
      clickOnElement(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" });
      // choose the tone
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // click on \"add to cart\" button
      // if condition for \"add to cart\" present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // if condition for \"add to cart\" clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
          // click on \"add to cart\" button
          clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
          // wait until
          waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5",
            "disabled");
          // end if for \"add to cart\" clickable
        }
        // Else statement \"add to cart\" clickable
        else {
          // Print message not clickable
          printResults("PrintNote", "add to cart is not clickable");
          // end else \"add to cart\" clickable
        }
        // end if for  \"add to cart\" present
      }
      // else statement   \"add to cart\" present
      else {
        // print message
        printResults("PrintNote", "add to cart is not present");
        // end else statement  \"add to cart\" present
      }
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"choose tone button not enabled\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void MX_Paleta_Customizable_PDP_Media_complete_MTO__COneFiveFiveThree() {
    javascriptExecution("lambda-name=MX Paleta Customizable PDP Media complete MTO  COneFiveFiveThree");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/beauty-box-%28paleta-de-3-refills%29/p/3_1000001_202108_mx/mx202108");
    // Validate \"Shades of Shadows and / or lips\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'product-variant-container\']" }));
    // validate \"Shades of Blush and / or Powders\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[2]" }));
    // validate \"Single Paddle Sku\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[3]" }));
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
      // Validate that the add to cart button is disabled
      Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
      // end if add to cart present
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"add to cart button is disabled\"");
      // end else statement
    }
    // validate \"The price to be displayed is the price of the full pallet  \"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'title-product-down down-bar-title\']" }));
    // Validate \"Product image\"
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "img[class=\"lazy loaded\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/210094759-FotoFondoBlanco.jpg\"]" }));
    // Validate \"Product name\"
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//div[@class=\'col-sm-6 product-details-col\']/div/child::h1[@class=\'name\']" }));
    // Validate \"Product content\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
    // Add assertion for choose shade
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" }));
    // click on choose shade
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // select first shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // Add assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
    // slect second shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // start if for can\'t choose more than two
    if (!isElementClickable(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(3) > div:nth-of-type(3) > div:nth-of-type(1) > input" })) {
      // Print message
      printResults("PrintNote", "you can not choose more than two");
      // end if
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"appropriate message is not displaying\"");
      // end else statement
    }
    // Add assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
    // Add assertion for apply button enabled
    Assert.assertTrue(isElementClickable(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" }));
    // click on apply button
    clickOnElement(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
    // Add to cart button is still disabled
    Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // Add assertion for choose shade
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div:nth-child(3) > div.bundleVariantDataContainer > div.product-select-variant-button.variantSelectorButtonContainer.bundleProductOptionButton > button#selectVariable" }));
    // click on choose shade
    javascriptExecution(
      "document.querySelector(\"div:nth-child(3) > div.bundleVariantDataContainer > div.product-select-variant-button.variantSelectorButtonContainer.bundleProductOptionButton > button#selectVariable\").click();");
    // choose first shade
    clickOnElement(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
    // if Add assertion can\'t choose more than one
    if (!isElementClickable(new String[] { CSS,
      "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" })) {
      // Print message can\'t choose more than one
      printResults("PrintNote", "you  can\'t choose more than one");
      // end if
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"appropriate message is not displaying\"");
      // end else statement
    }
    // Add assertion for message change
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
    // click on apply button
    clickOnElement(
      new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
    // now add to cart is enabled
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
    // click on add to cart button
    // if condition for \"add to cart\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
      // if condition for \"add to cart\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // click on \"add to cart\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
        // wait until
        waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5", "disabled");
        // end if for \"add to cart\" clickable
      }
      // Else statement \"add to cart\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "add to cart is not clickable");
        // end else \"add to cart\" clickable
      }
      // end if for  \"add to cart\" present
    }
    // else statement   \"add to cart\" present
    else {
      // print message
      printResults("PrintNote", "add to cart is not present");
      // end else statement  \"add to cart\" present
    }
    // verify add to cart pop up
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'add-to-cart add-to-cart-cross\']" },
      "logs/Screenshots/PHNELA.png");
    // click on go pay button
    // if condition for \"go pay\" present
    if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
    else {
      // print message
      printResults("PrintNote", "go pay is not present");
      // end else statement  \"go pay\" present
    }
    // verify added quantity can\'t be modified
    Assert.assertFalse(isElementClickable(
      new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }));
    // validate delete link available
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a" }));
    // Validate discount coupon available
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@name=\'voucherCode\']" }));
    // click on go pay button
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
    // Login as guest user
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
    // Fill the details for shipping address
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
    // Enter credit cards details
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

    status = "passed";
  }

  @Test
  public void MX__Customizable_Palette__PDP_Average_Complete_ECOM___COneFiveSixOne() {
    javascriptExecution("lambda-name=MX  Customizable Palette  PDP Average Complete ECOM   COneFiveSixOne");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/beauty-box-%28paleta-de-3-refills%29/p/3_1000010_ecomm_mx");
    // if product shade present
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[1]" })) {
      // Add assertion for \"x2 Esika PRO Shadows and / or HD Velvet Lipstick\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[1]" }));
      // Add assertion for \"x1 Blur Evolution Powder and / or HD Blush\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[2]" }));
      // Add assertion for \" x1 Empty Beauty Box (Customizable Palette)\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[3]" }));
      // if for add to cart visible
      if (isDisplayed(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }, 0)) {
        // if for add to cart disable
        if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
          // Add assertion \"add to cart\" disabled
          Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
          // end if add to cart disable
        }
        // Start else statment
        else {
          // Print
          printResults("PrintNote", "Element is not present");
          // end else statment
        }
        // end if add to cart visible
      }
      // Start else statment
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end else statment
      }
      // Add assertion \" price to be displayed is the price of the full pallet  \"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
      // Add assertion product name
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
      // Add assertion product image
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "img[class=\"lazy loaded\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/210094759-FotoFondoBlanco.jpg\"]" }));
      // Add assertion product content
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
      // click on choose shade
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // Click on first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // Add Assertion for message change
      Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
      // Click on second shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // Add Assertion for message change
      Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
      // Add Assertion for apply button
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" }));
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // click on choose shade
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tono\"]" });
      // Click on first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // if add to cart button present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
        // if add to cart clickable
        if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
          // Click on add to cart button
          clickOnElement(new String[] { ID, "addToCartVariableSet" });
          // End if
        }
        // Start else
        else {
          // End Else
        }
        // End if
      }
      // Start else
      else {
        // End Else
      }
      // if \"go pay\" is present
      if (isElementAvailable(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" })) {
        // click on go pay button
        clickOnElement(new String[] { CSS,
          "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
        // Add Assertion for fixed quantity
        Assert.assertTrue(isElementAvailable(
          new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }));
        // Add assertion for coupon
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@name=\'voucherCode\']" }));
        // click on cart go pay button
        clickOnElement(new String[] { CSS,
          "div#StickySidebar > div > div:nth-of-type(7) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
        // end if
      }
      // Start else statment
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end else statment
      }
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
      // swshipping address details
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
      if (isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" })) {
        // Add Assertion for order confirmation
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
        // end if go pay present
      }
      // start else statment for go pay
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end else statment
      }
      // End if for product shade
    }
    // Start else
    else {
      // Print
      printResults("PrintNote", "Product is not avaialable");
      // End else
    }

    status = "passed";
  }

  @Test
  public void CO__Customizable_Palette_PDP_Average_full_MTOCOneFiveFourNine() {
    javascriptExecution("lambda-name=CO  Customizable Palette PDP Average full MTOCOneFiveFourNine");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/beauty-box-%28paleta-completa%29/p/3_1_202108_co/monicarey");
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div.col-sm-6.product-details-col" })) {
      // add assertion for add to cart button
      Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
      // Add assertion for X6 Shades of Shadows and / or lips
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" }));
      // add assertion for X2 Shades of Blush and / or Powders
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[2]" }));
      // add assertion for X1 Case (Single Paddle Sku)
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[3]" }));
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // select second shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(2) > div.selectorContainer > div.checkboxContainer > input" });
      // select third shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(3) > div.selectorContainer > div.checkboxContainer > input" });
      // select 4th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // select 5th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" });
      // select 6th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" });
      // start if statement
      if (!isElementClickable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(7) > div.selectorContainer > div.checkboxContainer > input" })) {
        // print in result
        printResults("PrintNote", "\"7th color is not clickble after clicking 6 colors\"");
        // end if statement
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"7th color is clickable after clicking 6th color\"");
        // end else statement
      }
      // add assertion for + button
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.upAmount" }));
      // add assertion for - button
      Assert.assertTrue(isElementClickable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.downAmount" }));
      // add assertion for X close button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button#cboxClose" }));
      // Click on Apply button
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Assertion on X2 Shades of Blush and / or Powders
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" }));
      // take a snip of  X2 Shades of Blush and / or Powders
      takeScreenshotOfParticularElement(
        new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" },
        "logs/Screenshots/YZavpx.png");
      // Scroll Down
      scroll("ScrollDown", 200);
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "(//button[@id=\"selectVariable\"])[2]" });
      // select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // select 4th shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // start if statement
      if (!isElementClickable(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" })) {
        // print in result
        printResults("PrintNote", "\"3rd color is not clickable after selecting 2 colors\"");
        // end if statement
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"3rd color is clickable after 2nd color\"");
        // end else statement
      }
      // Click on Apply
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Scroll Down
      scroll("ScrollDown", 400);
      // start if statement
      if (isElementClickable(new String[] { CSS, "button#addToCartVariableSet" })) {
        // add assertion for add to cart button
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
        // add assertion for product name
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
        // add assertion for active price
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
        // click on add to cart button
        clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartVariableSet\"]" });
        // end if
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"element is not clickable\"");
        // end else statement
      }
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"Customizable Palette not found\"");
      // end else statement
    }
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='addToCartLayer']" }, "30", "disabled");
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//p[@class=\"titleBar\"]" }, 0)) {
      // Add Assertion for product name
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//a[@class=\"name\"]" }));
      // add assertion for product price
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
      // click on go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // End if
    }
    // start else
    else {
      // print in results
      printResults("PrintNote", "\"go pay button popup not found\"");
      // end else statement
    }
    // start if statement
    if (checkCurrentUrlContains("cart")) {
      // add assertion for qty increase button
      Assert.assertFalse(isElementClickable(new String[] { CSS,
        "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0 > button.item__quantity__action_btn.item__quantity__action_plus_btn" }));
      // add assertion for remove link
      Assert.assertTrue(isElementClickable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
      // write text in coupon text field
      typeText(new String[] { CSS, "input#js-voucher-code-text" }, "AHORAONUNCA");
      // click on apply coupon button
      clickOnElement(new String[] { CSS, "button#js-voucher-apply-btn" });
      // start if statementfor coupon
      if (isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" })) {
        // ADD ASSERTION FOR COUPON apply message
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" }));
        // end if statement
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"coupon is not present\"");
        // end else statement
      }
      // click on go pay button
      clickOnElement(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
      // end if statement
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"error in cart page\"");
      // end else
    }
    // start if statement
    if (checkCurrentUrlContains("checkout")) {
      // checkout scenario for CO
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
      // end if statement
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"user is not in checkout page\"");
      // end else statement
    }
    // colombia credit card details
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
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }, 0)) {
      // add assertion for order placed successfully
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
      // print in result
      printResults("PrintNote", "\"order placed successfully\"");
      // end if
    }
    // start else statement
    else {
      // add assertion for Sorry, we are unable to process your payment at this time, please try again later or choose another payment method
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "div.payuForm > div.mpago-error.alert.alert-danger.alert-dismissible" }));
      // print in result
      printResults("PrintNote",
        "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Ec_Verify_NoEcomm_Footer__CThreezeroOneNine() {
    javascriptExecution("lambda-name=Ec Verify NoEcomm Footer  CThreezeroOneNine");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/");
    // Display the No-Ecomm Home Page
    takeScreenshot("logs/Screenshoots/DqgnTI.png");
    // scroll down till footer
    scroll("ScrollDown", 8500);
    // scroll down
    scroll("ScrollBottom");
    // Go to Footer Legal Documents
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'legal\')]" }));
    // if condition for legal document
    if (isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Términos y condiciones\')])[2]" })) {
      // verify \"Terms and Conditions\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Términos y condiciones\')])[2]" }));
      // verify \"Privacy Policy\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Política de privacidad\')])[2]" }));
      // verify \"Conditions of Web Use\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Condiciones de uso web\')])[2]" }));
      // verify \"Arco Rights Procedure\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Derechos ARCO\')])[2]" }));
      // Verify authorization to send advertising
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "(//a[contains(text(),\'Autorización para el envío de publicidad\')])[2]" }));
      // verify \"Promotion dates Catalog\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Fechas de promociones Catálogo\')])[2]" }));
      // verify \"I do not test on animals\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'No testeo en animales\')])[2]" }));
      // end if condition for lega document
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Go to Footer Our Brands
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'footer-link-title\']" }));
    // if condition for our brands
    if (isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicbrandesikalink\'])[2]" })) {
      // verify esika footer link
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicbrandesikalink\'])[2]" }));
      // verify lbel footer link
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicbrandlbellink\'])[2]" }));
      // verify cyzone footer link
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicbrandcyzonelink\'])[2]" }));
      // end if condition for our brand
    }
    // strt else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Go to Footer Contact us
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'contáctanos\')]" }));
    // if condition contact us
    if (isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Cómo comprar\')])[2]" })) {
      // Verify how to buy
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Cómo comprar\')])[2]" }));
      // Verify frequent questions
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Preguntas frecuentes\')])[2]" }));
      // Verify write to us
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Escríbenos\')])[2]" }));
      // Verify i want to be consultant
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[contains(text(),\'Quiero ser consultora\')])[4]" }));
      // end if contact us
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // if condition for social networking
    if (isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" })) {
      // verify Social Networks Esika facebook
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify  Social Networks Esika instagram
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify  Social Networks Esika youtube
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // end if for social networking
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Go to footer Social Networks L\'bel
    getURL("https://s1-lbel.tiendabelcorp.com/ec/");
    // scroll down till footer
    scroll("ScrollDown", 9999);
    // scroll down
    scroll("ScrollBottom");
    // if conditon for lbel social network
    if (isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" })) {
      // verify Social Networks lbel facebook
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify Social Networks lbel instagram
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify Social Networks lbel youtube
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify Social Networks lbel twiter
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // end if condition for lbel social network
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // Go to footer Social Networks Cyzone
    getURL("https://s1-cyzone.tiendabelcorp.com/ec/");
    // scroll down till footer
    scroll("ScrollDown", 7500);
    // if condition for cyzone social networking
    if (isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" })) {
      // verify Social Networks cyzone facebook
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify Social Networks cyzone instagram
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify Social Networks cyzone tik tok
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // verify Social Networks cyzone twiter
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//ul[@class=\'bic-social-networks__list\']" }));
      // end if condition for cyzone social networking
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }
    // verify footer Digital catalogs
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'catálogos\')]" }));
    // if condition for digital catalogs
    if (isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicseeesikacataloglink\'])[2]" })) {
      // verify digital catalogs for esika
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicseeesikacataloglink\'])[2]" }));
      // verify digital catalogs for lbel
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicseelbelcataloglink\'])[2]" }));
      // verify digital catalogs for cyzone
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-foo-bicseecyzonecataloglink\'])[2]" }));
      // if condition for digital catalogs
    }
    // start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void PE_Customizable_PalettePDP_Full_Palette_ECOMCOneFiveFiveFive() {
    javascriptExecution("lambda-name=PE Customizable PalettePDP Full Palette ECOMCOneFiveFiveFive");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/beauty-box-%28paleta-completa%29/p/3_3_ecomm_pe");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\"addToCartVariableSet\"]" })) {
      // start if statement
      if (isElementAvailable(new String[] { CSS, "div.col-sm-6.product-details-col" })) {
        // add assertion for add to cart button
        Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
        // Add assertion for X6 Shades of Shadows and / or lips
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" }));
        // add assertion for X2 Shades of Blush and / or Powders
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[2]" }));
        // add assertion for X1 Case (Single Paddle Sku)
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[3]" }));
        // Click on Choose shades
        clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
        // select first shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
        // select second shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(2) > div.selectorContainer > div.checkboxContainer > input" });
        // select third shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(3) > div.selectorContainer > div.checkboxContainer > input" });
        // select 4th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
        // select 5th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" });
        // select 6th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" });
        // start if statement
        if (!isElementClickable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(7) > div.selectorContainer > div.checkboxContainer > input" })) {
          // print in result
          printResults("PrintNote", "\"7th color is not clickble after clicking 6 colors\"");
          // end if statement
        }
        // add assertion for + button
        Assert.assertTrue(isElementAvailable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.upAmount" }));
        // add assertion for - button
        Assert.assertTrue(isElementClickable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.inputContainer > button.downAmount" }));
        // add assertion for X close button
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button#cboxClose" }));
        // Click on Apply button
        clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
        // Assertion on X2 Shades of Blush and / or Powders
        Assert.assertTrue(isElementAvailable(
          new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" }));
        // take a snip of  X2 Shades of Blush and / or Powders
        takeScreenshotOfParticularElement(
          new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" },
          "logs/Screenshots/QrMIZd.png");
        // Scroll Down
        scroll("ScrollDown", 200);
        // Click on Choose shades
        clickOnElement(new String[] { XPATH, "(//button[@id=\"selectVariable\"])[2]" });
        // select first shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
        // select 4th shade
        clickOnElement(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
        // start if statement
        if (!isElementClickable(new String[] { CSS,
          "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" })) {
          // print in result
          printResults("PrintNote", "\"3rd color is not clickable after selecting 2 colors\"");
          // end if statement
        }
        // Click on Apply
        clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
        // Scroll Down
        scroll("ScrollDown", 400);
        // start if statement
        if (isElementClickable(new String[] { CSS, "button#addToCartVariableSet" })) {
          // add assertion for add to cart button
          Assert.assertTrue(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
          // add assertion for product name
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
          // add assertion for active price
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
          // click on add to cart button
          clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartVariableSet\"]" });
          // end if
        }
        // end if
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote", "\"Customizable Palette not found\"");
        // end else statement
      }
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='addToCartLayer']" }, "30", "disabled");
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//p[@class=\"titleBar\"]" }, 0)) {
        // Add Assertion for product name
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//a[@class=\"name\"]" }));
        // add assertion for product price
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
        // click on go pay button
        // explicit wait for Go Pay Button
        waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
          "disabled");
        // Click on go pay
        clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
        // End if
      }
      // start else
      else {
        // print in results
        printResults("PrintNote", "\"go pay button popup not found\"");
        // end else statement
      }
      // start if statement
      if (checkCurrentUrlContains("cart")) {
        // add assertion for qty increase button
        Assert.assertFalse(isElementClickable(new String[] { CSS,
          "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0 > button.item__quantity__action_btn.item__quantity__action_plus_btn" }));
        // add assertion for remove link
        Assert.assertTrue(isElementClickable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a" }));
        // write text in coupon text field
        typeText(new String[] { CSS, "input#js-voucher-code-text" }, "DESCUENTO");
        // click on apply coupon button
        clickOnElement(new String[] { CSS, "button#js-voucher-apply-btn" });
        // start if statement for gift message
        if (isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" })) {
          // ADD ASSERTION FOR COUPON apply message
          Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span" }));
          // end if statement for gift message
        }
        // click on go pay button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
        // end if statement
      }
      // start else
      else {
        // print in result
        printResults("PrintNote", "\"error in cart page\"");
        // end else
      }
      // start if statement
      if (checkCurrentUrlContains("checkout")) {
        // checkout scenario for peru guest user login
        // Write text in guest first Name
        typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" },
          "photon ");
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
        // peru shipping address details
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
        waitUntil("CheckClickableElement", new String[] { CSS, "button[type='submit'][form='belcorpAddressForm']" },
          "10", "disabled");
        // Click on Continue Button
        clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });
        // peru credit card details
        // wait
        waitUntil("CheckVisibleElement",
          new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" }, "10", "disabled");
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
        // end if statement
      }
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }, 0)) {
        // add assertion for order placed successfully
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]" }));
        // print in result
        printResults("PrintNote", "\"order placed successfully\"");
        // end if
      }
      // start else statement
      else {
        // print in result
        printResults("PrintNote",
          "\"Sorry, we are unable to process your payment at this time, please try again later or choose another payment method\"");
        // end else statement
      }
      // end if
    }
    // start else statemnet
    else {
      // print
      printResults("PrintNote", "\"out of stock product\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Customizable_Palette_PDP_Full_Palette_MTO__COneFiveFourSeven() {
    javascriptExecution("lambda-name=Customizable Palette PDP Full Palette MTO  COneFiveFourSeven");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/beauty-box-%28paleta-completa%29/p/3_1_202108_cl/pruebaqas222");
    // if shades are present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product-variant-container\']" })) {
      // Validate \"Shades of Shadows and / or lips\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'product-variant-container\']" }));
      // validate \"Shades of Blush and / or Powders\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[2]" }));
      // validate \"Single Paddle Sku\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'product-variant-container\'])[3]" }));
      // Validate product name
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
      // Validate product content
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
      // Validate add to cart button is disabled
      Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" }));
      // Validate  price of the full pallet
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
      // if choose shade present
      if (isElementAvailable(new String[] { XPATH, "//button[contains(@class,\'variantSelectorButton\')]" })) {
        // if choose shade clickable
        if (isElementClickable(new String[] { XPATH, "//button[contains(@class,\'variantSelectorButton\')]" })) {
          // click on choose shade of \" HD Velvet Lipstick and / or Esika PRO Eyeshadow \"
          clickOnElement(new String[] { XPATH, "//button[contains(@class,\'variantSelectorButton\')]" });
          // choose shade1
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // choose shade2
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // choose shade3
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(3) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // choose shade4
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(4) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // choose shade5
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(5) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // Add assertion for message change
          Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
          // choose shade6
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(6) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // Display message can\'t choose shade
          printResults("PrintNote", "You can\'t choose more than six shade");
          // Validate apply button enabled
          Assert.assertTrue(isElementClickable(
            new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" }));
          // click on apply button
          clickOnElement(
            new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
          // click on choose shade of \"HD Blush and / or Blur Evolution Powder\"
          javascriptExecution(
            "document.querySelector(\"div:nth-child(3) > div.bundleVariantDataContainer > div.product-select-variant-button.variantSelectorButtonContainer.bundleProductOptionButton > button#selectVariable\").click();");
          // choose shdae1
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // Add assertion for message change
          Assert.assertTrue(isElementAvailable(new String[] { ID, "cboxTitle" }));
          // choose shdae2
          clickOnElement(new String[] { CSS,
            "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
          // Display message can\'t choose more shade
          printResults("PrintNote", "can\'t choose more two shade");
          // Validate apply button enabled
          Assert.assertTrue(isElementClickable(
            new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" }));
          // click on apply button
          clickOnElement(
            new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
          // click on \"add to cart\" button
          // if condition for \"add to cart\" present
          if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
            // if condition for \"add to cart\" clickable
            if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" })) {
              // click on \"add to cart\" button
              clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartVariableSet\']" });
              // wait until
              waitUntil("CheckVisibleElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "5",
                "disabled");
              // end if for \"add to cart\" clickable
            }
            // Else statement \"add to cart\" clickable
            else {
              // Print message not clickable
              printResults("PrintNote", "add to cart is not clickable");
              // end else \"add to cart\" clickable
            }
            // end if for  \"add to cart\" present
          }
          // else statement   \"add to cart\" present
          else {
            // print message
            printResults("PrintNote", "add to cart is not present");
            // end else statement  \"add to cart\" present
          }
          // click on \"go pay\" button
          // if condition for \"go pay\" present
          if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" })) {
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
          else {
            // print message
            printResults("PrintNote", "go pay is not present");
            // end else statement  \"go pay\" present
          }
          // verify added quantity can\'t be modified
          Assert.assertTrue(isElementAvailable(
            new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)" }));
          // validate delete link available
          Assert.assertTrue(isElementAvailable(new String[] { CSS,
            "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a" }));
          // Validate discount coupon available
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@name=\'voucherCode\']" }));
          // click on cart go pay button
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
          // click on login as registered user
          // if email
          if (isElementAvailable(new String[] { XPATH, "//input[@id=\'j_username\']" })) {
            // write text in email
            typeText(new String[] { XPATH, "//input[@id=\'j_username\']" },
              "belcorpregisteredtestuser@endtest-mail.io");
            // Write text in password
            typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "PhotonTest@9876543210");
            // click on login
            clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
            // end if email
          }
          // else email
          else {
            // print message
            printResults("PrintNote", "login page is not available");
            // end else email
          }
          // if region visible
          if (isDisplayed(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, 0)) {
            // Select region
            selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "ANTOFAGASTA (II)");
            // Select commune
            selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "ANTOFAGASTA");
            // Select location
            selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "ANTOFAGASTA");
            // Write street number
            typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "10");
            // Write text in phone number
            typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "9876543210");
            // Click on pay button
            clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
            // Select document type
            selectOption(new String[] { XPATH, "//select[@id=\'docTypeRegister\']" }, "Otro");
            // Write document number
            typeText(new String[] { XPATH, "//input[@id=\'docNumberRegister\']" }, "12345678");
            // Click on continue button
            clickOnElement(new String[] { XPATH, "//button[@id=\'continueBtn\']" });
            // Proceed to checkout bu using credit card
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
              clickOnElement(
                new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']" });
              // end if
            }
            // start else statement
            else {
              // Print Result
              printResults("PrintNote", "\"credit card section is not present\"");
              // End else statement
            }
            // end if region visible
          }
          // end if choose shade clickable
        }
        // else choose shade clickable
        else {
          // print message
        }
        // End if
      }
      // Start else
      else {
        // print message
        printResults("PrintNote", "not clickable");
        // end else shade clickable
      }
      // end if choose shade present
    }
    // else shade present
    else {
      // print message
      printResults("PrintNote", "choose shade is not present");
      // end else shade present
    }

    status = "passed";
  }

  @Test
  public void CO__Customizable_Palette_PDP_Full_Palette_ECOMCOneFiveFiveEight() {
    javascriptExecution("lambda-name=CO  Customizable Palette PDP Full Palette ECOMCOneFiveFiveEight");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/p/3_4_ecomm_co");
    // Assertion on add to cart is disabled
    Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
    // Add Assertion for \"price to be displayed is the price of the full pallet  \"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']" }));
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Add Assertion for product image
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "img[class=\"lazy loaded\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/210094759-FotoFondoBlanco.jpg\"]" }));
    // Add assertion for content
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'content-text bundle-content-text-esika\']" }));
    // Click on Choose shades
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // select first shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[31]" });
    // select second shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[32]" });
    // Click on Apply
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block\"])[6]" });
    // Assertion on 2 shades selected
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[contains(text(),\'x2\')]" }));
    // Scroll Down
    scroll("ScrollDown", 200);
    // Click on Choose shades
    clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
    // select  1st shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[53]" });
    // select  2nd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[54]" });
    // select  3rd shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[55]" });
    // select 4th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[56]" });
    // select 5th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[57]" });
    // select 6th shade
    clickOnElement(new String[] { XPATH, "(//input[@class=\"checkbox checkboxModalCustom\"])[58]" });
    // Click on Apply
    clickOnElement(new String[] { XPATH, "(//button[@class=\"btn btn-block\"])[6]" });
    // Assertion on 6 shades selected
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[contains(text(),\' x6\')]" }));
    // Scroll Down
    scroll("ScrollDown", 400);
    // Click on Add to cart
    clickOnElement(new String[] { CSS, "button#addToCartVariableSet" });
    // wait
    waitForTime(10);
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]" });
    // start if statement for promotion received
    if (isElementAvailable(new String[] { XPATH, "//div[text()=\' Promociones Recibidas\']" })) {
      // Assertion on promotions  received
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\' Promociones Recibidas\']" }));
      // end if statement
    }
    // Start  else statement
    else {
      // Print
      printResults("PrintNote", "Element is not present");
      // end  else statement
    }
    // Assertion on price
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//div[@class=\"item__price\"])[2]" }));
    // Assertion on remove product option
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "(//a[text()=\'Eliminar\'])[2]" }));
    // Click on go pay
    clickOnElement(new String[] { CSS,
      "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
    // guest user login colombia
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
    // credit card details
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

    status = "passed";
  }

  @Test
  public void Recommended_Flow_SetsCThreezeroThreeFive() {
    javascriptExecution("lambda-name=Recommended Flow SetsCThreezeroThreeFive");

    // Clear Cache
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
    // Click on  User Icon
    clickOnElement(new String[] { XPATH, "(//a[@class=\'cms-image-link\'])[1]" });
    // Write text in j_username
    typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "clientestcl@mailinator.com");
    // Write text in j_password
    typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Test1234!");
    // Click on Iniciar sesión
    clickOnElement(new String[] { XPATH, "//button[contains(text() ,\"Iniciar sesión\")]" });
    // Add Assertion For Hello Consultant Name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));
    // Add Assertion for Productos para ...
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h2[text() = \"Productos para ti\"]" }));
    // Click on My Business Section
    clickOnElement(new String[] { XPATH, "//a[@title=\'Mi Negocio\']" });
    // scroll to bottom
    scroll("ScrollBottom");
    // start if statement for recomended sets
    if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Sets recomendados\')]" })) {
      // take a screen shot to verify the  all the bundles
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@name=\"myBusinessSection4\"]" },
        "logs/Screenshots/BexIzt.png");
      // validate see more button
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "div#myBusinessSection4 div:nth-child(5) > div > div > div > div.recommendedSetsCarousel-pdp-footer > a" }));
      // take a screen shot to validate more than 6 bundles are present
      takeScreenshot("logs/Screenshoots/DrBTNK.png");
      // end if statement
    }
    // start else statemnet
    else {
      // print in result
      printResults("PrintNote", "\"sets recomendation is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void MXCustomizable_PalettePDP_Full_Palette_MTOCOneFiveFourEight() {
    javascriptExecution("lambda-name=MXCustomizable PalettePDP Full Palette MTOCOneFiveFourEight");

    // Clear Cache And Cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/beauty-box-%28paleta-completa%29/p/3_1_202108_mx/mx202108");
    // Start if statement
    if (isElementAvailable(new String[] { CSS, "div.col-sm-6.product-details-col" })) {
      // Add assertion for add to cart button
      Assert.assertFalse(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
      // Add assertion for X6 Shades of Shadows and / or lips
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[1]" }));
      // Add assertion for X2 Shades of Blush and / or Powders
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"product-variant-container\"])[2]" }));
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "//button[text() = \"Elegir tonos\"]" });
      // select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // select second shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(2) > div.selectorContainer > div.checkboxContainer > input" });
      // select third shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(3) > div.selectorContainer > div.checkboxContainer > input" });
      // select fourth shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // select fifth shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(5) > div.selectorContainer > div.checkboxContainer > input" });
      // select sixth shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" });
      // Validate seventh shade is not clickable
      Assert.assertFalse(isElementDisplayed(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(6) > div.selectorContainer > div.checkboxContainer > input" }));
      // Add assertion for close button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button#cboxClose" }));
      // Click on Apply button
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Assertion on X2 Shades of Blush and / or Powders
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" }));
      // Take a snip of  X2 Shades of Blush and / or Powders
      takeScreenshotOfParticularElement(
        new String[] { CSS, "div.products-variant-section.bundle-components > div:nth-child(3)" },
        "logs/Screenshots/hTksWf.png");
      // Scroll Down
      scroll("ScrollDown", 200);
      // Click on Choose shades
      clickOnElement(new String[] { XPATH, "(//button[@id=\"selectVariable\"])[2]" });
      // Select first shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input" });
      // Select second  shade
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" });
      // Add Assertion for Third shade is not Clickable
      Assert.assertFalse(isElementDisplayed(new String[] { CSS,
        "div#cboxLoadedContent div:nth-child(4) > div.selectorContainer > div.checkboxContainer > input" }));
      // Click on Apply
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton" });
      // Scroll Down
      scroll("ScrollDown", 400);
      // Start if statement
      if (isElementClickable(new String[] { CSS, "button#addToCartVariableSet" })) {
        // Add assertion for add to cart button
        Assert.assertTrue(isElementClickable(new String[] { CSS, "button#addToCartVariableSet" }));
        // Add assertion for product name
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]" }));
        // Add assertion for product Price
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]" }));
        // end if
      }
      // Start else statment
      else {
        // Print
        printResults("PrintNote", "Element is not present");
        // end else statment
      }
      // end if
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\" Palette not found\"");
      // end else statement
    }
    // Click On Add To Cart
    clickOnElement(new String[] { CSS, "button#addToCartVariableSet" });
    // Click on Go pay
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Add Assertion on remove product option
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[text()=\'Eliminar\'])[2]" }));
    // Add assertion for discount
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'title\']" }));
    // Validatioon for qty increase button
    Assert.assertTrue(isElementAvailable(new String[] { CSS,
      "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0 > button.item__quantity__action_btn.item__quantity__action_plus_btn" }));
    // Click On Go Pay continue
    clickOnElement(new String[] { XPATH,
      "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']" });
    // Login as Guest User
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
    // Shipping address details
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
    // Credit Cart Details
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
    // click on continue  button
    // if condition for \" click here to continue button\" present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
      // if condition for \" click here to continue button\" clickable
      if (isElementClickable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" })) {
        // click on \" click here to continue button\" button
        clickOnElement(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']" });
        // end if for \" click here to continue button\" clickable
      }
      // Else statement \" click here to continue button\" clickable
      else {
        // Print message not clickable
        printResults("PrintNote", "click here to continue button is not clickable");
        // end else \" click here to continue button\" clickable
      }
      // end if for  \" click here to continue button\" present
    }
    // else statement   \" click here to continue button\" present
    else {
      // print message
      printResults("PrintNote", "click here to continue button is not present");
      // end else statement  \" click here to continue button\" present
    }

    status = "passed";
  }

  @Test
  public void Verify_My_personal_dataCThreezeroTwozero() {
    javascriptExecution("lambda-name=Verify My personal dataCThreezeroTwozero");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
    // Click on Login Symbol
    clickOnElement(new String[] { XPATH, "//a[@class=\'cms-image-link\']/child::img" });
    // Write text in username
    typeText(new String[] { NAME, "j_username" }, "sairam@endtest-mail.io");
    // Write text in password
    typeText(new String[] { NAME, "j_password" }, "Testing@79810");
    // Click on Login Button
    clickOnElement(new String[] { XPATH, "//button[contains(text() ,\"Iniciar sesión\")]" });
    // Explicit wait for Login with your Account
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='onlyPageLogin register smalltitle']" }, "10",
      "disabled");
    // Login with your Account is Visible
    if (isDisplayed(new String[] { XPATH, "//div[@class=\'onlyPageLogin register smalltitle\']" }, 0)) {
      // Print in Console
      printResults("PrintNote", "\"It is not redirecting to Home Page\"");
      // End of If Loop
    }
    // Else Statement
    else {
      // Explicit wait for Login Symbol
      waitUntil("CheckVisibleElement",
        new String[] { XPATH, "(//ul[@class='nav__links nav__links--account']/child::li)[3]" }, "10", "disabled");
      // Login Symbol is Visible
      if (isDisplayed(new String[] { XPATH, "(//ul[@class=\'nav__links nav__links--account\']/child::li)[3]" }, 0)) {
        // Click on again Login Symbol
        clickOnElement(new String[] { XPATH, "(//ul[@class=\'nav__links nav__links--account\']/child::li)[3]" });
        // Click on My Personal Information
        clickOnElement(new String[] { XPATH, "//a[text() = \"mis datos personales\"]" });
        // Select Option from Conventions
        selectOption(new String[] { NAME, "titleCode" }, "mr");
        // Write text in firstName
        typeText(new String[] { NAME, "firstName" }, "karthik");
        // Click on Save Changes button
        clickOnElement(new String[] { XPATH, "//button[text() = \" Guardar Cambios\"]" });
        // Add Assertion for updated successfully message
        Assert.assertTrue(
          isElementAvailable(new String[] { CSS, "div[class=\"alert alert-success alert-dismissable\"]" }));
        // Add Assertion for Updated name
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'logged_in js-logged_in\']" }));
        // Click on again loginSymbol
        clickOnElement(new String[] { XPATH, "//li[@class=\'yCmsComponent\']/child::a" });
        // Click on My addresses
        clickOnElement(new String[] { XPATH, "//ul[@class=\'nav__links\']/child::li[1]/child::a" });
        // click on Add Address
        clickOnElement(new String[] { XPATH, "//div[contains(@class,\'add-new-address-container\')]/child::a" });
        // Write text in Document No text field
        typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "7865567892");
        // Write text in Billing Name text field
        typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "karthik bala");
        // Select Option  departartment DD
        selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000001");
        // Select Option from Canton DD
        selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000001000011");
        // Select Option from Sector DD
        selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000001000011000052");
        // Write text in address.line1  text field
        typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "main road");
        // Write text in address.line2  text field
        typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "M60-879");
        // Write text in Secondary Street  text field
        typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "Church Street");
        // Write text in Neighbourhood  text field
        typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "Tarak");
        // Write text in Reference Address text field
        typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "87-23M");
        // Write text in phone Textfield
        typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "56743287");
        // Validate My addresses screen display
        takeScreenshotOfParticularElement(new String[] { XPATH, "//form[@id=\'belcorpAddressForm\']/parent::div" },
          "logs/Screenshots/nQPOqn.png");
        // Click on Save Address Button
        clickOnElement(new String[] { XPATH, "//button[text()=\' GUARDAR DIRECCIÓN \']" });
        // Validate  Address created successfully
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//div[@class=\'alert alert-success alert-dismissable\']" }));
        // Click on again loginSymbol
        clickOnElement(new String[] { XPATH, "//li[@class=\'yCmsComponent\']/child::a" });
        // Click on My orders placed
        clickOnElement(new String[] { XPATH, "//ul[@class=\'nav__links\']/child::li[2]/child::a" });
        // Validate My orders placed display screen
        takeScreenshotOfParticularElement(
          new String[] { XPATH, "//div[contains(@class,\'account-section-content\')]/parent::div" },
          "logs/Screenshots/XfQUyj.png");
        // End of If Loop
      }
      // End Else Statement Loop
    }

    status = "passed";
  }
}