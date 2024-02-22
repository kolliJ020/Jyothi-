package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class PublicclassTestingBrowser
{
	public static void main(String[] args)
	{

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./Browser files/chromedriver.exe");

		// Class     object
		ChromeDriver driver = new ChromeDriver();

			// Automating Edge Browser
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\Dec1030AMBatch\\Testing\\browserDriverFiles\\msedgedriver.exe");

		//EdgeDriver edge = new EdgeDriver();

		// Automating FireFox Browser
		//System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");

		// FirefoxDriver firefox = new FirefoxDriver();





		
	}

}
