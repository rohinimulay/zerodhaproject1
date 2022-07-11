package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;

import pom.ZerodhaForgotPassAndSignUp;
import pom.ZerodhaLoginPage;
import utility.BaseTest;
import utility.Excel;
import utility.ScreenShot;

@Listeners(utility.Listeners.class)
public class ZeodhaLoginPageTest extends BaseTest {
	
	WebDriver driver;                //declare globally
	//private String mobNo;
	@BeforeMethod
	public void openBrowser(WebDriver driver) {
		driver =Browser.chromeBrowser();
		driver.manage().window().maximize();
		
	}
		@AfterMethod
		public void afterMethod() throws IOException  {
			
			//ScreenShot.takesScreenShot(driver,"ZerodhaLogInPage" );
			
			
		driver.quit();
}
		
 @Test(priority=1)
	public void loginTest(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
	String userid=Excel.getData("Exceldata", 0, 1);
		String pass =Excel.getData("Exceldata", 1, 1);
		//String  pin=Excel.getData("Exceldata", 2, 1);
	//	SoftAssert softassert=new SoftAssert();
		//boolean status = zerodhaLogInPage.kiteLogo();
	//	softassert.assertTrue(status)  ;      //soft assert
		//Assert.assertFalse(status);          //hard assert
		
		//Assert.assertEquals(status,true,"status verifying");
        //Assert.assertNotEquals(status,true,"status verifying");
		
		
		
		zerodhaLogInPage.enterUserId(userid);
		zerodhaLogInPage.enterPassword(pass);
		zerodhaLogInPage.ClickOnLogin();
		//Thread.sleep(2000);
		//zerodhaLogInPage.enterPin(pin,driver);         //driver is added for explicit wait is added in pom class
		//zerodhaLogInPage.ClickOnSubmit();
	
	//softassert.assertAll();
	}
 
 
 
		
		
		@Test(priority=2,timeOut=1000)
		public void forgot(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException {
			
			//ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
			//Thread.sleep(2000);
//			String userid=Excel.getData("Exceldata", 0, 1);
//			String pass =Excel.getData("Exceldata", 1, 1);
//			String  pin=Excel.getData("Exceldata", 2, 1);
//			zerodhaLogInPage.enterUserId(userid);
//			zerodhaLogInPage.enterPassword(pass);
//			zerodhaLogInPage.ClickOnLogin();
//			Thread.sleep(2000);
//			
//			zerodhaLogInPage.ClickOnForgot2FA();
			
		}
		
//		@Test(priority=2)
//		public void downloadKite() throws InterruptedException {
//			//Thread.sleep(2000);
//			ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
//			 
//			zerodhaLogInPage.ClickOnDownloadKiteFromPlaystore();
//		}
//		@Test(priority=3)
//		public void downloadFromApple() throws InterruptedException {
//			//Thread.sleep(2000);
//		ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
//			zerodhaLogInPage.ClickOndownloadKiteFromApple();
//			
//		}
		
		
			
//		@Test(priority=4)
//		public void signup() throws InterruptedException {
//			//Thread.sleep(2000);
//			ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
//			zerodhaLogInPage.ClickOnSignUp();
//		}
		
	
//	@Test(priority=5)
//	public void forgotUser() throws InterruptedException {
//		//Thread.sleep(2000);
//		ZerodhaLoginPage zerodhaLogInPage =new ZerodhaLoginPage(driver);
//		
//		zerodhaLogInPage.ClickOnForgotLink();
//	}
//		@Test(priority=1)
//		public void SignUp() throws EncryptedDocumentException, IOException, InterruptedException {
//			ZerodhaForgotPassAndSignUp zerodhaForgotPassAndSignUp =new ZerodhaForgotPassAndSignUp(driver);
//			zerodhaForgotPassAndSignUp.clickOnSignUp();
//			Set<String>handles=driver.getWindowHandles();
//			Iterator<String>a=handles.iterator();
//			while(a.hasNext()) {
//				driver.switchTo().window(a.next());
//			}
//			
//			//Thread.sleep(2000);
//			String  MobileNo=Excel.getData("Exceldata", 3, 1);
//			zerodhaForgotPassAndSignUp.enterMobileNo(MobileNo);
//			zerodhaForgotPassAndSignUp.ClickOnContinue();
//			
//			
//		}
//		@Test(priority=-1)
//		public void ForgotUserId() throws EncryptedDocumentException, IOException, InterruptedException {
//		
//		ZerodhaForgotPassAndSignUp zerodhaForgotPassAndSignUp =new ZerodhaForgotPassAndSignUp(driver);
//		zerodhaForgotPassAndSignUp.ClickOnForgotUserId();
//		//Thread.sleep(2000);
//		String userName =Excel.getData("Exceldata", 4, 1);
//		String PanNo =Excel.getData("Exceldata", 5, 1);
//		String mobNo =Excel.getData("Exceldata", 6, 1);
//		zerodhaForgotPassAndSignUp.enterUsername(userName);
//		
//		zerodhaForgotPassAndSignUp.enterpanNo(PanNo);
//		zerodhaForgotPassAndSignUp.ClickOnSms();
//		
//		zerodhaForgotPassAndSignUp.entermobNo(mobNo);
//		zerodhaForgotPassAndSignUp.clickOnSubmit();
//		
//		
//		
		}

	
		
	
	
	
	
	


