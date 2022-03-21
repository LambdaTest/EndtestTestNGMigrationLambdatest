package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;

public class SBTwo_Test_cases__regression extends WebDriverHelper {

//
//  @Test
//  public void PE__ETwoE_Add_supported_from_PDP_carousel__Free_Sample__send_to_SBTwoCFiveSixNine() {
//javascriptExecution("lambda-name=PE  ETwoE Add supported from PDP carousel  Free Sample  send to SBTwoCFiveSixNine");
//
//// Clear cache cookies
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to  URL
//getURL("https://s1-esika.tiendabelcorp.com/pe/");
//// click on makeup
//clickOnElement( new String[] {XPATH, "//a[@title=\'Maquillaje\']"});
//// click on first product
//clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[1]"});
//// Click on add to cart button
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// Click on go pay button
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// Check if free sample present
//if (isElementAvailable(new String[] { XPATH, "//b[text()=\'Gratis\']"})){
//// Validation for free sample
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//b[text()=\'Gratis\']"}));
//// End If Statement
//}
//// start else statement
//else{
//// Print Result
//printResults("PrintNote", "\"free sample is not present\"");
//// end else statement
//}
//// Click on go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
//// guest user login
//// Write text in guest first Name
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Nombre*\"]" }, "photon ");
//// Write text in guest last Name
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Apellido*\"]" }, "test");
//// Write text in guest email
//typeText(new String[] { CSS, "input[class=\"guestEmail form-control\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Click on Agree To Receive Pubicity Checkbox
//clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(7) > div > div > div > input:nth-of-type(1)"});
//// Click on  T&C checkbox
//clickOnElement( new String[] {CSS, "section > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > div > div:nth-of-type(1) > form > div:nth-of-type(8) > div > div > input:nth-of-type(1)"});
//// Click on Continue as Guest Button
//clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
//// Shipping address details
//// wait
//waitUntil("CheckClickableElement", new String[]{XPATH, "//select[@name='regionIsoParent2']"}, "10","disabled");
//// Select Option From Department Dropdown
//selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent2\']" }, "PE-DEP-11");
//// Select Option From Province dRopdown
//selectOption(new String[] { XPATH, "//select[@name=\'regionIsoParent1\']" }, "11-BAGUA");
//// Select Option From District dropdown
//selectOption(new String[] { XPATH, "//select[@name=\'regionIso\']" }, "BAGUA-ARAMANGO");
//// Write text in address line1
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dirección*\"]" }, "near temple");
//// Write text in address line2
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Dpto. / Int / Piso / Edificio (Opcional)\"]" }, "n70-306");
//// Write text in address reference
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Referencia (Opcional)\"]" }, "100");
//// Write text in address phone
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Teléfono de contacto*\"]" }, "7867876788");
//// wait
//waitUntil("CheckClickableElement", new String[]{CSS, "button[type='submit'][form='belcorpAddressForm']"}, "10","disabled");
//// Click on Continue Button
//clickOnElement( new String[] {CSS, "button[type=\"submit\"][form=\"belcorpAddressForm\"]"});
//// Credit Card Details
//// wait
//waitUntil("CheckVisibleElement", new String[]{CSS, "label[for='belcorpNewCheckoutPaymentMode_mpago_credit']"}, "10","disabled");
//// Click On Credit Card Section
//clickOnElement( new String[] {CSS, "label[for=\"belcorpNewCheckoutPaymentMode_mpago_credit\"]"});
//// Write Text In CardHolder name
//typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-name not-empty\"][data-checkout=\"cardholderName\"][placeholder=\"Nombre del titular*\"][aria-describedby=\"cardholderName-error\"]" }, "APRO");
//// Write  Text In Card No
//typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--card-number not-empty\"][data-checkout=\"cardNumber\"][placeholder=\"Número de la tarjeta*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][aria-describedby=\"cardNumber-error\"]" }, "4168818844447115");
//// select Option From Month Dropdown
//selectOption(new String[] { XPATH, "//select[@name=\'expirationMonth\']" }, "11");
//// Select Option From Year Dropdown
//selectOption(new String[] { XPATH, "//select[@name=\'expirationYear\']" }, "2025");
//// Write Text In CVV Textbox
//typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--sec-code not-empty\"][data-checkout=\"securityCode\"][placeholder=\"CVV*\"][onselectstart=\"return false\"][onpaste=\"return false\"][oncopy=\"return false\"][oncut=\"return false\"][ondrag=\"return false\"][ondrop=\"return false\"][autocomplete=\"off\"][inputmode=\"numeric\"][aria-describedby=\"securityCode-error\"]" }, "123");
//// Select Option From DNI
//typeText(new String[] { CSS, "input[type=\"text\"][class=\"form-control input--doc-number not-empty\"][data-checkout=\"docNumber\"][placeholder=\"Número de documento*\"][aria-describedby=\"docNumber-error\"]" }, "12345678");
//// scroll
//scrollIntoElementView( new String[] {CSS, "input[id=\'Terms1_mpagoCreditCardForm\']"});
//// Cick On Terms1 Checkbox
//clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
//// Cick On Pay Button
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
//// start if statement
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
//// Validation for\" checkout success message\"
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
//// End if statement
//}
//// start else statement
//else{
//// Print Result
//printResults("PrintNote", "\"success message is not present\"");
//// end else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void EC__ETwoE_Add_supported_from_PDP_carousel__Free_Sample__send_to_SBTwoCOneEightzeroTwozeroSix() {
//javascriptExecution("lambda-name=EC  ETwoE Add supported from PDP carousel  Free Sample  send to SBTwoCOneEightzeroTwozeroSix");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-lbel.tiendabelcorp.com/ec/?consultantUrl=rodriguez");
//// Click on personal care
//clickOnElement( new String[] {XPATH, "//a[@title=\'Cuidado personal\']"});
//// select product
//clickOnElement( new String[] {XPATH, "//a[@class=\'name\']"});
//// cross out price assertion
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']"}));
//// add quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
//// add quantity
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn js-qty-selector-plus\']"});
//// Reduce quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
//// assertion on \"Add to cart\"
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// assertion on \"keep buying\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//li//div//div//div[@class=\'nav-cart\']//div//div[@class=\'add-to-cart add-to-cart-cross\']//a[contains(text(),\'     Seguir Comprando\')]"}));
//// assertion on \"Go Pay\"
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"}));
//// Click on go pay
//// if condition for \"go pay\" present
//if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// if condition for \"go pay\" clickable
//if (isElementClickable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// click on \"go pay\" button
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// end if for \"go pay\" clickable
//}
//// Else statement \"go pay\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "go pay is not clickable");
//// end else \"go pay\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \"go pay\" present
//else{
//// print message
//printResults("PrintNote", "go pay is not present");
//// end else statement  \"go pay\" present
//}
//// if free sample present
//if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-body\'])[1]"})){
//// Add assertion for free sample
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-body\'])[1]"}));
//// end if free sample present
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"free sample is not present\"");
//// end else statement
//}
//// click on cart go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
//// Proceed as guest user
//// if statement
//if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.firstName\']"})){
//// write text in firsta name
//typeText(new String[] { XPATH, "//input[@id=\'guest.firstName\']" }, "guest");
//// write text in last name
//typeText(new String[] { XPATH, "//input[@id=\'guest.lastName\']" }, "user");
//// write text in email
//typeText(new String[] { XPATH, "//input[@id=\'guest.email\']" }, "belcorpregisteredtestuser@endtest-mail.io");
//// click on  first checkbox
//clickOnElement( new String[] {XPATH, "//input[@id=\'guest.agreeToReceivePublicity\']"});
//// click on seconde checkbox
//clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
//// click on login
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-block guestCheckoutBtn\']"});
//// end if statement
//}
//// else statement
//else{
//// print message
//printResults("PrintNote", "guest user login is not present");
//// end else statement
//}
//// click on single go pay button
//// if condition for \"go pay\" present
//if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// if condition for \"go pay\" clickable
//if (isElementClickable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// click on \"go pay\" button
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// end if for \"go pay\" clickable
//}
//// Else statement \"go pay\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "go pay is not clickable");
//// end else \"go pay\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \"go pay\" present
//else{
//// print message
//printResults("PrintNote", "go pay is not present");
//// end else statement  \"go pay\" present
//}
//// Select shipping options
//// Select document type from drop down
//selectOption(new String[] { XPATH, "//select[@id=\'address.documentType\']" }, "CI");
//// Write text in \"RUC no\"
//typeText(new String[] { XPATH, "//input[@id=\'address.documentNumber\']" }, "9876543210");
//// Write text in \"NAME AND SURNAME / COMPANY\"
//typeText(new String[] { XPATH, "//input[@id=\'address.billingName\']" }, "Photon");
//// Select province from drop dwon
//selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "000023");
//// Select \"canton\" from drop down
//selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "000023000006");
//// select PARISH / SECTOR from drop down
//selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "000023000006000053");
//// Write text in \"Main street\"
//typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "near main road");
//// Write text in \"Numbering\"
//typeText(new String[] { XPATH, "//input[@id=\'address.line2\']" }, "N70-306");
//// Write text in secondary street
//typeText(new String[] { XPATH, "//input[@id=\'address.secondaryStreetName\']" }, "next to church");
//// Write text in \"NEIGHBORHOOD\"
//typeText(new String[] { XPATH, "//input[@id=\'address.neighborhood\']" }, "First phase");
//// write text \"HOUSE / APARTMENT. / BLOCK / OFFICE AND REFERENCE\"
//typeText(new String[] { XPATH, "//input[@id=\'address.referencia\']" }, "house 4");
//// Write text in postal code
//typeText(new String[] { XPATH, "//input[@id=\'address.postalCode\']" }, "010201");
//// Write text in \"telephone contact\"
//typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "9876543210");
//// if statement \"click here to continue\" present
//if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addressSubmit\']"})){
//// if statement \"click here to continue\" clickable
//if (isElementClickable(new String[] { XPATH, "//button[@id=\'addressSubmit\']"})){
//// click on  \"click here to continue\"
//clickOnElement( new String[] {XPATH, "//button[@id=\'addressSubmit\']"});
//// end if for if statement \"click here to continue\" clickable
//}
//// else statement if statement \"click here to continue\" clickable
//else{
//// print message
//printResults("PrintNote", "button is not clickable");
//// end statement t \"click here to continue\" clickable
//}
//// end if  \"click here to continue\" present
//}
//// else statement  \"click here to continue\" present
//else{
//// print messgage
//printResults("PrintNote", "button is not present");
//// end else statement  \"click here to continue\" present
//}
//// Click to submit
//// if condition for \" click here to continue button\" present
//if (isElementAvailable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']"})){
//// if condition for \"  click here to continue button\" clickable
//if (isElementClickable(new String[] { XPATH, "//button[@id=\'deliveryMethodSubmit\']"})){
//// click on \" click here to continue button\" button
//clickOnElement( new String[] {XPATH, "//button[@id=\'deliveryMethodSubmit\']"});
//// end if for \" click here to continue button\" clickable
//}
//// Else statement \" click here to continue button\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "click here to continue button is not clickable");
//// end else \" click here to continue button\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \" click here to continue button\" present
//else{
//// print message
//printResults("PrintNote", "click here to continue button is not present");
//// end else statement  \" click here to continue button\" present
//}
//// select payment options
//// if payment option present
//if (isElementAvailable(new String[] { XPATH, "//select[@id=\'paymentOptions\']"})){
//// select payment option as credit card
//selectOption(new String[] { XPATH, "//select[@id=\'paymentOptions\']" }, "belpay_credit");
//// Write text in credit card
//typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "4168818844447115");
//// select document type
//selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Cédula");
//// select doc no
//typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "1234567892");
//// select expiry month
//selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
//// select expiry year
//selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
//// Write text in card holder name
//typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
//// write text in security code
//typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
//// if statement click here to continue payment button clickable
//if (isElementClickable(new String[] { XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"})){
//// click on aqui para button
//clickOnElement( new String[] {XPATH, "(//button[text()=\'CLICK AQUÍ PARA CONTINUAR\'])[1]"});
//// end if statement click here to contineue payment button clickable
//}
//// else statement click here to continue payment button clickable
//else{
//// print message
//printResults("PrintNote", "not clickable");
//// end else
//}
//// end if click here continue button present
//}
//// else payment option present
//else{
//// print message
//printResults("PrintNote", "Payment option is not present");
//// end else payment option present
//}
//// Place your order
//// if for terms1 present
//if (isElementAvailable(new String[] { XPATH, "//input[@id=\'Terms1\']"})){
//// click on terms1 checkbox
//clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1\']"});
//// if \"finalize your purchase\" button clickable
//if (isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"})){
//// Add assertion for \"finalize your purchase\"
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"}));
//// click on \"finalize your purchase\" button
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-magenta btn-place-order btn-block\']"});
//// start if statement
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
//// Add Assertion For successful purchase message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
//// end if
//}
//// start else
//else{
//// print
//printResults("PrintNote", "\"element is not present\"");
//// end else
//}
//// end if \"finalize your purchase\" button clickable
//}
//// else  \"finalize your purchase\" button clickable
//else{
//// print message
//printResults("PrintNote", "finalize your purchase button is not clickable");
//// end else  \"finalize your purchase\" button clickable
//}
//// end if for terms1 present
//}
//// else if for terms1 present
//else{
//// print message
//printResults("PrintNote", "terms1 checkbox is not present");
//// end else for terms1 present
//}
//// if confirmation page present
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
//// Add assertion for confirmation
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
//// end if confirmation page present
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"confirmation page is not present\"");
//// end else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void CL__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCOneEightzerozeroThreeTwoCFiveFourSevenCTwoNineFourSeven() {
//javascriptExecution("lambda-name=CL  ETwoE Search by Name with Login Networks and checkout by SBTwoCOneEightzerozeroThreeTwoCFiveFourSevenCTwoNineFourSeven");
//
//// clear cache and cookies
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to  URL
//getURL("https://s1-esika.tiendabelcorp.com/cl/");
//// Start If Statement
//if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']"})){
//// close popup
//clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
//// End  If Statement
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"popup is not present\"");
//// end else statement
//}
//// click on makeup
//clickOnElement( new String[] {XPATH, "//a[@title=\'Maquillaje\']"});
//// Click on first product
//clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[3]"});
//// Add Assertion for product title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// add assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// click on add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// Click on go pay
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// add assertion for remove link
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'item__remove-action\']/child::div/child::a[text()=\'Eliminar\']"}));
//// Add Assertion for Total
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Total\"]"}));
//// Add Assertion for Price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Precio\"]"}));
//// Add Assertion for go pay
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1)"}));
//// Add Assertion for quantity selector
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for Product
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Producto\"]"}));
//// add assertion for product title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "p[class=\"cart-items-title\"]"}));
//// Click on go pay continue
//clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// login fb
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// wait
//waitForTime(3);
//// refresh page
//pageRefresh();
//// Start If  statement
//if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar pedido\"]"})){
//// Click on send the order
//clickOnElement( new String[] {XPATH, "//a[text() = \"Enviar pedido\"]"});
//// Add Assertion for ready! you asked
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \"¡Listo! Tu pedido fue enviado\"]"}));
//// Add Assertion for send message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// End If  statement
//}
//// Start else statement
//else{
//// Send order button is not present
//printResults("PrintNote", "\"element is not present\"");
//// End  else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void MX__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCFiveFourNine() {
//javascriptExecution("lambda-name=MX  ETwoE Search by Name with Login Networks and checkout by SBTwoCFiveFourNine");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-esika.tiendabelcorp.com/mx/bela/p/200098267/tiendaprueba");
//// refresh
//pageRefresh();
//// cross out price assertion
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']"}));
//// Add assertion on active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// plus quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
//// add quantity
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn js-qty-selector-plus\']"});
//// minus quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
//// start of if loop
//if (isElementAvailable(new String[] { XPATH, "//div[@id=\"storeProductLink\"]"})){
//// assertion on copy link button
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@id=\"storeProductLink\"]"}));
//// End of if loop
//}
//// start else statement
//}
//// Print Result
//printResults("PrintNote", "\"copy link button is not clickable\"");
//// end else statement
//}
//// assertion on \"Add to cart\"
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// refresh
//pageRefresh();
//// click on add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// assertion on \"keep buying\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//li//div//div//div[@class=\'nav-cart\']//div//div[@class=\'add-to-cart add-to-cart-cross\']//a[contains(text(),\'     Seguir Comprando\')]"}));
//// assertion on \"Go Pay\"
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"}));
//// click on go pay
//clickOnElement( new String[] {XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"});
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// login as fb user
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// take screenshot
//takeScreenshot("logs/Screenshoots/tEmxUB.png");
//
//    status = "passed";
//   }
//  @Test
//  public void PA__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCOneSevenFiveSixFiveOne() {
//javascriptExecution("lambda-name=PA  ETwoE Search by Name with Login Networks and checkout by SBTwoCOneSevenFiveSixFiveOne");
//
//// clear cookies and cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-cyzone.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
//// Click on perfumes
//clickOnElement( new String[] {XPATH, "//a[text() = \"perfumes\"]"});
//// Click on first product
//clickOnElement( new String[] {XPATH, "//div[@class=\'addtocart\']"});
//// Add assertion  for crossed price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'details\']/child::div/child::div[@class=\'strikethrough\']/child::p)[1]"}));
//// Add assertion for crossed price
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'details\']/child::div[2]/child::span[@class=\'old-price\']"}));
//// Click on Go Pay
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// Click on Again Go Pay
//clickOnElement( new String[] {XPATH, "//div[@class=\'row row-bar\']/child::div[2]/child::div/child::button[2]"});
//// Write text in guest.firstName...
//typeText(new String[] { ID, "guest.firstName" }, "sairam");
//// Write text in guest.lastName
//typeText(new String[] { ID, "guest.lastName" }, "test");
//// Write text in guest.email
//typeText(new String[] { ID, "guest.email" }, "sairam@endtest-mail.io");
//// Click on guest.agreeTo check box
//clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
//// click on guest user button
//clickOnElement( new String[] {XPATH, "//button[text()=\'Continuar como invitado\']"});
//// Shipping Address is Present
//if (isElementAvailable(new String[] { XPATH, "//div[text()=\'Dirección de Envío\']"})){
//// Print in Console
//printResults("PrintNote", "\"Shipping Address is Displayed\"");
//// End of If Loop
//}
//// start else statement
//else{
//// Print Result
//printResults("PrintNote", "\"shipping address is not displayed\"");
//// Else Statement
//else{
//// Send the order Button is Clickable
//if (isElementClickable(new String[] { XPATH, "//strong[text()=\'Coordinando la entrega con tu Consultora\']/parent::div/child::a[text()=\'Enviar pedido\']"})){
//// click on send the order button
//clickOnElement( new String[] {XPATH, "//strong[text()=\'Coordinando la entrega con tu Consultora\']/parent::div/child::a[text()=\'Enviar pedido\']"});
//// Add assertion for \"Ready! Your order was shipped\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\'content\']/child::h3"}));
//// Add assertion for \"Send message by WhatsApp\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[contains(@class,\'consultant-confirmation-button-wsp-container\')]/child::a"}));
//// End Loop If Statement
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"send order button is not clickable\"");
//// End Loop Else Statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void PE__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCTwoNineFivezero() {
//javascriptExecution("lambda-name=PE  ETwoE Search by Name with Login Networks and checkout by SBTwoCTwoNineFivezero");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
//// Click on Magnat
//clickOnElement( new String[] {XPATH, "//a[text() = \"Magnat\"]"});
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// Add Assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// Add Assertion for qty seector button(+)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for qty seector button(+)
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for qty selector button(-)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"-\"]"}));
//// Add Assertion for qty selector button(-)
//Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[text() = \"-\"]"}));
//// Add Assertion for share link
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'share-btn-icon shareBtnShare\']"}));
//// Click on Add to cart button
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
//// click on go pay button
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// Add Assertion for product qty (1)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"(1)\"]"}));
//// click on go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// Add Assertion for social network button
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// click on facebook button
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// login as fb user
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// start if statement
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"})){
//// click on go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
//// end if sttaement
//}
//// start else statement
//else{
//// print result
//printResults("PrintNote", "\"element is not present\"");
//// end else statement
//}
//// wait
//waitUntil("CheckVisibleElement", new String[]{XPATH, "//a[text() = 'Enviar pedido']"}, "10","disabled");
//// start if statement
//if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar pedido\"]"})){
//// Click on send order button
//clickOnElement( new String[] {XPATH, "//a[text() = \"Enviar pedido\"]"});
//// Add Assertion for order shipped message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \"¡Listo! Tu pedido fue enviado\"]"}));
//// Add Assertion for send message by whatsapp
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// Add Assertion for send message by whatsapp
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// end if
//}
//// start else statement
//else{
//// print result
//printResults("PrintNote", "\"element is not present\"");
//// end else
//}
//
//    status = "passed";
//   }
//  @Test
//  public void PA__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCOneEightzerozeroThreeSix() {
//javascriptExecution("lambda-name=PA  ETwoE Search by Name with Login Networks and checkout by SBTwoCOneEightzerozeroThreeSix");
//
//// clear cache and cookies
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-cyzone.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
//// click on personal care
//clickOnElement( new String[] {XPATH, "//a[@title=\'Cuidado personal\']"});
//// click on first product
//clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[1]"});
//// Add Assertion forproduct title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
//// Start If Statement
//if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
//// click on add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// Click on go pay
//clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
//// add assertion for remove link
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'item__remove-action\']/child::div/child::a[text()=\'Eliminar\']"}));
//// Add Assertion for Price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Precio\"]"}));
//// Add Assertion for Total
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Total\"]"}));
//// Add assertion for  Product Title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "p[class=\"cart-items-title\"]"}));
//// Add Assertion for go pay
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1)"}));
//// add  assertion for go pay checkout
//Assert.assertTrue(isElementAvailable(new String[] { ID, "checkout-display-continueCheckout"}));
//// Click on go pay continue
//clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(5) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// login fb
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// wait
//waitForTime(3);
//// refresh page
//pageRefresh();
//// Start If  statement
//if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar pedido\"]"})){
//// Click on send the order
//clickOnElement( new String[] {XPATH, "//a[text() = \"Enviar pedido\"]"});
//// Add Assertion for ready! you asked
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \"¡Listo! Tu pedido fue enviado\"]"}));
//// Add Assertion for send message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// End  If  statement
//}
//// Start else statement
//else{
//// send order button is not present
//printResults("PrintNote", "\"element is not present\"");
//// End  else statement
//}
//// End if statement
//}
//// start else statement
//else{
//// Print Result
//printResults("PrintNote", "\"element is not present\"");
//// end else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void CL__ETwoE_Add_supported_from_PDP_carousel__Free_Sample__send_to_SBTwo__CFiveSixSeven() {
//javascriptExecution("lambda-name=CL  ETwoE Add supported from PDP carousel  Free Sample  send to SBTwo  CFiveSixSeven");
//
//// Clear cache and cookies
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
//// Click onsets
//clickOnElement( new String[] {XPATH, "//a[@title=\'SETS\']"});
//// if product present in sets
//if (isElementAvailable(new String[] { XPATH, "//a[@class=\'name\']"})){
//// Click on first product
//clickOnElement( new String[] {XPATH, "//a[@class=\'name\']"});
//// Click add to cart button
//// if condition for \"add to cart\" present
//if (isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
//// if condition for \"add to cart\" clickable
//if (isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"})){
//// Add assertion \"add to cart\" clickable
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// click on \"add to cart\" button
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// end if for \"add to cart\" clickable
//}
//// Else statement \"add to cart\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "add to cart is not clickable");
//// end else \"add to cart\" clickable
//}
//// end if for  \"add to cart\" present
//}
//// else statement   \"add to cart\" present
//else{
//// print message
//printResults("PrintNote", "add to cart is not present");
//// end else statement  \"add to cart\" present
//}
//// Click on go pay button
//// if condition for \"go pay\" present
//if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// if condition for \"go pay\" clickable
//if (isElementClickable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// click on \"go pay\" button
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// end if for \"go pay\" clickable
//}
//// Else statement \"go pay\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "go pay is not clickable");
//// end else \"go pay\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \"go pay\" present
//else{
//// print message
//printResults("PrintNote", "go pay is not present");
//// end else statement  \"go pay\" present
//}
//// if free sample present
//if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-body\'])[1]"})){
//// Add assertion for free sample
//takeScreenshotOfParticularElement(new String[] { XPATH, "(//div[@class=\'panel-body\'])[1]" },"logs/Screenshots/mpDYVJ.png");
//// end if pree sample present
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"element is not present\"");
//// end else statement
//}
//// Click on cart go pay button
//// if condition for \" go pay\" present
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
//// if condition for \" go pay\" clickable
//if (isElementClickable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
//// click on \"go pay\" button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
//// end if for \"go pay\" clickable
//}
//// Else statement \"go pay\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "go pay is not clickable");
//// end else \"go pay\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \"go pay\" present
//else{
//// print message
//printResults("PrintNote", "go pay is not present");
//// end else statement  \"go pay\" present
//}
//// Login as guest user
//// if first name present
//if (isElementAvailable(new String[] { ID, "guest.firstName"})){
//// Write text in guest firstName text field
//typeText(new String[] { ID, "guest.firstName" }, "photon");
//// Write text in guest lastName text field
//typeText(new String[] { ID, "guest.lastName" }, "test");
//// Write text in  guest email textfield
//typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
//// Click on guest agree To Receive publicity checkbox
//clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
//// if terms present
//if (isElementAvailable(new String[] { XPATH, "//input[@id=\'guest.belcorpToC\']"})){
//// click on terms2
//clickOnElement( new String[] {XPATH, "//input[@id=\'guest.belcorpToC\']"});
//// end if terms2 present
//}
//// Start else
//else{
//// Print
//printResults("PrintNote", "Element is not present");
//// End else
//}
//// Click on guest login submit button
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\"Continuar como invitado\")]"});
//// end if first name present
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"guest first name textbox not resent\"");
//// end else statement
//}
//// if present region
//if (isElementAvailable(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']"})){
//// Select region
//selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent2\']" }, "ANTOFAGASTA (II)");
//// Select commune
//selectOption(new String[] { XPATH, "//select[@id=\'address.regionIsoParent1\']" }, "ANTOFAGASTA");
//// Select location
//selectOption(new String[] { XPATH, "//select[@id=\'address.regionIso\']" }, "ANTOFAGASTA");
//// Write text street number
//typeText(new String[] { XPATH, "//input[@id=\'address.line1\']" }, "10");
//// Write text in phone number
//typeText(new String[] { XPATH, "//input[@id=\'address.phone\']" }, "1234567890");
//// Click on pay button
//clickOnElement( new String[] {XPATH, "//button[@id=\'addressSubmit\']"});
//// Proceed to checkout
//// if credit card present
//if (isElementAvailable(new String[] { CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"})){
//// click on credit cart
//clickOnElement( new String[] {CSS, "div#belcorpNewCheckoutPaymentModeSelector > div:nth-of-type(2) > div:nth-of-type(2) > label > span:nth-of-type(1)"});
//// Write text in card holder Name
//typeText(new String[] { XPATH, "//input[@id=\'cardholderName\']" }, "APRO");
//// Write text in card Number
//typeText(new String[] { XPATH, "//input[@id=\'cardNumber\']" }, "5160033004714834");
//// Select expiry month
//selectOption(new String[] { XPATH, "//select[@id=\'expirationMonth\']" }, "11");
//// Select expiry year
//selectOption(new String[] { XPATH, "//select[@id=\'expirationYear\']" }, "2025");
//// Write cvv number
//typeText(new String[] { XPATH, "//input[@id=\'securityCode\']" }, "123");
//// Select document type
//selectOption(new String[] { XPATH, "//select[@id=\'docType\']" }, "Otro");
//// Write text in docNumber
//typeText(new String[] { XPATH, "//input[@id=\'docNumber\']" }, "12345678");
//// Click on Terms1
//clickOnElement( new String[] {XPATH, "//input[@id=\'Terms1_mpagoCreditCardForm\']"});
//// Click on pay button
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn btn-block submit_mpagoForm checkout-next\']"});
//// end if
//}
//// start else statement
//else{
//// Print Result
//printResults("PrintNote", "\"credit card section is not present\"");
//// End else statement
//}
//// if confirmation page present
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"})){
//// Add assertion for confirmation message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'checkout-success__body__headline\']"}));
//// end if confirmation page present
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"confirmation is not present\"");
//// end else statement
//}
//// end if region present
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"region is not present\"");
//// end else statement
//}
//// end if product present
//}
//// else product present
//else{
//// Print note
//printResults("PrintNote", "\"Sorry! product is not available\"");
//// end else
//}
//
//    status = "passed";
//   }
//  @Test
//  public void MX__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCTwoNineFourNine() {
//javascriptExecution("lambda-name=MX  ETwoE Search by Name with Login Networks and checkout by SBTwoCTwoNineFourNine");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL(" https://s1-esika.tiendabelcorp.com/mx/tiendaprueba");
//// Click on Bela
//clickOnElement( new String[] {XPATH, "//a[text() = \"Bela\"]"});
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// Add Assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// Add Assertion for button(+)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for button(+)
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for button(-)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"-\"]"}));
//// Add Assertion for button(-)
//Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[text() = \"-\"]"}));
//// Click on Add to cart button
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
//// Click on keep buying button
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
//// navigate backward
//goBack();
//// Click on Máscara de Pest...
//clickOnElement( new String[] {XPATH, "//a[text() = \"Labial de Larga Duración Colorfix Duo Tattoo\"]"});
//// Click on Add to cart button
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
//// click on go pay button
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// Add Assertion for Remove button
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a"}));
//// Add Assertion for Remove button
//Assert.assertTrue(isElementClickable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a"}));
//// click on remove button
//clickOnElement( new String[] {CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > a"});
//// Add Assertion for (1)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"(1)\"]"}));
//// click on go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// Add Assertion for social network button
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// clcik on facebook button
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// login as fb user
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// wait
//waitForTime(5);
//// start if statement
//if (isDisplayed(new String[] { XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"}, 0)) {
//// click on go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(.,\'Ir a pagar\')]"});
//// end if statement
//}
//// start else statement
//else{
//// print result
//printResults("PrintNote", "\"element is not present\"");
//// end else
//}
//// write text in postal code
//typeText(new String[] { CSS, "input[class=\"form-control form-control\"][placeholder=\"Ingresa tu código postal\"]" }, "22056");
//// select option from cologne dropdown
//selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(3) > form > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(3) > div > select" }, "MX-BCN-TIJUANA-HIDALGO");
//// Write text in address.line1
//typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(3) > form > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(4) > input" }, "plot no-100 ,2nd street road");
//// Write text in address.phone
//typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(3) > form > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(7) > input" }, "7896567434");
//// click on click here to continue button for address submt
//clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
//// click on click here to continue button
//clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
//// select option from payment method dropdown
//selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > select" }, "mpago_cash");
//// scroll to continue button
//scrollIntoElementView( new String[] {CSS, "button[class=\'btn btn-magenta btn-primary btn-block submit_mpagoCashForm checkout-next\']"});
//// click on click here to continue button
//clickOnElement( new String[] {XPATH, "//button[text()=\' CLICK AQUÍ PARA CONTINUAR\']"});
//// click on Terms 1
//clickOnElement( new String[] {CSS, "input[type=\"checkbox\"]"});
//// Click on agree To Receive Whatsapp notification
//clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > form > div:nth-of-type(2) > label > input:nth-of-type(1)"});
//// click on finalize your purchase button
//clickOnElement( new String[] {XPATH, "//button[text() = \" Finalizar tu compra\"]"});
//// Add Assertion for confirmation message
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"checkout-success__body__headline\"]"}));
//
//    status = "passed";
//   }
//  @Test
//  public void CL__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCOneSevenFiveSixTwoSixCTwoNineFourSeven() {
//javascriptExecution("lambda-name=CL  ETwoE Search by Name with Login Networks and checkout by SBTwoCOneSevenFiveSixTwoSixCTwoNineFourSeven");
//
//// clear cache and cookies
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to  URL
//getURL("https://s1-esika.tiendabelcorp.com/cl/");
//// Start If Statement
//if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']"})){
//// close popup
//clickOnElement( new String[] {XPATH, "//button[@id=\'cboxClose\']"});
//// End  If Statement
//}
//// start else
//else{
//// Print action
//printResults("PrintNote", "Element is not present");
//// end else
//}
//// click on makeup
//clickOnElement( new String[] {XPATH, "//a[@title=\'Maquillaje\']"});
//// Click on first product
//clickOnElement( new String[] {XPATH, "(//a[@class=\'name\'])[3]"});
//// Add Assertion for product title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// add assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// click on add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// Click on go pay
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// add assertion for remove link
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'item__remove-action\']/child::div/child::a[text()=\'Eliminar\']"}));
//// Add Assertion for Total
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Total\"]"}));
//// Add Assertion for Price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Precio\"]"}));
//// Add Assertion for go pay
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1)"}));
//// Add Assertion for quantity selector
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for Product
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Producto\"]"}));
//// add assertion for product title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "p[class=\"cart-items-title\"]"}));
//// Click on go pay continue
//clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']//button[@id=\'checkout-display-continueCheckout\']"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// login fb
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// wait
//waitForTime(3);
//// refresh page
//pageRefresh();
//// Start If  statement
//if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar pedido\"]"})){
//// Click on send the order
//clickOnElement( new String[] {XPATH, "//a[text() = \"Enviar pedido\"]"});
//// Add Assertion for ready! you asked
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \"¡Listo! Tu pedido fue enviado\"]"}));
//// Add Assertion for send message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// End If  statement
//}
//// Start else statement
//else{
//// Send order button is not present
//printResults("PrintNote", "\"element is not present\"");
//// End  else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void CO__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCTwoNineFourEight() {
//javascriptExecution("lambda-name=CO  ETwoE Search by Name with Login Networks and checkout by SBTwoCTwoNineFourEight");
//
//// Go to URL
//getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
//// Click on Labial de Larga...
//clickOnElement( new String[] {XPATH, "//a[text() = \"Labial de Larga Duración Colorfix Duo Tattoo\"]"});
//// Add Assertion for button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"-\"]"}));
//// Click on Labial de Larga...
//clickOnElement( new String[] {CSS, "h1[class=\"name\"]"});
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// Add Assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// Click on Add to cart button
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
//// Click on keep buying button
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Seguir Comprando\')]"});
//// navigate backward
//goBack();
//// Click on Bela
//clickOnElement( new String[] {XPATH, "//a[text() = \"Bela\"]"});
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// Add Assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// Add Assertion for qty selector button(+)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"+\"]"}));
//// Add Assertion for qty selector button(-)
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"-\"]"}));
//// Add Assertion for share link
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "span[class=\"share-btn-icon shareBtnShare\"]"}));
//// Click on Add to cart button
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
//// click on go pay button
//// explicit wait for Go Pay Button
//waitUntil("CheckClickableElement", new String[]{XPATH, "//a[contains(text(),'Ir a pagar')]"}, "10","disabled");
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// Add Assertion for remove button
//Assert.assertTrue(isElementClickable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > a"}));
//// Add Assertion for remove button
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > a"}));
//// click on remove button
//clickOnElement( new String[] {CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1) > ul > li:nth-of-type(3) > table > tbody > tr > td > li:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > a"});
//// click on go pay button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/button[contains(text(),\'Ir a pagar\')]"});
//// Add Assertion for social network button
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// Add Assertion for social network button
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// log in with facebook
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// wait
//waitForTime(3);
//// Refresh
//pageRefresh();
//// start if statement
//if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar pedido\"]"})){
//// Click on send order
//clickOnElement( new String[] {XPATH, "//a[text() = \"Enviar pedido\"]"});
//// Add Assertion for order shipped message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \"¡Listo! Tu pedido fue enviado\"]"}));
//// Add Assertion for send message by whatsapp
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// Add Assertion for send message by whatsapp
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// end if
//}
//// start else statement
//else{
//// print in result
//printResults("PrintNote", "\"element is not present\"");
//// end else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void CO__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCFiveFourEight_CTwoNineFourEight() {
//javascriptExecution("lambda-name=CO  ETwoE Search by Name with Login Networks and checkout by SBTwoCFiveFourEight CTwoNineFourEight");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-esika.tiendabelcorp.com/co/?consultantUrl=tiendaCO98");
//// Click on sets
//clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
//// select product
//clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[6]"});
//// refresh
//pageRefresh();
//// cross out price assertion
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']"}));
//// add quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
//// add quantity
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn js-qty-selector-plus\']"});
//// Reduce quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
//// close subscription pop up
//closeAlert();
//// start of if loop
//if (isElementAvailable(new String[] { XPATH, "//div[@id=\"storeProductLink\"]"})){
//// assertion on copy link button
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@id=\"storeProductLink\"]"}));
//// End of if loop
//}
//// start else statement
//else{
//// Print Result
//printResults("PrintNote", "\"copy link is not present\"");
//// End else
//}
//// assertion on  \"see details\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//p[@class=\'product-variant-detailButton product-variant-detail-button-esika\']"}));
//// assertion on \"Add to cart\"
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// refresh
//pageRefresh();
//// add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// wait
//waitForTime(3);
//// assertion on \"keep buying\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//li//div//div//div[@class=\'nav-cart\']//div//div[@class=\'add-to-cart add-to-cart-cross\']//a[contains(text(),\'     Seguir Comprando\')]"}));
//// assertion on \"Go Pay\"
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"}));
//// refresh
//pageRefresh();
//// Click on cyzone
//clickOnElement( new String[] {XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-cyzone\']"});
//// Click on sets
//clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
//// refresh
//pageRefresh();
//// wait
//waitUntil("CheckElement", new String[]{XPATH, "(//a[@class='name'])[12]"}, "10","disabled");
//// Click on product
//clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[12]"});
//// Click on select tone
//clickOnElement( new String[] {ID, "selectVariable"});
//// Click on input checkbox
//clickOnElement( new String[] {CSS, "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input"});
//// Click on Apply
//clickOnElement( new String[] {CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button"});
//// Click on Add to cart
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Agregar a la bolsa\')]"});
//// click on go pay
//clickOnElement( new String[] {XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"});
//// Click on go pay
//clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(5) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
//// Click on j_username
//clickOnElement( new String[] {ID, "j_username"});
//// scroll
//scroll("ScrollDown", 500);
//// Write text in j_username
//typeText(new String[] { ID, "j_username" }, "cyzonapp11@gmail.com");
//// Click on j_password
//clickOnElement( new String[] {ID, "j_password"});
//// scroll
//scroll("ScrollDown", 500);
//// Write text in j_password
//typeText(new String[] { ID, "j_password" }, "Abc@12345");
//// Click on login
//clickOnElement( new String[] {XPATH, "//button[contains(text(),\'Iniciar sesión\')]"});
//// refresh
//pageRefresh();
//// click on Go Pay
//clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(5) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
//// go pay purple box
//clickOnElement( new String[] {XPATH, "//div//div//a[text()=\'Ir a pagar\']"});
//// Select Option from Elige un depart...
//selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > select" }, "CO-DEP-25");
//// Close alert
//closeAlert();
//// Switch to main DoM
//backToMainFrame();
//// Select Option from AGUACHICAARJONA...
//selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div > select" }, "25-GAMARRA");
//// Click on address.line1
//clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(3) > input"});
//// Write text in address.line1
//typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(3) > input" }, "a");
//// Click on address.line2
//clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(4) > input"});
//// Write text in address.line2
//typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(4) > input" }, "b");
//// Click on address.referen...
//clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > input"});
//// Write text in address.referen...
//typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(5) > input" }, "c");
//// Click on address.phone
//clickOnElement( new String[] {CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(6) > input"});
//// Write text in address.phone
//typeText(new String[] { CSS, "main > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(6) > input" }, "123456");
//// Click on CLICK AQUÍ PARA...
//clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
//// Click on CLICK AQUÍ PARA...
//clickOnElement( new String[] {XPATH, "//button[text() = \"CLICK AQUÍ PARA CONTINUAR\"]"});
//// Switch to previous tab
//switchToPreviousTab();
//// Switch to next tab
//switchToNextWindow();
//// Select Option from Seleccione un M...
//selectOption(new String[] { CSS, "main > div:nth-of-type(3) > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > select" }, "mpago_cash");
//// Click on CLICK AQUÍ PARA...
//clickOnElement( new String[] {CSS, "button[type=\"button\"][class=\"btn btn-magenta btn-primary btn-block submit_mpagoCashForm checkout-next\"]"});
//// Click on Terms1
//clickOnElement( new String[] {CSS, "input[type=\"checkbox\"]"});
//// Click on Pay
//clickOnElement( new String[] {CSS, "button[type=\"submit\"]"});
//// assertion on Email
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//li[text()=\'cyzonapp11@gmail.com\']"}));
//
//    status = "passed";
//   }
//  @Test
//  public void PE__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCFiveFivezero() {
//javascriptExecution("lambda-name=PE  ETwoE Search by Name with Login Networks and checkout by SBTwoCFiveFivezero");
//
//// clear cache and cookies
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-lbel.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
//// Click on Rose D’Amelie P
//clickOnElement( new String[] {XPATH, "//a[text() = \"Rose D’Amelie Perfume de Mujer\"]"});
//// Add Assertion for Rose D’Amelie P...
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]"}));
//// Add Assertion for old price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'old-price\']"}));
//// Add assertion for active price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'simple-price-container hidden-xs hidden-sm\']/child::span[@class=\'active-price\']"}));
//// click on add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// Add assertion for add to cart
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// Click on go pay
//clickOnElement( new String[] {CSS, "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div > a:nth-of-type(1)"});
//// Click on  go pay checkout
//clickOnElement( new String[] {CSS, "main > section:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(1) > div:nth-of-type(1)"});
//// Add Assertion for go pay checkout
//Assert.assertTrue(isElementAvailable(new String[] { ID, "checkout-display-continueCheckout"}));
//// Add Assertion for remove link
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'item__remove-action\']/child::div/child::a[text()=\'Eliminar\']"}));
//// Add Assertion for Price
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Precio\"]"}));
//// Add Assertion for Total
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[text() = \"Total\"]"}));
//// Add assertion for  Product Title
//Assert.assertTrue(isElementAvailable(new String[] { CSS, "p[class=\"cart-items-title\"]"}));
//// Click on go pay continue
//clickOnElement( new String[] {CSS, "div#StickySidebar > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > button:nth-of-type(2)"});
//// add assertion for social network
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// login fb
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// wait
//waitForTime(3);
//// refresh page
//pageRefresh();
//// Start if statement
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']"})){
//// click on go pay continue
//clickOnElement( new String[] {XPATH, "//div[@class=\'down-bar-actions col-md-6 col-xs-12\']/child::div/child::button[@class=\'btn btn-magenta btn-block btn--continue-checkout js-continue-checkout-button\']"});
//// End if Statement
//}
//// start else
//else{
//// Print Result
//printResults("PrintNote", "\"go pay button is not clickable\"");
//// end else statement
//}
//// Start If  statement
//if (isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar pedido\"]"})){
//// Click on send the order
//clickOnElement( new String[] {XPATH, "//a[text() = \"Enviar pedido\"]"});
//// Add Assertion for send message
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text() = \"Enviar mensaje por Whatsapp\"]"}));
//// Add Assertion for ready! you asked
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \"¡Listo! Tu pedido fue enviado\"]"}));
//// End If  statement
//}
//// Start else statement
//else{
//// Send order button is not present
//printResults("PrintNote", "\"element is not present\"");
//// End  else statement
//}
//
//    status = "passed";
//   }
//  @Test
//  public void CL__ETwoE_Search_by_Name_with_Login_Networks_and_checkout_by_SBTwoCOneEightzerozeroThreeTwo() {
//javascriptExecution("lambda-name=CL  ETwoE Search by Name with Login Networks and checkout by SBTwoCOneEightzerozeroThreeTwo");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-esika.tiendabelcorp.com/cl/vibranza/p/200098673/MaryEmy");
//// cross out price assertion
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']"}));
//// plus quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
//// add quantity
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn js-qty-selector-plus\']"});
//// minus quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
//// assertion on copy link button
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//div[@id=\"storeProductLink\"]"}));
//// refresh
//pageRefresh();
//// assertion on \"Add to cart\"
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// click on add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// assertion on \"keep buying\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//li//div//div//div[@class=\'nav-cart\']//div//div[@class=\'add-to-cart add-to-cart-cross\']//a[contains(text(),\'     Seguir Comprando\')]"}));
//// assertion on \"Go Pay\"
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"}));
//// refresh
//pageRefresh();
//// Click on cyzone
//clickOnElement( new String[] {XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-cyzone\']"});
//// Click on sets
//clickOnElement( new String[] {XPATH, "//a[text() = \"sets\"]"});
//// refresh
//pageRefresh();
//// Click on product
//clickOnElement( new String[] {XPATH, "(//a[@class=\"name\"])[3]"});
//// refresh
//pageRefresh();
//// Click on Add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\"addToCartButton\"]"});
//// go forward
//goForward();
//// click on go pay
//clickOnElement( new String[] {XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"});
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//div[@class=\"down-bar-actions col-md-6 col-xs-12\"]//button[@id=\"checkout-display-continueCheckout\"]"});
//// Assertion on social network(Fb)
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[text() = \"Ingresar con Facebook\"]"}));
//// login as fb user
//// Click on Ingresar con Fa...
//clickOnElement( new String[] {XPATH, "//span[text() = \"Ingresar con Facebook\"]"});
//// switch to child window
//switchToNextWindow();
//// Write text in email
//typeText(new String[] { CSS, "input[type=\"text\"]" }, "ec.esc2.mto.fb@gmail.com");
//// Write text in pass
//typeText(new String[] { CSS, "input[type=\"password\"]" }, "Belcorp123");
//// Click on Login button for facebook
//clickOnElement( new String[] {ID, "loginbutton"});
//// switch to parent window
//switchToPreviousTab();
//// Wait
//waitForTime(6);
//// go forward
//goForward();
//
//    status = "passed";
//   }
//  @Test
//  public void CL__ETwoE_Add_supported_from_carousel_in_PDPCOneSevenFiveSixTwoNine() {
//javascriptExecution("lambda-name=CL  ETwoE Add supported from carousel in PDPCOneSevenFiveSixTwoNine");
//
//// clear cache
//// Clear cookies
//deleteAllCookies();
//// Clear storage
//javascriptExecution("window.localStorage.clear();");
//// Clear session storage
//javascriptExecution("window.sessionStorage.clear();");
//// Go to URL
//getURL("https://s1-lbel.tiendabelcorp.com/cl/?consultantUrl=sdsdsdad");
//// Click on perfumes
//clickOnElement( new String[] {XPATH, "//a[@title=\'Perfumes\']"});
//// select product
//clickOnElement( new String[] {XPATH, "//a[@class=\'name\']"});
//// cross out price assertion
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'old-price\']"}));
//// add quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-plus\']"}));
//// add quantity
//clickOnElement( new String[] {XPATH, "//button[@class=\'btn js-qty-selector-plus\']"});
//// Reduce quantity assertion
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'btn js-qty-selector-minus\']"}));
//// assertion on \"Add to cart\"
//Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']"}));
//// add to cart
//clickOnElement( new String[] {XPATH, "//button[@id=\'addToCartButton\']"});
//// assertion on \"keep buying\"
//Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//li//div//div//div[@class=\'nav-cart\']//div//div[@class=\'add-to-cart add-to-cart-cross\']//a[contains(text(),\'     Seguir Comprando\')]"}));
//// assertion on \"Go Pay\"
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li//a[contains(text(),\' Ir a pagar\')]"}));
//// Click on go pay
//// if condition for \"go pay\" present
//if (isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// if condition for \"go pay\" clickable
//if (isElementClickable(new String[] { XPATH, "//a[contains(text(),\'Ir a pagar\')]"})){
//// click on \"go pay\" button
//clickOnElement( new String[] {XPATH, "//a[contains(text(),\'Ir a pagar\')]"});
//// end if for \"go pay\" clickable
//}
//// Else statement \"go pay\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "go pay is not clickable");
//// end else \"go pay\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \"go pay\" present
//else{
//// print message
//printResults("PrintNote", "go pay is not present");
//// end else statement  \"go pay\" present
//}
//// click on cart go pay button
//// if condition for \" go pay\" present
//if (isElementAvailable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
//// if condition for \" go pay\" clickable
//if (isElementClickable(new String[] { XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"})){
//// click on \"go pay\" button
//clickOnElement( new String[] {XPATH, "//div[@class=\'actions\']/child::button[contains(text(),\'Ir a pagar\')]"});
//// end if for \"go pay\" clickable
//}
//// Else statement \"go pay\" clickable
//else{
//// Print message not clickable
//printResults("PrintNote", "go pay is not clickable");
//// end else \"go pay\" clickable
//}
//// end if for  \"go pay\" present
//}
//// else statement   \"go pay\" present
//else{
//// print message
//printResults("PrintNote", "go pay is not present");
//// end else statement  \"go pay\" present
//}
//// Proceed as guest user
//// Write text in guest firstName text field
//typeText(new String[] { ID, "guest.firstName" }, "photon");
//// Write text in guest lastName text field
//typeText(new String[] { ID, "guest.lastName" }, "test");
//// Write text in  guest email textfield
//typeText(new String[] { ID, "guest.email" }, "photontest@endtest-mail.io");
//// Click on guest agree To Receive publicity checkbox
//clickOnElement( new String[] {ID, "guest.agreeToReceivePublicity"});
//// Click on guest login submit button
//clickOnElement( new String[] {XPATH, "//button[text() = \"Continuar como invitado\"]"});
//// start if statement
//if (isElementAvailable(new String[] { XPATH, "//strong[text() = \"¿Cómo quisieras recibir tu pedido?\"]"})){
//// Add Assertion for How would you like to receive your order
//Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//strong[text() = \"¿Cómo quisieras recibir tu pedido?\"]"}));
//// Click on go pay
//clickOnElement( new String[] {XPATH, "//a[text() = \"Ir a pagar\"]"});
//// end if
//}
//// Start else
//else{
//// print
//printResults("PrintNote", "\"element is not present\"");
//// End else
//}
//// Select Option from REGION
//selectOption(new String[] { ID, "address.regionIsoParent2" }, "CL-REG-03");
//// Select Option from COMMUNE
//selectOption(new String[] { ID, "address.regionIsoParent1" }, "03-CHAÑARAL");
//// Select Option from location
//selectOption(new String[] { ID, "address.regionIso" }, "CHAÑARAL-DIEGO DE ALMAGRO");
//// Write text in STREET AND NUMBER
//typeText(new String[] { ID, "address.line1" }, "churchil street");
//// Write text in TELEPHONE CONTACT
//typeText(new String[] { ID, "address.phone" }, "1234567898");
//// Click on addressSubmit
//clickOnElement( new String[] {ID, "addressSubmit"});
//// wait
//waitUntil("CheckElement", new String[]{ID, "deliveryMethodSubmit"}, "15","disabled");
//
//    status = "passed";
//   }
}