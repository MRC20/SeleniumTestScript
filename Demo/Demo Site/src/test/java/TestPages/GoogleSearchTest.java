package TestPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	public static void main(String[] args) {
		GoogleSearchFunction();
		
	}
	
	private static WebDriver driver=null;
	public static void GoogleSearchFunction() {
	   //WebDriverManager Adds updated webdriver versions 
		WebDriverManager.chromedriver().setup();
		//System.out.println("...hello world");
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
 	    driver.get("https://google.com");
 	    GoogleSearchPage.textbox_Search(driver).sendKeys("laptop");
 	    GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
 	    
	}
	

}
