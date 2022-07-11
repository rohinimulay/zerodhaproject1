package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pojo.Browser;
import pom.Guru99HomePage;
import utility.Excel;
import utility.ScreenShot;

public class Guru99Test {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();            
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		Guru99HomePage guru99=new Guru99HomePage(driver);
		//String userid=Excel.getData("Exceldata", 4, 1);
		//String pass =Excel.getData("Exceldata", 5, 1);
		
		guru99.enterusername("mngr422775");
		guru99.enterpassword("YhUdamU");
		guru99.clickOnLogin();
	}
		
		@AfterMethod
		public void afterMethod() throws IOException  {
			
			ScreenShot.takeScreenShot(driver,"Guru99" );
			
			
		driver.quit();
		}
		@Test(priority=-1)
		public void login() {
			Guru99HomePage guru99=new Guru99HomePage(driver);
			guru99.ClickOnNewCustomer();
			//guru99.ClickOnMaleGender();
			
			guru99.ClickOnFemaleGender();
		}


			
			
			
}

