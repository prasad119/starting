package com.testNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Teestng {
  WebDriver driver;
  @BeforeTest
  public void s()
  {
	  driver=new FirefoxDriver();
  }
  @Test
  public void f() 
	{
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	  driver.get("http://www.gmail.com");
	}
  @AfterTest
  public void c()
  {
	  driver.close();
  }
}
