package vignesh.utils;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utilities {
	static Logger log = Logger.getLogger("ScriptLogger");
	
	static String path ="C:\\Users\\M1034338\\git\\Edureka_Project\\Screenshots\\";

	public static void captureScreenShot(WebDriver ldriver) {
		
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(src, new File(path + "Test" + System.currentTimeMillis() + ".jpg"));
			log.info("Screenshot Taken" + System.currentTimeMillis());
		}
		catch (IOException e)
		{
			log.info(e.getMessage());
		}

	}

}
