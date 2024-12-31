package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	
	
	ChromeDriver driver;
	@Before public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	
	}
	
	@Test public void test() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9497214706");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Nidhin1235");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		
	}
	
}
