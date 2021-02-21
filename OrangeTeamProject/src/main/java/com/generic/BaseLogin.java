package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.page.factory.MasterPageFactory;

import util.BaseConfig;


public class BaseLogin {
	
	public static WebDriver getDriverManager() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfigInfo("URL"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		return driver; 
	}

	public static WebDriver getLogin(WebDriver driver) throws Throwable {

		MasterPageFactory obj = new MasterPageFactory(driver);
		
//		Wait.getExplicitWait(driver, obj.getSignIn());
		obj.getSignIn().click();

		obj.getEmail().sendKeys(BaseConfig.getConfigInfo("username"));

		obj.getPass().sendKeys(BaseConfig.getConfigInfo("pass"));

		obj.getSubmitBtn().click();
		
		return driver;
	}

}
