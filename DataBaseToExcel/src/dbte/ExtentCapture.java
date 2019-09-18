package dbte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentCapture {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F://DRIVERS//chromedriver.exe");
		WebDriver call = new ChromeDriver();
		call.manage().window().maximize();
		
		call.get("https://facebook.com");
		
		ExtentReports report = new ExtentReports("F://newOne1.html");
		ExtentTest test = report.startTest("Appending");
		test.log(LogStatus.INFO,"Facebook homepage"+test.addScreenCapture("E://vivek"));
		
		report.endTest(test);
		
		report.flush();

	}

}
