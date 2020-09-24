package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateNewCustomerPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextarea;
	
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;

	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercustomernameMethod()
	{
		entercustomernameTextfield.sendKeys("qspiders");
	}
	
	public void entercustomerdescriptionMethod()
	{
		entercustomerdescriptionTextarea.sendKeys("qspiders is a training institute");
	}
	
	public void createcustomerMethod()
	{
		createcustomerButton.click();
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}
	
	public void okpopupMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void cancelpopupMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
}