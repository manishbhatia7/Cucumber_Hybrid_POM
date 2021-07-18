package MyTestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="com.features",
        glue={"stepdefinitions","AppHooks"},
        plugin = "pretty"
)

public class MyTestRunner {

}
