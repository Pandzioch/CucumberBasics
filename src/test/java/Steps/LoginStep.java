package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {

        System.out.println("checking if i see the text");
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {

    }


    @When("I click login button")
    public void iClickLoginButton() {
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
    }

}
