package com.demoacti.base1;


import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * this class is about all the driver related stuff
 * @author lavs
 * created by 7/5/2022
 *
 */
public class DriverScripts {
	public static WebDriver driver;
	Properties pro;
	public DriverScripts() {
		 
		try {
			File file = new File("./acticonfig/config.properties");
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

	public void inapptest() {
		String browser = pro.getProperty("browser");
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./actibrowser/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./actibrowser/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.trim().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./actibrowser/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.err.println("the browser name is not supported. please check the config file");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		geturl();
		
		
		
	}

	public void geturl() {
		String url = pro.getProperty("url");
		driver.get(url);
		
	}
	
	public void quitdriver() {
		driver.close();;
	}
	

}
