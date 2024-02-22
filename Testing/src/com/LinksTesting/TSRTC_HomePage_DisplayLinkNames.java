package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_DisplayLinkNames
{
	public static void main(String[] args)
	{
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
       By linksProperty=By.tagName("a");
		
		List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(linksProperty);
		
		int tsrtcApplicationHomePageLinks_count=tsrtcApplicationHomePageLinks.size();
		
		System.out.println("The number of WebElements which are of the type links on thetsrtcApplicationHomePage is:-"+ tsrtcApplicationHomePageLinks_count);
		
		
		for(int arrayIndex=0;arrayIndex< tsrtcApplicationHomePageLinks_count;arrayIndex++)
			
		{
			String tsrtcHomePage_LinkName=tsrtcApplicationHomePageLinks.get(arrayIndex).getText();
			
			System.out.println(arrayIndex+"-"+tsrtcHomePage_LinkName);
			
		}
		driver.quit();
		
		
		
	}

}
