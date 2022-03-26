package com.newjob.qa.utils;

import org.openqa.selenium.WebDriver;

import com.newjob.qa.pages.HomePage;
import com.newjob.qa.pages.RegisterPage;
import com.newjob.qa.pages.SwitchToPage;


/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public static WebDriver driver;
	
	//declare class objects and common objects
	
	public static HomePage homePageObj;
	public static RegisterPage registerObj;
	public static SwitchToPage switchToObj;

}
