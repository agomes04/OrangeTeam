package com.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class='login']")
	private WebElement signIn; 
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath="//*[@id='SubmitLogin']")
	private WebElement submitBtn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}


}
