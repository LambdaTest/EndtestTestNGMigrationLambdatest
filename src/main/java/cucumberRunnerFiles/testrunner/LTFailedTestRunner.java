package cucumberRunnerFiles.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"@rerun/failed_scenarios.txt"},
		glue = {"features"},
        tags = "not @extra",
        monochrome = true,
        plugin = {
        		"pretty","com.epam.reportportal.cucumber.ScenarioReporter",
        		"json:target/cucumber-reports/CucumberTestReport_failedTest.json",
        		"html:target/cucumber-reports/testReport_failed_test.html"
        		}
        )

public class LTFailedTestRunner extends AbstractTestNGCucumberTests{
	
	public LTFailedTestRunner() {
		super();
		System.setProperty("log4j.configurationFile","src/main/java/utility/log4j2.yaml");
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	

}
