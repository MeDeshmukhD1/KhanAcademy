package utility;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EReports extends BaseClass {
	
//	static ExtentReports reports;   //commented it because both entities have declared in BaseClass
//	static ExtentTest test;
	
public static ExtentReports createExtentReport () {
		
		ExtentReports reports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("SampleExtentReport");
		reports.attachReporter(spark);
		reports.setSystemInfo("Created By :- ", "Dhananjay v Deshmukh");
		reports.setSystemInfo("Test :- ", "Regression");
		return reports;
		
	}
	
	public static ITestResult publishResult (ITestResult result) {
		
		if (result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus() == ITestResult.FAILURE) 
		{
			test.log(Status.FAIL, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
		return result;
		
	}

}
