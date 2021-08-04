package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Banyan.feature", glue = "stepDefinitions", tags = "@EventCreation", plugin = {
        "pretty" }, monochrome = true, stepNotifications = true)

public class TestRunner {


}
