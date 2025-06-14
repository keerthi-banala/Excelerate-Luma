package Test_Repository;

import org.openqa.selenium.WebDriver;

import Page_Repository.SigninPage;

public class SigninPage_Validation {

	WebDriver driver;
	
	
	public void PerformSignin()
	{
		SigninPage sp=new SigninPage(driver);
		sp.getSignIn1().click();
		sp.getEmailid().sendKeys("klskeerthi.banala111@gmail.com");
		sp.getPassword().sendKeys("Keerthi@123");
		sp.getSignIn().click();
		
	}
}
