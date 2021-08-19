package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class phpTravelsLogin {

	WebDriver driver=null;
	@Test
	public void verifyEmailAndPaswrdExiss ()
	{
		
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://phptravels.org/index.php?rp=/login");
			
		//input[@id='login']
		
		boolean emailDisplayed=driver.findElement(By.xpath("//input[@id='inputEmail']")).isDisplayed();
		boolean passwordDisplayed=driver.findElement(By.xpath("//input[@id='inputPassword']")).isDisplayed();
		
		Assert.assertEquals(emailDisplayed, true);
		Assert.assertEquals(passwordDisplayed, true);
		
		//usernamr:mngr346723
		//password:huruqyz
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@id='login']")).click();*/
		

	}
	@Test
	public void Register() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		
		driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("MTest");
		driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("MTest");
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("chaudharimamata.1104@gmail.com");
		driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("8888888888");
		driver.findElement(By.xpath("//input[@id='inputCompanyName']")).sendKeys("TestAddress1");
		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("Testaddress2");
		driver.findElement(By.xpath("//input[@id='inputAddress2']")).sendKeys("TestAddress3");
		driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='stateinput']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='inputPostcode']")).sendKeys("411033");
		
		Select selCountry=new Select(driver.findElement(By.id("inputCountry")));
		selCountry.selectByValue("IN");
		
		driver.findElement(By.xpath("//input[@id='customfield2']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id='inputNewPassword1']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='inputNewPassword2']")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//body/section[@id='main-body']/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[4]/div[7]/div[1]/select[1]/option[102]")).click();
		driver.findElement(By.xpath("//body/section[@id='main-body']/div[1]/div[1]/div[3]/div[1]/form[1]/p[1]/input[1]")).click();
	}

}
