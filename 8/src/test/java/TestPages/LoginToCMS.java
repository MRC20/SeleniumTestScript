package TestPages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class LoginToCMS {
	
	
	WebDriver driver = null;
  @Test
  public void f() {
	  
	 // driver.get("http://g09\\\\deshmuma:Ultimate@21@cms-test.oic.global.fujitsu.local/");
	//  driver.get("http://cms-test.oic.global.fujitsu.local/");
	 // driver.get("https://g09\\deshmuma:Ultimate%4021@cms-test.oic.global.fujitsu.local");
	//  Actions actions = new Actions(driver);
	  //actions.sendKeys("TEST").build().perform();
	  
	  String s1 = new String("abc");
	  String s2 = new String("abc");
	  System.out.println(s1 == s2); 
	  StringBuffer sb1 = new StringBuffer(s1);
	  System.out.println(s1.equals(sb1)); 
	  String s3 = "abc";
	  s3.intern();
	  System.out.println(s1 ==s3); 
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  //WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();

  }

  @AfterTest
  public void afterTest() {
  }

}
