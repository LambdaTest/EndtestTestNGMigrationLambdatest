package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression_Panama_MTO extends WebDriverHelper {

 
  @Test
  public void PA__EE_apply_Discount_coupon__CCC__C() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
// Click on personal care
clickOnElement( new String[] {XPATH, "//a[@title=\"Maquillaje\"]"});
// select product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[8]"});
// Assertion on Add to cart button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"})){
// Assertion on product discount coupon
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"}));
// End of if loop
}
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on \"+\"to add more quantity
clickOnElement( new String[] {XPATH, "(//button[@class=\"item__quantity__action_btn item__quantity__action_plus_btn\"])[2]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"})){
// Assertion on discount promotion is applied
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// End of if loop
}
// Write coupon code
typeText(new String[] { XPATH, "//input[@id=\"js-voucher-code-text\"]" }, "AHORAONUNCA");
// Click on Apply button
clickOnElement( new String[] {XPATH, "//button[@id=\"js-voucher-apply-btn\"]"});
// if coupon visible
if (isDisplayed(new String[] { XPATH, "//span[@id=\"voucher-code-AHORAONUNCA\"]"}, 0)) {
// Assertion on coupon is applied
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@id=\"voucher-code-AHORAONUNCA\"]"}));
// end if coupon visible
}
// Assertion on Discount amount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
// click on cart go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Select PROVINCE address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PANAMA");
// Select district address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "PANAMA");
// Select TOWNSHIP address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "SAN FRANCISCO");
// Write  NEIGHBORHOOD address
typeText(new String[] { XPATH, "//input[@id=\"address.district\"]" }, "apilo jas");
// Write ADDRESS (STREET AND NUMBER)
typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "14,west side");
// Write REFERENCE
typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "asdfghj");
// Write telephone number
typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "12345678");
// Click on Continue
clickOnElement( new String[] {XPATH, "//button[@id=\"addressSubmit\"]"});
// click on submit  button
clickOnElement( new String[] {XPATH, "//button[@id=\"deliveryMethodSubmit\"]"});
// Select credit card option for payment
selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "1");
// Write text in card  number
typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" }, "4013540682746260");
// Write document number
typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456789789");
// Select expiry month
selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
// Select expiry year
selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
// Write card holder name
typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
// Write security code(cvv)
typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
// Click on Continue
clickOnElement( new String[] {XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_belpayForm checkout-next\"])[1]"});
// Click on checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\"Terms1\"]"});
// Click on place order button
clickOnElement( new String[] {XPATH, "//button[@id=\"placeOrder\"]"});
// Assertion on successfull order
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]"}));
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
// Click on personal care
clickOnElement( new String[] {XPATH, "//a[@title=\"Tratamiento facial\"]"});
// select product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[7]"});
// Assertion on Add to cart button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
// Click on add to cart
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"})){
// Assertion on product discount coupon
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"commercialCarousel-pdp-wrapper\"]"}));
// End of if loop
}
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Click on \"+\"to add more quantity
clickOnElement( new String[] {XPATH, "(//button[@class=\"item__quantity__action_btn item__quantity__action_plus_btn\"])[2]"});
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"})){
// Assertion on discount promotion is applied
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// End of if loop
}
// Write coupon code
typeText(new String[] { XPATH, "//input[@id=\"js-voucher-code-text\"]" }, "AHORAONUNCA");
// Click on Apply button
clickOnElement( new String[] {XPATH, "//button[@id=\"js-voucher-apply-btn\"]"});
// if coupon visible
if (isDisplayed(new String[] { XPATH, "//span[@id=\"voucher-code-AHORAONUNCA\"]"}, 0)) {
// Assertion on coupon is applied
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@id=\"voucher-code-AHORAONUNCA\"]"}));
// end if coupon visible
}
// Assertion on Discount amount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"col-xs-6 cart-totals-right text-right discount\"]"}));
// click on cart go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Select PROVINCE address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PANAMA");
// Select district address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "PANAMA");
// Select TOWNSHIP address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "SAN FRANCISCO");
// Write  NEIGHBORHOOD address
typeText(new String[] { XPATH, "//input[@id=\"address.district\"]" }, "apilo jas");
// Write ADDRESS (STREET AND NUMBER)
typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "14,west side");
// Write REFERENCE
typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "asdfghj");
// Write telephone number
typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "12345678");
// Click on Continue
clickOnElement( new String[] {XPATH, "//button[@id=\"addressSubmit\"]"});
// click on submit  button
clickOnElement( new String[] {XPATH, "//button[@id=\"deliveryMethodSubmit\"]"});
// Select credit card option for payment
selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "1");
// Write text in card  number
typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" }, "4013540682746260");
// Write document number
typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456789789");
// Select expiry month
selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
// Select expiry year
selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
// Write card holder name
typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
// Write security code(cvv)
typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
// Click on Continue
clickOnElement( new String[] {XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_belpayForm checkout-next\"])[1]"});
// Click on checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\"Terms1\"]"});
// Click on place order button
clickOnElement( new String[] {XPATH, "//button[@id=\"placeOrder\"]"});
// Assertion on successfull order
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]"}));

    status = "passed"; 
   }
  @Test
  public void PA__EE_Access_from_the_landing_of_brands__categories__guest_user_and_checkout_Agency_BankingCC() {
// Clear cookies and cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
// Click On Perfumes
clickOnElement( new String[] {XPATH, "(//a[@title=\'Perfumes\'])[1]"});
// Click On First Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Add Assertion for old price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
// Add Assertion for active price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
// Click on Add to cart button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for button(+)
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"}));
// Add Assertion for button(+)
Assert.assertTrue(isElementClickable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(2)"}));
// Add Assertion for button(-)
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"}));
// Add Assertion for button(-)
Assert.assertFalse(isElementClickable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > button:nth-of-type(1)"}));
// Add assertion for product
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'item__name\']"}));
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
// Add assertion for social icon
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Ingresar con Facebook\']"}));
// Add assertion for social icon
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text()=\'Ingresar con Facebook\']"}));
// Write text in first Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
// Write text in last Name
typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
// Write text in guest.email
typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "photontest@endtest-mail.io");
// Click on agree To Receive checkbox
clickOnElement( new String[] {CSS, "input[type=\"checkbox\"]"});
// Click on Continue as guest
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// click on go pay button
// start if
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]"})){
// click on Go pay Button
clickOnElement( new String[] {XPATH, "//a[text() = \"Ir a pagar\"]"});
// end if
}
// Start Else
else{
// Print
printResults("PrintNote", "\"element is not present\"");
// End else
}
// Select Option from province dropdown
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > select" }, "000004");
// Select Option from district
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div > select" }, "000004000001");
// Select Option from township dropdown
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(3) > div > select" }, "000004000001000008");
// Write text in address district
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(4) > input" }, "near temple");
// Write text in address line1
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(7) > input" }, "near bridge");
// Write text in address reference
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(9) > input" }, "100");
// Write text in phone textbox
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(11) > input" }, "7894561123");
// Click on CLICK here to continue for address submit
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// clickon click here to continue button
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// Select Option from payment method dropdown
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" }, "belpay_credit");
// Write text in cardNumber
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" }, "4009175332806176");
// Select Option from month dropdown
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" }, "11");
// Select Option from year dropdown
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(2) > select" }, "2025");
// Write text in cardholderName
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(7) > input" }, "APRO");
// Write text in cardNumber
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" }, "4009175332806176");
// Write text in docNumber
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(5) > input" }, "12345678");
// Write text in cardholderName
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(7) > input" }, "APRO");
// Write text in cardholderName
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(7) > input" }, "APRO");
// Click on securityCode
clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(9) > input"});
// Write text in securityCode
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(9) > input" }, "123");
// Click on CLICK here to continue for delivery submit
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// Click on Terms1
clickOnElement( new String[] {CSS, "input[type=\"checkbox\"]"});
// Click on Finalizae your purchase
clickOnElement( new String[] {CSS, "button[type=\"submit\"]"});
// wait
waitUntil("CheckVisibleElement", new String[]{CSS, "div[class='checkout-success__body__headline']"}, "10","disabled");
// if visible message
if (isDisplayed(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}, 0)) {
// Add Assertion for congratulation meassage
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));
// end if visible message
}

    status = "passed"; 
   }
  @Test
  public void PA__EE_Access_from_the_brands_categories_landing__guest_user__Credit_cardC__PHASE() {
// clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-cyzone.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
// Click on Perfumes
clickOnElement( new String[] {XPATH, "(//a[@title=\'Perfumes\'])[1]"});
// Click On first Product
clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[1]"});
// Add Assertion For Exculsive Promotion
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[@class=\'commercialCarousel-pdp-title js-owl-commercialCarouselPdp-title\']"}));
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ver productos\"]"})){
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
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// Click On Address Submit Button
// Select PROVINCE address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PANAMA");
// Select district address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "PANAMA");
// Select TOWNSHIP address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "SAN FRANCISCO");
// Write  NEIGHBORHOOD address
typeText(new String[] { XPATH, "//input[@id=\"address.district\"]" }, "apilo jas");
// Write ADDRESS (STREET AND NUMBER)
typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "14,west side");
// Write REFERENCE
typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "asdfghj");
// Write telephone number
typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "12345678");
// Click on Continue
clickOnElement( new String[] {XPATH, "//button[@id=\"addressSubmit\"]"});
// click on submit  button
clickOnElement( new String[] {XPATH, "//button[@id=\"deliveryMethodSubmit\"]"});
// Select credit card option for payment
selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "1");
// Write text in card  number
typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" }, "4013540682746260");
// Write document number
typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456789789");
// Select expiry month
selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
// Select expiry year
selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
// Write card holder name
typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
// Write security code(cvv)
typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
// Click on Continue
clickOnElement( new String[] {XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_belpayForm checkout-next\"])[1]"});
// Click on checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\"Terms1\"]"});
// Click on place order button
clickOnElement( new String[] {XPATH, "//button[@id=\"placeOrder\"]"});
// Add Assertion For Congratulation Message
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));

    status = "passed"; 
   }
  @Test
  public void PA__EE_with_Search_by_CUV_with_Account_Login_and_checkout_by_CCCC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://s1-lbel.tiendabelcorp.com/pa/?consultantUrl=lbelpaulaonline");
