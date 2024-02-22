package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TSRTC_HeaderBlock_LinksCount
{
	
	
	public static void main(String[] args)
	{
		WebDriver driver;
		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
		
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		// identifying the common Property of the Elements
		By tsrtc_HeaderBlocklinksProperty=By.tagName("a");

		// of the Header Block finding all the WebElement
		List<WebElement>tsrtc_HeaderBlocklinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlocklinksProperty);

		// finding the size of the ArrayList
		int tsrtc_HeaderBlocklinksCount=tsrtc_HeaderBlocklinks.size();
		System.out.println(" The Number of links in the Header Block of TSRTC Application HomePage is :- "+tsrtc_HeaderBlocklinksCount);

		driver.quit();
		
		
		
	}

}
