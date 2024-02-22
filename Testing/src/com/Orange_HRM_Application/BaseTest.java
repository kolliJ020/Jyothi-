package com.Orange_HRM_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
	WebDriver driver;
	 
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	@BeforeTest
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
	
	driver =new ChromeDriver();
	
	driver.get(ApplicationUrlAddress);
	
	driver.manage().window().maximize();
	}
	
	@AfterTest
	
	public void applicationClose()
	{
		driver.quit();
	}

     
}

