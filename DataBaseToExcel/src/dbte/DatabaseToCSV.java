package dbte;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.opencsv.CSVWriter;

public class DatabaseToCSV {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelldata","root","Vivek@1234567890");
		System.out.println("Connection is established");
		
		Statement stmnt = con.createStatement();
		
		ResultSet rs = stmnt.executeQuery("select * from excel;");
		
		FileWriter fr = new FileWriter("C:\\Users\\vicky\\Desktop\\CSV.CSV");
		
		System.out.println("File Found");
		
		CSVWriter csvw = new CSVWriter(fr);
		
		
		
	}

}
