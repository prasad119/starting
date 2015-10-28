package mypack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excelusernamepassword 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("sample.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int nr=sh.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f,wb);
		WritableSheet wsh=wwb.getSheet(0);
		for(int i=1;i<nr;i++)
		{
			String u=sh.getCell(0,i).getContents();
			String uc=sh.getCell(1,i).getContents();
			String p=sh.getCell(2,i).getContents();
			String pc=sh.getCell(3,i).getContents();
			//launch gmail site
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.name("Email")).sendKeys(u);
			driver.findElement(By.id("next")).click();
			Thread.sleep(5000);
			if(uc.equals("valid") && driver.findElement(By.name("Passwd")).isDisplayed())
			{
				String a="Test passed for valid userid";
				Label l=new Label(4,i,a);
				wsh.addCell(l);
				driver.findElement(By.name("Passwd")).sendKeys(p);
				driver.findElement(By.id("signIn")).click();
				Thread.sleep(5000);
				if(pc.equals("valid") && driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).isDisplayed())
				{
					String b="Test passed for valid password";
					Label l1=new Label(4,i,b);
					wsh.addCell(l1);
				}
				else if(pc.equals("invalid") && driver.findElement(By.id("errormsg_0_Passwd")).isDisplayed())
				{
					String c="Test passed for invalid password";
					Label l2=new Label(4,i,c);
					wsh.addCell(l2);
				}
				else
				{
					String d="Test failed";
					Label l3=new Label(4,i,d);
					wsh.addCell(l3);
				}
				
			}
			else if(uc.equals("invalid") && driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
			{
				String e="Test passed for invalid user id";
				Label l4=new Label(4,i,e);
				wsh.addCell(l4);
			}
			else
			{
				String g="Test failed";
				Label l5=new Label(4,i,g);
				wsh.addCell(l5);
			}
		}
		wwb.write();
		wb.close();
		wwb.close();
	}

}
