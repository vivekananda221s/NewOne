package dbte;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool;
public class CheckPoints
{
	public static void main(String x[]) throws IOException, AWTException, InterruptedException, FindFailed
	{
		ChromeDriver call = new ChromeDriver();
		
		List <WebElement> links = call.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL urll = new URL(url); 
			HttpsURLConnection connection = (HttpsURLConnection)urll.openConnection();
			connection.setConnectTimeout(5000);
			connection.connect();
			
			if(connection.getResponseCode()==200)
			{
				System.out.println("Valid link");
			}
			else
			{
				System.out.print("invalid link");
			}
		}
		
		
	}

}
