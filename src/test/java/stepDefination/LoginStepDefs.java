package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagefactory.LoginPage;

public class LoginStepDefs {
	

	SharedSteps sharedSteps;
	LoginPage loginPage;
	
	
	public LoginStepDefs(SharedSteps sharedSteps) {
		
		this.sharedSteps = sharedSteps;
	}



	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
	 loginPage=new LoginPage(sharedSteps.driver);
	}

	

	@Then("Open the DemoWebShop url")
	public void open_the_demo_web_shop_url() {
		sharedSteps.driver.get("https://demowebshop.tricentis.com/");
		
	}


	@Then("I click on login")
	public void i_click_on_login() {
		loginPage.login_Link.click();
	}

	@Then("I enter email")
	public void i_enter_email() {
		loginPage.emial_Field.sendKeys("Itest@test.com"); 
		
	}

	@Then("I enter password")
	public void i_enter_password() {
		loginPage.password_Field.sendKeys("Itest@test");
	}

	@Then("I click on Login button")
	public void i_click_on_login_button() {
		loginPage.login_button.click();
	}	
}
