package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationUserDefinitionMethod {
	
WebDriver driver;

String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@Given("User should open Browser in the System")
	public void user_should_open_browser_in_the_system() {
		System.setProperty("webdriver.chrome.driver","./OrangeHRM_Cucumber/chromeBrowser/chromedriver1.exe");
		driver =new ChromeDriver();
	    
	}
	@When("User enters OrangeHRM Application URL Address")
	public void user_enters_orange_hrm_application_url_address() {
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
	    
	}

	@Then("User should be navigated to OrangeHRM Application LogIn WebPage")
	public void user_should_be_navigated_to_orange_hrm_application_log_in_web_page() {
		String userNameTestData="jyothi";
		By userNamePoperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNamePoperty);
		userName.sendKeys(userNameTestData);
		
		String passwordTestData="Kolli@016";
		By passwordpoperty=By.name("txtpassword");
		WebElement password=driver.findElement(passwordpoperty);
		password.sendKeys(passwordTestData);
		
		By loginButtonpoperty=By.className( "button");
		WebElement loginButton=driver.findElement(loginButtonpoperty);
		loginButton.click();
	    
	}

	@Then("User should close the OrangeHRM Application along with the browser")
	public void user_should_close_the_orange_hrm_application_along_with_the_browser() {
		driver.quit();
	    
	}
}
