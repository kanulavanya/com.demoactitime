package com.demoacti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demoacti.base1.DriverScripts;
import com.demoacti.pages.LoginPage;
import com.demoacti.pages.TaskListPage;

public class BaseTaskList extends DriverScripts {
	TaskListPage tasklistpage;
	@BeforeMethod
	public void teamup() {
		inapptest();
		  tasklistpage =new TaskListPage();
		 
		
		
	}
	@AfterMethod
	public void teardown() {
		quitdriver();
	}

}
