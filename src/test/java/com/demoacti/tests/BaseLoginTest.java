package com.demoacti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demoacti.base1.DriverScripts;
import com.demoacti.pages.EnterTimeStack;
import com.demoacti.pages.LoginPage;
import com.demoacti.pages.TaskListPage;

public class BaseLoginTest extends DriverScripts{
	LoginPage loginpage;
	EnterTimeStack entertimeStack;
	TaskListPage tasklistpage;
	@BeforeMethod
	public void teamup() {
		inapptest();
		  loginpage = new LoginPage();
		  entertimeStack = new EnterTimeStack();
		  tasklistpage =new TaskListPage();
			 
		
		
	}
	@AfterMethod
	public void teardown() {
		quitdriver();
	}

}
