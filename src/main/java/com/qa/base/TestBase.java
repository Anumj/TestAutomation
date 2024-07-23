package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.utility.TestUtils;
import com.qa.utility.WebEventListener;

public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static  WebEventListener eListener;
	
	public TestBase()
	{
		try
	
			{   
			prop = new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
			}
			catch (FileNotFoundException e) 
		
			{
				e.printStackTrace();
			} 
		  catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	   public static void initialization()
	    {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		e_driver =new EventFiringWebDriver(driver);
		//Now create object of event listener handler to register it with event firing webdriver
		eListener = new WebEventListener();
		e_driver.register(eListener);
		driver=e_driver;
		
 
		
		driver.get(prop.getProperty("url"));
}
}