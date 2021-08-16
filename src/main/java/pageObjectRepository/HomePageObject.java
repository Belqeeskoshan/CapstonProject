package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
// 1
	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currency;
	
	@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement euro;
	
	
	//strong[text()='€']
//	 2
	
	@FindBy(xpath ="//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	
	
	@FindBy(xpath ="//*[@id=\"content\"]")
	private WebElement messagePage;


//	 1
	
	public void clickOnCurrency() {
		WebDriverUtility.clickOnElement(currency);	
	}
	
	public void clickOnEuro() {
		WebDriverUtility.clickOnElement(euro);
	
	}
	
	public boolean isElementDisplayed( ) {
		if (euro.isDisplayed()) {
			return true;
		} else
			return false;
	}

//	 2
	
	public void clickOnShoppingCart() {
		WebDriverUtility.clickOnElement(shoppingCart);
		
	}
	
	public void gettext() {
		WebDriverUtility.getText(messagePage);
	
	}

	
	
	
	

}
