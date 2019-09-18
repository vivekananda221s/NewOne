package dbte;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class NewTest 
{
	ExtentReports report;
	ExtentTest all,test,test1,test2,test3;
	WebDriver driver;
	int i=0;
 
  @BeforeSuite
  public void beforeSuite() 
  {
	  report = new ExtentReports("V://facebooklinkscheck.html");
	  all = report.startTest("All FACEBOOK LINKS CHECK");
	  test = report.startTest("FACEBOOK LINKS CHECK");
	  System.setProperty("webdriver.chrome.driver","F://DRIVERS//chromedriver.exe");
	  driver = new ChromeDriver();
	  test.log(LogStatus.INFO,"Browser Initiated");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  driver.get("https://facebook.com");
	  test.log(LogStatus.INFO,"Facebook Page Loaded");
  }

  @Test
  public void Messanger() throws WebDriverException, IOException
  {
	  
	  test.log(LogStatus.INFO,"Clicking on Messanger Link");
	  driver.findElement(By.xpath("//*[.='Messanger']")).click();
	  test.log(LogStatus.INFO,"Messanger Page Loaded");
	  
	  FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("V://Messanger.png"));
	
  }
  @AfterMethod
  public void AfterMethod(ITestResult result) throws WebDriverException, IOException
  {
	  ExtentTest testing=null;
	switch (result.getMethod().getMethodName())
	{
	case "Messanger":
		testing = test;
		break;
case "Instagram":
	testing = test1;
		break;
case "Facebook_Lite":
	testing = test2;
	break;
case "signup":
	testing = test3;
	break;

	default:
		break;
	}
	 
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("F://X"+i+".png"));
		  
		  testing.log(LogStatus.FAIL,"fail captured"+test.addScreenCapture("F://X"+i+".png"));
	  }
  }
  
  @Test
  public void Instagram() throws WebDriverException, IOException
  {
	  test1 = report.startTest("Instagram");
	  test1.log(LogStatus.INFO,"Clicking on Instagram Link");
	  driver.findElement(By.xpath("//*[.='Instagram']")).click();
	  test1.log(LogStatus.INFO,"Instagram Page Loaded");
	  
	  FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("V://Instagram.png"));
	
  }
  @Test
  public void Facebook_Lite() throws WebDriverException, IOException
  {
	  test2 = report.startTest("Facebook Lite");
	  test2.log(LogStatus.INFO,"Clicking on Facebook Lite Link");
	  driver.findElement(By.xpath("//*[.='Facebook Lite']")).click();
	  test2.log(LogStatus.INFO,"Facebook Lite Page Loaded");
	  
	  FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("V://Facebook_Lite.png"));
	
  }
  @Test
  public void signup() throws WebDriverException, IOException
  {
	  test3 = report.startTest("Facebook Lite");
	  test3.log(LogStatus.INFO,"Clicking on Messanger Link");
	  driver.findElement(By.xpath("//*[.='Messanger']")).click();
	  test.log(LogStatus.INFO,"Messanger Page Loaded");
	  FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("V://Messanger1.png"));
	  Assert.assertTrue(false);
	
	 
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException
  {
	 all.appendChild(test).appendChild(test1).appendChild(test2).appendChild(test3);
	 report.endTest(all);
	  report.flush();
	  Thread.sleep(5000);
	  driver.quit();
  }

}
