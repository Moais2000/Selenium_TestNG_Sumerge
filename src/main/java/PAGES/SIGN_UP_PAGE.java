package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SIGN_UP_PAGE {

    WebDriver driver;
    WebDriverWait wait;


    public SIGN_UP_PAGE(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    By fname = By.id("firstName");
    By lname = By.id("lastName");
    By email = By.id("email");
    By password = By.id("password");

    By submit_btn = By.id("submit");
    By cancel_btn = By.id("cancel");


    public void set_first_name(String first_name) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        driver.findElement(fname).sendKeys(first_name);
    }

    public void set_last_name(String last_name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
        driver.findElement(lname).sendKeys(last_name);
    }

    public void set_email(String mail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(email).sendKeys(mail);
    }

    public void set_pass(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        driver.findElement(password).sendKeys(pass);
    }

    public void click_submit_btn() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
        driver.findElement(submit_btn).click();
    }

    public void click_cancel_btn() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancel")));
        driver.findElement(cancel_btn).click();
    }
}
