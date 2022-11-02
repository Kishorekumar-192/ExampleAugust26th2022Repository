package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractceProblem2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchApplicaton();
		navigate();
		login();
		something();

	}

	private static void launchApplicaton()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.amazon.in/");
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
			oBrowser.findElement(By.className("nav-a")).click();
			oBrowser.findElement(By.className("//*[@id=\'s-refinements\']/div[1]/ul/li[4]/span/a/span"));
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void something()
	{
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
