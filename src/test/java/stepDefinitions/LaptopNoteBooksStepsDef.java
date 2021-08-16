package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopNoteBooksStepsDef extends Base {
	
	LaptopsNoteBooksPageObject lapNBook = new LaptopsNoteBooksPageObject();
	
	@Given("^User is on Retail websiteWhen$")
	public void user_is_on_Retail_websiteWhen()  {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
	   
	}
//	1

	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab()  {
		lapNBook.clickOnLaptopNotebooks();
	    logger.info("user clicked on Laptop NoteBooks");
	}
	

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option()  {
		lapNBook.clickOnshowAllLaptopsAndNotebooks();
		logger.info("user click on show all Laptop &NoteBooks option");
	 
	}

	@When("^User click on MacBook  item$")
	public void user_click_on_MacBook_item()  {
		lapNBook.clickOnMacBook();
		logger.info("user clicked on MacBook item");
	   
	}
	
//	@And("^User click add to Cart button$")
//	public void user_click_add_to_cart_button() {
//		lapNBook.clickOnAddtoCartButton();
//		logger.info("User clicked add to Cart button");
//		
//	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart()  {
	   String actual ="Success: You have added MacBook to your shopping cart!";
	   String expected ="Success: You have added MacBook to your shopping cart!";
	   actual.contains("Success");
	   expected.contains("Success");
	}

	@Then("^User should see \"([^\"]*)\" showed to the cart$")
	public void user_should_see_showed_to_the_cart(String arg1)  {
	   
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option()  {
		lapNBook.clickOnCartOption();
		logger.info("user cliked on cert option");
	    
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart()  {
		lapNBook.clickOnRedXButton();
		logger.info("user clicked on red X button to remove the item from cart");
	}
// problem
	@Then("^item should be removed and cart should show \"([^\"]*)\"$")
	public void item_should_be_removed_and_cart_should_show(String arg1)  {
	   
	}
	
//	2
	
	@And("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook()  {
		lapNBook.clickOncomparisonIconMacBook();
		logger.info("User click on product comparison icon on ‘MacBook’");
		
		
	}


	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air()  {
		lapNBook.clickOncomparisonIconAir();
		logger.info("User click on product comparison icon on ‘MacBook’");
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison()  {
		lapNBook.addedItemToProductComparison();
		logger.info("User should see a message ‘Success: You have added MacBook Air to your product comparison!’");
		WebDriverUtility.screenShot();
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link()  {
		lapNBook.clickOncomparisonLink();
		logger.info("user clicked on product comparison");
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart()  {
		lapNBook.productComparisonChartTitleIsDispalyed();
		logger.info("User should see Product Comparison Chart");
	   
	}
//	3

	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list()  {
		lapNBook.clickOnSonyVaioWishList();
		logger.info("user clicked on heart icon to add ‘Sony VaIO’ laptop to wish list" );
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list()  {
		  String expectedMessage = "You must login or create an account to save Sony VAIO to your wish list!";
		  String actualMessage = lapNBook.loginOrCreateAccountMessage();
		  Assert.assertEquals(expectedMessage, actualMessage);
		  logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!");
		  WebDriverUtility.screenShot();
		   
		}
//	4

	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item()  {
		lapNBook.clickOnmacBookProItem();
		logger.info("User click on ‘MacBook Pro’ item");
	    
	}

	@Then("^User should see  \"([^\"]*)\" price tag is present on UI$")
	public void User_should_see__price_tag_is_present_on_UI(String expectedPrice) {
		lapNBook.tagPriceOfMacIsDisplayed();
		WebDriverUtility.screenShot();
		String actualPrice = lapNBook.tagPriceOfMacIsDisplayed();
		System.out.println(actualPrice);
//		String expectedPrice=lapNBook.tagPriceOfMacIsDisplayed();
		Assert.assertEquals(actualPrice, expectedPrice);

		//capture the price that macbook through your code
		//Assert the price macbood that receive from you code to the price that your passing from feature file
		logger.info("User see the price tag present on UI");
	}
}
