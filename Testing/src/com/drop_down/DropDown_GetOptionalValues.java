package com.drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DropDown_GetOptionalValues 
{
	WebDriver driver;
	
	String applicationUrlAddress="https://www.osmania.ac.in/";
	
	public void applicationLaunch() 
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);

		//maximizing the browser
		driver.manage().window().maximize();
	}
	public void applicationclose()
	{
		driver.quit();
	}
	
	public void GettingoptionalvaluesofselectlanguagesDropDown() 
	{
		//Identifying the Select Language DropDown Property
		
				// id="gtranslate_selector" 
				
				By selectLanguagesDropDownProperty=By.id("gtranslate_selector");
				
				WebElement selectLanguages=driver.findElement(selectLanguagesDropDownProperty);
				

				// <option value="en|fr">French</option>
				// <option value="en|de">German</option>
				// <option value="en|ur">Urdu</option>
				
				By dropDownproperty=By.tagName("option");
				
				List<WebElement>selectOptionalLanguages=selectLanguages.findElements(dropDownproperty);
				
				int languagesCount=selectOptionalLanguages.size();
				
				System.out.println("The number of languages in the select Language drop down is :-"+languagesCount);
				
				for(int index=0;index<languagesCount;index++)
				{
				String languageName=selectOptionalLanguages.get(index).getText();
				System.out.println(index+""+languageName);
				}
			
			
       
	}

	public static void main(String[] args)
    {
       DropDown_GetOptionalValues osmaniaUniversity=new DropDown_GetOptionalValues();
       osmaniaUniversity.applicationLaunch();
       osmaniaUniversity.GettingoptionalvaluesofselectlanguagesDropDown();
       osmaniaUniversity.applicationclose();
    }
}
