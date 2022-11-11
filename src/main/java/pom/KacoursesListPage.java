package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KacoursesListPage {
	
	@FindBy (xpath = "//span[@class=\"_xy39ea8\"]")private List <WebElement> diffcourses;  //change xpath later
	
	public KacoursesListPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDiffCourses (int i) {
		//diffcourses
	}

}

//span[@class="_xy39ea8"]      --courses --  findelements