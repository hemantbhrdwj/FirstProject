package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {
	@Given("I am on the given app")
	public void i_am_on_the_given_app() {
		System.out.println("Output: I am on the given app");
	}

	@When("I perform action")
	public void i_perform_action() {
		System.out.println("Output: I perform action");
	}

	@Then("I perform the validations")
	public void i_perform_the_validations() {
		System.out.println("Output: I perform the validations");

	}

}
