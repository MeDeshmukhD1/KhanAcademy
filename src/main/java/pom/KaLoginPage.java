package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaLoginPage {
	
	@FindBy (xpath = "//input[@type='text']")private WebElement username;
	@FindBy (xpath = "//input[@type='password']")private WebElement password;
	@FindBy (xpath = "//button[@type='submit']")private WebElement login;
	@FindBy (xpath = "//a[text()='Forgot password?']")private WebElement forgotpass;
	@FindBy (xpath = "//a[text()='Create an account']")private WebElement createacc;
	
	public KaLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailOrUserId (String email) {
		username.sendKeys(email);
	}
	public void enterPassword (String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin () {
		login.click();
	}
	public void clickOnForgotPassword () {
		forgotpass.click();
	}
	public void clickOnCreateAccount () {
		createacc.click();
	}

}
