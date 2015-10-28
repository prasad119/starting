package junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Second {
	WebDriver driver=new FirefoxDriver();
	@Test
	public void run()
	{
		driver.get("http://www.facebook.com");
	}
}