// Write text search text field
typeText(new String[] { CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > input" }, "200090365");
// Click on search button
clickOnElement( new String[] {CSS, "header > nav:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > form > div > div > div > span > button > i"});
// Click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]//a[@class=\"name\"]"});
// Add Assertion for crossed out price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"old-price\"]"}));
// Add Assertion quantity selector
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//input[@class=\"form-control js-qty-selector-input\"]"}));
// Add Assertion for add to cart button
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\"addToCartButton\"]"}));
// start if statement for copy and share
if (isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"})){
// Add Assertion for copy and share
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"share-btn-icon shareBtnShare\"]"}));
// end if statement
}
// Click on img 1
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div:nth-child(7) > div > li > a > img"});
// Click on img 2
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div:nth-child(8) > div > li > a > div"});
// Click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
// Click on go pay
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for remove link
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__remove-action\"]/child::div/child::a"}));
// Add Assertion for go pay btn
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"}));
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"item__name\"]"}));
// Add Assertion for quantity selector
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]/form"}));
// Add Assertion for price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]/following-sibling::div[@class=\"item__price\"]"}));
// Add Assertion for total price
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"item__quantity hidden-xs hidden-sm\"]/following-sibling::div[@class=\"item__total js-item-total hidden-xs hidden-sm\"]"}));
// Click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for Checkout
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\"cart-headline\"]"}));
// Write text in username
typeText(new String[] { XPATH, "//input[@id=\"j_username\"]" }, "belcorpregisteredtestuser@endtest-mail.io");
// Write text in password text field
typeText(new String[] { XPATH, "//input[@id=\"j_password\"]" }, "PhotonTest@9876543210");
// Click on  Log in
clickOnElement( new String[] {XPATH, "//button[@class=\"loginBtn btn btn-black btn-block mt-15\"]"});
// start if statement for gopay
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// end if statement
}
// start if statement for consultant page
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]"})){
// Click on gopay button
clickOnElement( new String[] {XPATH, "//a[text() = \"Ir a pagar\"]"});
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"consultant gopay page not found\"");
// end else statement
}
// Add Assertion for Secure Pay
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-headline pa\"]"}));
// Add Assertion for SUMMARY OF YOUR SHOPPING BAG
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[text() = \"Resumen de tu bolsa de compras\"]"}));
// Add Assertion for product
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"name\"]"}));
// Add Assertion for total price of product
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"totals\"]"}));
// Select Option from Choose a provision
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "000003");
// pop up handling
moveAndClickWithOffset(new String[] {XPATH, "//div[@class=\"checkout-headline pa\"]"}, 10,10);
// Select Option from  DISTRICT
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "000003000001");
// Select Option from NEIGHBORHOOD
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "000003000001000004");
// Write text in address district
typeText(new String[] { XPATH, "//input[@id=\"address.district\"]" }, "symetry");
// Write text in address line 1
typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "edin berg");
// Click on address reference
typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "hilton");
// Write text in address phone
typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "1273738948");
// Click on click here to continue
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// Click on click here to continue
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// Select Option from payment method
selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "belpay_credit");
// Write text in card Number
typeText(new String[] { XPATH, "//input[@id=\"cardNumber\"]" }, "4168818844447115");
// Write text in doc Number
typeText(new String[] { XPATH, "//input[@id=\"docNumber\"]" }, "12345678");
// Select Option month dropdown
selectOption(new String[] { XPATH, "//select[@id=\"expirationMonth\"]" }, "11");
// Select Option from year dropdown
selectOption(new String[] { XPATH, "//select[@id=\"expirationYear\"]" }, "2025");
// Write text in card holder Name
typeText(new String[] { XPATH, "//input[@id=\"cardholderName\"]" }, "apro");
// Write text in security Code
typeText(new String[] { XPATH, "//input[@id=\"securityCode\"]" }, "123");
// Click on click here to continue
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// Click on Terms1 checbox
clickOnElement( new String[] {XPATH, "//input[@id=\"Terms1\"]"});
// Click on Finish your payment
clickOnElement( new String[] {XPATH, "//button[@id=\"placeOrder\"]"});
// Add Assertion for order placement successful
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body\"]"}));

    status = "passed"; 
   }
  @Test
  public void PA__EE_with_Search_by_CUV_with_Account_Login_and_checkout_by_CC__CC() {
// clear cache and cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to URL
getURL("https://lbel.tiendabelcorp.com/pa/?consultantUrl=lbelpaulaonline");
// Write CUV  number in search text box
typeText(new String[] { XPATH, "//div[@class=\'col-md-4 col-md-offset-4 text-center\']/../..//input[@id=\'js-site-search-input\']" }, "200090365");
// Click on search
clickOnElement( new String[] {XPATH, "//div[@class=\'col-md-4 col-md-offset-4 text-center\']/../..//button[@class=\'btn js_search_button searchBoxButtonIconShort\']"});
// if Cuv number product present
if (isElementAvailable(new String[] { XPATH, "//a[@id=\'product_thumb_200090365\']"})){
// Click on Product image
clickOnElement( new String[] {XPATH, "//a[@id=\'product_thumb_200090365\']"});
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
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Validate trash icon
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a"}));
// Modify quantities
Assert.assertTrue(isElementAvailable(new String[] { CSS, "td > li:nth-of-type(1) > div:nth-of-type(3) > form > input:nth-of-type(4)"}));
// click on \"go pay\" button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// Write text in user text box
typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "belcorpregisteredtestuser@endtest-mail.io");
// Write text in password text box
typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "PhotonTest@9876543210");
// Validate Log in landing
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']"}));
// click on log in button
clickOnElement( new String[] {XPATH, "//button[@class=\'loginBtn btn btn-black btn-block mt-15\']"});
// if for continue go pay
if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/../..//button[@id=\'checkout-display-continueCheckout\']"})){
// click on continue go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/../..//button[@id=\'checkout-display-continueCheckout\']"});
// end if
}
// else statement
else{
// write text
printResults("PrintNote", "item is not present");
// end else
}
// if go pay present
if (isElementAvailable(new String[] { XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a"})){
// click on again GO PAY
clickOnElement( new String[] {XPATH, "//strong[text()=\'Con entrega inmediata\']/parent::div/child::a"});
// end if statement
}
// if province present
if (isElementAvailable(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']"})){
// Select province
selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000001");
// select district
selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000001000001");
// select township
selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000001000001000001");
// Write text in  neighbourhood address
typeText(new String[] { XPATH, "//input[@id=\'address.district\']" }, "near main road");
// write text in address line1
typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "12");
// write text in address line2
typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "24");
// Write text in reference
typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "old airport road");
// Write text in phone number
typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "9827154921");
// click here to continue
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// click here to continue
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// select payment method
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" }, "belpay_credit");
// Enter credit card number
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" }, "4009175332806176");
// Enter doc number
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(5) > input" }, "12345678");
// Select credit card expiry month
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > select" }, "11");
// select credit card expiry year
selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(2) > select" }, "2025");
// Enter cardholder name
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(7) > input" }, "APRO");
// Enter security code
typeText(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > form > div:nth-of-type(9) > input" }, "123");
// click \"click here to continue\" button
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// click on terms checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\"Terms1\"]"});
// Validate the place order button
Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\"placeOrder\"]"}));
// click on place order button
clickOnElement( new String[] {XPATH, "//button[@id=\"placeOrder\"]"});
// end if province present
}
// end if CUv product present
}
// else  CUv product present
else{
// Print messgae
printResults("PrintNote", "CUV Numberer search product is not available");
// end else  CUv product present
}

    status = "passed"; 
   }
  @Test
  public void PA__EE_create_account__Tiered_Discount__CCC__C() {
// Clear cache
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go To URL
getURL("https://s1-lbel.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
// click on login
clickOnElement( new String[] {CSS, "li.liOffcanvas.bicHeaderLinks-container > a > img"});
// write text in username text field
typeText(new String[] { XPATH, "//input[@id=\'j_username\']" }, "test_user_86292523@testuser.com");
// write text in password text field
typeText(new String[] { XPATH, "//input[@id=\'j_password\']" }, "Qatest2042");
// Click on login button
clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Iniciar sesión\')]"});
// wait untill maquillaje
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[text()='maquillaje']"}, "10","disabled");
// Click on Makeup category
clickOnElement( new String[] {XPATH, "//a[text()=\'maquillaje\']"});
// Click on  product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[6]"});
// start if statement for promotion exclusives
if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Promociones exclusivas\')]"})){
// start if statement to click on see product promotion
if (isElementAvailable(new String[] { XPATH, "//a[text()=\'Ver productos\']"})){
// scroll down
scroll("ScrollDown", 127);
// Click on see products promotion
clickOnElement( new String[] {XPATH, "//a[text()=\'Ver productos\']"});
// Click on product
clickOnElement( new String[] {XPATH, "//a[@class=\"name\"]"});
// Scroll down to see promotion
scroll("ScrollDown", 173);
// Click on \"see combinations\"
clickOnElement( new String[] {XPATH, "//a[text()=\'Ver combinaciones\']"});
// Click on product
clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[2]"});
// end if statement for conditional promotion
}
// start else statement
else{
// print in results
printResults("PrintNote", "\"Conditional Promotion gift card  not found \"");
// end else statement
}
// end if statement for promotion exclusives
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"Exclusive promotional conditions not found\"");
// end else statement
}
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
// click on add to cart button
clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
// End of if loop
}
// start of if loop
if (isElementAvailable(new String[] { XPATH, "//span[text()=\'Agrega más unidades y obtén un descuento.\']"})){
// Increase product quantity
clickOnElement( new String[] {XPATH, "(//button[@class=\"item__quantity__action_btn item__quantity__action_plus_btn\"])[2]"});
// Assertion on Tiered Discount
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"promo\"]"}));
// End of if loop
}
// click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// click on go pay button
clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
// Select PROVINCE address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent2\"]" }, "PANAMA");
// Wait for element to visible
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@id='address.regionIsoParent1']"}, "10","disabled");
// Select district address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIsoParent1\"]" }, "PANAMA");
// Wait for element to visible
waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@id='address.regionIso']"}, "10","disabled");
// Select TOWNSHIP address
selectOption(new String[] { XPATH, "//select[@id=\"address.regionIso\"]" }, "SAN FRANCISCO");
// Write  NEIGHBORHOOD address
typeText(new String[] { XPATH, "//input[@id=\"address.district\"]" }, "apilo jas");
// Write ADDRESS (STREET AND NUMBER)
typeText(new String[] { XPATH, "//input[@id=\"address.line1\"]" }, "14,west side");
// Write REFERENCE
typeText(new String[] { XPATH, "//input[@id=\"address.referencia\"]" }, "asdfghj");
// Write telephone number
typeText(new String[] { XPATH, "//input[@id=\"address.phone\"]" }, "12345678");
// Click on Continue
clickOnElement( new String[] {XPATH, "//button[@id=\"addressSubmit\"]"});
// click on submit  button
clickOnElement( new String[] {XPATH, "//button[@id=\"deliveryMethodSubmit\"]"});
// if credit card visible
if (isDisplayed(new String[] { XPATH, "//select[@id=\"paymentOptions\"]"}, 0)) {
// Select credit card option for payment
selectOption(new String[] { XPATH, "//select[@id=\"paymentOptions\"]" }, "1");
// Write text in card  number
typeText(new String[] { XPATH, "(//input[@class=\"form-control input--card-number not-empty\"])[1]" }, "4013540682746260");
// Write document number
typeText(new String[] { XPATH, "(//input[@id=\"docNumber\"])[1]" }, "123456789789");
// Select expiry month
selectOption(new String[] { XPATH, "(//select[@id=\"expirationMonth\"])[1]" }, "11");
// Select expiry year
selectOption(new String[] { XPATH, "(//select[@id=\"expirationYear\"])[1]" }, "2025");
// Write card holder name
typeText(new String[] { XPATH, "(//input[@id=\"cardholderName\"])[1]" }, "APRO");
// Write security code(cvv)
typeText(new String[] { XPATH, "(//input[@id=\"securityCode\"])[1]" }, "123");
// Click on Continue
clickOnElement( new String[] {XPATH, "(//button[@class=\"btn btn-magenta btn-block submit_belpayForm checkout-next\"])[1]"});
// Click on checkbox
clickOnElement( new String[] {XPATH, "//input[@id=\"Terms1\"]"});
// Click on place order button
clickOnElement( new String[] {XPATH, "//button[@id=\"placeOrder\"]"});
// Assertion on successfull order
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success__body__headline\"]"}));
// ebd if credit card visible
}

    status = "passed"; 
   }
  @Test
  public void PA__EE_Access_from_the_landing_of_brands_categories__guest_user_and_checkout_Agency__BankingCC() {
// Clear cache cookies
// Clear cookies
deleteAllCookies();
// Clear storage
javascriptExecution("window.localStorage.clear();");
// Clear session storage
javascriptExecution("window.sessionStorage.clear();");
// Go to  consultant URL
getURL("https://s1-cyzone.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
// Click on maquillaje
clickOnElement( new String[] {CSS, "div#cyzone-02 a"});
// click on first product
clickOnElement( new String[] {XPATH, "//div[@class=\"details\"]/a"});
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
// Click on change img 1
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div:nth-child(2) > div > li > a > img"});
// Click on change img 2
clickOnElement( new String[] {CSS, "ul#productGalleryThumbnails div:nth-child(3) > div > li > a > img"});
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
// Add Assertion for add to cart button
Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton"}));
// Click on add to cart button
clickOnElement( new String[] {ID, "addToCartButton"});
// Click on go pay button
// explicit wait for Go Pay Button
waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
// Add Assertion for product info title
Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"info-title\"]"}));
// Add Assertion for  delete link
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div.item__remove-action > div#actionEntry_0 > a"}));
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
// Write text in guest firstName text field
typeText(new String[] { ID, "guest.firstName" }, "photon");
// Write text in guest lastName text field
typeText(new String[] { ID, "guest.lastName" }, "test");
// Write text in  guest email textfield
typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
// Click on guest agree To Receive publicity checkbox
clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
// Click on guest login submit button
clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
// start if statement
if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Ir a pagar\"]"})){
// Click on go pay
clickOnElement( new String[] {XPATH, "//a[text() = \"Ir a pagar\"]"});
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"Consultant gopay page not found\"");
// end else statement
}
// Select Option from REGION
selectOption(new String[] { ID, "address.regionIsoParent2" }, "000003");
// Select Option from department
selectOption(new String[] { ID, "address.regionIsoParent1" }, "000003000003");
// Select Option from location
selectOption(new String[] { ID, "address.regionIso" }, "000003000003000005");
// write text in address district
typeText(new String[] { ID, "address.district" }, "Symentry");
// Write text in STREET AND NUMBER
typeText(new String[] { ID, "address.line1" }, "churchil street");
// write text in address. referencia
typeText(new String[] { ID, "address.referencia" }, "hilton road");
// Write text in TELEPHONE CONTACT
typeText(new String[] { ID, "address.phone" }, "1234567898");
// Click on addressSubmit
clickOnElement( new String[] {ID, "addressSubmit"});
// Click on delivery Method Submit
clickOnElement( new String[] {ID, "deliveryMethodSubmit"});
// Add Assertion for checkout-headline
Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-headline pa\"]"}));
// Add Assertion for SUMMARY OF PURCHASE
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-summary-headline\"]"}));
// Add Assertion for product name
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > ul > li:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > span"}));
// Add Assertion for total cart price
Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(2) > span"}));
// Select credit card option
selectOption(new String[] { ID, "paymentOptions" }, "belpay_credit");
// Write text in card Number
typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][id=\"cardNumber\"][data-checkout=\"cardNumber\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"]" }, "4013540682746260");
// Write text in docNumber
typeText(new String[] { ID, "docNumber" }, "12345678");
// Select month Option dropdown
selectOption(new String[] { ID, "expirationMonth" }, "11");
// Select year Option from drop down
selectOption(new String[] { ID, "expirationYear" }, "2025");
// Write text in cardholder Name
typeText(new String[] { ID, "cardholderName" }, "apro");
// Write text in security Code
typeText(new String[] { ID, "securityCode" }, "123");
// Click on CLICK HERE TO CONTINUE
clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
// click on accept terms and condition check box
clickOnElement( new String[] {ID, "Terms1"});
// click on finalize your order
clickOnElement( new String[] {ID, "placeOrder"});
// start if statement for success
if (isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]"})){
// Add Assertion for Your payment successful
Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"checkout-success\"]"}));
// end if statement
}
// start else statement
else{
// print in result
printResults("PrintNote", "\"payment  was not successful\"");
// end else
}

    status = "passed"; 
   }
}