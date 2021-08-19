package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//identify all web element objects and keep it here as a part of POM
public class GIG5ResellerLocatoradiusSearchPOM {


	private WebDriver driver=null;
	
	By closeButton= By.xpath("//span[contains(text(),'×')]");
	By txtbox_EnterCountry= By.xpath("//input[@id='txtRadiusSearchText']");
	By txtbox_EnterKmForCountry= By.xpath("//input[@id='txtDistanceSearchText']");
	By btn_SearchResultsForCountry= By.xpath("//body/div[@id='container']/main[@id='main']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
	
	public GIG5ResellerLocatoradiusSearchPOM(WebDriver driver) {
		
		this.driver=driver;
	}

	public void closeRadiusPoPup() {

		driver.findElement(closeButton).click();		

	}
	
	public void  radiusSearch_enterCountry(WebDriver driver, String country,String radius) {

		driver.findElement(txtbox_EnterCountry).sendKeys(country);
		driver.findElement(txtbox_EnterKmForCountry).sendKeys(radius);
		driver.findElement(btn_SearchResultsForCountry).click();
		
	}
	
	
}
