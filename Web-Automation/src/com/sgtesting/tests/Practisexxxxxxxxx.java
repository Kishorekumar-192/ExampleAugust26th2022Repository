package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisexxxxxxxxx {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		relativeXPathUsingTagNameWithAttributeName();
		nameofLinksAvilable();
		

	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.get("https://www.youtube.com/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		try
		{
			//Find out numbers of Link Available
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			System.out.println("# of Links :"+linkscount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void nameofLinksAvilable()
	{
		try
		{
			//Display Link Names
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String linkname=link.getText();
				System.out.println(linkname);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	List<WebElement>oLinks=oBrowser.findElement("//a[@href]");
	int Linkscount=oLinks.size();
	System.out.println("# of links:"+Linkcount);
	
	List<WebElement>oLinks=oBrowser.findElement("//a[@href]");
	int Linkscount=oLinks.size();
	for(int i=0; i<oLinks.size();i++)
	{
		WebElement Link=oLinks.get(i);
		String Linkname=Link.getText();
		System.out.println(linkname);
	}
	
	
	
	
	
	
	
	
	
	
	
}

