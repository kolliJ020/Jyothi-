package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

public class Orange_HRM_LoginTest
{
	public static void main(String[] args)
	{
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		String expected_OrangeHRMApplicationLOGINPageTittle="OrangeHRM";
		Log.info("The expected tittle of the OrangeHRM Application Login Page is :-"+expected_OrangeHRMApplicationLOGINPageTittle);
		
		String actual_OrangeHRMApplicationLOGINPageTittle=driver.getTitle();
		Log.info("The actual tittle of the OrangeHRM Application LOGIN Page is:-"+actual_OrangeHRMApplicationLOGINPageTittle);
		
		if(actual_OrangeHRMApplicationLOGINPageTittle.equals(expected_OrangeHRMApplicationLOGINPageTittle))
		{
			Log.info("Successfully Navigated to OrangeHRM Application LOGIN WebPage-PASS");
		}
		else
		{
			Log.info("Failed to Navigate to OrangeHRM Application LOGIN WebPage");
			
		}
		
		// 1.Identify the Element of the WebPage-done using the Properties
		
		driver.findElement(By.id("txtUsername")).sendKeys("jyothi");
		
		// 2. <input name="txtPassword" autocomplete="off" type="password">
		
		driver.findElement(By.name("txtPassword")).sendKeys("Kolli@016");
		
		// 3. <input type="submit"  class="button"  value="LOGIN">
		
		driver.findElement(By.className("button")).click();
		
		//driver.quit();
		
		
	}

}
