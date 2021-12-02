package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression_Chile_Ecquador_Consolidated extends WebDriverHelper {

 
  @Test
  public void CL__EE_Fixed_levels__Discount_coupon__Credid_cardC_PHASE() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/infini-absolu-labial-liquido-larga-duraci%c3%b3n/p/200094567/MaryEmy");
// Add Assertion For exclusive Promotion
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[@class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']"}));
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[@class=\'btn promotionButton viewDetailProductCommercialCarousel\']"})){
// Click on See Gift Details
javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton viewDetailProductCommercialCarousel\']\").click();");
// Click On close Popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// Add Assertion for old price
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion For Active Price
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
printResults("PrintNote", "\"see gift details is not present\"");
// End else statement
}
// Add Assertion For Add to cart Button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"}));
// Click on Add to cart button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for qty selector button (+)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]"}));
// Add Assertion for qty selector button (-)
Assert.assertFalse(isElementClickable(new String[] { XPATH, "(//button[text()=\'-\'])[2]"}));
// Add Assertion For Remove Button
Assert.assertTrue(isElementClickable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a"}));
// Add Assertion For product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'item__name\']"}));
// Add assertion For Product Image
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__image > a > img"}));
// Write cupon code
typeText(new String[] { XPATH, "//input[@id=\'js-voucher-code-text\']" }, "BIENVENIDO20");
// Click on Apply Button
clickOnElement( new String[] {CSS, "button#js-voucher-apply-btn"});
// Click on Go Pay Button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// Login as Guest User
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Click On Address Submit Button
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// Checkout using credit card
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// Add Assertion For Congratulation Message
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));

    status = "passed"; 
   }
  @Test
  public void EE__Scenario___BCCC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::i)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Ranking DropDown
clickOnElement( new String[] {ID, "sortOptions1"});
// Click on Highest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-desc\']"});
// select lowest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-asc\']"});
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"})){
// Increase Quantity of Product
clickOnElement( new String[] {XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"});
// Click on Keep Buying Button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"});
// End if
}
// Start Else
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End else
}
// End of If Loop
}
// Click on Lbel
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'lbel\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::i)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Ranking DropDown
clickOnElement( new String[] {ID, "sortOptions1"});
// Click on Highest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-desc\']"});
// select lowest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-asc\']"});
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"})){
// Increase Quantity of Product
clickOnElement( new String[] {XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"});
// Click on Keep Buying Button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"});
// End If
}
// Start Else Statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else
}
// End of If Loop
}
// Click on Esika
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'esika\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::img)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Ranking DropDown
clickOnElement( new String[] {ID, "sortOptions1"});
// Click on Highest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-desc\']"});
// select lowest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-asc\']"});
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"})){
// Increase Quantity of Product
clickOnElement( new String[] {XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"});
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// End If Statement
}
// Start Else
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else Statement
}
// Guest user Details
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Shipping Address Details
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// Payment Details
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// success message is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for success message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End of If Loop
}
// start else statement
else{
// Print in Console
printResults("PrintNote", "\"The entered credit card number is not proper\"");
// else statement
}
// End of If Loop
}

    status = "passed"; 
   }
  @Test
  public void CL__CYZONE_Popup_buy_the_consultant_CATEGORIESC_PHASE() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// GoToURL
getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
// wait for consultant popup
waitUntil("CheckVisibleElement", new String[]{XPATH, "(//div[@class='popup'])[2]"}, "10","disabled");
// start if statement
if (isDisplayed(new String[] { XPATH, "(//div[@class=\"popup\"])[2]"}, 0)) {
// click on yes i want
clickOnElement( new String[] {CSS, "div#cboxLoadedContent div.popup__footer__button.js-switch-eco-mto-confirm"});
// take a snip of consultant
takeScreenshotOfParticularElement(new String[] { CSS, "div#cboxLoadedContent > ul" },"logs/Screenshots/ycNBhH.png");
// add assertion for consultant
Assert.assertTrue(isElementDisplayed(new String[] { CSS, "div#cboxLoadedContent > ul"}));
// click on buy from consultant
clickOnElement( new String[] {CSS, "a#js-sem-buy-button"});
// Validate URL
Assert.assertTrue(checkCurrentUrlContains( "utm_source=ecommerce&utm_medium=referral&utm_campaign=popup"));
// take a snip of consultant profile
takeScreenshotOfParticularElement(new String[] { CSS, "div#consultant-profile > div" },"logs/Screenshots/dPjspM.png");
// add assertion for consultant
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#consultant-profile > div"}));
// end if statement
}
// else statement
else{
// print in result
printResults("PrintNote", "\"consultant popup is not found\"");
// end else
}
// Click On Makeup Section
clickOnElement( new String[] {XPATH, "//a[@title=\'Maquillaje\']"});
// Click on First Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Click on Add to cart button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// Click On Go Pay Button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on Go pay Button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// Login As Guest User
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}

    status = "passed"; 
   }
  @Test
  public void CL__EE_create_account__Tiered_Discount__CCCC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
// click on login
clickOnElement( new String[] {CSS, "li.liOffcanvas.bicHeaderLinks-container > a > img"});
// write text in username text field
typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
// write text in password text field
typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
// click on login button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Iniciar sesión\')]"});
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a"});
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
takeScreenshot("logs/Screenshoots/kBqCQB.png");
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
takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" },"logs/Screenshots/hTKHOj.png");
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
printResults("PrintNote", "\"tiered discount was not found\"");
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
// click on second address
clickOnElement( new String[] {CSS, "div#deliveryAddressesSelector div:nth-child(3) > label"});
// wait until adress submit button visible
waitUntil("CheckClickableElement", new String[]{CSS, "button#addressSubmit"}, "10","disabled");
// click on address submit button
clickOnElement( new String[] {CSS, "button#addressSubmit"});
// wait until credit card section clickeble
waitUntil("CheckClickableElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
// Click On Credit Card Section
javascriptExecution("document.querySelector(\"label[for=\'belcorpNewCheckoutPaymentMode_mpago_credit\']\").click();
");
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "input[type='text'][class='form-control input--sec-code not-empty'][data-checkout='securityCode'][placeholder='CVV*'][onselectstart='return false'][onpaste='return false'][oncopy='return false'][oncut='return false'][ondrag='return false'][ondrop='return false'][autocomplete='off'][inputmode='numeric'][aria-describedby='securityCodeCardSaved-error']"}, "10","disabled");
// Write Text In CVV Textbox
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCodeCardSaved-error\"]" }, "123");
// click on terms and condition
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_MPagoCardSavedForm_mpago_visa\']"});
// wait until pay button
waitUntil("CheckClickableElement", new String[]{CSS, "form#mpago_credit div.action-fixed-bottom > div > button[type='button']"}, "10","disabled");
// click on pay
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoCardSavedForm checkout-next\']"});
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
  public void EC__EE_Acceder_desde_la_landing_de_marcas_categorias__usuario_invitado_y_checkout_Agencia_BancaCC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=bdfhdfdfhdhd");
