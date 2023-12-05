package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[text()='Log in']")
	public WebElement login_Link;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement emial_Field;
	
	@FindBy(xpath="//input[@id='Password']")
	public  WebElement password_Field;
	
	@FindBy(xpath="//input[@value='Log in']")
	public  WebElement login_button;
	
	
	
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}
	
}
