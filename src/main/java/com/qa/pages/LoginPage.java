package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class LoginPage  extends TestBase{
	//page factory--object repository
	
		@FindBy(id="user-name")
		WebElement Username;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(id="login-button")
		WebElement  login;
		
		//Initializing the Page Objects means username and password ,etcetc:
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public Homepage LoginApplication(String username,String password)
		{
			Username.sendKeys(username);
			Password.sendKeys(password);
			login.click();
//			Assert.assertEquals(0, 0);
			return new Homepage();
			
		}
		

}
