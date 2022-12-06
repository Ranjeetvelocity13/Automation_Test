package Com.internetbaning.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



import Com.internetbanking.BaseClass.BaseClass;
import Com.internetbanking.Pageobject.AddCustomerPage;
import Com.internetbanking.Pageobject.Internetbanking_LoginPage;
import net.bytebuddy.utility.RandomString;

public class NewCustomerTestCase extends BaseClass {
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		Internetbanking_LoginPage lp=new Internetbanking_LoginPage();
		
		lp.Setusername(username);
		
		lp.SetPassword(password);
		
		lp.Clickbtn();

		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		addcust.clickAddNewCustomer();
						
		addcust.custName("Ranjeet");
		addcust.custgender("male");
		addcust.custdob("13","05","1995");
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		Thread.sleep(3000);
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");
		String Random = RandomString.make(5);			
		String email=Random+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		
		boolean res = driver.getPageSource().contains("customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			
		}
		else
		{		
			getScreenshotAs("addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
}
