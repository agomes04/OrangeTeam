package com.smoke.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLogin;

public class SmokeTestNG {
WebDriver driver; 
	
	@BeforeTest
	public void getDriverSetup() throws Throwable {
		driver = BaseLogin.getDriverManager(); 
	}
	@Test
	public void getActualTest() throws Throwable, InterruptedException, IOException {
		driver = BaseLogin.getLogin(driver); 
	}
	@AfterTest
	public void getDriverClose() {
		driver.quit(); 
	}
}
