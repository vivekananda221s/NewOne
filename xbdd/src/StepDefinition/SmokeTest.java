package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest 
{
WebDriver driver;
	
	@Given("^Open chrome browser and start the application$")
	public void Open_chrome_browser_and_start_the_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vicky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize();
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_user_name_and_password(String user_name,String password) throws Throwable 
	{
	   driver.findElement(By.id("email")).sendKeys(user_name);
	   driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^User should logon to facebook_home$")
	public void User_should_logon_to_facebook_home() throws Throwable
	{
		 driver.findElement(By.id("u_0_a")).click();
	}

}
