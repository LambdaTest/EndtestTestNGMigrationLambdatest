package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression_Peru_MTO extends WebDriverHelper {

 
  @Test
  public void Validate_modal__Choose_toneC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/sets/c/cyzone-32/mitiendaonlineelizabeth");
// Click on esika
clickOnElement( new String[] {XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-esika\']"});
// Click on sets
clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
// Execute loop if shades are available for this product
if (isElementAvailable(new String[] { ID, "selectVariable"})){
// Click on product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[2]"});
// Click on choose shade
clickOnElement( new String[] {ID, "selectVariable"});
// Assertion on shade
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\"row variantItemModalContainer\"])[5]"}));
// Click on input
clickOnElement( new String[] {CSS, "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > input"});
// Click on Apply
clickOnElement( new String[] {CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button"});
// End of if loop
}
// page refresh
pageRefresh();
// Click on LBel
clickOnElement( new String[] {XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"sets\"]"})){
// Click on sets
clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
// Click on product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[4]"});
// End of if loop
}
// start of if loop
if (isElementAvailable(new String[] { ID, "selectVariable"})){
// Click on choose tone
clickOnElement( new String[] {ID, "selectVariable"});
// select input
clickOnElement( new String[] {XPATH, "(//input[@type=\"checkbox\"])[5]"});
// Click on Apply
clickOnElement( new String[] {XPATH, "(//button[text()=\' APLICAR\'])[2]"});
// End of if loop
}
// refresh
pageRefresh();
// Click on cyzone
clickOnElement( new String[] {XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-cyzone\']"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"sets\"]"})){
// Click on sets
clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
// Click on product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[3]"});
// End of if loop
}
// start of if loop
if (isElementAvailable(new String[] { ID, "selectVariable"})){
// Click on choose shade
clickOnElement( new String[] {ID, "selectVariable"});
// Click on input
clickOnElement( new String[] {XPATH, "(//input[@type=\"checkbox\"])[21]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//button[@id=\"yie-close-button-4cefd59f-96cb-5194-8b6b-121ed0fdd93a\"]"})){
// Handle popup
clickOnElement( new String[] {XPATH, "//button[@id=\"yie-close-button-4cefd59f-96cb-5194-8b6b-121ed0fdd93a\"]"});
// End of if loop
}
// Click on Apply
clickOnElement( new String[] {CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button"});
// assertion on \"choose tone\"
Assert.assertTrue(isElementAvailable(new String[] { ID, "selectVariable"}));
// End of if loop
}

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_cyzone_levelsC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://cyzone.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
// Click on studio look
clickOnElement( new String[] {XPATH, "//div[@class=\"yCmsComponent js_nav__link\"]/a[text() = \"studio look\"]"});
// goback for popup handling
goBack();
// gofrwd for popup handling
goForward();
// Click on Lápiz Delineador De Ojos En Gel Studio Look
clickOnElement( new String[] {ID, "product_productName_P0132051003"});
// Add Assertion for Lápiz Delineador De Ojos En Gel Studio Look
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Add Assertion for promotion exclusive
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]"}));
// start if statement for 1x and 2x gift card
if (isElementAvailable(new String[] { XPATH, "//div[text() = \"Promoción 1x 2x\"]"})){
// Add Assertion for promotion 1x 2x...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promoción 1x 2x\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"1x 2x gift card not available \"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_Lbel_levelsC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[text() = \"maquillaje\"]"});
// Click on Infini Lápiz Labial Hidratante Mate
clickOnElement( new String[] {ID, "product_productName_P0280084002"});
// Add Assertion for Infini Lápiz Labial Hidratante Mate
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// start if statement for 1x 2x gift card
if (isElementAvailable(new String[] { XPATH, "//div[text() = \"Promoción 1x 2x\"]"})){
// Add Assertion for promotion exclusive
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]"}));
// Add Assertion for promotion 1x 2x...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promoción 1x 2x\"]"}));
// end if statement
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"1x 2x card is not available\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void TV__Validations_in_the_modification_of_Personal_Data_functionalityC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To consultant  URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=matiaboutique");
// click on consultant
clickOnElement( new String[] {CSS, "span[class=\"glyphicon glyphicon-chevron-right\"]"});
// add assertion for consultant picture
Assert.assertTrue(isElementAvailable(new String[] { CSS, "li[class=\"consultant-thumb\"]"}));
// Add Assertion for consultant name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']"}));
// Go to user Login URL
getURL("https://s1-esika.tiendabelcorp.com/pe/login");
// Write text in username
typeText(new String[] { ID, "j_username" }, "test_user_9496384@testuser.com");
// Write text in password
typeText(new String[] { ID, "j_password" }, "Qatest8016");
// Click on login button
clickOnElement( new String[] {CSS, "form#loginForm > button"});
// Click on  my Account Links Header
clickOnElement( new String[] {XPATH, "//a[@class=\'myAccountLinksHeader collapsed js-myAccount-toggle\' and @data-parent=\'.nav__right\']"});
// Click on my personal information
clickOnElement( new String[] {XPATH, "//a[text() = \"mis datos personales\"]"});
// Add Assertion for PERSONAL INFORMATION
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"account-section-header\"]"}));
// Click on profile firstName
clickOnElement( new String[] {ID, "profile.firstName"});
// clear text field
clearText(new String[] {ID, "profile.firstName"});
// Click on personal Data Submit Btn
clickOnElement( new String[] {ID, "personalDataSubmitBtn"});
// Add Assertion for Please correct the errors below.
Assert.assertTrue(isElementAvailable(new String[] { CSS, "span"}));
// Add Assertion for profile firstName errors
Assert.assertTrue(isElementAvailable(new String[] { ID, "firstName.errors"}));
// cleardata
clearText(new String[] {ID, "profile.lastName"});
// Click on personal Data Submit Btn
clickOnElement( new String[] {ID, "personalDataSubmitBtn"});
// Add Assertion for profile lastName
Assert.assertTrue(isElementAvailable(new String[] { ID, "lastName.errors"}));
// Click on personalData Submit Btn
clickOnElement( new String[] {ID, "personalDataSubmitBtn"});
// Select Option from Please select profile title
selectOption(new String[] { ID, "profile.title" }, "mrs");
// clear first name
clearText(new String[] {ID, "profile.firstName"});
// write special character in first name
typeText(new String[] { ID, "profile.firstName" }, "%testPE");
// Add Assertion for invalid character profile firstName errormsg
Assert.assertTrue(isElementAvailable(new String[] { ID, "invalid_chars_profile.firstName_error_msg"}));
// clear last name
clearText(new String[] {ID, "profile.lastName"});
// write text with special character
typeText(new String[] { ID, "profile.lastName" }, "12preubaPE");
// Add Assertion for invalid character profile lastName errormsg
Assert.assertTrue(isElementAvailable(new String[] { ID, "invalid_chars_profile.lastName_error_msg"}));
// clear text
clearText(new String[] {ID, "profile.firstName"});
// Write text in profile firstNa...
typeText(new String[] { ID, "profile.firstName" }, "testPE");
// clear input last name
clearText(new String[] {ID, "profile.lastName"});
// Write text in profile lastName
typeText(new String[] { ID, "profile.lastName" }, "preubaPE");
// Click on personal Data SubmitBtn
clickOnElement( new String[] {ID, "personalDataSubmitBtn"});
// Add Assertion for success alert
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"alert alert-success alert-dismissable\"]"}));

    status = "passed"; 
   }
  @Test
  public void PE__EE_Set_variable_conditional__supported__Free_Shipping__Agency_BankingC__PHASE() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=hohammed");
