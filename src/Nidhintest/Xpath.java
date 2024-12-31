package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {


ChromeDriver driver;
@Before public void setup() {
	
 driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
}

@Test
public void testing() {
	
	//driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
	//driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();

}
}
