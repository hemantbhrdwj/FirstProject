package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features"
, glue="stepdefinitions"
, monochrome = true
, plugin = "html: reports/results.html")
public class TestRunner extends AbstractTestNGCucumberTests {

}
