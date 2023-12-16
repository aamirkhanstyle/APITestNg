package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features1",plugin={"pretty","json:target/jsonReports/jsonReports.json",
		"html:target/cucumber-report/cucumber1.html",
		"html:target/TestReport/test.html"},glue= {"stepDefination1","base1"},tags="@smoke")
public class TestRunner1Test {


}
