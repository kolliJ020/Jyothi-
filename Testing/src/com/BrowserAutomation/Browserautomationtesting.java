package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browserautomationtesting {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\jyothi\\Testing\\Browser files\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver(); 
		  
		  //Navigating to flipcart page
		  driver.get("https://www.flipkart.com");
		  driver.get("https://www.bing.com/shop");
		  driver.quit();
  
	}

}
