package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_validation {
	
	
ChromeDriver driver;
	
	@Before
	public void setup() 
	{
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/priya/OneDrive/Desktop/webpage.html");
		
	}
	
	@Test
	public void test() {
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert A=driver.switchTo().alert();
	String s1=A.getText();
	String s2="Hello! I am an alert box!!";
	
	if(s1.equals(s2)) {
		
		System.out.println("pass");
	
	}
	else {
		System.out.println("fail");

	}
		A.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Nandana");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Prajesh Panicker");
		
	}

}
