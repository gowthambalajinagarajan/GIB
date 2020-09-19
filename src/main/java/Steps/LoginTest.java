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
	
	@Then("^User click on Menu Page and Choose \"(.*?)\"$")
	public void user_click_on_Menu_Page_and_Choose(String arg1) throws Throwable {
	    lp.ClickMenu();
		lp.ClickCustomerManagement();
	    if(arg1.equals("Customer Master")) {
	    	lp.ClickCustomerMaster();
	    }
	}

	@Then("^User Select Approved Queue$")
	public void user_Select_Approved_Queue() throws Throwable {
	    lp.ClickQueue();
	}

	@Then("^User select \"(.*?)\" from Grid Column$")
	public void user_select_from_Grid_Column(String arg1) throws Throwable {
	    //lp.ClickGCIFID(arg1);
		//lp.getGCIFInput().sendKeys("12000088");
		//lp.getGCIF().click();
		lp.getSelectGCIF().click();
	}
	
	@When("^user select GCIF ID,its navigated to customer page and select Edit$")
	public void user_select_GCIF_ID_its_navigated_to_customer_page_and_select_Edit() throws Throwable {
	    lp.ClickEditButton();
	    lp.ClickProductService();
	    lp.getAdd9().click();
	    lp.getAdd8().click();
	    lp.getAdd6().click();
	    lp.getPartialFile().click();
	    lp.getSaveButton().click();
	    Assert.assertEquals(true, lp.getErrorMessage().isDisplayed());
	}
	
	@Then("^user select required mandatory field$")
	public void user_select_required_mandatory_field() throws Throwable {
	    lp.getPartialFile().click();
	    lp.SelectPartialFile();
	    lp.getFileLevel().click();
	    lp.SelectFileLevel();
	    lp.getDelegation().click();
	    lp.SelectDelegation();
	    lp.getCRN().click();
	    lp.getCorporateRegistration().sendKeys("111");
	    lp.getFileSize().sendKeys("5");
	    lp.getPreAuth().click();
	    lp.SelectPreAuth();
	    lp.getAliasing().click();
	    lp.SelectAliasing();
	}

	@Then("^user enter Remarks and click on save button$")
	public void user_enter_Remarks_and_click_on_save_button() throws Throwable {
	    lp.getMakerRemarks().clear();
		lp.getMakerRemarks().sendKeys("Maker");
	    lp.getSaveButton().click();
	    //Assert.assertEquals(true, lp.getSaveSuccessMessage().isDisplayed());
	}
}
