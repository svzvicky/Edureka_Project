package vignesh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenoptions {
	
	private static WebElement element = null;

	public static WebElement Format(WebDriver driver) {
		element = driver.findElement(By.id("formatdiv-hide"));;
		return element;
	}
	public static WebElement Categories(WebDriver driver) {
		element = driver.findElement(By.id("categorydiv-hide"));;
		return element;
	}
	public static WebElement Tags(WebDriver driver) {
		element = driver.findElement(By.id("tagsdiv-post_tag-hide"));;
		return element;
	}
	public static WebElement Featuredimage(WebDriver driver) {
		element = driver.findElement(By.id("postimagediv-hide"));;
		return element;
	}
	public static WebElement Excerpt(WebDriver driver) {
		element = driver.findElement(By.id("postexcerpt-hide"));;
		return element;
	}
	public static WebElement Trackbacks(WebDriver driver) {
		element = driver.findElement(By.id("trackbacksdiv-hide"));;
		return element;
	}
	public static WebElement CustomFields(WebDriver driver) {
		element = driver.findElement(By.id("postcustom-hide"));;
		return element;
	}
	public static WebElement Discussion(WebDriver driver) {
		element = driver.findElement(By.id("commentstatusdiv-hide"));;
		return element;
	}
	public static WebElement Slugs(WebDriver driver) {
		element = driver.findElement(By.id("slugdiv-hide"));;
		return element;
	}
	public static WebElement Author(WebDriver driver) {
		element = driver.findElement(By.id("authordiv-hide"));;
		return element;
	}
	public static WebElement myaccount(WebDriver driver) {
		element = driver.findElement(By.id("wp-admin-bar-my-account"));;
		return element;
	}
	public static WebElement myaccount_logout(WebDriver driver) {
		element = driver.findElement(By.id("wp-admin-bar-logout"));;
		return element;
	}
}
	
