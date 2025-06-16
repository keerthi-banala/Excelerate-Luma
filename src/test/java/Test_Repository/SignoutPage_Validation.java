package Test_Repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page_Repository.SigninPage;
import Page_Repository.SignoutPage;
import generic_Repository.Base_configuration;

public class SignoutPage_Validation extends Base_configuration{

@Test
 public void PerformSignOut()
 {
	SigninPage sp=new SigninPage(driver);
	sp.getSignIn1().click();
	sp.getEmailid().sendKeys("klskeerthi.banala116@gmail.com");
	sp.getPassword().sendKeys("Keerthi@1234");
	sp.getSignIn().click();
	SignoutPage so=new SignoutPage(driver);
	so.getWelcome().click();
	so.getSignOut().click();
 }
}
