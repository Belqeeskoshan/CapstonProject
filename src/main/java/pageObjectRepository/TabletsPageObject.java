package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class TabletsPageObject extends Base {

	public TabletsPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Tablets']")
	private WebElement tablets;
	
	@FindBy(xpath="//i[@class='fa fa-th-list']")
	private WebElement list;
	
	@FindBy(id="grid-view")
	private WebElement grid;
	
	@FindBy(id="compare-total")
	private WebElement productCompare;
	
	@FindBy(id="input-sort")
	private WebElement sortBy;
	
	@FindBy(id="input-limit")
	private WebElement showBox;
	
	public void clickOnTablets() {
		WebDriverUtility.clickOnElement(tablets);
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
	
	public void clickOnShowBox() {
		WebDriverUtility.clickOnElement(showBox);
	}
	
	
	
	
}
