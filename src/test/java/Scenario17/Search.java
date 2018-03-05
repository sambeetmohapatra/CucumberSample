package Scenario17;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	
	@Given("^I enter the search item ([^\"]*)$")
	public void Enter_item(String str)
	{
		if(str.equals("Rice"))
		{
			System.out.println("Input obtained is Rice");
		}
		if(str.equals("###%"))
		{
			System.out.println("Input obtained is Special character");
		}		
		
	}
	
	@When("^I logged in as a user$")
	public void Validate_user()
	{
		System.out.println("Valid user logged");
	}
	
	@Then("^I get the Valid result$")
	public void getvalidsearch()
	{
		
		System.out.println("Result of Valid search");
	}
	
	@Then("^I get the msg for invalid entry$")
	public void getInvalidsearch()
	{
		
		System.out.println("Result of InValid search");
	}
	
	

}
