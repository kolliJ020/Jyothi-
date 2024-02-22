package com.OHRM;

/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TestCase1
{
	
	public static void main(String[] args) throws IOException {
		Login_TestCase1 obj = new Login_TestCase1();
		obj.setup();
		obj.openUrl();
		obj.workbookCreation();
	///	obj.login();
	
		//obj.tearDown();
	}
	WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
 // XSSFSheet   logInTestDataSheet
	 public void setup() {
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver1.exe");
		 driver=new ChromeDriver();
		System.out.println("Successfully Navigated");
	}
	
	 public void openUrl() {
		 
		driver.get(applicationUrlAddress);
		System.out.println("Successfully urlopen");
	}
	 
	 public void workbookCreation() throws IOException{
		 FileInputStream   logInTestDataFile= new FileInputStream("./ExcelDataFiles/AddEmployee.xlsx");
			XSSFWorkbook workbook= new XSSFWorkbook(logInTestDataFile);
			  // logInTestDataSheet= workbook.getSheet("Sheet2");
          System.out.println("Workbook open Successfully");
	 }  
	public void login(int rowNum,int CellNum)
	 {
	XSSFRow logInTestDataRow=logInTestDataSheet.getRow(0);
	XSSFCell Cell=logInTestDataRow.getCell(1);

		
	}
	
public void setcellvalue(int ) {
	System.out.println();
}


}*/