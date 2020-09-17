package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="loginIDText")
	private WebElement UserName;
	
	@FindBy(id="passwordText")
	private WebElement PassWord;
	
	@FindBy(id="loginBtn")
	private WebElement LoginButton;
	
	//@FindBy(id=)
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUserName() {
		return UserName;
	}
	
	public void SetUserName(String User) {
		setText(UserName, User);
	}
	
	public WebElement getPassWord() {
		return PassWord;
	}
	
	public void SetPassWord(String Pass) {
		setText(PassWord, Pass);
	}
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	public void ClickLoginButton() {
		LoginButton.click();
	}

}
