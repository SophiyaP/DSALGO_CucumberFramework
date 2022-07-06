package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
monochrome=true,
features={"src/test/resources/Features/LinkedList/linkedList.feature",
		"src/test/resources/Features/Tree/tree.feature",
		"src/test/resources/Features/Login/login1.feature"},
glue="StepDefinitions1",
dryRun=false,

plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

)
public class testRunner {

	

}
