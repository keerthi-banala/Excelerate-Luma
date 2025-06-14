package Page_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage
{
@FindBy(xpath="(//li[@class='authorization-link'])[1]")
private WebElement SignIn1;
@FindBy(id="email")
private WebElement Emailid;
@FindBy(id="pass")
private WebElement Password;
@FindBy(id="send2")
private WebElement SignIn;


//Initilization
public SigninPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getSignIn1() {
	return SignIn1;
	
}
public WebElement getEmailid() {
	return Emailid;
	
}
public WebElement getPassword() {
	return Password;
}
public WebElement getSignIn() {
	return SignIn;
	
}	
}
