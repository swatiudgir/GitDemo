package com.ex.base;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		
		
		
		
		File fs=new File("lib\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", fs.getAbsolutePath());
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table");
		
		List<WebElement> ele=driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr"));
		
		
		for(int i=1;i<=ele.size();i++)
		{
			WebElement row=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th"));
			
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td"));
			
			System.out.println(cols.size());
			
			for(int j=1;j<cols.size();j++)
			{
				WebElement ele1=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(ele1.getText());
				
			}
			//*[@id="content"]/table/tbody/tr[1]/td[2]
			//*[@id="content"]/table/tbody/tr[2]/td[1]
			
			//*[@id="content"]/table/tbody/tr[1]/td[1]
			//*[@id="content"]/table/tbody/tr[3]/td[1]
			
			
		}
		
		//*[@id="content"]/table/tbody/tr[1]/th
		//*[@id="content"]/table/tbody/tr[2]/th
		//*[@id="content"]/table/tfoot/tr/th
		
		driver.quit();

	}

}
