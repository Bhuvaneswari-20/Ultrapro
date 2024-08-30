package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature", 
glue="Steps", //package name
dryRun=false
)

public class TestsRunner extends AbstractTestNGCucumberTests {

}
