package ProjectActivities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/ProjectActivities",
            //glue = {"StepDefinitions"},
            tags = "@FirstActivity"
    )

    public class Testrunner {
        //Empty
    }

