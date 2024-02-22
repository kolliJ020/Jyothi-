package com.OHRM;

public class LoginTestCase {
	
	/*
	 * Login oraange hrm  one time, take username and password from Excel then logout
	 */
	
	public static void main(String[] args) {
		LoginTestCase obj = new LoginTestCase();
		obj.setup();
		obj.openUrl();
		obj.workbookCreation();
		obj.login();
		obj.tearDown();
	}
	
	public void setup() {
		System.out.println("setup successfully");
	}
	
	public void openUrl() {
		
		System.out.println("open url successfully");
		
	}
	
	public void login() {
		
		String username = getCellValue(1,0);
		//find username elemetnt
		System.out.println(username);
		String password =getCellValue(1,1);
		//find password element   >> sendkeys(password)
		System.out.println(password);
		System.out.println("login success");
		
	}
	
	public void tearDown() {
		System.out.println("close");
		
	}
	
	public void workbookCreation() {
		//fileinpustream
		//xssfworkbook
		System.out.println("workbook created");
		
		
	}
	public void rowcreate() {
		// abstract method is method don't have an implementation
	}
	
	public String getCellValue(int rowNum,int cellNum) {
		//get sheet(1)
		//get row(rowNum)
		//get cell(cellNum)
		//get string cell value
		//return;
		String value = "value from excel";
		return value;
		
	}
	
	/*
	 * method two types
	 *1. with parameters
	 *2. with out parametres 
	 */

}
