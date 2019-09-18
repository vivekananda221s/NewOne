package dbte;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main(String ar[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F://DRIVERS//chromedriver.exe");
		WebDriver call = new ChromeDriver();
		call.manage().window().maximize();
		
		call.get("https://facebook.com");
		
		List<WebElement> allLinks = call.findElements(By.tagName("a"));
		
		for(int i = 0;i<allLinks.size();i++)
		{
			WebElement link = allLinks.get(i);
			String url = link.getAttribute("href");
			CheckLink(url);
		}
		
		
	}
	
	
	public static void CheckLink(String urll) throws IOException
	{
		URL url = new URL(urll);
		HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
		httpconnect.setConnectTimeout(5000);
		httpconnect.connect();
		
		if(httpconnect.getResponseCode()==200)
		{
			System.out.println(" "+url+":Is valid");
		}
		else
		{
			System.out.println(" "+url+":Is invalid");
		}
		
		
	}

}
