package vignesh.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import vignesh.utils.Utilities;

public class Screenoption extends AdminConsole_Testcases {
  
	@Test(enabled = true, priority =12)
  public void Formatcheck(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(100, 0)");
		Utilities.captureScreenShot(driver);
		boolean Formatcheck = vignesh.pageobjects.Screenoptions.Format(driver).isSelected();
	if (Formatcheck == true) {
		vignesh.pageobjects.Screenoptions.Format(driver).click();
		log.info("Element unchecked");
	}else
	{
		log.info("Element Already unchecked");
	}
	Utilities.captureScreenShot(driver);
	}
	@Test(enabled = true, priority =13)
	  public void Categoriescheck(){
			boolean Categoriescheck = vignesh.pageobjects.Screenoptions.Categories(driver).isSelected();
		if (Categoriescheck == true) {
			vignesh.pageobjects.Screenoptions.Categories(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =14)
	  public void Tagscheck(){
			boolean Tagscheck = vignesh.pageobjects.Screenoptions.Tags(driver).isSelected();
		if (Tagscheck == true) {
			vignesh.pageobjects.Screenoptions.Tags(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =15)
	  public void imagecheck(){
			boolean imagecheck = vignesh.pageobjects.Screenoptions.Featuredimage(driver).isSelected();
		if (imagecheck == true) {
			vignesh.pageobjects.Screenoptions.Featuredimage(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =16)
	  public void Excerptcheck(){
			boolean Excerptcheck = vignesh.pageobjects.Screenoptions.Excerpt(driver).isSelected();
		if (Excerptcheck == true) {
			vignesh.pageobjects.Screenoptions.Excerpt(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =17)
	  public void Trackbackcheck(){
			boolean Trackbackcheck = vignesh.pageobjects.Screenoptions.Trackbacks(driver).isSelected();
		if (Trackbackcheck == true) {
			vignesh.pageobjects.Screenoptions.Trackbacks(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =18)
	  public void Cfieldscheck(){
			boolean Cfieldscheck = vignesh.pageobjects.Screenoptions.CustomFields(driver).isSelected();
		if (Cfieldscheck == true) {
			vignesh.pageobjects.Screenoptions.CustomFields(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =19)
	  public void Discussioncheck(){
			boolean Discussioncheck = vignesh.pageobjects.Screenoptions.Discussion(driver).isSelected();
		if (Discussioncheck == true) {
			vignesh.pageobjects.Screenoptions.CustomFields(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =20)
	  public void Slugcheck(){
			boolean Slugcheck = vignesh.pageobjects.Screenoptions.Slugs(driver).isSelected();
		if (Slugcheck == true) {
			vignesh.pageobjects.Screenoptions.Slugs(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =21)
	  public void Authorcheck(){
			boolean Authorcheck = vignesh.pageobjects.Screenoptions.Author(driver).isSelected();
		if (Authorcheck == true) {
			vignesh.pageobjects.Screenoptions.Author(driver).click();
			log.info("Element unchecked");
		}else
		{
			log.info("Element Already unchecked");
		}
		Utilities.captureScreenShot(driver);
		}
	@Test(enabled = true, priority =22)
	  public void Logout() throws InterruptedException{
		WebElement account = vignesh.pageobjects.Screenoptions.myaccount(driver);
		WebElement logout = vignesh.pageobjects.Screenoptions.myaccount(driver);
		if (account != null) {
			Actions actions = new Actions(driver);
			actions.moveToElement(account).build().perform();
			Utilities.captureScreenShot(driver);
			Thread.sleep(2000);
			actions.moveToElement(logout).build().perform();
			logout.click();
		}else {
			log.info("Element not found");
		}
		
	}
}

