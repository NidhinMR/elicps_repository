package Nidhintest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	
	
	ChromeDriver driver;
	
	@Before
	
	public void setup() {
		
		
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	
	@Test
	public void Buttontestverify() {
		WebElement dayelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByValue("04");
		List<WebElement> li = day.getOptions();
		System.out.println(li.size());
		
		
	WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthelement);
	month.selectByValue("09");
	List<WebElement> monthli = month.getOptions();
	System.out.println(monthli.size());
	
	WebElement yearelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select year=new Select(yearelement);
	year.selectByValue("1995");
	List<WebElement> yearli = year.getOptions();
	System.out.println(yearli.size());
	
	
	}
	}
	


