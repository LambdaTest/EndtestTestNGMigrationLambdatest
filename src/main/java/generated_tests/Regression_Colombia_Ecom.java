package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression_Colombia_Ecom extends WebDriverHelper {

  @Test
  public void Document_type_validation_at_CheckoutCTwoEightFiveFive_PHASETwo() {
    javascriptExecution("lambda-name=Document type validation at CheckoutCTwoEightFiveFive PHASETwo");

    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
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
    // Click on Go pay Button
    clickOnElement(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]" });
    // Login As Guest User till shipping address details
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
    // wait
    waitUntil("CheckVisibleElement",
      new String[] { CSS, "form#mpago_debit div.form-subtitle.owner-document-subtitle > font > font" }, "10",
      "disabled");
    // Select NIT From Document type Dropdown
    selectOption(new String[] { CSS, "select#docTypeDebit" }, "NIT");
    // Write Text in Document Number Textbox
    typeText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" }, "123456789");
    // Validating Wrong NIT numer(Less than 10)
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@id=\'docNumberDebit-error\']" }).contains(
      "El NIT debe tener 10 caracteres numéricos"));
    // Clear Text From Document number Textbox
    clearText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" });
    // Write Text in Document Number Textbox
    typeText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" }, "12345678*@");
    // Validating Wrong NIT number Message(number with Special Character)
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@id=\'docNumberDebit-error\']" }).contains(
      "Los siguientes caracteres ingresados no son válidos: (*@), solo se aceptan números"));
    // Select OTRO option From Document type Dropdown
    selectOption(new String[] { CSS, "select#docTypeDebit" }, "Otro");
    // Clear Text From Document number Textbox
    clearText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" });
    // Write Text in Document Number Textbox
    typeText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" }, "1234");
    // Validating Error Message
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@id=\'docNumberDebit-error\']" }).contains(
      "El documento debe tener entre 5 y 20 caracteres"));
    // Select C.C option From Document type Dropdown
    selectOption(new String[] { CSS, "select#docTypeDebit" }, "CC");
    // Clear Text From Document number Textbox
    clearText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" });
    // Write Text in Document Number Textbox
    typeText(new String[] { XPATH, "//input[@id=\'docNumberDebit\']" }, "1234");
    // Validating Error Message
    Assert.assertTrue(getText(new String[] { XPATH, "//div[@id=\'docNumberDebit-error\']" }).contains(
      "El documento debe tener entre 6 y 20 caracteres"));

    status = "passed";
  }

  @Test
  public void Brand_equity_QuoteCThreeOneSevenNine() {
    javascriptExecution("lambda-name=Brand equity QuoteCThreeOneSevenNine");

    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // GoToURL ECOM
    getURL("https://s1-esika.tiendabelcorp.com/co");
    // scroll to MTO Bic Esika Quote Component
    scrollIntoElementView(
      new String[] { CSS, "p[class=\"text-align-quote-component text-content js-bic-esika-quote-text-content\"]" });
    // Assert for MTO Bic Esika Quote Component
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "p[class=\"text-align-quote-component text-content js-bic-esika-quote-text-content\"]" }));
    // scroll  to bic esika belcorp foundation
    scrollIntoElementView(
      new String[] { CSS, "h2[class=\"bic-esika-belcorp-foundation__title js-bic-esika-belcorp-foundation-title\"]" });
    // Assert for bic esika belcorp foundation
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"bic-esika-belcorp-foundation__info-section\"]" }));
    // GoToURL Consulatant URL
    getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
    // scroll to MTO Bic Esika Quote Component
    scrollIntoElementView(
      new String[] { CSS, "p[class=\"text-align-quote-component text-content js-bic-esika-quote-text-content\"]" });
    // Assert for MTO Bic Esika Quote Component
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@data-uid=\"MTOBicEsikaQuoteComponent\"]" }));
    // scroll  to bic esika belcorp foundation
    scrollIntoElementView(
      new String[] { CSS, "h2[class=\"bic-esika-belcorp-foundation__title js-bic-esika-belcorp-foundation-title\"]" });
    // Assert for bic esika belcorp foundationAssert for bic esika belcorp foundation
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"bic-esika-belcorp-foundation__info-section\"]" }));

    status = "passed";
  }
}