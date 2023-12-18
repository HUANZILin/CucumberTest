package ntou.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources",
        glue = {"ntou.steps"},
        plugin = {"pretty", "html:target/cucumber.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
