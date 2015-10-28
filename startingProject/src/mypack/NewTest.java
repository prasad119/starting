package mypack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  FirefoxProfile fp = new FirefoxProfile();
	  fp.setPreference("general.useragent.override","iPhone");
	  WebDriver driver = new FirefoxDriver(fp);
	  driver.manage().window().setSize(new Dimension(400,800));
//	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.flipkart.com/");
  }
}
