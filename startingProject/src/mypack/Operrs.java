package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Operrs {
  @Test
  public void f() {
	  System.setProperty("webdriver.opera.driver", "operadriver.exe");
	  WebDriver driver = new OperaDriver();
	  driver.get("http://www.google.com/");
  }
}
