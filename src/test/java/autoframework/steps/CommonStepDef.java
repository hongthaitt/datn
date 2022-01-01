package autoframework.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import autoframework.dataService.TestDataService;
import autoframework.steps.serenity.CommonEndUserSteps;

import java.awt.*;

public class CommonStepDef {

    @Steps
    CommonEndUserSteps commonEndUserSteps;

    @Before
    public void beforeScenario() {
        if (TestDataService.properties == null) {
            //run with ubuntu, need set path to /
            TestDataService.setProperties("/src/test/resources/data_test/data.properties");
            //run with windows, need set path to \\
            //TestDataService.setProperties("\\src\\test\\resources\\data_test\\data.properties");
        }
    }


    @Given("^Go to \"([^\"]*)\" url$")
    public void goToLoginUrl(String loginPage) {
        commonEndUserSteps.goToLoginUrl(loginPage);

    }

    @And("^Insert \"([^\"]*)\" into \"([^\"]*)\" field$")
    public void insertIntoField(String username, String emailLogin) {
        commonEndUserSteps.insertIntoField(username, emailLogin);

    }

    @And("^Click button \"([^\"]*)\"$")
    public void clickButton(String button) {
        commonEndUserSteps.clickOnButton(button);

    }


    @Then("^Verify url navigate is \"([^\"]*)\"$")
    public void verifyUrlNavigateIs(String url) {
        commonEndUserSteps.verifyUrlNavigate(url);
    }

    @And("^Scroll to buttom page$")
    public void scrollToButtomPage() {
        commonEndUserSteps.scrollOnButtomPage();
    }

    @And("^Save \"([^\"]*)\" to local storegae with name \"([^\"]*)\"$")
    public void saveToLocalStoregaeWithName(String username, String key) {
        commonEndUserSteps.saveToLocalStoregaeWithName(username, key);
    }

    @When("^Cleare local storage$")
    public void cleareLocalStorage() {
        commonEndUserSteps.cleareLocalStorage();
    }


    @Then("^User should see a message is \"([^\"]*)\"$")
    public void userShouldSeeAMessageIs(String errorMessage)  {
        commonEndUserSteps.userShouldSeeAErrorMessage(errorMessage);
    }
    @When("^User Login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoginWithAnd(String username, String password) {
        commonEndUserSteps.userLoginWithUsernameAndPW(username, password);

    }
}

