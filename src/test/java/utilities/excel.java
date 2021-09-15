package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
	public void getexcel() throws IOException {
		
		FileInputStream fs = new FileInputStream("src/test/Resources/Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		int sheetcount = wb.getNumberOfSheets();
		XSSFSheet sheet = wb.getSheet("Googlesearch");
		Iterator<Row>  row= sheet.iterator();
		Row firstrow = row.next();
		
	}

}
