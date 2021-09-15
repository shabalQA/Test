package serenity.cucumber;

import java.sql.SQLException;

import StepDefinition.StepDef;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.JDBCconnection;

public class TestSteps {
	
	
	StepDef def = new StepDef();
	JDBCconnection jc = new JDBCconnection();
	
	
	
	@Given("^User Open the goog url$")
	public void user_Open_the_goog_url() {
	    
	}


	@When("^user searches for the (.*) in Goog$")
	public void user_searches_for_the_Flipkart_in_Goog(String item) throws InterruptedException, SQLException {
	   def.launchGoogle(item);
	   jc.databaseconnection();
	}

	@Then("^the user should vbe returned the corresponding webpage$")
	public void the_user_should_vbe_returned_the_corresponding_webpage() {
	   
	}

}
