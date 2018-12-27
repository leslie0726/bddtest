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
	
}
