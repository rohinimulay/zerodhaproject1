package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {



		public static WebDriver chromeBrowser() 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rohin\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
			
			//when we add webdriver manager dependency in maven dependencies of of.xml file then no need to write system.setproperty.
			
//			ChromeOptions options =new ChromeOptions();   //for disabling notifications
//			options.addArguments("disable-notifications");
//			
			
			
		//WebDriverManager.chromedriver().setup();            //it helps us to download chromedriver automatically
		WebDriver driver = new ChromeDriver();      //add options in argument if we use disable notifications //upcasting chromedriver to webdriver 
		driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			//driver.get("https://demo.guru99.com/");
			
			
			//driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);            //implicit wait
			return driver;
			
			
			
		}

	

	}


