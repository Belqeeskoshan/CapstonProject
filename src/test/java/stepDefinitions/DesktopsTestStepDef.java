package stepDefinitions;






import java.awt.Desktop;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjectRepository.DesktopsPageObject;
import utilites.WebDriverUtility;

public class DesktopsTestStepDef extends Base {
	
	
	DesktopsPageObject desktops = new DesktopsPageObject();
//	1
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		openBrowser();
		logger.info("Retail website is opened");
		WebDriverUtility.screenShot();
	}
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktop_tab() {
		desktops.clickOndesktopstab();
		logger.info("User clicked on Desktops tab");
	}
	@And("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops(){
		desktops.clickonshowAllDesktops();
		logger.info("User clicked on Show all desktops");
		WebDriverUtility.screenShot();
		
	
	}
	
	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
	WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		logger.info("User see all items are present in Desktop page");
		
		
}
// 2
	@And("^User click ADD TO CART option on 'HP LP3065' item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP3065_item() {
		desktops.clickOnADDTOCART();
		logger.info("User clicked ADD TO CART option on HP LP3065 item");
		WebDriverUtility.screenShot();
	}
	
		
	
	  
	

	@When("^User enter quantity 1$")
	public void user_enter_quantity(String inputQuantity) {
	desktops.enterquantity(inputQuantity);
		
		logger.info("User selected Quantity 1");
		
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_butt()  {
		desktops.clickOnCartButton1();
		logger.info("User clicked add to Cart button");
	}

	@Then("^User should see a message ‘Success: you have added HPLP3065 to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_3065_to_your_Shopping_cart()  {
		String expectedMessage = "you have added HP LP 3065 to your Shopping cart!";
		  String actualMessage = desktops.successMessage1();
		  Assert.assertEquals(expectedMessage, actualMessage);
		  logger.info("user Account has been created");
		  WebDriverUtility.screenShot();
	}
	
	@When("^User click  ADD TO CART option on ‘Canon EOS 5D’ item $")
	
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item() {
		
		desktops.clickOnADDTOCART2();
		logger.info("user clicked add to cart option");
	}
	
	@When("^User select color from dropdown 'Red'$")
	public void user_select_color_from_dropdown_Red()   {
		desktops.selectColor();
		logger.info("user selected dolor from dropdown");
	}
	

	@When("^User select quantity 1$")
	public void user_select_quantity()   {
		desktops.clearQuantity();
		logger.info("User selected quantity 1");
		
	}


	@Then("^User should see a message 'Success: You have added CanonEOSD to your shopping cart!'$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1)  {
		 desktops.thanksMessageDisplayed();
		    WebDriverUtility.screenShot();
		    
		
		
	}
	
	
	

//	@When("^User add CanonEOS5D from Desktops tab to the cart$")
//	public void user_click_on_Canon_EOS_5D_item()  {
//		desktops.clickOnCanonEos5D();
//		logger.info("user clicked on Canon Eos 5D item");
	 
//		4
	@When("^User click on CanonEOS5D item$")
	public void user_click_on_CanonEOS_D_item()  {
		desktops.clickOnCanonEos5D();
		logger.info("User click on CanonEOS5D item");
	   
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link()  {
		desktops.clickOnReviewLink();
		logger.info("user clicked on Write a review linnk");
		 WebDriverUtility.screenShot();
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable info)  {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		desktops.enterYourName(dataValues.get(0).get("yourName"));
		desktops.enterYourReview(dataValues.get(0).get("yourReview"));
		desktops.clickOnRating();
		logger.info("user filled the review information with below information");
		 WebDriverUtility.screenShot();
		
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button()  {
		desktops.clickOnContinue();
		logger.info("user clicked on cintinue Button");
	}




}
