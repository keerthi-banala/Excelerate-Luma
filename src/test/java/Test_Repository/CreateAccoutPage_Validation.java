package Test_Repository;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page_Repository.CreateAccountPage;
import generic_Repository.Base_configuration;


public class CreateAccoutPage_Validation extends Base_configuration{
  
	@Test
	public void CreateAccount()
	{
		
		CreateAccountPage ca=new CreateAccountPage(driver);
		ca.getCreateAccount().click();
		ca.getFirstName().sendKeys("keerthi");
		ca.getLastName().sendKeys("banala");
		ca.getEmailAdress().sendKeys("klskeerthi.banala116@gmail.com");
		ca.getPassword().sendKeys("Keerthi@1234");
		ca.getConformNewPassword().sendKeys("Keerthi@1234");
		ca.getSubmitElement().click();
		
	}
}
