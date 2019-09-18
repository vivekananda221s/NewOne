package dbte;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FaceBookLoginExtentReports {

	public static void main(String[] args) throws WebDriverException, IOException
	{
		ExtentReports report = new ExtentReports("V://FacebookLoginCheck.html");
		ExtentTest test =
				report.startTest("Facebook Login Check","With valid and With invalid");
		
		System.setProperty("webdriver.chrome.driver", "F://DRIVERS//chromedriver.exe");
		WebDriver call = new ChromeDriver();
		call.manage().window().maximize();
		
		call.get("https://facebook.com");
		
		ExtentTest test2 =
				report.startTest("Facebook Login Check With invalid");
		call.navigate().to("https://facebook.com");
		call.findElement(By.xpath("//*[@id='email']")).sendKeys("9440829612");
		test2.log(LogStatus.INFO, "Invalid Email Entered");
		call.findElement(By.xpath("//*[@id='pass']")).sendKeys("9440829612");
		test2.log(LogStatus.INFO, "Invalid Password entered");
		call.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
		test2.log(LogStatus.INFO, "Login Button Clicked");
		

		String title;
		title = call.getTitle();
		if(title.equals("Facebook"))
		{
			FileUtils.copyFile(((TakesScreenshot)call).getScreenshotAs(OutputType.FILE),new File("F://Passed.png"));
			test2.log(LogStatus.PASS,"Facebook Account Login Successful"+test2.addScreenCapture("F://Passed.png"));
		}
		else
		{
			FileUtils.copyFile(((TakesScreenshot)call).getScreenshotAs(OutputType.FILE),new File("F://Failed.png"));
			test2.log(LogStatus.FAIL, "Facebook Account Login Faied");
			
		}
		
		
		
		ExtentTest test1 =
				report.startTest("Facebook Login Check With valid");
		
		call.get("https://facebook.com");
		
		call.findElement(By.xpath("//*[@id='email']")).sendKeys("9440829612");
		test1.log(LogStatus.INFO, "Valid Email Entered");
		call.findElement(By.xpath("//*[@id='pass']")).sendKeys("luckyy");
		test1.log(LogStatus.INFO, "Valid Password entered");
		call.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();

		title = call.getTitle();
		if(title.equals("Facebook"))
		{
			FileUtils.copyFile(((TakesScreenshot)call).getScreenshotAs(OutputType.FILE),new File("F://Passed.png"));
			test1.log(LogStatus.PASS,"Facebook Account Login Successful"+test1.addScreenCapture("F://Passed.png"));
		}
		else
		{
			FileUtils.copyFile(((TakesScreenshot)call).getScreenshotAs(OutputType.FILE),new File("F://Failed.png"));
			test1.log(LogStatus.FAIL, "Facebook Account Login Faied");
			
		}
		
		// Appending
		
		test.appendChild(test1).appendChild(test2);
		
		report.endTest(test);
		
		report.flush();
	}

}
