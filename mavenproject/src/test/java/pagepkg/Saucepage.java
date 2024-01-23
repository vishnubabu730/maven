package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucepage {
	WebDriver driver;
	@FindBy (xpath = "//*[@id=\"user-name\"]")
	WebElement username;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	@FindBy (xpath = "//*[@id=\"login-button\"]")
	WebElement login;
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement product1;
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")
	WebElement product2;
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")
	WebElement product3;
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")
	WebElement product4;
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")
	WebElement product5;
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")
	WebElement product6;
	@FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy (xpath = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement checkout;
	@FindBy (xpath = "//*[@id=\"first-name\"]")
	WebElement firstname;
	@FindBy (xpath = "//*[@id=\"last-name\"]")
	WebElement lastname;
    @FindBy (xpath = "//*[@id=\"postal-code\"]")
    WebElement postalcode;
    @FindBy (xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
    WebElement continuebutton;
    @FindBy (xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
    WebElement finishbutton;
    @FindBy (xpath = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
    WebElement menubutton;
	@FindBy (xpath = "//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
			
	
	
	
	public Saucepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setvalues(String usrnme,String pswd)
	{
		username.clear();
		username.sendKeys(usrnme);
		password.clear();
		password.sendKeys(pswd);
	}
	
	public void loginbutton()
	{
		login.click();
	}
	public void addtocart()
	{
		product1.click();
		product2.click();
		product3.click();
		product4.click();
		product5.click();
		product6.click();
		
		
	}
	public void addtocartclick()
	{
		cart.click();
		checkout.click();
	}
	
	public void setvalues1(String firstnme,String lastnme)
	{
		firstname.sendKeys(firstnme);
		lastname.sendKeys(lastnme);
	}
	
	public void setvalues2(String postalcde)
	{
		postalcode.sendKeys(postalcde);
	}
	
	public void lastset()
	{
		continuebutton.click();
		finishbutton.click();
			
	}
    
	public void lasttest1()
	{
		menubutton.click();
		logout.click();
	}

}
