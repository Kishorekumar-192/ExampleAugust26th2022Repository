package com.sgtesting.SeleniumPageObjectAssignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1onPageObject {
	public static WebDriver oBrowser=null;
	public static ActiTmePage oPage=null;
	public static void main(String[] args) {
		launchApplication();
		navigate();
		login();
		minimize();
		createuser();
		//logout();
		//closeApplication();

	}

	private static void launchApplication()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new  ActiTmePage(oBrowser);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");	
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimize()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try
		{
			oPage.getusers().click();
			Thread.sleep(2000);
			oPage.getadduser().click();
			Thread.sleep(3000);
			oPage.getfirstName().sendKeys("Ronaldo");
			oPage.getmiddleName().sendKeys("Football");
			oPage.getlastName().sendKeys("Christian");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
