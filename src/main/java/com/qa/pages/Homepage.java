package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.qa.base.TestBase;

public class Homepage extends TestBase{
	
	//page factory--object repository
	@FindBy(xpath="(//*[contains(text(),\"Add to cart\")])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class=\"app_logo\"]")
	WebElement logo;
	
	@FindBy(className="product_sort_container")
	WebElement selectcontainer;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepagetitle()
	{
		return driver.getTitle();
	}
	public productpage addTocart()
	{
		addtocart.click();
		 return new productpage();
	}
	
	public void clickfilter() throws InterruptedException
	{
		selectcontainer.click();
		Select objSelect =new Select(selectcontainer);
		objSelect.selectByValue("hilo");
		Thread.sleep(40000);
		
	}
	
	public void clickmenu()
	{
		menu.click();
	}
}
