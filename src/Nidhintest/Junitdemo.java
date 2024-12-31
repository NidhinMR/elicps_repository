package Nidhintest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {


	@Before
	public void setup() {
		
	//driver = new ChromeDriver();
		System.out.println("browser open");
	}
	@Test
	public void test()
	{
	System.out.println("test activity");
	}
	@After
	public void close()
	{
		System.out.println("close browser");
	}
}
