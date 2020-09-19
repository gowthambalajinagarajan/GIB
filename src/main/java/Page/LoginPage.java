package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="loginIDText")
	private WebElement UserName;
	
	@FindBy(id="passwordText")
	private WebElement PassWord;
	
	@FindBy(id="loginBtn")
	private WebElement LoginButton;
	
	@FindBy(id="logoImg")
	private WebElement Logo;
	
	@FindBy(id="nav-icon1")
	private WebElement Menu;
	
	@FindBy(xpath="(//*[@class=\"dropdown-toggle\"])[3]")
	private WebElement CustomerManagement;
	
	@FindBy(xpath="(//ul[@class='treeview-menu'])[3]/li[1]")
	private WebElement CustomerMaster;
	
	@FindBy(xpath="//*[@class=\"btn btnSelect k-popup\"]")
	private List<WebElement> Queue;
	
	@FindBy(xpath="//*[@class='k-link']")
	private WebElement GCIF;
	
	@FindBy(xpath="(//*[@class='k-input'])[1]")
	private WebElement GCIFInput;
	
	@FindBy(xpath="//*[@class='viewCust k-link']")
	private WebElement SelectGCIF;
	
	@FindBy(xpath="//*[@class=\"k-grid-content k-auto-scrollable\"]")
	private List<WebElement> Table;
	
	@FindBy(id="editCust")
	private WebElement EditButton;
	
	@FindBy(xpath="(//ul[@class='nav nav-tabs']/li)[4]")
	private WebElement ProductServices;
	
	@FindBy(id="Additional_9")
	private WebElement Add9;
	
	@FindBy(id="Additional_8")
	private WebElement Add8;
	
	@FindBy(id="Additional_6")
	private WebElement Add6;
	
	@FindBy(id="13_id")
	private WebElement PartialFile;
	
	@FindBy(id="14_id")
	private WebElement FileLevel;
	
	@FindBy(id="15_id")
	private WebElement Delegation;
	
	@FindBy(id="16_id")
	private WebElement CRN;
	
	@FindBy(id="17_id")
	private WebElement CorporateRegistration;
	
	@FindBy(id="29_id")
	private WebElement FileSize;
	
	@FindBy(id="30_id")
	private WebElement PreAuth;
	
	@FindBy(id="22_id")
	private WebElement Aliasing;
	
	@FindBy(id="remarks")
	private WebElement MakerRemarks;
	
	@FindBy(id="saveCustomer")
	private WebElement SaveButton;
	
	@FindBy(xpath="//*[@class='alert alert-danger']")
	private WebElement ErrorMessage;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement SaveSuccessMessage;
	
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
	
	public WebElement getLogo() {
		return Logo;
	}
	
	public void ClickMenu() {
		Menu.click();
	}
	
	public WebElement getCustomerManagement() {
		return CustomerManagement;
	}
	
	public void ClickCustomerManagement() {
		CustomerManagement.click();
	}
	
	public void ClickCustomerMaster() {
		CustomerMaster.click();
	}
	
	public WebElement getGCIF() {
		return GCIF;
	}
	
	public WebElement getGCIFInput() {
		return GCIFInput;
	}
	
	public WebElement getSelectGCIF() {
		return SelectGCIF;
	}
	
	public void ClickEditButton() {
		EditButton.click();
	}
	
	public void ClickProductService() {
		ProductServices.click();
	}
	
	public WebElement getAdd9() {
		return Add9;
	}

	public WebElement getAdd8() {
		return Add8;
	}

	public WebElement getAdd6() {
		return Add6;
	}
	
	public WebElement getPartialFile() {
		return PartialFile;
	}
	
	public WebElement getFileLevel() {
		return FileLevel;
	}
	
	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getErrorMessage() {
		return ErrorMessage;
	}
	
	public WebElement getSaveSuccessMessage() {
		return SaveSuccessMessage;
	}
	
	public void ClickQueue(){
		WebElement ele=driver.findElement(By.id("queue"));
		Select a=new Select(ele);
		a.selectByIndex(0);
		/*List<WebElement> list=a.getOptions();
			for(WebElement value:list) {
				//System.out.println(value.getText());
				if(value.getText().equals(input)) {
					value.click();
				}
		}*/
	}
	
	public void SelectPartialFile() {
		WebElement ele=driver.findElement(By.id("13_id"));
		Select a=new Select(ele);
		a.selectByValue("A");
	}
	
	public void SelectFileLevel() {
		WebElement ele=driver.findElement(By.id("14_id"));
		Select a=new Select(ele);
		a.selectByValue("H");
	}
	
	public void SelectDelegation() {
		WebElement ele=driver.findElement(By.id("15_id"));
		Select a=new Select(ele);
		a.selectByValue("A");
	}
	
	public void SelectPreAuth() {
		WebElement ele=driver.findElement(By.id("30_id"));
		Select a=new Select(ele);
		a.selectByValue("Y");
	}
	
	public WebElement getDelegation() {
		return Delegation;
	}

	public WebElement getCRN() {
		return CRN;
	}

	public WebElement getCorporateRegistration() {
		return CorporateRegistration;
	}

	public WebElement getFileSize() {
		return FileSize;
	}

	public WebElement getPreAuth() {
		return PreAuth;
	}

	public WebElement getAliasing() {
		return Aliasing;
	}

	public WebElement getMakerRemarks() {
		return MakerRemarks;
	}

	public void SelectAliasing() {
		WebElement ele=driver.findElement(By.id("22_id"));
		Select a=new Select(ele);
		a.selectByValue("A");
	}
	
	public void ClickGCIFID(String input){
		WebElement table=driver.findElement(By.xpath("//*[@class='k-grid-content k-auto-scrollable']"));
		List<WebElement> tablerow=table.findElements(By.xpath(".//tbody//tr"));
			for(WebElement row:tablerow) {
				List<WebElement> tabledata=row.findElements(By.xpath(".//td"));
				for(WebElement data:tabledata) {
					//System.out.println(data.getText());
					if(data.getText().equals(input)) {
						mouseover(data);
						data.findElement(By.xpath(".//*[@class='viewCust k-link']")).click();
					}
				}
			}
		
	}
	
	
}
