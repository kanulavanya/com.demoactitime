package com.demoacti.tests;

import org.testng.annotations.Test;

public class TaskListPageTest extends BaseLoginTest{
	@Test
 public void testloginfunction() throws InterruptedException {
		loginpage.enterusername("admin");
		loginpage.enterpassword("manager");
		loginpage.clicklogin();
		entertimeStack.testtaskbutton();
		tasklistpage.testButtonadd();
		tasklistpage.testCreatenew();
		tasklistpage.testcustomername("test5");
		tasklistpage.testcustdescription("test5");
		
		
		tasklistpage.testcreatebutton();
		tasklistpage.testtoastbutton();
	Thread.sleep(2000);
	String title = tasklistpage.testpagetitle();
	System.out.println(title);
 }
}