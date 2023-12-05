package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	
	@FindBy(xpath="//input[@id='small-searchterms']")
	public WebElement SearchBox;
	

	@FindBy(xpath="	//input[@value='Search']")
	public WebElement SearchBtn;
	

	public SearchPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}
}
