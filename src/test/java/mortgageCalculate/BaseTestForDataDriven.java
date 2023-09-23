package mortgageCalculate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestForDataDriven {
	WebDriver driver;
	
	
	@BeforeMethod
	public void startTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://www.mortgagecalculator.org/");

		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void endTest() {
		driver.quit();
	}
	
	
	

}
