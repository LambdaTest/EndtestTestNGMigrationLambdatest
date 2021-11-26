package testng_framework;

import org.openqa.selenium.remote.RemoteWebDriver;

public class EnvSetup {
  public static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
}
