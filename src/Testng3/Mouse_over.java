package Testng3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mouse_over {
	ChromeDriver driver;
			
		
	@BeforeClass
	public void setup() {

		driver=new ChromeDriver();	
		driver.get("https://www.ebay.com");
	}
	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		WebElement smart = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		smart.click();
	}
}
