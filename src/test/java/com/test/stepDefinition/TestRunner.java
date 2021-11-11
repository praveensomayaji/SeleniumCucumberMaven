package com.test.stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/test/features", glue = { "com.test.stepDefinition" }, plugin = { "pretty",
		"html:target/htmlreports/report.html" })
public class TestRunner {

}
