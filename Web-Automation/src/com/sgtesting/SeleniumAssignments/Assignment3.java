package com.sgtesting.SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createuser1();
		createuser2();
		createuser3();
		logoutfromAdmin();
		loginasuser1();
		logoutasuser1();
		ActiTime();
		loginasuser2();
		ActitimeAdvertisement();
		logoutasuser2();
		loginasuser3();
		ActitimeAdvertisement1();
		logoutasuser3();
		Loginasuser1();
		modifypassword();
		Logoutasuser1();
		Loginasuser2();
		Modifypassword2();
		Logoutasuser2();
		Loginasuser3();
		Modifypassword3();
		Logoutasuser3();
		LoginasUser1usingnewpasword();
		Logoutasuser11();
		LoginasUser2usingnewpasword();
		Logoutasuser22();
		LoginasUser2usingnewpasword();
		Logoutasuser33();
		loginasAdmin();
		ModifyPasswordforUser1User2User3();
		logoutasAdmin();
		LoginasUser1usingnewpasword111();
		logoutasuser111();
		LoginasUser2usingnewpasword2222();
		logoutasuser2222();
		LoginasUser3usingnewpasword3333();
		logoutuser3333();
		loginasAdmin99();
		DeleteUser1User2User3();
		logoutasAdmin99();


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
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Chetan");
			oBrowser.findElement(By.name("middleName")).sendKeys("Bhagat");
			oBrowser.findElement(By.name("lastName")).sendKeys("Singh");
			oBrowser.findElement(By.name("email")).sendKeys("User@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User6");
			oBrowser.findElement(By.name("password")).sendKeys("User123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Malik");
			oBrowser.findElement(By.name("middleName")).sendKeys("Hafeez");
			oBrowser.findElement(By.name("lastName")).sendKeys("Jadeja");
			oBrowser.findElement(By.name("email")).sendKeys("User@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User8");
			oBrowser.findElement(By.name("password")).sendKeys("User321");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User321");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Antony");
			oBrowser.findElement(By.name("middleName")).sendKeys("Akbar");
			oBrowser.findElement(By.name("lastName")).sendKeys("Amar");
			oBrowser.findElement(By.name("email")).sendKeys("User@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User9");
			oBrowser.findElement(By.name("password")).sendKeys("User321");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User321");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutfromAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User6");
			oBrowser.findElement(By.name("pwd")).sendKeys("User123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void ActiTime()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User8");
			oBrowser.findElement(By.name("pwd")).sendKeys("User321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void ActitimeAdvertisement()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User9");
			oBrowser.findElement(By.name("pwd")).sendKeys("User321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void ActitimeAdvertisement1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser3()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User6");
			oBrowser.findElement(By.name("pwd")).sendKeys("User123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifypassword()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User968");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User968");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Logoutasuser1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User8");
			oBrowser.findElement(By.name("pwd")).sendKeys("User321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	private static void Modifypassword2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User000");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User000");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logoutasuser2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Loginasuser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User9");
			oBrowser.findElement(By.name("pwd")).sendKeys("User321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Modifypassword3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Amar, Antony Akbar.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User99999");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User99999");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Logoutasuser3()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginasUser1usingnewpasword()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User6");
			oBrowser.findElement(By.name("pwd")).sendKeys("User968");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logoutasuser11()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginasUser2usingnewpasword()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User8");
			oBrowser.findElement(By.name("pwd")).sendKeys("User000");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logoutasuser22()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginasUser3usingnewpasword()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User9");
			oBrowser.findElement(By.name("pwd")).sendKeys("User99999");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logoutasuser33()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasAdmin()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifyPasswordforUser1User2User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User11111");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User11111");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User22222");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User22222");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Amar, Antony Akbar.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User33333");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User33333");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginasUser1usingnewpasword111()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User6");
			oBrowser.findElement(By.name("pwd")).sendKeys("User11111");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasuser111()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void LoginasUser2usingnewpasword2222()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User8");
			oBrowser.findElement(By.name("pwd")).sendKeys("User22222");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasuser2222()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginasUser3usingnewpasword3333()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User9");
			oBrowser.findElement(By.name("pwd")).sendKeys("User33333");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3333()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasAdmin99()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void DeleteUser1User2User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\\'userDataLightBox_deleteBtn\\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutasAdmin99()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
