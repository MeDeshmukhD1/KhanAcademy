package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.KaLoginPage;
import pom.KaMainPage;
import utility.BaseClass;
import utility.EReports;
import utility.Parameterization;

public class KaLoginPageTest extends BaseClass{
	
	@BeforeTest
	public void configureReports () {
		reports = EReports.createExtentReport();
	}
	@BeforeMethod
	public void openBrowser () {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void khanLoginTest () throws EncryptedDocumentException, IOException, InterruptedException {
		test = reports.createTest("KhanLoginTest");
		KaMainPage kmp = new KaMainPage(driver);
		kmp.clickOnLoginOption();
		KaLoginPage klp = new KaLoginPage (driver);
		klp.enterEmailOrUserId(Parameterization.getExcelData("credentials", 0, 1));
		klp.enterPassword(Parameterization.getExcelData("credentials", 1, 1));
		klp.clickOnLogin();
		Thread.sleep(3000);
		String expectedTitle = "Dashboard | Khan Academy";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	@AfterMethod
	public void collectResults (ITestResult result) {
		EReports.publishResult(result);
	}
	@AfterTest
	public void flushResults () {
		reports.flush();
	}

}

//Khan Academy | Free Online Courses, Lessons & Practice    -----  KA Login page title
//Dashboard | Khan Academy                                 ------  KA dash board title