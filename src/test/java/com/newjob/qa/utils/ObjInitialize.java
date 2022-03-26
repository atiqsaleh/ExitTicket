package com.newjob.qa.utils;

import com.newjob.qa.pages.HomePage;
import com.newjob.qa.pages.RegisterPage;
import com.newjob.qa.pages.SwitchToPage;

public class ObjInitialize extends Constants {
	
	 
	
	public static void initializeClassObj() {
		//initialize each page class objects here..
		
		
		homePageObj = new HomePage();
		registerObj = new RegisterPage();
		switchToObj = new SwitchToPage();
	}

}
