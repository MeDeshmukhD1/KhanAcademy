package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
//	static WebDriver driver;
	
	public static WebDriver openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.khanacademy.org/");
		
		driver.manage().window().maximize();
		
		return driver;
		
	}

	//Below Method is written for Cross Browser Testing-- change method name to openBrowser() -- keep any one method.
/*	
    public static WebDriver openCrossBrowser (String browser) {
		
	   if (browser.equals("Chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	   }
	   else if (browser.equals("Edge"))
	   {
		   WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	   }
		
		driver.get("https://www.khanacademy.org/");
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
*/
}
