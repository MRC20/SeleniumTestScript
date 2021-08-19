package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//identify all web element objects and keep it here as a part of POM
public class GoogleSearchPageWithElementObjects {


	private WebDriver driver=null;
	
	By textbox_Search= By.name("q");
	By button_Search= By.name("btnk");
	
	public GoogleSearchPageWithElementObjects(WebDriver driver) {
		
		this.driver=driver;
	}

	public void SetTextInSearchBox(String text) {

		driver.findElement(textbox_Search).sendKeys(text);		

	}
	
	public void  ClickOnSearchButton(WebDriver driver) {

		driver.findElement(button_Search).sendKeys(Keys.RETURN);

	}
	
	
}
