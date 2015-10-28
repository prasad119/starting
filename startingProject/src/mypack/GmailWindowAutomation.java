package mypack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailWindowAutomation 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		//launch gmail site
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("Email")).sendKeys("durgaraouppala529");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("Durga8688632343");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		//click compose
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("to")).sendKeys("durgaraojobs@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("hello");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("hello"+Keys.ENTER+"getting money form sir");
		//click attachment link
		driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[4]/div/div[1]/div/div/div")).click();
		Thread.sleep(5000);
		//send keyboard data to file
		StringSelection x=new StringSelection("D:\\NSL B7\\work area\\B7 snag photos\\20140911_114344.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//click send button
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		String s=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div[2]/div[3]/div/div/div[2]")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
