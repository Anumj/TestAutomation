package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.utility.TestUtils;

public class HomePageTest extends TestBase
{
	LoginPage loginPage;
	Homepage homePage;
	TestUtils testUtil;
	
	HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		testUtil=new TestUtils();
		loginPage=new LoginPage();
		homePage=loginPage.LoginApplication(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyhometitle()
	{
		String title=homePage.verifyHomepagetitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	@Test(priority=2)
	public void CliconkMenuitems()
	{
		homePage.clickmenu();
	}
	@Test(priority=3)
	public void Sortproduct() throws InterruptedException
	{
		homePage.clickfilter();
	}
	
	@Test(priority=4)
	public void addprodcuttobag()
	{
		homePage.addTocart();
	}
	@AfterMethod
	public void appclose()
	{
		driver.close();
	}
	
}
