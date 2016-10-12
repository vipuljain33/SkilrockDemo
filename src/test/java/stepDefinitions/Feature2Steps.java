package stepDefinitions;

import cucumber.api.java.en.Given;

public class Feature2Steps {
	
	@Given("^I have a given scenario_(\\d+)$")
	public void i_have_a_given_scenario_(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside scenario 4");
	    System.out.println(Thread.currentThread().getId());
	}

}
