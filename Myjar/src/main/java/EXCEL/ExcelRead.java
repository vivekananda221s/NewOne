package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ExcelRead {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\vicky\\Desktop\\Read_WriteDATA.xlsx");
		System.out.println("File Found");
		
		HttpURLConnection connection = 
				(HttpURLConnection)new URL("www.facebook.com").openConnection();
		connection.getResponseCode();
		
	}

}
