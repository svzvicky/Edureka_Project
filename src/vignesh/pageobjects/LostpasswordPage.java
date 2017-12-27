package vignesh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LostpasswordPage {
	
	private static WebElement element= null;
	public static WebElement Username(WebDriver driver) {
		 element = driver.findElement(By.id("user_login"));
		 return element;
	}
	public static WebElement getnewpasswordbutton(WebDriver driver) {
		 element = driver.findElement(By.id("wp-submit"));
		 return element;
	}

}
