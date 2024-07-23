package com.qa.tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.utility.TestUtils;

/*Author name:Anupama
 * 23/07/2024
 * 
 * */

public class LoginPageTest extends TestBase
{

LoginPage loginpage;
	
	
	public LoginPageTest()
	{
		super();// to call super class constructor 
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage =new LoginPage();
	}
	
//	@Test
//	public void applogin()
//	{
////		loginpage.LoginApplication("standard_user","secret_sauce");
//		loginpage.LoginApplication(prop.getProperty("username"), prop.getProperty("password"));
//	}
	//************************************************//
	//Using arraylist//
	@DataProvider
	public Iterator<Object[]> getTestdata()
	{
		ArrayList<Object[]> testdata = TestUtils.getDataFromExcel();
		return testdata.iterator();
	}
	//******************************************//
//	@DataProvider
//	public Object[][] getLogindata()
//	{
//		Object data[][]= TestUtils.getTestData("login");
//		return data; 
//		
//	}
//	
	//-------------------------------------------------//
	
	@Test(dataProvider="getTestdata")
//	@Test(dataProvider="getLogindata")
	public void Login(String username , String password)
	{
		loginpage.LoginApplication(username,password);
	}
	
	@AfterMethod
	public void appclose()
	{
		driver.close();
	}
}
