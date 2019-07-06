package com.ex.util;

import java.io.IOException;

import com.ex.base.BaseClass;

public class TestUtil extends BaseClass{

	public TestUtil() throws IOException {
		super();

	}
	
	public void SwitchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}

	

}
