package cucumberRunnerFiles.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/main/java"},
        glue = {"StepDef", "cucumberRunnerFiles.hooks"},
        tags = "not @mobile",
        //tags = "@mobile",
        //tags = "not @any",
        monochrome = true,
        plugin = {
//				"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
        		"pretty","com.epam.reportportal.cucumber.ScenarioReporter",
        		"json:target/cucumber-reports/CucumberTestReport.json",
        		"html:target/cucumber-reports/testReport.html",
        		"rerun:rerun/failed_scenarios.txt"
        		}
        )

public class LtRunner extends AbstractTestNGCucumberTests{
	
	public LtRunner() {
		super();
		System.setProperty("log4j.configurationFile","src/main/java/utility/log4j2.yaml");
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	

}
