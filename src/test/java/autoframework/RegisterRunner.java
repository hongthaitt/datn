package autoframework;

import  autoframework.dataService.TestDataService;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src\\test\\resources\\features\\consult_dictionary\\Register.feature",
    plugin = {"pretty", "json:target/Register.json"}
)
public class RegisterRunner {
  @BeforeClass
  public static void initConfiguration() {
    TestDataService.setProperties("\\src\\test\\resources\\data_test\\data.properties");
  }
}
