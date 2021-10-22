package stepdefinition;

import factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class LoginPageSteps {

	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("This Step open the Firefox and launch the application.");
        DriverFactory.getDriver().get("http://onewave.techwave.net");
        Thread.sleep(5000);
        loginPage.selectsigninoutlook();
        Thread.sleep(8000);
        loginPage.enterEamiladdress();
        Thread.sleep(5000);
        loginPage.selectNext();
        Thread.sleep(5000);
        loginPage.enterPassword("Nikhila@55");
        Thread.sleep(5000);
        loginPage.selectNext();
        Thread.sleep(5000);
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
       System.out.println("This step enter the Username and Password on the login page.");
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
    }


}
