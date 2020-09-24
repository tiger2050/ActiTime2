package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeCreateNewCustomerPage;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.ActitimeTasksPage;

public class TESTActitimeCreateCustomer 
{
	@Test
	public void customer() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();

		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksPage task= new ActitimeTasksPage(driver);
		task.addnewMethod();
		task.newcustomerMethod();
		
		ActitimeCreateNewCustomerPage customer= new ActitimeCreateNewCustomerPage(driver);
		customer.entercustomernameMethod();
		customer.entercustomerdescriptionMethod();
		customer.createcustomerMethod();
		
		home.logoutMethod();
		
	}

}
