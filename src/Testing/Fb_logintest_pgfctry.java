package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fb_login_pgfactry;





public class Fb_logintest_pgfctry {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
	}
@BeforeMethod
public void url() {
	driver.get("https://www.facebook.com/");

}
@Test
public void testlogin()
{
	Fb_login_pgfactry ob=new Fb_login_pgfactry(driver);
	ob.setvalues("nidhinmr123@gmail.com","Nidhin@123");
	ob.login();
}

}
