package autoframework.steps.serenity;

import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import autoframework.pages.CommonPage;
import autoframework.dataService.TestDataService;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CommonEndUserSteps {

    CommonPage commonPage;

    public void goToLoginUrl(String loginPage) {
        commonPage.clearCache();
        commonPage.goToUrl(loginPage);
    }

    public void insertIntoField(String username, String emailLogin) {
        commonPage.insertIntoField(username, emailLogin);
    }

    public void clickOnButton(String button) {
        commonPage.clickOnButton(button);


    }

    public void verifyUrlNavigate(String url) {
        commonPage.verifyUrlNavigate(url);
    }

    public void scrollOnButtomPage() {
        commonPage.scrollOnButtomPage();

    }


    public void saveToLocalStoregaeWithName(String username, String key) {
        commonPage.saveToLocalStoregaeWithName(username, key);
    }

    public void cleareLocalStorage() {
        commonPage.cleareLocalStorage();

    }

    public void userShouldSeeAErrorMessage(String errorMessage) {
        commonPage.userShouldSeeAErrorMessage( errorMessage);
    }
    public void userLoginWithUsernameAndPW(String username, String password) {
        commonPage.clickOnButton("guestBtn");
        commonPage.clickOnButton("signInBtn");
        commonPage.verifyUrlNavigate("loginPage");
        commonPage.insertIntoField(username, "emailLogin");
        commonPage.saveToLocalStoregaeWithName(username, "key");
        commonPage.insertIntoField(password, "passwordLogin");
        commonPage.clickOnButton("loginButton");
    }
}



