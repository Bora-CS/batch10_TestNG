package mortgageCalculate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest extends BaseTestForDataDriven {

	@FindBy(id = "homeval")
	WebElement homeValue;

	@FindBy(id = "downpayment")
	WebElement downPayment;

	@FindBy(how = How.XPATH, using = "//input[@value='percent']")
	WebElement percentageRadioButton;

	@FindBy(xpath = "//input[@value='Calculate']")
	WebElement calculatButton;

	@FindBy(tagName = "h3")
	WebElement monthlyPayment;
	
	
	@DataProvider()
	Object[][] sendDataHere() {
		
		return new Object[][]{
			{"600000", "20", "$3,896.89"},
			{"500000", "20", "$3,896.89"},
			{"700000", "20", "$3,896.89"},
			{"800000", "20", "$4,413.11"},
			{"1000000", "20","$5,445.56"},
			{"1000000", "20","40", "$5,445.56"}
		};
		
		
	}
	
	

	@Test(dataProvider = "sendDataHere")
	void firstTest(String homePrice, String percentage, String expectingMonthlyPayment ) {
		PageFactory.initElements(driver, this);

//		String homePrice = "700000";
//		String percentage = "20";
//		String expectingMonthlyPayment = "$3,896.89";

		homeValue.sendKeys(homePrice);
		downPayment.sendKeys(percentage);

		if (!percentageRadioButton.isSelected()) {
			percentageRadioButton.click();
		}

		calculatButton.click();

		Assert.assertTrue(monthlyPayment.getText().equals(expectingMonthlyPayment),
				"The actual payment is: " + monthlyPayment.getText());

	}

}
