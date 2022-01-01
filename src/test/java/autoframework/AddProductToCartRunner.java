package autoframework;

import  autoframework.dataService.TestDataService;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src\\test\\resources\\features\\consult_dictionary\\AddProductToCart.feature",
    plugin = {"pretty", "json:target/AddProductToCart.json"},
        tags = "@Add_Product_To_cart"
)
public class AddProductToCartRunner {
  @BeforeClass
  public static void initConfiguration() {
    TestDataService.setProperties("\\src\\test\\resources\\data_test\\data.properties");
  }
}
