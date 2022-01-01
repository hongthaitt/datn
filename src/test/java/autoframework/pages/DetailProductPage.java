package autoframework.pages;

import autoframework.dataService.TestDataService;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {
    public static String prdName;
    public static String prdPrice;
    CommonPage commonPage;

    public void getCurrentProductInfo() {
        String prdNameXpath = TestDataService.properties.getProperty("nameProductDetail");
        String prdPriceXpath = TestDataService.properties.getProperty("priceProductDetail");
        prdName = getDriver().findElement(By.xpath(prdNameXpath)).getText();
        System.out.println("product name current : " + prdName);
        prdPrice = getDriver().findElement(By.xpath(prdPriceXpath)).getText();
        System.out.println("product price current : " + prdPrice);
    }

    public void setQuantity(String quantity) {
        System.out.println("qty= " + quantity);
        int qtyExpect = Integer.parseInt(quantity);

        if (qtyExpect == 1) {
            System.out.println("Dont need to set qty ");
        } else {
            for (int i = 1; i <= qtyExpect - 1; i++) {
                String xpathAddQty = TestDataService.properties.getProperty("xpathAddQty");
                getDriver().findElement(By.xpath(xpathAddQty)).click();
            }
        }
    }

    public void clickAddToCart() {
        commonPage.waitAboutSecond(10);
        //commonPage.waitUntilElementIsVisible("addToCartBtn");
        commonPage.clickOnButton("addToCartBtn");
        //commonPage.waitAboutSecond(5);
        //commonPage.waitUntilHTMLReady(20);
        //commonPage.waitUntilElementIsVisible("messageRemove");
//        String expectMess = TestDataService.properties.getProperty("messageRemove");
//        Assert.assertTrue(getDriver().findElement(By.xpath(expectMess)).getText().contains("Success! Item was successfully added to cart.."));
//        System.out.println("add xong cart");

    }
    public void userSeesTheErrorMessage(String errorMessage) {
        String expectMessXpath = TestDataService.properties.getProperty("errorMassage");
        commonPage.waitUntilElementIsVisible(expectMessXpath);
        String messageCurrent = getDriver().findElement(By.xpath(expectMessXpath)).getText();
        System.out.println("mess: "+messageCurrent);
        Assert.assertTrue(errorMessage.equals(messageCurrent.substring(2, messageCurrent.length())));
    }
    public void clickAddToWishList() {
        commonPage.waitAboutSecond(10);
        commonPage.clickOnButton("addToWishListBtn");
        commonPage.waitAboutSecond(2);
        String mess = "Success! Item Successfully Added To Wishlist.";
        commonPage.verifyMessageAlert(mess, "messageRemove");
    }

    public void userChoosesToAddToCompareList() {
        commonPage.waitAboutSecond(10);
        commonPage.clickOnButton("addToCompareBtn");
        commonPage.waitAboutSecond(2);
        String mess = "Success! Item successfully added to compare list.";
        commonPage.verifyMessageAlert(mess, "messageRemove");
        System.out.println("add to compare done");
    }

    public void userSeesTheSuccessMessage(String message) {
            String expectMessXpath = TestDataService.properties.getProperty("messageRemove");
            commonPage.waitUntilElementIsVisible(expectMessXpath);
            String messageCurrent = getDriver().findElement(By.xpath(expectMessXpath)).getText();
            System.out.println("mess: "+messageCurrent);
            Assert.assertTrue(message.equals(messageCurrent.substring(2, messageCurrent.length())));
    }

    public void continueAddSameProductToCart() {
        String xpathAddQty = TestDataService.properties.getProperty("xpathAddQty");
        getDriver().findElement(By.xpath(xpathAddQty)).click();
    }
}
