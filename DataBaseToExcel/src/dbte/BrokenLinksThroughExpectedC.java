package dbte;

import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksThroughExpectedC {

	public static void main(String[] args) throws TimeoutException 
	{
		System.setProperty("webdriver.chrome.driver", "F://DRIVERS//chromedriver.exe");
		WebDriver call = new ChromeDriver();
		call.manage().window().maximize();
		
		call.get("C:\\Users\\vicky\\Desktop\\me.html");
		
		List<WebElement> allLinks = call.findElements(By.tagName("a"));
		
		for(int i = 0 ;i<allLinks.size();i++)
		{
			WebElement link = allLinks.get(i);
			boolean flag;
			try {
				
				new WebDriverWait(call, 10).until(ExpectedConditions.elementToBeClickable(link));
				flag = true;
			} catch (org.openqa.selenium.TimeoutException e)
			{
				flag = false;
			}
			if(flag)
			{
				System.out.println("VALID_LINK:"+link.getAttribute("href"));
			}
			else
			{
				System.out.println("InVALID_LINK:"+link.getAttribute("href"));
			}
		}
		

	}

}
