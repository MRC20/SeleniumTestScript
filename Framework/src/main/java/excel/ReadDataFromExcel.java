package excel;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class ReadDataFromExcel {
	
	
	public static void main(String[] args) 
	{
		XLS_Reader reader= new XLS_Reader("C:\\Users\\deshmuma\\eclipse-workspace\\Framework\\src\\main\\java\\excel\\TestInput.xlsx");
		
		int rowCount=reader.getRowCount("STEP Schema");
		
		for( int rowNum=2;rowNum<=rowCount;rowNum++) {
			String stepProductId=reader.getCellData("STEP Schema", "STEP Product Id", rowNum);
			String step=reader.getCellData("STEP Schema", "STEP", rowNum);
			String title=reader.getCellData("STEP Schema", "Title", rowNum);
			String overviewTitle=reader.getCellData("STEP Schema", "Overview Title", rowNum);
			String overviewSummary=reader.getCellData("STEP Schema", "Overview Summary", rowNum);
			String portfolio=reader.getCellData("STEP Schema", "Portfolio", rowNum);
			String noIndex=reader.getCellData("STEP Schema", "NoIndex", rowNum);
			String noFollow=reader.getCellData("STEP Schema", "NoFollow", rowNum);
			String priority=reader.getCellData("STEP Schema", "Priority", rowNum);
			//Integer number = Integer.valueOf(priority);
			
			System.out.println(stepProductId);
			System.out.println(step);
			System.out.println(title);
			System.out.println(overviewTitle);
			System.out.println(overviewSummary);
			System.out.println(portfolio);
			System.out.println(noIndex);
			System.out.println(noFollow);
			System.out.println(priority);
			
			//Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		//int arr[]= {};
		//int [] a= {};
			//Actions act=new Actions(driver);
		//Select s=new Select(element);
		
		}
		
		
		
	}
	
	

}
