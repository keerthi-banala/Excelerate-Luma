package generic_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_configuration {

	public WebDriver driver;
	@BeforeClass
	public void BrowserSetUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://magento.softwaretestingboard.com/");
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
}
