package dbte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Properties22 {

	public static void main(String[] args) throws IOException 
	{
		Logger log = Logger.getLogger("Properties");
		PropertyConfigurator.configure("C:\\Users\\vicky\\Desktop\\prop34.properties");
		
		FileInputStream fis = new FileInputStream("F:\\Frame Works\\DataBaseToExcel\\src\\facebook.properties");
		log.info("File Found ");
		
		Properties rep = new Properties();
		log.info("Properties are initiated ");
		rep.load(fis);
		log.info("Properties are loaded ");
		String url;
		url = rep.getProperty("url");
		System.out.println(""+url);
		log.info("reading url from prop ");
		
		url = rep.getProperty("email");
		System.out.println(""+url);
		log.info("reading url from prop ");
		
		url = rep.getProperty("password");
		System.out.println(""+url);
		log.info("reading url from prop ");
		

		
		

	}

}
