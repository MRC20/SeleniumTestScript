package TestPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import POM.GoogleSearchPageWithElementObjects;

public class GoogleSearchTest2WithElementObject {

	/*
	 * public static void main(String[] args) { GoogleSearchFunction();
	 * 
	 * }
	 */

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {

		// WebDriverManager Adds updated webdriver versions
		WebDriverManager.chromedriver().setup();
		// System.out.println("...hello world");
		// System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void GoogleSearchFunction() {

		driver.get("https://google.com");

		GoogleSearchPageWithElementObjects GoogleSearchPage = new GoogleSearchPageWithElementObjects(driver);

		GoogleSearchPage.SetTextInSearchBox("laptops");
		//GoogleSearchPage.ClickOnSearchButton(driver);
	}

	@AfterTest
	public void tearDownTest() {

	}

}
