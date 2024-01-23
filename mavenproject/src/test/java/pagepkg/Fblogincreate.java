package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogincreate {
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"email\"]")
	WebElement email;
	@FindBy (xpath = "//*[@id=\"pass\"]")
	WebElement password;
	@FindBy (xpath = "//*[@id=\"loginbutton\"]")
	WebElement login;
	
	public Fblogincreate (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setvaluestest1(String email1,String pswd)
	{
		email.clear();
		email.sendKeys(email1);
		password.clear();
		password.sendKeys(pswd);
	}
	
	public void test2()
	{
		login.click();
	}

}
