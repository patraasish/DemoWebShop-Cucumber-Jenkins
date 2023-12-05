package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagefactory.SearchPage;

public class SearchStepDefs {
	
	SharedSteps sharedSteps;
	SearchPage searchPage;
	
	
	
	public SearchStepDefs(SharedSteps sharedSteps) {
		this.sharedSteps = sharedSteps;
	}

	@Given("Open the browser")
	public void open_the_browser() {
	searchPage=new SearchPage(sharedSteps.driver);
	}

	@Then("Open the DemoWebShop")
	public void open_the_demo_web_shop() {
		sharedSteps.driver.get("https://demowebshop.tricentis.com/");
	}

	@Then("I enter text in the search box")
	public void i_enter_text_in_the_search_box() {
		searchPage.SearchBox.sendKeys("book");
	}

	@Then("I click on Search button")
	public void i_click_on_search_button() {
	   searchPage.SearchBtn.click();
	}
}
