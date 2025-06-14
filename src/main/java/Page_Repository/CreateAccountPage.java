package Page_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	@FindBy(xpath="//a[contains(text(),'Create an Account')]")
	private WebElement CreateAccount;
	@FindBy(id="firstname")
	private WebElement FirstName;
	@FindBy (id="lastname")
	private WebElement LastName;
	@FindBy (id="email_address")
	private WebElement EmailAdress;
	@FindBy (id="password")
	private WebElement Password;
	@FindBy (id="password-confirmation")
	private WebElement ConformNewPassword;
	@FindBy (xpath="//button[@title='Create an Account']")
	private WebElement SubmitElement;
	//initialization
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getCreateAccount() {
		return CreateAccount;
		
	}
	public WebElement getFirstName() {
		return FirstName;
		
	}
	public WebElement getLastName() {
		return LastName;
		
	}
	public WebElement getEmailAdress() {
		return EmailAdress;
		
	}
	public WebElement getPassword() {
		return Password;
		
	}
	public WebElement getConformNewPassword() {
		return ConformNewPassword;
		
	}
	
	public WebElement getSubmitElement() {
		return SubmitElement;
		
	}
	
}
