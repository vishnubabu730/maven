package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazedemoregister {
	WebDriver driver;
	
	
	@FindBy (xpath = "//*[@id=\"name\"]")
	WebElement name;
	@FindBy (xpath = "//*[@id=\"company\"]")
	WebElement company;
	@FindBy (xpath = "//*[@id=\"email\"]")
	WebElement email;
	@FindBy (xpath = "//*[@id=\"password\"]")
	WebElement password;
	@FindBy (xpath = "//*[@id=\"password-confirm\"]")
	WebElement confirmpass;
	@FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement registerbutton;
	
	public Blazedemoregister (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setvalues(String name1,String company1 )
	{
		 name.sendKeys(name1);
		 company.sendKeys(company1);
	}
	public void setvalues2(String email1)
	{
		email.sendKeys(email1);
	}
	public void setvalues3(String pswrd1,String confrm1)
	{
		password.sendKeys(pswrd1);
		confirmpass.sendKeys(confrm1);
	}
	public void buttonclick()
	{
		registerbutton.click();
	}


}
