package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaDashboard {
	
	@FindBy (xpath = "//span[@data-test-id='learn-menu-button']")private WebElement courses;
	@FindBy (xpath = "//span[text()='Search']")private WebElement searchTab;
	@FindBy (xpath = "(//a[text()='Donate'])[1]")private WebElement donate;
	@FindBy (xpath = "//div[@class=\"basic-user-info\"]")private WebElement addYourBio;
	@FindBy (xpath = "(//button[@type=\"button\"])[1]")private WebElement editProfile;
	@FindBy (xpath = "//div[@aria-label=\"user menu\"]")private WebElement userMenu;
	
	public KaDashboard (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCourses () {
		courses.click();
	}
	public void clickOnAddBio () {
		addYourBio.click();
	}
	public void clickOnEditProfile () {
		editProfile.click();
	}
	public void clickOnUserMenu () {
		userMenu.click();
	}

}
