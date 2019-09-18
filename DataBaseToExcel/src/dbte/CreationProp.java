package dbte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreationProp {

	public static void main(String[] args) throws IOException 
	{
		
			Properties rep = new Properties();
			rep.setProperty("username","vivek lovelyy");
			rep.setProperty("password","vivek12");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\vicky\\Desktop\\Create.properties");
			rep.store(fos, "Property file with user name and password");
			
			FileInputStream fis = new FileInputStream("C:\\Users\\vicky\\Desktop\\Create.properties");
			System.out.println("File Found");
			
			String username =rep.getProperty("username");
			System.out.println("UserName:"+username);
			String password =rep.getProperty("password");
			System.out.println("Password"+password);
			
	}

}
