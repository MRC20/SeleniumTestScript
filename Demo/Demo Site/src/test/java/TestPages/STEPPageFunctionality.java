package TestPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import POM.STEPPageFunctionalities;
import POM.TestBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class STEPPageFunctionality {

	WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {

		TestBaseClass.intitialize_ChromeDriver();

	}

	@Test
	public void TestMainFunctions() throws IOException {
		
		driver.get("https://staging-test.oic.global.fujitsu.local/OIC5dx6zf8s7/gig5step/gig5steppage.html");
		
		//Verify STEP Page Title
		String titleName= STEPPageFunctionalities.step_Title(driver);
		Assert.assertEquals(titleName,"Title");
		
	
		//Verify Features and benefits navigation Title
		String featuresTitle= STEPPageFunctionalities.featuresbenefits_Title(driver);
		Assert.assertEquals(featuresTitle,"Features and Benefits Title:");
				
		TestBaseClass.take_Screenshot(driver, "C:\\featuresTitle.png");
				
		
		
	}

	@AfterTest
	public void afterTest() {
	}
}
