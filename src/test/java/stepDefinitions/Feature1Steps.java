package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature1Steps {
	
	@Given("^I have a given scenario$")
	public void i_have_a_given_scenario()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I have a scenario 1");
		System.out.println(Thread.currentThread().getId());
	   
	}

	@When("^I invoke when method$")
	public void i_invoke_when_method() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I have  a when 1");
	    
	}

	@Then("^I see some output$")
	public void i_see_some_output() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I see output 1");
	    
	}

}