// mouse hover to perfumes
mouseHoverOnElement(new String[] {XPATH, "//a[@title=\'Perfumes\']"});
// Click on Herbal
clickOnElement( new String[] {XPATH, "//a[text() = \"Herbal\"]"});
// Refresh
pageRefresh();
// Click on first product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on Agregar a la bo...
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for qty selector(+) button
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"}));
// Add Assertion for qty selector(+) button is enabled
Assert.assertTrue(isElementClickable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"}));
// Add Assertion for qty selector(-) button
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"}));
// Add Assertion for qty selector(-) button is not enabled
Assert.assertFalse(isElementClickable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"}));
// Add Assertion for (1)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"(1)\"]"}));
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// Write text in guest first Name
typeText(new String[] { ID, "guest.firstName" }, "Soumya");
// Write text in  last  Name
typeText(new String[] { ID, "guest.lastName" }, "Das");
// Write text in email
typeText(new String[] { ID, "guest.email" }, "srdas96@hotmail.com");
// Click on agree To Receive  publicity
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on T&C checkbox
clickOnElement( new String[] {ID, "guest.belcorpToC"});
// Click on Continue as guest button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//a[text() = \"Ir a pagar\"]"});
// End If
}
// Start Else
else{
// Print
printResults("PrintNote", "\"element is not present\"");
// end else
}
// Select Option from Document type dropdown
selectOption(new String[] { ID, "address.documentType" }, "RUC");
// Write text in RUC number textbox
typeText(new String[] { ID, "address.documentNumber" }, "1234567891234");
// Write text in name textbox
typeText(new String[] { ID, "address.billingName" }, "soumya");
// Select Option from province dropdown
selectOption(new String[] { ID, "address.regionIsoParent2" }, "000019");
// Select Option from Canton dropdown
selectOption(new String[] { ID, "address.regionIsoParent1" }, "000019000002");
// Select Option from Sector Dropdown
selectOption(new String[] { ID, "address.regionIso" }, "000019000002000050");
// Write text in address line1
typeText(new String[] { ID, "address.line1" }, "near temple");
// Write text in Numbering Textbox
typeText(new String[] { ID, "address.line2" }, "n70-306");
// Write text in secondary street textbox
typeText(new String[] { ID, "address.secondaryStreetName" }, "vanivihar");
// Write text in neighborhood textbox
typeText(new String[] { ID, "address.neighborhood" }, "rasulgarh");
// Write text in Hose No
typeText(new String[] { ID, "address.referencia" }, "100");
// Write text in Postal Code Textbox
typeText(new String[] { ID, "address.postalCode" }, "754215");
// Write text in phone textbox
typeText(new String[] { ID, "address.phone" }, "7856786679");
// Click on CLICK her to continue for address submit
clickOnElement( new String[] {ID, "addressSubmit"});
// Click on CLICK here to continue for delivery submit
clickOnElement( new String[] {ID, "deliveryMethodSubmit"});
// Select Option from payment method dropdown
selectOption(new String[] { ID, "paymentOptions" }, "belpay_cash");
// Write text in belpay Doc Number
typeText(new String[] { ID, "belpayDocNumberCash" }, "1234567890");
// Click on CLICK here to continue button
clickOnElement( new String[] {CSS, "button[type=\"button\"][class=\"btn btn-magenta btn-primary btn-block submit_belpayCashForm checkout-next\"]"});
// Click on Terms1
clickOnElement( new String[] {ID, "Terms1"});
// Click on Finalizae your purchase button
clickOnElement( new String[] {ID, "placeOrder"});
// Add Assertion for congratulation message
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));

    status = "passed"; 
   }
  @Test
  public void EE__Scenario_CC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Mouse hover on Product
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'name\']"});
// Product is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'name\']"})){
// Validate Product is Present
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'name\']"}));
// Click on Product
clickOnElement( new String[] {XPATH, "//div[@class=\'name\']"});
// Validate Product Name
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'product-details page-title page-title-cyzone\']/child::h1"}));
// End of If Loop
}
// Click on Lbel
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'lbel\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perf");
// Mouse hover on Product
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'name\']"});
// Product is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'name\']"})){
// Validate Product is Present
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@class=\'name\']"}));
// Click on Product
clickOnElement( new String[] {XPATH, "//div[@class=\'name\']"});
// Validate Product Name
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'product-details page-title page-title-lbel\']/child::h1"}));
// End of If Loop
}
// Click on Esika
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'esika\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Mouse hover on Product
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'name\']"});
// Product is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'name\']"})){
// Validate Product is Present
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'name\']"}));
// Click on Product
clickOnElement( new String[] {XPATH, "//div[@class=\'name\']"});
// Validate Product Name
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'product-details page-title page-title-esika\']/child::h1"}));
// End of If Loop
}

    status = "passed"; 
   }
  @Test
  public void CL__EE_Access_from_the_brands__guest_user_and_checkout_Agency_BankingCC() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// Click on \"VICTOR HUGO BRA\" link
