package com.ex.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ex.base.BaseClass;
import com.ex.pages.ContactsPage;
import com.ex.pages.HomePage;
import com.ex.pages.LoginPage;
import com.ex.util.TestUtil;

import junit.framework.Assert;

public class HomeTest extends BaseClass{
	LoginPage lgnpge;
	HomePage hmpge;
	ContactsPage cntspge;
	TestUtil tstutil;

	public HomeTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		initialisation();
		lgnpge=new LoginPage();
		cntspge=new ContactsPage();
		hmpge=lgnpge.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void homepagetitletest()
	{
		String title1=hmpge.VerifyHomePageTitle();
		Assert.assertEquals(title1,"CRMPRO :: 2.0","title not matched");
	}
	
	@Test(priority=1)
	public void VerifyContactsLinktest() throws IOException
	{
	    
	    tstutil.SwitchToFrame();
	    cntspge= hmpge.ContactsLink();
	    
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
