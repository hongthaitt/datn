package autoframework.steps;

import autoframework.steps.serenity.CommonEndUserSteps;
import autoframework.steps.serenity.LoginEndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepdefs {
    @Steps
    LoginEndUserSteps loginEndUserSteps;

    @Then("^User logs in \"([^\"]*)\" and return message is \"([^\"]*)\"$")
    public void userLogsInAndReturnMessageIs(String result, String message) {
        if (result.equals("pass")) {
            loginEndUserSteps.verifyLoginSuccessfully();
        } else if (result.equals("fail")) {
            loginEndUserSteps.verifyLoginFail(message);
        }
    }


    @Then("^User should see an error is \"([^\"]*)\" in \"([^\"]*)\"$")
    public void userShouldSeeAnErrorIsIn(String error, String field) {
        loginEndUserSteps.verifyInvalidField(error, field);


    }


//    @Then("^User should see an error is \"([^\"]*)\" in email field$")
//    public void userShouldSeeAnErrorIsInEmailField(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}