clickOnElement( new String[] {XPATH, "//span[text() = \" VICTOR HUGO BRAVO VALENZUELA\"]"});
// Add Assertion for Chile
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Chile\"]"}));
// Add Assertion for VICTOR HUGO BRA...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"VICTOR HUGO BRAVO VALENZUELA\"]"}));
// Add Assertion for Mi Tienda Onlin...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//b[text() = \"Mi Tienda Online\"]"}));
// Add Assertion for cl18@cl.com
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for Bienvenido a Mi...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "li[class=\"consultant-description\"]"}));
// Click on \"close the consultant popup\"
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// Mouse hover on  personal care
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// Click on Linea
clickOnElement( new String[] {CSS, "a[href=\"/cl/c/lbel-0405/sdsdsdad\"]"});
// Click on \" Ligne Experte E\"
clickOnElement( new String[] {CSS, "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]"});
// Add assertion for  \"Ligne Experte image1\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(1) > div > li > a > img"}));
// Add assertion for  \"Ligne Experte image2\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img"}));
// Add assertion for  \"Ligne Experte image3\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img"}));
// Add assertion for  \"Ligne Experte image4\"
Assert.assertTrue(isElementAvailable(new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img"}));
// Add assertion for price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > span:nth-of-type(2)"}));
// Add assertion for quantity
Assert.assertTrue(isElementAvailable(new String[] { ID, "pdpAddtoCartInput"}));
// Add assertion for \"add to cart\" button
Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton"}));
// Click on \"add to cart\" button
clickOnElement( new String[] {ID, "addToCartButton"});
// Add assertion for \"go pay\" button
Assert.assertTrue(isElementAvailable(new String[] { CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"}));
// click on \"go pay\" button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// click on continue go pay button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// click on guest user \"first name\"
clickOnElement( new String[] {ID, "guest.firstName"});
// write text in first name
typeText(new String[] { ID, "guest.firstName" }, "Prerna");
// click on guest user \"last name\"
clickOnElement( new String[] {ID, "guest.lastName"});
// write text in last name
typeText(new String[] { ID, "guest.lastName" }, "Dewangan");
// click on guest user \"mail id\"
clickOnElement( new String[] {ID, "guest.email"});
// write text in \"mail id\"
typeText(new String[] { ID, "guest.email" }, "prerna.dewangan12@gmail.com");
// click on \"guest agree To Receive Publicity\" check box
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// click on continue button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Select Option from  \"Choose a region\"
selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-09");
// Select Option from  \"ANGOLCARAHUECHO\"
selectOption(new String[] { ID, "address.regionIsoParent1" }, "09-CHOL CHOL");
// Select Option from \" CHOLCHOL\"
selectOption(new String[] { ID, "address.regionIso" }, "CHOL CHOL-CHOLCHOL");
// wait
waitUntil("CheckElement", new String[]{ID, "address.line1"}, "15","disabled");
// click on address line 1
clickOnElement( new String[] {ID, "address.line1"});
// Click on  checkout delivery address
clickOnElement( new String[] {CSS, "div[class=\"checkout-shipping js-checkout-delivery-address\"]"});
// click on address line
clickOnElement( new String[] {ID, "address.line1"});
// write text in address line
typeText(new String[] { ID, "address.line1" }, "12");
// click on address phone text box
clickOnElement( new String[] {ID, "address.phone"});
// write text in address phone text box
typeText(new String[] { ID, "address.phone" }, "7357847850");
// click on address submit button
clickOnElement( new String[] {ID, "addressSubmit"});
// wait
waitUntil("CheckElement", new String[]{ID, "deliveryMethodSubmit"}, "15","disabled");
// if present delivery method submit
if (isElementAvailable(new String[] { ID, "deliveryMethodSubmit"})){
// click on \"delivery Method Submit\" button
clickOnElement( new String[] {ID, "deliveryMethodSubmit"});
// end if delivery method submit
}
// if cash payment present
if (isElementAvailable(new String[] { ID, "paymentOptions"})){
// Select Option from \"Payment method\"
selectOption(new String[] { ID, "paymentOptions" }, "mpago_cash");
// Click on \"click here\" button
clickOnElement( new String[] {CSS, "button[type=\"button\"][class=\"btn btn-magenta btn-block submit_mpagoServipagForm checkout-next\"]"});
// click on terms check box
clickOnElement( new String[] {ID, "Terms1"});
// Add assertion for \"finish your order\" button
Assert.assertTrue(isElementAvailable(new String[] { ID, "placeOrder"}));
// click on \"finish your order\" button
clickOnElement( new String[] {ID, "placeOrder"});
// end if cash payment present
}

    status = "passed"; 
   }
  @Test
  public void CL__EE_Access_from_the_brands__categories_landing__guest_user_and_checkout_Agency__BankingCC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to chili consultant URL
getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
// start if statement for product available
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a"})){
// Click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a"});
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Click on change img 1
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div.slick-slide.slick-current.slick-active > div > li > a > img"});
// Click on change img 2
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div:nth-child(6) > div > li > a > img"});
// Click on change img 3
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div:nth-child(7) > div > li > a > img"});
// Add Assertion crossed out price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]"}));
// add assertion for qty selector
Assert.assertTrue(isElementAvailable(new String[] { ID, "pdpAddtoCartInput"}));
// start if statement for copy and share
if (isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"})){
// Add Assertion for copy and share
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"copy and share button not found\"");
// end else statement
}
// Add Assertion for Descripción
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h2[text() = \"Descripción\"]"}));
// Add Assertion for add to cart button
Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton"}));
// Click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on gopay buton
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for product info title
Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]"}));
// Add Assertion for  delete link
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__remove-action\"]"}));
// Add Assertion for go pay button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"}));
// Add Assertion for Bela
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__info > a > span"}));
// Add Assertion for  price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(4)"}));
// Add Assertion for total price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(5)"}));
// Click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// guest user login
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// chile shipping address details
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// chili credit card details
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add Assertion for success  payment
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// end if statement
}
// start else statemnet
else{
// print in result
printResults("PrintNote", "\"your payment was declined. Choose another of the available payment methods\"");
// end else
}
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"product not available\"");
// end else statement
}

    status = "passed"; 
   }
  @Test
  public void CL__ESIKA__Popup_buy_the_consultant_CATEGORIESC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// GoToURL
getURL("https://s1-esika.tiendabelcorp.com/cl/");
// wait for consultant popup
waitUntil("CheckVisibleElement", new String[]{XPATH, "(//div[@class='popup'])[2]"}, "10","disabled");
// start if statement
if (isDisplayed(new String[] { XPATH, "(//div[@class=\"popup\"])[2]"}, 0)) {
// click on yes i want
clickOnElement( new String[] {CSS, "div#cboxLoadedContent div.popup__footer__button.js-switch-eco-mto-confirm"});
// take a snip of consultant
takeScreenshotOfParticularElement(new String[] { CSS, "div#cboxLoadedContent > ul" },"logs/Screenshots/mBUbzz.png");
// add assertion for consultant
Assert.assertTrue(isElementDisplayed(new String[] { CSS, "div#cboxLoadedContent > ul"}));
// click on buy from consultant
clickOnElement( new String[] {CSS, "a#js-sem-buy-button"});
// take a snip of consultant profile
takeScreenshotOfParticularElement(new String[] { CSS, "div#consultant-profile > div" },"logs/Screenshots/PHQaEQ.png");
// add assertion for consultant
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#consultant-profile > div"}));
// end if statement
}
// else statement
else{
// print in result
printResults("PrintNote", "\"consultant popup is not found\"");
// end else
}

    status = "passed"; 
   }
  @Test
  public void EC_EE_apply_Discount__CC_couponCCC() {
// clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to MTO URL
getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=erergergr");
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
// Click on Random Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[1]/child::div[2]/child::a"});
// Click on Add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on Go Pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Validate \"Not Free \" is not Present
Assert.assertFalse(getText(new String[] { XPATH, "//span[@class=\'free-delivery-amount\']" }).contains("Gratis"));
// Write text in Coupon Text field
typeText(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" }, "ECMTO");
// Click on Apply button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-black cart-voucher__btn\']"});
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// Guest user
// if statement
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']"})){
// write text in firsta name
typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
// write text in last name
typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
// write text in email
typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
// click on  first checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']"});
// click on seconde checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// click on login
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']"});
// end if statement
}
// else statement
else{
// print message
printResults("PrintNote", "guest user login is not present");
// end else statement
}
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ir a pagar\']"})){
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//a[text()=\'Ir a pagar\']"});
// End If Statement
}
// Validate shipping address is displayed
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
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
// Click on CLICK here to continue button
clickOnElement( new String[] {XPATH, "//button[@id=\'addressSubmit\']"});
// Validate shipping methods
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
// Validate Shipping methods is Displayed
takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-indent\']" },"logs/Screenshots/pnjEYn.png");
// Click on Again CLICK here to continue button
clickOnElement( new String[] {XPATH, "//button[@id=\'deliveryMethodSubmit\']"});
// Validate payment options
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
// Validate payment options is displayed
takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[2]" },"logs/Screenshots/UTlVHB.png");
// Credit Card Details
// if payment option present
if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']"})){
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
// if statement click here to continue payment button present
if (isElementAvailable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"})){
// if statement click here to continue payment button clickable
if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"})){
// click on click here to continue payment button
clickOnElement( new String[] {XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"});
// end if statement click here to contineue payment button clickable
}
// else statement click here to continue payment button clickable
else{
// print message
printResults("PrintNote", "not clickable");
// end if click here continue button present
}
// else statement click here continue button present
else{
// print message
printResults("PrintNote", "button is not present");
// end else statement click here continue button present
}
// End if payment option present
}
// else payment option present
else{
// print message
printResults("PrintNote", "Payment option is not present");
// end else payment option present
}
// Validate Order Summary
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
// Validate SubTotal
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[2]/descendant::div/descendant::div/descendant::div[@class=\'subtotal\']"}));
// CLICK here to continue button is present
if (isElementAvailable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-block submit_belpayForm checkout-next\']"})){
// Print in Console
printResults("PrintNote", "\"It is not Re-Directing to  Order Summary Page\"");
// End of If Loop
}
// Else Statement
else{
// Place order Details
// if for terms1 present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']"})){
// click on terms1 checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1\']"});
// if \"finalize your purchase\" button clickable
if (isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"})){
// Add assertion for \"finalize your purchase\"
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"}));
// click on \"finalize your purchase\" button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"});
// Add Assertion For successful purchase message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// end if \"finalize your purchase\" button clickable
}
// else  \"finalize your purchase\" button clickable
else{
// print message
printResults("PrintNote", "finalize your purchase button is not clickable");
// end else  \"finalize your purchase\" button clickable
}
// end if for terms1 present
}
// else if for terms1 present
else{
// print message
printResults("PrintNote", "terms1 checkbox is not present");
// end else for terms1 present
}
// Validate for  mail
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b"}));
// End Else Statement Loop
}

    status = "passed"; 
   }
  @Test
  public void CL__EE_create_account_Tiered_Discount__CC__C() {
// Clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// Click on sets
clickOnElement( new String[] {XPATH, "//a[@title=\'SETS\']"});
// if product present in sets
if (isElementAvailable(new String[] { XPATH, "//a[@class=\'spanTitle ecarousel_product_productName_200098633\']"})){
// Click on first product
clickOnElement( new String[] {XPATH, "//a[@class=\'spanTitle ecarousel_product_productName_200098633\']"});
// end if product present in sets
}
// Click add to cart button
// if condition for \"add to cart\" present
if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// if condition for \"add to cart\" clickable
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// Add assertion \"add to cart\" clickable
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// click on \"add to cart\" button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// end if for \"add to cart\" clickable
}
// Else statement \"add to cart\" clickable
else{
// Print message not clickable
printResults("PrintNote", "add to cart is not clickable");
// end else \"add to cart\" clickable
}
// end if for  \"add to cart\" present
}
// else statement   \"add to cart\" present
else{
// print message
printResults("PrintNote", "add to cart is not present");
// end else statement  \"add to cart\" present
}
// Click on go pay button
// if condition for \"go pay\" present
if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
// if condition for \"go pay\" clickable
if (isElementClickable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
// click on \"go pay\" button
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
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
// if coupon text box present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'js-voucher-code-text\']"})){
// Write text in coupon
typeText(new String[] { XPATH, "//input[@id=\'js-voucher-code-text\']" }, "GRACIAS25CL");
// Click on apply button
clickOnElement( new String[] {XPATH, "//button[@id=\'js-voucher-apply-btn\']"});
// end if coupon text box present
}
// if coupon present
if (isElementAvailable(new String[] { XPATH, "//span[@class=\'js-release-voucher voucher-list__item-box\']"})){
// Add assertion for Tiered discount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'js-release-voucher voucher-list__item-box\']"}));
// end if coupon present
}
// Click on cart go pay button
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
// Login as guest user
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Fill the details for shipping address
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// Fill credit card details and proceed to checkout
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// if confirmation page present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
// Add assertion for confirmation
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// end if confirmation page present
}
// else confirmation page present
else{
// Print message
printResults("PrintNote", "\"Sorry! confirmation page is not present\"");
// end else  confirmation page present
}

    status = "passed"; 
   }
  @Test
  public void UF_Consultant_Marquee_CC() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=MalenaTOMi");
