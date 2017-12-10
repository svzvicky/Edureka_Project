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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vignesh.excel.Exceldata;
import vignesh.pageobjects.Admin_Console;
import vignesh.pageobjects.LoginPage;
import vignesh.pageobjects.LostpasswordPage;
import vignesh.utils.Utilities;

public class NewTest {
	WebDriver driver;
	Logger log = Logger.getLogger("ScriptLogger");
	
	@BeforeTest
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
             log.info("Value is different");
         }
		 Thread.sleep(2000);
		 Utilities.captureScreenShot(driver);
	} 
	@Test(enabled = false)
	public void Lostpassword_emailaddress() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//String URL = Exceldata.getCellData(1, 1);
		//driver.get(URL);
		LoginPage.Lostpassword(driver).click();
		Thread.sleep(2000);
		Utilities.captureScreenShot(driver);
		WebElement Usernamekeyword = LostpasswordPage.Username(driver);
		if (Usernamekeyword.isDisplayed()) {
			log.info("LostpasswordPage - Email address textbox is present");
		}else
		{
			log.info("LostpasswordPage - Email address textbox is present");
		}
	}
	@Test(enabled = false)
	public void Lostpassword_pswdbutton() throws InterruptedException {
		Boolean pswdbutton = LostpasswordPage.getnewpasswordbutton(driver).isEnabled();
		if (pswdbutton == true) {
			log.info("Lostpassword_pswdbutton -" + pswdbutton + "Is present");
		}else
		{
		log.info("Lostpassword_pswdbutton is not found");
		}

	}
	
	@Test(enabled = false, priority =4)
	public void Posts_Sidebar() throws InterruptedException {
		Thread.sleep(2000);
		boolean side_posts = Admin_Console.Posts_link(driver).isDisplayed();
		if (side_posts) {
			Admin_Console.Posts_link(driver).click();
			log.info("Posts menu clicked");
		}else
		{
			log.info("Posts link not found");
		}
		Utilities.captureScreenShot(driver);
	}
	
	@AfterTest
	public void closebrowser() throws InterruptedException {
		log.info("closebrowser");
		Thread.sleep(5000);
		driver.quit();	
	}
	}
