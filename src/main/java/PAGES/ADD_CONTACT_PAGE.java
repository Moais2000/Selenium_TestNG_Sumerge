package PAGES;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ADD_CONTACT_PAGE {

    WebDriver driver;
    WebDriverWait wait;

    public ADD_CONTACT_PAGE(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By fname = By.id("firstName");
    By lname = By.id("lastName");
    By date_of_birth = By.id("birthdate");
    By email = By.xpath("//input[@id='email']");
    By phone = By.id("phone");
    By city = By.id("city");
    By country = By.id("country");
    By add1 = By.id("street1");
    By add2 =By.id("street2");

    By submit_btn=By.xpath("//button[@id='submit']");


    public void set_first_name(String Fname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        driver.findElement(fname).sendKeys(Fname);
    }

    public void set_last_name(String Lname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
        driver.findElement(lname).sendKeys(Lname);
    }

    public void set_date_of_birth(String DOB){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("birthdate")));
        driver.findElement(date_of_birth).sendKeys(DOB);
    }

    public void set_email(String mail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        driver.findElement(email).sendKeys(mail);
    }

    public void set_phone(String phone_num){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
        driver.findElement(phone).sendKeys(phone_num);
    }

    public void set_add1(String S1){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("street1")));
        driver.findElement(add1).sendKeys(S1);
    }

    public void set_add2(String S2){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("street2")));
        driver.findElement(add2).sendKeys(S2);
    }

    public void set_city(String City){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
        driver.findElement(city).sendKeys(City);
    }

    public void set_country(String Country){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
        driver.findElement(country).sendKeys(Country);
    }

    public void click_submit_btn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit']")));
        driver.findElement(submit_btn).click();
    }


}
