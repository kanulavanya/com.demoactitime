package com.demoacti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoacti.base1.DriverScripts;

public class EnterTimeStack extends DriverScripts{
	/**************************page elements*************************/
	@FindBy(xpath ="//a[@class='content tasks']") WebElement taskbutton;
	
	//@FindBy(className ="taskSearchField") WebElement searchfield;
	@FindBy(className ="title ellipsis") WebElement buttonaddnew;
	@FindBy(className ="item createNewCustomer")  WebElement createnew;
	@FindBy(xpath="//a[@id='logoutLink']") WebElement logoutlink;
//	@FindBy(id="username") WebElement textboxusername;
//	@FindBy(name ="pwd") WebElement textboxpassword;
//	@FindBy(xpath ="//div[text() ='Login ']") WebElement loginbutton;
//	
	/**************************page initialization *************************/
	public EnterTimeStack() {
		PageFactory.initElements(driver, this);
	}
	/**************************page actions *************************/
	
//	public String getpagetitle() {
//		return driver.getTitle();
//	}
//	public void enterusername(String Username) {
//		textboxusername.sendKeys(Username);
//	}
//	public void enterpassword(String password) {
//		textboxpassword.sendKeys(password);
//	}
//	public void clicklogin() {
//		loginbutton.click();
//	}
public void testlogoutlink() {
		
		logoutlink.click();
	}
public void testtaskbutton() {
	taskbutton.click();
}
public void testaddnewbutton() {
	buttonaddnew.click();
}

	
		
	


}
