package TestngFramwork;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SingleTest extends WebDriverHelper {
  @Test
  public void test() {
    try {

      // Launch the app
      driver.get("https://lambdatest.github.io/sample-todo-app/");

      // Click on First Item
      driver.findElement(By.name("li1")).click();

      // Click on Second Item
      driver.findElement(By.name("li2")).click();

      // Add new item is list
      driver.findElement(By.id("sampletodotext")).clear();
      driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
      driver.findElement(By.id("addbutton")).click();

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
