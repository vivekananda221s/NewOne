package dbte;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsEx {

	public static ExtentReports report;
	public static ExtentTest test;
	public static void main(String[] args) throws IOException 
	{
		report = new ExtentReports("V://EEEE.html");
		test = report.startTest("Broken Link Checking","Started").assignAuthor("Vivek").assignCategory("Reggession Testing");
				
		System.setProperty("webdriver.chrome.driver", "F://DRIVERS//chromedriver.exe");
		test.log(LogStatus.INFO,"Environment Setup");
		WebDriver call = new ChromeDriver();
		test.log(LogStatus.INFO,"Browser Intiation");
		call.manage().window().maximize();
		test.log(LogStatus.INFO,"Window Maximize");
		
		call.get("https://facebook.com");
		test.log(LogStatus.INFO,"Loading Page");
		
		
		List<WebElement> allLinks = call.findElements(By.tagName("a"));
		test.log(LogStatus.INFO,"Getting all links of the page"+test.addScreenCapture("F://vivekk.png"));
		
		for(int i = 0;i<allLinks.size();i++)
		{
			WebElement link = allLinks.get(i);
			test.log(LogStatus.INFO,"getting link");
			String url = link.getAttribute("href");
			test.log(LogStatus.INFO,"Checking link");
			CheckLink(url);
		}
		
		report.endTest(test);
		report.flush();
		
	}
	
	
	public static void CheckLink(String urll) throws IOException
	{
		URL url = new URL(urll);
		test.log(LogStatus.INFO,"URL ready to check");
		HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
		test.log(LogStatus.INFO,"Connection Establishing to the server");
		httpconnect.setConnectTimeout(5000);
		httpconnect.connect();
		
		test.log(LogStatus.INFO,"Connecting..");
		if(httpconnect.getResponseCode()==200)
		{
			test.log(LogStatus.PASS,"URL IS valid:"+url);
		}
		else
		{
			System.out.println(" "+url+"Is invalid");
			test.log(LogStatus.FAIL,"URL IS INVALID:"+url);
		}
		
		
	}

	}


