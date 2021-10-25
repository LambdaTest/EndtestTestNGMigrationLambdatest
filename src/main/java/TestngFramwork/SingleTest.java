package TestngFramwork;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SingleTest extends WebDriverHelper {
  @Test
  public void test() {
    try {
      getURL("https://lambdatest.github.io/sample-todo-app/");
      // Click on First Item
      clickOnElement(new String[] {NAME, "li1"});
      // Click on Second Item
      clickOnElement(new String[] {NAME, "li2"});
      // Add new item is list
      cleartext(new String[] {NAME, "sampletodotext"});
      typeText(new String[] {ID, "sampletodotext"}, "Yey, Let's add it to list");
      clickOnElement(new String[] {ID, "addbutton"});

      // Verify Added item
      String item = driver.findElement(By.xpath("/html/body/div/div/div/ul/li[6]/span")).getText();
      AssertJUnit.assertTrue(item.contains("Yey, Let's add it to list"));
      status = "passed";
      ((JavascriptExecutor) driver).executeScript("lambda-status=" + status + "");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } catch (Error e) {
      System.out.println("Assert failed");
    }

  }

}