// Click on Makeup
clickOnElement( new String[] {XPATH, "//a[@title=\'Maquillaje\']"});
// Click On Secound Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[2]"});
// Add Assertion For Exculsive Promotion
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[@class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']"}));
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver productos\"]"})){
// Click on See Products For Combination
javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
// Click On ES PRO PERLAS NUDE
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'ES PRO PERLAS NUDE\')]"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver combinaciones\"]"})){
// Add Assertion For See Combination
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver combinaciones\"]"}));
// Click On See Combination
javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
// Add Assertion For Product Present
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'name\']"}));
// Click On First Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Add Assertion for old price
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion For active price
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for qty selector button (+)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
// Add Assertion for qty selector button (-)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
// Add Assertion For Share Link
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'share-btn-icon shareBtnShare\']"}));
// end if statement
}
// start else statement
else{
// print
printResults("PrintNote", "\"see combination is not present\"");
// end else
}
// end if
}
// start else statement
else{
// Print Result
printResults("PrintNote", "\"See Products is not present\"");
// End else statement
}
// Add Assertion For Add To Cart Button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"}));
// Click on Add to cart button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for Remove Button
Assert.assertTrue(isElementClickable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a"}));
// Add Assertion for qty selector button (+)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]"}));
// Add Assertion for qty selector button (+)
Assert.assertFalse(isElementClickable(new String[] { XPATH, "(//button[text()=\'-\'])[2]"}));
// Add Assertion For product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'item__name\']"}));
// Add assertion For Product Image
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__image > a > img"}));
// Click on Go Pay Button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// Login as Guest User
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Click On Address Submit Button
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Checkout using credit card
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// start if statement
if (isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"})){
// Add Assertion For Congratulation Message
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));
// end if statement
}

    status = "passed"; 
   }
  @Test
  public void PE__EE_create_account__Tiered_Discount__CCC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Go to login URL
