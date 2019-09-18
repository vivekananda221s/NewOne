package dbte;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {

	public static void main(String[] args)
	{
		
		Logger log = Logger.getLogger("Log4j");
		
		PropertyConfigurator.configure("C:\\Users\\vicky\\Desktop\\prop34.properties");
		
		log.info("data printed");
		System.out.println("A");
		

		log.info("data printed");
		System.out.println("B");
		
		

		log.info("data printed");
		System.out.println("C");
		
		

		log.info("data printed");
		System.out.println("D");
	}

}
