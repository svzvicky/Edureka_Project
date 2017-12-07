package vignesh.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vignesh.excel.Exceldata;

public class NewTest {
	WebDriver driver;
	Exceldata data = new Exceldata();
	@BeforeTest
	public void browser() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Exceldata.excel();
		String URL = Exceldata.getCellData(1, 1);
		driver.get(URL);
		System.out.println(URL);
	}
	}
