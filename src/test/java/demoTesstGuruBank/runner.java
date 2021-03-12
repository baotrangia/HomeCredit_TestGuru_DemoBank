package demoTesstGuruBank;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/demoTesstGuruBank/Scenarios"},
        glue = "demoTesstGuruBank",
        tags = {"@TestAddnewCustomer"},
        plugin = {
                "html:target/result",
                "pretty",
                "json:target/test-classes/reports/result.json"
        }
)
public class runner extends AbstractTestNGCucumberTests {

}
