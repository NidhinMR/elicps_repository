package Nidhintest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasyatest {
		
		ChromeDriver driver;
		@Before public void setup() {
			
	     driver = new ChromeDriver();
			
			driver.get("https://www.janasya.com");
			}
			
		@Test
		public void testing() {
			String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			
			String expected="Janasya";
			
			if (actualtitle.equals(expected)){
				System.out.println("pass");
				}
				else {
					System.out.println("fail");
		}
		}
			@Test
			public void testing2() {
				String pagesource=driver.getPageSource();
				System.out.println(pagesource);
				
				String expected="mobile";
				
				if (pagesource.contains(expected)){
					System.out.println("pass");
					}
					else {
						System.out.println("fail");
			}
			
			}
	}

