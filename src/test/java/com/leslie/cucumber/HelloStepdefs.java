package com.leslie.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java8.En;




public class HelloStepdefs implements En {
	Hello hello = null;
	String hi = null;
	
	public HelloStepdefs() {
		Given("I have a greeting application with {string}", (String string) -> {
			hello = new Hello(string);
		});
		
		When("I ask it to say hi", () -> {
			hi = hello.sayHi();
		});

		Then("I receive {string}", (String string) -> {
			assertEquals(string, hi);
		});
	}
	
	
	
	
//	
//	@Given("^I have a greeting application with \"([^\"]*)\"$")
//	public void I_have_a_greeting_application_with(String arg1) throws Throwable{
//		hello = new Hello(arg1);
//		//		throw new PendingException();
//	}
//	
//	@When("^I ask it to say hi$")
//	public void I_ask_it_to_say_hi() throws Throwable{
//		hi = hello.sayHi();
////		throw new PendingException();
//	}
//	
//	@Then("^I receive \"([^\"]*)\"$")
//	public void I_receive(String arg1) throws Throwable{
//		assertEquals(arg1, hi);
////		throw new PendingException();
//	}
}
