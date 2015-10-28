package mypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i=0;i<5;i++)
		{
			driver.get("http://www.gmail.com");
			driver.findElement(By.name("Email")).sendKeys("durgaraouppala529@gmail.com");
			driver.findElement(By.id("next")).click();
			driver.findElement(By.name("Passwd")).sendKeys("Durga8688632343");
			driver.findElement(By.id("signIn")).click();
			if(driver.findElement(By.xpath("//a[@class='J-Ke n0']")).isDisplayed())
			{
				System.out.println("class loaded..");
				driver.findElement(By.xpath("//span[@class='gb_Ka gbii']")).click();
				driver.findElement(By.xpath("//a[text()='Sign out']")).click();
				
			}
			
		}	
		driver.close();
	}

}
