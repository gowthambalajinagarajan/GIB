package Steps;

import org.junit.Assert;

import Page.LoginPage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class LoginTest {
	BasePage bp;
	LoginPage lp;
	
	public LoginTest() {
		bp=new BasePage();
		lp=new LoginPage();
	}
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
	    lp=new LoginPage();
	}

	@When("^User enters \"(.*?)\",\"(.*?)\"and user click on login button$")
	public void user_enters_and_user_click_on_login_button(String arg1, String arg2) throws Throwable {
	   lp.SetUserName(arg1);
	   lp.SetPassWord(arg2);
	   lp.ClickLoginButton();
	}

	@Then("^user should see Home Page$")
	public void user_should_see_Home_Page() throws Throwable {
	   Assert.assertTrue("Pass", lp.getURL().contains("Admin"));
	}


}
