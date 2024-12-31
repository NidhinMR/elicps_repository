package Nidhintest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testnov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="google123";
		if (actualtitle.equals(expectedtitle)){
			System.out.println("pass");}
			else {
				System.out.println("fail");
			
				
			}
				
		
		
		}
		

	}
	


