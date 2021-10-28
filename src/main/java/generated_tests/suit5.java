package generated_tests;

import testng_framework.WebDriverHelper;
import org.testng.annotations.Test;

public class suit5 extends WebDriverHelper {

 
  @Test
  public void test2() {
    getURL("https://s1-cyzone.tiendabelcorp.com/pe/");
    clickOnElement(new String[] { ID, "js-site-search-input" });
    System.out.println("test1");
    status = "passed"; 
   }
}