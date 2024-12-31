import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
ChromeDriver driver;
	
	@Before
	public void Setup() {
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
	}
	@Test
	public void test1() {
		
		WebElement drg = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drp = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drg, drp).build().perform();
		
		
	}

}
