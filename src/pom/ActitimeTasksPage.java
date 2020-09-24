package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasksPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectLink;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newtaskLink;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importtaskfromcsvLink;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchTextfield;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addnewButton);
	}
	
	public void newcustomerMethod()
	{
		newcustomerLink.click();
	}
	
	public void newprojectMethod()
	{
		newprojectLink.click();
	}
	
	public void newtaskMethod()
	{
		newtaskLink.click();
	}
	
	public void importtaskfromcsvMethod()
	{
		importtaskfromcsvLink.click();
	}
	
	public void searchMethod()
	{
		searchTextfield.sendKeys("qspiders");
	}
}