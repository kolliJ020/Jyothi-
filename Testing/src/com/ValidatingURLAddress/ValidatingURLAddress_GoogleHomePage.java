package com.ValidatingURLAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURLAddress_GoogleHomePage
{
	public static void main(String[] args)
	{
		//Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\jyothi\\Testing\\Browser files\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 //Navigating to Google Application HomePage
		 driver.get("https://www.google.com");
		 
		// google.com - should have in the URl Address
		 String expected_GoogleHomePageURLAddress="google.com";
		 System.out.println("The Expected URL Address of the Google HomePageis:-"+expected_GoogleHomePageURLAddress);
		 
		 //Getting the URL Address of the Current WebPage
		 String actual_googleCurrentWebPageUrlAddress=driver.getCurrentUrl();
		 System.out.println("The Actual Current URL Address of the WebPage is :-"+actual_googleCurrentWebPageUrlAddress);
		 if(actual_googleCurrentWebPageUrlAddress.contains(expected_GoogleHomePageURLAddress))
		 {
			 System.out.println("Successfully Navigated to Google HomePage_ Url Address found-PASS");
		 }
		 else
		 {
			 System.out.println("Failed to Navigate Google HomePage-Url Address NOT found-FAIL");
		 }
		 driver.quit();
	}
		 
}