getURL("https://s1-esika.tiendabelcorp.com/pe/login");
// write text in username text field
typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
// write text in password text field
typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
// click on login button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Iniciar sesión\')]"});
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[text()=\'maquillaje\']"});
// wait untill first product
waitUntil("CheckClickableElement", new String[]{XPATH, "(//div[@class='details']/a)[2]"}, "10","disabled");
// click on first product
clickOnElement( new String[] {XPATH, "(//div[@class=\"details\"]/a)[2]"});
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]"}));
// add assertion for crossed out prce
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]"}));
// add assertion for sale price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]"}));
// Add assertion for qty selector
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@id=\'pdpAddtoCartInput\']"}));
// add assertion for share
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"}));
// start if statement for promotion exclusives
if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"})){
// start if statement for conditional promotions
if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Promoción condicionada\')]"})){
// click on see combinations
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ver combinaciones\')]"});
// Add Assertion for conditional promotion products
Assert.assertTrue(checkCurrentUrlContains( "isConditionOf"));
// Take a screen shot to Validate that the list of products conditional for the promotion is displayed
takeScreenshot("logs/Screenshoots/CvqjWO.png");
// Go back to PDP
goBack();
// wait until add to cart button clickeble
waitUntil("CheckClickableElement", new String[]{XPATH, "//button[@id='addToCartButton']"}, "10","disabled");
// end if statement for conditional promotion
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"conditional promotion gift card for product not found \"");
// end else statement
}
// end if statement for promotion exclusives
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"promotional conditions not found\"");
// end else statement
}
// start if statement for add to cart button
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// add assertion for qty increase/decrease btn
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]"}));
// take a snip to validate product title /CUV/stock
takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" },"logs/Screenshots/CoigbO.png");
// add assertion for eliminate link
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a"}));
// start if statement for tiered discount
if (isElementAvailable(new String[] { XPATH, "//span[@class=\"cart-entry-message\"]"})){
// change the qty of product
pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]"}, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
// increase the qty
typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" }, "2");
// press enter
pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]"}, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
// add assertion for tiered discount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"tiered discount  not found\"");
// end else statement
}
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement for add to cart
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"add to cart button not clickeble\"");
// end else statement
}
// wait until address submit
waitUntil("CheckClickableElement", new String[]{CSS, "button#addressSubmit"}, "10","disabled");
// click on address submit button
clickOnElement( new String[] {CSS, "button#addressSubmit"});
// Click On Credit Card Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();
");
// wait for add new card
waitUntil("CheckClickableElement", new String[]{CSS, "div#mpagoCreditCardDiv a#add-new-card"}, "10","disabled");
// click on add new card
clickOnElement( new String[] {CSS, "div#mpagoCreditCardDiv a#add-new-card"});
// wait until credit card
waitUntil("CheckClickableElement", new String[]{CSS, "form#mpago_credit input#cardholderName"}, "10","disabled");
// fill name in credit card
typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "APRO");
// write credit card number
typeText(new String[] { CSS, "input#cardNumber" }, "4009 1753 3280 6176");
// select month from dropdown
selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
// select year from dropdown
selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
// fill security code
typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
// fill doc number
typeText(new String[] { CSS, "input#docNumber" }, "12345678");
// accept terms and condition
clickOnElement( new String[] {CSS, "input#Terms1_mpagoCreditCardForm"});
// click on pay button
clickOnElement( new String[] {CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
// start if statement for sucess message
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for sucess message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End if statement for sucess message
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"the entered credit card number is not proper\"");
// end else statement
}
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Go to login URL
getURL("https://s1-esika.tiendabelcorp.com/pe/login");
// write text in username text field
typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
// write text in password text field
typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
// click on login button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Iniciar sesión\')]"});
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[text()=\'maquillaje\']"});
// click on first product
clickOnElement( new String[] {XPATH, "(//div[@class=\"details\"]/a)[2]"});
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"name\"]"}));
// add assertion for crossed out prce
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]"}));
// add assertion for sale price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"active-price\"]"}));
// Add assertion for qty selector
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@id=\'pdpAddtoCartInput\']"}));
// add assertion for share
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"}));
// start if statement for promotion exclusives
if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"})){
// start if statement for conditional promotions
if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Promoción condicionada\')]"})){
// click on see combinations
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ver combinaciones\')]"});
// Add Assertion for conditional promotion products
Assert.assertTrue(checkCurrentUrlContains( "isConditionOf"));
// Take a screen shot to Validate that the list of products conditional for the promotion is displayed
takeScreenshot("logs/Screenshoots/nmrVrP.png");
// Go back to PDP
goBack();
// wait until add to cart button clickeble
waitUntil("CheckClickableElement", new String[]{XPATH, "//button[@id='addToCartButton']"}, "10","disabled");
// end if statement for conditional promotion
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"conditional promotion gift card for product not found \"");
// end else statement
}
// end if statement for promotion exclusives
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"promotional conditions not found\"");
// end else statement
}
// start if statement for add to cart button
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// add assertion for qty increase/decrease btn
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]"}));
// take a snip to validate product title /CUV/stock
takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" },"logs/Screenshots/jQqvdQ.png");
// add assertion for eliminate link
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a"}));
// start if statement for tiered discount
if (isElementAvailable(new String[] { XPATH, "//span[@class=\"cart-entry-message\"]"})){
// change the qty of product
pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]"}, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
// increase the qty
typeText(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]" }, "2");
// press enter
pressKey(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]"}, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]//input[@id=\"quantity_0\"]");
// add assertion for tiered discount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"tiered discount  not found\"");
// end else statement
}
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement for add to cart
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"add to cart button not clickeble\"");
// end else statement
}
// wait until address submit
waitUntil("CheckClickableElement", new String[]{CSS, "button#addressSubmit"}, "10","disabled");
// click on address submit button
clickOnElement( new String[] {CSS, "button#addressSubmit"});
// Click On Credit Card Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();
");
// click on add new card
clickOnElement( new String[] {CSS, "div#mpagoCreditCardDiv a#add-new-card"});
// wait until
waitUntil("CheckClickableElement", new String[]{CSS, "form#mpago_credit input#cardholderName"}, "10","disabled");
// fill name in credit card
typeText(new String[] { CSS, "form#mpago_credit input#cardholderName" }, "APRO");
// write credit card number
typeText(new String[] { CSS, "input#cardNumber" }, "4009 1753 3280 6176");
// select month from dropdown
selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
// select year from dropdown
selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
// fill security code
typeText(new String[] { CSS, "form#mpago_credit input#securityCode" }, "123");
// fill doc number
typeText(new String[] { CSS, "input#docNumber" }, "12345678");
// accept terms and condition
clickOnElement( new String[] {CSS, "input#Terms1_mpagoCreditCardForm"});
// click on pay button
clickOnElement( new String[] {CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type=\'button\']"});
// start if statement for sucess message
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for sucess message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End if statement for sucess message
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"the entered credit card number is not proper\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Compra_en_tienda_virtual_Usuario_Google_efectivo_C() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on user symbol
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img"});
// Write text in username
typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "test_user_86292523@testuser.com");
// Write text in password
typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Qatest2042");
// Click on login
clickOnElement( new String[] {CSS, "main > section:nth-of-type(1) > div > div > div:nth-of-type(1) > div > form > button"});
// mouse hover perfumes for  CYZONE
mouseHoverOnElement(new String[] {XPATH, "//a[@title=\'Perfumes\']/parent::div"});
// Click on Perfumes
clickOnElement( new String[] {CSS, "a[href=\"/pe/perfumes/hombre/perfumes/c/cyzone-030101/Produtosbetina\"]"});
// Click on perfume de hombre
clickOnElement( new String[] {CSS, "a[class=\"name\"][href=\"/pe/perfume-de-hombre-forze/p/200088457\"]"});
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on Add to cart button
clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button"});
// Click on keep buying button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)"});
// Click on L\'BEL
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img"});
// Add Assertion for BETTY RAMOS(Consultant)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \" BETTY RAMOS\"]"}));
// click on consultant profile
clickOnElement( new String[] {XPATH, "//span[text() = \" BETTY RAMOS\"]"});
// Take Screenshot
takeScreenshot("logs/Screenshoots/UcXPXi.png");
// close consultant popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// Add Assertion for search bar
Assert.assertTrue(isElementAvailable(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input"}));
// Write text in search bar
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume para hombre");
// Press ENTER Key
pressKey(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input"}, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input");
// Click on Zamak Perfume p...
clickOnElement( new String[] {CSS, "a[class=\"name\"][href=\"/pe/zamak/p/200094533\"]"});
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Click on Add to cart button
clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button"});
// Click on keep buying button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)"});
// Click on Esika
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img"});
// Write text in search bar
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "magnat");
// press enter key
pressKey(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input"}, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input");
// Click on Magnat
clickOnElement( new String[] {CSS, "a[class=\"name\"][href=\"/pe/magnat/p/200100838\"]"});
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Click on Add to cart button
clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if
}
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "20","disabled");
// Click On Address Submit Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "10","disabled");
// Checkout Using
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// Add Assertion for confirmation message
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));

    status = "passed"; 
   }
  @Test
  public void Validate_Cyzone_card_stylesC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"sets\"]"})){
// Click on sets
clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
// Refresh
pageRefresh();
// Click on CZ DANCING NIGHT FEMALE FRAGRANCES
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[4]"});
// end if statement
}
// start else Statement
else{
// Print Result
printResults("PrintNote", "\"Set Section Is not Present\"");
// End else Statement
}
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]"})){
// scroll to promotion
scrollIntoElementView( new String[] { CSS, "h3[class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']"});
// Add Assertion for see gift details
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver detalle del regalo\"]"}));
// click on see gift details
clickOnElement( new String[] {XPATH, "//a[text() = \"Ver detalle del regalo\"]"});
// Add Assertion for Delineador Líqu...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'modal-title productVariantSelectedDataName\'])[7]"}));
// Click on cboxClose
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// end if statement
}
// start else statement
else{
// print statement
printResults("PrintNote", "\"element is not present\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_conditioned_EsikaCC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Perfume
clickOnElement( new String[] {XPATH, "//a[text()=\'perfumes\']"});
// Click on Random product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[12]/child::div[2]/child::a"});
// Add Assertion for Active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"})){
// Add Assertion for Promociones exc...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"}));
// Add assertion for available promotion
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-header\']/child::div"}));
// scroll down to  SEE products
scroll("ScrollDown", 445);
// Add assertion for SEE products
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a"}));
// Click on SEE PRODUCTS Link
clickOnElement( new String[] {XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a"});
// Add assertion for search results Text
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'results\']/child::h1"}));
// Add Assertion for products
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'pagination-bar-results\']"}));
// End If Statement
}
// Start Else Statement
else{
// Promotion Exclusive is not available
printResults("PrintNote", "Promotion Exclusive is not present");
// End Else Statement
}

    status = "passed"; 
   }
  @Test
  public void PE__EE_apply_Discount_coupon__CCC__C() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a"});
// start if statement for add to cart button
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// start if statement for promo
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"})){
// click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement
}
// start else statement
else{
// apply gift coupon code
typeText(new String[] { CSS, "input#js-voucher-code-text" }, "REGRESION");
// click on apply
clickOnElement( new String[] {CSS, "button#js-voucher-apply-btn"});
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end else statement
}
// end if statement for add to cart
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"add to cart button not clickeble\"");
// end else statement
}
// peru guest user login
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// peru shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// peru credit card details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// start if statement for sucess message
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for sucess message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End if statement for sucess message
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"the entered credit card number is not proper\"");
// end else statement
}
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to  URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// click on personal care
clickOnElement( new String[] {XPATH, "//a[@title=\'Cuidado personal\']"});
// click on first product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[2]"});
// Click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Validate if coupon is available
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'js-voucher-code-text\']"})){
// Write text in coupon text field
typeText(new String[] { XPATH, "//input[@id=\'js-voucher-code-text\']" }, "ECMTO");
// click on apply coupon button
clickOnElement( new String[] {XPATH, "//button[@id=\'js-voucher-apply-btn\']"});
// start if statement forcoupon apply
if (isElementAvailable(new String[] { XPATH, "//div[@id=\'voucherSuccessMessageDesktop\']"})){
// Add Assertion For Coupon apply message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'voucherSuccessMessageDesktop\']"}));
// end if statement for coupon apply msg
}
// End If Statement
}
// Start Else Statement
else{
// Coupon is not available
printResults("PrintNote", "\"Coupon is not peresent\"");
// End Else Statement
}
// Click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// guest user login
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit Card Details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Check confirmation Page is present
if (checkCurrentUrlContains("orderConfirmation")) {
// Validation for\"Confirmation\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// end if statement
}
// start else statement
else{
// Print results
printResults("PrintNote", "\"payment is failed\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void PE__EE_Fixed_levels__Discount_coupon__Credid_cardCphase() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[text()=\'maquillaje\']"});
// click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]/a"});
// validation of crossed price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div > span.old-price"}));
// validation of new price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div > span.active-price"}));
// validation of qty selector
Assert.assertTrue(isElementAvailable(new String[] { CSS, "input#pdpAddtoCartInput"}));
// validation of add to bag
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// validation of share option
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"}));
// start if statement for promotion exclusives
if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"})){
// start if statement for promotion condition
if (isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Promoción condicionada\')]"})){
// add assertion for see combination
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ver combinaciones\')]"}));
// click on see product
javascriptExecution("document.querySelector(\"div#lazyLoadCommercialCarousel a\").click();
");
// add assertion for condition of
Assert.assertTrue(checkCurrentUrlContains( "condition"));
// Take a screen shot to Validate that the list of products conditional for the promotion is displayed
takeScreenshot("logs/Screenshoots/UtaZcf.png");
// Go back to PDP
goBack();
// wait until add to cart button clickeble
waitUntil("CheckClickableElement", new String[]{XPATH, "//button[@id='addToCartButton']"}, "10","disabled");
// end if statement for conditional promotion
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"see combinations gift card for product not found \"");
// end else statement
}
// end if statement for promotion exclusives
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"promotional conditions not found\"");
// end else statement
}
// start if statement for add to cart button
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// add aseertion for eliminate btn
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a"}));
// add assertion for qty selector
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__quantity.hidden-xs.hidden-sm > form#updateCartForm0"}));
// take a snip to verify CUV stock title
takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" },"logs/Screenshots/VSBMTz.png");
// add gift card
typeText(new String[] { CSS, "input#js-voucher-code-text" }, "ECMTO");
// click on  apply coupon
clickOnElement( new String[] {CSS, "button#js-voucher-apply-btn"});
// start if statement for coupon msg
if (isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span"})){
// add assertion
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#voucherSuccessMessageDesktop > span"}));
// end if
}
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement for add to cart
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"add to cart button not clickeble\"");
// end else statement
}
// peru guest user login
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// peru shipping address
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// peru credit card details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// start if statement for sucess message
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for sucess message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End if statement for sucess message
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"the entered credit card number is not proper\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void SCENARIO__Purchase_in_virtual_store__Google_User__cash_internet_bankingC() {
// clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on search Bar
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input"});
// Write text in Search bar
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > span > button > i"});
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on Perfume De Muje
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a"});
// Click on Add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Keep Buying
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__right\']/../..//a[contains(@class,\'continueShopping\')]"});
// Click on Esika
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img"});
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on  second product from carousel
clickOnElement( new String[] {XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[3]"});
// Click on Add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Keep Buying
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__right\']/../..//a[contains(@class,\'continueShopping\')]"});
// Click on Lbel
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img"});
// click on perfumes
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on Random Product
clickOnElement( new String[] {XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[16]"});
// Click on Add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on Go Pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__right\']/../..//a[@class=\'btn btn-black btn-block add-to-cart-button\']"});
// Click on Again Go Pay
clickOnElement( new String[] {XPATH, "//div[@class=\'priceContainer\']/parent::div/parent::div/child::div[2]/child::div/child::button[contains(text(),\'Ir a pagar\')]"});
// Guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Enter Shipping Details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Enter Payment Details
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// Success message is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
// Validate Success message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// End of If Loop
}

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_supported_product_LbelC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"sets\"]"})){
// Click on sets
clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
// Scroll Down
scroll("ScrollDown", 1800);
// start of if loop to check product availability
if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[1]"})){
// Click on 1st product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[1]"});
// refresh
pageRefresh();
// Scroll Down
scroll("ScrollDown", 800);
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver productos\"]"})){
// assertion on see products button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[text() = \"Ver productos\"]"}));
// Click on \"see details\"
clickOnElement( new String[] {XPATH, "//a[text() = \"Ver productos\"]"});
// End of if loop
}
// End of if loop
}
// End of if loop
}

    status = "passed"; 
   }
  @Test
  public void Purchase_in_virtual_store___C() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Click on consultant link
