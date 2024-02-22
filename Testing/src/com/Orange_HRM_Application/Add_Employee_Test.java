package com.Orange_HRM_Application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Utility.Log;

public class Add_Employee_Test extends BaseTest 
{
	String expected_OrangeHRMApplicationLogInPageText;
	By orangeHRMApplicationLogInPageTextProperty;
	WebElement orangeHRMApplicationLogInPage;

	String actual_OrangeHRMApplicationLogInPageText;

	@Test(priority=1,description="Validating OrangeHRM Application LogIn WebPage")
	public void logInPageTest()
	{

	// Validating Title
	String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
	Log.info(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);
Log.info( " The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);
	String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
	Log.info(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);

	if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
	{
	Log.info("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
	}
	else
	{
	Log.info("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
	}

	// validating Url

	// Validating Text - LOGIN Panel

	expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	Log.info(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
	orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

	actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
	Log.info(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	Log.info(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
	}
	else
	{
	Log.info(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
	}


	}

	Row logInTestDataRow;
	Cell userNameTestDataCell;
	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet logInTestDataSheet;

	@Test(priority=2,description="Validating OrangeHRM Application LogIn Functionality")
	public void logInTest() throws IOException, InterruptedException
	{

	logInTestDataFile= new FileInputStream("./ExcelDataFiles/AddEmployee.xlsx/");
	workBook= new XSSFWorkbook(logInTestDataFile);
	logInTestDataSheet= workBook.getSheet("Sheet1");

	logInTestDataRow=logInTestDataSheet.getRow(1);
	userNameTestDataCell=logInTestDataRow.getCell(6);

	String userNameTestData=userNameTestDataCell.getStringCellValue();


	// String userNameTestData="jyothi"; // Test Data
	By userNamePoperty=By.id("txtUsername"); // Property of an element is identified and assigned to a variable
	WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Webpage
	userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement


	Cell passwordTestDataCell=logInTestDataRow.getCell(7);
	//Log.info(passwordTestDataCell);
	String passwordTestData=passwordTestDataCell.getStringCellValue();
	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">


	// String passwordTestData="kolli";
	By passwordProperty=By.name("txtPassword");
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);



	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();



	}
	WebElement welComeAdmin;
	@Test(priority=3,description="Validating OrangeHRM Application HomePage WebPage")
	public void homePageTest() throws IOException
	{

	// Validating Title
	String expected_OrangeHRMAplicationHOMEPageTitle="OrangeHRM";
	Log.info(" The expected title of the OrangeHRm Application HOME Page is :- "+expected_OrangeHRMAplicationHOMEPageTitle);

	String actual_OrangeHRMAplicationHOMEPageTitle=driver.getTitle();
	Log.info(" The actual title of the OrangeHRm Application HOME Page is :- "+actual_OrangeHRMAplicationHOMEPageTitle);

	if(actual_OrangeHRMAplicationHOMEPageTitle.equals(expected_OrangeHRMAplicationHOMEPageTitle))
	{
	Log.info("Successfully Navigated to OrangeHRM Application HOME WebPage - PASS");
	}
	else
	{
	Log.info("Failed to Navigate to OrangeHRM Application HOME WebPage - FAIL");
	}

	// Validating OrangeHRM Appliation Home Page - expected Text - Welcome (should have)

	// Properties of WelCome Admin Element
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	// By welComeAdminProperty=By.id("welcome");
	//By welComeAdminProperty=By.linkText("Welcome Admin");
	// By welComeAdminProperty=By.partialLinkText("Welcome");
	By welComeAdminProperty=By.partialLinkText("Admin");

	welComeAdmin=driver.findElement(welComeAdminProperty);

	String expected_OrangeHRMApplicationHomePageText="Welcome";
	Log.info(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	Log.info(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	Log.info(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");

	//Row newRow=logInTestDataSheet.createRow(1);
	Cell testRowOfCell=logInTestDataRow.createCell(2);
	testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");

	}
	else
	{
	Log.info("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");


	//Row newRow=logInTestDataSheet.createRow(1);
	Cell testRowOfCell=logInTestDataRow.createCell(2);
	testRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
	}

	FileOutputStream testResultFile = new FileOutputStream("./src/com/OrangeHRMApplicationTestResultRiles/OrangeHRMApplicationLogInTestResult.xlsx");
	workBook.write(testResultFile);

	}


	@Test(priority=4,description="Validating OrangeHRM Application Home Page PIM Functionality ")
	public void pimTest()
	{

	// id="menu_pim_viewPimModule"

	By pimProperty=By.id("menu_pim_viewPimModule");
	WebElement pim=driver.findElement(pimProperty);

	Actions pimAction = new Actions(driver);
	pimAction.moveToElement(pim).build().perform();

	}

	@Test(priority=5,description="Validating OrangeHRM Application Home Page PIM - AddEmployee Functionality ")
	public void pimAddEmployeeTest()
	{
	// id="menu_pim_addEmployee"
	By addEmployeeProperty=By.id("menu_pim_addEmployee");
	WebElement pimAddEmployee=driver.findElement(addEmployeeProperty);
	pimAddEmployee.click();


	}



	@Test(priority=6,description="Validating OrangeHRM Application AddEmployee WebPage Test ")
	public void AddEmployeeWebPageTest()
	{
	Log.info("*********** Add Employee WebPage Test Successfull ***********");
	}



	@Test(priority=7,description="Validating OrangeHRM Application AddEmployee Functionality  Test ")
	public void AddEmployeeTest() throws InterruptedException, IOException
	{

	// id="firstName"
	By firstNameProperty=By.id("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys("SriniFirstName111");


	// working with the Keys of the KeyBoard

	Actions keyBoardActions = new Actions(driver);
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// MiddleName
	keyBoardActions.sendKeys("HellloMiddleName111").build().perform();

	// LastName
	keyBoardActions.sendKeys(Keys.TAB).build().perform();
	keyBoardActions.sendKeys("ChellloMiddleName111").build().perform();


	// EmployeeID
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// Photograph
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// Enter Key of KeyBoard
	keyBoardActions.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(10000);

	java.lang.Runtime.getRuntime().exec("./AutoItTestScripts/UploadEmployeePhotograph.exe");

	Thread.sleep(5000);

	// <input type="button" class="" id="btnSave" value="Save">

	By saveButtonProperty=By.id("btnSave");
	WebElement saveButton=driver.findElement(saveButtonProperty);

	saveButton.click();


	}


	// Validing Personal Details Webpage

	@Test(priority=8,description="Validating OrangeHRM Application Personal Details WebPage  Test ")
	public void personalDetailsWebPageTest()
	{
	Log.info(" **** Successfully Navigaed to Persoanl Details WebPage **********");
	}


	@Test(priority=9,description="Validating OrangeHRM Application Personal Details Functionality Test ")
	public void personalDetailsTest()
	{

	// validating FirstName, MiddleName, LastName , EmployeeID  and Photograph
	// id="empPic"

	By personalDetailsPageImageProperty=By.id("empPic");
	WebElement personalDetailsEmployeeImage=driver.findElement(personalDetailsPageImageProperty);

	boolean flag=personalDetailsEmployeeImage.isDisplayed();

	if(flag)
	{
	Log.info(" Employee Photograph existing - PASS ");
	}
	else
	{
	Log.info(" Employee Photograph NOT existing - FAIL" );
	}






	}

	




}