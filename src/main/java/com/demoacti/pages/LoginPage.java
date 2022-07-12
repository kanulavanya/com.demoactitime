package com.demoacti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoacti.base1.DriverScripts;
/**************************page elements*************************/
public class LoginPage extends DriverScripts {
	@FindBy(id="username") WebElement textboxusername;
	@FindBy(name ="pwd") WebElement textboxpassword;
	@FindBy(xpath ="//div[text() ='Login ']") WebElement loginbutton;
	@FindBy(id ="keepMeLoggedInSection") WebElement radiobuttonkeepmeloggedin;
	@FindBy(className ="errormsg") WebElement errormessage;
	@FindBy(id ="toPasswordRecoveryPageLink") WebElement forgotpasswordlink;
	@FindBy(xpath = "//div[@class='atLogoImg']")WebElement logoimage;
	/**************************page initialization *************************/
	/**this pagefactory class is used to initialize the page elements during run time*******/
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	/**************************page actions 
	 * @return *************************/
	public String iserrormessagedisplayed() {
		return errormessage.getText();
	}
	public void enterusername(String Username) {
		textboxusername.sendKeys(Username);
	}
	public void enterpassword(String password) {
		textboxpassword.sendKeys(password);
	}
	public void clicklogin() {
		loginbutton.click();
	}
	public void clickkeepmeloggedin() {
		radiobuttonkeepmeloggedin.click();
	}
	public boolean logoimage() {
		return logoimage.isDisplayed();
	}
	public boolean isforgotpasswordlinkdisplayed() {
		return forgotpasswordlink.isDisplayed();
	}
	public String getpagetitle() {
		return driver.getTitle();
	}
	
	}
	
	

