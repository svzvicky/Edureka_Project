package vignesh.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import vignesh.pageobjects.Login;

public class NewTest {
	WebDriver driver;
	
	@BeforeTest
	public void browser() throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = Exceldata.getCellData(1, 1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	@Test
	public void Username() throws EncryptedDocumentException, InvalidFormatException, IOException {
			//Validating Username Field and send the data
			WebElement Usernamekeyword = Login.Loginid(driver);
			String Usernamedata = Exceldata.getCellData(1, 2);
			Assert.assertEquals(true, Usernamekeyword.isDisplayed());
			Usernamekeyword.sendKeys(Usernamedata);
	}
	
	@Test
	public void password() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//Validating the Password
		Thread.sleep(2000);
		WebElement Passkeyword = Login.pass(driver);
		String Passworddata = Exceldata.getCellData(1, 3);
		Assert.assertEquals(true, Passkeyword.isDisplayed());
		Passkeyword.sendKeys(Passworddata);
	}
	
	@Test
	public void loginbutton() throws InterruptedException {
		//Validating the Login
		Thread.sleep(2000);
		WebElement Loginbutton = Login.LoginButton(driver);
		Assert.assertEquals(true, Loginbutton.isDisplayed());
		Loginbutton.click();
	}
	
	@Test
	public void verifydataentered() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		WebElement Usernamekeyword = Login.Loginid(driver);
		String Enteredusername = Usernamekeyword.getAttribute("Value");
		System.out.println(Enteredusername);
		String Usernamedata = Exceldata.getCellData(1, 2);
		 if (Enteredusername.equals(Usernamedata)){
             System.out.println("Entered username value is" +Enteredusername);
         } else{
             System.out.println("Value is different");
         }
		 Thread.sleep(2000);
	}
	
	@AfterTest
	public void closebrowser() {
		System.out.println("closebrowser");
		driver.close();	
	}
	}
