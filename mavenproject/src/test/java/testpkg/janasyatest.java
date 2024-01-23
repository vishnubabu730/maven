package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.janasyacreate;

public class janasyatest {
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void set()
	{
		driver.get("https://janasya.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority = 2)
	public void setup1() throws InterruptedException
	{
		janasyacreate ob=new janasyacreate(driver);
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();
		Thread.sleep(1000);
		ob.test5();
		Thread.sleep(1000);
		
	}
	@Test(priority = 1)
	public void setup2() throws InterruptedException
	{
		janasyacreate ob=new janasyacreate(driver);
		ob.test6();
		Thread.sleep(1000);
		ob.test7();
		Thread.sleep(2000);
		ob.test8();
	}
	

}
