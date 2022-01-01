package autoframework.pages;

import autoframework.dataService.TestDataService;
import autoframework.objects.Product;
import cucumber.api.java.es.E;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.collections.ArrayStack;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.xml.bind.Element;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static autoframework.databaseHelper.ConnectionDB.getConnection;

public class WishListPage extends PageObject {
    CommonPage commonPage;
    String DB_URL = TestDataService.properties.getProperty("DB_URL");
    String USER_NAME = TestDataService.properties.getProperty("USER_NAME");
    String PASSWORD = TestDataService.properties.getProperty("PASSWORD");
public static String key;
    public void userRemoveWishlist() {
        commonPage.waitAboutSecond(3);
        commonPage.clickOnButton("wishListBtn");
        String listPrd = TestDataService.properties.getProperty("listPrdWishList");
        ArrayList<WebElement> arrayList = new ArrayList<>(getDriver().findElements(By.xpath(listPrd)));
        if (arrayList.size() == 1) {
            System.out.println("Wishlist is empty");
        } else {
            if (arrayList.size() != 1) {
                commonPage.waitAboutSecond(10);
                String deleteBtn = TestDataService.properties.getProperty("deleteBtn");
                getDriver().findElement(By.xpath(deleteBtn)).click();
                commonPage.waitAboutSecond(2);
                String mess = "Success! All The Items From Your Wishlist Have Been Removed.";
                commonPage.verifyMessageAlert(mess, "messageRemove");
            }
        }
    }

    public List<Product> getProductInfo() {
        List<Product> listProducts = new ArrayList<>();
        List<String> listPrdNames = commonPage.getListProduct("listPrdNameWL");
        List<String> listPrdPrices = commonPage.getListProduct("listPrdPriceWL");
        for (int i = 0; i < listPrdPrices.size(); i++) {
            String name = listPrdNames.get(i);
            String price = listPrdPrices.get(i);
            listProducts.add(new Product(name, price, "", ""));
        }
        return listProducts;
    }


    public List<Product> verifyDatabaseInWishList() {
        String email = (String) ((JavascriptExecutor) getDriver()).executeScript("return localStorage.getItem('key')");
        System.out.println("email customer: " + email);
        List<Product> listProduct = new ArrayList<>();
        if(email!= null) {
            key="notNull";
            String sql = "SELECT product_flat.name, product_flat.price" +
                    " FROM product_flat, customers, wishlist " +
                    "WHERE customers.email= '" + email + "'" +
                    "AND customers.id= wishlist.customer_id" +
                    " AND wishlist.product_id= product_flat.id";

            try {
                Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String name = rs.getString("name");
                    String price = rs.getString("price");
                    String priceCustomize = "$" + price.substring(0, price.length() - 2);
                    listProduct.add(new Product(name, priceCustomize, "", ""));
                }
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else {
            key= "null";
        }
        return listProduct;
    }
}
