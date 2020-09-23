package Steps;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Keys;

import Page.ApprovePage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class ApproveTest extends BasePage{
	BasePage bp;
	ApprovePage ap;
	
	public ApproveTest() {
		bp=new BasePage();
		ap=new ApprovePage();
	}
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
	    ap=new ApprovePage();
	}

	@When("^User enters \"(.*?)\",\"(.*?)\"and user click on login button$")
	public void user_enters_and_user_click_on_login_button(String arg1, String arg2) throws Throwable {
	   ap.SetUserName(arg1);
	   ap.SetPassWord(arg2);
	   ap.ClickLoginButton();
	}

	@Then("^user should see Home Page$")
	public void user_should_see_Home_Page() throws Throwable {
	   Assert.assertTrue("Pass", ap.getURL().contains("Admin"));
	}
	
	@Then("^User click on Menu Page and Choose \"(.*?)\"$")
	public void user_click_on_Menu_Page_and_Choose(String arg1) throws Throwable {
	    ap.ClickMenu();
		ap.ClickCustomerManagement();
	    if(arg1.equals("Customer Master")) {
	    	ap.ClickCustomerMaster();
	    }
	}

	@Then("^User Select Approved Queue$")
	public void user_Select_Approved_Queue() throws Throwable {
	    ap.ClickQueue();
	}

	@Then("^User select \"(.*?)\" from Grid Column$")
	public void user_select_from_Grid_Column(String arg1) throws Throwable {
	    //ap.ClickGCIFID(arg1);
		//ap.getGCIFInput().sendKeys("12000088");
		//ap.getGCIF().click();
		ap.getSelectGCIF().click();
	}
	
	@When("^user select GCIF ID,its navigated to customer page and select Edit$")
	public void user_select_GCIF_ID_its_navigated_to_customer_page_and_select_Edit() throws Throwable {
	    ap.ClickEditButton();
	    ap.ClickProductService();
	    ap.getAdd9().click();
	    ap.getAdd8().click();
	    ap.getAdd6().click();
	    ap.getPartialFile().click();
	    ap.getSaveButton().click();
	    Assert.assertTrue("Pass", ap.getErrorMessage().contains("Please"));
	    System.out.println("Negative--->"+ap.getErrorMessage());
	    ap.screenShot();
	}
	
	@Then("^user select required mandatory field$")
	public void user_select_required_mandatory_field() throws Throwable {
	    ap.getPartialFile().click();
	    ap.SelectPartialFile();
	    ap.getFileLevel().click();
	    ap.SelectFileLevel();
	    ap.getDelegation().click();
	    ap.SelectDelegation();
	    ap.getCRN().click();
	    ap.getCorporateRegistration().sendKeys("111");
	    ap.getFileSize().sendKeys("5");
	    ap.getPreAuth().click();
	    ap.SelectPreAuth();
	    ap.getAliasing().click();
	    ap.SelectAliasing();
	}
	
	@Then("^user enter Remarks and click on submit button$")
	public void user_enter_Remarks_and_click_on_submit_button() throws Throwable {
		 ap.getMakerRemarks().clear();
			ap.getMakerRemarks().sendKeys("Maker");
		    //ap.getSaveButton().click();
			ap.ClickSubmitButton();
			ap.screenShot();
			Thread.sleep(3000);
		    Assert.assertTrue("Pass", ap.getSaveSubmitMessage().contains("sent for approval"));
		    System.out.println("Positive--->"+ap.getSaveSubmitMessage());
		    ap.ClickBack();
			//ap.ClickMenu();
			//ap.getMenuButton().click();
	}
	
	@Then("^User Logout the application$")
	public void user_Logout_the_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ap=new ApprovePage();
	    ap.ClickMenu();
		ap.getLogout().click();
	}

	@When("^User enters another \"(.*?)\",\"(.*?)\"and user click on login button$")
	public void user_enters_another_and_user_click_on_login_button(String arg1, String arg2) throws Throwable {
	    ap.SetUserName(arg1);
	    ap.SetPassWord(arg2);
	    ap.ClickLoginButton();
	}
	
	@Then("^user select Pending for Approval button and select \"(.*?)\" from Grid Column$")
	public void user_select_Pending_for_Approval_button_and_select_from_Grid_Column(String arg1) throws Throwable {
		ap.getPendingForApproval().click();
	    ap.getGCIFInput().sendKeys("12000088");
	    ap.getGCIFInput().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	    ap.getSelectGCIF().click();
	}
	
	@Then("^user select Approve button and click yes in Confirmation$")
	public void user_select_Approve_button_and_click_yes_in_Confirmation() throws Throwable {
	    ap.getApproveButton().click();
	    ap.getConfirmationYes().click();
	    Assert.assertTrue("Pass", ap.getApproveSuccess().contains("successfully approved"));
	    System.out.println("Positive--->"+ap.getApproveSuccess());
	    ap.getBackButton().click();
	}
	
}
