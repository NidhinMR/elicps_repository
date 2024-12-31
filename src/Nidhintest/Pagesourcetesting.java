package Nidhintest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcetesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		

		
		
		String expectedcontent="Gmail";
		
		
		if (pagesource.contains(expectedcontent)){
			System.out.println("pass");}
			else {
				System.out.println("fail");
		
		

	}

	}}
