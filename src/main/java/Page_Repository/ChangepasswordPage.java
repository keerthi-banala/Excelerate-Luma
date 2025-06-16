
	package Page_Repository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ChangepasswordPage 
	{
		//Declartion
		
		@FindBy(xpath="(//li[@class='authorization-link'])[1]")
		private WebElement SignIn1;
		@FindBy(id="email")
		private WebElement Emailid;
		@FindBy(id="pass")
		private WebElement Password;
		@FindBy(id="send2")
		private WebElement SignIn;
		
		@FindBy(xpath="(//button[@class=\"action switch\"])[1]")
		private WebElement Welcome;
		@FindBy(xpath="//a[text()='My Account']")
		private WebElement Myaccount; 
		//--------------------------
	@FindBy(xpath=("//a[@class='action change-password']"))
	private WebElement changepass;
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement Currentpassword;
	@FindBy(id="password")
	private WebElement NewPassword;
	@FindBy(id="password-confirmation")
	private WebElement ConFormPassword;
	@FindBy(xpath=("//button[@class='action save primary']"))
	private WebElement SaveButton;

	//Intialization

	public ChangepasswordPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	//utilization
	
	
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
	public WebElement getWelcome() {
		return Welcome;
		
	}
	public WebElement getMyaccount() {
		return Myaccount;
	}

	//-------------------------
	

	public WebElement getchangepass() {
		return changepass;
		
	}
	public WebElement  getcurrentpassword()
	{
		return Currentpassword;
	}
	public WebElement getNewPassword() {
		return NewPassword;
		
	}
	public WebElement getConFormPassword() {
		return ConFormPassword;
	}

	public WebElement getSaveButton() {
		return SaveButton;
		
	}


	}

