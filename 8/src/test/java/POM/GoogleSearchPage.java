package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//identify all web element objects and keep it here as a part of POM
public class GoogleSearchPage {

	private static WebElement element=null;

	public static WebElement textbox_Search(WebDriver driver) {

		element= driver.findElement(By.name("q"));
		return element;

	}
	
	public static WebElement button_Search(WebDriver driver) {

		element= driver.findElement(By.name("btnk"));
		return element;

	}
	
	
}
