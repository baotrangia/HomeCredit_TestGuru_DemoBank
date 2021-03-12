package demoTesstGuruBank.Until;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import demoTesstGuruBank.testStep.getPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Params {
    @Before
    public void setUp(){
        Open_browser("chrome");
    }
    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        driver.quit();
        Thread.sleep(3000);
    }

}
