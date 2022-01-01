package autoframework.steps.serenity;

import autoframework.objects.Product;
import autoframework.pages.*;
import org.junit.Assert;

import static autoframework.pages.DetailProductPage.prdName;
import static autoframework.pages.DetailProductPage.prdPrice;
import static autoframework.pages.ListProductPage.expectedPrdName;
import static autoframework.pages.ListProductPage.expectedPrdPrice;
import static autoframework.pages.WishListPage.key;
public class AddToWishListEndUserStep {
    WishListPage wishListPage;
    Homepage homepage;
    ListProductPage listProductPage;
    DetailProductPage detailProductPage;
    CommonPage commonPage;

    public void userRemoveWishlist() {
        wishListPage.userRemoveWishlist();

    }

    public void userSearcheProduct(String product) {
        System.out.printf("Product name to search: " + product);
        homepage.searchProduct(product);
        listProductPage.verifyListProduct(product);
    }

    public void userChoosesFirstProduct() {
        listProductPage.getExpectedProductInfo();
        listProductPage.userChoosesFirstProduct();
    }

    public void verifyNavigationToProductDetail_page() {
        detailProductPage.getCurrentProductInfo();
        Assert.assertEquals(expectedPrdName, prdName);
        Assert.assertEquals(expectedPrdPrice, prdPrice);
    }

    public void userChoosesToAddToWishList() {
        detailProductPage.clickAddToWishList();
    }

    public void userClickWishList() {
        commonPage.waitAboutSecond(6);
        commonPage.clickOnButton("wishListBtn");
    }

    public void verifyInformationProductInWishList(String productName, String price, int i) {
        Product prd = wishListPage.verifyDatabaseInWishList().get(i);
        Assert.assertEquals(productName, prd.getNamePrdInCart());
        Assert.assertEquals(price, prd.getPricePrdInCart());
    }

    public void verifyDatabaseInWishList(String productName, String price, int i) {
        if (key == "notNull") {
            Product prd = wishListPage.verifyDatabaseInWishList().get(i);
            Assert.assertEquals(productName, prd.getNamePrdInCart());
            Assert.assertEquals(price, prd.getPricePrdInCart());
        }
        else{
            System.out.println("DONT NEED CHECK DB");
        }
    }
}
