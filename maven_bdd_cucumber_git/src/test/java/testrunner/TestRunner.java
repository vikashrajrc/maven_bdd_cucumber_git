package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"stepdefinitions"},
		dryRun = false,
		plugin = {"pretty", "html:target/report.html"},
		tags = ""
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