clickOnElement( new String[] {CSS, "span[class=\"glyphicon glyphicon-chevron-right\"]"});
// Add Assertion for Perú
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Perú\"]"}));
// If consultant name present
if (isElementAvailable(new String[] { XPATH, "//li[text() = \"ELIZABETH GONZALES\"]"})){
// Add Assertion for ELIZABETH GONZA...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"ELIZABETH GONZALES\"]"}));
// end if consultant name
}
// Add Assertion for  mail id \"liz-48@hotmail\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for number \"988453937\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-phone\"]"}));
// Click on consultant popup close button
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// wait for rose
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[@class='spanTitle ecarousel_product_productName_200098633']"}, "10","disabled");
// click on rose perfume
clickOnElement( new String[] {XPATH, "//a[@class=\'spanTitle ecarousel_product_productName_200098633\']"});
// Click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on continue shopping
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// click on esika module
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img"});
// click on esika
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']"});
// popup1
goBack();
// Click on  personal care
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// click on hair
clickOnElement( new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cabello\']"});
// Add Assertion for Acondicionador ...
Assert.assertTrue(isElementAvailable(new String[] { ID, "product_productName_200092360"}));
// click on hair oil
clickOnElement( new String[] {XPATH, "//a[@id=\'product_productName_200092360\']"});
// if add to cart present
if (isElementAvailable(new String[] { ID, "addToCartButton"})){
// Click on Add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on Continue Shopping
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// end if add to cart
}
// Click on cyzone module
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img"});
// Click on Máscara de pest...
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// Add Assertion for Máscara de pest...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Add Assertion for S/ 25.90
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"S/ 25.90\"]"}));
// Click on add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for S/ 163.80
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > span > span"}));
// Click on continue go pay
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Click on guest first Name
clickOnElement( new String[] {ID, "guest.firstName"});
// Write text in guest first Name
typeText(new String[] { ID, "guest.firstName" }, "belcorp");
// Click on guest last Name
clickOnElement( new String[] {ID, "guest.lastName"});
// Write text in guest last Name
typeText(new String[] { ID, "guest.lastName" }, "registered");
// Click on guest email
clickOnElement( new String[] {ID, "guest.email"});
// Write text in guest email
typeText(new String[] { ID, "guest.email" }, "belcorpregisteredtestuser@endtest-mail.io");
// Click on guest agree To Receive
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on guest agree
clickOnElement( new String[] {ID, "guest.belcorpToC"});
// Click on Continue button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Fill the details for shipping address
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Select for payment for checkout
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_Esika_supported_productC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[@title=\"Maquillaje\"]"});
// Click on first product in the list
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]/a"});
// Scroll Down to exclusive promoion
scroll("ScrollDown", 644);
// Add assertion for promotion exclusives
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"}));
// start if statement
if (checkContainsValue(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-header\"]"})){
// Compare card Available promotions with document Figma
getURL(https://endtest-files.s3.us-west-2.amazonaws.com/JfnPrdjNYI4tghIJrZAytPqqWP2hRo/Available.png");
takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'shadow\']" }, System.getProperty("user.dir") + "src/main/resources/files/actual_Image.png");
compareImage(new File(System.getProperty("user.dir") + "src/main/resources/files/expected_Image.png"), new File(System.getProperty("user.dir") + "src/main/resources/files/actual_Image.png"));
// Click on See products button
clickOnElement( new String[] {XPATH, "//a[text() = \"Ver productos\"]"});
// Add Assertion for Your search results
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[text() = \"Los resultados de tu búsqueda:\"]"}));
// end if statement
}
// start else staement
else{
// print in result
printResults("PrintNote", "\"promociones disponibles gift card is not available\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Validate_customer_email_order_reservationC() {
// Clearing cache before starting test
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Rose D’Amelie P
clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
// click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// back to lbel
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Loción Demaquil
clickOnElement( new String[] {XPATH, "(//div[@class=\"item-details-panel\"]//a)[1]"});
// click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on go pay continue
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Agency/Banking details
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// Go to URL
getURL("https://endtest.io/mailbox?email=purvagupta@endtest-mail.io");
// wait untill email
waitUntil("CheckClickableElement", new String[]{XPATH, "//div[@class = 'email_subject']"}, "20","disabled");
// start if statement for email
if (isElementAvailable(new String[] { XPATH, "//div[@class = \'email_subject\']"})){
// Click on confirmation mail
clickOnElement( new String[] {XPATH, "//div[@class = \'email_subject\']"});
// Add Assertion for Endtest Mailbox
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class = \'email_subject\']"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"email is not found\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_conditioned_LbelCC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://lbel.tiendabelcorp.com/pe/locion-demaquilladora-bifasica/p/200073557/Produtosbetina");
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//span[text()=\'¡Gratis!\']"})){
// Assertion on gratis offer
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'¡Gratis!\']"}));
// scroll
scroll("ScrollDown", 168);
// Assertion on see combinations button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text()=\'Ver combinaciones\']"}));
// click on next promotion arrow
clickOnElement( new String[] {XPATH, "(//span[@class=\"glyphicon glyphicon-menu-right\"])[1]"});
// click on see combination
clickOnElement( new String[] {XPATH, "(//a[@class=\"btn promotionButton\"])[1]"});
// Assertion on product list
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\"name\"]"}));
// End of if loop
}

    status = "passed"; 
   }
  @Test
  public void ALTERNATIVE_SCENARIO__TV__Change_password_functionality_validationsC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To consultant URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// click on consultant
