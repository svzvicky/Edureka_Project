package vignesh.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
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
			log.info("Posts menu clicked");
		}else
		{
			log.info("Posts link not found");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =5)
	public void Posts_Addnew() throws InterruptedException {
		Thread.sleep(2000);
		boolean addnew = Admin_Console.Posts_Addnew(driver).isDisplayed();
		if (addnew) {
			Admin_Console.Posts_Addnew(driver).click();
			log.info(addnew + "is clicked");
		}else
		{
			log.info("Add new not found");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =6)
	public void Posts_Addnew_Title() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2000);
		boolean Title = Admin_Console.Posts_Title(driver).isDisplayed();
		if (Title) {
			Thread.sleep(2000);
			String Titledata = Exceldata.getCellData(1, 4);
			WebElement addnew = Admin_Console.Posts_Title(driver);
			log.info("Title Entered" + Titledata);
			Actions actions = new Actions(driver);
			actions.moveToElement(addnew);
			actions.click();
			actions.sendKeys(Titledata);
			actions.build().perform();
		}else
		{
			log.info("Title Not Entered");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =7)
	public void Posts_Addnew_Body() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2000);
		boolean Title = Admin_Console.Posts_body_iframe(driver).isDisplayed();
		if (Title) {
			Thread.sleep(2000);
			log.info("Iframe found");
			WebElement body_iframe = Admin_Console.Posts_body_iframe(driver);
			driver.switchTo().frame(body_iframe);
			log.info("Switched to iframe");
			String Bodydata = Exceldata.getCellData(1, 5);
			Thread.sleep(1000);
			Admin_Console.Posts_body_Content(driver).sendKeys(Bodydata);
			log.info("Body content Entered" + Bodydata);
			driver.switchTo().defaultContent();
		}else
		{
			log.info("Body content not Entered");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =8)
	public void Posts_preview () throws InterruptedException {
		Thread.sleep(2000);
		WebElement Preview = Admin_Console.Posts_Preview(driver);
		if(Preview!= null){
			Thread.sleep(2000);
			Preview.click();
			log.info(Preview);
		}else
		{
			log.info("Element is Absent");
		}
		Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =9)
	public void Preview_Newtab() throws InterruptedException {
		Thread.sleep(2000);
		String ConsoleTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		Utilities.captureScreenShot(driver);
		Thread.sleep(2000);
	    driver.close();
	    driver.switchTo().window(ConsoleTab);
	    newTab.remove(newTab);
	}
	@Test(enabled = true, priority =10)
	public void Addingtags() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2000);
		WebElement tags = Admin_Console.Posts_tags(driver);
		if(tags!= null){
			String tag = Exceldata.getCellData(1, 6);
			tags.sendKeys(tag);
			Utilities.captureScreenShot(driver);
			log.info(tags + tag);
			Admin_Console.Posts_tags_add(driver).click();
			log.info("Add clicked");
		}else
		{
			log.info("Element is Absent");
		}
		Utilities.captureScreenShot(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(400, 0)");
		Posts_preview ();
		Preview_Newtab();
		
	}
	@Test(enabled = true, priority =11)
	public void Selectwidget() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(100, 0)");
		boolean Link_radio = Admin_Console.Posts_Widget_link(driver).isSelected();
	if (Link_radio == false) {
		Admin_Console.Posts_Widget_link(driver).click();
		log.info("Link Radio button selected");
	}else
	{
		log.info("Radio  is already selected");
	}
	Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =11)
	public void Screenoptions() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Screen_optonButton = Admin_Console.Screenoption(driver);
	if (Screen_optonButton != null) {
		Screen_optonButton.click();
		log.info(Screen_optonButton + "- Clicked");
	}else
	{
		log.info("Cannot find element" + Screen_optonButton );
	}
	Utilities.captureScreenShot(driver);
	}
	
}
