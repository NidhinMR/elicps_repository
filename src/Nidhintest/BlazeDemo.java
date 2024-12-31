package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {
	ChromeDriver driver;
	
	@Before
	public void Blazesetup() {
		
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register.");
		
	}
	
	@Test
	public void Blazestest() 
		{
		driver.findElement(By.name("name")).sendKeys("Nandana");
		driver.findElement(By.id("company")).sendKeys("LISSA");
		driver.findElement(By.id("email")).sendKeys("nantu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("nantu@123");
		driver.findElement(By.id("password-confirm")).sendKeys("nantu@123");


		


		
		
		
		}

}
