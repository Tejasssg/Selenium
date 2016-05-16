package com.selenium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class NewTest {

	WebDriver driver;
//hi new comment
	//hi this is ranu's comment

	 @Test
	 public void Test1() throws InterruptedException {
	
	 Thread.sleep(5000);
	 driver.findElement(By.id("username")).clear();

	 driver.findElement(By.id("username")).sendKeys("tejas@smartsourcingglobal.com");
	 
	 driver.findElement(By.id("password")).sendKeys("Tejas@1234");
	 driver.findElement(By.id("submitBtn")).click();
	 Thread.sleep(10000);
	// driver.findElement(By.xpath(".//*[@id=':37']/td[4]")).click();
	 //driver.findElement(By.id(":3p")).click();
	// driver.findElement(By.xpath("//*[contains(title(), 'User Activation for Tejas Talathi (action required) (5 k)')]")).click();
	 driver.findElement(By.xpath("//div[starts-with(@title,'User Activation')]")).click();
	 	 Thread.sleep(10000);

	 String text=driver.findElement(By.className(".//*[@id='messageBody']/div/table/tbody/tr/td/p[3]")).getText();
	 System.out.println(text);
	
	 //email
	 int i = text.indexOf('\n');
	 String actual = text.substring(0, i);
	 int k = actual.length();
	 int a=actual.indexOf(':');
	 String email = actual.substring(a+1,k);
	 System.out.println(email);
	
	 //password
	 int b = text.length();
	 int c = text.indexOf('\n');
	 String d = text.substring(c+1,b);
	 int e = d.indexOf('\n');
	 String f = d.substring(0, e);
	 int g= f.length();
	 int h=f.indexOf(":");
	 String password = f.substring(h+1,g);
	 System.out.println(password);
	
	//url
	 int ll = text.length();
	 int mm = text.indexOf('\n');
	 String nn = text.substring(mm+1,ll);
	 int ww=nn.length();
	 int oo = nn.indexOf('\n');
	 String pp = nn.substring(oo+1,ww);
	 int qq=pp.length();
	 int rr=pp.indexOf(":");
	 String url = pp.substring(rr+1,qq);
	 System.out.println(url);


	
	 }
	
	 @BeforeMethod
	 public void beforeTest() {
	 driver = new FirefoxDriver();
	 driver.get("https://sso.godaddy.com/?realm=pass&app=email");
	 }
	
	
	 }
	