package com.sgtesting.SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment33 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		createUser1();
		createUser2();
		createUser3();
		logOut();
		loginUser1();
		logOutUser1();
		loginUser2();
		logOutUser2();
		loginUser3();
		logOutUser3();
		loginUser11();
		modification();
		logOutUser11();
		loginUser22();
		modification22();
		logOutUser22();
		loginUser33();
		modification33();
		logOutUser33();
		loginUser111();
		logOutUser111();
		loginUser222();
		logOutUser222();
		loginUser333();
		logOutUser333();
		loginAdmin();
		modification1();
		modification222();
		modification333();
		logOutAdmin();
		loginUser1111();
		logOutUser1111();
		loginUser2222();
		logOutUser2222();
		loginUser3333();
		logOutUser3333();
		loginAdmin1();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logOutAdmin1();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void minimizeFlyOutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]"))	.click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("yashavanth");
			oBrowser.findElement(By.name("middleName")).sendKeys("AR");
			oBrowser.findElement(By.name("lastName")).sendKeys("yash");
			oBrowser.findElement(By.name("email")).sendKeys("aryashavanth20@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("yashavanth");
			oBrowser.findElement(By.name("password")).sendKeys("yash123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div"))	.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]"))	.click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("abc");
			oBrowser.findElement(By.name("middleName")).sendKeys("A");
			oBrowser.findElement(By.name("lastName")).sendKeys("abc");
			oBrowser.findElement(By.name("email")).sendKeys("abc@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("abc");
			oBrowser.findElement(By.name("password")).sendKeys("abc123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div"))	.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]"))	.click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("xyz");
			oBrowser.findElement(By.name("middleName")).sendKeys("X");
			oBrowser.findElement(By.name("lastName")).sendKeys("xyz");
			oBrowser.findElement(By.name("email")).sendKeys("xyz@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("xyz");
			oBrowser.findElement(By.name("password")).sendKeys("xyz123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("xyz123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div"))	.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOut()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("yashavanth");
			oBrowser.findElement(By.name("pwd")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("abc");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("xyz");
			oBrowser.findElement(By.name("pwd")).sendKeys("xyz123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser3()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser11()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("yashavanth");
			oBrowser.findElement(By.name("pwd")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void modification()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//span[text()='yash, yashavanth AR.']")).click();
			oBrowser.findElement(By.name("password")).click();
			oBrowser.findElement(By.name("password")).sendKeys("abc123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutUser11()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser22()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("abc");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void modification22()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//span[text()='abc, abc A.']")).click();
			oBrowser.findElement(By.name("password")).click();
			oBrowser.findElement(By.name("password")).sendKeys("yash123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutUser22()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser33()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("xyz");
			oBrowser.findElement(By.name("pwd")).sendKeys("xyz123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void modification33()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//span[text()='xyz, xyz X.']")).click();
			oBrowser.findElement(By.name("password")).click();
			oBrowser.findElement(By.name("password")).sendKeys("abc123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutUser33()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser111()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("yashavanth");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser111()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser222()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("abc");
			oBrowser.findElement(By.name("pwd")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser222()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser333()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("xyz");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser333()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void modification1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//span[text()='yash, yashavanth AR.']")).click();
			oBrowser.findElement(By.name("password")).click();
			oBrowser.findElement(By.name("password")).sendKeys("yash123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modification222()
	{
		try
		{

			oBrowser.findElement(By.xpath("//span[text()='abc, abc A.']")).click();
			oBrowser.findElement(By.name("password")).click();
			oBrowser.findElement(By.name("password")).sendKeys("abc123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modification333()
	{
		try
		{

			oBrowser.findElement(By.xpath("//span[text()='xyz, xyz X.']")).click();
			oBrowser.findElement(By.name("password")).click();
			oBrowser.findElement(By.name("password")).sendKeys("xyz123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("xyz123");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser1111()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("yashavanth");
			oBrowser.findElement(By.name("pwd")).sendKeys("yash123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser1111()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser2222()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("abc");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser2222()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser3333()
	{
		try
		{
			oBrowser.findElement(By.id("username"))	.sendKeys("xyz");
			oBrowser.findElement(By.name("pwd")).sendKeys("xyz123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void logOutUser3333()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAdmin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//span[text()='yash, yashavanth AR.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='abc, abc A.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try
		{

			oBrowser.findElement(By.xpath("//span[text()='xyz, xyz X.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutAdmin1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
