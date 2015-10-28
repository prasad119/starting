package mypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercurytours {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("durgarao");
		driver.findElement(By.name("lastName")).sendKeys("uppala");
		driver.findElement(By.name("phone")).sendKeys("8688632343");
		driver.findElement(By.name("userName")).sendKeys("durgaraouppala529@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("sr nagar,Hyderabad");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		driver.findElement(By.name("state")).sendKeys("A.P");
		driver.findElement(By.name("postalCode")).sendKeys("500038");
		Select x=new Select(driver.findElement(By.name("country")));
		x.deselectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("durgaraouppala529@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Durga@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Durga@123");
		driver.findElement(By.name("register")).click();	

	}

}
