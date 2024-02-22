package com.drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OsmaniaUniversity_selectLanguage
{
	public static void main(String[] args)
	{
		WebDriver driver;
		
		String applicationUrlAddress="https://www.osmania.ac.in/";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver1.exe");
		
		driver =new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//Maximize the browser
		driver.manage().window().maximize();
		
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
		
		driver.quit();
		

		
		
		
		
	}

}
