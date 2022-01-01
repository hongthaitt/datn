package autoframework.steps.serenity;

import autoframework.objects.Product;
import autoframework.pages.*;
import org.junit.Assert;

import static autoframework.pages.DetailProductPage.prdName;
import static autoframework.pages.DetailProductPage.prdPrice;
import static autoframework.pages.CartPage.key;
import static autoframework.pages.ListProductPage.expectedPrdName;
import static autoframework.pages.ListProductPage.expectedPrdPrice;

public class AddProductToCartEndUserSteps {
    Homepage homepage;
    ListProductPage listProductPage;
    CartPage cartPage;
    DetailProductPage detailProductPage;
    CommonPage commonPage;
    WishListPage wishListPage;

    public void userSearcheProduct(String product) {
        System.out.printf("Product name to search: " + product);
        homepage.searchProduct(product);
        listProductPage.verifyListProduct(product);
    }

    public void userRemoveCart() {
        //if cart have some product, remove all
        if (homepage.checkQtyCart()) {
            System.out.println("nam trong vong check roi");
            homepage.clickCartIcon();
            cartPage.clickViewCartShopping();
            cartPage.removeCart();

        } else {
            System.out.println("ko co cart ");

        }
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

    public void userChoosesToBuyProductWithQuantity(String quantity) {
        detailProductPage.setQuantity(quantity);
        detailProductPage.clickAddToCart();

    }

    public void verifyInformationProductInCart(String productName, String price, String quantity, int i) {
        Product prd = cartPage.getProductInfo().get(i);
        Assert.assertEquals(productName, prd.getNamePrdInCart());
        Assert.assertEquals(price, prd.getPricePrdInCart());
        Assert.assertEquals(quantity, prd.getQuantity());

    }

    public void userClickCart() {
        commonPage.waitAboutSecond(10);
        homepage.clickCartIcon();
        System.out.println("click cart r");
        cartPage.clickViewCartShopping();
        System.out.println("click continue roi");
    }

    public void clickAddtoCartBtn() {
        homepage.clickAddToCart();

    }

    public void verifyDatabaseInCart(String productName, String price, String quantity, int i) {
        if(key== "notNull") {
            Product prd = cartPage.verifyDatabaseInCart().get(i);
            Assert.assertEquals(productName, prd.getNamePrdInCart());
            Assert.assertEquals(price, prd.getPricePrdInCart());
            Assert.assertEquals(quantity, prd.getQuantity());
        }
        else System.out.println("DONT CHECK DB");
    }


    public void userClicksContinueShopping() {
        commonPage.clickOnButton("continueShopping");
        commonPage.waitAboutSecond(5);
        commonPage.verifyUrlNavigate("homePage");
    }

    public void userSeesTheErrorMessage(String message) {
        detailProductPage.userSeesTheErrorMessage(message);
    }
    public void userSeesTheSuccessMessage(String message) {
        detailProductPage.userSeesTheSuccessMessage(message);
    }

    public void contunueAddSameProduct() {
        detailProductPage.continueAddSameProductToCart();
    }
}
