package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSearchFunctionalityScript;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaSearchTestClass {
	WebDriver driver;
	
		@BeforeMethod
		public void openBrowser() throws EncryptedDocumentException, IOException {
			driver =Browser.chromeBrowser();
			driver.manage().window().maximize();
			ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
			String userid=Excel.getData("Exceldata", 0, 1);
			String pass =Excel.getData("Exceldata", 1, 1);
			String  pin=Excel.getData("Exceldata", 2, 1);
			
			
			
			zerodhaLogInPage.enterUserId(userid);
			zerodhaLogInPage.enterPassword(pass);
			zerodhaLogInPage.ClickOnLogin();
			
			zerodhaLogInPage.enterPin(pin,driver);         //driver is added for explicit wait is added in pom class
			zerodhaLogInPage.ClickOnSubmit();
		
		}
			@AfterMethod
			public void afterMethod() throws IOException  {
				
				ScreenShot.takeScreenShot(driver,"ZerodhaLogInPage" );
				
				
			//driver.quit();
	}
			
	 @Test(priority=-1)
	 public void buyFromWatchListTest() {
		 ZerodhaSearchFunctionalityScript zerodhaSearch=new ZerodhaSearchFunctionalityScript(driver);
		 zerodhaSearch.selectShareFromWatchListAndBuy("RELIANCE", driver);
	 }
		 
	 }
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	
		
		
	
	


