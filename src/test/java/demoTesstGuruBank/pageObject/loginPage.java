package demoTesstGuruBank.pageObject;

import demoTesstGuruBank.Until.Params;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage{
    private WebElement webElement;
    public WebElement input_userName(WebDriver driver){
        webElement = driver.findElement(By.xpath("//td/input[@name=\"uid\"]"));
        return webElement;
    }
     public WebElement input_password(WebDriver driver){
        webElement = driver.findElement(By.xpath("//td/input[@name=\"password\"]"));
        return webElement;
     }
     public  WebElement btn_login(WebDriver driver){
        webElement = driver.findElement(By.xpath("//td/input[@name=\"btnLogin\"]"));
        return webElement;
     }
}
