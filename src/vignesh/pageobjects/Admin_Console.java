package vignesh.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin_Console {

	private static WebElement element = null;

	public static WebElement Posts_link(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='menu-posts']/a/div[3]"));;
		return element;
	}
	public static WebElement Posts_Addnew(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a"));;
		return element;
	}
	public static WebElement Posts_Title(WebDriver driver) {
			element = driver.findElement(By.id("title-prompt-text"));;
			return element;
	}
	public static WebElement Posts_body_iframe(WebDriver driver) {
		element = driver.findElement(By.id("content_ifr"));;
		return element;
}
	public static WebElement Posts_body_Content(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='tinymce']"));;
		return element;
}
	public static WebElement Posts_Preview(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='post-preview']"));;
		return element;
}
	public static WebElement Posts_tags(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='new-tag-post_tag']"));
		return element;
}
	public static WebElement Posts_tags_add(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='post_tag']/div/div[2]/p/input[2]"));
		return element;
}
	public static WebElement Posts_Widget_link(WebDriver driver) {
		element = driver.findElement(By.id("post-format-link"));
		return element;
}
	public static WebElement Screenoption(WebDriver driver) {
		element = driver.findElement(By.id("show-settings-link"));
		return element;
}
}