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
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		Properties prop = new Properties();
		prop.setProperty("x","20");
		FileOutputStream fos = new FileOutputStream("v://x.properties");
		
	}

}
