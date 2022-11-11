package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static String getExcelData (String SheetName, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Eclips Sample Programs\\KhanAcademy\\src\\test\\resources\\KhanTestData.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}

}
