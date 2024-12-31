package Testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guruaction {
WebDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();

}

@BeforeMethod
public void open() {
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
}

@Test
public void test1() {
	
	WebElement A = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions sat=new Actions(driver) ;
	
	sat.contextClick(A);
	sat.perform();
	
	
	
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
	driver.switchTo().alert().accept();
	WebElement b = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	sat.doubleClick(b);
	sat.perform();
	driver.switchTo().alert().accept();
}

}
