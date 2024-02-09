package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainSteps.BaseClass;
import pages.AmznAddToCardPages;

public class AmznAddToCardSteps extends BaseClass {

	AmznAddToCardPages addToCardPages;

	@Given("User Should on the login page")
	public void user_should_on_the_login_page() {
		launchBrowser();
		loadUrl("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		implicitWait();
		maximize();
	}

	@Given("user should enter the valid {string}{string}")
	public void user_should_enter_the_valid(String username, String password) {		AmznAddToCardPages addToCardPages = new AmznAddToCardPages();
	addToCardPages.getClickSignIn().click();
	addToCardPages.getEnterNumber().sendKeys(username);
	addToCardPages.getClickContinue().click();
	addToCardPages.getEnterPassword().sendKeys(password);


	}
	@When("user should click the login btn")
	public void user_should_click_the_login_btn() {
		addToCardPages = new AmznAddToCardPages();
		addToCardPages.getSubmit().click();

	}
	@When("user should search {string}")
	public void user_should_search(String mobile) {
		
		addToCardPages = new AmznAddToCardPages();
		addToCardPages.getSearch().sendKeys(mobile);
		addToCardPages.getClickSearch().click();
		addToCardPages.getSendMobile().click();
		
		
	}
	@Then("user should add the mobile to the card")
	public void user_should_add_the_mobile_to_the_card() {
		addToCardPages = new AmznAddToCardPages();
		addToCardPages.getAddToCard().click();
		addToCardPages.getBuyNow().click();
		addToCardPages.getGiveNum().sendKeys("9600282648");
		addToCardPages.getCnt().click();



	}
	@Then("user give the valid details for the payment details and {string}")
	public void user_give_the_valid_details_for_the_payment_details_and(String string) {
		addToCardPages = new AmznAddToCardPages();



	}


}
