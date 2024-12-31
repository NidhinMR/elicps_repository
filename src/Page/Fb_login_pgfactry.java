package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login_pgfactry {
	WebDriver driver;
	@FindBy(id="email") WebElement fbmail;
	@FindBy(id="pass")
	WebElement fbpassword;
	WebElement Fblogin;
	
	public Fb_login_pgfactry(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void setvalues(String email,String password)
	{
		fbmail.sendKeys(email);
		fbpassword.sendKeys(password);
	}
		public void login()
		{
			Fblogin.click();
		}
	}

