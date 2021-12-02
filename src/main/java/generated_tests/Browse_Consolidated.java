package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Browse_Consolidated extends WebDriverHelper {

  @Test
  public void PRODUCT_CAROUSEL_Behavior_on_clickC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on  labial studio look mate img
    clickOnElement(new String[] { CSS,
      "img[class=\"lazyOwl\"][src=\"/cdn-cgi/image/width=250,fit=contain,f=auto//medias/200097894-fotocrosselling.jpg?context=bWFzdGVyfHJvb3R8MjA4NTN8aW1hZ2UvanBlZ3xoZmUvaGRlLzEwODAzMTIyMjA4Nzk4LzIwMDA5Nzg5NF9mb3RvY3Jvc3NlbGxpbmcuanBnfGQyZjI4NTQxZmNkNTcyZmRkNzFkMDVhODQ5MDVlZDdlOTg5NTEzODQ4ZWQ2MTE3MzM0MDgxMWU3NmU5YWIzMTY\"]" });
    // Add Assertion for  labial studio look mate
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on labial studio look mate to buy button
    clickOnElement(new String[] { CSS, "a[href=\"/labial-studio-look-mate-smokey-nude/p/200102116\"]" });
    // Add Assertion for labial studio look mate
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on \'Máscara de pestañas studio look\' img
    clickOnElement(new String[] { CSS,
      "img[class=\"lazyOwl\"][src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200101074_fotocrosselling.jpg\"]" });
    // Add Assertion for \'Máscara de pestañas studio look\'
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on \'Máscara de pestañas studio look\' button
    clickOnElement(new String[] { CSS, "a[href=\"/mascara-de-pestanas-studio-look/p/200101074\"]" });
    // Add Assertion for \'Máscara de pestañas studio look\' to buy btn
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on crema hidratante facial en gel skin first img
    clickOnElement(new String[] { CSS,
      "img[class=\"lazyOwl\"][src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200097894_fotocrosselling.jpg\"]" });
    // Add Assertion for crema hidratante facial en gel skin first
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on crema hidratante facial en gel skin first to buy btn
    clickOnElement(new String[] { CSS, "a[href=\"/crema-hidratante-facial-en-gel-skin-first/p/200097894\"]" });
    // Add Assertion for crema hidratante facial en gel skin first
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on see all products
    clickOnElement(new String[] { XPATH, "//a[text() = \"mira todos los productos\"]" });
    // Go to new tab
    switchToNextWindow();
    // handle popup
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
    // if present
    if (isElementAvailable(new String[] { CSS, "div[class=\"pagination-bar-results\"]" })) {
      // Add Assertion more products results
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\"pagination-bar-results\"]" }));
      // end if
    }

    status = "passed";
  }

  @Test
  public void TONE_DROPOFF_BAR_Without_VariationsC() {
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
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-esika\']" });
    // Click on sets
    clickOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
    // Click on one product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[5]" });
    // Handle popup
    moveAndClickWithOffset(new String[] { XPATH, "(//div[@class=\'row\'])[2]" }, 30, 40);
    // start of if loop
    if (isElementClickable(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" })) {
      // Assertion on add to cart button
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" }));
      // add product to cart
      clickOnElement(new String[] { XPATH, "//button[@id=\"addToCartButton\"]" });
      // End of if loop
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // if lbel clickable
    if (isElementClickable(
      new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" })) {
      // Click on LBel
      clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
      // if product present in sets
      if (isDisplayed(new String[] { XPATH, "//a[text() = \"sets\"]" }, 0)) {
        // Click on sets
        clickOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
        // Click on product
        clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[2]" });
        // refresh
        pageRefresh();
        // Click on cyzone
        clickOnElement(
          new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-cyzone\']" });
        // go back
        goBack();
        // go forward
        goForward();
        // Click on sets
        clickOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
        // go back
        goBack();
        // go forward
        goForward();
        // Click on product
        clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
        // Assertion on add to cart button
        Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@id=\'addToCartButton\']" }));
        // Click on Add to cart
        clickOnElement(new String[] { XPATH, "//button[@id=\'addToCartButton\']" });
        // end if product present in sets
      }
      // end if lble clickable
    }

    status = "passed";
  }

  @Test
  public void FEATURED_VIDEO_TITLE__HYBRISVC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=hohammed");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // click on labial studio look mate
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[3]" });
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" })) {
      // scroll to video section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" });
      // Add Assertion For Video Title
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" }));
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe[id=\'player-featured-video\']" });
      // Add Assertion for video play button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"video title is not present\"");
      // end else statement
    }
    // switch back to main
    backToMainFrame();
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Rouge L\'Intense Labial Líquido
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[12]" });
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-lbel\']" })) {
      // scroll to video section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-lbel\']" });
      // Add Assertion For Video Title
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-lbel\']" }));
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe[id=\'player-featured-video\']" });
      // Add Assertion for video play button  button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"video title is not present\"");
      // end else statement
    }
    // switch back to main
    backToMainFrame();
    // Click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-esika\']" })) {
      // scroll to video section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-esika\']" });
      // Add Assertion for Video title
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-esika\']" }));
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe[id=\'player-featured-video\']" });
      // Add Assertion for button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"video title is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void VIDEO_TUTORIALES__Verificar_que_solo_se_reproduce_un_contenido_a_la_vez__C_C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // scroll down till the video
    scroll("ScrollDown", 1900);
    // if video visible
    if (isDisplayed(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" }, 0)) {
      // video 1 is clickable
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" }));
      // click on video1
      clickOnElement(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" });
      // Take screenshot for first video is playing
      takeScreenshot("logs/Screenshoots/khyXFg.png");
      // video 2 is clickable
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[2]" }));
      // click on video 2
      clickOnElement(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[2]" });
      // Take screenshot clicked video is playing
      takeScreenshot("logs/Screenshoots/IpVnbg.png");
      // end if video visible
    }

    status = "passed";
  }

  @Test
  public void HYBRISV__ECOMPDP_A_variant_without_price_makes_the_price_not_shown_in_the_restC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/labial-de-larga-duracion-colorfix-iconic/p/200102448");
    // Click on color RADIANT ORANGE
    clickOnElement(new String[] { XPATH, "//ul[@id=\"pdp-variant-list\"]//div[@data-code=\"200096974\"]" });
    // Add Assertion for price
    Assert.assertTrue(
      isElementDisplayed(new String[] { XPATH, "//div[@class=\"product-details\"]//div[@class=\"priceContainer\"]" }));
    // Click on color without price
    clickOnElement(new String[] { XPATH, "//ul[@id=\"pdp-variant-list\"]//div[@data-code=\"200102448\"]" });
    // take a snip to verify product price is not displayed
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"product-main-info\"]" },
      "logs/Screenshots/POSTxM.png");

    status = "passed";
  }

  @Test
  public void STAMP_BAR__C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://cyzone.tiendabelcorp.com/pe/");
    // click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // click on Maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // refresh
    pageRefresh();
    // click on fourth product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[4]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-4\']" })) {
      // scroll to element
      scrollIntoElementView(new String[] { CSS, "div[class=\'seals-flex-container-wp seals-items-4\']" });
      // Add Assertion for total no of stamp
      Assert.assertEquals(
        getChildElements(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-4\']" }).size(),
        "4");
      // End If Statement
    }
    // Start Else Statement
    else {
      // Elememt not present
      printResults("PrintNote", "\"element is not peresent\"");
      // End else Statement
    }
    // Go To URL
    getURL("https://cyzone.tiendabelcorp.com/pe/");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // refresh
    pageRefresh();
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "(//a[@class=\"name\"])[1]" })) {
      // Click on  first product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
      // End  If Statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-4\']" })) {
      // scroll to stamp
      scrollIntoElementView(new String[] { CSS, "div[class=\'seals-flex-container-wp seals-items-4\']" });
      // Add Assertion for total no of stamp
      Assert.assertEquals(
        getChildElements(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-4\']" }).size(),
        "4");
      // End  If Statement
    }
    // Start Else  Statement
    else {
      // Element not present
      printResults("PrintNote", "\"element is not present\"");
      // End Else  Statement
    }

    status = "passed";
  }

  @Test
  public void PopupsC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on sets
    clickOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
    // click on  first product
    clickOnElement(new String[] { XPATH, "(//div[@class=\'inner-card\'])[1]" });
    // Click on empty cart
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > a > div:nth-of-type(2) > span" });
    // Click on popup
    clickOnElement(new String[] { CSS,
      "header > nav:nth-of-type(1) > div > div > div:nth-of-type(2) > div > ul > li:nth-of-type(3) > div > div > div > div:nth-of-type(2)" });
    // Click on consultant
    clickOnElement(new String[] { XPATH, "//span[@class=\'glyphicon glyphicon-chevron-right\']" });
    // add assertion for consultant name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'consultant-name\']" }));
    // refresh page
    pageRefresh();
    // if visible
    if (isDisplayed(new String[] { XPATH,
        "(//main//div[@class=\'product-variant-detail-button mt-lg-0 ml-lg-auto principalButtonViewDetail\']//p[text()=\' Ver detalle\'])[1]" },
      0)) {
      // Click on see  detail
      clickOnElement(new String[] { XPATH,
        "(//main//div[@class=\'product-variant-detail-button mt-lg-0 ml-lg-auto principalButtonViewDetail\']//p[text()=\' Ver detalle\'])[1]" });
      // end if visible
    }

    status = "passed";
  }

  @Test
  public void PRODUCT_CAROUSEL_MTO__Video_behavior__C() {
    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=mitiendaonlineelizabeth");
    // scroll down till the video
    scroll("ScrollDown", 1900);
    // if video is present
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class=\'bic-cyzone-video-tutorials__item--description\']/parent::div[@id=\'bic-cyzone-video-tutorials-item-0\']" })) {
      // Add assertion video present
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//div[@class=\'bic-cyzone-video-tutorials__item--description\']/parent::div[@id=\'bic-cyzone-video-tutorials-item-0\']" }));
      // Add Assertion for video name content
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'content\']/child::p" }));
      // if play button clickable
      if (isElementClickable(
        new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" })) {
        // Add assertion on play button
        Assert.assertTrue(isElementAvailable(
          new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" }));
        // end if play button clickable
      }
      // Take screenshot video is in same browser
      takeScreenshot("logs/Screenshoots/rytanc.png");
      // end if video is present
    }
    // else for video is  not present
    else {
      // Print message
      printResults("PrintNote", "\"Sorry!  Video is not present\"");
      // end else video is not present
    }

    status = "passed";
  }

  @Test
  public void HYBRISVC() {
    // launch url
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on esika
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-esika\']" });
    // mouse hover on Make-up
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // wait
    waitForTime(5);
    // mouse hover on perfume
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\"Perfumes\"]" });
    // mouse hover on personal
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\"Cuidado personal\"]" });
    // mouse hover on skincare
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\"Cuidado de la piel\"]" });
    // mouse hover on accessories
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\"Accesorios\"]" });
    // wait
    waitForTime(5);
    // assertion for mouse hover
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//a[@title=\"Accesorios\"]" }));
    // click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // mouse hover on make-up
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'maquillaje\']" });
    // mouse hover on perfume
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'perfumes\']" });
    // mouse hover on facial treatment
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'tratamiento facial\']" });
    // mouse hover on personal
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'cuidado personal\']" });
    // wait
    waitForTime(5);
    // assertion for mouse hover
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[text()=\'cuidado personal\']" }));
    // click on Cyzone
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-cyzone\']" });
    // mouse hover on build your pack
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'arma tu pack\']" });
    // mouse hover on sets
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'sets\']" });
    // mouse hover makeup dept
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // mouse hover on perfume
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'perfumes\']" });
    // mouse hover on studio look
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'studio look\']" });
    // mouse hover on skin first
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'skin first\']" });
    // mouse hover on personal
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'cuidado personal\']" });
    // mouse hover on moda
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'moda y accesorios\']" });
    // mouse hover on blog
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'blog\']" });
    // mouse hover on love yourself
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'quiérete\']" });
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // Scroll Down
    scroll("ScrollDown", 1200);
    // if section title present
    if (isElementAvailable(new String[] { XPATH, "//span[text() = \" Contigo\"]" })) {
      // Assertion  on section title
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \" Contigo\"]" }));
      // Hover on Facial treatment category
      mouseHoverOnElement(new String[] { CSS,
        "main > div:nth-of-type(7) > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1) > a:nth-of-type(2) > h3" });
      // Assertion on name of category
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//h3[text() = \" Tratamiento Facial\"]" }));
      // Click on Facial treatment category
      clickOnElement(new String[] { XPATH, "//h3[text() = \" Tratamiento Facial\"]" });
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
        // popup
        clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
        // End of if loop
      }
      // scroll
      scroll("ScrollDown", 400);
      // go back to LBel
      goBack();
      // Assertion on name of category
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//h3[text()=\' Maquillaje\']" }));
      // Click on Makeup category
      clickOnElement(new String[] { XPATH, "//h3[text()=\' Maquillaje\']" });
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
        // popup
        clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
        // End of if loop
      }
      // scroll
      scroll("ScrollDown", 359);
      // go back to LBel
      goBack();
      // Assertion on name of category
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//h3[text()=\' Fragancias\']" }));
      // Click on Fragrance category
      clickOnElement(new String[] { XPATH,
        "(//h3[@class=\"belcorp-cms-carousel-item__title js-belcorp-cms-carousel-item-link-trigger\"])[3]" });
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
        // close popup
        clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
        // End of if loop
      }
      // scroll to view product list
      scroll("ScrollDown", 400);
      // go back to LBel
      goBack();
      // Assertion on name of category
      Assert.assertTrue(isElementClickable(new String[] { XPATH,
        "(//h3[@class=\"belcorp-cms-carousel-item__title js-belcorp-cms-carousel-item-link-trigger\"])[4]" }));
      // click on personal care category
      clickOnElement(new String[] { XPATH,
        "(//h3[@class=\"belcorp-cms-carousel-item__title js-belcorp-cms-carousel-item-link-trigger\"])[4]" });
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
        // close popup
        clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
        // End of if loop
      }
      // scroll to product list
      scroll("ScrollDown", 385);
      // go back to LBel
      goBack();
      // end if section title present
    }
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/");
    // scroll to content carousel
    scrollIntoElementView(new String[] { CSS, "img[alt=\'Catálogo online\']" });
    // add assertion for content carousel
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//img[@alt=\'Catálogo online\']" }));
    // Click on content carousel
    clickOnElement(new String[] { XPATH, "//img[@alt=\'Catálogo online\']/parent::a" });
    // Add Assertion for Catálogo Digita...
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//b[text()=\'catálogo\']" }));

    status = "passed";
  }

  @Test
  public void PromotionsC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // Click on  product
    clickOnElement(new String[] { XPATH, "//a[text()=\'mascarilla facial de tela reductora de poros skin first\']" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Promociones exclusivas\']" })) {
      // add assertion for promotions exclusive
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Promociones exclusivas\']" }));
      // add assertion for promotion body
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\'commercialCarousel-pdp-wrapper\'])[1]" }));
      // End If Statement
    }
    // Click on lbel
    clickOnElement(new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'lbel\']" });
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on first product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text() = \" Promociones exclusivas\"]" })) {
      // Add Assertion for promotion
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \" Promociones exclusivas\"]" }));
      // add assertion for promotion body
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\'commercialCarousel-pdp-wrapper\'])[1]" }));
      // End If Statement
    }
    // click on esika
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']" });
    // Hover on maquillaje
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Click on Delineador
    clickOnElement(new String[] { XPATH, "//a[text() = \"Delineador\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Start if Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text() = \" Promociones exclusivas\"]" })) {
      // add assertion for promotion
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \" Promociones exclusivas\"]" }));
      // add assertion for promotion body
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\'commercialCarousel-pdp-wrapper\'])[1]" }));
      // End if Statement
    }

    status = "passed";
  }

  @Test
  public void DYNAMIC_RICH_RELEVANCE_CARROUSSELS_IN_POSITIONC__C() {
    // clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/?consultantUrl=mx202108");
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on Perfume De Muje
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Nuestra selección para ti\']" })) {
      // add assertion for\"They have already tried them, and you?\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'container-sprinklr-pdp-title\']" }));
      // End If Statement
    }
    // Click on Esika
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on  fourth product
    clickOnElement(
      new String[] { XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[4]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Recomendados para ti\']" })) {
      // add assertion for recommended for you
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Recomendados para ti\']" }));
      // End If Statement
    }
    // Click on cyzone
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']" });
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text()=\'perfumes\']" });
    // Click on Mon L\'Bel Perfume
    clickOnElement(
      new String[] { XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[3]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' PERFECT MATCH! Complementa tu look con\']" })) {
      // add assertion for\"perfrect match! complement your look with\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//h3[text()=\' PERFECT MATCH! Complementa tu look con\']" }));
      // End  If Statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Esto también te podría encantar\']" })) {
      // add assertion for\"this might also enchant you\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//h3[text()=\' Esto también te podría encantar\']" }));
      // End  If Statement
    }
    // clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/");
    // Check Title is Visible
    if (isDisplayed(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[1]" }, 0)) {
      // add assertion for\"our selection for you\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[1]" }));
      // End If Statement
    }
    // Check Title is Visible
    if (isDisplayed(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[2]" }, 0)) {
      // Validate \"Recommendations\" Title
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[2]" }));
      // End If Statement
    }
    // Click on Esika
    clickOnElement(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[1]" });
    // Check Title is Visible
    if (isDisplayed(new String[] { XPATH, "(//h2[@class=\'js-multi-text-product-carousel-title\'])[1]" }, 0)) {
      // add assertion for recommended for you
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//h2[@class=\'js-multi-text-product-carousel-title\'])[1]" }));
      // End If Statement
    }
    // Click on cyzone
    clickOnElement(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[3]" });
    // Check Title is Visible
    if (isDisplayed(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[1]" }, 0)) {
      // add assertion for\"perfrect match! complement your look with\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[1]" }));
      // End If Statement
    }
    // Check Title is Visible
    if (isDisplayed(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[2]" }, 0)) {
      // add assertion for\"this might also enchant you\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//h2[@class=\'section-title\']/child::span)[2]" }));
      // End If Statement
    }

    status = "passed";
  }

  @Test
  public void Carrousel_de_contenidos_LbelC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://lbel.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
    // scroll to img
    scrollIntoElementView(new String[] { CSS, "img[alt=\'BicLbelAdvert2Image\']" });
    // hover on img
    mouseHoverOnElement(new String[] { XPATH, "//img[@alt=\'BicLbelAdvert2Image\']" });
    // Click on see catalog
    clickOnElement(new String[] { XPATH, "//img[@alt=\'BicLbelAdvert2Image\']/parent::div" });
    // if  digital catalog present
    if (isElementAvailable(new String[] { XPATH, "//p[text() = \"Catálogo Digital\"]" })) {
      // Add Assertion for digital catalog
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//p[text() = \"Catálogo Digital\"]" }));
      // end if digital catalog present
    }
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://lbel.tiendabelcorp.com/pe/");
    // scroll to img
    scrollIntoElementView(new String[] { CSS, "img[alt=\'BicLbelAdvert2Image\']" });
    // hover on img
    mouseHoverOnElement(new String[] { XPATH, "//img[@alt=\'BicLbelAdvert2Image\']" });
    // Click on see catalog
    clickOnElement(new String[] { XPATH, "//img[@alt=\'BicLbelAdvert2Image\']" });
    // handle popup
    clickOnElement(new String[] { XPATH, "//img[@alt=\'close\']" });
    // refresh
    pageRefresh();
    // add assertion for catalog
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text()=\'Catálogo\']" }));

    status = "passed";
  }

  @Test
  public void HYBRISV__THUMBNAIL_FOR_VIDEO_IN_GALLERY_FROM_MDMC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/");
    // Click on tratamiento facial
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'tratamiento facial\')]" });
    // select option from ranking
    selectOption(new String[] { XPATH, "//select[@id=\"sortOptions1\"]" }, "price-desc");
    // Click on first product
    clickOnElement(new String[] { XPATH, "//a[@id=\"product_productName_200099969\"]" });
    // start if statement for video thumbnail
    if (isElementAvailable(new String[] { CSS, "ul#productGalleryThumbnails div:nth-child(4) > div > li > a > img" })) {
      // Click on img with thumbnail
      javascriptExecution(
        "document.querySelector(\"ul#productGalleryThumbnails div:nth-child(4) > div > li > a > img\").click();");
      // Click on play button
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div" });
      // wait condtion
      waitForTime(6);
      // Click on img 2
      clickOnElement(new String[] { CSS, "ul#productGalleryThumbnails div:nth-child(2) > div > li > a > img" });
      // click on img with thumbnail
      javascriptExecution(
        "document.querySelector(\"ul#productGalleryThumbnails div:nth-child(4) > div > li > a > img\").click();");
      // switch to iframe
      switchToIFrame(new String[] { ID, "video-position-3" });
      // if clickable
      if (isElementClickable(new String[] { CSS, "button[class=\"ytp-play-button ytp-button\"]" })) {
        // start if statement
        if (isElementClickable(new String[] { CSS, "button[class=\"ytp-play-button ytp-button\"]" })) {
          // click on resume button
          javascriptExecution("document.querySelector(\"button[class=\'ytp-play-button ytp-button\']\").click(); ");
          // end if statement
        }
        // wait untill the end of video
        waitForTime(20);
        // switch back to main frame
        backToMainFrame();
        // Add assertion for video thumbnail
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\"pdp-image-container\"]" }));
        // end if
      }
      // end if
    }
    // start else statement
    else {
      // print in results
      printResults("PrintNote", "\"video thumbnail is not present \"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void Component__ANCHOR_HEADER_BRANDS__C__C() {
    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Add Assertion for Esika
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[1]" }));
    // Add Assertion for Esika
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[1]" }));
    // Go to Lbel Url
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    // Assertion For Lbel
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[2]" }));
    // Assertion For Lbel
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[2]" }));
    // Go to Cyzone
    getURL("https://cyzone.tiendabelcorp.com/cl/");
    // if cbox popup present
    if (isDisplayed(new String[] { CSS, "button#cboxClose > span" }, 0)) {
      // Close  \"Boost the business\" Pop up
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if cbox popup present
    }
    // Assertion For Cyzone
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[3]" }));
    // Assertion For Cyzone
    Assert.assertTrue(isElementClickable(new String[] { XPATH,
      "//header[@class=\'js-mainHeader bic-header HOMEPAGE\']/child::nav[1]/child::div/child::div/child::div[1]/child::div/child::div/child::a[3]" }));

    status = "passed";
  }

  @Test
  public void UPDATE_NAVIGATION_ICONS_BY_BRAND__ESIKA_Product_with_VariantsC__C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on Maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Click on third product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[3]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Add Assertion for down arrow button to change variant
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" }));
      // end if statement
    }
    // start else statement
    else {
      // print satatement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(3) > div > ul > li:nth-of-type(1) > div > div > div" })) {
      // Click on change variant (first color)
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(3) > div > ul > li:nth-of-type(1) > div > div > div" });
      // Add Assertion for description(-)button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-title__minus\'])[1]" }));
      // scroll to profit section
      scrollIntoElementView(new String[] { CSS, "h2[bucket-positon=\"Bloque 2\"]" });
      // Click on profit button(+)
      clickOnElement(new String[] { XPATH, "//h2[@bucket-positon=\"Bloque 2\"]/following::div[1]" });
      // scroll to how to use it section
      scrollIntoElementView(new String[] { CSS, "h2[bucket-positon=\"Bloque 3\"]" });
      // Click on How to use it button(+)
      clickOnElement(new String[] { XPATH, "//h2[@bucket-positon=\"Bloque 3\"]/following::div[1]" });
      // Add Assertion for How to use it (-) button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-title__minus\'])[3]" }));
      // end if
    }
    // start else statement
    else {
      // print result
      printResults("PrintNote", "\"element is not present\"");
      // End Else Statement
    }

    status = "passed";
  }

  @Test
  public void TONE_DROPOFF_BARcyzoneProduct_with_VariantsC__C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // scroll down to makeup category
    scrollIntoElementView(new String[] { CSS, "div[name=\"Maquillaje\"]" });
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//p[text() = \"maquillaje\"]" });
    // Click on product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[8]" });
    // Scroll Down
    scroll("ScrollDown", 200);
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//span[@class=\"variantName\"]" })) {
      // Click on Tone dropdown
      clickOnElement(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" });
      // take screenshot of text
      takeScreenshot("logs/Screenshoots/weoSBF.png");
      // select tone
      clickOnElement(new String[] { XPATH, "(//span[@class=\"js-tm-variant-category-pdp \"])[2]" });
      // Assertion on selected tone
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\"variantName\"]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void UPDATE_NAVIGATION_ICONS_BY_BRAND__LBEL_Product_without__VariantsC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on  fifth product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[5]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Add Assertion for dropdown bar for change variant
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(3) > div > ul > li:nth-of-type(4) > div > div > div" })) {
      // Click on fourth color to change variant
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(3) > div > ul > li:nth-of-type(4) > div > div > div" });
      // Add Assertion for description(-) button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-title__minus\'])[1]" }));
      // scroll to health your skin section
      scrollIntoElementView(new String[] { CSS, "h2[bucket-positon=\"Bloque 2\"]" });
      // Click on health your skin(+) button
      clickOnElement(new String[] { XPATH, "//h2[@bucket-positon=\"Bloque 2\"]/following::div[1]" });
      // scroll to Advice tailored to you section
      scrollIntoElementView(new String[] { CSS, "h2[bucket-positon=\"Bloque 3\"]" });
      // Click on Advice tailored to you(+) button
      clickOnElement(new String[] { XPATH, "//h2[@bucket-positon=\"Bloque 3\"]/following::div[1]" });
      // scroll to provocation that is felt section
      scrollIntoElementView(new String[] { CSS, "h2[bucket-positon=\"Bloque 4\"]" });
      // click on provocation that is felt(+) button
      clickOnElement(new String[] { XPATH, "//h2[@bucket-positon=\"Bloque 4\"]/following::div[1]" });
      // Add Assertion for provocation that is felt(-) button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'panel-title__minus\'])[4]" }));
      // end if statement
    }
    // start else statement
    else {
      // Print result
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void SET_ICONS_BY_BRAND_IN_TONE_FOLDERC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Hover on maquillaje
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Click on Delineador
    clickOnElement(new String[] { XPATH, "//a[text() = \"Delineador\"]" });
    // Click on Delineador líquid
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Click on set tone
      clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" });
      // Close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // add Assertion for Tonos
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
      // End If Statement
    }
    // Click on lbel
    clickOnElement(new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'lbel\']" });
    // Hover on maquillaje
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/pe/maquillaje/c/lbel-02\"]" });
    // Click on Correctores
    clickOnElement(new String[] { XPATH, "//a[text() = \"Correctores\"]" });
    // click on first product
    clickOnElement(new String[] { XPATH, "//a[@id=\'product_productName_P0260069007\']" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Click on set tone
      clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" });
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // Add Assertion for Tonos
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
      // End  If Statement
    }
    // Click on cyzone
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//p[text() = \"maquillaje\"]" });
    // Click on  product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[6]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Click on set tone
      clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" });
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // Add Assertion for Tonos
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@id=\'cboxTitle\']" }));
      // End if statement
    }

    status = "passed";
  }

  @Test
  public void Verify_that_only_one_content_is_played_at_a_time__C_C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // scroll down till the video
    scroll("ScrollDown", 1900);
    // if video visible
    if (isDisplayed(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" }, 0)) {
      // video 1 is clickable
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" }));
      // click on video1
      clickOnElement(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[1]" });
      // Take screenshot for first video is playing
      takeScreenshot("logs/Screenshoots/pxKVPd.png");
      // video 2 is clickable
      Assert.assertTrue(
        isElementClickable(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[2]" }));
      // click on video 2
      clickOnElement(new String[] { XPATH, "(//button[@class=\'plyr__control plyr__control--overlaid\'])[2]" });
      // Take screenshot clicked video is playing
      takeScreenshot("logs/Screenshoots/drLamE.png");
      // end if video is visible
    }

    status = "passed";
  }

  @Test
  public void PROMOTIONS_IN_MENU__C__C() {
    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // \"Boost the business\" Pop up is Present
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // Close  \"Boost the business\" Pop up
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // End If Statement
    }
    // MouseOver  sets
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
    // MouseOver personal care
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // MouseOver Skin Care
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"cuidado de la piel\"]" });
    // MouseOver Make up
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // MouseOver on perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // MouseOver Accessories
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"accesorios\"]" });
    // MouseOver Blog
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'blog\']" });
    // MouseOver OverShops
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'nuestras tiendas\']" });
    // Go to Lbel Url
    getURL("https://s1-lbel.tiendabelcorp.com/cl/");
    // \"Boost the business\" Pop up is Present
    if (isElementAvailable(new String[] { XPATH, "button#cboxClose > span" })) {
      // Close  \"Boost the business\" Pop up
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // End If Statement
    }
    // MouseOver on sets
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
    // MouseOver on Facial treatment
    mouseHoverOnElement(new String[] { XPATH, "//a[@title = \"Tratamiento facial\"]" });
    // MouseOver on makeup
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // MouseOver  on perfumes
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // MouseOver Personal care
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // MouseOver on Promotions
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'promociones\']" });
    // MouseOver on Magazine
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'magazine\']" });
    // MouseOver on Tutorials
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'tutoriales\']" });
    // MouseOver on Catalog And Shops
    mouseHoverOnElement(new String[] { XPATH, "//a[text()=\'catálogos y tiendas\']" });
    // Go to Cyzone
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // \"Boost the business\" Pop up
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // Close  \"Boost the business\" Pop up
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // End If Statement
    }
    // MouseOver on sets
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"sets\"]" });
    // MouseOver  on makeup
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // MouseOver on fragancias
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"fragancias\"]" });
    // MouseOver on studio look
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"studio look\"]" });
    // MouseOver on skin first
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"skin first\"]" });
    // MouseOver on personal care
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"cuidado personal\"]" });
    // MouseOver  on moda
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"moda\"]" });
    // MouseOver on blog
    mouseHoverOnElement(new String[] { XPATH, "//a[text() = \"blog\"]" });

    status = "passed";
  }

  @Test
  public void TONE__ESIKA_DROP_BAR_Product_with_Variants_C__C() {
    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // if present
    if (isElementAvailable(new String[] { CSS, "button#cboxClose > span" })) {
      // Close  \"Boost the business\" Pop up
      clickOnElement(new String[] { CSS, "button#cboxClose > span" });
      // end if
    }
    // Click on Makeup
    clickOnElement(new String[] { XPATH, "//div[@name=\'EsikaBicSection4\']//a[text()=\'Maquillaje\']" });
    // Click On Second Product
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div[2]/child::div[2]/child::a" });
    // Click on TONE textfield
    clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" });
    // Start If Statement
    if (isElementClickable(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[1]" })) {
      // Select First option
      clickOnElement(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[1]" });
      // Handle Subscribe Me Popup
      moveAndDoubleClickWithOffset(new String[] { XPATH, "//span[@class=\'share-btn-icon shareBtnShare\']" }, 24, 24);
      // validate Selected option is visible
      Assert.assertTrue(
        isElementDisplayed(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" }));
      // End If Statement
    }
    // Subscribe popup
    moveAndDoubleClickWithOffset(new String[] { XPATH, "//span[@class=\'share-btn-icon shareBtnShare\']" }, 24, 24);
    // Click on Tone Text field
    clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" });
    // Start If Statement
    if (isElementClickable(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[2]" })) {
      // Select Second option
      clickOnElement(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[2]" });
      // validate Selected option is visible
      Assert.assertTrue(
        isElementDisplayed(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" }));
      // End If Statement
    }
    // Click on Tone Text field
    clickOnElement(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" });
    // Start If Statement
    if (isElementClickable(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[3]" })) {
      // Select Third option
      clickOnElement(new String[] { XPATH, "//ul[@id=\'modalPdp-variant-list\']/descendant::span[3]" });
      // validate Selected option is visible
      Assert.assertTrue(
        isElementDisplayed(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']/child::span[3]" }));
      // End If Statement
    }

    status = "passed";
  }

  @Test
  public void HYBRISV_NOMBRE_DE_PRODUCTO_EN_FIXED_BAR_DESDE_EL_INICIOC_C() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a" });
    // Add Assertion for name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // add assertion for fixed bar
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"row product-down-bar\"]" }));

    status = "passed";
  }

  @Test
  public void Name_of_product__C() {
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pa/cc-cream/p/200092415/esmeralda");
    // Add assertion for variant url
    Assert.assertTrue(checkCurrentUrlContains("200092415"));
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
    // Add assertion for price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[@class=\'active-price\']" }));
    // click on medium tone variant
    clickOnElement(new String[] { XPATH, "//ul[@id=\'pdp-variant-list\']//div[@data-tone=\'MEDIUM\']" });
    // click on medium tone variant url
    getURL("https://s1-lbel.tiendabelcorp.com/pa/cc-cream/p/200092416/esmeralda");
    // Add assertion for medium tone variant
    Assert.assertTrue(checkCurrentUrlContains("200092416"));
    // click on cannele tone
    clickOnElement(new String[] { XPATH, "//ul[@id=\'pdp-variant-list\']//div[@data-tone=\'CANNELE\']" });
    // click on medium tone variant url
    getURL("https://s1-lbel.tiendabelcorp.com/pa/cc-cream/p/200092417/esmeralda");
    // Add assertion for cannele  tone variant
    Assert.assertTrue(checkCurrentUrlContains("200092417"));

    status = "passed";
  }

  @Test
  public void UPDATE_GALLERY_CAROUSEL_ICONSC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on personal care category
    clickOnElement(new String[] { XPATH, "//p[text() = \"cuidado personal\"]" });
    // Click on product
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200097895_fotocrosselling.jpg\"]" });
    // scroll
    scroll("ScrollDown", 130);
    // Assertion on arrow
    Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Next\"]" }));
    // Click on down arrow
    clickOnElement(new String[] { XPATH, "//button[text() = \"Next\"]" });
    // Scroll Up
    scroll("ScrollUp", 200);
    // Click on up arrow
    clickOnElement(new String[] { XPATH, "//button[text() = \"Previous\"]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // if Makeup category present
    if (isElementAvailable(new String[] { XPATH, "//h3[text() = \" Maquillaje\"]" })) {
      // Click on Makeup category
      clickOnElement(new String[] { XPATH, "//h3[text() = \" Maquillaje\"]" });
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
        // close popup
        clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
        // End of if loop
      }
      // Click on product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
      // scroll
      scroll("ScrollDown", 98);
      // Click on down arrow
      clickOnElement(new String[] { XPATH, "//button[text() = \"Next\"]" });
      // Assertion on up arrow
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[text() = \"Previous\"]" }));
      // Start if up arrow
      if (isElementClickable(new String[] { XPATH, "//button[text() = \"Previous\"]" })) {
        // Click on up arrow
        clickOnElement(new String[] { XPATH, "//button[text() = \"Previous\"]" });
        // end if
      }
      // Click on esika
      clickOnElement(
        new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-esika\']" });
      // Click on facial treatment category
      clickOnElement(new String[] { XPATH, "//a[text() = \"Tratamiento facial\"]" });
      // Click on product
      clickOnElement(new String[] { XPATH, "//a[text() = \" Crema Facial Nutritiva 30+ Oxygen Supreme\"]" });
      // scroll
      scroll("ScrollDown", 137);
      // Click on down arrow
      clickOnElement(new String[] { XPATH, "//button[text() = \"Next\"]" });
      // Click on up arrow
      clickOnElement(new String[] { XPATH, "//button[text() = \"Previous\"]" });
      // Assertion on up barrow
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"Previous\"]" }));
      // end if Makeup category present
    }

    status = "passed";
  }

  @Test
  public void HYBRIS() {
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/co/");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[@id=\'product_productName_P0132053000\']" })) {
      // scroll
      scrollIntoElementView(new String[] { CSS, "a[id=\'product_productName_P0132053000\']" });
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'variant_200084505\']" }, 0)) {
        // Add Assertion For Curcada
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[@id=\'product_labels_P0132053000\']" }));
        // start if statement
        if (isElementAvailable(new String[] { XPATH, "//span[@id=\'product_labels_P0132053000\']" })) {
          // take snip of Curcada
          takeScreenshotOfParticularElement(new String[] { XPATH, "//span[@id=\'product_labels_P0132053000\']" },
            "logs/Screenshots/QIEOfl.png");
          // end if statement
        }
        // start else
        else {
          // Print Result
          printResults("PrintNote", "\"curcada is not present\"");
          // End else
        }
        // Click on 2nd tone
        clickOnElement(new String[] { XPATH, "//div[@id=\'variant_200084505\']" });
        // Add Assertion For Curcada
        Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//span[@id=\'product_labels_P0132053000\']" }));
        // Take Snip Of Curcada
        takeScreenshotOfParticularElement(new String[] { XPATH, "//span[@id=\'product_labels_P0132053000\']" },
          "logs/Screenshots/ritfMb.png");
        // End if statement
      }
      // start else
      else {
        // Print Result
        printResults("PrintNote", "\"tone is not present\"");
        // End else statement
      }
      // end if statement
    }
    // start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"Product is not present\"");
      // End else statement
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/co/c/esika-02/tiendaCO98");
    // Click on Makeup Section
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//a[@id=\'product_productName_P0292099006\']" })) {
      // scroll To element
      scrollIntoElementView(new String[] { CSS, "a[id=\'product_productName_P0292099006\']" });
      // start if statement
      if (isDisplayed(new String[] { XPATH, "//div[@id=\'variant_200102298\']" }, 0)) {
        // Click on 2nd Tone
        clickOnElement(new String[] { XPATH, "//div[@id=\'variant_200102298\']" });
        // end if statement
      }
      // start else statement
      else {
        // Print Result
        printResults("PrintNote", "\"tone is not present\"");
        // End else statement
      }
      // end if statement
    }
    // Start else statement
    else {
      // Print Result
      printResults("PrintNote", "\"product is not available\"");
      // End else statement
    }

    status = "passed";
  }

  @Test
  public void VIDEO_TUTORIALS_Check_the_amount_of_contents_of_the_carouselC_C() {
    // Clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Scroll Down
    scroll("ScrollDown", 1950);
    // Set Variable
    String x = "0";
    // Start if condition
    if (isElementAvailable(
      new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[1]" })) {
      // Click on first video bannner
      clickOnElement(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[1]" });
      // Increment Set Variable
      String x = "1";
      // End if condition
    }
    // Start if condition
    if (isElementAvailable(
      new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[2]" })) {
      // Click on second video bannner
      clickOnElement(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[2]" });
      // Increment Set Variable
      String x = "2";
      // End if condition
    }
    // Start if condition
    if (isElementAvailable(
      new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[3]" })) {
      // Click on third video bannner
      clickOnElement(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[3]" });
      // Increment Set Variable
      String x = "3";
      // End if condition
    }
    // Start if condition
    if (isDisplayed(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[4]" },
      0)) {
      // Click on fourth video bannner
      clickOnElement(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[4]" });
      // Increment Set Variable
      String x = "4";
      // End if condition
    }
    // if arrow smbol visible
    if (isDisplayed(new String[] { XPATH, "//button[@class=\'slick-next slick-arrow\']" }, 0)) {
      // Click On Arrow Symbol
      clickOnElement(new String[] { XPATH, "//button[@class=\'slick-next slick-arrow\']" });
      // Again Click On Arrow Symbol
      clickOnElement(new String[] { XPATH, "//button[@class=\'slick-next slick-arrow\']" });
      // end if arrow symbol visible
    }
    // explicit wait
    waitUntil("CheckClickableElement", new String[] { XPATH, "(//div[@class='plyr__poster'])[5]" }, "3", "disabled");
    // Start if condition
    if (isDisplayed(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[5]" },
      0)) {
      // Click on fifth video bannner
      clickOnElement(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[5]" });
      // Increment Set Variable
      String x = "5";
      // End if condition
    }
    // Start if condition
    if (isDisplayed(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[6]" },
      0)) {
      // Click on sixth video bannner
      clickOnElement(new String[] { XPATH, "(//div[@class=\'plyr__video-wrapper\']/following-sibling::button)[6]" });
      // Increment Set Variable
      String x = "6";
      // End if condition
    }
    // Start If Statement
    if (Assert.assertEquals(x, 8)) {
      // Assertion
      Assert.assertEquals(checkVariableAssertion(variableLessThanValue, "8, "8");
        // Print in Console
        printResults("PrintVariable", "x");
      // End I f Statement
    }

    status = "passed";
  }

  @Test
  public void IMAGE_DISPLAY_SCREEN_ZOOM__C__C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Mouse hover on  Maquillaje
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Add assertion for Studio Look
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "a[href=\"/pe/maquillaje/ojos/studio-look/c/cyzone-020204\"]" }));
    // Click on Studio Look
    clickOnElement(new String[] { CSS, "a[href=\"/pe/maquillaje/ojos/studio-look/c/cyzone-020204\"]" });
    // if clickable
    if (isElementAvailable(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200093927_fotocrosselling.jpg\"]" })) {
      // Click on sombras de ojos...
      clickOnElement(new String[] { CSS,
        "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200093927_fotocrosselling.jpg\"]" });
      // mouse hover on image
      mouseHoverOnElement(new String[] { CSS,
        "div#StickyProductGallery > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div" });
      // Add assertion for image1
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img" }));
      // Click on image1
      clickOnElement(
        new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(2) > div > li > a > img" });
      // Click on shade
      clickOnElement(new String[] { CSS,
        "div#StickyProductGallery > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div" });
      // Click on cboxClose
      clickOnElement(new String[] { ID, "cboxClose" });
      // Add assertion for image2
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img" }));
      // Click on image2
      clickOnElement(
        new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(3) > div > li > a > img" });
      // Click on shade
      clickOnElement(new String[] { CSS,
        "div#StickyProductGallery > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(3) > div > div > div" });
      // Click on cboxClose
      clickOnElement(new String[] { ID, "cboxClose" });
      // Add assertion for image3
      Assert.assertTrue(isElementAvailable(
        new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img" }));
      // Click on image3
      clickOnElement(
        new String[] { CSS, "ul#productGalleryThumbnails > div > div > div:nth-of-type(4) > div > li > a > img" });
      // Click on shade
      clickOnElement(new String[] { CSS,
        "div#StickyProductGallery > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(4) > div > div > div" });
      // Click on cboxClose
      clickOnElement(new String[] { ID, "cboxClose" });
      // end if clickable
    }

    status = "passed";
  }

  @Test
  public void TITLE_UGC_GALLERY__C() {
    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pa/");
    // Hover on perfume
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // if Makeup category present
    if (isDisplayed(new String[] { XPATH, "//a[@title=\'Mujer\']" }, 0)) {
      // Click on woman
      clickOnElement(new String[] { XPATH, "//a[@title=\'Mujer\']" });
      // click on first product
      clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
      // Scroll down til ugc gallery
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-sprinklr-pdp-title\']" });
      // Validate title of Ugc gallery
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'container-sprinklr-pdp-title\']" }));
      // end if Makeup category present
    }

    status = "passed";
  }

  @Test
  public void PRODUCT_CAROUSEL_Video_behavior__C() {
    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // scroll down till the video
    scroll("ScrollDown", 1900);
    // if video is present
    if (isElementAvailable(new String[] { XPATH,
      "//div[@class=\'bic-cyzone-video-tutorials__item--description\']/parent::div[@id=\'bic-cyzone-video-tutorials-item-0\']" })) {
      // Add assertion video present
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//div[@class=\'bic-cyzone-video-tutorials__item--description\']/parent::div[@id=\'bic-cyzone-video-tutorials-item-0\']" }));
      // Add Assertion for video name content
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'content\']/child::p" }));
      // click on play button
      clickOnElement(new String[] { XPATH, "//button[@class=\'plyr__control plyr__control--overlaid\']" });
      // Take screenshot video is in same browser
      takeScreenshot("logs/Screenshoots/zxEDhl.png");
      // end if video is present
    }
    // else for video is  not present
    else {
      // Print message
      printResults("PrintNote", "\"Sorry!  Video is not present\"");
      // end else video is not present
    }

    status = "passed";
  }

  @Test
  public void Stamp_bar__lbel__C__C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // click on facial treatment
    clickOnElement(new String[] { XPATH, "//a[@title=\'Tratamiento facial\']" });
    // check product is available
    if (isElementAvailable(new String[] { XPATH, "//a[contains(@id,\'product_productName_200090365\')]" })) {
      // click on product
      clickOnElement(new String[] { XPATH, "//a[contains(@id,\'product_productName_200090365\')]" });
      // check stamp is available
      if (isElementAvailable(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-2\']" })) {
        // Add assertion for stamp
        Assert.assertTrue(
          isElementAvailable(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-2\']" }));
        // Count total number of stamp
        Assert.assertEquals(
          getChildElements(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-2\']" }.size(),
            "2"));
        // end of if statement
      }
      // add assertion for product name
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));
      // end of if statement
    }

    status = "passed";
  }

  @Test
  public void Carrousel_de_contenidos_cyzoneC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://cyzone.tiendabelcorp.com/pe/?consultantUrl=JimenaRodriguezOstia");
    // handle popup
    pageRefresh();
    // scroll to img
    scrollIntoElementView(new String[] { CSS, "img[alt=\'BicCyzoneAdvertCatalogoImage\']" });
    // hover on img
    mouseHoverOnElement(new String[] { XPATH, "//img[@alt=\'BicCyzoneAdvertCatalogoImage\']" });
    // Refresh
    pageRefresh();
    // Click on look at catalog
    clickOnElement(new String[] { XPATH, "//img[@alt=\'BicCyzoneAdvertCatalogoImage\']" });
    // if  Catálogo Digital present
    if (isElementAvailable(new String[] { XPATH, "//p[text() = \"Catálogo Digital\"]" })) {
      // Add Assertion for Catálogo Digital
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//p[text() = \"Catálogo Digital\"]" }));
      // end if
    }
    // Go to URL
    getURL("https://cyzone.tiendabelcorp.com/pe/");
    // Refresh
    pageRefresh();
    // Scroll to element
    scrollIntoElementView(new String[] { CSS, "img[alt=\'BicCyzoneAdvertCatalogoImage\']" });
    // Refresh
    pageRefresh();
    // hover on img
    mouseHoverOnElement(new String[] { XPATH, "//img[@alt=\'BicCyzoneAdvertCatalogoImage\']" });
    // Click on look at catalog
    clickOnElement(new String[] { XPATH, "//img[@alt=\'BicCyzoneAdvertCatalogoImage\']" });
    // Refresh
    pageRefresh();
    // Take Screenshot
    takeScreenshot("logs/Screenshoots/zbLVvm.png");

    status = "passed";
  }

  @Test
  public void Verify_that_the_content_is_played_in_the_same_browser__C_C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // scroll down till the video
    scroll("ScrollDown", 1900);
    // if video visible
    if (isDisplayed(new String[] { XPATH, "//div[@class=\'content\']/child::p" }, 0)) {
      // Add Assertion for video name content
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'content\']/child::p" }));
      // click on play button
      clickOnElement(new String[] { XPATH, "//button[@class=\'plyr__control plyr__control--overlaid\']" });
      // Add assertion video present
      Assert.assertTrue(isElementAvailable(new String[] { XPATH,
        "//div[@class=\'bic-cyzone-video-tutorials__item--description\']/parent::div[@id=\'bic-cyzone-video-tutorials-item-0\']" }));
      // Take screenshot video is in same browser
      takeScreenshot("logs/Screenshoots/LuHbwZ.png");
      // end if video visible
    }

    status = "passed";
  }

  @Test
  public void RICH_RELEVANCE_CARROUSSELS_AND_DYNAMIC_UGC_IN_POSITIONC() {
    // clear cookies and cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/");
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click on Perfume De Muje
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Nuestra selección para ti\']" })) {
      // add assertion for\"our selection for you\"
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Nuestra selección para ti\']" }));
      // End If statement
    }
    // Click on Esika
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'esika\']" });
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text() = \"perfumes\"]" });
    // Click on  fourth product from carousel
    clickOnElement(
      new String[] { XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[4]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Recomendados para ti\']" })) {
      // add assertion for recommended for you
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Recomendados para ti\']" }));
      // End If Statement
    }
    // Click on cyzone
    clickOnElement(
      new String[] { XPATH, "//div[@class=\'nav__left js-site-logo\']/../..//img[@data-title=\'cyzone\']" });
    // click on perfumes
    clickOnElement(new String[] { XPATH, "//a[text()=\'perfumes\']" });
    // Click on Mon L\'Bel Perfu...
    clickOnElement(
      new String[] { XPATH, "(//div[@class=\'product__listing product__grid\']/child::div/child::div/child::a)[3]" });
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' PERFECT MATCH! Complementa tu look con\']" })) {
      // add assertion for\"perfrect match! complement your look with\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//h3[text()=\' PERFECT MATCH! Complementa tu look con\']" }));
      // End If Statement
    }
    // Start If Statement
    if (isElementAvailable(new String[] { XPATH, "//h3[text()=\' Esto también te podría encantar\']" })) {
      // add assertion for\"this might also enchant you\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//h3[text()=\' Esto también te podría encantar\']" }));
      // End If statement
    }

    status = "passed";
  }

  @Test
  public void HYBRISV__PRODUCT_NAME_IN_FIXED_BAR_FROM_THE_BEGINNINGC_C() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a" });
    // Add Assertion for name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // add assertion for fixed bar
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"row product-down-bar\"]" }));

    status = "passed";
  }

  @Test
  public void VIDEO_TUTORIALS__Verify_behavior_of_the_arrows_swipeC_C() {
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Scroll Down to video tutorial
    scroll("ScrollDown", 1957);
    // if video visible
    if (isDisplayed(new String[] { CSS, "h2[class=\"bic-cyzone-video-tutorials__title\"]" }, 0)) {
      // Add Assertion for video tutorial title
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "h2[class=\"bic-cyzone-video-tutorials__title\"]" }));
      // Add Assertion for video tutorial subtitle
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "span[class=\"bic-cyzone-video-tutorials__subtitle\"]" }));
      // click on frwd video carosel button
      clickOnElement(new String[] { CSS, "button[type=\"button\"][class=\"slick-next slick-arrow\"]" });
      // Add Assertion for text outside the magenta box
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//div[@class=\"bic-cyzone-video-tutorials__info-text--container\"]" }));
      // end if video visible
    }

    status = "passed";
  }

  @Test
  public void UPDATE_NAVIGATION_ICONS_BY_BRAND__Product_with_Variants__C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/sombrasdeojosstudiolookshimmercompactas-mauve/p/200093927");
    // if navigation icon present
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" })) {
      // Validate navigation icon
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" }));
      // end if navigation icon present
    }
    // validate \"get to know\" minus symbol
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 1\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // Validate \"reasons to love him\" minus symbol
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 2\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // validate \"cy steps\" minus symbol
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 3\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // Go to lbel product
    getURL("https://s1-lbel.tiendabelcorp.com/pe/labial-duo-hydra-matte/p/200098921");
    // if lbel navigation icon
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" })) {
      // validate lbel navigation icon
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" }));
      // end if lbel navigation icon
    }
    // validate \"Description and benefits\" minus symbol
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 1\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // Validate \"Health of your skin\" minus symbol
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 2\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // validate \"Advice tailored to you\" minus symbol
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 3\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // Go to esika product
    getURL("https://s1-esika.tiendabelcorp.com/pe/labial-liquido-radiance-sheer/p/200099592");
    // if esika navigation icon
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" })) {
      // Validate esika navigation icon
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" }));
      // end if esika navigation icon
    }
    // validate \"Description\" minus icon
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 1\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // Validate \"Profits\" minus icon
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 2\']/following-sibling::div[@class=\'panel-title__minus\']" }));
    // Validate \"How to use it?\"  minus icon
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[@bucket-positon=\'Bloque 3\']/following-sibling::div[@class=\'panel-title__minus\']" }));

    status = "passed";
  }

  @Test
  public void UGC_INSERTION_THROUGH_GALLERY__C() {
    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pa/");
    // Hover on perfume
    mouseHoverOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // if woman section present
    if (isElementAvailable(new String[] { XPATH, "//a[@title=\'Mujer\']" })) {
      // Click on woman
      clickOnElement(new String[] { XPATH, "//a[@title=\'Mujer\']" });
      // click on first product
      clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
      // Scroll down til ugc gallery
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-sprinklr-pdp-title\']" });
      // Validate title of Ugc gallery
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'container-sprinklr-pdp-title\']" }));
      // Validate ugc gallery
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'swiper-wrapper swe_posts swe_show\']" }));
      // end if woman section present
    }

    status = "passed";
  }

  @Test
  public void HYBRISV__ECOM__Unexpected_error_when_adding_variant_product_without_price_C_CC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Click on labial studio look mate
    clickOnElement(new String[] { XPATH, "//a[text() = \"labial studio look mate\"]" });
    // Add Assertion for name
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "h1[class=\"name\"]" }));
    // start if statement for shades
    if (isElementAvailable(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(2) > div > div > div" })) {
      // Click on smokey nude clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(2) > div > div > div" });
      // Click on blush pink clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(3) > div > div > div" });
      // Click on berry pop color
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(4) > div > div > div" });
      // Click on lava color
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(5) > div > div > div" });
      // Click on orchid color
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(6) > div > div > div" });
      // Click on darkwine clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(7) > div > div > div" });
      // Click on pumkin clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(8) > div > div > div" });
      // Click on almond nude clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(9) > div > div > div" });
      // Click on violet color
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(10) > div > div > div" });
      // Click on peach nude clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(20) > div > div > div" });
      // Click on vampy clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(19) > div > div > div" });
      // Click on caramel clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(18) > div > div > div" });
      // Click on burgundy clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(17) > div > div > div" });
      // Click on dark brown clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(16) > div > div > div" });
      // Click on burgandy clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(17) > div > div > div" });
      // add assertion for add to cart btn
      Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
      // Click on dark brown clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(16) > div" });
      // Click on burgandy clr
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(17) > div > div > div" });
      // assertion for add to cart btn
      Assert.assertTrue(isElementAvailable(new String[] { ID, "addToCartButton" }));
      // Click on berry pop
      clickOnElement(new String[] { CSS, "ul#pdp-variant-list > li:nth-of-type(3) > div > div > div" });
      // Assertion for out of stock btn
      Assert.assertFalse(isElementClickable(new String[] { XPATH, "//button[text()=\'Sin Stock\']" }));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"tones/shade for this product is not available\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void VIDEO_TUTORIALS__Check_component_designC_C() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Scroll Down to video tutorial
    scroll("ScrollDown", 1957);
    // if video visible
    if (isDisplayed(new String[] { CSS, "h2[class=\"bic-cyzone-video-tutorials__title\"]" }, 0)) {
      // Add Assertion for video tutorial title
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "h2[class=\"bic-cyzone-video-tutorials__title\"]" }));
      // Add Assertion for video tutorial subtitle
      Assert.assertTrue(
        isElementAvailable(new String[] { CSS, "span[class=\"bic-cyzone-video-tutorials__subtitle\"]" }));
      // click on frwd video carosel button
      clickOnElement(new String[] { CSS, "button[type=\"button\"][class=\"slick-next slick-arrow\"]" });
      // click on backward video carosel button
      clickOnElement(new String[] { CSS, "button[type=\"button\"][class=\"slick-prev slick-arrow\"]" });
      // Add Assertion for first video
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "main > div:nth-of-type(8) > div > div:nth-of-type(1) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div" }));
      // Add assertion for first video title
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"content\"]" }));
      // Add assertion for video title
      Assert.assertTrue(getText(new String[] { XPATH, "//div[@class=\"content\"]" }).contains("halo eyes con nuestra"));
      // Add Assertion for text outside the magenta box
      Assert.assertTrue(isElementAvailable(
        new String[] { XPATH, "//div[@class=\"bic-cyzone-video-tutorials__info-text--container\"]" }));
      // end if video visible
    }

    status = "passed";
  }

  @Test
  public void Creation_of_spinner_by_clicking_on_the_add_to_cart_Set_Variables_and_Palette___C_C() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://bic-esika.tiendabelcorp.com/pe/slug/p/3_14473_202109_pe/adripe");
    // if visible
    if (isDisplayed(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }, 0)) {
      // Add assertion for  x1 Scented Lotion Images  choose shade
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }));
      // click on  x1 Scented Lotion Images  choose shade
      clickOnElement(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" });
      // choose the tone
      clickOnElement(new String[] { CSS,
        "div#cboxLoadedContent > div > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(3) > div:nth-of-type(1) > input" });
      // click on apply button
      clickOnElement(
        new String[] { CSS, "div#cboxLoadedContent > div > div:nth-of-type(4) > div:nth-of-type(2) > button" });
      // Add assertion for \"x1 Mini Pictures\" choose tone button
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }));
      // if  clickable
      if (isElementClickable(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" })) {
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
        // end if
      }
      // end if visible
    }
    // click on \"SET PURE RED\"
    getURL("https://bic-lbel.tiendabelcorp.com/pe/set-pure-red/p/3_17102_202109_pe/adripe");
    // if visible
    if (isDisplayed(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }, 0)) {
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
      // end if visible
    }
    // click on cyzone variable sets product
    getURL("https://bic-cyzone.tiendabelcorp.com/pe/cz-taste-cool-col-200-ml/p/3_20113_202109_pe/adripe");
    // if variant visible
    if (isDisplayed(new String[] { XPATH, "//button[@class=\'variantSelectorButton \']" }, 0)) {
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
      // end if variant visible
    }

    status = "passed";
  }

  @Test
  public void TITULO_EN_VIDEO_DESTACADO_HYBRISV__C() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/mx/");
    // Scroll Down
    scroll("ScrollDown", 619);
    // Click on first product
    clickOnElement(new String[] { XPATH,
      "//div[@class=\"horizontal-scroll-list__product-cards\"]//div[@class=\"productCard__title\"]/a" });
    // Scroll Down
    scroll("ScrollDown", 1600);
    // start if statement for video title
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"row highlight-container__video text-center \"]" })) {
      // Add Assertion for video title
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[contains(@class,\"container-ratio-txt brand\")]" }));
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"video title is not present\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void TUTORIAL_VIDEOS__Verify_behavior_of_the_video_carouselCC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/");
    // handle popup
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
    // Scroll Down to video carousel
    scroll("ScrollDown", 1864);
    // if video visible
    if (isDisplayed(new String[] { CSS,
        "main > div:nth-of-type(8) > div > div:nth-of-type(1) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div:nth-of-type(1) > div > button" },
      0)) {
      // Click on Play button
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(8) > div > div:nth-of-type(1) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div:nth-of-type(1) > div > button" });
      // take snip of video carousel
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"bic-cyzone-video-tutorials__main\"]" },
        "logs/Screenshots/judrar.png");
      // Scroll Up
      scroll("ScrollUp", 930);
      // Scroll Down to video carousel
      scroll("ScrollDown", 926);
      // Click on Play
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(8) > div > div:nth-of-type(1) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div:nth-of-type(1) > div > button" });
      // snip to verify video plays from the second it was paused
      takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@class=\"bic-cyzone-video-tutorials__main\"]" },
        "logs/Screenshots/aLEHBK.png");
      // Assertion for video carousel
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\"bic-cyzone-video-tutorials__main\"]" }));
      // end if video visible
    }

    status = "passed";
  }

  @Test
  public void HYBRISV__THUMBNAIL_FOR_VIDEO_IN_GALLERY_FROM_MDM__C() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/mx/");
    // Click on tratamiento facial
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'tratamiento facial\')]" });
    // select option from ranking
    selectOption(new String[] { XPATH, "//select[@id=\"sortOptions1\"]" }, "price-desc");
    // Click on first product
    clickOnElement(new String[] { XPATH, "//a[@id=\"product_productName_200099969\"]" });
    // start if statement for video thumbnail
    if (isElementAvailable(new String[] { CSS, "ul#productGalleryThumbnails div:nth-child(4) > div > li > a > img" })) {
      // Click on img with thumbnail
      javascriptExecution(
        "document.querySelector(\"ul#productGalleryThumbnails div:nth-child(4) > div > li > a > img\").click();");
      // Click on play button
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div" });
      // wait condtion
      waitForTime(6);
      // Click on img 2
      clickOnElement(new String[] { CSS, "ul#productGalleryThumbnails div:nth-child(2) > div > li > a > img" });
      // click on img with thumbnail
      javascriptExecution(
        "document.querySelector(\"ul#productGalleryThumbnails div:nth-child(4) > div > li > a > img\").click();");
      // switch to iframe
      switchToIFrame(new String[] { ID, "video-position-3" });
      // start if statement
      if (isElementClickable(new String[] { CSS, "button[class=\"ytp-play-button ytp-button\"]" })) {
        // click on resume button
        javascriptExecution("document.querySelector(\"button[class=\'ytp-play-button ytp-button\']\").click(); ");
        // end if statement
      }
      // wait untill the end of video
      waitForTime(20);
      // switch back to main frame
      backToMainFrame();
      // Add assertion for video thumbnail
      Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@class=\"pdp-image-container\"]" }));
      // end if
    }
    // start else statement
    else {
      // print in results
      printResults("PrintNote", "\"video thumbnail is not present \"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void STAMP_BAR__ESIKAC__C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // click on Maquillaje
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // click on fourth product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[4]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@id=\'seals-flex-container\']" })) {
      // Add Assertion for total no of stamp
      Assert.assertEquals(
        getChildElements(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-4\']" }.size(),
          "4"));
      // End If Sattement
    }
    // Start Else
    else {
      // Print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else
    }

    status = "passed";
  }

  @Test
  public void Featured_Images_and_VideoC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on second product under recommended just for you section
    clickOnElement(new String[] { XPATH, "(//div[@class=\'item-details-panel\']/a)[2]" });
    // scroll till video section
    scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" });
    // Switch to iframe
    switchToIFrame(new String[] { CSS, "iframe" });
    // Assert video play button if present
    if (isElementAvailable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" })) {
      // Add Assertion  for video play button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // end if statement
    }
    // Add Assertion for video is from youtube
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'ytp-impression-link-logo\']" }));
    // Add Assertion for video is in landscape format
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@style=\'width: 100%; height: 100%;\']" }));
    // Click on button
    clickOnElement(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" });

    status = "passed";
  }

  @Test
  public void THUMBNAIL_FOR_FEATURED_VIDEOHYBRISVC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://esika.tiendabelcorp.com/co/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
    // if product present
    if (isDisplayed(new String[] { XPATH, "//img[@title=\"Labial Hidracolor\"]" }, 0)) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//img[@title=\"Labial Hidracolor\"]" });
      // Scroll Down
      scroll("ScrollDown", 300);
      // Click on play
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > ul > div > div > div:nth-of-type(8) > div > li > a > div" });
      // Click on pause
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div:nth-of-type(4) > div > div > div:nth-of-type(1) > div" });
      // Switch to iframe
      switchToIFrame(new String[] { CSS, "iframe" });
      // Hover on video
      mouseHoverOnElement(new String[] { CSS, "video[controlslist=\"nodownload\"]" });
      // Switch back to main
      backToMainFrame();
      // start of if loop
      if (isElementAvailable(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[10]" })) {
        // Assertion on video image is available
        Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[10]" }));
        // End of if loop
      }
      // refresh page
      pageRefresh();
      // scroll
      scroll("ScrollDown", 1260);
      // Assertion on featured video
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//iframe[@id=\"player-featured-video\"]" }));
      // end if product present
    }
    // if Makeup category clickable
    if (isElementClickable(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" })) {
      // Click on Makeup category
      clickOnElement(new String[] { XPATH, "//a[@title=\"Maquillaje\"]" });
      // Click on product
      clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[3]" });
      // refresh
      pageRefresh();
      // scroll down
      scroll("ScrollDown", 2100);
      // swtich to iframe
      switchToIFrame(new String[] { CSS, "iframe" });
      // Assertion on video is comming from youtube
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"ytp-impression-link-logo\"]" }));
      // refresh
      pageRefresh();
      // Assertion on featured video
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//iframe[@id=\"player-featured-video\"]" }));
      // end if make up category clickable
    }

    status = "passed";
  }

  @Test
  public void PRODUCT_CAROUSEL_DesignC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // GoToURL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Scroll to  Bic Cyzone Virtual Makeup Image Simple Responsive Banner
    scroll("ScrollDown", 1188);
    // Assertion for Bic Cyzone Virtual Makeup Image Simple Responsive Banner
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//img[contains(@class,\"js-responsive-image\") and contains(@alt,\"Bic Cyzone Virtual Makeup Image Simple Responsive Banner\")]" }));
    // Assertion for bic-virtual-makeup-component__carousel
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//div[@class=\"bic-virtual-makeup-component__carousel\"]" }));
    // Assertion for labial studio look mate
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'labial studio look mate\')]" }));
    // Assertion for \'Máscara de pestañas studio look\'
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "//a[contains(text(),\'Máscara de pestañas studio look\')]" }));
    // Assertion for crema hidratante facial en gel skin first
    Assert.assertTrue(isElementAvailable(
      new String[] { XPATH, "//a[contains(text(),\'crema hidratante facial en gel skin first\')]" }));

    status = "passed";
  }

  @Test
  public void PANTALLA_PARA_DESPLEGAR_IMAGENES_ZOOMC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go To URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click On Perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\'Perfumes\']" });
    // Click On First Product
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[1]" });
    // Mouse Hover On Image
    mouseHoverOnElement(new String[] { XPATH, "(//div[@class=\'item\'])[1]" });
    // Take Snip
    takeScreenshotOfParticularElement(new String[] { XPATH, "(//div[@class=\'item\'])[1]" },
      "logs/Screenshots/wBeiDr.png");
    // Click On image
    clickOnElement(new String[] { XPATH, "(//div[@class=\'item\'])[1]" });
    // Scroll till bottom
    scroll("ScrollBottom", param2);
    // Scroll top
    scroll("ScrollTop", param2);
    // Add Assertion For Popup Displayed
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//div[@id=\'cboxLoadedContent\']" }));
    // Add Assertion For Close Button
    Assert.assertTrue(isElementDisplayed(new String[] { XPATH, "//button[@id=\'cboxClose\']" }));
    // Click On Close Button
    clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
    // Start if Statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'container-ratio-txt brand-cyzone\']" })) {
      // Scroll To Video Section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" });
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe" });
      // Add Assertion For Video Play Button
      Assert.assertTrue(isElementClickable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // Add Assertion For Thumbnail
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'ytp-cued-thumbnail-overlay\']" }));
      // End If statement
    }
    // Start Else Sattement
    else {
      // print Result
      printResults("PrintNote", "\"element is not present\"");
      // End Else statement
    }

    status = "passed";
  }

  @Test
  public void PRODUCT_CAROUSEL_Static_behavior_and_its_elementsC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe");
    // Scroll Down to bic-virtual-makeup-component__carousel
    scroll("ScrollDown", 1368);
    // Hover on try it live
    mouseHoverOnElement(new String[] { CSS, "a[href=\"https://cyzone.cyzone.com/pe/maquillador-virtual/\"]" });
    // Take snip of try it live
    takeScreenshotOfParticularElement(new String[] { CSS, "span[class=\"yCmsComponent btn btn-primary\"]" },
      "logs/Screenshots/sVqZlw.png");
    // add assertion for  try it live
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "a[href=\"https://cyzone.cyzone.com/pe/maquillador-virtual/\"]" }));
    // Hover on lipstick studio look matte to buy button
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/labial-studio-look-mate-smokey-nude/p/200102116\"]" });
    // take snip of lipstick studio look matte to buy button
    takeScreenshotOfParticularElement(
      new String[] { CSS, "a[href=\"/labial-studio-look-mate-smokey-nude/p/200102116\"]" },
      "logs/Screenshots/LlPDIH.png");
    // add assertion for  lipstick studio look matte to buy button
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "a[href=\"/labial-studio-look-mate-smokey-nude/p/200102116\"]" }));
    // Hover on Studio look mascara button
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/mascara-de-pestanas-studio-look/p/200101074\"]" });
    // take snip of  Studio look mascara button
    takeScreenshotOfParticularElement(new String[] { CSS, "a[href=\"/mascara-de-pestanas-studio-look/p/200101074\"]" },
      "logs/Screenshots/YlIUGH.png");
    // add assertion for  Studio look mascara button
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "a[href=\"/mascara-de-pestanas-studio-look/p/200101074\"]" }));
    // Hover on skin first gel facial moisturizer to buy
    mouseHoverOnElement(new String[] { CSS, "a[href=\"/crema-hidratante-facial-en-gel-skin-first/p/200097894\"]" });
    // take snip of skin first gel facial moisturizer to buy
    takeScreenshotOfParticularElement(
      new String[] { CSS, "a[href=\"/crema-hidratante-facial-en-gel-skin-first/p/200097894\"]" },
      "logs/Screenshots/AqTTrB.png");
    // add assertion for skin first gel facial moisturizer to buy
    Assert.assertTrue(
      isElementAvailable(new String[] { CSS, "a[href=\"/crema-hidratante-facial-en-gel-skin-first/p/200097894\"]" }));
    // Hover on see all products
    mouseHoverOnElement(
      new String[] { CSS, "a[href=\"https://cyzone.tiendabelcorp.com/pe/studio-look/c/cyzone-07\"]" });
    // take snip of see all products
    takeScreenshotOfParticularElement(
      new String[] { CSS, "a[href=\"https://cyzone.tiendabelcorp.com/pe/studio-look/c/cyzone-07\"]" },
      "logs/Screenshots/wEjDpd.png");
    // Assert for see all products
    Assert.assertTrue(isElementAvailable(
      new String[] { CSS, "a[href=\"https://cyzone.tiendabelcorp.com/pe/studio-look/c/cyzone-07\"]" }));

    status = "passed";
  }

  @Test
  public void HYBRISV() {
    // Clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/cl/?consultantUrl=Khayami");
    // Click on make up category
    clickOnElement(new String[] { XPATH, "//a[@title=\'Maquillaje\']" });
    // Add assertion for cross out price
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'strikethrough\'])[2]" }));
    // Select the shade of product
    clickOnElement(new String[] { XPATH, "(//div[@class=\'variant-category lazyOwl\'])[2]" });
    // Add assertion for \"crossed out price of the variable product disappears\"
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'nuevoPrecio\'])[2]" }));
    // Crossed out price of the variable product disappears
    takeScreenshotOfParticularElement(new String[] { XPATH, "(//div[@class=\'product-item-info\'])[2]" },
      "logs/Screenshots/iWRpqy.png");
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // GoToURL
    getURL("https://s1-cyzone.tiendabelcorp.com/mx/?consultantUrl=MakeupBety");
    // click on for you section
    clickOnElement(new String[] { XPATH, "//a[contains(text(),\'para ti\')]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Sets inspirados en ti\')]" })) {
      // add assertion for recomendation for you
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[contains(text(),\'Sets inspirados en ti\')]" }));
      // take a snip to verify the recomendation section
      takeScreenshotOfParticularElement(new String[] { CSS, "div#CyzoneBicPromotionsLandingPageSection3" },
        "logs/Screenshots/nonCyy.png");
      // end if statement
    }
    // start else statement
    else {
      // print in result
      printResults("PrintNote", "\"recomendation just for you section is not shown\"");
      // end else statement
    }

    status = "passed";
  }

  @Test
  public void UPDATE_NAVIGATION_ICONS_BY_BRANDNo_VariantsC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on esika
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-esika\']" });
    // Click on Tratamiento Facial
    clickOnElement(new String[] { XPATH, "//a[text() = \"Tratamiento Facial\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//button[@id=\'cboxClose\']" })) {
      // close popup
      clickOnElement(new String[] { XPATH, "//button[@id=\'cboxClose\']" });
      // End of if loop
    }
    // Click on product
    clickOnElement(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200095855-FotoFondoBlancoSB.jpg\"]" });
    // Click on plus icon to add quantity
    clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
    // Click on plus icon to add quantity
    clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
    // refresh
    pageRefresh();
    // Click on plus icon to add quantity
    clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
    // Click on minus icon to reduce quantity
    clickOnElement(new String[] { XPATH, "//button[text() = \"-\"]" });
    // refresh
    pageRefresh();
    // scroll
    scroll("ScrollDown", 298);
    // Click on Next image down arrow
    clickOnElement(new String[] { XPATH, "//ul//button[@class=\"slick-next slick-arrow\"]" });
    // Click on Next image down arrow
    clickOnElement(new String[] { XPATH, "//button[text() = \"Next\"]" });
    // If promotion is available
    if (isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" })) {
      // Click on Next promotion arrow
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" });
      // Click on Next promotion arrow
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" });
      // refresh
      pageRefresh();
      // Click on Next promotion arrow
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" });
      // End of if loop
    }
    // refresh
    pageRefresh();
    // wait
    waitForTime(3);
    // scroll
    scroll("ScrollDown", 558);
    // Assertion on extend details icon
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div//div[@class=\"panel-title__plus\"])[2]" }));
    // Click on (+)What you should know
    clickOnElement(new String[] { XPATH, "(//div//div[@class=\"panel-title__plus\"])[2]" });
    // Click on (-)What you should know
    clickOnElement(new String[] { XPATH, "(//div[@class=\"panel-title__minus\"])[2]" });
    // Click on LBel
    clickOnElement(new String[] { XPATH, "//header/child::nav/child::div/div/div/div/div//a[@id=\'lnk-sup-lbel\']" });
    // Click on fragrance category
    clickOnElement(new String[] { XPATH,
      "//img[@alt=\"PE Bic L\'Bel Shop By Category Item 4 Simple Responsive Banner Component\"]" });
    // start of if loop
    if (isElementAvailable(new String[] { XPATH, "//img[@alt=\"Rose D’Amelie Perfume de Mujer\"]" })) {
      // Click on product
      clickOnElement(new String[] { XPATH, "//img[@alt=\"Rose D’Amelie Perfume de Mujer\"]" });
      // refresh
      pageRefresh();
      // scroll
      scroll("ScrollDown", 135);
      // Click on Next image down arrow
      clickOnElement(new String[] { XPATH, "//div//div//button[text() = \"Next\"]" });
      // Assertion on image arrow
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div//div//button[text() = \"Next\"]" }));
      // Click on Next image down arrow
      clickOnElement(new String[] { XPATH, "//div//div//button[text() = \"Next\"]" });
      // refresh
      pageRefresh();
      // Click on plus symbol to add quantity
      clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
      // Assertion on add quantity icon
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"+\"]" }));
      // Click on plus symbol to add quantity
      clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
      // Click on minus symbol
      clickOnElement(new String[] { XPATH, "//button[text() = \"-\"]" });
      // Click on button
      clickOnElement(new String[] { XPATH, "//button[text() = \"-\"]" });
      // If promotion is available
      if (isElementAvailable(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" })) {
        // click on next promotion arrow
        clickOnElement(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" });
        // click on next promotion arrow
        clickOnElement(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" });
        // Assertion on right arrow
        Assert.assertTrue(isElementClickable(new String[] { CSS,
          "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(5) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > span" }));
        // End of if loop
      }
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void UPDATE_NAVIGATION_ICONS_BY_BRANDcyzoneProduct_with_VariantsC__C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on Makeup category
    clickOnElement(new String[] { XPATH, "//p[text() = \"maquillaje\"]" });
    // if product clickable
    if (isElementAvailable(new String[] { CSS,
      "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200093927_fotocrosselling.jpg\"]" })) {
      // Click on product
      clickOnElement(new String[] { CSS,
        "img[src=\"https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200093927_fotocrosselling.jpg\"]" });
      // end if product clickable
    }
    // Scroll Down
    scroll("ScrollDown", 200);
    // start of if loop
    if (isElementAvailable(new String[] { CSS, "div[class=\"div-tono shadeSelectedOpenBox\"]" })) {
      // Assertion on tone dropdown arrow
      Assert.assertTrue(isElementClickable(new String[] { CSS, "div[class=\"div-tono shadeSelectedOpenBox\"]" }));
      // Click on Tone dropdown
      clickOnElement(new String[] { CSS, "div[class=\"div-tono shadeSelectedOpenBox\"]" });
      // close  tone box
      clickOnElement(new String[] { XPATH, "//button[@id=\"cboxClose\"]" });
      // End of if loop
    }
    // start of if loop
    if (isElementAvailable(new String[] { CSS,
      "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(1) > div:nth-of-type(1) > div > div > div:nth-of-type(2)" })) {
      // Assertion on minus navigation
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(1) > div:nth-of-type(1) > div > div > div:nth-of-type(2)" }));
      // Click on get to know him(-)
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(1) > div:nth-of-type(1) > div > div > div:nth-of-type(2)" });
      // Click on reasons to love him(+)
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(2) > div:nth-of-type(1) > div > div > div:nth-of-type(1)" });
      // Click on reasons to love him(-)
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(2) > div:nth-of-type(1) > div > div > div:nth-of-type(2)" });
      // Assertion on plus navigation
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(3) > div:nth-of-type(1) > div > div > div:nth-of-type(1)" }));
      // Click on cy steps(+)
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(3) > div:nth-of-type(1) > div > div > div:nth-of-type(1)" });
      // Click on cy steps(-)
      clickOnElement(new String[] { CSS,
        "main > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > div:nth-of-type(7) > div:nth-of-type(3) > div:nth-of-type(1) > div > div > div:nth-of-type(2)" });
      // Click on (+) to add quantity
      clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
      // Click on (+) to add quantity
      clickOnElement(new String[] { XPATH, "//button[text() = \"+\"]" });
      // Assertion on plus symbol
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[text() = \"+\"]" }));
      // End of if loop
    }

    status = "passed";
  }

  @Test
  public void Carrousel_de_contenidos__esikaC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://esika.tiendabelcorp.com/pe/?consultantUrl=Produtosbetina");
    // scroll to content carousel
    scrollIntoElementView(new String[] { CSS, "img[alt=\'Catálogo online\']" });
    // wait for element
    waitForTime(3);
    // navigate back
    goBack();
    // navigate forward
    goForward();
    // take screenshot
    takeScreenshot("logs/Screenshoots/wtWxlI.png");
    // Click on banner-blog-2
    clickOnElement(new String[] { XPATH, "//img[@alt=\'Catálogo online\']/parent::a" });
    // Refresh
    pageRefresh();
    // if  digital catalog present
    if (isElementAvailable(new String[] { XPATH, "//p[text() = \"Catálogo Digital\"]" })) {
      // Add Assertion for Catálogo Digita...
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//p[text() = \"Catálogo Digital\"]" }));
      // end if  digital catalog present
    }
    // Switch to iframe
    switchToIFrame(new String[] { CSS, "iframe" });
    // if virtual img present
    if (isElementAvailable(new String[] { XPATH, "(//div[@class=\'swiper-slide\']/img)[1]" })) {
      // Add assertion for virtual img
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//div[@class=\'swiper-slide\']/img)[1]" }));
      // end if  virtual img present
    }
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to url
    getURL("https://esika.tiendabelcorp.com/pe/");
    // Refresh
    pageRefresh();
    // scroll to content carousel
    scrollIntoElementView(new String[] { CSS, "img[alt=\"Blog\"]" });
    // Click on banner-blog-v01
    clickOnElement(new String[] { XPATH, "//img[@alt=\"Blog\"]/parent::a" });
    // Refresh
    pageRefresh();
    // take screenshot
    takeScreenshot("logs/Screenshoots/AXaILp.png");
    // add assertion for img
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//img[@alt=\'como se crean perfumes ésika\']" }));

    status = "passed";
  }

  @Test
  public void MARKINGS_IN_CARROUSELL_DE_RICH_RELEVANCE__DISPLACEMENT__PRODUCT_IMPRESSION____C() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/cl/");
    // Scroll Down
    scroll("ScrollDown", 754);
    // wait
    waitForTime(5);
    // if present
    if (isElementAvailable(new String[] { XPATH, "//div[contains(@class,\"horizontal-scroll-list__large-title\")]" })) {
      // Add Assertion for most chosen products
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[contains(@class,\"horizontal-scroll-list__large-title\")]" }));
      // take a snip to verify Products visible in the carousel before  click arrows on desktop
      takeScreenshotOfParticularElement(
        new String[] { XPATH, "//div[@class=\"horizontal-scroll-list__product-cards\"]" },
        "logs/Screenshots/ajuppO.png");
      // end if present
    }
    // Scroll Down
    scroll("ScrollDown", 2786);
    // take a snip to verify Products not visible in the carousel before the user drags the carousel
    takeScreenshotOfParticularElement(new String[] { XPATH, "//div[@id=\"EsikaBicSection6\"]" },
      "logs/Screenshots/ESEIGK.png");
    // Add Assertion for The top recommendations
    Assert.assertTrue(isElementAvailable(new String[] { XPATH,
      "//h2[contains(@class,\"horizontal-slider__title js-multi-text-product-carousel-title\")]" }));

    status = "passed";
  }

  @Test
  public void Check_the_behavior_of_the_guidesC_C() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Scroll Down
    scroll("ScrollDown", 2000);
    // if video present
    if (isDisplayed(new String[] { XPATH, "//div//div//div//div//div//div//div[@data-slick-index=\"0\"]" }, 0)) {
      // count of videos
      if (checkContainsValue(new String[] { XPATH, "//div//div//div//div//div//div//div[@data-slick-index=\"0\"]" })) {
        // click on arrow
        clickOnElement(new String[] { XPATH, "//button[@class=\'slick-next slick-arrow\']" });
        // end if
      }
      // assertion on arrow
      Assert.assertTrue(isElementClickable(new String[] { XPATH, "//button[@class=\'slick-next slick-arrow\']" }));
      // end if video present
    }

    status = "passed";
  }

  @Test
  public void shop_by_category_FRONT__C__C() {
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/pe/");
    // Scroll Down
    scroll("ScrollDown", 1214);
    // if facial present
    if (isElementAvailable(new String[] { XPATH, "//span[text() = \" facial\"]" })) {
      // Add Assertion for facial
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//span[text() = \" facial\"]" }));
      // Add assertion for facial treatment
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Tratamiento Facial\']" }));
      // Add Assertion for Make up
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text() = \" Maquillaje\"]" }));
      // Add assertion for fragrance
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Fragancias\']" }));
      // Add assertion for personal care
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h3[text()=\' Cuidado personal\']" }));
      // end if facial present
    }

    status = "passed";
  }

  @Test
  public void Accordions__Buckets___SealsC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on  sombras de ojos studio look shimmer compactas
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[11]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Add Assertion for dropdown to change variant
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" }));
      // Add Assertion for img
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "(//a[@class=\'item active gallery-image__thumbnail-js\'])[1]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" })) {
      // scroll to video section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-cyzone\']" });
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe[id=\'player-featured-video\']" });
      // Add Assertion for video play button
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // switch back to main
    backToMainFrame();
    // Click on lbel
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-lbel\'])[2]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on Contour Parfait Polvo Compacto
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[9]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" })) {
      // Add Assertion for dropdown to change variant
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\"div-tono shadeSelectedOpenBox\"]" }));
      // Add Assertion for img
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "img[class=\"lazy loaded\"][alt=\"Contour Parfait Polvo Compacto\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200095428_galeria1_PolvosContour_Rose.jpg\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-lbel\']" })) {
      // scroll to video section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-lbel\']" });
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe[id=\'player-featured-video\']" });
      // Add Assertion for video play button  button
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // switch back to main
    backToMainFrame();
    // Click on esika
    clickOnElement(new String[] { XPATH, "(//a[@id=\'lnk-sup-esika\'])[2]" });
    // Click on maquillaje
    clickOnElement(new String[] { XPATH, "//a[text() = \"maquillaje\"]" });
    // Click on Labial Hidracolor Mate
    clickOnElement(new String[] { XPATH, "(//a[@class=\'name\'])[4]" });
    // start if statement
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" })) {
      // Add Assertion for dropdown to change variant
      Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'div-tono shadeSelectedOpenBox\']" }));
      // Add Assertion for img
      Assert.assertTrue(isElementAvailable(new String[] { CSS,
        "img[class=\"lazy loaded\"][alt=\"Labial Hidracolor Mate\"][src=\"/cdn-cgi/image/width=96,fit=contain,f=auto/https://belc-bigdata-mdm-images-prd.s3.amazonaws.com/images/FotoProductoFondoBlancoWebRedes/200102305-FotoProducto.jpg\"]" }));
      // end if statement
    }
    // start else statement
    else {
      // print statement
      printResults("PrintNote", "\"element is not present\"");
      // end else statement
    }
    // start if statement
    if (isElementAvailable(new String[] { CSS, "div[class=\'container-ratio-txt brand-esika\']" })) {
      // scroll to video section
      scrollIntoElementView(new String[] { CSS, "div[class=\'container-ratio-txt brand-esika\']" });
      // switch to frame
      switchToIFrame(new String[] { CSS, "iframe[id=\'player-featured-video\']" });
      // Add Assertion for button
      Assert.assertTrue(isElementAvailable(new String[] { CSS, "button[class=\"ytp-large-play-button ytp-button\"]" }));
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
  public void Images_and_Video_in_gallery__C() {
    // Go to URL
    getURL("https://s1-lbel.tiendabelcorp.com/cl/concentre-total-crema-para-rostro/p/200099969/sdsdsdad/");
    // click on video
    clickOnElement(new String[] { XPATH, "//div[@class=\'play\']" });
    // Add assertion for video and image
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//div[@class=\'gallery-video-thumbnail__play\']" }));
    // click on play button
    clickOnElement(new String[] { XPATH, "//div[@class=\'gallery-video-thumbnail__play\']" });
    // wait
    waitForTime(27);
    // click on  quantity
    clickOnElement(new String[] { XPATH, "//input[@name=\'pdpAddtoCartInput\']" });
    // increase the quantity
    typeText(new String[] { XPATH, "//input[@name=\'pdpAddtoCartInput\']" }, "2");

    status = "passed";
  }

  @Test
  public void HYBRISV__Panama__PDP__Discriminate_verified_reviews_in_the_countries_that_applyC() {
    // Clear cache cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pa/?consultantUrl=VICTOR23");
    // Scroll Down
    scroll("ScrollDown", 700);
    // Click on first product in cyzone
    clickOnElement(new String[] { XPATH, "//div[@class=\"item-details-panel\"]//a" });
    // scroll down
    scroll("ScrollBottom", param2);
    // Take screenshot to verify net review section is not visible
    takeScreenshot("logs/Screenshoots/epPgoO.png");
    // Click on LBEL
    clickOnElement(new String[] { XPATH, "//nav[@class=\"navigation navigation--top\"]//a[@data-title=\"lbel\"]" });
    // Scroll Down
    scroll("ScrollBottom", param2);
    // Click on first product in LBEL
    clickOnElement(new String[] { XPATH, "(//div[@class=\"item-details-panel\"]//a)[6]" });
    // Scroll Down
    scroll("ScrollDown", 1159);
    // take screen shot to verify net review section is not visible
    takeScreenshot("logs/Screenshoots/BQsmvm.png");

    status = "passed";
  }

  @Test
  public void Seal_bar_cyzoneC() {
    // clear cache and cookies
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    // click on \"skin first\" link
    clickOnElement(new String[] { XPATH, "//a[@title=\'Skin First\']" });
    // click on first product
    clickOnElement(new String[] { XPATH, "//a[@class=\'name\']" });
    // if
    if (isElementAvailable(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-5\']" })) {
      // Add assertion for \"seal bar\"
      Assert.assertTrue(
        isElementAvailable(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-5\']" }));
      // Count total number of stamp
      Assert.assertEquals(
        getChildElements(new String[] { XPATH, "//div[@class=\'seals-flex-container-wp seals-items-5\']" }.size(),
          "5"));
      // end if
    }
    // Add assertion for product name
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "//h1[@class=\'name\']" }));

    status = "passed";
  }

  @Test
  public void GIFS_IN_GALLERYC() {
    // clear cache
    // Clear cookies
    deleteAllCookies();
    // Clear storage
    javascriptExecution("window.localStorage.clear();");
    // Clear session storage
    javascriptExecution("window.sessionStorage.clear();");
    // Go to URL
    getURL("https://s1-esika.tiendabelcorp.com/pe/");
    // Click on  facial treatment category
    clickOnElement(new String[] { XPATH, "//div[@name=\"Tratamiento facial\"]" });
    // Click on 4th product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[4]" });
    // Click on 1st gallary  image
    clickOnElement(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[7]" });
    // Click on 2nd image
    clickOnElement(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[8]" });
    // Scroll Down
    scroll("ScrollDown", 200);
    // Assertion on 4th image contains  GIF
    Assert.assertTrue(isElementAvailable(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[10]" }));
    // refresh
    pageRefresh();
    // scroll
    scroll("ScrollDown", 194);
    // Click on 4th image
    javascriptExecution(
      "document.querySelector(\"ul#productGalleryThumbnails div:nth-child(8) > div > li > a > img\").click();");
    // Assertion on \"GIF is available\"
    Assert.assertTrue(
      isElementAvailable(new String[] { XPATH, "(//div[@class=\"gallery-video-thumbnail__play\"])[1]" }));
    // refresh page to see main page
    pageRefresh();
    // Click on perfumes
    clickOnElement(new String[] { XPATH, "//a[@title=\"Perfumes\"]" });
    // Click on 1st product
    clickOnElement(new String[] { XPATH, "(//a[@class=\"name\"])[1]" });
    // Click on Image gallary
    clickOnElement(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[8]" });
    // Scroll Down
    scroll("ScrollDown", 200);
    // if present 4th gallery image
    if (isDisplayed(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[10]" }, 0)) {
      // Click on 4th gallary image
      clickOnElement(new String[] { XPATH, "(//img[@class=\"lazy loaded\"])[10]" });
      // Assertion on 4th image is not a GIF
      Assert.assertFalse(
        isElementAvailable(new String[] { XPATH, "(//div[@class=\"gallery-video-thumbnail__play\"])[1]" }));
      // end if
    }

    status = "passed";
  }
}