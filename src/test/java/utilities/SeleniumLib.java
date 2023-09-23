package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumLib {

	WebDriver driver;
	WebDriverWait wait;

	public SeleniumLib(WebDriver passedDriver) {

		driver = passedDriver;
//		null  =    some Chrome Driver
		wait = new WebDriverWait(driver, 15);
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public WebElement getElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		highlight(locator);
		return driver.findElement(locator);

	}
	
	public void clickElem(By locator) {
		highlight(locator);
		getElement(locator).click();
	}
	
	public void clickElem(WebElement elem) {
		highlight(elem);
		elem.click();
	}
	

	public void highlight(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 3; i++) {
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(locator),
					"color: yellow; border: 2px solid yellow;");

			customWait(1);

			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(locator), "");
			customWait(1);

		}

	}
	
	public void highlight(WebElement elem) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 3; i++) {
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", elem,
					"color: yellow; border: 2px solid yellow;");

			customWait(1);

			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", elem, "");
			customWait(1);

		}

	}

	public void customWait(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
