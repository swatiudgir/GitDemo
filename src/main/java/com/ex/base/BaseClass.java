package com.ex.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() throws IOException
	{
		//File src=new File("C:\\Users\\iuser\\eclipse-workspace\\BankProject\\src\\main\\java\\com"
			//	+ "\\ex\\config\\config.properties");
		File app=new File("src\\main\\java\\com\\ex\\config\\config.properties");
		// File app = new File(appDir,"config.properties");
	    FileInputStream fis=new FileInputStream(app.getAbsolutePath());
	    prop=new Properties();
	    prop.load(fis);
	
	}
	
	
	
	public static void initialisation()
	{
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("Firefox"))
		{
			
			//System.setProperty("webdriver.gecko.driver",System.getProperty(("user.dir")+"BankProject\\lib\\geckodriver.exe"));
			
			
			 File appDir = new File("lib\\geckodriver.exe");
		     
			System.setProperty("webdriver.gecko.driver",appDir.getAbsolutePath());
			driver=new FirefoxDriver();
		}
		
		else
		{
			 File appDir = new File("lib\\chromedriver.exe");
		  
			System.setProperty("webdriver.chrome.driver",appDir.getAbsolutePath());
			driver=new ChromeDriver();
		}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	
	//WebDriverWait wait=new WebDriverWait(driver,10);
	
	//wait.until(ExpectedConditions.noo)
	
	

	}
}


