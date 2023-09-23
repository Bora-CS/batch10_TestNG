package jQueryTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.BaseTest;
import utilities.SeleniumLib;

public class HomeWork extends BaseTest{

	@FindBy(how = How.XPATH, using = "//div[@class='widget']//button[text()='A button element']")
	WebElement aButton;
	
	@FindBy(id = "aSubmitButton")
	WebElement aSubmitButton;
	
	@FindBy(className = "class")
	List<WebElement> elems;

	@FindBy(linkText = "Checkboxradio")
	WebElement checkBox;
	
	@FindBy(xpath = "//label[@for='radio-1']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']")
	WebElement radioButton;

	@FindBy(linkText = "Dialog")
	WebElement dialog;
	@FindBy(xpath =  "//span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	WebElement button2;

	
	
	@BeforeMethod
	public void startTest() {
		// driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();

		lib = new SeleniumLib(driver);
		lib.openUrl("https://jqueryui.com");
		System.out.println("This is child class");
		
		PageFactory.initElements(driver, this);
		
	}
	
	

	@Test
	public void ClickButton() {
		lib.clickElem(By.linkText("Button"));
		driver.switchTo().frame(0);
		lib.clickElem(aButton);
		driver.switchTo().defaultContent();
		ac = new Actions(driver);
		ac.moveByOffset(0, 0).build().perform();
	}

	@Test
	public void ClickCheckBoxRadio() {
		lib.clickElem(checkBox);
		driver.switchTo().frame(0);
		lib.clickElem(radioButton);
		driver.switchTo().defaultContent();
	}

	@Test
	public void ClickdDalog() {
		lib.clickElem(dialog);
		driver.switchTo().frame(0);
//		ac.dragAndDropBy(driver.findElement(By.xpath("//div[@role='dialog']")), 45, 80).build().perform();
		lib.clickElem(button2);
		driver.switchTo().defaultContent();
	}



}
