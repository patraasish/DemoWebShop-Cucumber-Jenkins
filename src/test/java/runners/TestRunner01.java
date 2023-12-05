package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Cucumber-Jenkins\\src\\test\\resources\\Login01.feature",
				"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Cucumber-Jenkins\\src\\test\\resources\\Search01.feature"
		}, plugin= {"html:target/Cucumberreport.html","json:target/cucumber-reports/Cucumber.json"},
   				 glue= {"stepDefination"})
public class TestRunner01 {

}
