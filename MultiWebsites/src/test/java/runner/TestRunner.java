package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = {"C:\\Users\\Bhasker\\git\\Practise\\MultiWebsites\\features"},
glue = {"com.flipkart.StepDefinitions"},
monochrome = true, dryRun = false
		)
public class TestRunner{
	
}
