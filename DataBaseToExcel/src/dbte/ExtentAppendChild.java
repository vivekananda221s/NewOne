package dbte;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentAppendChild {

	public static void main(String[] args)
	{
		
		ExtentReports report = new ExtentReports("F://newOne.html");
		ExtentTest test = report.startTest("Facebook login");
		
		ExtentTest parent  = report.startTest("Parent");
		parent.log(LogStatus.INFO, "Parent");
		
		
		ExtentTest child  = report.startTest("Child");
		parent.log(LogStatus.INFO, "Child");
	
		ExtentTest child1  = report.startTest("Child1");
		parent.log(LogStatus.INFO, "Child1");
		
		test.appendChild(parent).appendChild(child).appendChild(child1);
		
		report.endTest(parent);
		report.flush();
		
	}

}
