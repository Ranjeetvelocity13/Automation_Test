package Com.internetbanking.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {


	public AddCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")	
	WebElement lnkAddNewCustomer;

	@FindBy(xpath = "//input[@name=\"name\"]")
	WebElement txtCustomerName;

	@FindBy(xpath = "//input[@type=\"radio\"]")
	@CacheLookup
	WebElement rdGender;

	@FindBy(name = "dob")
	WebElement txtdob;


	@FindBy(name="addr")
	WebElement txtaddress;

	
	@FindBy(name="city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(name="state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(name = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(name = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(name =  "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(name = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(name =  "sub")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//span[@class=\"ns-offhd-e-16\"]")
	WebElement Closebutton;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
			
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(cpinno);
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void Closepopup() {
		Closebutton.click();
	}
	public void custsubmit() {
		btnSubmit.click();
	}
	
	
	
}
