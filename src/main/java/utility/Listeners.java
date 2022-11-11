package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	
	public void onTestStart (ITestResult result) {
		System.out.println("Test Started - "+ result.getName());
	}
	
	public void onTestSuccess (ITestResult result) {
		System.out.println("Test Passed - "+ result.getName());
		
	}
	
	public void onTestFailure (ITestResult result) {
		//System.out.println("Test Failed - "+ result.getName());
		try {
			Screenshot.clickSS(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped (ITestResult result) {
		System.out.println("Test Skipped - "+ result.getName());
	}

}
