package org.example;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "org/example/steps", dryRun = false,
        monochrome = true, tags = "@DHP1 or @DHP2")
public class TestRunner {
}
