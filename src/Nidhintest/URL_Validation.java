package Nidhintest;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Validation {
	
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void linkcount() throws Exception 
	{
		URL ob=new URL(baseurl);
		HttpURLConnection s=(HttpURLConnection)ob.openConnection();
		s.connect();
		if(s.getResponseCode()==200)
		{
			System.out.println("valid");
			
		}
		else {
			System.out.println("invalid");
			
		}
		
		
	}

}
