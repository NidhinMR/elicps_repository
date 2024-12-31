package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List {
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
		
		
	}
	
	@Test
	public void test() {
	
		java.util.List<WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println(li.size());
		
		for (WebElement link : li) {
			
			String s=link.getAttribute("href");
			String text=link.getText();
			System.out.println(s+ " - " + text); 
			
			
			} 
		  
	}

}
