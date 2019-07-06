package com.ex.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ex.base.BaseClass;
import com.ex.pages.HomePage;
import com.ex.pages.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage lgnpge;
	HomePage hmpge;


	public LoginTest() throws IOException {
		super();
		}
	
	@Test
	public void setup() throws IOException
	{
		initialisation();
		lgnpge=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginpagetitle()
	{
		String title=lgnpge.validateloginpage();
		Assert.assertEquals(title,"Free CRM software in the cloud powers sales and customer service");
                 system.out.pintln("Title Verified");
	}
	
	@Test(priority=2)
	public void ValidateCRMlogo()
	{
	boolean logo=lgnpge.CRMLogo();
	Assert.assertTrue(logo);
		}
	
	@Test(priority=3)
	public void login() throws IOException
	{
		hmpge=lgnpge.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void skiptest()
	{
		throw new SkipException("skip this test");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
