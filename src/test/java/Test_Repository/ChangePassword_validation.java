package Test_Repository;

import org.openqa.selenium.WebDriver;

import Page_Repository.ChangepasswordPage;
import generic_Repository.Base_configuration;

public class ChangePassword_validation extends Base_configuration {
    WebDriver driver;
	public void changepassoerd()
	{
		ChangepasswordPage cp=new ChangepasswordPage(driver);
		cp.getSignIn1().click();
		cp.getEmailid().sendKeys("klskeerthi.banala111@gmail.com");
		cp.getPassword().sendKeys("Keerthi@123");
		cp.getSignIn().click();
		cp.getWelcome().click();
		cp.getMyaccount().click();
		cp.getchangepass().sendKeys("Keerthi@123");
		cp.getNewPassword().sendKeys("Keerthi@1234");
		cp.getConFormPassword().sendKeys("Keerthi@1234");
		cp.getSaveButton().click();
	}
}