clickOnElement( new String[] {CSS, "span[class=\"glyphicon glyphicon-chevron-right\"]"});
// Add assertion for consultant thumbnail
Assert.assertTrue(isElementAvailable(new String[] { CSS, "li[class=\"consultant-thumb\"]"}));
// Add assertion for consultant name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']"}));
// Go to user login URL
getURL("https://s1-esika.tiendabelcorp.com/pe/login");
// Add Assertion for Login with your account
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[contains(text(),\'Ingresa con tu cuenta\')]"}));
// click on forgot password
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Olvidaste tu contraseña?\')]"});
// Click on forgotten password email id
clickOnElement( new String[] {ID, "forgottenPwd.email"});
// fill   email id in forgot pwd field
typeText(new String[] { ID, "forgottenPwd.email" }, "rohith.d@endtest-mail.io");
// Click on restore pwd button
clickOnElement( new String[] {ID, "btn-forgot-pass"});
// Go to Endtest mail URL
getURL("https://endtest.io/mailbox?email=rohith.d@endtest-mail.io");
// Refresh End test mail page
pageRefresh();
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//div[text() = '=?utf-8?Q?=C3=89sika=20L'Bel=20y=20Cyzone?=']"}, "30","ten");
// Click on first email received
clickOnElement( new String[] {XPATH, "//div[text() = \"=?utf-8?Q?=C3=89sika=20L\'Bel=20y=20Cyzone?=\"]"});
// Click on reset password url
clickOnElement( new String[] {XPATH, "//font[text() = \"https://s1-esika.tiendabelcorp.com/pe/my-account/update-password\"]"});
// Add Assertion for \"Did you forget your password?\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"¿Olvidaste tu contraseña?\"]"}));
// Click on update button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]"});
// Add Assertion for \"Please correct the errors below.\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Por favor, corrija los errores a continuación.\"]"}));
// Click on password
clickOnElement( new String[] {ID, "password"});
// Write text in  NEW PASSWORD field
typeText(new String[] { ID, "password" }, "qwer");
// Write text in REPEAT YOUR NEW PASSWORD field
typeText(new String[] { ID, "password" }, "qwer");
// Click on update Pwd check button
clickOnElement( new String[] {ID, "updatePwd.checkPwd"});
// Write text in new password field
typeText(new String[] { ID, "updatePwd.checkPwd" }, "qwer");
// Click on to update button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]"});
// Add Assertion for \"Please correct the errors below.\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Por favor, corrija los errores a continuación.\"]"}));
// Add Assertion for \"password error\"
Assert.assertTrue(isElementAvailable(new String[] { ID, "pwd.errors"}));
// Click on password field
clickOnElement( new String[] {ID, "password"});
// Write text in new password
typeText(new String[] { ID, "password" }, "Qweasdzxc1815@");
// Click on my account
clickOnElement( new String[] {CSS, "main[data-currency-iso-code=\"PEN\"]"});
// Write text in repeat new password
typeText(new String[] { ID, "updatePwd.checkPwd" }, "Qweasdzxc1815@");
// Click on to update button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][class=\"btn btn-black btn-block\"]"});
// start if statement for password change
if (isElementAvailable(new String[] { CSS, "div[class=\"alert alert-success alert-dismissable\"]"})){
// Add Assertion for password change successful
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"alert alert-success alert-dismissable\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"the link used for password change is invalid\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void PE__EE_with_Search_by_CUV_with_Account_Login_and_checkout_by_CCC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=hohammed");
// Write CUV NUMBER in Search bar
typeText(new String[] { XPATH, "//input[@id=\'js-site-search-input\']" }, "07208");
// Press ENTER Key
pressKey(new String[] { XPATH, "//input[@id=\'js-site-search-input\']"}, "//input[@id=\'js-site-search-input\']");
// Click on Magnat
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for qty selector button(+)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
// Add Assertion for qty selector button(-)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"-\"]"}));
// Add Assertion for share link
Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"share-btn-icon shareBtnShare\"]"}));
// Add Assertion for Add to cart button
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button"}));
// Click on Add to cart button
clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(3) > div > div:nth-of-type(1) > form:nth-of-type(2) > button"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on button(+)
clickOnElement( new String[] {CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"});
// Add assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'item__name\']"}));
// Add assertion for product img
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@class=\'product-item-link pe\']"}));
// click on go pay button
clickOnElement( new String[] {CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Write text in username
typeText(new String[] { CSS, "input[class=\" form-control\"]" }, "srdas96@hotmail.com");
// Write text in password
typeText(new String[] { CSS, "input[class=\"form-control pwdShow \"]" }, "Srdas@1996");
// Click on login
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(2) > form > button"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// end if
}
// start else statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// end else
}
// Click on Address Submit Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-block checkout-next\']"});
// Checkout Using CreditCard
// Click On Credit Card Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();
");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']"});
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCodeCardSaved-error\"]" }, "123");
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_MPagoCardSavedForm_mpago_visa\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoCardSavedForm checkout-next\']"});
// Add Assertion for order no
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//p[contains(text(),\'Tu Número de Orden es:\')]"}));

    status = "passed"; 
   }
  @Test
  public void PE__EE_with_Search_by_CUV_with_Account_Login_and_checkout_by_CC__C() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=hohammed");
// Write CUV  number in search text box
typeText(new String[] { XPATH, "//div[@class=\'col-md-4 col-md-offset-4 text-center\']/../..//input[@id=\'js-site-search-input\']" }, "18567");
// Click on search
clickOnElement( new String[] {XPATH, "//div[@class=\'col-md-4 col-md-offset-4 text-center\']/../..//button[@class=\'btn js_search_button searchBoxButtonIconShort\']"});
// if product present
if (isElementAvailable(new String[] { XPATH, "//a[@id=\'product_thumb_200092361\']"})){
// Click on Product image
clickOnElement( new String[] {XPATH, "//a[@id=\'product_thumb_200092361\']"});
// Validate that the price is crossed out
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']"}));
// Validate quantity selector
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@id=\'pdpAddtoCartInput\']"}));
// Validate that the button is activated
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// Validate copy and share
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'share-btn-icon shareBtnShare\']"}));
// Validate change of tone (image1)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'slick-slide slick-current slick-active\']"}));
// Validate change of tone (image2)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'slick-slide slick-active\']"}));
// click on \"add to cart\" button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Validate Go to cart mode
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"}));
// Validate \"continue shopping\" button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@class=\'continueShopping btn btn-just-border btn-block js-mini-cart-close-button\']"}));
// click on \"go pay\" button
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// Validate trash icon
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a"}));
// Modify quantities
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)"}));
// Validate cart \"go pay\" button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'actions\']/../..//button[@id=\'checkout-display-continueCheckout\']"}));
// click cart \"go pay\" button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/../..//button[@id=\'checkout-display-continueCheckout\']"});
// FIll the guest user login
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// click on go pay button
// if condition for \" go pay\" present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
// if condition for \" go pay\" clickable
if (isElementClickable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
// click on \"go pay\" button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if for \"go pay\" clickable
}
// Else statement \"go pay\" clickable
else{
// Print message not clickable
printResults("PrintNote", "go pay is not clickable");
// end else \"go pay\" clickable
}
// end if for  \"go pay\" present
}
// else statement   \"go pay\" present
else{
// print message
printResults("PrintNote", "go pay is not present");
// end else statement  \"go pay\" present
}
// validate redirects to the Checkout landing
takeScreenshot("logs/Screenshoots/wjPaLO.png");
// Fill the details for shipping address
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Fill the credit card details and proceed to checkout
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// end if product present
}

    status = "passed"; 
   }
  @Test
  public void Validations_in_Remember_password_functionality__C() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
