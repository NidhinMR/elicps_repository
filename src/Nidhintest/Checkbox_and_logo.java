package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_and_logo {
	
	ChromeDriver driver;
	@Before
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
@Test
public void test() {
	
	driver.findElement(By.xpath("//*[@id="wrapper"]/table[1]/tbody/tr[1]/td[1]/img")).is
}
}
