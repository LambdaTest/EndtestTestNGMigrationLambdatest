package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Regression_Peru_Ecom extends WebDriverHelper {

  @Test
  public void ECSCENARIO_Three_Purchase_in_virtual_store__start_Guest_User__debit_cardCTwoNineNineNine() {
    javascriptExecution(
      "lambda-name=ECSCENARIO Three Purchase in virtual store  start Guest User  debit cardCTwoNineNineNine");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Add Assertion for old price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']" }));
    // Add Assertion for active price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']" }));
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on add to bag
      clickOnElement(new String[] { ID, "addToCartButton" });
      // Click on go pay button
      clickOnElement(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
      // Add Assertion for qty selector button (+)
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
      // Add Assertion for qty selector button (+)
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'-\'])[2]" }));
      // Click on go pay button for checkout
      clickOnElement(
        new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
      // Login Using Guest User
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
      // Add Assertion for Dirección de En...
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Dirección de Envío\"]" }));
      // click on Address Submit Button
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
      // Checkout Using Debit Card
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "(//input[@id='cardholderName'])[2]" }, "10", "disabled");
      // write text in card holder name
      typeText(new String[] { XPATH, "(//input[@id=\'cardholderName\'])[2]" }, "APRO");
      // Write Text In Card Number
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumberDebit-error\"]" },
        "5333099529782376");
      // Select Option From Month Dropdown
      selectOption(new String[] { XPATH, "(//select[@name=\'expirationMonth\'])[2]" }, "11");
      // Select Option From Year Dropdown
      selectOption(new String[] { XPATH, "(//select[@name=\'expirationYear\'])[2]" }, "2025");
      // Write Text In CVV Textbox
      typeText(new String[] { XPATH, "(//input[@id=\'securityCode\'])[2]" }, "123");
      // Write Text In Document No
      typeText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" }, "12345678");
      // scroll
      scrollIntoElementView(new String[] { CSS, "input[id=\'Terms1_mpagoDebitCardForm\']" });
      // Cick On Terms1 Checkbox
      clickOnElement(new String[] { ID, "Terms1_mpagoDebitCardForm" });
      // Click On Pay Button
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(4) > div > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(6) > div > div > form > div:nth-of-type(7) > div > button" });
      // end if  add to cart button
    }

    status = "passed";
  }

  @Test
  public void Shop_by_CategoryCThreeOneNineThree_CThreeTwozeroNine_CThreeOneSevenFive() {
    javascriptExecution("lambda-name=Shop by CategoryCThreeOneNineThree CThreeTwozeroNine CThreeOneSevenFive");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll to  Tratamiento Facial
    scroll("ScrollDown", 1155);
    // Click on  Tratamiento Facial img
    clickOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 2 Simple Responsive Banner Component\"]" });
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll
    scroll("ScrollDown", 1155);
    // Click on  Tratamiento Facial link
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Tratamiento Facial\')]" });
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down to  Maquillaje
    scroll("ScrollDown", 1155);
    // Click on  Maquillaje img
    clickOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 1 Simple Responsive Banner Component\"]" });
    // Add Assertion for maquillaje
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"maquillaje\"]" }));
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down
    scroll("ScrollDown", 1155);
    // Click on Maquillaje link
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Maquillaje\')]" });
    // Add Assertion for maquillaje
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"maquillaje\"]" }));
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down to  Fragancias
    scroll("ScrollDown", 1155);
    // Click on  Fragancias img
    clickOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 4 Simple Responsive Banner Component\"]" });
    // Add Assertion for perfumes
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"perfumes\"]" }));
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down to  fragancias
    scroll("ScrollDown", 1155);
    // Click on Fragancias linktext
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Fragancias\')]" });
    // Add Assertion for perfumes
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"perfumes\"]" }));
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down to  Cuidado personal
    scroll("ScrollDown", 1155);
    // Click on  Cuidado personal img
    clickOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 3 Simple Responsive Banner Component\"]" });
    // Add Assertion for  Cuidado personal
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" }));
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down to  Cuidado personal
    scroll("ScrollDown", 1155);
    // Click on  Cuidado personal linktext
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Cuidado personal\')]" });
    // Add Assertion for  Cuidado personal
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" }));
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll down
    scroll("ScrollDown", 1155);
    // mousehover on  Tratamiento Facial img
    mouseHoverOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 2 Simple Responsive Banner Component\"]" });
    // Add assertion for  Tratamiento Facial
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 2 Simple Responsive Banner Component\"]" }));
    // mousehover on  Maquillaje img
    mouseHoverOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 1 Simple Responsive Banner Component\"]" });
    // add asserttion for  Maquillaje img
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 1 Simple Responsive Banner Component\"]" }));
    // mousehover on  Fragancias img
    mouseHoverOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 4 Simple Responsive Banner Component\"]" });
    // add assertion for  Fragancias img
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 4 Simple Responsive Banner Component\"]" }));
    // mousehover on  Cuidado personal img
    mouseHoverOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 3 Simple Responsive Banner Component\"]" });
    // add assertion for  Cuidado personal img
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 3 Simple Responsive Banner Component\"]" }));

    status = "passed";
  }

  @Test
  public void Ask_for_a_giftCTwoSevenzeroOne_PHASETwo() {
    javascriptExecution("lambda-name=Ask for a giftCTwoSevenzeroOne PHASETwo");

    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
    // Click on Add to cart button For First Product
    clickOnElement(
      new String[] { CSS, "div:nth-child(2) > div.inner-card > div.addtocart > form > button > span.has-stock-text" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Add To Cart Button For Second Product
    clickOnElement(
      new String[] { CSS, "div:nth-child(4) > div.inner-card > div.addtocart > form > button > span.has-stock-text" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@class='js-send-as-gift-checkbox']" }, "10",
      "disabled");
    // Click On Order as Gift Checkbox
    clickOnElement(new String[] { XPATH, "//input[@class=\'js-send-as-gift-checkbox\']" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn--continue-checkout btn-block\']" });
    // wait until gift Popup
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#cboxLoadedContent div.gift-popup-title > span" }, "10",
      "disabled");
    // Write character with number and special character
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.from\'])[2]" }, "1@soumya");
    // Add Assertion For Wrong Message
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "(//div[@class=\'checkout-field-condition-msg-left\'])[2]" }));
    // clear text from first name textbox
    clearText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.from\'])[2]" });
    // Write Text in Form(first Name)
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.from\'])[2]" }, "soumya");
    // Write character with number and special character
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.to\'])[2]" }, "da4");
    // Clear Text From Last Name TextBox
    clearText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.to\'])[2]" });
    // Write Text in For(last Name)
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.to\'])[2]" }, "das");
    // Write character with number and special character
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.completeNameTo\'])[2]" }, "-Arjun2");
    // Clear Text From Give away Person Textbox
    clearText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.completeNameTo\'])[2]" });
    // Add Assertion For Error Message
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "(//div[@class=\'checkout-field-condition-msg\'])[2]" }));
    // Write Text In name Of Person you want to give away
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.completeNameTo\'])[2]" }, "Arjun Reddy");
    // Click On Continue Button
    clickOnElement(new String[] { CSS, "div#cboxLoadedContent button" });
    // wait until Checkout Page
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//h1[contains(text(),'Checkout')]" }, "10", "disabled");
    // Login as guest User
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
    // Shipping address details For COD
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-06");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "06-LIMA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "LIMA-LIMA");
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
    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=hohammed");
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
    // Click on First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // Click On Order as Gift Checkbox
    clickOnElement(new String[] { XPATH, "//input[@class=\'js-send-as-gift-checkbox\']" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Login As Guest User
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
    // Shipping Address Details Along with Gift Details
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-06");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "06-LIMA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "LIMA-LIMA");
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
    // Write Character and number with Special Character in From Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Odish1@");
    // Validate Error Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'address.from-error\']" }));
    // Clear input
    clearText(new String[] { XPATH, "//input[@id=\'address.from\']" });
    // Write text in From Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Odisha");
    // Write Character and number with Special Character in For Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Soumya12*");
    // Validate Error Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'address.to-error\']" }));
    // Clear input From For Textbox
    clearText(new String[] { XPATH, "//input[@id=\'address.to\']" });
    // Write Text in For Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Vishal");
    // Write Character and number with Special Character in Person To giveaway  Textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "Vishal1@");
    // Validate Error Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'address.completeNameTo-error\']" }));
    // Clear input
    clearText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" });
    // Write Text In Person to Give away textbox
    typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "vishal das");
    // Validate Gift Message
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'gift-checkout-base-store-message\']" }));
    // Click on Continue Button
    clickOnElement(new String[] { CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]" });

    status = "passed";
  }

  @Test
  public void Purchase_in_virtual_store_guest_user_credit_card_CTwoSixSixTwo_CTwoSixSixSix_CTwoSixSevenOne_CTwoSixSevenSeven_CTwoSixEightOne() {
    javascriptExecution(
      "lambda-name=Purchase in virtual store guest user credit card CTwoSixSixTwo CTwoSixSixSix CTwoSixSevenOne CTwoSixSevenSeven CTwoSixEightOne");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on L\'BEL
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img" });
    // mouse hover perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // if visible
    if (isDisplayed(new String[] { XPATH, "//a[text() = \"Frutal\"]" }, 0)) {
      // Click on Frutal
      clickOnElement(new String[] { XPATH, "//a[text() = \"Frutal\"]" });
      // Click on Liasson Perfume...
      clickOnElement(new String[] { ID, "product_productName_200084882" });
      // Add Assertion for old price
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']" }));
      // Add assertion for Active price
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']" }));
      // if add to cart present
      if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
        // Click on Add to cart
        clickOnElement(new String[] { ID, "addToCartButton" });
        // click on go pay button
        // explicit wait for Go Pay Button
        waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
          "disabled");
        // Click on go pay
        clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
        // Add Assertion for qty selector button (+)
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
        // Add Assertion for qty selector button (-)
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'-\'])[2]" }));
        // Click on go pay button for checkout
        clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
        // Write text in first Name
        typeText(new String[] { ID, "guest.firstName" }, "Soumya ");
        // Write text in last Name
        typeText(new String[] { ID, "guest.lastName" }, "Das");
        // Write text in email
        typeText(new String[] { ID, "guest.email" }, "srdas96@hotmail.com");
        // Click on agree To receive checkbox
        clickOnElement(new String[] { ID, "guest.agreeToReceivePublicity" });
        // Click on T&C privacy policy checkbox
        clickOnElement(new String[] { ID, "guest.belcorpToC" });
        // Click on Continue as guest button
        clickOnElement(new String[] { XPATH, "//button[text() = \"Continuar como invitado\"]" });
        // Click on Address Submit Button
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
        // Checkout Using Credit Card
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
        // Add Assertion For Success  message
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
        // end if add to cart present
      }
      // end if
    }

    status = "passed";
  }

  @Test
  public void PE__ETwoE_Add_supported_from_PDP_carousel__Free_Sample__send_to_SBTwoCFiveSixNine() {
    javascriptExecution(
      "lambda-name=PE  ETwoE Add supported from PDP carousel  Free Sample  send to SBTwoCFiveSixNine");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to  URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // if Makeup category present
    if (isElementAvailable(new String[] { XPATH, "//a[@title=\'Maquillaje\']" })) {
      // click on makeup
      clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
      // click on first product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
      // if add to cart present
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
        // Click on add to cart button
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // Click on go pay button
        // explicit wait for Go Pay Button
        waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
          "disabled");
        // Click on go pay
        clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
        // Check if free sample present
        if (isElementAvailable(new String[] { XPATH, "//b[text()=\'Gratis\']" })) {
          // Validation for free sample
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//b[text()=\'Gratis\']" }));
          // End If Statement
        }
        // Click on go pay button
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
        // guest user login
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
        // Shipping address details
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
        // Credit Card Details
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
        // start if statement
        if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" })) {
          // Validation for\" checkout success message\"
          Assert.assertTrue(
            isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']" }));
          // End if statement
        }
        // end if add to cart present
      }
      // end if makeup present
    }

    status = "passed";
  }

  @Test
  public void Validate_dynamic_title__CFourFourFive() {
    javascriptExecution("lambda-name=Validate dynamic title  CFourFourFive");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/acondicionador-esens-pro-salon/p/200092360/mitiendaonlineelizabeth");
    // if promotion icon present
    if (isDisplayed(
      new String[] { XPATH, "//h3[@class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']" }, 0)) {
      // Add Assertion for exclusive promotions
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//h3[@class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']" }));
      // Add Assertion for available promotions
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Promociones disponibles\']" }));
      // Add Assertion for combine with other product
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'description1\']" }));
      // Add assertion for best dscts
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'highlighted\']" }));
      // Add assertion for content display
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'description2\']" }));
      // click on lbel
      getURL("https://s1-lbel.tiendabelcorp.com/pe/rose-damelie-perfume-de-mujer/p/200098633/mitiendaonlineelizabeth");
      // Add Assertion for available promotions
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]" }));
      // Add Assertion for combine with other products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"¡Combínalo con otros productos para obtener\"]" }));
      // Add Assertion for best Dscts
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"mejores Dsctos!\"]" }));
      // Add Assertion for discount icon
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "i[class=\"DISCOUNT icon lbel\"]" }));
      // click on cyzone link
      getURL(
        "https://cyzone.tiendabelcorp.com/pe/labial-studio-look-mate-rose-nude/p/200102092/mitiendaonlineelizabeth");
      // Add Assertion for exclusive promotions
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" }));
      // Add Assertion for available promotion
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]" }));
      // Add Assertion for promotion icon
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "i[class=\"DISCOUNT icon cyzone\"]" }));
      // Add Assertion for combine it with other products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"¡Combínalo con otros productos para obtener\"]" }));
      // Add Assertion for best dscts
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"mejores Dsctos!\"]" }));
      // Add Assertion for content display
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"Solo al agregar Labial Studio Look Mate\"]" }));
      // end if promotion
    }

    status = "passed";
  }

  @Test
  public void Validate_card_in_conditioned_CyzoneCFourSixThree_CFourFiveEight() {
    javascriptExecution("lambda-name=Validate card in conditioned CyzoneCFourSixThree CFourFiveEight");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://cyzone.tiendabelcorp.com/pe/");
    // Click on see all products
    clickOnElement(new String[] { XPATH, "//a[@title=\"mira todos los productos\"]" });
    // switch tab
    switchToNextWindow();
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Handle popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // start of if loop to check product availability
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[14]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[14]" });
      // End of if loop
    }
    // go to product url
    getURL("https://cyzone.tiendabelcorp.com/pe/set-brochas-studio-look/p/210083406/Produtosbetina");
    // scroll
    scroll("ScrollDown", 500);
    // wait
    waitForTime(5);
    // if condition to check promotion
    if (isElementAvailable(
      new String[] { XPATH, "//div[@class=\'owl-item active\']//div//div//a[text()=\'Ver combinaciones\']" })) {
      // Click on see combinations
      clickOnElement(
        new String[] { XPATH, "//div[@class=\'owl-item active\']//div//div//a[text()=\'Ver combinaciones\']" });
      // Click on combination product
      clickOnElement(
        new String[] { XPATH, "//a[contains(text(),\'Base de Maquillaje Studio Look Mate de Alta Cobertura\')]" });
      // scroll
      scroll("ScrollDown", 500);
      // end of if loop
    }
    // Note message
    printResults("PrintNote", "\"This product is not applicable for see combination promotion\"");

    status = "passed";
  }

  @Test
  public void Validate_Add_to_Bag_modalCFourEightThree() {
    javascriptExecution("lambda-name=Validate Add to Bag modalCFourEightThree");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // click on first product in carosul esika
    clickOnElement(new String[] { XPATH, "//div[@class=\'productCard__title\']/a" });
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on add To Cart Button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // end if add to cart present
    }
    // Go to esika
    getURL("https://s1-esika.tiendabelcorp.com/pe");
    // Click on labial lipstick
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img" });
    // Click on Labial Dúo Hydr...
    clickOnElement(new String[] { XPATH, "//a[text() = \"Labial Dúo Hydra Matte\"]" });
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Agregar a la bo button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // Add Assertion for Labial Dúo Hydr...
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Labial Dúo Hydra Matte\"]" }));
      // end if if add to cart present
    }
    // Go to LBEL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/?_ga=2.200888296.774021206.1628505427-1125621628.1627383934");
    // Click on img mascara
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img" });
    // Click on Máscara de pest...
    clickOnElement(new String[] { XPATH, "//a[text() = \"Máscara de pestañas studio look\"]" });
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Agregar a la bo button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // Add Assertion for Máscara de pest...
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//a[text() = \"Máscara de pestañas studio look\"]" }));
      // Click on Ir a pagar
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Add Assertion for Máscara de pest...
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"Máscara de pestañas studio look\"]" }));
      // if present
      if (isElementAvailable(new String[] { XPATH, "//span[text() = \"Labial Dúo Hydra Matte\"]" })) {
        // Add Assertion for Labial Dúo Hydr...
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Labial Dúo Hydra Matte\"]" }));
        // end if present
      }
      // end if add to cart present
    }

    status = "passed";
  }

  @Test
  public void FooterCThreeOneEightTwo() {
    javascriptExecution("lambda-name=FooterCThreeOneEightTwo");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // GoToURL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // scroll to bottom
    scroll("ScrollBottom");
    // FaceBookIcon
    mouseHoverOnElement(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"facebook\"]" });
    // Add assertio for facebook icon
    Assert.assertTrue(isElementDisplayed(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"facebook\"]" }));
    // InstagramIcon
    mouseHoverOnElement(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"instagram\"]" });
    // add assertion for instagram icon
    Assert.assertTrue(isElementDisplayed(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"instagram\"]" }));
    // YouTubeIcon
    mouseHoverOnElement(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"youtube\"]" });
    // add assertion for youtube icon
    Assert.assertTrue(isElementDisplayed(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"youtube\"]" }));
    // TwitterIcon
    mouseHoverOnElement(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"twitter\"]" });
    // add asserion for twitter icon
    Assert.assertTrue(isElementDisplayed(new String[] { CSS, "img[class=\"lazy loaded\"][alt=\"twitter\"]" }));

    status = "passed";
  }

  @Test
  public void Validate_card_supported_by_Free_LbelCFourSevenOne() {
    javascriptExecution("lambda-name=Validate card supported by Free LbelCFourSevenOne");

    // Go to URL
    getURL(" https://cyzone.tiendabelcorp.com/pe/sets/c/cyzone-32/mitiendaonlineelizabeth");
    // if present
    if (isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" })) {
      // Click on L\'BEL
      clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" });
      // if product present in sets
      if (isDisplayed(new String[] { XPATH, "//a[text() = \"sets\"]" }, 0)) {
        // Click on sets
        clickOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
        // Click on first product
        clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
        // end if product present in sets
      }
      // Refresh
      pageRefresh();
      // start if statement
      if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]" })) {
        // Add Assertion for see gift details
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]" }));
        // scroll to ver detalle de regalo(see gift details)
        scrollIntoElementView(
          new String[] { CSS, "a[class=\'btn promotionButton viewDetailProductCommercialCarousel\']" });
        // click on ver detalle deregalo(see gift details)
        clickOnElement(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]" });
        // Add Assertion for popup heading after clicking see gift details
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "(//div[@class=\'modal-title productVariantSelectedDataName\'])[7]" }));
        // click on see gift details popup
        clickOnElement(new String[] { XPATH, "(//span[@class=\'glyphicon glyphicon-remove\'])[3]" });
        // end if statement
      }
      // start else statement
      else {
        // print statement
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }
      // end if lbel present
    }

    status = "passed";
  }

  @Test
  public void Scenario_TwoThree_PECOCLMX__Pending_payment_by_credit_cardCTwoEightFourThree_PHASETwo() {
    javascriptExecution(
      "lambda-name=Scenario TwoThree PECOCLMX  Pending payment by credit cardCTwoEightFourThree PHASETwo");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // GO to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Makeup Section
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // click on first product
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
    // Shipping Address Details
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
    // Checkout Using Credit Card
    // wait
    waitUntil("CheckVisibleElement", new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']" },
      "10", "disabled");
    // Click On Credit Card Section
    clickOnElement(new String[] { CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]" });
    // Write Text In CardHolder name
    typeText(new String[] { CSS,
        "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" },
      "CONT");
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
    // if pending payment present
    if (isElementAvailable(new String[] { CSS, "div.text-center > b:nth-child(2)" })) {
      // Add Assertion For Pending Message
      Assert.assertTrue(
        getText(new String[] { CSS, "div.text-center > b:nth-child(2)" }).contains("Tu transacción está pendiente"));
      // Take Snip Of Pending message
      takeScreenshotOfParticularElement(new String[] { CSS, "div.text-center > b:nth-child(2)" },
        "logs/Screenshots/eUWVhj.png");
      // end if pending payment present
    }
    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // Click on makeup
    javascriptExecution("document.querySelector(\"div#cyzone-02 a\").click();");
    // start if popup is present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // Click on Close Popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End if
    }
    // Start Else
    else {
      // Print Result
      printResults("PrintNote", "\"Popup Is Not Present\"");
      // End Else
    }
    // Click on First Product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    javascriptExecution(
      "document.querySelector(\"div#StickySidebar div.down-bar-actions.col-md-6.col-xs-12 > div > button#checkout-display-continueCheckout\").click();");
    // Login As Guest User
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
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//strong[text() = \"¿Cómo quisieras recibir tu pedido?\"]" })) {
      // Add Assertion for How would you like to receive your order
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//strong[text() = \"¿Cómo quisieras recibir tu pedido?\"]" }));
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]" });
      // end if
    }
    // Start else
    else {
      // print
      printResults("PrintNote", "\"element is not present\"");
      // End else
    }
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
    // wait
    waitUntil("CheckElement", new String[] { ID, "deliveryMethodSubmit" }, "15", "disabled");
    // Shipping Address Details Chile
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
      typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "CONT");
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
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // Add Assertion For Pending Message
    Assert.assertTrue(
      getText(new String[] { CSS, "div.text-center > b:nth-child(2)" }).contains("Tu transacción está pendiente"));
    // Take Snip of pending Message
    takeScreenshotOfParticularElement(new String[] { CSS, "div.text-center > b:nth-child(2)" },
      "logs/Screenshots/BcbHFz.png");
    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // Click on Maquillaje
    javascriptExecution("document.querySelector(\"div#cyzone-02 a\").click();");
    // Click on First Product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Login As Guest User Till Shipping Address Details
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
    // Checkout Using Credit Card
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
      typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "CONT");
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
    // Add Assertion For Pending Message
    Assert.assertTrue(
      getText(new String[] { CSS, "div.text-center > b:nth-child(2)" }).contains("Tu transacción está pendiente"));
    // Take Snip Pending message
    takeScreenshotOfParticularElement(new String[] { CSS, "div.text-center > b:nth-child(2)" },
      "logs/Screenshots/bErycM.png");
    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-cyzone.tiendabelcorp.com/mx/");
    // Click on Makeup
    javascriptExecution("document.querySelector(\"div#cyzone-02 a\").click();");
    // Click on First Product
    javascriptExecution(
      "document.querySelector(\"div:nth-child(2) > div.inner-card > div.product-item-info > div.details > a\").click();");
    // Click on Add to cart button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // click on go pay button
    javascriptExecution(
      "document.querySelector(\"div#StickySidebar div.down-bar-actions.col-md-6.col-xs-12 > div > button#checkout-display-continueCheckout\").click();");
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
    // Shipping address Details
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
    // Checkout Using Credit Card
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
      typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "CONT");
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
    // Add Assertion For pending Message
    Assert.assertTrue(
      getText(new String[] { CSS, "div.text-center > b:nth-child(2)" }).contains("Tu transacción está pendiente"));
    // Take snip Of pending Message
    takeScreenshotOfParticularElement(new String[] { CSS, "div.text-center > b:nth-child(2)" },
      "logs/Screenshots/NMYfNu.png");

    status = "passed";
  }

  @Test
  public void Validate_card_in_conditioned_LbelCFourFiveSeven_CFourSixTwo() {
    javascriptExecution("lambda-name=Validate card in conditioned LbelCFourFiveSeven CFourSixTwo");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://lbel.tiendabelcorp.com/pe/");
    // mouse hover to perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on Floral
    clickOnElement(new String[] { XPATH, "//a[text() = \"Floral\"]" });
    // Click on first product
    javascriptExecution("document.querySelector(\"a[class=\'name\']\").click()");
    // Refresh
    pageRefresh();
    // if promotion exclusive visible
    if (isElementAvailable(
      new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" })) {
      // Add Assertion for Promociones exc...
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" }));
      // end if promotion exclusive visible
    }

    status = "passed";
  }

  @Test
  public void Validate_card_LBel_stylesCFourSevenNine() {
    javascriptExecution("lambda-name=Validate card LBel stylesCFourSevenNine");

    // Go to URL
    getURL(" https://cyzone.tiendabelcorp.com/pe/sets/c/cyzone-32/mitiendaonlineelizabeth");
    // Click on L\'BEL
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" });
    // if product present in sets
    if (isDisplayed(new String[] { XPATH, "//a[text() = \"sets\"]" }, 0)) {
      // Click on sets
      clickOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
      // Click on first product
      clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
      // end if product present in sets
    }
    // Refresh
    pageRefresh();
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]" })) {
      // scroll to ver detalle de regalo(see gift details)
      scrollIntoElementView(
        new String[] { CSS, "a[class=\'btn promotionButton viewDetailProductCommercialCarousel\']" });
      // Add Assertion for see gift details
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]" }));
      // click on ver detalle de regalo
      clickOnElement(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]" });
      // Take screenshot
      takeScreenshot("logs/Screenshoots/fRzCmx.png");
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Brand_equityCThreeOneSevenSixphase_Two() {
    javascriptExecution("lambda-name=Brand equityCThreeOneSevenSixphase Two");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // GoToURL
    getURL("https://bic2-esika.tiendabelcorp.com/pe/");
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "div#EsikaBicSection7 div#dualbanner_banner_1 > div > p" })) {
      // add assertion for brand equity title
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "div#EsikaBicSection7 div#dualbanner_banner_1 > div > p" }));
      // add assertion for description
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "div#EsikaBicSection7 div#dualbanner_banner_1 > div > h2" }));
      // add assertion for multimedia content
      Assert.assertTrue(isElementAvailable(new String[] { ID, "dualbanner_banner_1" }));
      // end if statement
    }
    // start else
    else {
      // print in result
      printResults("PrintNote", "\"brand equity is not present\"");
      // end else
    }

    status = "passed";
  }

  @Test
  public void Validate_Cyzone_Carousel_Styles__CFourFourFour() {
    javascriptExecution("lambda-name=Validate Cyzone Carousel Styles  CFourFourFour");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://cyzone.tiendabelcorp.com/pe/labial-studio-look-mate-rose-nude/p/200102092/mitiendaonlineelizabeth");
    // Add Assertion for exclusive promotions
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" }));
    // if promotion present
    if (isDisplayed(new String[] { CSS, "//div[text() = \"Promociones disponibles\"]" }, 0)) {
      // Add Assertion for available promotion
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]" }));
      // if promotion icon present
      if (isDisplayed(new String[] { CSS, "i[class=\"DISCOUNT icon cyzone\"]" }, 0)) {
        // Add Assertion for promotion icon
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "i[class=\"DISCOUNT icon cyzone\"]" }));
        // end if promotion icon
      }
      // Add Assertion for combine it with other products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"¡Combínalo con otros productos para obtener\"]" }));
      // Add Assertion for best dscts
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"mejores Dsctos!\"]" }));
      // Add Assertion for best dscts icon
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"mejores Dsctos!\"]" }));
      // Add Assertion for content display
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"Solo al agregar Labial Studio Look Mate\"]" }));
      // Add Assertion for see products
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver productos\"]" }));
      // end if promotion present
    }

    status = "passed";
  }

  @Test
  public void Validate_card_esika_styles__CFourSevenEight() {
    javascriptExecution("lambda-name=Validate card esika styles  CFourSevenEight");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on outside to handle popup
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div" });
    // Click on login icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img" });
    // Click on user name
    clickOnElement(new String[] { ID, "j_username" });
    // Write text  user name
    typeText(new String[] { ID, "j_username" }, "prernadewangan@photon.in");
    // Write text in  password
    typeText(new String[] { ID, "j_password" }, "Prerna12");
    // Click on login button
    clickOnElement(new String[] { CSS, "form#loginForm > button" });
    //wait
    waitForTime(10);
    // delete all cookies
    deleteAllCookies();
    //wait
    waitForTime(10);
    // click on esika mascara
    getURL("https://esika.tiendabelcorp.com/pe/mascara-mega-full-size-apa/p/200103354/mitiendaonlineelizabeth");
    // Add Assertion for exclusive promotions
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" }));
    // Handle popup
    backToMainFrame();
    // go back
    goBack();
    // go fwd
    goForward();
    // Add Assertion for available promotions
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]" }));
    // if promotion icon present
    if (isDisplayed(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(5) > div > div:nth-of-type(1) > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(1) > i" },
      0)) {
      // Add Assertion for promotion icon
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(5) > div > div:nth-of-type(1) > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(1) > i" }));
      // end if promotion icon
    }
    // Add Assertion for combine with other products
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//span[text() = \"¡Combínalo con otros productos para obtener\"]" }));
    // Add Assertion for best Dscts
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"mejores Dsctos!\"]" }));
    // Add Assertion for content display
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//span[text() = \"Solo al agregar Máscara Mega Full Size APA\"]" }));

    status = "passed";
  }

  @Test
  public void Validate_card_supported_by_Free_CyzoneCFourSevenTwo() {
    javascriptExecution("lambda-name=Validate card supported by Free CyzoneCFourSevenTwo");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
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
    // Click on cuidado persona...
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // click on first product
    clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//span[text()=\'Agregar a la bolsa\']" })) {
      // Click on Agregar a la bo...
      clickOnElement(new String[] { CSS, "//span[text()=\'Agregar a la bolsa\']" });
      // click on go pay button
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Add assertion for coupon
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[text() = \"Añade tu cupón de descuento\"]" }));
      // Click on COUPON
      clickOnElement(new String[] { XPATH, "//span[text() = \"Añade tu cupón de descuento\"]" });
      // Add assertion for Detail
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[text() = \"Detalle del pedido\"]" }));
      // Click on Detalle del ped...
      clickOnElement(new String[] { XPATH, "//p[text() = \"Detalle del pedido\"]" });
      // Click on input
      clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
      // Click on Please select s...
      clickOnElement(new String[] { CSS, "section[class=\"cart-page\"]" });
      // end if add to cart present
    }

    status = "passed";
  }

  @Test
  public void Validate_card_in_Cyzone_supported_productCOneSevenFiveEightOneEightCFourFiveThree() {
    javascriptExecution(
      "lambda-name=Validate card in Cyzone supported productCOneSevenFiveEightOneEightCFourFiveThree");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // explicit wait
    waitUntil("CheckClickableElement", new String[] { XPATH,
        "//span[contains(text(),'RECOMENDADOS')]/parent::h2/parent::div/child::div/child::div[4]/child::div/child::div[@class='addtocart bicCyzoneVirtualMakeupProductsButton']" },
      "20", "disabled");
    // Click on Máscara de product
    clickOnElement(new String[] { XPATH,
      "//span[contains(text(),\'RECOMENDADOS\')]/parent::h2/parent::div/child::div/child::div[4]/child::div/child::div[@class=\'addtocart bicCyzoneVirtualMakeupProductsButton\']/child::a" });
    // Add Assertion for Active price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']" }));
    // Add Assertion for old price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']" }));
    // Promotion exclusive is Present
    if (isElementAvailable(
      new String[] { XPATH, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" })) {
      // Add Assertion for Promotion exclusive
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]" }));
      // Add assertion for available promotion
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-header\']/child::div" }));
      // Add assertion for SEE products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a" }));
      // Add assertion for discount icon
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-header\']/child::i" }));
      // Enf of If Loop
    }

    status = "passed";
  }

  @Test
  public void Register_Recommended_Bundle_Order_From_Conditional_SupportCFourFiveOne() {
    javascriptExecution("lambda-name=Register Recommended Bundle Order From Conditional SupportCFourFiveOne");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe");
    // Add assertion for hydra lipstick
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Labial Dúo Hydra Matte\"]" }));
    // if lipstic present
    if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Labial Dúo Hydra Matte\"]" })) {
      // Click on Labial Dúo Hydra lipstick
      clickOnElement(new String[] { XPATH, "//a[text() = \"Labial Dúo Hydra Matte\"]" });
      // if add to cart present
      if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
        // Click on add to cart
        clickOnElement(new String[] { ID, "addToCartButton" });
        // Click on  Go pay
        clickOnElement(new String[] { LINK, "Ir a pagar" });
        // Click on Go pay
        clickOnElement(
          new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]" });
        // Guest user login
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
        // fill adress details
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
        // proceed to payment
        // Wait untill agency banking
        waitUntil("CheckClickableElement",
          new String[] { CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']" }, "20", "disabled");
        // Click on Pago Efectivo  Section
        javascriptExecution(
          "document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();");
        // Click on Agents & Agencies
        javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();");
        // Click on Terms1 Checkbox
        javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();");
        // Click on Pay Button
        javascriptExecution(
          "document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
        // Add Assertion for order is created
        Assert.assertTrue(
          isElementAvailable(new String[] { CSS, "main > div:nth-of-type(4) > div > div > div:nth-of-type(1)" }));
        // end if add to cart present
      }
      // end if lipstick present
    }

    status = "passed";
  }

  @Test
  public void Purchase_in_virtual_store__CTwoSixSixTwo_CTwoSixSixSix_CTwoSixSevenOne_CTwoSixSevenSeven_CTwoSixEightOne() {
    javascriptExecution(
      "lambda-name=Purchase in virtual store  CTwoSixSixTwo CTwoSixSixSix CTwoSixSevenOne CTwoSixSevenSeven CTwoSixEightOne");

    // Clearing casche before starting test
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on cyzone
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div" });
    // Click on img user icon
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img" });
    // Write text in username
    typeText(new String[] { ID, "j_username" }, "prerna.dewangan12@gmail.com");
    // Write text in password
    typeText(new String[] { ID, "j_password" }, "Photon1212@");
    // Write text in registered email
    typeText(new String[] { ID, "register.email" }, "prerna.dewangan12@gmail.com");
    // Click on username
    clickOnElement(new String[] { ID, "j_username" });
    // Write text in password
    typeText(new String[] { ID, "j_password" }, "Photon1212@");
    // Write text in username
    typeText(new String[] { ID, "j_username" }, "prerna.dewangan12@gmail.com");
    // Click on Log in
    clickOnElement(new String[] { CSS, "form#loginForm > button" });
    // Click on Personal care
    mouseHoverOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // Click on Cuerpo
    clickOnElement(new String[] { XPATH, "//a[text() = \"Cuerpo\"]" });
    // Add assertion for cuerpo is clickable
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Cuerpo\"]" }));
    // Click on alcohol gel ant...
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200104007_fotocrosselling.jpg\"]" });
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Add to bag
      clickOnElement(new String[] { ID, "addToCartButton" });
      // if continue shopping present
      if (isElementAvailable(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)" })) {
        // Click on continue shopping
        clickOnElement(new String[] { CSS,
          "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)" });
        // end if continue shopping present
      }
      // end if  add to cart present
    }
    // Click on esika
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img" });
    // Click on personal care
    mouseHoverOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // Click on Cabello
    clickOnElement(new String[] { XPATH, "//a[text() = \"Cabello\"]" });
    // Click on Acondicionador ...
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200092360-FotoFondoBlancoSB.jpg\"]" });
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Add to bag
      clickOnElement(new String[] { ID, "addToCartButton" });
      // Click on Seguir Comprand...
      clickOnElement(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(5) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)" });
      // end if add to cart present
    }
    // Click on lbel
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img" });
    // Click on personal care
    mouseHoverOnElement(new String[] { XPATH,
      "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']" });
    // Click on Linea
    clickOnElement(new String[] { CSS, "a[href=\"/pe/cuidado-personal/linea/c/lbel-0405\"]" });
    // Click on Crema para Mano...
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200061181_preview_delice_manos_almendras.jpg\"]" });
    // if add to cart visible
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Add to bag .
      clickOnElement(new String[] { ID, "addToCartButton" });
      // Click on Go pay
      clickOnElement(new String[] { CSS,
        "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)" });
      // end if add to cart visible
    }
    // if go pay visible
    if (isDisplayed(new String[] { CSS,
        "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" },
      0)) {
      // Click on Go pay
      clickOnElement(new String[] { CSS,
        "div#StickySidebar > div > div:nth-of-type(6) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)" });
      // Select Option from Elige un depart...
      selectOption(new String[] { ID, "address.regionIsoParent2" }, "PE-DEP-24");
      // Select Option from MANUTAHUAMANUTA...
      selectOption(new String[] { ID, "address.regionIsoParent1" }, "24-MANU");
      // Select Option from FITZCARRALDHUEP...
      selectOption(new String[] { ID, "address.regionIso" }, "MANU-MADRE DE DIOS");
      // Click on Checkout | Belc...
      clickOnElement(new String[] { CSS, "html[lang=\"es_PE\"]" });
      // Click on address line1
      clickOnElement(new String[] { ID, "address.line1" });
      // Write text in address line1
      typeText(new String[] { ID, "address.line1" }, "Behind paraliament");
      // Click on address phone
      clickOnElement(new String[] { ID, "address.phone" });
      // Click on Checkout
      clickOnElement(new String[] { CSS, "html[lang=\"es_PE\"]" });
      // Write text in address phone
      typeText(new String[] { ID, "address.phone" }, "123456789");
      // Click on click here to submit
      clickOnElement(new String[] { ID, "addressSubmit" });
      // Click on Checkout button
      clickOnElement(new String[] { CSS, "html[lang=\"es_PE\"]" });
      // Click on Click on Checkout delivery button
      clickOnElement(new String[] { ID, "deliveryMethodSubmit" });
      // Select Option from Seleccione un M...
      selectOption(new String[] { ID, "paymentOptions" }, "mpago_credit");
      // enter credit card no
      typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
      // Select documnet type
      selectOption(new String[] { ID, "docType" }, "DNI");
      // Enter Document no
      typeText(new String[] { ID, "docNumber" }, "12345678");
      // select expiry month
      selectOption(new String[] { ID, "expirationMonth" }, "04");
      // select expiry year
      selectOption(new String[] { ID, "expirationYear" }, "2024");
      // write card holder name
      typeText(new String[] { ID, "cardholderName" }, "APRO");
      // wirte security code
      typeText(new String[] { ID, "securityCode" }, "123");
      // click on click here to continue button
      clickOnElement(new String[] { XPATH, "//button[text()=\'CLICK AQUÍ PARA CONTINUAR\']" });
      // click on i confirm checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1\']" });
      // click on i agree checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'agreeToReceiveWhatsappNotificationsCheck\']" });
      // click on final purchase button
      clickOnElement(new String[] { XPATH, "//button[@id=\'placeOrder\']" });
      // Assertion for final purchase button
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "main > div:nth-of-type(4) > div > div > div:nth-of-type(1)" }));
      // end if go pay visible
    }

    status = "passed";
  }

  @Test
  public void Ask_for_a_giftCTwoEightFiveSeven_PHASETwo() {
    javascriptExecution("lambda-name=Ask for a giftCTwoEightFiveSeven PHASETwo");

    // Clear Cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Perfumes
    clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
    // Click on Add to cart button For First Product
    clickOnElement(
      new String[] { CSS, "div:nth-child(2) > div.inner-card > div.addtocart > form > button > span.has-stock-text" });
    // Click on keep buying button
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Seguir Comprando\')]" });
    // Click on Add To Cart Button For Second Product
    clickOnElement(
      new String[] { CSS, "div:nth-child(4) > div.inner-card > div.addtocart > form > button > span.has-stock-text" });
    // click on go pay button
    // explicit wait for Go Pay Button
    waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10", "disabled");
    // Click on go pay
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//input[@class='js-send-as-gift-checkbox']" }, "10",
      "disabled");
    // Click On Order as Gift Checkbox
    clickOnElement(new String[] { XPATH, "//input[@class=\'js-send-as-gift-checkbox\']" });
    // click on go pay button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn--continue-checkout btn-block\']" });
    // wait until gift Popup
    waitUntil("CheckVisibleElement", new String[] { CSS, "div#cboxLoadedContent div.gift-popup-title > span" }, "10",
      "disabled");
    // Write character with number and special character
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.from\'])[2]" }, "1@soumya");
    // Add Assertion For Wrong Message
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "(//div[@class=\'checkout-field-condition-msg-left\'])[2]" }));
    // clear text from first name textbox
    clearText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.from\'])[2]" });
    // Write Text in Form(first Name)
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.from\'])[2]" }, "soumya");
    // Write character with number and special character
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.to\'])[2]" }, "da4");
    // Clear Text From Last Name TextBox
    clearText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.to\'])[2]" });
    // Write Text in For(last Name)
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.to\'])[2]" }, "das");
    // Write character with number and special character
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.completeNameTo\'])[2]" }, "-Arjun2");
    // Clear Text From Give away Person Textbox
    clearText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.completeNameTo\'])[2]" });
    // Add Assertion For Error Message
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "(//div[@class=\'checkout-field-condition-msg\'])[2]" }));
    // Write Text In name Of Person you want to give away
    typeText(new String[] { XPATH, "(//input[@id=\'belcorpGiftOptionForm.completeNameTo\'])[2]" }, "Arjun Reddy");
    // Click On Continue Button
    clickOnElement(new String[] { CSS, "div#cboxLoadedContent button" });
    // wait until Checkout Page
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//h1[contains(text(),'Checkout')]" }, "10", "disabled");
    // Login as guest User
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
    // Shipping address details For COD
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//select[@name='regionIsoParent2']" }, "10", "disabled");
    // Select Option From Department Dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-06");
    // Select Option From Province dRopdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "06-LIMA");
    // Select Option From District dropdown
    selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "LIMA-LIMA");
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
    // Validate COD option Not Visible
    Assert.assertFalse(isElementDisplayed(new String[] { XPATH, "//span[contains(text(),'Contra entrega')]" }));

    status = "passed";
  }

  @Test
  public void Validate_Lbel_carousel_styles__CFourFourSix() {
    javascriptExecution("lambda-name=Validate Lbel carousel styles  CFourFourSix");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/rose-damelie-perfume-de-mujer/p/200098633/mitiendaonlineelizabeth");
    // if promotion icon present
    if (isDisplayed(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]" }, 0)) {
      // Add Assertion for available promotions
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]" }));
      // Add Assertion for combine with other products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//span[text() = \"¡Combínalo con otros productos para obtener\"]" }));
      // Add Assertion for best Dscts
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"mejores Dsctos!\"]" }));
      // Add Assertion for discount icon
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "i[class=\"DISCOUNT icon lbel\"]" }));
      // Click on Rose D’Amelie P
      clickOnElement(new String[] { CSS, "html[lang=\"es_PE\"]" });
      // end if promotion
    }

    status = "passed";
  }

  @Test
  public void Validate_that_the_product_name__CNinezeroSix() {
    javascriptExecution("lambda-name=Validate that the product name  CNinezeroSix");

    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Click on perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on first perfume
    clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
    // Validate the name of the product title
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Validate the name of the product in the static bar
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'product-name-sticky product-name-sticky-lbel\']" }));
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // click on \"add to cart\" button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Validate the name of the product in the confirmation pop-up when adding to the cart
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'name\']" }));
      // end if add to cart present
    }
    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Click on perfume
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on first perfume
    clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
    // Validate the name of the product title
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Validate the name of the product in the static bar
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'product-name-sticky product-name-sticky-lbel\']" }));
    // if add to cart present
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" })) {
      // click on \"add to cart\" button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
      // Validate the name of the product in the confirmation pop-up when adding to the cart
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'name\']" }));
      // end if add to cart present
    }

    status = "passed";
  }

  @Test
  public void Validate_card_in_conditioned_CyzoneCFourFiveEight_CFourSixTwo() {
    javascriptExecution("lambda-name=Validate card in conditioned CyzoneCFourFiveEight CFourSixTwo");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://cyzone.tiendabelcorp.com/pe/");
    // if product present
    if (isDisplayed(new String[] { XPATH, "(//a[@class=\'spanTitle ecarousel_product_productName_210097511\'])[1]" },
      0)) {
      // click on Delineador De Cejas Plumón 2 En 1 Wow Brow Duo Studio Look
      clickOnElement(new String[] { XPATH, "(//a[@class=\'spanTitle ecarousel_product_productName_210097511\'])[1]" });
      // Refresh
      pageRefresh();
      // scroll to promotion
      scrollIntoElementView(
        new String[] { CSS, "h3[class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']" });
      // Add Assertion for Promociones dis...
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-wrapper\']" }));
      // end if
    }

    status = "passed";
  }

  @Test
  public void SCENARIO_Three_Purchase_in_virtual_store__log_in_with_google__debit_cardCFiveEightNine() {
    javascriptExecution(
      "lambda-name=SCENARIO Three Purchase in virtual store  log in with google  debit cardCFiveEightNine");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on user symbol
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img" });
    // Write text in j_username
    typeText(new String[] { ID, "j_username" }, "srdas96@gmail.com");
    // Write text in j_password
    typeText(new String[] { ID, "j_password" }, "Srdas@1234");
    // Add Assertion for arma tu pack...
    Assert.assertTrue(
      isElementFound(new String[] { CSS, "ul[class=\"nav__links nav__links--products js-offcanvas-links\"]" }));
    // click on login button
    clickOnElement(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']" });
    // Mouser hover on perfumes CYZONE
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']/parent::div" });
    // Click on Colonias
    clickOnElement(new String[] { CSS, "a[href=\"/pe/perfumes/hombre/colonias/c/cyzone-030102\"]" });
    // Click on agua de colonia...
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Add Assertion for agua de colonia...
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Add to Cart button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // end if add to cart present
    }
    // Refresh Tohandle Payment Popup
    pageRefresh();
    // Click on L\'BEL
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img" });
    // Write text in searchbar
    typeText(new String[] { CSS,
        "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" },
      "labial");
    // press enter key
    pressKey(new String[] { CSS,
        "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" },
      "ENTER");
    // Click on Labial Dúo Hydr...
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Add Assertion for Labial Dúo Hydr...
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Add to cart button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // end if add to cart present
    }
    // Refresh Tohandle Payment Popup
    pageRefresh();
    // Click on ESIKA
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img" });
    // Click on Magnat
    clickOnElement(new String[] { XPATH, "//a[text() = \"Magnat\"]" });
    // Add Assertion for Magnat
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // if add to cart present
    if (isElementAvailable(new String[] { ID, "addToCartButton" })) {
      // Click on Add To Cart Button
      clickOnElement(new String[] { ID, "addToCartButton" });
      // click on go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Add Assertion for qty selector button (+)
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "(//button[text()=\'+\'])[2]" }));
      // Add Assertion for qty selector button (-)
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'-\'])[2]" }));
      // Click on Go pay Button
      clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
      // pause
      waitForTime(3);
      // Click On Address Submit Button
      clickOnElement(new String[] { XPATH, "//button[@id=\'addressSubmit\']" });
      // Checkout Using Debit Card
      // Write Text In CVV Textbox
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCodeCardSaved-error\"]" },
        "123");
      // Cick On Terms1 Checkbox
      clickOnElement(new String[] { XPATH, "//input[@id=\'Terms1_MPagoCardSavedForm_mpago_debmaster\']" });
      // Cick On Pay Button
      clickOnElement(
        new String[] { XPATH, "//button[@class=\'btn btn-block submit_mpagoCardSavedForm checkout-next\']" });
      // Add Assertion For congratulation message
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
      // end if add to cart present
    }

    status = "passed";
  }

  @Test
  public void Facial_treatment_sectionCEightzeroFive() {
    javascriptExecution("lambda-name=Facial treatment sectionCEightzeroFive");

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
    // scroll
    scroll("ScrollDown", 2000);
    // Click on Bic L\'Bel Treat image
    clickOnElement(
      new String[] { XPATH, "//img[@title=\"Bic L\'Bel Treatment Lines Simple Responsive Banner Component\"]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // scroll
    scroll("ScrollDown", 2000);
    // assertion on \"meet our facial treatment lines\"
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//h3[contains(text(),\'Conoce nuestras líneas de tratamiento facial\')]" }));
    // Click on \"meet our facial treatment lines\"
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Conoce nuestras líneas de tratamiento facial\')]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // scroll
    scroll("ScrollDown", 2100);
    // assertion on \"VER PRODUCTOS\"
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[text() = \"VER PRODUCTOS\"]" }));
    // Click on link \"VER PRODUCTOS\"
    clickOnElement(new String[] { XPATH, "//a[text() = \"VER PRODUCTOS\"]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // scroll
    scroll("ScrollDown", 2100);
    // assertion on second image
    Assert.assertTrue(isElementDisplayed(
      new String[] { XPATH, "//img[@title=\"Bic L\'Bel Hyaluronic Acid Simple Responsive Banner Component\"]" }));
    // click on second image
    clickOnElement(
      new String[] { XPATH, "//img[@title=\"Bic L\'Bel Hyaluronic Acid Simple Responsive Banner Component\"]" });
    // come back to main url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // assertion on  \"All about hyaluronic acid\"
    Assert.assertTrue(
      isElementClickable(new String[] { XPATH, "//h3[contains(text(),\'Todo sobre el ácido hialurónico\')]" }));
    // click on name
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Todo sobre el ácido hialurónico\')]" });
    // go to lbel url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // assertion on link
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[@title=\"LEER NOTA\"]" }));
    // click on arrow link
    clickOnElement(new String[] { XPATH, "//a[@title=\"LEER NOTA\"]" });
    // go to LBel url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // assertion on image
    Assert.assertTrue(isElementDisplayed(
      new String[] { XPATH, "//img[@title=\"Bic L\'Bel Skin Diagnosis Simple Responsive Banner Component\"]" }));
    // click on 3rd image
    clickOnElement(
      new String[] { XPATH, "//img[@title=\"Bic L\'Bel Skin Diagnosis Simple Responsive Banner Component\"]" });
    // go to LBel url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // assertion on \"skin diagnosis\"
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//h3[contains(text(),\'Diagnóstico de la piel\')]" }));
    // click on \"skin diagnosis\"
    clickOnElement(new String[] { XPATH, "//h3[contains(text(),\'Diagnóstico de la piel\')]" });
    // go to LBel url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // go back to url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // scroll
    scroll("ScrollDown", 2000);
    // assertion on last image
    Assert.assertTrue(isElementDisplayed(
      new String[] { XPATH, "//img[@title=\"Bic L\'Bel Concentre Simple Responsive Banner Component\"]" }));
    // Click on Bic L\'Bel fourth image
    clickOnElement(new String[] { XPATH, "//img[@title=\"Bic L\'Bel Concentre Simple Responsive Banner Component\"]" });
    // go back
    goBack();
    // go back to url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // scroll
    scroll("ScrollDown", 2000);
    // assertion on \"Concentré total\"
    Assert.assertTrue(isElementClickable(
      new String[] { CSS, "h3[class=\"belcorp-cms-carousel-item__title bic-virtual-makeup-component_btn\"]" }));
    // Click on \"Concentré total\" name
    clickOnElement(
      new String[] { CSS, "h3[class=\"belcorp-cms-carousel-item__title bic-virtual-makeup-component_btn\"]" });
    // wait
    waitForTime(5);
    // go to url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // scroll
    scroll("ScrollDown", 1900);
    // assertion on COMPRAR AHORA link
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text()=\'COMPRAR AHORA\']" }));
    // Click on link \"COMPRAR AHORA\"
    clickOnElement(new String[] { XPATH, "//span[text() = \"COMPRAR AHORA\"]" });

    status = "passed";
  }
}