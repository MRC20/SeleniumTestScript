package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//identify all web element objects and keep it here as a part of POM
public class STEPPageFunctionalities {

	private static WebDriver driver=null;
	private static WebElement element= null;
	static Actions actions=new Actions(driver);

	public static String step_Title(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Title')]"));		
		String titleName =element.getText();		
		actions.moveToElement(element);
		return titleName;

	}
	
	public static String featuresbenefits_Title (WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Features and Benefits Title:')]"));		
		String featuresTitle =element.getText();
		actions.moveToElement(element);
		return featuresTitle;

	}
	
	
}