// Add Assertion for \"MARIA ELENA VAR\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \" MARIA ELENA VARGAS VILLALVA\"]"}));
// click on consultant link
clickOnElement( new String[] {XPATH, "//span[text() = \" MARIA ELENA VARGAS VILLALVA\"]"});
// Add Assertion for  flag img
Assert.assertTrue(isElementDisplayed(new String[] { CSS, "img[src=\"/_ui/custom-theme/images/flags/EC.png\"]"}));
// Add Assertion for Ecuador
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ecuador\"]"}));
// Add Assertion for consultant mail
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for Mobile number
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-phone\"]"}));
// Add Assertion for \"Buy with me\" button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"COMPRA CONMIGO\"]"}));
// close the consultant popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// Mouse hover on personal care
mouseHoverOnElement(new String[] {XPATH, "//a[@title=\'Cuidado Personal\']"});
// click on hair
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// Add Assertion for \"MARIA ELENA VAR\"
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \" MARIA ELENA VARGAS VILLALVA\"]"}));
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Validate that the consulting marquee
getURL("https://s1-esika.tiendabelcorp.com/ec");
// Mouse hover on personal care
mouseHoverOnElement(new String[] {XPATH, "//a[@title=\'Cuidado Personal\']"});
// click on hair link
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});

    status = "passed"; 
   }
  @Test
  public void Purchase_in_virtual_store__registered_user__Servipag_CCC() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// Click on \"VICTOR HUGO BRA\" link
clickOnElement( new String[] {XPATH, "//span[text() = \" VICTOR HUGO BRAVO VALENZUELA\"]"});
// Add Assertion for Chile
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Chile\"]"}));
// Add Assertion for VICTOR HUGO BRA...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"VICTOR HUGO BRAVO VALENZUELA\"]"}));
// Add Assertion for Mi Tienda Onlin...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//b[text() = \"Mi Tienda Online\"]"}));
// Add Assertion for cl18@cl.com
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for Bienvenido a Mi...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "li[class=\"consultant-description\"]"}));
// Click on \"close the consultant popup\"
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// Mouse hover on  personal care
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// Click on Linea
clickOnElement( new String[] {CSS, "a[href=\"/cl/c/lbel-0405/sdsdsdad\"]"});
// Click on \" Ligne Experte E\"
clickOnElement( new String[] {CSS, "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]"});
// Click on \"add to cart\" button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on \"go pay\" button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// Click on \"continue shopping\" button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// click on esika link
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']"});
// Mouse hover on  \"personal carel\"
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// Click on hair
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// click on conditioner
clickOnElement( new String[] {CSS, "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200092360-FotoFondoBlancoSB.jpg\"]"});
// click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on go pay button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// click on continue shopping button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// click on cyzone link
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']"});
// mouse hover \"personal care\"
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// click in \" curepo\"
clickOnElement( new String[] {XPATH, "//a[text()=\'Cuerpo\']"});
// Click on first product
clickOnElement( new String[] {XPATH, "//span[@class=\'esika-content-image\']"});
// click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on go pay button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// click on continue go pay button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// click on user name text box
clickOnElement( new String[] {ID, "j_username"});
// write text in user name text box
typeText(new String[] { ID, "j_username" }, "prernadewangan@photon.in");
// write text in password text box
typeText(new String[] { ID, "j_password" }, "Prerna12");
// click on login button
clickOnElement( new String[] {CSS, "form#loginForm > button"});
// If condition for go pay button present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[@id=\'checkout-display-continueCheckout\']"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[@id=\'checkout-display-continueCheckout\']"});
// end if statement
}
// Fill the details for shipping address
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// Fill the credit card details and proceed to checkout
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}

    status = "passed"; 
   }
  @Test
  public void SCENARIO__Purchase_in_virtual_store__Google_User__Servipag_CC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::i)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// Start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"})){
