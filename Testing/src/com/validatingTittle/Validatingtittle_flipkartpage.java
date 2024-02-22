package com.validatingTittle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validatingtittle_flipkartpage
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\jyothi\\Testing\\Browser files\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver(); 
		  
		  //Navigating to flipcart page
		  driver.get("https://www.flipkart.com");
		 // driver.get("https://www.bing.com/shop");
		    String expectedflipkartkartTitle="flipkart";
		    System.out.println("the expecteed flipkart tittle is:-"+expectedflipkartkartTitle);
		    
		// Of the Current WebPage - identifying the Title
		  String Actual_WebpageTittle=driver.getTitle();
		 System.out.println("the Actual WebpageTittleis:-"+Actual_WebpageTittle);
		 if(Actual_WebpageTittle.equals(expectedflipkartkartTitle))
		 {
			 System.out.println("The Tittle of the Flipkart Homepage Matched-PASS");
		 }
		 else
		 {
			 System.out.println("The Tittle of the Flipkart Homepage NOT Matched-FAIL");
		 }
		 driver.close();
		 
		 }
		 }
		 