// Click on consultant link
clickOnElement( new String[] {CSS, "span[class=\"glyphicon glyphicon-chevron-right\"]"});
// Add Assertion for Perú
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Perú\"]"}));
// Add Assertion for liz-48@hotmail....
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for mobile no
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-phone\"]"}));
// Click on consultant popup close
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// Click on login logo
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > a > img"});
// Click on  forgotten Pwd
clickOnElement( new String[] {CSS, "a[href=\"#\"][data-link=\"/pe/login/pw/request\"]"});
// Add Assertion for forgotten Pwd
Assert.assertTrue(isElementAvailable(new String[] { ID, "forgottenPwd.email"}));
// Write text in forgotten Pwd
typeText(new String[] { ID, "forgottenPwd.email" }, "reject@rejected.com");
// Click on Reset
clickOnElement( new String[] {ID, "btn-forgot-pass"});
// Add assertion for forgotten password
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Restablecer contraseña\"]"}));
// Click on forgotten Pwd
clickOnElement( new String[] {ID, "forgottenPwd.email"});
// Write text in forgotten Pwd
typeText(new String[] { ID, "forgottenPwd.email" }, "belcorpregisteredtestuser@endtest-mail.io");
// Click on forgotten Pwd
clickOnElement( new String[] {ID, "btn-forgot-pass"});

    status = "passed"; 
   }
  @Test
  public void Purchase_in_virtual_store__invited_user_Gift_deliveryC() {
// clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to MTO URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Validate  consultant banner present
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']"}));
// Click on commercial banner
clickOnElement( new String[] {XPATH, "//span[@class=\'consultant-info\']"});
// Validate Consultant Name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']"}));
// Validate consultant email
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-mail\']"}));
// Validate Consultant phone
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-phone\']"}));
// Close  Consultant popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on Random Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"});
// Click on Add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on keep buying
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)"});
// Click on Lbel feature
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img"});
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on add to cart
clickOnElement( new String[] {CSS, "div:nth-child(2) > div.inner-card > div.addtocart > form > button"});
// Click on keep buying
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(2)"});
// Click on Cyzone feature
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img"});
// Click on perfumes category
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on Add to cart
clickOnElement( new String[] {CSS, "button#addToCartButton_200092333 > span:nth-of-type(2)"});
// Click on Go pay
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(4) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// Click on voucher-code
clickOnElement( new String[] {ID, "js-voucher-code-text"});
// Write text in voucher-code
typeText(new String[] { ID, "js-voucher-code-text" }, "Locura2");
// Click on Apply button
clickOnElement( new String[] {ID, "js-voucher-apply-btn"});
// Click on  Go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// Guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Select Option  departartment DD
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option from ACOBAMBAANGARAE...
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option from ANCOCHINCHIHUAS...
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address.line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "main road");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "M70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "678");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "456732876");
// Click on giftAddress
clickOnElement( new String[] {XPATH, "//div[@class=\'custom-item-checkbox\']/child::input"});
// Write text in address From Text field
typeText(new String[] { XPATH, "//label[@for=\'address.from\']/parent::div/child::input" }, "CHACAS");
// Write text in  address To Text field
typeText(new String[] { XPATH, "//label[@for=\'address.to\']/parent::div/child::input" }, "Chaitanya");
// Write text in address complete  Name
typeText(new String[] { XPATH, "//label[@for=\'address.completeNameTo\']/parent::div/child::input" }, "Karthik");
// Click on CLICK here to continue button
clickOnElement( new String[] {XPATH, "//button[@id=\'addressSubmit\']"});
// Enter Payment Details
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// start if statement for successs
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
// Validate Success message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// end if statement
}
// start else statemnet
else{
// print in result
printResults("PrintNote", "\"the checkout was not successful \"");
// end else
}

    status = "passed"; 
   }
  @Test
  public void Validate_eCommerce_displayC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to consultant URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Click on mascarilla facial de tela reductora de poros skin first
clickOnElement( new String[] {XPATH, "//a[text() = \"mascarilla facial de tela reductora de poros skin first\"]"});
// Add Assertion for mascarilla facial de tela reductora de poros skin first
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Add Assertion for exclusive promotion
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]"}));
// Add Assertion for available promotion
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]"}));
// add assertion for bundle
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-item item t1-Supported\']"}));

    status = "passed"; 
   }
  @Test
  public void Validate_card_in_esika_levelsC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'maquillaje\')]"});
// Click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]/a"});
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// start if statement for 1x 2x gift card
if (isElementAvailable(new String[] { XPATH, "//div[text() = \"Promoción 1x 2x\"]"})){
// Add Assertion for promotion exclusive
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]"}));
// Add Assertion for promotion 1x 2x...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promoción 1x 2x\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"1x 2x gift card is not available\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Validate_link_See_combinationsCC() {
// Clearing cache before starting test
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Loción Demaquil
clickOnElement( new String[] {XPATH, "(//div[@class=\"item-details-panel\"]//a)[1]"});
// handle popup
// start if for popup
if (isElementAvailable(new String[] { CSS, "button#cboxClose > span"})){
// click on close button
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"Cbox Popup was not found \"");
// end else statement
}
// Add Assertion for  Loción Demaquil
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"pdp-page\"]"}));
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver combinaciones\']"})){
// Click on see combination
clickOnElement( new String[] {XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver combinaciones\']"});
// handle popup
pageRefresh();
// Add Assertion for Product list available
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"product__listing product__grid\"]"}));
// end  if statement
}
// else statement
else{
// Ver combinaciones is not present
printResults("PrintNote", "Ver combinaciones is not present");
// end else staement
}
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://lbel.tiendabelcorp.com/pe/locion-demaquilladora-bifasica/p/200073557/Produtosbetina");
// Wait
waitForTime(4);
// scroll to promotion
scroll("ScrollDown", 139);
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div//a[text()=\'Ver combinaciones\']"})){
// click on right arrow
clickOnElement( new String[] {XPATH, "(//div[@class=\"owl-next\"])[1]"});
// Assertion on \"see combinations\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//a[text()=\'Ver combinaciones\']"}));
// scroll
scroll("ScrollDown", 128);
// Click on see combinations
clickOnElement( new String[] {XPATH, "//div[@class=\"shadow\"]//div//div//a[text()=\'Ver combinaciones\']"});
// Assertion on product list
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[1]"}));
// End of if loop
}

    status = "passed"; 
   }
  @Test
  public void Validate_added_priceC() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
// Click on perfumes
clickOnElement( new String[] {XPATH, "//img[@alt=\'Fragancias\']"});
// Click on  first product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[1]"});
// Add Assertion for product
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// handle popup
pageRefresh();
// Add assrtion for Promotion Conditional
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]"}));
// add assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Take Screenshot
takeScreenshot("logs/Screenshoots/pJGBEX.png");
// Add Assertion for add to cart
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\"addToCartButton\"]"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});

    status = "passed"; 
   }
  @Test
  public void PE__EE_Access_from_the_brands__categories_landing__guest_user_and_checkout_Agency__BankingC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to chili consultant URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// click on first product in carosul
