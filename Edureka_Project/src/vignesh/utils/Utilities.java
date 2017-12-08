package vignesh.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utilities {
	
	static String path ="C:\\Users\\M1034338\\git\\Edureka_Project\\Screenshots\\";

	public static void captureScreenShot(WebDriver ldriver) {
		
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(src, new File(path + "Test" + System.currentTimeMillis() + ".jpg"));
			System.out.println("Screenshot Taken" + System.currentTimeMillis());
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
