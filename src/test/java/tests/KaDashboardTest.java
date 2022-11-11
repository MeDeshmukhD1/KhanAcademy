package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.KaDashboard;
import pom.KaLoginPage;
import pom.KaMainPage;
import utility.BaseClass;
import utility.EReports;
import utility.Parameterization;

public class KaDashboardTest extends BaseClass {
	
	@BeforeTest
	public void configureReports () {
		reports = EReports.createExtentReport();
	}
	@BeforeMethod
	public void openBrowser () {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void clickCoursesCheckVisibility () throws EncryptedDocumentException, IOException, InterruptedException {
		test = reports.createTest("clickCoursesCheckVisibility");
		KaMainPage kmp = new KaMainPage(driver);
		kmp.clickOnLoginOption();
		KaLoginPage klp = new KaLoginPage (driver);
		klp.enterEmailOrUserId(Parameterization.getExcelData("credentials", 0, 1));
		klp.enterPassword(Parameterization.getExcelData("credentials", 1, 1));
		klp.clickOnLogin();
		Thread.sleep(3000);
		KaDashboard kdb = new KaDashboard (driver);
		kdb.clickOnCourses();
		WebElement mathMenu = driver.findElement(By.xpath("(//div[@data-test-learn-menu-domain='math'])[1]"));
		Assert.assertEquals(true, mathMenu.isDisplayed());
		
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
