package Testng3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Add_excel {
	ChromeDriver driver;
	
	
	@BeforeClass
	public void setup() {

		driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void main() throws IOException {
	
		File f=new File("C:\\Users\\priya\\OneDrive\\Desktop\\nidhin\\passwrd");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i=1;i<=sh.getLastRowNum();i++) {
		XSSFRichTextString username = sh.getRow(i).getCell(0).getRichStringCellValue();
			System.out.println("username="+username);
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("username");
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			
			driver.findElement(By.className("login")).click();
			
		}
		
		
	}

}
