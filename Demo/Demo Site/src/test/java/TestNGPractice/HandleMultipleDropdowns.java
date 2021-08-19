package TestNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Approach1 -Lengthy
		
		//Select noOfEmp=new Select (driver.findElement(By.name("NoOfEmployees")));
		
	//	Select industryDrp=new Select(driver.findElement(By.name("Industry")));
		
		//Select countrDrp=new Select(driver.findElement(By.name("Country")));
		
		//Approach 2
		
		WebElement noOfEmployees=driver.findElement(By.name("NoOfEmployees"));	
		selectOptionsFromDropdown(noOfEmployees,"16 - 20");
		
		WebElement industry=driver.findElement(By.name("Industry"));
		selectOptionsFromDropdown(industry,"Agriculture / Forestry");
		
		WebElement country=driver.findElement(By.name("Country"));
		selectOptionsFromDropdown(country,"Denmark");
		
		

	}
	
	public static void selectOptionsFromDropdown(WebElement ele, String valueToSelect)
	{
		Select sel=new Select(ele);
		List<WebElement> options=sel.getOptions();
		
		for(WebElement selOption:options)
		{
			if(selOption.getText().equals(valueToSelect))
			{
				selOption.click();
				break;
			}
		}
	}
		
		
	
	}


