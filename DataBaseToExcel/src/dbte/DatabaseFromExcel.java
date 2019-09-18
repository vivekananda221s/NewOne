package dbte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseFromExcel {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException

	{
		int i =0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelldata","root","Vivek@1234567890");
		System.out.println("Connection is established");
		
		Statement stmnt = con.createStatement();
		
		ResultSet rs = stmnt.executeQuery("select * from excel;");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\vicky\\Desktop\\BOOK.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		while(rs.next())
		{
			XSSFRow row = sheet.createRow(i);
			
			String id = rs.getString("id");
			row.createCell(0).setCellValue(id);
			
			String name = rs.getString("name");
			row.createCell(1).setCellValue(name);
			
			int age = rs.getInt("age");
			row.createCell(2).setCellValue(age);
			
			String address = rs.getString("address");
			row.createCell(3).setCellValue(address);
			i++;
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\vicky\\Desktop\\BOOK2.xlsx");
		book.write(fos);
		book.close();
		
		
	}

}
