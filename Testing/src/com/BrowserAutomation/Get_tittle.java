package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_tittle
 {	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\jyothi\\Testing\\Browser files\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver(); 
		  
		  //Navigating to flipcart page
		  driver.get("https://www.flipkart.com");
		 // driver.get("https://www.bing.com/shop");
		// Of the Current WebPage - identifying the Title
		  String titlename=driver.getTitle();
		 System.out.println("the title of flpkart page is"+titlename);
		  driver.quit();

		
	}

}
