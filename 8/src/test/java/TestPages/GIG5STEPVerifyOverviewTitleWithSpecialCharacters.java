package TestPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GIG5STEPVerifyOverviewTitleWithSpecialCharacters {
	
	WebDriver driver = null;
  @BeforeTest
  public void loadPage() {
	  
	  driver.get("https://staging-test.oic.global.fujitsu.local/OIC5dx6zf8s7/gig5step/mobgig5step.html");	  
	  
  }
  
  @Test	
  public void verifyOvTitle()
  {
	  
	  
  }
  
}
