package keywordDriven;

import Utility.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ActionKeywords {
    public static WebDriver driver;

    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void navigate() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.URL);
    }

    public void enterEmail() {
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(Constants.username);
    }

    public void enterPassword() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Constants.password);
    }

    public void clickSignIn() {
        driver.findElement(By.xpath("//button[text() = 'Sign in']")).click();
    }

    public void profileImage() {
        driver.findElement(By.xpath("//img[@id = 'ember26']")).click();
    }

    public void logout() {
        driver.findElement(By.xpath("//a[text() = 'Sign out']")).click();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
