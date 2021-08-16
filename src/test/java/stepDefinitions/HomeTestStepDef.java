package stepDefinitions;


import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class HomeTestStepDef extends Base{
	
	HomePageObject home = new HomePageObject();
	
//	scenario 1	
	@When("^User click on Currency$")
	public void user_click_on_currency() {
		home.clickOnCurrency();
		logger.info("user click on currency");
		
	}
	
	@When("^User Chose Euro from dropdown$")
	public void user_Chose_Euro_from_dropdown()  {
	    home.clickOnEuro();
	    logger.info("user chose euro from dropdown");
	    WebDriverUtility.screenShot();
	}

	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro()  {
	    home.isElementDisplayed();
	    logger.info("currency value should changed to euro");
	    WebDriverUtility.screenShot();
	}
	
//	 scenario 2

	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart()  {
		home.clickOnShoppingCart();
		logger.info("user click on shopping cart");
		
	}
	    
	

	@Then("^Your shopping cart is empty! message should display$")
	public void message_should_display()  {
		 home.gettext();
		logger.info("your shopping cart is empty! message should display");
		WebDriverUtility.screenShot();
	
	}	

}
