package stepDefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedSteps {

	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	
	@Before
	public void Setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public  void TearDown() {
		driver.close();
	}
}
