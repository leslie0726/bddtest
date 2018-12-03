package com.leslie.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloStepdefs {
	Hello hello = null;
	

	@Given("^I have a greeting application with \"([^\"]*)\"$")
	public void I_have_a_greeting_application_with(String arg1) throws Throwable{
		hello = new Hello(arg1);
		//		throw new PendingException();
	}
	
	@When("^I ask it to say hi$")
	public void I_ask_it_to_say_hi() throws Throwable{
		throw new PendingException();
	}
	
	@Then("^I receive \"([^\"]*)\"$")
	public void I_receive(String arg1) throws Throwable{
		throw new PendingException();
	}
}