// Click on Keep Buying Button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"});
// End if
}
// start else statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else
}
// End of If Loop
}
// Click on Lbel
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'lbel\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::i)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"})){
// Click on Keep Buying Button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"});
// End if
}
// start else statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End else statement
}
// End of If Loop
}
// Click on Esika
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'esika\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::img)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"})){
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"})){
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// End if Statement
}
// Start Else
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else Statement
}
// Guest user Details
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Shipping Address Details
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// Payment Details
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// success message is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for success message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End of If Loop
}
// start else statement
else{
// Print in Console
printResults("PrintNote", "\"The entered credit card number is not proper\"");
// else statement
}
// End of If Loop
}

    status = "passed"; 
   }
  @Test
  public void EC_EE_Add_supported_from_link_Free_Shipping_Banking_AgencyCC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=erergergr");
// wait
waitUntil("CheckVisibleElement", new String[]{XPATH, "//a[@title='Maquillaje']"}, "10","disabled");
// Click On Makeup Section
clickOnElement( new String[] {XPATH, "//a[@title=\'Maquillaje\']"});
// Click on first product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Start if Satement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver productos\"]"})){
// Click On See Products
javascriptExecution("document.querySelector(\"a[class=\'btn promotionButton\']\").click()");
// Click On First Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// start if statement
if (isElementAvailable(new String[] { CSS, "button#selectVariable"})){
// click on choose tone
javascriptExecution("document.querySelector(\"button#selectVariable\").click();
");
// select first tone
clickOnElement( new String[] {CSS, "div#cboxLoadedContent div:nth-child(1) > div.selectorContainer > div.checkboxContainer > input"});
// click on apply button
clickOnElement( new String[] {CSS, "div#cboxLoadedContent div.col-xs-8.col-md-8.applyButton > button"});
// end if statement
}
// start else sataement
else{
// Print Result
printResults("PrintNote", "\"choose tone button is not present\"");
// end else statement
}
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Add Assertion for qty selector button (+)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
// Add Assertion for qty selector button (-)
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
// Add Assertion For Add To Cart Button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"}));
// Click on Add to cart button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// Click on keep buying button
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
// end if statement
}
// Start Else Statement
else{
// Print Result
printResults("PrintNote", "\"See Products Is Not Present\"");
// End Else Statement
}
// start if statement
if (isElementAvailable(new String[] { CSS, "div#lazyLoadCommercialCarousel a"})){
// Add Assertion For Product Present For Combination
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver combinaciones\"]"}));
// Click On See Combination
javascriptExecution("document.querySelector(\"div#lazyLoadCommercialCarousel a\").click();
");
// Click On First Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Click on Add to cart button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// Click On Go Pay Button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for qty selector(+) button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'+\'])[2]"}));
// Add Assertion for qty selector(-) button is not enabled
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//button[text()=\'-\'])[2]"}));
// start if statement
if (checkContainsValue(new String[] { XPATH, "(//div[@class=\'cart-popup-progress-text\'])[2]/span[2]"})){
// Add Assertion For Free Shipping Bar
Assert.assertTrue(getText(new String[] { XPATH, "(//div[@class=\'cart-popup-progress-text\'])[2]/span[2]" }).contains("¡Felicitaciones, alcanzaste el envío gratis!"));
// Add Assertion For free shipment
Assert.assertTrue(getText(new String[] { XPATH, "//span[@class=\'free-delivery-amount\']" }).contains("Gratis"));
// End if statement
}
// Start  Else Statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else Statement
}
// start if statement
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// Write text in guest first Name
typeText(new String[] { ID, "guest.firstName" }, "Soumya");
// Write text in  last  Name
typeText(new String[] { ID, "guest.lastName" }, "Das");
// Write text in email
typeText(new String[] { ID, "guest.email" }, "ec.esc2.mto.fb@gmail.com");
// Click on agree To Receive  publicity
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on T&C checkbox
clickOnElement( new String[] {ID, "guest.belcorpToC"});
// Click on Continue as guest button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Select Option from Document type dropdown
selectOption(new String[] { ID, "address.documentType" }, "RUC");
// Write text in RUC number textbox
typeText(new String[] { ID, "address.documentNumber" }, "1234567891234");
// Write text in name textbox
typeText(new String[] { ID, "address.billingName" }, "soumya");
// Select Option from province dropdown
selectOption(new String[] { ID, "address.regionIsoParent2" }, "000019");
// Select Option from Canton dropdown
selectOption(new String[] { ID, "address.regionIsoParent1" }, "000019000002");
// Select Option from Sector Dropdown
selectOption(new String[] { ID, "address.regionIso" }, "000019000002000050");
// Write text in address line1
typeText(new String[] { ID, "address.line1" }, "near temple");
// Write text in Numbering Textbox
typeText(new String[] { ID, "address.line2" }, "n70-306");
// Write text in secondary street textbox
typeText(new String[] { ID, "address.secondaryStreetName" }, "vanivihar");
// Write text in neighborhood textbox
typeText(new String[] { ID, "address.neighborhood" }, "rasulgarh");
// Write text in Hose No
typeText(new String[] { ID, "address.referencia" }, "100");
// Write text in Postal Code Textbox
typeText(new String[] { ID, "address.postalCode" }, "754215");
// Write text in phone textbox
typeText(new String[] { ID, "address.phone" }, "7856786679");
// Click on CLICK her to continue for address submit
clickOnElement( new String[] {ID, "addressSubmit"});
// Click on CLICK here to continue for delivery submit
clickOnElement( new String[] {ID, "deliveryMethodSubmit"});
// Select Option from payment method dropdown
selectOption(new String[] { ID, "paymentOptions" }, "belpay_cash");
// Write text in belpay Doc Number
typeText(new String[] { ID, "belpayDocNumberCash" }, "1234567890");
// Click on CLICK here to continue button
clickOnElement( new String[] {CSS, "button[type=\"button\"][class=\"btn btn-magenta btn-primary btn-block submit_belpayCashForm checkout-next\"]"});
// Click on Terms1
clickOnElement( new String[] {ID, "Terms1"});
// Click on Finalizae your purchase button
clickOnElement( new String[] {ID, "placeOrder"});
// Add Assertion for congratulation message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// end if statement
}
// Start Else Statement
else{
// print result
printResults("PrintNote", "\"go pay button is not present\"");
// End else statement
}
// end if statement
}
// start else statement
else{
// Print Result
printResults("PrintNote", "\"See Combination Button Is not Present In Offer Section\"");
// End else Statement
}

    status = "passed"; 
   }
  @Test
  public void CL__LBEL__Popup_buy_the_consultant_CATEGORIESC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// GoToURL
getURL("https://s1-lbel.tiendabelcorp.com/cl/");
// wait for consultant popup
waitUntil("CheckVisibleElement", new String[]{XPATH, "(//div[@class='popup'])[2]"}, "10","disabled");
// start if statement
if (isDisplayed(new String[] { XPATH, "(//div[@class=\"popup\"])[2]"}, 0)) {
// click on yes i want
clickOnElement( new String[] {CSS, "div#cboxLoadedContent div.popup__footer__button.js-switch-eco-mto-confirm"});
// take a snip of consultant
takeScreenshotOfParticularElement(new String[] { CSS, "div#cboxLoadedContent > ul" },"logs/Screenshots/tlFBhs.png");
// add assertion for consultant
Assert.assertTrue(isElementDisplayed(new String[] { CSS, "div#cboxLoadedContent > ul"}));
// click on buy from consultant
clickOnElement( new String[] {CSS, "a#js-sem-buy-button"});
// take a snip of consultant profile
takeScreenshotOfParticularElement(new String[] { CSS, "div#consultant-profile > div" },"logs/Screenshots/bMYiFb.png");
// add assertion for consultant
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div#consultant-profile > div"}));
// end if statement
}
// else statement
else{
// print in result
printResults("PrintNote", "\"consultant popup is not found\"");
// end else
}

    status = "passed"; 
   }
  @Test
  public void CLEE_apply_Discount_couponCCCC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']"})){
