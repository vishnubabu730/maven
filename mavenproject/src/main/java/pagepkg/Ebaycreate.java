package pagepkg;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ebaycreate {
	WebDriver driver;
	@FindBy (xpath = "//*[@id=\"gh-ac\"]")
	WebElement searchbutton;
	@FindBy (xpath = "//*[@id=\"gh-btn\"]")
	WebElement searchsubmit;
	@FindBy (xpath = "//*[@id=\"item2f8cdaa7d5\"]/div/div[2]/a/div/span")
	WebElement firsttoyclick;
	@FindBy (xpath = "//*[@id=\"x-msku__select-box-1000\"]")
	WebElement MPNdropdown;
	@FindBy (xpath = "//*[@id=\"mainContent\"]/div/div[8]/ul/li[2]/div/a/span/span")
	WebElement addtocart;
	@FindBy (xpath = "//*[@id=\"gf-l\"]/li[6]/a")
	WebElement policies;
	@FindBy (xpath = "//*[@id=\"gh-ug-flex\"]/a")
	WebElement registerclick;
	
	public Ebaycreate (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void test1(String search)
	{
		searchbutton.sendKeys(search);
	}
	public void test2()
	{
		searchsubmit.click();
		
	}
	public void toysdetails()
	{
		
		String parentwindow=driver.getWindowHandle();
		
		firsttoyclick.click();
		
//		Set<String>allwindowhandle=driver.getWindowHandles();
		
//		for (String handle : allwindowhandle)
//		{
//			if(!handle.equalsIgnoreCase(parentwindow))
//			{
//				driver.switchTo().window(handle);
//			}
//		}
		
	}
	public void test3dropdown()
	{
		for(String winhandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winhandle);
		}
		Select ob=new Select(MPNdropdown);
		ob.selectByValue("2");
	}
	public void test4()
	{
		addtocart.click();
		policies.click();
		
	}
	public void navback()
	{
		driver.navigate().to("https://www.ebay.com/");
	}
    public void click1()
    {
    	registerclick.click();
    }
}
