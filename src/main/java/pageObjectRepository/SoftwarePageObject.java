package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class SoftwarePageObject extends Base {
	
		
	
	public SoftwarePageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Software']")
	private WebElement software;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continueBox;
	
	
	public void clickOnSoftware() {
		WebDriverUtility.clickOnElement(software);
	}
	
	public void clickOnContinueBox() {
		WebDriverUtility.clickOnElement(continueBox);
	}
	
	
	
}
