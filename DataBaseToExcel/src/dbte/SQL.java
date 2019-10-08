package dbte;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek","root","Vivek@1234567890");
		
		Statement statement = connection.createStatement();
		
		ResultSet data = statement.executeQuery("");
		
		while(data.next())
		{
			
		}

	}

}
