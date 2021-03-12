package demoTesstGuruBank.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newAccountPage {
    private WebElement webElement;
    public WebElement txt_customerId(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
        return webElement;
    }

    public WebElement btn_select_type(WebDriver driver){
        webElement = driver.findElement(By.xpath("//select[@name=\"selaccount\"]"));
        return webElement;
    }
    public WebElement txt_deposit(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"inideposit\"]"));
        return webElement;
    }
    public WebElement btn_submit(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"button2\"]"));
        return webElement;
    }
}
