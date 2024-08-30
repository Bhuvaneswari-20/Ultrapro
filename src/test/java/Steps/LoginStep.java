package Steps;

import Helper.BaseClass;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		browserLaunch("https://v14uat.ultrapro.com/login#login");
		
	}

	@When("User Enters valid credentials")
	public void user_enters_valid_credentials() {
	    
		LoginPage lp=new LoginPage();
		//btnClick(lp.getAdvanced());
		//btnClick(lp.getProceed());
		inputText(lp.getUsername(), "e.kowsalya@riverstonetech.com");
		inputText(lp.getPassword(), "Riverstone@123");
		
	}
	@Then("user click the login button")
	public void user_click_the_login_button() {
	    
		LoginPage lp=new LoginPage();
		btnClick(lp.getLogin());
		
	}
	
}
