package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(plugin = "json:target/cucumber-report-composite.json",
features = "src\\main\\resources\\features",
glue="stepDefinitions",
monochrome=false)
public class RunCukesTest{
	
	
	
	@Test
	public void runCukes()
	{
		new TestNGCucumberRunner(getClass()).runCukes();
		System.out.println("Inside runCukes Testmethod");
	}
	
	

}
