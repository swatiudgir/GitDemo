package com.ex.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ex.base.BaseClass;

public class HomePage extends BaseClass{

	public HomePage() throws IOException {
		PageFactory.initElements(driver,this);
		
	}
    @CacheLookup
	@FindBy(xpath="//a[contains(text(),Contacts)]")
	WebElement Contactslink;
	
	@FindBy(xpath="//a[contains(text(),New Contact)]")
	WebElement NewContactLink;
	
	@FindBy(xpath="//a[contains(text(),Deals)]")
	WebElement Dealslink;
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public ContactsPage ContactsLink() throws IOException
	{
		Contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage DealsLink()
	{
		Dealslink.click();
		return new DealsPage();
	}
	
	public void AddNewContact()
	{
		Actions act=new Actions(driver);
		act.moveToElement(Contactslink).build().perform();
		NewContactLink.click();
	}
}
