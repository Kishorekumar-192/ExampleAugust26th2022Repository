package com.sgtesting.SeleniumPageObjectAssignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTmePage {

	public ActiTmePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//WebElement for User Name Text Field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//WebElement for Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	//WebElement for createuser link
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;
	public WebElement getusers() {
		return users;
	}
	//WebElement for createuser link
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;

	}
	//WebElement for createfirstname link
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	//WebElement for createmiddlename link
	private WebElement middleName;
	public WebElement getmiddleName()
	{
		return middleName;
	}
	//WebElement for createlastName link
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	//WebElement for createusername link
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	//WebElement for username link
	private WebElement username1;
	public WebElement getusername1();
	{
		return username1;
	}

}
