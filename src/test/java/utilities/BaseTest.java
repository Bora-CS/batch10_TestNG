package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	public SeleniumLib lib;
	public Actions ac;

	@BeforeMethod
	public void startTest() {
		// driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();

		lib = new SeleniumLib(driver);
		System.out.println("This is parent class");

	}

	@AfterMethod
	public void endTest() {
		driver.quit();
	}

}
