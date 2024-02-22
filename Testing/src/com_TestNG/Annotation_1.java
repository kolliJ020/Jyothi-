package com_TestNG;

import org.testng.annotations.Test;

public class Annotation_1
{
	@ Test(priority=2) //It Represent to a Test case
	// Any functionality of the Application Under test is automated - that should be always be
//  implemented with @Test Annotation only - because it represents to a Test Case

//If a Java class contains multiple Test Cases - the TestNG Will executed the Test Cases
//    based on the Alphabetical Order of the given Test Case Name

//If a Java class contains multiple Test Cases - the TestNG Will executed the Test Cases
//    based on the Alphabetical Order of the given Test Case Name which starts the UpperCase letter first

	public void LoginTest()// its a User-Defined method - is called as a Test Case Name
	
	{
		System.out.println("Gmail Login Functionality Test Successful");
		
	}
	@Test(priority=1)
	public void applicationLaunch()
	{
		System.out.println("Gmail application Launch Successful");
	}
	@Test(priority=4)
	public void ComposeMailTest()
	{
		System.out.println("Compose Mail Functionality Test Successful");
	}
	@Test(priority=3)
	public void inboxTest()
	{
		System.out.println("Gmail InBox Funtionality Test Successful");
	}
	@Test(enabled=false) // during the Test run - The TestNG will Ignore the current Test Case
    //   TestNG will consider it as a False Test Case during Test Run
    //   The Default Status of the Test Case is "enabled=true"
	
	public void draftsTest()
	{
		System.out.println("Gmail Drafts Functionality Test Successful");
	}
	@Test(priority=5)
	public void sentMail()
	{
		System.out.println("Gmail Sent Mail Functionality Test Successful");
	}
	@Test(priority=6)
	public void close()
	{
		System.out.println("Gmail Application Close Successful");
	}

}
