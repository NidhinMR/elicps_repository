package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_test {
	
	ChromeDriver driver;
	@Before
	public void fbsetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void fbtest() {
		
		driver.findElement(By.id("email")).sendKeys("9497214706");
		driver.findElement(By.id("pass")).sendKeys("Welcome#30");
		driver.findElement(By.name("login")).click();
		
		
	}

}
