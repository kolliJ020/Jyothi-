package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_LinksCount_HomePage
{
	public static void main(String[] args) 
	{
		String ApplicationUrlAddress =" https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(ApplicationUrlAddress);
		
		By linksProperty=By.tagName("a");
		
		List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(linksProperty);
		
		int tsrtcApplicationHomePageLinks_count=tsrtcApplicationHomePageLinks.size();
		
		System.out.println("The number of WebElements which are of the type links on thetsrtcApplicationHomePage is:-"+ tsrtcApplicationHomePageLinks_count);
		
		driver.quit();
		
		
			
			
			
		
	}

}
