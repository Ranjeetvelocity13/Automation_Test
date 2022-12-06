package Com.internetbaning.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Com.internetbanking.BaseClass.BaseClass;
import Com.internetbanking.Pageobject.InternertBanking_addcutomerpage;
import Com.internetbanking.Pageobject.Internetbanking_LoginPage;
import Com.internetbanking.Pageobject.Internetbanking_NewAccount;
import net.bytebuddy.utility.RandomString;

public class TC_NewAccount_003 extends BaseClass  {
@Test
public void AddnewAccount() throws InterruptedException, IOException {
		
		Internetbanking_LoginPage LP = new Internetbanking_LoginPage();
		
		LP.Setusername(username);
		LP.SetPassword(password);
		LP.Clickbtn();
		
		Thread.sleep(3000);
		
		Internetbanking_NewAccount NewAccount = new Internetbanking_NewAccount();
		
		NewAccount.Account();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		NewAccount.Account();
		Thread.sleep(2000);

        NewAccount.Accountnumber("41986");
		Thread.sleep(2000);

		NewAccount.AccountDeposit("15000");
		Thread.sleep(2000);

		NewAccount.Submit();
		
		boolean Test=driver.findElement(By.xpath("//p[contains(text(),'Account Generated Successfully!!!')]")).isDisplayed();
		
		if(Test=true) {
			AssertJUnit.assertTrue(true);	
		
		}
		else {		
			
			//GetScreenshotAs("AddAccount");
			AssertJUnit.assertTrue(false);

		}
		
	}

}

