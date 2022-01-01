package autoframework;

import  autoframework.dataService.TestDataService;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src\\test\\resources\\features\\consult_dictionary\\AddToWishList.feature",
    plugin = {"pretty", "json:target/AddToWishList.json"}
)
public class AddToWishListRunner {
  @BeforeClass
  public static void initConfiguration() {
    TestDataService.setProperties("\\src\\test\\resources\\data_test\\data.properties");
  }
}
