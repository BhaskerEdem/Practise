package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"features"},
glue = {"Blackberry_StepDefinition"},
tags = {"@snapdeal"},
monochrome = true, dryRun = false)		
		
public class TestRunner {

}
