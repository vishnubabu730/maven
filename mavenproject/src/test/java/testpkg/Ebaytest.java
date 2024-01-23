package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Ebaycreate;

public class Ebaytest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup1()
	{
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void testing() throws InterruptedException
	{
		Ebaycreate ob=new Ebaycreate(driver);
		ob.test1("toys");
		ob.test2();
		Thread.sleep(3000);
		ob.toysdetails();
		ob.test3dropdown();
		ob.test4();
		ob.navback();
		ob.click1();
	}

}
