package testpkg;



import org.testng.annotations.Test;

import basepkg.Saucebaseclass;
import pagepkg.Saucepage;
import utilities.Excelutilities;

public class Saucetest extends Saucebaseclass{
	@Test(priority = 0)
	public void testing() 
	{
		 Saucepage ob=new  Saucepage(driver);
		String xl="C:\\Users\\dell\\Desktop\\Sauceexcel.xlsx";
		String sheet="sheet1";
		int rowcount=Excelutilities.getrowcount(xl, sheet);
		
		for(int i=1;i<=rowcount;i++)
		{
			String usrnme=Excelutilities.gecellvalue(xl, sheet, i, 0);
			System.out.println("username"+usrnme);
			String pswd=Excelutilities.gecellvalue(xl, sheet, i, 1);
			System.out.println("password"+pswd);
			ob.setvalues(usrnme, pswd);
			ob.loginbutton();
			driver.navigate().refresh();
		}
	}
	@Test(priority = 1)
	public void test2() throws InterruptedException
		{
			
			Saucepage ob1=new  Saucepage(driver);
			Thread.sleep(2000);
		    ob1.addtocart();
		    Thread.sleep(2000);
		    ob1.addtocartclick();
			ob1.setvalues1("vishnu", "babu");
			ob1.setvalues2("686605");
			ob1.lastset();
			//driver.navigate().back();
			ob1.lasttest1();
			
			
		}
		
		
}


