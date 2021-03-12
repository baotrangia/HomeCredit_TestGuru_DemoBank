package demoTesstGuruBank.testStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.eo.Se;
import demoTesstGuruBank.Until.Params;
import demoTesstGuruBank.pageObject.newAccountPage;
import demoTesstGuruBank.pageObject.newCustomerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class newAccountStep extends Params {
    newAccountPage newAccountPage = new newAccountPage();
    newCustomerPage newCustomerPage = new newCustomerPage();
    @Then("^I wanna add \"([^\"]*)\" has information \"([^\"]*)\", type is \"([^\"]*)\", deposit \"([^\"]*)\"")
    public void addNewAccount(String text, String custumerID, String accountType, String deposit) throws IOException {
        newCustomerPage.btn_addNew(driver, text).click();
        waitElement(By.xpath("//p[contains(.,'Add new account form')]"));
        newAccountPage.txt_customerId(driver).sendKeys(Files.readAllLines(Paths.get("file.txt")).get(0));
        Select select_type = new Select(newAccountPage.btn_select_type(driver));
        select_type.selectByVisibleText(accountType);
        newAccountPage.txt_deposit(driver).sendKeys(deposit);
        newAccountPage.btn_submit(driver).click();
    }
    
}
