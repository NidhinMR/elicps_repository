package Nidhintest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelink_validation {
	
	ChromeDriver driver;
	String baseurl="https://www.google.com";
@Before
	
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get(baseurl);
	}

@Test
public void test()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	
	for (WebElement s:li) {
		
		String link=s.getAttribute("href");
		verify(link);
	}
}
	
	
	@Test
	public void verify(String link)
	{
		try {
		
		URL ob=new URL(link);
		HttpURLConnection s=(HttpURLConnection)ob.openConnection();
		s.connect();
		if(s.getResponseCode()==200)
			
		{
			System.out.println("valid---"+link);
			
		}
		else if (s.getResponseCode()==404) {
		
		
			System.out.println("broken link---"+link);
			
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}	
		}
