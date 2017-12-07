package vignesh.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import vignesh.pageobjects.Login;

public class NewTest {
	WebDriver driver;
	                                                                                                
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/");
		Login.Loginid(driver).sendKeys("username");
  }
}