// Handle popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// End of if loop
}
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[@title=\'Perfumes\']"});
// select product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[6]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"})){
// Assertion on product discount coupon
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"}));
// End of if loop
}
// Assertion on Add to cart button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// Click on Add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"})){
// Assertion on discount promotion is applied
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// Assertion on Discount amount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
// click on cart go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// End of if loop
}
// start of else loop
else{
// Write coupon code
typeText(new String[] { XPATH, "//input[@id=\"js-voucher-code-text\"]" }, "CHILE15");
// Click on Apply button
clickOnElement( new String[] {XPATH, "//button[@id=\"js-voucher-apply-btn\"]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//span[@id=\"voucher-code-CHILE15\"]"})){
// Assertion on coupon code
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@id=\"voucher-code-CHILE15\"]"}));
// End of if loop
}
// Assertion on Discount amount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
// click on cart go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// End of else loop
}
// Proceed as guest user
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Fill the details for shipping address
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// select payment options and place the order
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]"})){
// Assertion on successful order
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]"}));
// End of if loop
}

    status = "passed"; 
   }
  @Test
  public void EC__EE_create_account__Tiered_Discount__CCCC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/ec/?consultantUrl=erergergr");
// click on login
clickOnElement( new String[] {CSS, "li.liOffcanvas.bicHeaderLinks-container > a > img"});
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
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]/a"});
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
takeScreenshot("logs/Screenshoots/lHzWRH.png");
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
// wait untill CUV /title/stock element visible
waitUntil("CheckVisibleElement", new String[]{CSS, "tr > td"}, "10","disabled");
// take a snip to validate product title /CUV/stock
takeScreenshotOfParticularElement(new String[] { CSS, "tr > td" },"logs/Screenshots/OyRrdh.png");
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
printResults("PrintNote", "\"tiered discount not found\"");
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
// guestuser login
// start if
if (isElementAvailable(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a"})){
// Click on go pay
clickOnElement( new String[] {XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a"});
// end if
}
// start else
else{
// print in result
printResults("PrintNote", "\"consultant go pay page not found\"");
// end else
}
// write text in address document
typeText(new String[] { XPATH, "//input[@id=\"address.documentNumber\"]" }, "1234567890");
// write text in adress billing name
typeText(new String[] { XPATH, "//input[@id=\"address.billingName\"]" }, "billie elish");
// Select Option from REGION
selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "CARCHI");
// wait until clickable
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@id='address.regionIsoParent1']"}, "10","disabled");
// Select Option from COMMUNE
selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "BOLIVAR");
// wait untill clickeble
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@id='address.regionIso']"}, "10","disabled");
// Select Option from location
selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "BOLIVAR");
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
clickOnElement( new String[] {ID, "addressSubmit"});
// wait
waitUntil("CheckVisibleElement", new String[]{XPATH, "//button[@id='deliveryMethodSubmit']"}, "10","disabled");
// Click on delivery Method Submit
clickOnElement( new String[] {XPATH, "//button[@id=\"deliveryMethodSubmit\"]"});
// start if statement for add new card
if (isElementAvailable(new String[] { CSS, "form#removePaymentInfo > button[type=\'submit\']"})){
// click on add new card
clickOnElement( new String[] {CSS, "form#removePaymentInfo > button[type=\'submit\']"});
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"No saved cards found \"");
// end else statement
}
// select option from credit card
selectOption(new String[] { CSS, "select#paymentOptions" }, "belpay_credit");
// write credit card number
typeText(new String[] { CSS, "form#belpay_credit input#cardNumber" }, "4168818844447115");
// write text in doc number
typeText(new String[] { CSS, "form#belpay_credit input#docNumber" }, "1234567890123");
// select expiratioon month
selectOption(new String[] { CSS, "form#belpay_credit select#expirationMonth" }, "11");
// seect expiration year
selectOption(new String[] { CSS, "form#belpay_credit select#expirationYear" }, "2025");
// select card holder name
typeText(new String[] { CSS, "form#belpay_credit input#cardholderName" }, "APRO");
// write security code
typeText(new String[] { CSS, "form#belpay_credit input#securityCode" }, "123");
// click on submit
clickOnElement( new String[] {CSS, "form#belpay_credit > button[type=\'button\']"});
// wait untill terms and condition
waitUntil("CheckClickableElement", new String[]{ID, "Terms1"}, "20","disabled");
// click on accept terms and condition
clickOnElement( new String[] {ID, "Terms1"});
// wait for final submit button clikable
waitUntil("CheckClickableElement", new String[]{CSS, "button#placeOrder"}, "10","disabled");
// click on final submit button
clickOnElement( new String[] {CSS, "button#placeOrder"});
// start if statement for sucess message
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// wait for check out success
waitUntil("CheckVisibleElement", new String[]{XPATH, "//div[@class='checkout-success__body']"}, "10","disabled");
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
  public void Purchase_in_virtual_store__registered_user__Servipag_C() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// Click on \"VICTOR HUGO BRA\" link
