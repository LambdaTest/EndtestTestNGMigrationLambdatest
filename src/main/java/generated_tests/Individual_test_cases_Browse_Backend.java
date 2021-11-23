package generated_tests;

import org.testng.Assert;
import testng_framework.WebDriverHelper;
import org.testng.annotations.Test;

public class Individual_test_cases_Browse_Backend extends WebDriverHelper {

  @Test
  public void IMAGE_DISPLAY_SCREEN_ZOOM__C() {
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    clickOnElement(new String[] { "CSS", "#js-site-search-input" });

    moveAndClickWithOffset(new String[] { "CSS", "#js-site-search-input" }, 10, 20);
    Assert.assertTrue(isDisplayed(new String[] { CSS, "#id" }));
    moveAndDoubleClickWithOffset(new String[] { CSS, "#id" }, 10, 20);
    if (isElementClickable(new String[] { CSS, "#ids" })) {

    }
    Assert.assertTrue(getText(new String[] { CSS, "#id" }).contains(""));
    switchToNextWindow();
    typeText(new String[] { CSS, "#id" }, "givenText");
    selectOption(new String[] { CSS, "#id" }, "values");
    Assert.assertTrue(isElementAvailable(new String[] { CSS, "#id" }));

    status = "passed";
  }
}