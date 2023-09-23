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

import locators.jQueryLocators;
import utilities.BaseTest;
import utilities.SeleniumLib;

public class FirstTest extends BaseTest{


	@Test(priority = 1)
	public void baccordionTest() {

		driver.get("https://jqueryui.com/accordion/");

		driver.switchTo().frame(0);
		// do something

		driver.switchTo().defaultContent();

		driver.findElement(jQueryLocators.autocompleteLink).click();
		
		
	
		
		lib.getElement(jQueryLocators.autocompleteLink).click();
		
		
		

	}

	@Test(priority = 2)
	public void autoCompleteTest() {

		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		// do something
		
		
		
		
		lib.getElement(jQueryLocators.autocompleteLink).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);
		lib.getElement(null).sendKeys(null);


		driver.switchTo().defaultContent();

	}


}