clickOnElement( new String[] {XPATH, "//div[@class=\'productCard__title\']/child::a"});
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Click on change img 1
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img"});
// Click on change img 2
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img"});
// Click on change img 3
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img"});
// Add Assertion crossed out price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]"}));
// add assertion for qty selector
Assert.assertTrue(isElementAvailable(new String[] { ID, "pdpAddtoCartInput"}));
// start if for copy and share
if (isElementAvailable(new String[] { XPATH, "//span[contains(@class,\"shareBtnShare\")]"})){
// Add Assertion for copy and share
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[contains(@class,\"shareBtnShare\")]"}));
// end if statement
}
// start else statement
else{
// print  in result
printResults("PrintNote", "\"copy and share button not found\"");
// end else statement
}
// Add Assertion for Descripción
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h2[text() = \"Descripción\"]"}));
// Add Assertion for add to cart button
Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton"}));
// Click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for product info title
Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]"}));
// Add Assertion for  delete link
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a"}));
// Add Assertion for go pay button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"}));
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"item__name\"]"}));
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(4)"}));
// Add Assertion for total price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(5)"}));
// Click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for return Bag
Assert.assertTrue(isElementAvailable(new String[] { CSS, "a[class=\"returnBag\"]"}));
// guest user login
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// fill the address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// select agency banking and preoceed to checkout
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// start if statement for success
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add Assertion for success messgae
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// end if statement
}
// start else statemnet
else{
// print in result
printResults("PrintNote", "\"Your payment was declined. Choose another of the available payment methods\"");
// end else statement
}
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// mouse hover to perfumes
mouseHoverOnElement(new String[] {XPATH, "//a[@title=\'Perfumes\']/parent::div"});
// Click on Perfumes
clickOnElement( new String[] {CSS, "a[href=\"/pe/perfumes/hombre/perfumes/c/cyzone-030101/Produtosbetina\"]"});
// Click on perfume de homb...
clickOnElement( new String[] {ID, "product_productName_200097406"});
// Refresh To handle Subscribe Popup
pageRefresh();
// Add Assertion for Actual price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer Price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on Add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// Refresh
pageRefresh();
// click on cart symbol
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > a > div:nth-of-type(1)"});
// Add Assertion for set of product  added
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"(1)\"]"}));
// Add Assertion for qty selector button(+)
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"}));
// Add Assertion for qty selector button(+) is enabled
Assert.assertTrue(isElementClickable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"}));
// Add Assertion for qty selector button(-)
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"}));
// Add Assertion for qty selector button(-) is not enabled
Assert.assertFalse(isElementClickable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"}));
// click on qty selector(+)
clickOnElement( new String[] {CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"});
// click on qty selector(-)
clickOnElement( new String[] {CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"});
// Click on Go Pay
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Write text in  first Name
typeText(new String[] { ID, "guest.firstName" }, "Soumya");
// Write text in last Name
typeText(new String[] { ID, "guest.lastName" }, "Das");
// Write text in email
typeText(new String[] { ID, "guest.email" }, "srdas96@hotmail.com");
// Click on guest agree To Receive Publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on T&C checkbox
clickOnElement( new String[] {ID, "guest.belcorpToC"});
// Click on Continue as Guest
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ir a pagar\']"})){
// click on Go pay Button
clickOnElement( new String[] {XPATH, "//a[text()=\'Ir a pagar\']"});
// end else
}
// start else statement
else{
// print result
printResults("PrintNote", "\"element is not present\"");
// end else statement
}
// Click On Address Submit Button
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Checkout Using Agency
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// Add Assertion for ¡Gracias Soumya...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));

    status = "passed"; 
   }
  @Test
  public void Validate_modal_See_detailC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[text() = \"maquillaje\"]"});
// Click on Infini Lápiz Labial Hidratante Mate
clickOnElement( new String[] {ID, "product_productName_P0280084002"});
// Add Assertion for Infini Lápiz Labial Hidratante Mate
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// start if statement for promotion exclusive
if (isElementAvailable(new String[] { CSS, "div#lazyLoadCommercialCarousel h3"})){
// Add Assertion for promotion exclusive
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#lazyLoadCommercialCarousel h3"}));
// start if
if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ver detalle\']"})){
// click on see details
clickOnElement( new String[] {XPATH, "//a[text()=\'Ver detalle\']"});
// add assertio for products
Assert.assertTrue(checkCurrentUrlContains( "conditionedBy"));
// end if
}
// end if statement
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"see details card not availbale\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Purchase_in_virtual_store__cash_agents_and_agencies_C() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Click on consultant link
clickOnElement( new String[] {CSS, "span[class=\"glyphicon glyphicon-chevron-right\"]"});
// Add Assertion for \"Perú\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Perú\"]"}));
// if consultant name present
if (isElementAvailable(new String[] { XPATH, "//li[text() = \"ELIZABETH GONZALES\"]"})){
// Add Assertion for \"ELIZABETH GONZA\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"ELIZABETH GONZALES\"]"}));
// end if consultant name present
}
// Add Assertion for  mail id \"liz-48@hotmail\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for number \"988453937\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-phone\"]"}));
// Click on consultant popup close button
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// click on rose perfume
clickOnElement( new String[] {XPATH, "//a[@class=\'spanTitle ecarousel_product_productName_200098633\']"});
// Click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on go pay button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// Click on Continue Shopping
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// click on esika module
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img"});
// click on esika product
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']"});
// popup1
goBack();
// Mouse hover on  personal care
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// click on hair link
clickOnElement( new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cabello\']"});
// Add Assertion for Conditioner
Assert.assertTrue(isElementAvailable(new String[] { ID, "product_productName_200092360"}));
// click on hair oil
clickOnElement( new String[] {XPATH, "//a[@id=\'product_productName_200092360\']"});
// if add to cart present
if (isElementAvailable(new String[] { ID, "addToCartButton"})){
// Click on Add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on continue shopping
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// end if add to cart present
}
// Click on cyzone module
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img"});
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"S/ 25.90\"]"}));
// Click on \"Máscara de pest\"
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// Add Assertion for \"Máscara de pest\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"S/ 25.90\"]"}));
// Click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > span > span"}));
// Click on continue go pay button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Proceed as registered user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Fill the details for shipping address
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Select payment method and proceed to checkout
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");

    status = "passed"; 
   }
  @Test
  public void Validate_defined_order_of_cards_in_MTOC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to consultant URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on mascarilla facial de tela reductora de poros skin first
clickOnElement( new String[] {XPATH, "//a[text() = \"mascarilla facial de tela reductora de poros skin first\"]"});
// Add Assertion for mascarilla facial de tela reductora de poros skin first
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Add Assertion for exclusive promotion
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h3[class=\"commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\"]"}));
// Add Assertion for available promotion
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Promociones disponibles\"]"}));
// add assertion for bundle
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-item item t1-Supported\']"}));
// if add to cart enabled
if (isElementAvailable(new String[] { ID, "addToCartButton"})){
// Add Assertion for ordering add to cart btn
Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton"}));
// end if statement
}

    status = "passed"; 
   }
  @Test
  public void PurchaseInVirtualStoreGuestUserCreditCardC() {
// Clearing cache before starting test
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// move on personal care
mouseHoverOnElement(new String[] {XPATH, "//a[text()=\'cuidado personal\']"});
// Click on Cabello
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// Click on Acondicionador
clickOnElement( new String[] {ID, "product_productName_200092360"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//button[@id=\"addToCartButton\"]"})){
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "(//button[contains(text(),\'Seguir Comprando\')])[2]"});
// End If Statement
}
// gp back to cyzone
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Máscara de pest
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for add to cart
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"pdp-page\"]"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// click on checkout
clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit  Card Details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Add Assertion for order is created
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(4) > div > div > div:nth-of-type(1)"}));

    status = "passed"; 
   }
  @Test
  public void PurchaseInVirtualStoreGuestUserCreditCardCCCCC() {
// Clearing casche before starting test
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// move on personal care
mouseHoverOnElement(new String[] {XPATH, "//a[text()=\'cuidado personal\']"});
// Click on Cabello
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// Click on Acondicionador
clickOnElement( new String[] {ID, "product_productName_200092360"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on go pay
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// Click on keep buying
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// End If Statement
}
// Click on L’Bel Perú
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img"});
// Click on Rose D’Amelie P
clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on cbox
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(2)"});
// Add Assertion for Rose D’Amelie P...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2)"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// click on checkout
clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit Card Details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Add Assertion for order is created
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(4) > div > div > div:nth-of-type(1)"}));
// Clearing casche before starting test
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// move on personal care
mouseHoverOnElement(new String[] {XPATH, "//a[text()=\'cuidado personal\']"});
// Click on Cabello
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// Click on Acondicionador
clickOnElement( new String[] {ID, "product_productName_200092360"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"})){
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "(//button[contains(text(),\'Seguir Comprando\')])[2]"});
// End If Statement
}
// Click on L’Bel Perú
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img"});
// Click on Rose D’Amelie P
clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on cbox
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(2)"});
// Add Assertion for Rose D’Amelie P...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2)"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// gp back to cyzone
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Máscara de pest
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for add to cart
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"pdp-page\"]"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// click on checkout
clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit  Card Details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Add Assertion for order is created
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(4) > div > div > div:nth-of-type(1)"}));
// Clearing casche before starting test
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on esika
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(1) > img"});
// move on personal care
mouseHoverOnElement(new String[] {XPATH, "//a[text()=\'cuidado personal\']"});
// Click on Cabello
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// Click on Acondicionador
clickOnElement( new String[] {ID, "product_productName_200092360"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "(//button[contains(text(),\'Seguir Comprando\')])[2]"});
// End If Statement
}
// Click on L’Bel Perú
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(2) > img"});
// Click on Rose D’Amelie P
clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
// Add Assertion for catalog price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for offer price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Adding product to cart
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// Click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// gp back to cyzone
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Máscara de pest
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for add to cart
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"pdp-page\"]"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// Click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//a[@href=\'/pe/cart\']"});
// click on checkout
clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit card details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Add Assertion for order is created
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(4) > div > div > div:nth-of-type(1)"}));

    status = "passed"; 
   }
  @Test
  public void Validate_recommended_bundle_added_to_cartC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "(//a[text()=\'maquillaje\'])[1]"});
