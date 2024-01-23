package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fblogincreate;
import utilities.Excelutilities;

public class Fblogintest extends Baseclass{
	
	@Test
	public void setup1() throws InterruptedException
	{
		Fblogincreate ob=new Fblogincreate(driver);
		String xl="C:\\Users\\dell\\Desktop\\signup.xlsx";
		String sheet="sheet1";
		int rowcount=Excelutilities.getrowcount(xl, sheet);
		
		for(int i=1;i<=rowcount;i++)
		{
			String email1=Excelutilities.gecellvalue(xl, sheet, i, 0);
			System.out.println("username"+email1);
			String pswd=Excelutilities.gecellvalue(xl, sheet, i, 1);
			System.out.println("password"+pswd);
			Thread.sleep(3000);
			ob.setvaluestest1(email1, pswd);
			Thread.sleep(3000);
			ob.test2();
			driver.navigate().back();
		}
	}
	

}
