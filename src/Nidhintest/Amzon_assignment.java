package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzon_assignment {
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
	}
	
	@Test
	public void test() {
		
	
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();		
		driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("nidhi.mr@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		
		
		
	}
	}
	


