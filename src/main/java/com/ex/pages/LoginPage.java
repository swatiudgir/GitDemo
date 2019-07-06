package com.ex.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ex.base.BaseClass;

public class LoginPage extends BaseClass{

	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement lgnbtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement logo;

//initialisation

public LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
	
     }
//Actions
public String validateloginpage() {
	return driver.getTitle();
}

public boolean CRMLogo() {
	return logo.isDisplayed();
}

public HomePage login(String un,String pwd) throws IOException
{
	username.sendKeys(un);
	password.sendKeys(pwd);
	lgnbtn.click();
	return new HomePage();
	
	
	
}
}


