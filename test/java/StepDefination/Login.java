package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	  
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	  
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
		System.out.println("user is navigate to the homepage");
	}


}
