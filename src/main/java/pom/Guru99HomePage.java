package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage {
	@FindBy(xpath="//input[@name='uid']")private WebElement username;
    @FindBy(xpath="//input[@name='password']")private WebElement password;
    @FindBy(xpath="//input[@name='btnLogin']")private WebElement login;
    
    @FindBy(xpath="//a[text()='New Customer']")private WebElement NewCustomer;
    @FindBy(xpath="//input[@name='rad1'][1]")private WebElement MaleGender;
    @FindBy(xpath="//input[@name='rad1'][2]")private WebElement FemaleGender;
    
    public Guru99HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
    }
    public void enterusername(String user) {
    	username.sendKeys("mngr422775");
    }
    public void enterpassword(String pass) {
    	password.sendKeys("YhUdamU");
    }
    public void clickOnLogin()
    {
    	login.click();
    }
    public void ClickOnNewCustomer() {
    	NewCustomer.click();
    }
    public void ClickOnMaleGender() {
    	MaleGender.click();
    }
    public void ClickOnFemaleGender() {
    	FemaleGender.click();
    }
    
    	
    }
    
   

