/*package io.cucumber.skeleton;

public interface RunCucumberTest {

}

*/

package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import java.sql.Driver;

import org.junit.runner.RunWith;


import Problem.TestExercise.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest extends Hooks {
	
	@Given("Navigate exercise1 UI")
	public void navigate_exercise1_ui() {
		driver.get("https://www.exercise1.com/values ");
		System.out.println("Naviagated to Exercise 1");
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Get the count of values appear on the screen Verify the count is correct  {string}")
	public void get_the_count_of_values_appear_on_the_screen_verify_the_count_is_correct(String string) {
		Hooks.verifycountofvalues(string);
	    throw new io.cucumber.java.PendingException();
	}

	

	@Then("Need to verify the values on the screen are greater than zero Verify the count is correct")
	public void need_to_verify_the_values_on_the_screen_are_greater_than_zero_verify_the_count_is_correct() {
	    Hooks.Verifyvaluesgreaterthanzero();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Check the total balance is correct and Verify the count is correct")
	public void check_the_total_balance_is_correct_and_verify_the_count_is_correct() {
	   
	    throw new io.cucumber.java.PendingException();
	}	

	@Then("verify the values are formatted as currencies")
	public void verify_the_values_are_formatted_as_currencies() {
	  Hooks.verifyvaluesascurrencies();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the the total balance matches the sum of the values Verify the count is correct")
	public void verify_the_the_total_balance_matches_the_sum_of_the_values_verify_the_count_is_correct() {
		Hooks.verifytotalbalance();
	}

	
}
