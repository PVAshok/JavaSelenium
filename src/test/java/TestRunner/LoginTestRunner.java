package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature", glue={"StepDefinitions"},
monochrome = true ,														//to get formatted output
plugin = {"pretty", "json:target/JSONReports/report.json",				//to generate json report
		   "pretty", "html:target/HtmlReports/report.html",	
		   "pretty", "junit:target/JunitReports/report.xml"}
		)
public class LoginTestRunner {

}
