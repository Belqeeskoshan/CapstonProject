package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RetailPageObject extends Base {
	
	public  RetailPageObject() {
		
	PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	@FindBy(id = "account-account")
	private WebElement myAccountDashBoard;
	
	public void myAccountDashBoardIsDisplayed() {
		WebDriverUtility.getText(myAccountDashBoard);
		
	}
	
//	1
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']\"")
	private WebElement regForAnAffiliateAccLink;
	
	public void clickOnregForAnAffiliateAccLink() {
		WebDriverUtility.clickOnElement(regForAnAffiliateAccLink);
	}
	
	@FindBy(id = "input-company")
	private WebElement companyField;
	
	public void enterCompany(String comp) {
		WebDriverUtility.enterValue(companyField, comp);
	}
	
	@FindBy(id = "input-website")
	private WebElement webSite;
	
	public void enterWebSite(String websiteValue) {
		WebDriverUtility.enterValue(webSite, websiteValue);
	}
	
	@FindBy(id = "input-tax")
	private WebElement taxtID;
	
	public void enterTaxID(String taxIDValue) {
		WebDriverUtility.enterValue(taxtID, taxIDValue);
	}
	
	@FindBy(name= "cheque")
	private WebElement chequePaymentMethodField;
	
	public void clickOnchequePaymentMethodField() {
		WebDriverUtility.clickOnElement(chequePaymentMethodField);
	}
	
	
	
	@FindBy(name= "agree")
	private WebElement checkBox;
	
	public void clickOncheckBox() {
		WebDriverUtility.clickOnElement(checkBox);
	}
	
	
	@FindBy(xpath= "//input[@value='Continue']")
	private WebElement continueButton;
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
//	2
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfoLink;
	
	public void clickOnEditAffiliateInfoLink() {
		WebDriverUtility.clickOnElement(editAffiliateInfoLink);
	}
	
	
	@FindBy(xpath= "//input[@value='bank']")
	private WebElement bankTrsRadioButton;

	
	public void clickOnBankTrsRadioButton() {
		WebDriverUtility.clickOnElement(bankTrsRadioButton);
	}
	
	
	
	@FindBy(id = "input-bank-name")
	private WebElement bankName;
	
	public void enterBankName(String bName) {
		WebDriverUtility.enterValue(bankName, bName);
	}
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumber;
	
	public void enterAbaNumber(String abaNum) {
		WebDriverUtility.enterValue(abaNumber, abaNum);
	}
	
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;
	
	public void enterSwiftCode(String swiftCodeValue) {
		WebDriverUtility.enterValue(swiftCode, swiftCodeValue);
	}
	
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;
	
	public void enterAccountName(String acName) {
		WebDriverUtility.enterValue(accountName, acName);
	}
	
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNamber;
	
	public void enterAccountNamber(String acNumberValue) {
		WebDriverUtility.enterValue(accountNamber, acNumberValue);
	}
	
	
	@FindBy(xpath= "//input[@value='Continue']")
	private WebElement continueButton1;
	
	public void clickOnContinueButton1() {
		WebDriverUtility.clickOnElement(continueButton1);
	}
	
	@FindBy(xpath= "//*[@id=\"account-account\"]/div[1]")
	private WebElement successMessageUpdate;
	
	public String successMessageUpdate() {
		String message = successMessageUpdate.getText();
		return message;
	}
	
//	3
	
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editAccountInfoLink;
	
	public void clickOnEditAccountInfoLink() {
		WebDriverUtility.clickOnElement(editAccountInfoLink);
	}
	
	@FindBy(id = "input-firstname")
	private WebElement firstName;
	
	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstName, fName);
	}
	
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	
	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastName, lName);
	}
	
	@FindBy(id = "input-email")
	private WebElement email;
	
	public void enterRegistrationEmail(String emailvalue) {
		WebDriverUtility.enterValue(email, emailvalue);
	}
	@FindBy(id = "input-telephone")
	private WebElement telephone;
	
	public void enterTelephone(String telephoneValue) {
		WebDriverUtility.enterValue(telephone, telephoneValue);
	}
	
	@FindBy(xpath= "//input[@value='Continue']")
	private WebElement continueButton2;
	
	public void clickOnContinueButton2() {
		WebDriverUtility.clickOnElement(continueButton2);
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	

	
	
	
	
}