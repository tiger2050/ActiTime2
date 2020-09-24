package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;

	@FindBy(id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement forgotyourpasswordLink;

	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeinclink;

	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() 	
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginButton.click();
	}
	
	public void forgotyourpasswordMethod()
	{
		forgotyourpasswordLink.click();
	}
	
	public void actitimeincMethod()
	{
		actitimeinclink.click();
	}
	
	
	}
