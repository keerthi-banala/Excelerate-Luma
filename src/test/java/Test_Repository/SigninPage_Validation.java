package Test_Repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page_Repository.SigninPage;
import generic_Repository.Base_configuration;

public class SigninPage_Validation extends Base_configuration {

	WebDriver driver;
	
	@Test
	public void PerformSignin()
	{
		SigninPage sp=new SigninPage(driver);
		sp.getSignIn1().click();
		sp.getEmailid().sendKeys("klskeerthi.banala111@gmail.com");
		sp.getPassword().sendKeys("Keerthi@123");
		sp.getSignIn().click();
		
	}
}
