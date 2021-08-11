package POM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//identify all web element objects and keep it here as a part of POM
public class TestBaseClass {

	private static WebDriver driver=null;
	public static void intitialize_ChromeDriver() {
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}

	public static void take_Screenshot(WebDriver driver, String filepath) throws IOException {
		
				// Take screenshot
				TakesScreenshot takescreenshot = ((TakesScreenshot) driver);
				// Call getScreenshotAs method to create image file

				File SrcFile = takescreenshot.getScreenshotAs(OutputType.FILE);

				// Move image file to new destination

				File DestFile = new File(filepath);
				System.out.print("Visible screen's Screenshot is taken");

				// Copy file at destination

				FileUtils.copyFile(SrcFile, DestFile);

	}
	
	
	
}
