package autoframework.steps;

import autoframework.steps.serenity.LoginEndUserSteps;
import autoframework.steps.serenity.RegisterEndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class RegisterStpDef {
    @Steps
    RegisterEndUserSteps registerEndUserSteps;

    @Then("^User sign up \"([^\"]*)\" and should see a message is \"([^\"]*)\"$")
    public void userSignUpAndShouldSeeAMessageIs(String result, String message) {
        if (result.equals("pass")) {
            registerEndUserSteps.verifyPassMessage(message);
            //registerEndUserSteps.verifyRegisterPassDatabase();
        } else if (result.equals("fail")) {
            registerEndUserSteps.verifyFailMessage(message);
            //registerEndUserSteps.verifyRegisterFailDatabase();
        }
    }
}
