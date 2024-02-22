package com.geturl;

import org.openqa.selenium.chrome.ChromeDriver;

public class PublicclassGetURL_GoogleHomePage
{
	public static void main(String[] args) 
	{
		//Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\jyothi\\Testing\\Browser files\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver ();
		
		//Navigating to Google Application Home page
		driver.get("https://www.google.com");
		
		//Getting the URL Address of the current web page
		String googleCurrentWebPageUrlAddress =driver.getCurrentUrl();
		System.out.println("The Current URL Address of the Webpage is:-"+googleCurrentWebPageUrlAddress);
		
		driver.close();
		
		
		
		
		
		
	}

}
