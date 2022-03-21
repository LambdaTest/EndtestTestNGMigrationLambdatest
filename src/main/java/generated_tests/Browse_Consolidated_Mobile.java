package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Browse_Consolidated_Mobile extends WebDriverHelper {

  @Test
  public void MENU_Logged_behavior__MOBILECOneThreeFiveOne() {
    javascriptExecution("lambda-name=MENU Logged behavior  MOBILECOneThreeFiveOne");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to login url
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/login");
    // Enter username
    typeText(new String[] { XPATH, "//input[@id=\"j_username\"]" }, "test_user_44913491@testuser.com");
    // enter password
    typeText(new String[] { XPATH, "//input[@id=\"j_password\"]" }, "Qatest2042");
    // wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "//button[text() = ' Iniciar sesión']" }, "10",
      "disabled");
    // Click on login Button
    clickOnElement(new String[] { XPATH, "//button[contains(text(),\'Iniciar sesión\')]" });
    //wait
    waitForTime(7);
    // Close popup
    clickOnElement(new String[] { CSS, "button#cboxClose > span" });
    // Click on hamburgur menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Add assertion for my Account
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Mi Cuenta\']" }));
    // Take a snip to verify the my account
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/bgcQLg.png");
    // click on my account arrow
    clickOnElement(new String[] { XPATH,
      "//span[text()=\'Mi Cuenta\']/../..//span[@class=\"glyphicon glyphicon-chevron-down myAcctExp\"]" });
    // Take a snip for my account option verification
    takeScreenshotOfParticularElement(new String[] { XPATH, "//ul[@data-trigger=\"#signedInUserOptionsToggle\"]" },
      "logs/Screenshots/DEqmeg.png");
    // Add assertion for My personal data
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//ul[@data-trigger=\"#signedInUserOptionsToggle\"]//a[text()=\'mis datos personales\']" }));
    // Add assertion for My placed orders
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//ul[@data-trigger=\"#signedInUserOptionsToggle\"]//a[text()=\'mis pedidos realizados\']" }));
    // Add assertion for My addresses
    Assert.assertTrue(isElementClickable(
      new String[] { XPATH, "//ul[@data-trigger=\"#signedInUserOptionsToggle\"]//a[text()=\'mis direcciones\']" }));
    // start if statement
    if (isElementAvailable(
      new String[] { XPATH, "//ul[@class=\"bic-user-menu\"]//a[text()=\' Quiero ser consultora\']" })) {
      // Add assertion for i want to be consultant
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//ul[@class=\"bic-user-menu\"]//a[text()=\' Quiero ser consultora\']" }));
      // end if
    }
    // Add assertion for find a consultant
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//ul[@class=\"bic-user-menu\"]//span[text()=\'Buscar una consultora\']" }));
    // Add assertion for close session
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Cerrar Sesión\')]" }));

    status = "passed";
  }

  @Test
  public void TONE_DROP_BAR__Product_with_VariantsCOneThreeNineSix__CThreeTwoThreeSix() {
    javascriptExecution("lambda-name=TONE DROP BAR  Product with VariantsCOneThreeNineSix  CThreeTwoThreeSix");

    // Clear cookies and cache
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to Ecom URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/delineador-de-ojos-colorfix-gel-tattoo/p/200095781");
    // scroll to Variant DD
    scroll("ScrollDown", 600);
    // Variant DD is Visible
    if (isDisplayed(new String[] { XPATH, "//span[@class=\'variantName\']" }, 0)) {
      // Click Variant DD
      javascriptExecution("document.querySelector(\"span[class=\'variantName\']\").click();");
      // Validate Text is Center, Colour
      takeScreenshotOfParticularElement(
        new String[] { XPATH, "//li[@class=\'tone-slide variantGroupAll\']/parent::ul" },
        "logs/Screenshots/BYlOpc.png");
      // End of If Loop
    }
    // Else Statement
    else {
      // Print in Console
      printResults("PrintNote", "\"Variant DropDown is not Present\"");
      // End Else Statement Loop
    }

    status = "passed";
  }

  @Test
  public void arrows_menu_mobile_Check_the_arrows_in_menu_mobile_MobileCOneThreeFiveTwo() {
    javascriptExecution("lambda-name=arrows menu mobile Check the arrows in menu mobile MobileCOneThreeFiveTwo");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on hamburguer menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje navigation arrow
    clickOnElement(new String[] { XPATH,
      "//a[text()=\'maquillaje\']/../../..//span[@class=\"glyphicon glyphicon-chevron-right hidden-md hidden-lg nav__link--drill__down js_nav__link--drill__down\"]" });
    // take snip to verify the title
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/Rmzbbv.png");
    // Add assertion for maquillaje
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Maquillaje\')]" }));
    // Click on ojos navigation arrow
    clickOnElement(new String[] { XPATH,
      "//a[text()=\'Ojos\']/../..//span[@class=\"glyphicon glyphicon-chevron-right hidden-md hidden-lg nav__link--drill__down js_nav__link--drill__down_third_level\"]" });
    // take a snip to veridy the title
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/svuoZv.png");
    // Add assertion for ojos
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\' Ojos\']" }));
    // click on shade
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'Sombras\')]" });
    // assert for shade link
    Assert.assertTrue(checkCurrentUrlContains("sombras"));

    status = "passed";
  }

  @Test
  public void MENU_Level_design__MOBILECOneThreeFourNine() {
    javascriptExecution("lambda-name=MENU Level design  MOBILECOneThreeFourNine");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on hamburguer menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Click on maquillaje navigation arrow
    clickOnElement(new String[] { XPATH,
      "//a[text()=\'maquillaje\']/../../..//span[@class=\"glyphicon glyphicon-chevron-right hidden-md hidden-lg nav__link--drill__down js_nav__link--drill__down\"]" });
    // take snip to verify the title is in bold
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/LmSGYP.png");
    // Add assertion for maquillaje
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[contains(text(),\'Maquillaje\')]" }));
    // Click on ojos navigation arrow
    clickOnElement(new String[] { XPATH,
      "//a[text()=\'Ojos\']/../..//span[@class=\"glyphicon glyphicon-chevron-right hidden-md hidden-lg nav__link--drill__down js_nav__link--drill__down_third_level\"]" });
    // take a snip to verify the title is in bold
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/mWRAPG.png");
    // Add assertion for ojos
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\' Ojos\']" }));

    status = "passed";
  }

  @Test
  public void ANCHOR_HEADER_BRANDS_COneThreeSixSixCThreeOneSixSevenCThreeOneEightFiveCThreeTwozerozero() {
    javascriptExecution(
      "lambda-name=ANCHOR HEADER BRANDS COneThreeSixSixCThreeOneSixSevenCThreeOneEightFiveCThreeTwozerozero");

    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to  ECOM URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[1]" }));
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" }));
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" }));
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" });
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" }));
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" }));
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[1]" }));
    // Click on Esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" });
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" }));
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" }));
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[2]" }));
    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go To Consultant URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[1]" }));
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" }));
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" }));
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" });
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" }));
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" }));
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[1]" }));
    // Click on Esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" });
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" }));
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" }));
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[2]" }));

    status = "passed";
  }

  @Test
  public void MENU_Behavior_when_not_logged_in__MOBILECOneThreeFivezero() {
    javascriptExecution("lambda-name=MENU Behavior when not logged in  MOBILECOneThreeFivezero");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // Close the popup
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
    // Click on hamburguer menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // Add assertion for login/signup
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\"auto liUserSign\"]" }));
    // Add assertion for i want to be consultant
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\"yCmsComponent show_mobile want-sell\"]" }));
    // take a snip to verify all the user menu component present
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/cjVSvd.png");
    // Add assertion for find consulatnt
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Buscar una consultora\']" }));

    status = "passed";
  }

  @Test
  public void ZOOM_EN_MOBILE_MTO_And_ECOMCOneFourTwoTwoCThreeTwoFiveSix() {
    javascriptExecution("lambda-name=ZOOM EN MOBILE MTO And ECOMCOneFourTwoTwoCThreeTwoFiveSix");

    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on  hemberger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on  personal care
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Add assertion for product title
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Hover on product image
    mouseHoverOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    //wait
    waitForTime(5);
    // Click on image
    clickOnElement(new String[] { XPATH, "//div[@class='zoomImg']" });
    //wait
    waitForTime(5);
    // Add Assertion For Popup Displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxLoadedContent\']" }));
    // Click on  Close Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Check if Video Play Button Is Present
    if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'ytp-large-play-button ytp-button\'])[1]" })) {
      // Add Assertion For Video Play Button
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//button[@class=\'ytp-large-play-button ytp-button\'])[1]" }));
      // Add Assertion For Thumbnail
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'ytp-cued-thumbnail-overlay\']" }));
      // End If Statement
    }
    // Start Else Statement
    else {
      // Print Result
      printResults("PrintNote", "\"Video is not present\"");
      // End Else Statement
    }
    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go To  consultantb URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // click on  hemberger menu
    clickOnElement(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" });
    // Click on  personal care
    clickOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Add assertion for product title
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Hover on product image
    mouseHoverOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on image
    clickOnElement(new String[] { XPATH, "//div[@class=\'zoomImg\']" });
    // Add Assertion For Popup Displayed
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxLoadedContent\']" }));
    // Click on  Close Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Check if Video Play Button Is Present
    if (isElementAvailable(new String[] { XPATH, "(//button[@class=\'ytp-large-play-button ytp-button\'])[1]" })) {
      // Add Assertion For Video Play Button
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//button[@class=\'ytp-large-play-button ytp-button\'])[1]" }));
      // Add Assertion For Thumbnail
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'ytp-cued-thumbnail-overlay\']" }));
      // End If Statement
    }
    // Start Else Statement
    else {
      // Print results
      printResults("PrintNote", "\"Video is not peresent\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void CAOneHeader_behavior_mobile__COneThreeFiveThree__CThreeOneSevenTwo() {
    javascriptExecution("lambda-name=CAOneHeader behavior mobile  COneThreeFiveThree  CThreeOneSevenTwo");

    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Validate header in  mobile view
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\'bic-tabs-brands\']" },
      "logs/Screenshots/sGlPMq.png");
    // Click on Cyzone brand
    clickOnElement(new String[] { XPATH, "//a[@id=\'lnk-sup-cyzone\']" });
    // Validate Cyzone brand present in header
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@id=\'lnk-sup-cyzone\']" }));
    // Validate sub-categories of cyzone
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'splide__track\']" }));
    // Click on lbel brand
    clickOnElement(new String[] { XPATH, "//a[@id=\'lnk-sup-lbel\']" });
    // Validate lbel brand present in header
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@id=\'lnk-sup-lbel\']" }));
    // Validate sub-categories of lbel
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'splide__track\']" }));
    // Click on esika brand
    clickOnElement(new String[] { XPATH, "//a[@id=\'lnk-sup-esika\']" });
    // Validate esika brand present in header
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[@id=\'lnk-sup-esika\']" }));
    // Validate sub-categories of esika
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'splide__track\']" }));

    status = "passed";
  }

  @Test
  public void Mobile__Anchor_Header_Menu__SearchCOneThreeEightzero__CThreeOneSixNine() {
    javascriptExecution("lambda-name=Mobile  Anchor Header Menu  SearchCOneThreeEightzero  CThreeOneSixNine");

    // Clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to  ECOM URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Scroll to bottom
    scroll("ScrollBottom");
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[1]" }));
    // Valiadate \"hemberger menu  is Present\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" }));
    // Validate \"bag is present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'mini-cart-icon\'])[2]" }));
    // Validate \"search engine present\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "(//span[@class=\'input-group-addon searchBoxIconShort\'])[2]" }));
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" });
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" }));
    // Valiadate \"hemberger menu  is Present\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" }));
    // Validate \"bag is present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'mini-cart-icon\'])[2]" }));
    // Validate \"search engine present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//i[@class=\'glyphicon glyphicon-search\'])[3]" }));
    // Click on Esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" });
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" }));
    // Valiadate \"hemberger menu  is Present\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" }));
    // Validate \"bag is present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'mini-cart-icon\'])[2]" }));
    // Validate \"search engine present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//input[@id=\'js-site-search-input\'])[2]" }));
    // clear cache and cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go To Consultant URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Validate \"cyzone  is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-cyzone\'])[1]" }));
    // Valiadate \"hemberger menu  is Present\"
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" }));
    // Validate \"bag is present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'mini-cart-icon\'])[2]" }));
    // Validate \"search engine present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//i[@class=\'glyphicon glyphicon-search\'])[3]" }));
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" });
    // Validate \"lbel is displayed \"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[1]" }));
    // Valiadate \"hemberger menu  is Present\"
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" }));
    // Validate \"bag is present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'mini-cart-icon\'])[2]" }));
    // Validate \"search engine present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//i[@class=\'glyphicon glyphicon-search\'])[3]" }));
    // Click on Esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[1]" });
    // Validate \"Esika is displayed\"
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" }));
    // iadate \"hemberger menu  is Present\"
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "//button[@class=\'navbar-toggle js-toggle-sm-navigation\']" }));
    // Validate \"bag is present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'mini-cart-icon\'])[2]" }));
    // Validate \"search engine present\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//input[@id=\'js-site-search-input\'])[2]" }));

    status = "passed";
  }

  @Test
  public void MENU_First_level_information__MOBILECOneThreeFiveSeven() {
    javascriptExecution("lambda-name=MENU First level information  MOBILECOneThreeFiveSeven");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // close popup
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
    // Click on hamburguer menu
    clickOnElement(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" });
    // take a snip to verify all the user menu component present
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/eAkSoe.png");
    // Add assertion for login/signup
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//li[@class=\"auto liUserSign\"]" }));
    // Add assertion for i want to be consultant
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//div[@class=\"yCmsComponent show_mobile want-sell\"]" }));
    // Add assertion for find consulatnt
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Buscar una consultora\']" }));
    // Click on maquillaje navigation arrow
    clickOnElement(new String[] { XPATH,
      "//a[text()=\'maquillaje\']/../../..//span[@class=\"glyphicon glyphicon-chevron-right hidden-md hidden-lg nav__link--drill__down js_nav__link--drill__down\"]" });
    // take a snip of hamburgur menu to verify user menu is not showing
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/kDRYhv.png");
    // Click on ojos navigation arrow
    clickOnElement(new String[] { XPATH,
      "//a[text()=\'Ojos\']/../..//span[@class=\"glyphicon glyphicon-chevron-right hidden-md hidden-lg nav__link--drill__down js_nav__link--drill__down_third_level\"]" });
    // take a snip of hamburgur menu user menu is not showing
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"close-nav-mobile\"]" },
      "logs/Screenshots/blAOQj.png");
    // Add assertion for login/signup
    Assert.assertFalse(isElementDisplayed(new String[] { XPATH, "//li[@class=\"auto liUserSign\"]" }));
    // Add assertion for i want to be consultant
    Assert.assertFalse(
      isElementDisplayed(new String[] { XPATH, "//div[@class=\"yCmsComponent show_mobile want-sell\"]" }));
    // Add assertion for find consulatnt
    Assert.assertFalse(isElementDisplayed(new String[] { XPATH, "//span[text()=\'Buscar una consultora\']" }));

    status = "passed";
  }

  @Test
  public void CATwoOn__off_consulting_canopyCOneThreeFiveFour() {
    javascriptExecution("lambda-name=CATwoOn  off consulting canopyCOneThreeFiveFour");

    // Clear cache cookies
    // Clear cookies
    // deleteAllCookies();
    // Clear storage
    // javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    // javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/?consultantUrl=MaryEmy");
    // Add assertion for header
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[contains(@class,\"b2c-header-desktop\")]" }));
    // add assertion for modules menu
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[contains(@class,\"bic-tabs-brands\")]" }));
    // add assertion for consultant bar
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\"bic-consultant-header\"]" }));
    // Click on hamburguer menu
    Assert.assertTrue(
      isElementFound(new String[] { XPATH, "//button[@class=\"navbar-toggle js-toggle-sm-navigation\"]" }));
    // add assertion for sub heading
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\"new-header header-center\"]" }));

    status = "passed";
  }
}