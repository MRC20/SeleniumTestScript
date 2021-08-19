package TestNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle=	driver.findElement(By.id("input-country"));
		
		Select drpCountry=new Select(drpCountryEle);
		
		//By using generic methods
		drpCountry.selectByVisibleText("Denmark");
		
		//By using options
		List<WebElement> lts=drpCountry.getOptions();
		
		for(WebElement option:lts)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
			
		}
		

	}

}
