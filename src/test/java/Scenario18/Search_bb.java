package Scenario18;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Search_bb {
	
	public Process process;
	public AppiumDriver driver;
	
	@Before
	public void Start_Server() throws IOException, InterruptedException
	{
		String Start_Server="D:\\Appium\\node.exe  D:\\Appium\\node_modules\\appium\\bin\\appium.js";
		process = Runtime.getRuntime().exec(Start_Server);
		
		if(process!= null)
		{
			System.out.println("Started the Appium Server");
		}
		else
		{
			System.out.println("NOT started");
		}
		
		Thread.sleep(12000);
		//*********************************
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");		
		
		capabilities.setCapability("appPackage","com.bigbasket.mobileapp");
		capabilities.setCapability("appActivity","com.bigbasket.mobileapp.activity.SplashActivity");
		
		
		 driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(3000);
		
	}
	
	
	@Given("^I enter the search item ([^\"]*)$")
	public void Enter_Search(String str)
	{
		if(str.equals("Rice"))
		{
			driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
			driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys(str +"\n");
		}
		if(str.equals("##"))
		{
			driver.findElementById("com.bigbasket.mobileapp:id/productPageSearchBox").click();
			driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys(str +"\n");
			
		}
		
	}
	
	@When("^I logged in as a user$")
	public void Validate_Login()
	{
		System.out.println("Valid user logged in");
		
	}
	
	@Then("^I get the Valid result ([^\"]*)$")
	public void Valid_Search(String Exp_Result)
	{
		String Output = driver.findElementById("com.bigbasket.mobileapp:id/txtProductCount").getText();
		String Actual_Result = Output.replace(" products", "");
		if(Actual_Result.equals(Exp_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	
	
	@Then("^I get the msg ([^\"]*)$")
	public void testInvalidsearch(String Exp_Result)
	{
		String Actual_Result = driver.findElementById("com.bigbasket.mobileapp:id/txtEmptyMsg1").getText();
		
		
		if(Actual_Result.equals(Exp_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	
	@After
	public void Stop_Server() throws InterruptedException
	{
		//stop server
		if(process!=null)
		{
			process.destroy();
			Thread.sleep(4000);
			System.out.println("Stopped the Appium Server");
			
		}
		
				
	}
	

}
