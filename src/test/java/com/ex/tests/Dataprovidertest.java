package com.ex.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Dataprovidertest {
	
	@Test(dataProvider="getdata")
	public void dataread(String uname,String pwd,int age)
	{
		System.out.println(uname+","+pwd);
	}




@DataProvider
public Object[][] getdata()
{
	Object[][] data=new Object[2][3];
	
	data[0][0]="ghfhgf";
	data[0][1]="hggjhgfjg";
	data[0][2]=12;
	data[1][0]="jhgkg";
	data[1][1]="kjhklh";
	data[1][2]=34;
	return data;
	
	
	
}

}