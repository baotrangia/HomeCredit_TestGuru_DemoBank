package demoTesstGuruBank.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newCustomerPage {
    private WebElement webElement;
    public WebElement btn_addNew(WebDriver driver, String text){
       webElement = driver.findElement(By.xpath("//a[contains(.,'"+text+"')]"));
        return webElement;
    }
    public WebElement txt_customerName(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"name\"]"));
        return webElement;
    }

    public WebElement check_box_select_Gender(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@checked=\"\"]"));
        return webElement;
    }

    public WebElement txt_dateOfbirth(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@id=\"dob\"]"));
        return webElement;
    }
    public WebElement txt_address(WebDriver driver){
        webElement = driver.findElement(By.xpath("//textarea[@name=\"addr\"]"));
        return webElement;
    }

    public WebElement txt_city(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"city\"]"));
        return webElement;
    }

    public WebElement txt_state(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"state\"]"));
        return webElement;
    }
    public WebElement txt_pin(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"pinno\"]"));
        return webElement;
    }

    public WebElement txt_phonenumber(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"telephoneno\"]"));
        return webElement;
    }

    public WebElement txt_email(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"emailid\"]"));
        return webElement;
    }


    public WebElement txt_password(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        return webElement;
    }

    public WebElement btn_sub(WebDriver driver){
        webElement = driver.findElement(By.xpath("//input[@name=\"sub\"]"));
        return webElement;
    }


}
