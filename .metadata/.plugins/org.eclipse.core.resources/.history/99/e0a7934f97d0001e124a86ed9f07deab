package com.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;

	@Before
	public static void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver1.exe");
	driver = new ChromeDriver();

	System.out.println(" *** Chrome Browser launched Successfully *****");
	}

	@After
	public static void tearDown()
	{
	driver.quit();
System.out.println(" **** Browser Closed With Application Successfully ********");
	}


}