clickOnElement( new String[] {XPATH, "//span[text() = \" VICTOR HUGO BRAVO VALENZUELA\"]"});
// Add Assertion for Chile
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Chile\"]"}));
// Add Assertion for VICTOR HUGO BRA...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"VICTOR HUGO BRAVO VALENZUELA\"]"}));
// Add Assertion for Mi Tienda Onlin...
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//b[text() = \"Mi Tienda Online\"]"}));
// Add Assertion for cl18@cl.com
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"consultant-mail\"]"}));
// Add Assertion for Bienvenido a Mi...
Assert.assertTrue(isElementAvailable(new String[] { CSS, "li[class=\"consultant-description\"]"}));
// Click on \"close the consultant popup\"
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// Mouse hover on  personal care
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// Click on Linea
clickOnElement( new String[] {CSS, "a[href=\"/cl/c/lbel-0405/sdsdsdad\"]"});
// Click on \" Ligne Experte E\"
clickOnElement( new String[] {CSS, "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200091269_preview_elixir_de_luxe_oleo_para_cabello.jpg\"]"});
// Click on \"add to cart\" button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on \"go pay\" button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// Click on \"continue shopping\" button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// click on esika link
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']"});
// Mouse hover on  \"personal carel\"
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// Click on hair
clickOnElement( new String[] {XPATH, "//a[text() = \"Cabello\"]"});
// click on conditioner
clickOnElement( new String[] {CSS, "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200092360-FotoFondoBlancoSB.jpg\"]"});
// click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on go pay button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// click on continue shopping button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(1)"});
// click on cyzone link
clickOnElement( new String[] {XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']"});
// mouse hover \"personal care\"
mouseHoverOnElement(new String[] {XPATH, "//div[@class=\'category_menu_item_principal nav__link\']/../..//a[@title=\'Cuidado personal\']"});
// click in \" curepo\"
clickOnElement( new String[] {XPATH, "//a[text()=\'Cuerpo\']"});
// Click on first product
clickOnElement( new String[] {XPATH, "//span[@class=\'esika-content-image\']"});
// click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// click on go pay button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
// click on continue go pay button
clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
// click on user name text box
clickOnElement( new String[] {ID, "j_username"});
// write text in user name text box
typeText(new String[] { ID, "j_username" }, "prernadewangan@photon.in");
// write text in password text box
typeText(new String[] { ID, "j_password" }, "Prerna12");
// click on login button
clickOnElement( new String[] {CSS, "form#loginForm > button"});
// If condition for go pay button present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[@id=\'checkout-display-continueCheckout\']"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[@id=\'checkout-display-continueCheckout\']"});
// end if statement
}
// start else
else{
// Select Option from  \"Choose a region\"
selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-09");
// Select Option from  \"ANGOLCARAHUECHO\"
selectOption(new String[] { ID, "address.regionIsoParent1" }, "09-CHOL CHOL");
// Select Option from \" CHOLCHOL\"
selectOption(new String[] { ID, "address.regionIso" }, "CHOL CHOL-CHOLCHOL");
// click on address line 1
clickOnElement( new String[] {ID, "address.line1"});
// Click on  checkout delivery address
clickOnElement( new String[] {CSS, "div[class=\"checkout-shipping js-checkout-delivery-address\"]"});
// click on address line
clickOnElement( new String[] {ID, "address.line1"});
// write text in address line
typeText(new String[] { ID, "address.line1" }, "12");
// click on address phone text box
clickOnElement( new String[] {ID, "address.phone"});
// write text in address phone text box
typeText(new String[] { ID, "address.phone" }, "7357847850");
// click on address submit button
clickOnElement( new String[] {ID, "addressSubmit"});
// click on \"delivery Method Submit\" button
clickOnElement( new String[] {ID, "deliveryMethodSubmit"});
// Select Option from \"Payment method\"
selectOption(new String[] { ID, "paymentOptions" }, "mpago_cash");
// Click on \"click here\" button
clickOnElement( new String[] {CSS, "button[type=\"button\"][class=\"btn btn-magenta btn-block submit_mpagoServipagForm checkout-next\"]"});
// click on terms check box
clickOnElement( new String[] {ID, "Terms1"});
// Add assertion for \"finish your order\" button
Assert.assertTrue(isElementAvailable(new String[] { ID, "placeOrder"}));
// click on \"finish your order\" button
clickOnElement( new String[] {ID, "placeOrder"});

    status = "passed"; 
   }
  @Test
  public void EE__Scenario___MTOCC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::i)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Ranking DropDown
clickOnElement( new String[] {ID, "sortOptions1"});
// Click on Highest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-desc\']"});
// select lowest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-asc\']"});
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"})){
// Increase Quantity of Product
clickOnElement( new String[] {XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"});
// Click on Keep Buying Button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"});
// End if Statement
}
// Start Else Statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else Statement
}
// End of If Loop
}
// Click on Lbel
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'lbel\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::i)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Ranking DropDown
clickOnElement( new String[] {ID, "sortOptions1"});
// Click on Highest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-desc\']"});
// select lowest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-asc\']"});
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// Start if Statement
if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"})){
// Increase Quantity of Product
clickOnElement( new String[] {XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"});
// Click on Keep Buying Button
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[1]"});
// End if Statement
}
// Start Else Statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else Statement
}
// End of If Loop
}
// Click on Esika
clickOnElement( new String[] {XPATH, "(//img[@data-parent=\'esika\'])[2]"});
// Handle \"Boost the business\" Pop up
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
// Write text in search TextField
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "perfume");
// Click on Search Symbol
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn js_search_button searchBoxButtonIconShort\']/child::img)[1]"});
// Products is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"})){
// Click on Ranking DropDown
clickOnElement( new String[] {ID, "sortOptions1"});
// Click on Highest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-desc\']"});
// select lowest price
clickOnElement( new String[] {XPATH, "//select[@id=\'sortOptions1\']/child::option[@value=\'price-asc\']"});
// Click on Third Product
clickOnElement( new String[] {XPATH, "//div[@class=\'product__listing product__grid\']/child::div[3]/child::div[2]/child::a"});
// Click on ADD TO CART
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on Go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Handle \"Boost the business\" Pop up
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
// start if statement
if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"})){
// Increase Quantity of Product
clickOnElement( new String[] {XPATH, "(//button[@class=\'item__quantity__action_btn item__quantity__action_plus_btn\'])[2]"});
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// end if statement
}
// Start Else Statement
else{
// Print Result
printResults("PrintNote", "\"element is not present\"");
// End Else Statement
}
// Guest user Details
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Shipping Address Details
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// Payment Details
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// success message is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"})){
// Add assertion for success message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));
// End of If Loop
}
// start else statement
else{
// Print in Console
printResults("PrintNote", "\"The entered credit card number is not proper\"");
// else statement
}
// End of If Loop
}

    status = "passed"; 
   }
  @Test
  public void Register_Recommended_Bundle_Order_from_IndividualCC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to Esika URL
