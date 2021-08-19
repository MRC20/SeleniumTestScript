package Guru99Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.Assert;

public class LoginTest {
	
	WebDriver driver=null;
  @Test(priority=1)
  public void validloginTest() {


//Test
	  //Login to page
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.get("https://www.demo.guru99.com/v4/");
	  
	  driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr346723");
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("huruqyv");
	  driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	  
	  //Verify login is successful or not
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Guru99 Bank Manager HomePage";
	  System.out.println(actualTitle);
	  Assert.assertEquals("Test Case Passed: Login Successful",expectedTitle, actualTitle);
	  driver.quit();
	  
	 /* if(actualTitle.contentEquals(expectedTitle))
	  {
		  System.out.println("Test Case Passed");
		 
	  
	  }
	  else
	  {
		  System.out.println("Test Case Failed");
	  
	  }*/
  }
  
  @Test (priority=2)
  public void invalidUsernameLoginTest()
  {
	  
	  //Login to page using invalid emailid
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.get("https://www.demo.guru99.com/v4/");
	  
	  driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("test");
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("huruqyv");
	  driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	//  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	 // WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))).click();
	  
	 // Wait fluent=new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(100)).ignoring(Exception.class);
	  Alert alt=driver.switchTo().alert();
	  
	 
	  String alert=alt.getText();
	  alt.accept();
	 
	  String actualAlertText="User or Password is not valid";
	 // if(alert.contentEquals(actualAlertText))
	//  {
		  Assert.assertEquals("Test case passed: Username is invalid",alert, actualAlertText);
	  //}
		  driver.quit();
  }
  
  @Test (priority=3)
  public void invalidPasswordLoginTest()
  {
	  
	  //Login to page using invalid emailid
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.get("https://www.demo.guru99.com/v4/");
	  
	  driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr346723");
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("test");
	  driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	  
	  Alert alt=driver.switchTo().alert();	  
	 
	  String alert=alt.getText();
	  alt.accept();
	  
	  String actualAlertText="User or Password is not valid";
	 // if(alert.contentEquals(actualAlertText))
	//  {
		  Assert.assertEquals("Test case passed: Password is invalid",alert, actualAlertText);
		  //driver.quit();
	  //}
  }
  @AfterTest
  public void closeBrowser()
  {
	  driver.quit();
  
  }
  
}

