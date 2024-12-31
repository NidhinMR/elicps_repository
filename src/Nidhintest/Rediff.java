package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rediff {
	
	ChromeDriver driver;
	@Before public void setup() {
		
		 driver = new ChromeDriver();
			
			driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void testing() {
		
	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Nidhin");
	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("nidhin@gmail.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("Nidhin@123");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("Nidhin@123");
		driver.findElement(By.xpath("//div[@id='div_altemail']/table/tbody/tr/td[3]/input")).sendKeys("nidhinnithu@gmail.com");
	}

	
}
