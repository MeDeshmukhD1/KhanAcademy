package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaMainPage {
	
	@FindBy (xpath = "//a[text()='Login']")private WebElement loginOption;
	@FindBy (xpath = "(//a[text()='Donate'])[1]")private WebElement donate;
	@FindBy (xpath = "//a[text()='Sign up']")private WebElement signup;
	@FindBy (xpath = "//span[@data-test-id='learn-menu-button']")private WebElement courses;
	@FindBy (xpath = "//span[text()='Search']")private WebElement searchTab;
	
	public KaMainPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginOption () {
		loginOption.click();
	}
	public void clickOnDonate () {
		donate.click();
	}
	public void clickOnSignup () {
		signup.click();
	}
	public void clickOnCourses () {
		courses.click();
	}
	public void clickOnSearchTab () {
		searchTab.click();
	}

}
