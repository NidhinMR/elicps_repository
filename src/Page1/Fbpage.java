package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbpage {
	WebDriver driver;
	By fbmail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbpage(WebDriver driver) {
		this.driver=driver;
	
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbmail).clear();
		driver.findElement(fbmail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(password);
		
		
	}
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}
}


