package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.BaseLogin;

public class LoginSmokeTest {

static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver = BaseLogin.getDriverManager(); 
		
		driver = BaseLogin.getLogin(driver); 
		
		driver.quit(); 
	}

}
