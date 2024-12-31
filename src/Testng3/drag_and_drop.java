package Testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class drag_and_drop {
ChromeDriver driver;
	
	@BeforeClass
	public void Setup() {
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
	}
	@Test
	public void test1() {
		
		WebElement drg = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drp = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.dragAndDrop(drg, drp).perform();
		
		String text=drp.getText();
		if(text.contentEquals("Dropped")) {
			System.out.println("dropped");
			
		}
		
		else {
			System.out.println("not expected");
		}
	}

}

