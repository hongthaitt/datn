package autoframework.steps.serenity;

import autoframework.pages.CommonPage;
import autoframework.pages.Homepage;
import autoframework.pages.ListProductPage;

import java.sql.SQLException;

public class SearchProductEndUserSteps {
    Homepage homePage;
    ListProductPage listProductPage;

    public void verifyListProduct(String productName) throws SQLException {
        homePage.searchProduct(productName);
        listProductPage.verifyListProduct(productName);
    }

    public void verifyNoResultProduct(String productName) throws SQLException {
        homePage.searchProduct(productName);
        listProductPage.verifyNoResultProduct(productName);
    }

    public void userClickUploadFile() {
        homePage.userClickUploadFile();
    }

}
