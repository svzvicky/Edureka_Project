package vignesh.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import vignesh.excel.Exceldata;
import vignesh.pageobjects.Admin_Console;
import vignesh.utils.Utilities;

public class AdminConsole_Testcases extends NewTest {
	//WebDriver driver;
	
	@Test(enabled = true, priority =4)
	public void Posts_Sidebar() throws InterruptedException {
		Thread.sleep(2000);
		boolean side_posts = Admin_Console.Posts_link(driver).isDisplayed();
		if (side_posts) {
			Admin_Console.Posts_link(driver).click();
			System.out.println("Posts menu clicked");
		}else
		{
			System.out.println("Posts link not found");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =5)
	public void Posts_Addnew() throws InterruptedException {
		Thread.sleep(2000);
		boolean addnew = Admin_Console.Posts_Addnew(driver).isDisplayed();
		if (addnew) {
			Admin_Console.Posts_Addnew(driver).click();
			System.out.println(addnew + "is clicked");
		}else
		{
			System.out.println("Add new not found");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =5)
	public void Posts_Addnew_Title() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2000);
		boolean Title = Admin_Console.Posts_Title(driver).isDisplayed();
		if (Title) {
			Thread.sleep(2000);
			String Titledata = Exceldata.getCellData(1, 4);
			WebElement addnew = Admin_Console.Posts_Title(driver);
			System.out.println("Title Entered" + Titledata);
			Actions actions = new Actions(driver);
			actions.moveToElement(addnew);
			actions.click();
			actions.sendKeys(Titledata);
			actions.build().perform();
		}else
		{
			System.out.println("Title Not Entered");
		}
		Utilities.captureScreenShot(driver);
	}
	
}
