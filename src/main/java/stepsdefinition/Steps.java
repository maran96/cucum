package stepsdefinition;



import org.testng.Assert;

import com.Cucumber.CucumberFramework.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	Homepage hp;
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    hp=new Homepage();
	}

	@When("^User enter \"(.*?)\" in searchbox$")
	public void user_enter_in_searchbox(String arg1) throws Throwable {
	    hp.enteringsearchtxt(arg1);
	    hp.searchbutton().click();
	    
	}

	@Then("^User should see the respective productpage page \"(.*?)\"$")
	public void user_should_see_the_respective_productpage_page(String arg1) throws Throwable {
	  org.junit.Assert.assertTrue("failed", hp.getTitlte().toUpperCase().contains(arg1));
	}

		
}
