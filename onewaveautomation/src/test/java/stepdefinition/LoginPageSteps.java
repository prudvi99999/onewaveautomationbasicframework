package stepdefinition;

import org.junit.Assert;

import factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class LoginPageSteps {

	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("^Open the chrome and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("This Step open the Firefox and launch the application.");
        DriverFactory.getDriver().get("http://onewave.techwave.net");
        
    }

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
    public void enter_the_Username_and_Password(String username, String pwd) throws Throwable
    {
		Thread.sleep(2000);
        loginPage.selectsigninoutlook();
        Thread.sleep(4000);
        loginPage.enterEamiladdress(username);
        Thread.sleep(2000);
        loginPage.selectNext();
        Thread.sleep(2000);
        loginPage.enterPassword(pwd);
        Thread.sleep(2000);
        loginPage.selectNext();
        Thread.sleep(2000);
        
        try {
        
        Assert.assertNotEquals("wrong username/pwd","true",loginPage.isverifyidentitypresent());
        }
        catch(Exception ex)
        {
        	System.out.println("Please enter correct user name and pwd");
      
        }
      
        Thread.sleep(2000);
        loginPage.selectHomepagebt();
        Thread.sleep(2000);
        loginPage.selectoptiondasbborad();
        Thread.sleep(2000);
        loginPage.selecttimesheetsoption();
        Thread.sleep(2000);
      
        Thread.sleep(2000);
        loginPage.projectselection();
        }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
    }


}
