package POM;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class STEPProduct {
	
	
	public static void main(String[] args)
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
 	    driver.get("https://cms-test.oic.global.fujitsu.local/WebUI/item.aspx?tcm=16#type=tcm:16&org=tcm:153-386679-2&pub=tcm:0-153-1&sub=0");
 		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
 		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(3));
 		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Title']"))));
 		driver.findElement(By.xpath("//input[@id='Title']")).clear();
 	    driver.findElement(By.xpath("//input[@id='Title']")).sendKeys("STEP Test1");
 	   
// 	  Select schema=new Select(driver.findElement(By.xpath("//div[@id='Schema']")));
 //	 schema.selectByVisibleText("STEP Product");
 	    
	}

}
