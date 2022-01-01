package autoframework.steps;

import autoframework.steps.serenity.SearchProductEndUserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import java.sql.SQLException;

public class SearchProductStepDef {
    @Steps
    SearchProductEndUserSteps searchProductEndUserSteps;

    @And("^User searches \"([^\"]*)\" and verify \"([^\"]*)\" display$")
    public void userSearchesAndVerifyDisplay(String productName, String result) throws SQLException {
        if (result.equals("have result")) {
            searchProductEndUserSteps.verifyListProduct(productName);
        }
        if (result.equals("no result")) {
            searchProductEndUserSteps.verifyNoResultProduct(productName);
        }
    }

    @Then("^user click upload file$")
    public void userClickUploadFile() {
        searchProductEndUserSteps.userClickUploadFile();
    }
}

