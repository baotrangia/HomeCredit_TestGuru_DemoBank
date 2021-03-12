package demoTesstGuruBank.testStep;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demoTesstGuruBank.Until.Params;
import demoTesstGuruBank.pageObject.loginPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class getPage extends Params {
    loginPage loginPage = new loginPage();
    @Given("^I want to get page \"([^\"]*)\"$")
    public void getPage(String browserName){
        driver.get("http://demo.guru99.com/v4/");
        waitElement(By.xpath("//*[@id=\"site-name\"]"));
        Assert.assertEquals(driver.getTitle(), title);
    }

    @Then("^I login with user \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginWithUserAnd(String arg0, String arg1) throws Throwable {
      loginPage.input_userName(driver).sendKeys(arg0);
      loginPage.input_password(driver).sendKeys(arg1);
      loginPage.btn_login(driver).click();
      waitElement(By.xpath("//div[@id=\"site-name\"]/a"));
    }
}
