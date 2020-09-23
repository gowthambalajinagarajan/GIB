package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Approve.feature",glue="Steps",dryRun=false,monochrome=true,strict=true,tags= {"@Positive"},
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Output/Report/Reports.html"})

public class RunnerClass {

}
