package com.newjob.qa.test;

import com.newjob.qa.utils.CommonUI;
import com.newjob.qa.utils.ObjInitialize;

public class RegisterTest extends ObjInitialize {
	public static void main(String[] args) {

		String url = "http://demo.automationtesting.in/Register.html";

		ObjInitialize obj = new ObjInitialize();
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		registerTestOne();
        CommonUI.quitBrowser();
	}

	public static void registerTestOne() {
		registerObj.enterFirstName("John");
		registerObj.enterLastName("Cena");
		registerObj.enterEmailAddress("Johncena123@gmail.com");
		registerObj.enterPhoneNumber("5404553874");
		registerObj.clickGender();
		registerObj.clickSingUp();
		registerObj.clickRefreshButton();

	}

}
