package dbte;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AdvanceExtentReports {

	public static void main(String[] args) throws IOException 
	{
		ExtentReports report = new ExtentReports("F://Viveklovelyy.html");
		ExtentTest test = report.startTest("Facebook_Login");
		
		System.setProperty("webdriver.chrome.driver", "F://DRIVERS//chromedriver.exe");
		
		test.log(LogStatus.INFO, "Driver Initiated");
		WebDriver call = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Initiated");
		call.manage().window().maximize();
		test.log(LogStatus.INFO, "Windox Maximized");
		call.get("https://facebook.com");
		test.log(LogStatus.INFO, "Facebook page loaded");
		
		FileUtils.copyFile(((TakesScreenshot)call).getScreenshotAs(OutputType.FILE),new File("V://viveknn.png"));
		
		test.log(LogStatus.FAIL,"Facebook Login Failed"+test.addScreenCapture("V://viveknn.png"));
		 report.endTest(test);
		report.flush();
	}

}
