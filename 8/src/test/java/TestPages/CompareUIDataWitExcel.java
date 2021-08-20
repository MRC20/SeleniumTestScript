package TestPages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.GIG5ResellerLocatoradiusSearchPOM;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelUtils;

public class CompareUIDataWitExcel {

	WebDriver driver = null;
	ExcelUtils getDataFromExcel = new ExcelUtils();
//test1
	@BeforeTest
	public void setUpTest() {

		// WebDriverManager Adds updated webdriver versions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void closeRadiusPopUp() {

		driver.get("https://staging-test.oic.global.fujitsu.local/uk/reseller/radius/radius.html");

		GIG5ResellerLocatoradiusSearchPOM GIG5ResellerLocatorPOM = new GIG5ResellerLocatoradiusSearchPOM(driver);

		GIG5ResellerLocatorPOM.closeRadiusPoPup();
		GIG5ResellerLocatorPOM.closeRadiusPoPup();

	}

	@Test
	public void CompareStateData() throws IOException
	{
		List<Cell> listOfStatesFromExcel=new ArrayList<Cell>();
		
		listOfStatesFromExcel=getDataFromExcel.getStateDataFromExcel();
		
		Select dropdown = new Select(driver.findElement(By.id("state")));

	    //Get all options
	    List<WebElement> listOfStatesFromUI= dropdown.getOptions();
	    
	   
	   if( listOfStatesFromExcel.equals(listOfStatesFromUI))
	   {
		   System.out.println("State data matches with excel data");
	   }
	   else {
		   System.out.println("State data doesnot match with excel data");
		   
	   }
	    
		
	}
}
