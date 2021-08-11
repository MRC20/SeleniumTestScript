package TestPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POM.GIG5ResellerLocatoradiusSearchPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GIG5ResellerLocator {

	WebDriver driver = null;
	ExtentReports extent = null;

	@BeforeSuite
	public void setUp() {

		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);

	}

	@BeforeTest
	public void setUpTest() {

		// WebDriverManager Adds updated webdriver versions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	/*
	 * @Test public void closeRadiusPopUp() {
	 * 
	 * driver.get(
	 * "https://staging-test.oic.global.fujitsu.local/uk/reseller/radius/radius.html"
	 * );
	 * 
	 * GIG5ResellerLocatoradiusSearchPOM GIG5ResellerLocatorPOM = new
	 * GIG5ResellerLocatoradiusSearchPOM(driver);
	 * 
	 * GIG5ResellerLocatorPOM.closeRadiusPoPup(); }
	 */

	@Test
	public void enterCountry() throws IOException {

		driver.get("https://staging-test.oic.global.fujitsu.local/uk/reseller/radius/radius.html");

		// Take screenshot
		TakesScreenshot takescreenshot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file

		File SrcFile = takescreenshot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File("C:\\testimage.png");
		System.out.print("Visible screen's Screenshot is taken");

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);
		
		
		

		extent.createTest("Navigated to reseller page").pass("Pass");
		GIG5ResellerLocatoradiusSearchPOM GIG5ResellerLocatorPOM = new GIG5ResellerLocatoradiusSearchPOM(driver);

		GIG5ResellerLocatorPOM.radiusSearch_enterCountry(driver, "Germany", "500");
		extent.createTest("entered country,radius and clicked on search").pass("Pass");

		/*
		 * extent.createTest("ScreenCapture") .addScreenCaptureFromPath("extent.png")
		 * .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		 * 
		 * extent.createTest("LogLevels") .info("info") .pass("pass") .warning("warn")
		 * .skip("skip") .fail("fail");
		 * 
		 * 
		 * extent.createTest("ParentWithChild") .createNode("Child")
		 * .pass("This test is created as a toggle as part of a child test of 'ParentWithChild'"
		 * );
		 * 
		 * extent.createTest("Tags") .assignCategory("MyTag")
		 * .pass("The test 'Tags' was assigned by the tag <span class='badge badge-primary'>MyTag</span>"
		 * );
		 * 
		 * extent.createTest("Authors") .assignAuthor("TheAuthor")
		 * .pass("This test 'Authors' was assigned by a special kind of author tag.");
		 * 
		 * extent.createTest("Devices") .assignDevice("TheDevice")
		 * .pass("This test 'Devices' was assigned by a special kind of devices tag.");
		 * 
		 * extent.createTest("Exception! <i class='fa fa-frown-o'></i>") .fail(new
		 * RuntimeException("A runtime exception occurred!"));
		 */

	}

	@AfterTest
	public void tearDownTest() {

		driver.close();
		driver.quit();
		extent.flush();
	}

	@AfterSuite
	public void tearDown() {

		extent.flush();
	}

}
