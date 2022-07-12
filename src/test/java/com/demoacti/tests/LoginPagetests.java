package com.demoacti.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoacti.base1.DriverScripts;
import com.demoacti.pages.LoginPage;

public class LoginPagetests extends BaseLoginTest{
	
	@Test
	public void testpagetitle() {
		 
		 String title = loginpage.getpagetitle();
		 Assert.assertTrue(title.contains("Login"));
	}
	@Test
	public void testLogoimageisDisplayed() {
		
		boolean image = loginpage.logoimage();
		Assert.assertTrue(image);
	}
	@Test
	public void testEnterUsername() {
		
		loginpage.enterusername("admin");
	}
	@Test
	public void testUserName() {
		
		 loginpage.enterpassword("manager");
	}
	@Test
	public void testLoginFunction() throws InterruptedException {
		loginpage.clickkeepmeloggedin();
		 loginpage.clicklogin();
	
		 Thread.sleep(2000);
		
	}
	@Test
	public void testForgotPasswordLink() {
		boolean showing = loginpage.isforgotpasswordlinkdisplayed();
		Assert.assertTrue(showing);
	}
	

}