// start of if loop for product
if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[6]"})){
// Click on product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[1]"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ver detalle del set\']"})){
// Click on see set details
javascriptExecution("document.querySelector(\"div#lazyLoadCommercialCarousel div:nth-child(1) > div > div > div > div.commercialCarousel-pdp-footer > a\").click();
");
// click on add set
clickOnElement( new String[] {CSS, "div#cboxLoadedContent button#recommendationBundleAddToCartButton"});
// end if statement
}
// Click on Add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// End of if loop
}
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// scroll
scroll("ScrollDown", 298);
// assertion on \"product added in cart\"
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//ul[@class=\"item__list item__list__cart\"]"}));

    status = "passed"; 
   }
  @Test
  public void PE__EE_Add_supported_from_carousel_in_PDP__credit_cardCphase() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
// Go to login URL
getURL("https://s1-esika.tiendabelcorp.com/pe/login");
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// Click on maquillaje
clickOnElement( new String[] {XPATH, "//a[text()=\'maquillaje\']"});
// click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]/a"});
// validation of crossed price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div > span.old-price"}));
// validation of new price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div > span.active-price"}));
// validation of qty selector
Assert.assertTrue(isElementAvailable(new String[] { CSS, "input#pdpAddtoCartInput"}));
// validation of add to bag
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// validation of share option
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"}));
// start if statement for promotion exclusives
if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"})){
// start if statement for see product
if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ver productos\')]"})){
// add assertion for see product
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ver productos\')]"}));
// click on see product
javascriptExecution("document.querySelector(\"div#lazyLoadCommercialCarousel a\").click();
");
// add assertion for condition of
Assert.assertTrue(checkCurrentUrlContains( "condition"));
// Take a screen shot to Validate that the list of products conditional for the promotion is displayed
takeScreenshot("logs/Screenshoots/QVsiCV.png");
// Go back to PDP
goBack();
// wait until add to cart button clickeble
waitUntil("CheckClickableElement", new String[]{XPATH, "//button[@id='addToCartButton']"}, "10","disabled");
// end if statement for conditional promotion
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"see products gift card for product not found \"");
// end else statement
}
// end if statement for promotion exclusives
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"promotional conditions not found\"");
// end else statement
}
// start if statement for add to cart button
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement for add to cart
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"add to cart button not clickeble\"");
// end else statement
}
// peru guest user login
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// peru shipping address
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// peru credit card details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// start if statement for sucess message
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for sucess message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End if statement for sucess message
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"the entered credit card number is not proper\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void Validate_consulting_mail_by_request_of_your_consumerC() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Rose D’Amelie P
clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
// click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go apy
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// back to lbel
getURL("https://s1-lbel.tiendabelcorp.com/pe/rose-damelie-perfume-de-mujer/p/200098633/Produtosbetina");
// Click on lbel
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img"});
// Click on Máscara de pest
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on go pay continue
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit card details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Go to endtest mail
getURL("https://endtest.io/mailbox?email=purvagupta@endtest-mail.io");
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//div[@class = 'email_subject']"}, "10","disabled");
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class = \'email_subject\']"})){
// Click on Confirmation mail
clickOnElement( new String[] {XPATH, "//div[@class = \'email_subject\']"});
// end if statment
}
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Click on Rose D’Amelie P
clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
// click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// back to lbel
getURL("https://s1-lbel.tiendabelcorp.com/pe/rose-damelie-perfume-de-mujer/p/200098633/Produtosbetina");
// Click on lbel
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div > a:nth-of-type(3) > img"});
// Click on Máscara de pest
clickOnElement( new String[] {XPATH, "//a[text() = \"Máscara de pestañas studio look\"]"});
// click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on go pay continue
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// Login as guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Shipping address details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Credit Card Details
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
// Write Text In CardHolder name
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
// Write  Text In Card No
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
// select Option From Month Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
// Select Option From Year Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
// Select Option From DNI
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
// scroll
scrollIntoElementView( new String[] { CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Terms1 Checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Cick On Pay Button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// Go to endtest mail
getURL("https://endtest.io/mailbox?email=purvagupta@endtest-mail.io");
// wait until email
waitUntil("CheckElement", new String[]{XPATH, "//div[@class = 'email_subject']"}, "20","disabled");
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class = \'email_subject\']"})){
// Click on Confirmation mail
clickOnElement( new String[] {XPATH, "//div[@class = \'email_subject\']"});
// end if statement
}
// start else statemnet
else{
// print in result
printResults("PrintNote", "\"email is not present\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void SCENARIO__Purchase_in_virtual_store_COD_CC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
// Validate  consultant banner present
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-info\']"}));
// Click on commercial banner
clickOnElement( new String[] {XPATH, "//span[@class=\'consultant-info\']"});
// Validate Consultant Name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\'consultant-name\']"}));
// Validate consultant email
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-mail\']"}));
// Validate Consultant phone
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'consultant-phone\']"}));
// Close  Consultant popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// Explicit wait for  Perfume
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[@title='Perfumes']"}, "10","disabled");
// Click on Perfume
clickOnElement( new String[] {XPATH, "//a[@title=\'Perfumes\']"});
// Click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"});
// Click on Add to cart
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on  Go pay Button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on Again Go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// Guest user
// Write text in guest first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in guest last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
// Click on Agree To Receive Pubicity Checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
// Click on  T&C checkbox
clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
// Click on Continue as Guest Button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Validate Shipping Details
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'title deliveryAddress\']"}));
// Enter Shipping Details
// wait
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
// Select Option From Department Dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
// Select Option From Province dRopdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
// Select Option From District dropdown
selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
// Write text in address line1
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
// Write text in address line2
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
// Write text in address reference
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
// Write text in address phone
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
// wait
waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
// Click on Continue Button
clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
// Validate Payment Details
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text()=\'Método de pago\']"}));
// Validate Payment Details
Assert.assertTrue(getText(new String[] { XPATH, "//div[text()=\'Método de pago\']" }).contains("Método de pago"));
// Enter Payment Details
// Wait untill agency banking
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_cash']"}, "20","disabled");
// Click on Pago Efectivo  Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_cash\']\").click();
");
// Click on Agents & Agencies
javascriptExecution("document.querySelector(\"label[for=\'mpago_agencia\']\").click();
");
// Click on Terms1 Checkbox
javascriptExecution("document.querySelector(\"input#Terms1_mpagoCashForm\").click();
");
// Click on Pay Button
javascriptExecution("document.querySelector(\"button[type=\'button\'][class=\'btn btn-block submit_mpagoCashForm checkout-next\']\").click();");
// Success message is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
// Validate Success message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// End of If Loop
}

    status = "passed"; 
   }
}