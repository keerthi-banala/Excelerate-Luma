package Test_Repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page_Repository.SignoutPage;

public class SignoutPage_Validation {
WebDriver driver;
@Test
 public void PerformSignOut()
 {
	SignoutPage so=new SignoutPage(driver);
	so.getSignIn1().click();
	so.getEmailid().sendKeys("klskeerthi.banala111@gmail.com");
	so.getPassword().sendKeys("Keerthi@123");
	so.getSignIn().click();
	so.getWelcome().click();
	so.getMyaccount().click();
	so.getSignOut().click();
 }
}
