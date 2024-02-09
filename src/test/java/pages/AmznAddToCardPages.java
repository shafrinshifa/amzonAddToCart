package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainSteps.BaseClass;

public class AmznAddToCardPages extends BaseClass{
	
	public AmznAddToCardPages() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	 
	
	
	@FindBy (id= "a-autoid-0")
	WebElement clickSignIn; 
	
	@FindBy(name="email")
	WebElement enterNumber;
	
		@FindBy(id="continue")
	WebElement ClickContinue;
	
	@FindBy(name="password")
	WebElement enterPassword;
	
	@FindBy (id="signInSubmit")
	WebElement submit;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	WebElement clickSearch;
	
	@FindBy(linkText="Apple iPhone 15 (128 GB) - Pink")
	WebElement sendMobile;
	
	@FindBy(name="submit.add-to-cart")
	WebElement addToCard;
	
	@FindBy(id="buy-now-button")
	WebElement buyNow;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement giveNum;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement cnt;
	
	@FindBy(id="a-autoid-0")
	WebElement otpCnt;
//	@FindBy(name="password")
//	WebElement givePswd;
	
	
	
	
	public WebElement getGiveNum() {
		return giveNum;
	}

	public WebElement getCnt() {
		return cnt;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAddToCard() {
		return addToCard;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getSendMobile() {
		return sendMobile;
	}

	public WebElement getClickSignIn() {
		return clickSignIn;
	}

	public WebElement getEnterNumber() {
		return enterNumber;
	}

	public WebElement getClickContinue() {
		return ClickContinue;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getSubmit() {
		return submit;
	}


	
	

}
