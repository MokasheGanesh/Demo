package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlsPractice {
	
	
	public static String  getTestData(int i, int j) throws EncryptedDocumentException, IOException 
	{
		
		String path ="C:\\Users\\Admin\\Desktop\\Test.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		String  value = WorkbookFactory.create(file).getSheet("Velocity").getRow(i).getCell(j).getStringCellValue();
																							// getNumericCellValue();
		System.out.println(value);
		
		return value; 
		
		
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		getTestData(1,2);
	}

}
