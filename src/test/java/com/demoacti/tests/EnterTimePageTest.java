package com.demoacti.tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoacti.pages.EnterTimeStack;
import com.demoacti.pages.LoginPage;


public class EnterTimePageTest extends BaseLoginTest {
	
	
	
	@Test
	public void testLoginFunction() throws InterruptedException {
		loginpage.enterusername("admin");
		loginpage.enterpassword("manager");
		loginpage.clicklogin();
		entertimeStack.testtaskbutton();
		tasklistpage.testButtonadd();
		tasklistpage.testCreatenew();
		
		tasklistpage.testcustomername("test5");
		tasklistpage.testcustdescription("test5");
		tasklistpage.testcreatebutton();
		tasklistpage.testTaskButton();
	
		
	
	
		 }
	
	

	
	

	
}
