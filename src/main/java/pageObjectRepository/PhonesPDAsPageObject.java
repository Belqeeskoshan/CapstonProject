package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class PhonesPDAsPageObject extends Base{
	public PhonesPDAsPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[contains(text(),'Phones & PDAs')]")
	private WebElement phonesPDAs;
	
	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	private WebElement list;
	
	@FindBy(id="grid-view")
	private WebElement grid;
	
	@FindBy(id="compare-total")
	private WebElement productCompare;
	
	@FindBy(id="input-sort")
	private WebElement sortBy;
	
	@FindBy(id="input-limit")
	private WebElement showbar;
	
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement hTCtouchHDImage;
	
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement iphoneImage;
	
	
	
	public void clickOnPhonesPDAs() {
		WebDriverUtility.clickOnElement(phonesPDAs);
	}
	
	public void clickOnList() {
		WebDriverUtility.clickOnElement(list);
	}
	
	public void clickOnGrid() {
		WebDriverUtility.clickOnElement(grid);
		
	}
	
	public void clickOnProductCompare() {
		WebDriverUtility.clickOnElement(productCompare);
	}
	
	public void clickOnSortBy() {
		WebDriverUtility.clickOnElement(sortBy);
	}
	
	public void clickOnShowbar() {
		WebDriverUtility.clickOnElement(showbar);
	}
	
	public void clickOnHTCtouchHDImage() {
		WebDriverUtility.clickOnElement(hTCtouchHDImage);
	}
	
	public void clickOniphoneImage() {
		WebDriverUtility.clickOnElement(iphoneImage);
	}
	
	
}
