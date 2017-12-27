package vignesh.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import vignesh.excel.Exceldata;
import vignesh.pageobjects.LoginPage;
import vignesh.utils.Utilities;

public class NewTest{
	WebDriver driver;
	Logger log = Logger.getLogger("ScriptLogger");
	
	@BeforeClass
	public void browser() throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = Exceldata.getCellData(1, 1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	@Test(enabled = true, priority =1)
	public void Username() throws EncryptedDocumentException, InvalidFormatException, IOException {
			//Validating Username Field and send the data
			WebElement Usernamekeyword = LoginPage.Loginid(driver);
			String Usernamedata = Exceldata.getCellData(1, 2);
			Assert.assertEquals(true, Usernamekeyword.isDisplayed());
			Usernamekeyword.sendKeys(Usernamedata);
			Utilities.captureScreenShot(driver);
	}
	
	@Test(enabled = true, priority =2)
	public void password() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//Validating the Password
		Thread.sleep(2000);
		WebElement Passkeyword = LoginPage.pass(driver);
		String Passworddata = Exceldata.getCellData(1, 3);
		Assert.assertEquals(true, Passkeyword.isDisplayed());
		Passkeyword.sendKeys(Passworddata);
		Utilities.captureScreenShot(driver);
	}
	
	@Test(enabled = true, priority =3)
	public void loginbutton() throws InterruptedException {
		//Validating the Login
		Thread.sleep(2000);
		WebElement Loginbutton = LoginPage.LoginButton(driver);
		Assert.assertEquals(true, Loginbutton.isDisplayed());
		Loginbutton.click();
		log.info("Login Button Clicked");
		Utilities.captureScreenShot(driver);
	}
	@Test (enabled = false)
	public void verifydataentered() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		WebElement Usernamekeyword = LoginPage.Loginid(driver);
		String Enteredusername = Usernamekeyword.getAttribute("Value");
		log.info(Enteredusername);
		String Usernamedata = Exceldata.getCellData(1, 2);
		 if (Enteredusername.equals(Usernamedata)){
             log.info("Entered username value is" +Enteredusername);
         } else{
             log.info("Value is not equal to" +Enteredusername);
         }
		 Thread.sleep(2000);
		 Utilities.captureScreenShot(driver);
	} 
	@AfterClass
	public void closebrowser() throws InterruptedException {
		log.info("closebrowser");
		Thread.sleep(5000);
		driver.quit();	
	}
	}
