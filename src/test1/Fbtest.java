package test1;

import org.testng.annotations.Test;

import Page1.Fbpage;
import basepkg.Baseclass;
import utilities.utilities;

public class Fbtest extends Baseclass{
@Test
public void veryfyLoginWithValidcred()

{
	Fbpage p1=new Fbpage(driver);
	//Reading the data from the excel file by specified path
	String x1="D:\\nidhi.xlsx";
	String sheet="Sheet1";
	int rowCount=utilities.getRowCount(x1,sheet);
	for(int i=1;i<=rowCount;i++)
{
	String UserName=utilities.getCellValue(x1,sheet,i,0);
	System.out.println("user name"+UserName);
	String Password=utilities.getCellValue(x1, sheet, i, 1);
	System.out.println("password---"+Password);
	//Passing Username and password as parameters
	//Submitting the data by clicking on login button
	
	// p1.setvalues("","");
	p1.setvalues(UserName,Password);
	p1.login();
}
	
}


}
