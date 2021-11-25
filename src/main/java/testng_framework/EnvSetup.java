package testng_framework;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;

public class EnvSetup {
  public static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
  public static final ThreadLocal<SoftAssert> SOFT_ASSERT = new ThreadLocal<>();
}
