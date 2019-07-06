package com.ex.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ex.base.BaseClass;
import com.ex.pages.ContactsPage;
import com.ex.pages.HomePage;
import com.ex.pages.LoginPage;
import com.ex.util.TestUtil;

public class ContactsTest extends BaseClass{
	HomePage hmpge;
	LoginPage lgnpge;
	ContactsPage cntspge;
	TestUtil tstutil;
	


	public ContactsTest() throws IOException {
		super();

	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		
		initialisation();
		lgnpge=new LoginPage();
		cntspge=new ContactsPage();
		hmpge=new HomePage();
		tstutil=new TestUtil();
		hmpge=lgnpge.login(prop.getProperty("username"),prop.getProperty("password"));
		cntspge=hmpge.ContactsLink();

}
	
	@Test
	public void ValidateCreateContact()
	{
		cntspge.CreateNewContact("Ms", "swati","udgir","HCL");
	}
	
}