getURL("https://s1-esika.tiendabelcorp.com/ec/mascarilla-capilar-esens-pro-salon/p/200092361/MaritaTO123");
// See Set Detail is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver detalle del set\']"})){
// Explicit wait  Carousel to Load
waitUntil("CheckVisibleElement", new String[]{XPATH, "//ul[@id='productGalleryThumbnails']/following-sibling::div/child::div"}, "10","disabled");
// Validate Carousel is present
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//ul[@id=\'productGalleryThumbnails\']/following-sibling::div/child::div"}));
// Validate Cross-out Price
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Click  See Set Detail  Link
clickOnElement( new String[] {XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver detalle del set\']"});
// Click on Add Set To Bag
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn btn-block\'])[2]"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
// End of If Loop
}
// Else Statement
else{
// Print in Console
printResults("PrintNote", "\"Promotion Exclusive is not  Present\"");
// Click on Add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
// End of If Loop
}
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to Lbel URL
getURL("https://s1-lbel.tiendabelcorp.com/ec/botanology-crema-hidratante-para-manos-macadamia/p/200103961/MaritaTO123");
// See Set Detail is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver detalle del set\']"})){
// Explicit wait  Carousel to Load
waitUntil("CheckVisibleElement", new String[]{XPATH, "//ul[@id='productGalleryThumbnails']/following-sibling::div/child::div"}, "10","disabled");
// Validate Carousel is present
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//ul[@id=\'productGalleryThumbnails\']/following-sibling::div/child::div"}));
// Validate Cross-out Price
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Scroll to See Set Detail Link
scroll("ScrollDown", 450);
// Click on See Set Detail Link
clickOnElement( new String[] {XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a"});
// Click on Add Set To Bag
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn btn-block\'])[2]"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
// End of If Loop
}
// Else Statement
else{
// Print in Console
printResults("PrintNote", "\"Promotion Exclusive is not  Present\"");
// Click on ADD TO CART
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on keep buying
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
// End Else Statement Loop
}
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to Cyzone feature
getURL("https://s1-cyzone.tiendabelcorp.com/ec/perfume-de-mujer-blue-%26-blue-for-her/p/200092744/MaritaTO123");
// Promotion Exclusive is Present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver detalle del set\']"})){
// Explicit wait  Carousel to Load
waitUntil("CheckVisibleElement", new String[]{XPATH, "//ul[@id='productGalleryThumbnails']/following-sibling::div/child::div"}, "10","disabled");
// Validate Carousel is not present
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//ul[@id=\'productGalleryThumbnails\']/following-sibling::div/child::div"}));
// Validate Cross-out Price
Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Click  See Set Detail  Link
clickOnElement( new String[] {XPATH, "//div[@class=\'commercialCarousel-pdp-footer\']/child::a[text()=\'Ver detalle del set\']"});
// Click on Add Set To Bag
clickOnElement( new String[] {XPATH, "(//button[@class=\'btn btn-block\'])[2]"});
// End of If Loop
}
// Else Statement
else{
// Print in Console
printResults("PrintNote", "\"Promotion Exclusive is not  Present\"");
// Click on ADD TO CART
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// End Else Statement Loop
}
// Click on Go Pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Write text in Coupon Text field
typeText(new String[] { XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::input" }, "ECMTO");
// Click on Apply button
clickOnElement( new String[] {XPATH, "//div[contains(@class,\'voucher-respond\')] /child::form/child::button"});
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
// Guest user
// if statement
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']"})){
// write text in firsta name
typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
// write text in last name
typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
// write text in email
typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
// click on  first checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']"});
// click on seconde checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// click on login
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']"});
// end if statement
}
// else statement
else{
// print message
printResults("PrintNote", "guest user login is not present");
// end else statement
}
// Start If Statement
if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ir a pagar\']"})){
// Click on Again Go pay
clickOnElement( new String[] {XPATH, "//a[text()=\'Ir a pagar\']"});
// End If Statement
}
// Validate shipping address is displayed
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
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
clickOnElement( new String[] {XPATH, "//input[@class=\'js-checkout-gift-checkbox\']"});
// Write text in address.from
typeText(new String[] { XPATH, "//input[@id=\'address.from\']" }, "Karthik");
// Write text in address to  text field
typeText(new String[] { XPATH, "//input[@id=\'address.to\']" }, "Chaitanya");
// Write text in address complete Name   text field
typeText(new String[] { XPATH, "//input[@id=\'address.completeNameTo\']" }, "Tarak Bala");
// Click on CLICK here to continue button
clickOnElement( new String[] {XPATH, "//button[@id=\'addressSubmit\']"});
// Validate shipping methods
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
// Validate Shipping methods is Displayed
takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-indent\']" },"logs/Screenshots/zSpJYJ.png");
// Click on Again CLICK here to continue button
clickOnElement( new String[] {XPATH, "//button[@id=\'deliveryMethodSubmit\']"});
// Validate payment options
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
// Validate payment options is displayed
takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[2]" },"logs/Screenshots/eBWxyo.png");
// Credit Card Details
// if payment option present
if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']"})){
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
// if statement click here to continue payment button present
if (isElementAvailable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"})){
// if statement click here to continue payment button clickable
if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"})){
// click on click here to continue payment button
clickOnElement( new String[] {XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"});
// end if statement click here to contineue payment button clickable
}
// else statement click here to continue payment button clickable
else{
// print message
printResults("PrintNote", "not clickable");
// end if click here continue button present
}
// else statement click here continue button present
else{
// print message
printResults("PrintNote", "button is not present");
// end else statement click here continue button present
}
// End if payment option present
}
// else payment option present
else{
// print message
printResults("PrintNote", "Payment option is not present");
// end else payment option present
}
// Validate Order Summary
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-steps \']/child::div[1]"}));
// Validate SubTotal
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'subtotal\']"}));
// Place order Details
// if for terms1 present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']"})){
// click on terms1 checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1\']"});
// if \"finalize your purchase\" button clickable
if (isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"})){
// Add assertion for \"finalize your purchase\"
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"}));
// click on \"finalize your purchase\" button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"});
// Add Assertion For successful purchase message
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
// end if \"finalize your purchase\" button clickable
}
// else  \"finalize your purchase\" button clickable
else{
// print message
printResults("PrintNote", "finalize your purchase button is not clickable");
// end else  \"finalize your purchase\" button clickable
}
// end if for terms1 present
}
// else if for terms1 present
else{
// print message
printResults("PrintNote", "terms1 checkbox is not present");
// end else for terms1 present
}
// Validate Mail is present
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b"})){
// Add Assertion for  mail
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'text-center\']/child::p[2]/child::b"}));
// End of If Loop
}

    status = "passed"; 
   }
  @Test
  public void CL__EE_apply_Discount_coupon__CCCC() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']"})){
// Handle popup
clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
// End of if loop
}
// Click on perfumes
clickOnElement( new String[] {XPATH, "//a[@title=\'Perfumes\']"});
// select product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[4]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"})){
// Assertion on product discount coupon
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"}));
// End of if loop
}
// Assertion on Add to cart button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// Click on Add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"})){
// Assertion on discount promotion is applied
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// Assertion on Discount amount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
// click on cart go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// End of if loop
}
// start of else loop
else{
// Write coupon code
typeText(new String[] { XPATH, "//input[@id=\"js-voucher-code-text\"]" }, "CHILE15");
// Click on Apply button
clickOnElement( new String[] {XPATH, "//button[@id=\"js-voucher-apply-btn\"]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//span[@id=\"voucher-code-CHILE15\"]"})){
// Assertion on coupon code
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@id=\"voucher-code-CHILE15\"]"}));
// End of if loop
}
// Assertion on Discount amount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
// click on cart go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// End of else loop
}
// Proceed as guest user
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// Fill the details for shipping address
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// select payment options and place the order
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
// Assertion on successful order
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]"}));
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-esika.tiendabelcorp.com/cl/");
// start if statement for popup
if (isDisplayed(new String[] { CSS, "button#cboxClose > span"}, 0)) {
// close popup
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// end if statement
}
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// click on first product
clickOnElement( new String[] {CSS, "div#EsikaBicSection6 div:nth-child(5) > div > div.productCard__title > a"});
// start if statement for add to cart button
if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// start if statement for Cbox popup
if (isDisplayed(new String[] { CSS, "button#cboxClose > span"}, 0)) {
// click on close popup
clickOnElement( new String[] {CSS, "button#cboxClose > span"});
// end if statement
}
// start if statement for promo
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"})){
// click on go pay
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement
}
// start else statement
else{
// apply gift coupon code
typeText(new String[] { CSS, "input#js-voucher-code-text" }, "DESCUENTO");
// click on apply
javascriptExecution("document.querySelector(\"button#js-voucher-apply-btn\").click();
");
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
// chilie guest user login
// if first name present
if (isElementAvailable(new String[] { ID, "guest.firstName"})){
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// if terms present
if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
// click on terms2
clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
// end if terms2 present
}
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// end if first name present
}
// chlie adress submit
// if region field present
if (isDisplayed(new String[] { ID, "address.regionIsoParent2"}, 0)) {
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
clickOnElement( new String[] {ID, "addressSubmit"});
// end if
}
// chilie checkout
// if credit card present
if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
// click on credit cart
clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
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
clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
// Click on pay button
clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
// end if
}
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
}