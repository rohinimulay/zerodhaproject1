package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userId;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotuser;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement forgot2FA;
	
	@FindBy(xpath="//img[@alt='Kite Android']")private WebElement downloadkiteFromPlaystore;
	@FindBy(xpath="//img[@alt='Kite iOS']")private WebElement downloadKiteFromApple;
	@FindBy(xpath="//img[@alt='Kite']")private WebElement kitelogo;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void ClickOnLogin() {
		login.click();
	}
	public void ClickOnForgotLink() {
		forgotuser.click();
	}
	
	public void enterPin(String pinNumber,WebDriver driver) {
			
//		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);            //fluent wait
//		wait.withTimeout(Duration.ofMillis(50000));
//		wait.pollingEvery(Duration.ofMillis(20000));
//		wait.ignoring(Exception.class);
//		wait.until(ExpectedConditions.visibilityOf(pin));
	
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));   //explicit syntax
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNumber);
		//will check the visibility of element every 500 milisecond
	}
	public void ClickOnSubmit() {
		submit.click();
	}
	public void ClickOnForgot2FA() {
		forgot2FA.click();
	}
	
	

	public void ClickOnSignUp() {
		signUp.click();
	}
	public void ClickOnDownloadKiteFromPlaystore()  {
		downloadkiteFromPlaystore.click();
	}
	public void ClickOndownloadKiteFromApple() {
		downloadKiteFromApple.click();
	}
	public boolean kiteLogo() {
		return kitelogo.isDisplayed();
	}
	
	}
		

	


