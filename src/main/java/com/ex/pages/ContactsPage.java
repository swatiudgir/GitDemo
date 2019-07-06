package com.ex.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ex.base.BaseClass;

public class ContactsPage extends BaseClass {
	
	@FindBy(name="title")
	WebElement name;
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="surname")
	WebElement SurName;
	
	@FindBy(name="client_lookup")
	WebElement Company;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement Savebtn;

	public ContactsPage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	public void CreateNewContact(String text,String firstname,String surname,String company)
	{
		Select s =new Select(name);
		s.selectByVisibleText(text);
		
		
		FirstName.sendKeys("firstname");
		SurName.sendKeys("surname");
		Company.sendKeys("company");
		Savebtn.click();
		
		
		
	}

}
