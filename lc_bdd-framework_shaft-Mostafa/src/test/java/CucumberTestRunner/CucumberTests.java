package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src/test/resources/UserProfile/UserProfile.feature",
        glue = {"CucumberSteps"}, tags = "@testcase201", plugin = {}

)
public class CucumberTests extends AbstractTestNGCucumberTests {



}
