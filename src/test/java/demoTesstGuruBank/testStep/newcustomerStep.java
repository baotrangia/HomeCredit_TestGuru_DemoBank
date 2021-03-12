package demoTesstGuruBank.testStep;
import cucumber.api.java.en.And;
import demoTesstGuruBank.Until.Params;
import demoTesstGuruBank.pageObject.newCustomerPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class newcustomerStep extends Params{
    newCustomerPage newCustomerPage = new newCustomerPage();
    @And("^I wanna add \"([^\"]*)\" has information name \"([^\"]*)\", dob \"([^\"]*)\", address \"([^\"]*)\", city \"([^\"]*)\", state \"([^\"]*)\", pin \"([^\"]*)\", mobile \"([^\"]*)\", email \"([^\"]*)\", password \"([^\"]*)\"$")
    public void AddNewCustomer(String text,String name, String dob, String address, String city, String state, String pin, String mobile, String email, String password) throws InterruptedException {
        newCustomerPage.btn_addNew(driver,text).click();
        waitElement(By.xpath("//p[contains(.,'Add New Customer')]"));
        newCustomerPage.txt_customerName(driver).sendKeys(name);
        newCustomerPage.check_box_select_Gender(driver).click();
        newCustomerPage.txt_dateOfbirth(driver).sendKeys(dob);
        newCustomerPage.txt_address(driver).sendKeys(address);
        newCustomerPage.txt_city(driver).sendKeys(city);
        newCustomerPage.txt_state(driver).sendKeys(state);
        newCustomerPage.txt_pin(driver).sendKeys(pin);
        newCustomerPage.txt_phonenumber(driver).sendKeys(mobile);
        newCustomerPage.txt_email(driver).sendKeys(email);
        newCustomerPage.txt_password(driver).sendKeys(password);
        newCustomerPage.btn_sub(driver).click();

    }

    @And("^I wanna check status add customer success is \"([^\"]*)\"$")
    public void Assert_show(String type) throws IOException {
        waitElement(By.xpath("//p[contains(.,\"Customer Registered Successfully!!!\")]"));
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(.,\"Customer Registered Successfully!!!\")]")).getText(), type);
        FileUtils.writeStringToFile(new File("test.txt"), driver.findElement(By.xpath(" //tr[4]/td[2]")).getText());
    }
}
