package vignesh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element= null;
	public static WebElement Loginid(WebDriver driver) {
		 element = driver.findElement(By.id("user_login"));
		 return element;
	}
	public static WebElement pass(WebDriver driver) {
		 element = driver.findElement(By.id("user_pass"));
		 return element;
	}
	
	public static WebElement LoginButton(WebDriver driver) {
		 element = driver.findElement(By.id("wp-submit"));
		 return element;
	}
	public static WebElement Lostpassword(WebDriver driver) {
		 element = driver.findElement(By.linkText("Lost your password?"));
		 return element;
	}
	
}
