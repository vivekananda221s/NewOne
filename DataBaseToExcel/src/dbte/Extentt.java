package dbte;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentt
{
	public static void main(String x[])
	{
		ExtentReports report = new ExtentReports("V://new.html");
		
		ExtentTest first1 = report.startTest("All Facebook Tests");
		
		ExtentTest first = report.startTest("Facebook1");
		first.log(LogStatus.FAIL, "Login Failed");
		
		
		ExtentTest second = report.startTest("Facebook2");
		second.log(LogStatus.INFO, "Just Info");
		
		
		ExtentTest thrid = report.startTest("Facebook3");
		thrid.log(LogStatus.INFO, "Just Info");
		
		
		ExtentTest forth = report.startTest("Facebook4");
		forth.log(LogStatus.FAIL, "Logout Failed");


		first1.appendChild(first).appendChild(second).appendChild(thrid).appendChild(forth);
		
		report.endTest(first1);
		
		report.flush();
	}
}
