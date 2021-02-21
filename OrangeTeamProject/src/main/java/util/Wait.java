package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void getExplicitWait(WebDriver driver,WebElement element) {
		
		WebDriverWait object = new WebDriverWait(driver, 30);
		object.until(ExpectedConditions.elementToBeClickable(element)); 
		
 }
}
