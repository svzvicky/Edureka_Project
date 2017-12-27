package vignesh.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import vignesh.excel.Exceldata;
import vignesh.pageobjects.LoginPage;
import vignesh.pageobjects.LostpasswordPage;
import vignesh.utils.Utilities;

public class Lostpassword  {
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
	
	@Test(enabled = true, priority =0)
	public void lost_password() {
		WebElement link = LoginPage.Lostpassword(driver);
	if (link != null) {
		Utilities.captureScreenShot(driver);
		link.click();
		log.info("Lost password link clicked");
	}else
	{
		log.info(link + "- Element not Found");
	}
	}

	@Test(enabled = true, priority =1)
	public void Lostpassword_emailaddress() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		//String URL = Exceldata.getCellData(1, 1);
		//driver.get(URL);
		//LoginPage.Lostpassword(driver).click();
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
	@Test(enabled = true, priority =2)
	public void Lostpassword_pswdbutton() throws InterruptedException {
		Boolean pswdbutton = LostpasswordPage.getnewpasswordbutton(driver).isEnabled();
		if (pswdbutton == true) {
			log.info("Lostpassword_pswdbutton -" + pswdbutton + "Is present");
		}else
		{
		log.info("Lostpassword_pswdbutton is not found");
		}
		driver.navigate().back();
		Thread.sleep(3000);
	}
	@AfterClass
	public void closebrowser() throws InterruptedException {
		log.info("closebrowser");
		Thread.sleep(1000);
		driver.quit();	
	}
}

