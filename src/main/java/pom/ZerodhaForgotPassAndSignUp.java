package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPassAndSignUp {
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement Username;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement PanNo;
	@FindBy(xpath="//label[text()='I forgot my user ID']")private WebElement ForgotUsername;
	@FindBy(xpath="//label[text()='SMS']")private WebElement Sms;
	@FindBy(xpath="//input[@placeholder='Mobile number (as on account)']")private WebElement mobNo;
	@FindBy(xpath="//button[text()='Reset ']")private WebElement Submit;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement BackToLogin;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement ForgotUserId;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement SignUp;
	@FindBy(xpath="//input[@placeholder='Your 10 digit mobile number']")private WebElement MobileNo;
	@FindBy(xpath="//button[@id=\"open_account_proceed_form\"]")private WebElement Continue;
	
	
	public ZerodhaForgotPassAndSignUp (WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String user) {
		Username.sendKeys(user);
	}
	public void ClickOnForgotUserId() {
		ForgotUserId.click();
	}
	public void clickOnSignUp() {
		SignUp.click();
	}
	public void enterMobileNo(String MoNo) {
		MobileNo.sendKeys(MoNo);
	}
	public void ForgotUserId() {
		ForgotUserId.click();
	}
	public void ClickOnContinue() {
		Continue.click();
}
	public void enterpanNo(String Pan) {
		PanNo.sendKeys(Pan);
	}
	public void ClickOnForgotUsername() {
		ForgotUsername.click();
	}
	public void ClickOnSms() {
		Sms.click();
	}
	public void clickOnSubmit() {
		Submit.click();
	}
	public void ClickOnBackToLogin() {
		BackToLogin.click();
	}
	public void entermobNo(String MobNo) {
		mobNo.sendKeys(MobNo);
	}
}
	
	
	


