package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class freshtohomecreate {
	WebDriver driver;
	
	@FindBy (xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div[5]/div[1]/a")
	WebElement loginicon;
	@FindBy (xpath = "//*[@id=\"youama-phone\"]")
	WebElement numberenter;
	@FindBy (xpath = "//*[@id=\"sendOtpBtn\"]")
	WebElement sendotp;
	@FindBy (xpath = "//*[@id=\"youama-loginotp\"]")
	WebElement otpenter;
	@FindBy (xpath = "//*[@id=\"otpLoginBtn\"]")
	WebElement continuebutton;
	
	public freshtohomecreate (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logintest()
	{
		
	}

}
