package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Individual_test_cases__Browse__Backend extends WebDriverHelper {

  @Test
  public void Backend__Consultant_search_engine_TwozeroCOneSevenFourNine() {
    javascriptExecution("lambda-name=Backend  Consultant search engine TwozeroCOneSevenFourNine");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Write text in consultant First Name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Ingresa nombre*\"]" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Ingresa apellido*\"]" },
      "a");
    // Select Option from Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "PE-DEP-06");
    // if  Look For Button  present
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" })) {
      // Click on Look For Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
      // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
      // Click on Assign Me A Consultant Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" });
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxContent\']" }, 0)) {
        // Print Result
        printResults("PrintNote", "\"consultant Popup is not present\"");
        // End if statement
      }
      // start else
      else {
        // Click On Assign Me as Consultant Button
        javascriptExecution(
          "document.querySelector(\"button[class=\'btn btn-black btn-block js-asign-consultant\']\").click();");
        // end else statement
      }
      // Take snip of Consultant Popup
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
        "logs/Screenshots/GyAzel.png");
      // Click on Shop With Me Button
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'COMPRA CONMIGO\')]" });
      // Add Assertion For Homepage Contains That Particular Consultant Name
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
      // Click On That Commercial Banner For Particular Consultant
      clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
      // click on Choose Another Consultant In The Popup
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Elige otra consultora\')]" });
      // Take Screenshot
      takeScreenshot("logs/Screenshoots/eihybc.png");
      // end if
    }
    // Start else statement
    else {
      // Print action
      printResults("PrintNote", "Element is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Backend__ECSCENARIO_Four_NoEcomm_selecting_Consultant_to_be_able_to_buyCThreezerozeroThree() {
    javascriptExecution(
      "lambda-name=Backend  ECSCENARIO Four NoEcomm selecting Consultant to be able to buyCThreezerozeroThree");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/ec/");
    // Add Assertion for Consultant Banner
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'content\']/span" }));
    // Click on Consultant banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // Write text in consultant name
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Ingresa nombre*\"]" },
      "Luis");
    // Write text in consultant surname
    typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Ingresa apellido*\"]" },
      "Robles");
    // Select Option from Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "000009");
    // if Look For Button present
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" })) {
      // Click on Look for
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
      // Add Assertion For Location
      Assert.assertTrue(
        getText(new String[] { XPATH, "//div[@class=\'results-table-row\']/div[3]" }).contains("GUAYAQUIL"));
      // Click on Shop with me button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'COMPRA CONMIGO\')]" });
      // Add Assertion for consultant name will be displayed in homepage
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
      // Click on perfumes
      clickOnElement(new String[] { XPATH, "(//a[@title=\'Perfumes\'])[1]" });
      // Click on Vibranza
      clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
      // Click on Add to cart button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]" });
      // click on go pay button
      // explicit wait for Go Pay Button
      waitUntil("CheckClickableElement", new String[] { XPATH, "//a[contains(text(),'Ir a pagar')]" }, "10",
        "disabled");
      // Click on go pay
      clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]" });
      // Click on Ir a pagar
      clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
      // Write text in guest first Name
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
      // Write text in guest lastName
      typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
      // Write text in guest email
      typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
      // Click on guest Agree To Recieve Publicity
      clickOnElement(new String[] { CSS,
        "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)" });
      // Click on T&C checkbox
      clickOnElement(new String[] { CSS,
        "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)" });
      // Click on Continue as guest button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Continuar como invitado\')]" });
      // start if statement
      if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" })) {
        // Click on go pay button
        clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
        // end if statement
      }
      // start else statement
      else {
        // print result
        printResults("PrintNote", "\"go pay button is not present\"");
        // end else statement
      }
      // Write text in address document type
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
        "000010");
      // Select Option from Canton Dropdown
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(2) > div > select" },
        "000010000003");
      // Select Option from Sector Dropdown
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(2) > div > select" },
        "000010000001");
      // Select Option from IBARRALA ESPERA...
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(3) > div > select" },
        "000010000001000050");
      // Write text in address line1
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(4) > input" },
        "near temple");
      // Write text in address line2
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(5) > input" },
        "n70-306");
      // Write text in secondary street
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(6) > input" },
        "vanivihar");
      // Write text in address neighbourhood
      typeText(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(10) > div:nth-of-type(7) > input" },
        "rasulgarh");
      // Write text in house number
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
        "7867876788");
      // click on click here to continue button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'CLICK AQUÍ PARA CONTINUAR\')]" });
      // click on click here to continue button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'CLICK AQUÍ PARA CONTINUAR\')]" });
      // Select Option from payment method dropdown
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" },
        "belpay_credit");
      // Write text in cardNumber
      typeText(new String[] { CSS,
          "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" },
        "4168818844447115");
      // Select Option from CédulaRUC
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(5) > select" },
        "RUC");
      // clear input
      clearText(new String[] { CSS, "form#belpay_credit input#docNumber" });
      // Write text in docNumber
      typeText(new String[] { CSS, "form#belpay_credit input#docNumber" }, "1234567891234");
      // Select Option from 010203040506070...
      selectOption(new String[] { CSS,
          "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" },
        "12");
      // Select Option from 202120222023202...
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
      // Click on CLICK AQUÍ PARA...
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'CLICK AQUÍ PARA CONTINUAR\')]" });
      // wait
      waitUntil("CheckClickableElement", new String[] { CSS, "input[type='checkbox']" }, "15", "disabled");
      // Click on Terms1
      clickOnElement(new String[] { CSS, "input[type=\"checkbox\"]" });
      // wait
      waitUntil("CheckClickableElement", new String[] { XPATH, "//button[text() = ' Finalizar tu compra']" }, "20",
        "disabled");
      // Click on Finalizar tu co...
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Finalizar tu compra\')]" });
      // if successful message present
      if (isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" })) {
        // Add Assertion for successful message
        Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]" }));
        // end if successful message present
      }
      // Start else statement
      else {
        // Print action
        printResults("PrintNote", "Element is not present");
        // end else statement
      }
      // Mail Validation
      // Open New Tab
      openNewTab("OpenNewTab");
      pageRefresh();
      // Go To URL
      getURL("https://www.mailinator.com/");
      // if search  present
      if (isElementAvailable(new String[] { XPATH, "//input[@id=\'search\']" })) {
        // Write Text In search bar text field
        typeText(new String[] { XPATH, "//input[@id=\'search\']" }, "ec.esc2.mto.fb@gmail.com");
        // Press Enter Key
        pressKey(new String[] { XPATH, "//input[@id=\'search\']" }, "ENTER");
        // end if  search present
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"search bar is not present\"");
        // end else statement
      }
      // wait until order email
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[contains(text(),'just now')]" }, "60", "ten");
      // start if statement for mail
      if (isDisplayed(new String[] { XPATH, "//div[contains(text(),\'just now\')]" }, 0)) {
        // click  on first email
        clickOnElement(new String[] { XPATH, "(//tr[@ng-repeat=\"email in emails\"])[1]" });
        // take a screen shot for mail validation
        takeScreenshot("logs/Screenshoots/kenxis.png");
        // end if statement
      }
      // start else statemnet
      else {
        // print in result
        printResults("PrintNote", "\"mail for the particular order didn\'t come\"");
        // end else statement
      }
      // switch back to initial tab
      switchToPreviousTab();
      // end if Look For Button present
    }
    // Start else statement
    else {
      // Print action
      printResults("PrintNote", "Element is not present");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void TONE__LBEL_DROP_BAR_Product_with_Variants_COneFourThreeFour__CThreeTwoThreeSix() {
    javascriptExecution("lambda-name=TONE  LBEL DROP BAR Product with Variants COneFourThreeFour  CThreeTwoThreeSix");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    // Close  \"Boost the business\" Pop up
    clickOnElement(new String[] { CSS, "button#cboxClose" });
    // if Makeup category present
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Maquillaje\']" })) {
      // Click on Makeup
      clickOnElement(new String[] { XPATH, "//h3[text()=\' Maquillaje\']" });
      // Click On First Product
      clickOnElement(new String[] { XPATH, "//div[@class=\"details\"]/a" });
      // Handle popup alert
      moveAndClickWithOffset(new String[] { XPATH, "(//div[@class=\'yCmsComponent brand-logo\'])[1]" }, 30, 40);
      // Handle popup
      moveAndClickWithOffset(new String[] { XPATH, "(//div[@class=\'yCmsComponent brand-logo\'])[1]" }, 30, 40);
      // Click on TONE textfield
      clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" });
      // Select first option
      clickOnElement(new String[] { CSS, "div#cboxLoadedContent > div > ul > li:nth-of-type(1) > div > div > span" });
      // validate Selected option is visible
      Assert.assertTrue(
        isElementDisplayed(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" }));
      // Click on Tone Text field
      clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" });
      // Handle Subscribe Me Popup
      moveAndDoubleClickWithOffset(new String[] { XPATH, "//a[text()=\'sets\']" }, 65, 170);
      // Start If Statement
      if (isElementClickable(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[2]" })) {
        // if third option present
        if (isElementClickable(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[3]" })) {
          // Select Third option
          clickOnElement(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[3]" });
          // validate Selected option is visible
          Assert.assertTrue(isElementDisplayed(
            new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" }));
          // End If Statement
        }
        // Start else
        else {
          // Print action
          printResults("PrintNote", "Element is not present");
          // end else statement
        }
        // end if third option present
      }
      // Start else third option present
      else {
        // Print action
        printResults("PrintNote", "Third option is not present");
        // end else third option present
      }
      // end if makeup category present
    }
    // Start else for  makeup category present
    else {
      // Print action
      printResults("PrintNote", "makeup category is not present");
      // end  else for  makeup category present
    }

    status = "passed";
  }

  @Test
  public void I_want_to_receive_advice_from_the_consultants_pop_upCOneSevenFiveOne() {
    javascriptExecution("lambda-name=I want to receive advice from the consultants pop upCOneSevenFiveOne");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
    // Click on buy through an consultant banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Click on Assign me as consultant button
    clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-asign-consultant\']" });
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxLoadedContent\']" }, 0)) {
      // Print Result
      printResults("PrintNote", "\"Consultant Popup is not Present\"");
      // End if
    }
    // start else statement
    else {
      // Click on Assign me as consultant button
      clickOnElement(new String[] { XPATH, "//button[@class=\'btn btn-black btn-block js-asign-consultant\']" });
      // end else statement
    }
    // Click on want to receive advice from consultant check box
    clickOnElement(new String[] { NAME, "consultantClientData" });
    // write text in first name textbox
    typeText(new String[] { ID, "belcorpConsultantClientForm.firstName" }, "photon");
    // write text in surname textbox
    typeText(new String[] { ID, "belcorpConsultantClientForm.lastName" }, "test");
    // write text in email textbox
    typeText(new String[] { ID, "belcorpConsultantClientForm.email" }, "photontest@endtest-mail.io");
    // write text in telephone textbox
    typeText(new String[] { ID, "belcorpConsultantClientForm.phone" }, "7804567349");
    // click on buy with me button
    clickOnElement(new String[] { XPATH, "(//button[@class=\'btn btn-black btn-block\'])[2]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" })) {
      // Add Assertion for consultant name will be displayed in homepage
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Backend__MTO_ECOM__PE__CO__CL__MX_EC_Consultant_search_engine_Twozero_with_integration_of_Datalake_consultantsCOneSevenFiveTwo__CThreeOnezeroTwo() {
    javascriptExecution(
      "lambda-name=Backend  MTO ECOM  PE  CO  CL  MX EC Consultant search engine Twozero with integration of Datalake consultantsCOneSevenFiveTwo  CThreeOnezeroTwo");

    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");
    // Select Option from Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "PE-DEP-06");
    // if Look For Button present
    if (isElementAvailable(new String[] { XPATH, "//button[text() = \" Buscar\"]" })) {
      // Click On Look For Button
      clickOnElement(new String[] { XPATH, "//button[text() = \" Buscar\"]" });
      // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
      // Click on Assign Me A Consultant Button
      clickOnElement(new String[] { XPATH, "//button[text() = \" ASIGNARME UNA CONSULTORA\"]" });
      // Take Snip Of Consultant Popup
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
        "logs/Screenshots/kzysvE.png");
      // Click On Shop With me Button
      clickOnElement(new String[] { XPATH, "//a[@id=\'js-buy-with-me\']" });
      // Add Assertion For Homepage Contains That Particular Consultant Name
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
      // Click On That Commercial Banner For Particular Consultant
      clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
      // click on Choose Another Consultant In The Popup
      clickOnElement(new String[] { XPATH, "//a[text()=\'Elige otra consultora\']" });
      // Take ScreenShot
      takeScreenshot("logs/Screenshoots/LJtaCs.png");
      // end if look for button present
    }
    // Start else statement
    else {
      // Print action
      printResults("PrintNote", "Element is not present");
      // end else statement
    }
    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-lbel.tiendabelcorp.com/mx/");
    // Click On Consultant Banner
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
      // click on close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if statement
    }
    // start else statement
    else {
      // Print result
      printResults("PrintNote", "\"popup is not present\"");
      // end else
    }
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");
    // Select Option From Province DropDown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "MX-MEX");
    // Search Consultant Using Assign Me As Consultant Button
    // Click On Look For Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='resultConsultantsSearch-message']" }, "15",
      "disabled");
    // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
    // Add Assertion For Total no of consultant Result showing
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'results-table-cell results-left results-strong\']" }));
    // if present
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" })) {
      // Click on Assign Me A Consultant Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='cboxContent']" }, "20", "disabled");
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxContent\']" }, 0)) {
        // Take Snip Of Consultant Popup
        takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
          "logs/Screenshots/elfDnA.png");
        // Click On Shop With me Button
        clickOnElement(new String[] { XPATH, "//a[@id=\'js-buy-with-me\']" });
        // if present
        if (isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" })) {
          // Add Assertion For Homepage Contains That Particular Consultant Name
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
          // Click On That Commercial Banner For Particular Consultant
          clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
          // click on Choose Another Consultant In The Popup
          clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Elige otra consultora\')]" });
          // Take ScreenShot
          takeScreenshot("logs/Screenshoots/MImNLe.png");
          // end if
        }
        // start else statement
        else {
          // print result
          printResults("PrintNote", "\"consultant popup is not visible\"");
          // end else
        }
        // end if
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }
      // end if statement
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"element not present\"");
      // end else
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To Url
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    // Click On Consultant Banner
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
      // click on close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if statement
    }
    // start else statement
    else {
      // Print result
      printResults("PrintNote", "\"popup is not present\"");
      // end else
    }
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");
    // Select Option From Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "CL-REG-02");
    // Search Consultant Using Assign Me As Consultant Button
    // Click On Look For Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='resultConsultantsSearch-message']" }, "15",
      "disabled");
    // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
    // Add Assertion For Total no of consultant Result showing
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'results-table-cell results-left results-strong\']" }));
    // if present
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" })) {
      // Click on Assign Me A Consultant Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='cboxContent']" }, "20", "disabled");
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxContent\']" }, 0)) {
        // Take Snip Of Consultant Popup
        takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
          "logs/Screenshots/MnqsPG.png");
        // Click On Shop With me Button
        clickOnElement(new String[] { XPATH, "//a[@id=\'js-buy-with-me\']" });
        // if present
        if (isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" })) {
          // Add Assertion For Homepage Contains That Particular Consultant Name
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
          // Click On That Commercial Banner For Particular Consultant
          clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
          // click on Choose Another Consultant In The Popup
          clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Elige otra consultora\')]" });
          // Take ScreenShot
          takeScreenshot("logs/Screenshoots/pYeNuQ.png");
          // end if
        }
        // start else statement
        else {
          // print result
          printResults("PrintNote", "\"consultant popup is not visible\"");
          // end else
        }
        // end if
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }
      // end if statement
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"element not present\"");
      // end else
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-lbel.tiendabelcorp.com/co/");
    // Click On Consultant Banner
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
      // click on close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if statement
    }
    // start else statement
    else {
      // Print result
      printResults("PrintNote", "\"popup is not present\"");
      // end else
    }
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // switch to next tab
    switchToNextWindow();
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");
    // Select Option From Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "CO-DEP-01");
    // Search Consultant Using Assign Me As Consultant Button
    // Click On Look For Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='resultConsultantsSearch-message']" }, "15",
      "disabled");
    // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
    // Add Assertion For Total no of consultant Result showing
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'results-table-cell results-left results-strong\']" }));
    // if present
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" })) {
      // Click on Assign Me A Consultant Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='cboxContent']" }, "20", "disabled");
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxContent\']" }, 0)) {
        // Take Snip Of Consultant Popup
        takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
          "logs/Screenshots/vgSBcH.png");
        // Click On Shop With me Button
        clickOnElement(new String[] { XPATH, "//a[@id=\'js-buy-with-me\']" });
        // if present
        if (isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" })) {
          // Add Assertion For Homepage Contains That Particular Consultant Name
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
          // Click On That Commercial Banner For Particular Consultant
          clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
          // click on Choose Another Consultant In The Popup
          clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Elige otra consultora\')]" });
          // Take ScreenShot
          takeScreenshot("logs/Screenshoots/xFwSxR.png");
          // end if
        }
        // start else statement
        else {
          // print result
          printResults("PrintNote", "\"consultant popup is not visible\"");
          // end else
        }
        // end if
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }
      // end if statement
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"element not present\"");
      // end else
    }
    // clear cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://s1-lbel.tiendabelcorp.com/ec/");
    // Click On Consultant Banner
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='content']/span" }, "10", "disabled");
    // Add Assertion For Commercial Banner
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\'content\']/span" }).contains(
      "COMPRA A TRAVÉS DE UNA CONSULTORA ONLINE"));
    // start if statement
    if (isDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }, 0)) {
      // click on close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // end if statement
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // Click on Commercial Banner
    clickOnElement(new String[] { XPATH, "//div[@class=\'content\']/span" });
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.firstName\']" }, "a");
    // Write text in consultant Surname
    typeText(new String[] { XPATH, "//input[@id=\'consultantSearch.lastName\']" }, "a");
    // Select Option From Province Dropdown
    selectOption(new String[] { CSS, "select[class=\"form-control\"]" }, "000001");
    // Search Consultant Using Assign Me As Consultant Button
    // Click On Look For Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Buscar\')]" });
    // wait
    waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@class='resultConsultantsSearch-message']" }, "15",
      "disabled");
    // Add Assertion For message( Total no Of Consultant Result shown  For Partcular Location)
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'resultConsultantsSearch-message\']" }));
    // Add Assertion For Total no of consultant Result showing
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\'results-table-cell results-left results-strong\']" }));
    // if present
    if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" })) {
      // Click on Assign Me A Consultant Button
      clickOnElement(new String[] { XPATH, "//button[contains(text(),\'ASIGNARME UNA CONSULTORA\')]" });
      // wait
      waitUntil("CheckVisibleElement", new String[] { XPATH, "//div[@id='cboxContent']" }, "20", "disabled");
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'cboxContent\']" }, 0)) {
        // Take Snip Of Consultant Popup
        takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\'cboxContent\']" },
          "logs/Screenshots/KByyUu.png");
        // Click On Shop With me Button
        clickOnElement(new String[] { XPATH, "//a[@id=\'js-buy-with-me\']" });
        // if present
        if (isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" })) {
          // Add Assertion For Homepage Contains That Particular Consultant Name
          Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']" }));
          // Click On That Commercial Banner For Particular Consultant
          clickOnElement(new String[] { XPATH, "//span[@class=\'consultant-info\']" });
          // click on Choose Another Consultant In The Popup
          clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Elige otra consultora\')]" });
          // Take ScreenShot
          takeScreenshot("logs/Screenshoots/lfSccX.png");
          // end if
        }
        // start else statement
        else {
          // print result
          printResults("PrintNote", "\"consultant popup is not visible\"");
          // end else
        }
        // end if
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"element is not present\"");
        // end else statement
      }
      // end if statement
    }
    // start else
    else {
      // Print Result
      printResults("PrintNote", "\"element not present\"");
      // end else
    }

    status = "passed";
  }
}