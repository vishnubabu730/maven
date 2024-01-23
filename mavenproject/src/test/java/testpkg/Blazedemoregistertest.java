package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Blazedemoregister;

public class Blazedemoregistertest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup1()
	{
		driver.get("https://blazedemo.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void testing()
	{
		Blazedemoregister ob=new Blazedemoregister(driver);
		ob.setvalues("vishnu", "vtech");
		ob.setvalues2("vishnu007@gmail.com");
		ob.setvalues3("vishnu123", "vishnu123");
		ob.buttonclick();
	}

}
