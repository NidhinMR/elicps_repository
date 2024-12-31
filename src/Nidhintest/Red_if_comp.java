package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_if_comp {
	
	ChromeDriver driver;
	@Before
	
public void setup(){
		
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			
		}
		
		@Test
		
		public void test() {
			
			WebElement button = driver.findElement(By.id("Register"));
			String s1=button.getAttribute("value");
			String expected="Create my account >>";
			if(s1.equals(expected)) {
				System.out.println("pass");
				}
				else 
				{
					System.out.println("fail");
			}
			
			
			
		}
		
		
	}
	


