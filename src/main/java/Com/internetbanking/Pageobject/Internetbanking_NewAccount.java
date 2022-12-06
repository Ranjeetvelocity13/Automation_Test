package Com.internetbanking.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.internetbanking.BaseClass.BaseClass;

public class Internetbanking_NewAccount extends BaseClass {

	public Internetbanking_NewAccount() {

		PageFactory.initElements(driver, this);
	}
	
	//2.
	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	WebElement Newaccount;
	
    @FindBy(name = "cusid")
    WebElement CustomerID;
    
    @FindBy(name = "inideposit")
    WebElement Deposit;
    
    @FindBy(name = "button2")
    WebElement Submitbutton;
    
    
   public void Account() {
	   Newaccount.click();
   }
   
   public void Accountnumber(String Number) {
	   CustomerID.sendKeys(Number);
   }
   
   public void AccountDeposit(String value) {
	   Deposit.sendKeys(value);
   }
   public void Submit() {
	   Submitbutton.click();
   }
}
