package jQueryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.SeleniumLib;

public class FirstTest {
	WebDriver driver;
	SeleniumLib lib ;

	@Test(priority = 1)
	public void baccordionTest() {

		driver.get("https://jqueryui.com/accordion/");

		driver.switchTo().frame(0);
		// do something

		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Autocomplete")).click();
		
//		-------------
		
	
		
		lib.getElement(By.linkText("Autocomplete")).click();
		
		
		

	}

	@Test(priority = 2)
	public void autoCompleteTest() {

		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		// do something
		
		
		
		
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);


		driver.switchTo().defaultContent();

	}

	@BeforeMethod
	public void startTest() {
		// driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		
		lib = new SeleniumLib(driver);
	}

	@AfterMethod
	public void endTest() {
		driver.quit();
	}

}
