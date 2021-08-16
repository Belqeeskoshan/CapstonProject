package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement laptopNotebooks;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(id="button-cart")
	private WebElement addtoCartButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement cartOption ;
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	private WebElement redXButton;
	
//	2
	
	@FindBy(xpath="//button[@class='btn btn-default'][1]")
	private WebElement comparisonIconMacBook;
	
	
	@FindBy(xpath="//i[@class='fa fa-exchange']")
			private WebElement comparisonIconMacBookAir;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAdd;
	
	
	
	@FindBy(xpath="//a[text()='product comparison']")
	private WebElement comparisonLink;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	private WebElement comparisonChart;
	
//	3
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]/i")
	private WebElement SonyVaioWishList;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
	private WebElement loginOrCreateAccountMessage;
	
//	4
	
	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement tagPriceOfMacIsDisplayed;
	
	
	public void clickOnLaptopNotebooks() {
		WebDriverUtility.clickOnElement(laptopNotebooks);
	}
	public void clickOnshowAllLaptopsAndNotebooks() {
		WebDriverUtility.clickOnElement(showAllLaptopsAndNotebooks);
	}
//	http://tek-school.com/retail/index.php?route=product/category&path=18
	public void clickOnMacBook() {
		WebDriverUtility.clickOnElement(macBook);
	}
	
	public void clickOnAddtoCartButton() {
		WebDriverUtility.clickOnElement(addtoCartButton);
	}
	
	public void clickOnSuccessMessage() {
		WebDriverUtility.clickOnElement(successMessage);
	}
	
	public void clickOnCartOption() {
		WebDriverUtility.clickOnElement(cartOption);
	}
	
	public void clickOnRedXButton() {
		WebDriverUtility.clickOnElement(redXButton);
	}
	
//	public void clickOncomparisonIconMacBook() {
//	WebDriverUtility.clickOnElement(comparisonIconMacBook);
	public void clickOncomparisonIconMacBook() {
		WebDriverUtility.clickOnElement(comparisonIconMacBook);
		// TODO Auto-generated method stub
		
	}
	
	
	public void clickOncomparisonIconAir() {
		WebDriverUtility.clickOnElement(comparisonIconMacBookAir);
		
		}
	
	
	public String addedItemToProductComparison() {
		String message = successAdd.getText();
		return message;
	}
	
	public void clickOncomparisonLink() {
	WebDriverUtility.clickOnElement(comparisonLink);
	}
	
	public String productComparisonChartTitleIsDispalyed() {
		
		return comparisonChart.getText();
	}
	
	
	
//	3
	public void clickOnSonyVaioWishList() {
		WebDriverUtility.clickOnElement(SonyVaioWishList);
	}
	
	public String loginOrCreateAccountMessage() {
		String message = successMessage.getText();
		return message;
	}
	
//	4

	public void clickOnmacBookProItem() {
		WebDriverUtility.clickOnElement(macBookProItem);
	}
	
	
	public String tagPriceOfMacIsDisplayed() {
		return tagPriceOfMacIsDisplayed.getText();
		
	}
	
	
	
	
	
	
	
	
	
}
