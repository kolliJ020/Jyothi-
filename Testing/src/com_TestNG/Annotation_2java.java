package com_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_2java 
{
	@Test(priority=1)
	public void LoginTest()
	{
		System.out.println("Gmail Login Functionality Test Successful");
	}
	
//@BeforeTest
	@BeforeMethod
public void applicationLaunch()
{
System.out.println("Gmail ApplicationLaunch Successful");
}

@Test(priority=3)
public void composemailTest()
{
	System.out.println(" Compose mail  Functionality Test Successful");
}
@Test(priority=2)
public void inboxtest()
{
	System.out.println("GmailInbox Functionality Test Successful");
}

@Test(enabled=false)
public void draftsTest()
{
	System.out.println("Gmail Drafts Functionality Test Successful");
}

@Test(priority=5)
public void sentmail()
{
	System.out.println("Gmail sentmail Functionality Test Successful");
}

//@AfterTest
@AfterMethod
public void applicationclose()
{
	System.out.println("Gmail Applicatin Close Successful");
}
}
