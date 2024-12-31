package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fblogin;

public class Fblogintest {
	
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
	Fblogin ob=new Fblogin(driver);
	ob.setvalues("nidhin@gmail.com","Nidhin@123");
	ob.login();
}

}
