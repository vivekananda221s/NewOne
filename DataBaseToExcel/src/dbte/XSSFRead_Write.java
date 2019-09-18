package dbte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class XSSFRead_Write {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\vicky\\Desktop\\BOOK.xlsx");
		
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("I12");
		sheet.createRow(1).createCell(0).setCellValue("mefound");
		FileOutputStream fs= new FileOutputStream("C:\\Users\\vicky\\Desktop\\me.xlsx");
		book.write(fs);
		book.close();
		
		

	}

}
