package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHomePage
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timetrackLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void timetrackMethod()
	{
		timetrackLink.click();
	}
	
	public void tasksMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", tasksLink);
		
	}
	
	public void reportsMethod()
	{
		reportsLink.click();
	}
	
	public void usersMethod()
	{
		usersLink.click();
	}
	
	public void calenderMethod()
	{
		calendersLink.click();
	}
	
	public void settingsMethod()
	{ 
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		settingsLink.click();
	}
	
	public void integrationsMethod()
	{
		integrationsLink.click();
	}
	
	public void helpandsupportMethod()
	{
		helpandsupportLink.click();
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}
}