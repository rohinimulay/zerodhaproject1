package utility;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;



import org.bouncycastle.util.test.SimpleTestResult;
import org.openqa.selenium.WebDriver;

public class Listeners extends BaseTest implements ITestListener{
	
	
	
	public  void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test has started");
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test has passed ");
	}
	public void onTestFailure(ITestResult result) {
		try {
		
			ScreenShot.takeScreenShot(driver,result.getName());
		}catch(IOException e) 
		{
		
			e.printStackTrace();
		
		}
	}
}
	


