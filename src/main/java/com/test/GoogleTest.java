package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	WebDriver driver;
	
	//1 //4 //7
	
	public void setUp(){
		System.out.println("Inside setup beforemethod");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sibu\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	
	//2
	@Test(priority=1,groups="Title")
	public void googleTitleTest(){
		setUp();
		String title = driver.getTitle();
		System.out.println(title);
		tearDown();
		
	}
	
	//8
	@Test(priority=3,groups="Logo")
	public void googleLogoTest(){
		setUp();
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		tearDown();
	}

	//5
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest(){
		setUp();
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		tearDown();
	}
	
	@Test(priority=4,groups="Test")
	public void test1(){
		setUp();
		System.out.println("test1");
		tearDown();
	}
	
	@Test(priority=5,groups="Test")
	public void test2(){
		setUp();
		System.out.println("test1");
		tearDown();
	}
	
	@Test(priority=6,groups="Test")
	public void test3(){
		setUp();
		System.out.println("test1");
		
		tearDown();
	}
	
	
	//3 //6 //9
	
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
