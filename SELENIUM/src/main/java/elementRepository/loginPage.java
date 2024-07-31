package elementRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

	public loginPage(WebDriver driver) {
		super(driver);
	}	
		@FindBy(id ="Email")
		private WebElement emailTextBox;
		
		@FindBy(id = "Password")
		private WebElement PasswordTextBox;
		
		@FindBy(id = "RememberMe")
		private WebElement rememberMeCheckBox;
		
		@FindBy(partialLinkText = "Forgot Password")
		private WebElement forgotpassword;
		
		@FindBy(xpath = "//input[@value='Log in']")
		private WebElement loginButton;

		public WebElement getEmailTextBox() {
			return emailTextBox;
		}

		public WebElement getPasswordTextBox() {
			return PasswordTextBox;
		}

		public WebElement getRememberMeCheckBox() {
			return rememberMeCheckBox;
		}

		public WebElement getForgotpassword() {
			return forgotpassword;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
	}


