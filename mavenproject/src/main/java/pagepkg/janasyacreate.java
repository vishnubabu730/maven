package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.page.model.NavigatedWithinDocument;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class janasyacreate {
	WebDriver driver;
	@FindBy (xpath = "//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span")
	WebElement arrivalclick;
	@FindBy (xpath = "//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")
	WebElement clickkurthas;
	@FindBy (xpath = "//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")
	WebElement kurthascliick;
	@FindBy (xpath = "//*[@id=\"44199301382314\"]")
	WebElement addtocartclick;
	@FindBy (xpath = "//*[@id=\"halo-cart-sidebar\"]/button/svg/path")
	WebElement closeclck;
	@FindBy (xpath = "//*[@id=\"HeaderNavigation\"]/nav/ul/li/a")
	List<WebElement> displayalltab;
	@FindBy (xpath = "//*[@id=\"HeaderNavigation\"]/nav/ul/li[4]/a/span[1]")
	WebElement movetofusion;
	@FindBy (xpath = "//*[@id=\"HeaderNavigation\"]/nav/ul/li[4]/ul/li[4]/a/span")
	WebElement dressclick;
	
	
	public janasyacreate (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void test1()
	{
		arrivalclick.click();
	}
	public void test2()
	{
		clickkurthas.click();
	}
	public void test3()
	{
		 kurthascliick.click();
	}
	public void test4()
	{
		addtocartclick.click();
		driver.navigate().refresh();
	}
	public void test5()
	{
		closeclck.click();
	}
	public void test6()
	{
		for(WebElement i:displayalltab)
		{
			System.out.println(i.getText());
		}
	}
	public void test7()
	{
		Actions act=new Actions(driver);
		act.moveToElement(movetofusion).build().perform();
	}
	public void test8()
	{
		dressclick.click();
	}
	
}
