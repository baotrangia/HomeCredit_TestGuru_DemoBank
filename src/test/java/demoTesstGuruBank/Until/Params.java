package demoTesstGuruBank.Until;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Params {
    public static WebDriver driver;
    public String title = "Guru99 Bank Home Page";
    public static void Open_browser(String browser){
        if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver_macos");
            driver= new FirefoxDriver();
            driver.manage().window().maximize();
        }
        else if(browser.equals("safari")){
            WebDriver driver = new SafariDriver();
            driver.manage().window().maximize();
        }
        else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_macos");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public void waitElement(By webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(webElement));
    }

    public void iWaitElement(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void iWaitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }
}
