package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void clickSS (WebDriver driver , String Name) throws IOException {
		
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		//Getting Date and Time
		LocalDateTime datetime = LocalDateTime.now();
		//Formating Date and Time
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY, hh_mm_ss");
		String DTstamp = datetime.format(format);
		
		File destination = new File("D:\\Eclips Sample Programs\\KhanAcademy\\Screenshots"+Name+"-"+DTstamp+".jpg");  // Path to save SS
		
		FileHandler.copy(sourcefile, destination);
	}

}
