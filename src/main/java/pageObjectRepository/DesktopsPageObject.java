package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {

		PageFactory.initElements(driver, this);

	}
// 1
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopstab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	
	
//	scenario 2
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div")
	private WebElement addTOCART1;

	@FindBy(id = "input-quantity")
	private WebElement inputQuantity;

	@FindBy(id = "button-cart")
	private WebElement cartButt;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessage1;
	
	
//	scenario 3
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addTOCART2;

	@FindBy(id = "input-option226")
	private WebElement avalibleOptions;

	@FindBy(id = "input-quantity")
	private WebElement quantity;

	@FindBy(id = "button-cart")
	private WebElement cartBut;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessage2;
	
	
	
//	 scenario 4

	@FindBy(xpath = "//img[@alt='Canon EOS 5D']")
	private WebElement canonEos5D;
	
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement reviewLink;
	
	@FindBy(id = "input-name")
	private WebElement yourName;
	
	@FindBy(id = "input-review")
	private WebElement yourReview;
	
	@FindBy(xpath= "//input[@name='rating'][1]")
	private WebElement goodrating	;
	
	@FindBy(xpath= "button-review")
	private WebElement continueButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement thanksMassege;
	
	
//	1
	public void clickOndesktopstab() {
		WebDriverUtility.clickOnElement(desktopstab);
	}

	public void clickonshowAllDesktops() {
		// TODO Auto-generated method stub
		WebDriverUtility.clickOnElement(showAllDesktops);
	}

//	2
	public void clickOnADDTOCART() {
		WebDriverUtility.clickOnElement(addTOCART1);

	}

//	public void deleteQuanity() {
//		WebDriverUtility.clearText(quantity);
//		
//	}
	public void enterquantity(String quantity) {
		WebDriverUtility.clearText(inputQuantity);
		WebDriverUtility.enterValue(inputQuantity, quantity);
	}
//	public void enterQuantity(String quantityValue) {
//		
//		WebDriverUtility.enterValue(addTOCART, quantityValue);
//	}

	public void clickOnCartButton1() {
		WebDriverUtility.clickOnElement(cartButt);

	}

	public String successMessage1() {
		String message = successMessage1.getText();
		return message;

	}


// 3
	
	public void clickOnADDTOCART2() {
		WebDriverUtility.clickOnElement(addTOCART2);
		
	}
	
	public void selectColor() {
	WebDriverUtility.clickOnElement(avalibleOptions)	;
		
	}
	
	public void clearQuantity() {
		WebDriverUtility.clearText(quantity);
		
	}
	
	
	
	public void enterQuantity(String quantityValue) {
		
		WebDriverUtility.enterValue(inputQuantity, quantityValue);
	}
	
	public void selectByValue(String value) {
		Select select = new Select(avalibleOptions);
		select.selectByValue("15");
	}
	
	public void clickOnCartBut() {
		WebDriverUtility.clickOnElement(cartBut);
	}
		
	
	
	public String successMessage2() {
		String message = successMessage2.getText();
		return message;
	}
	
//	 4
	
	public void clickOnCanonEos5D() {
		WebDriverUtility.clickOnElement(canonEos5D);
	}
		
		public void clickOnReviewLink() {
			WebDriverUtility.clickOnElement(reviewLink);
		
	}
	
		public void enterYourName(String fName) {
			WebDriverUtility.enterValue(yourName, fName);
		}
		
	
		public void enterYourReview(String review) {
			WebDriverUtility.enterValue(yourReview, review);
		}	
		
		public void clickOnRating() {
			WebDriverUtility.clickOnElement(goodrating);	
			
		}
		
		public void clickOnContinue() {
			WebDriverUtility.clickOnElement(continueButton);
		}


		public void thanksMessageDisplayed() {
			WebDriverUtility.getText(thanksMassege);
			
			
		}

		

		
}
