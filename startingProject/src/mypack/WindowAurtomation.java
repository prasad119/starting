package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAurtomation {
	public static void main(String[] args) throws InterruptedException 	
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
	
	}

}
