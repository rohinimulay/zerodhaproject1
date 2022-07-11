package base;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getClass().getName());
}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getClass().getName());
}
	public void onTesFailure(ITestResult result)
	{
		System.out.println(result.getClass().getName());
}
	

}
