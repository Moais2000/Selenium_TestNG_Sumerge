package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CONTACT_DETAILS_PAGE {

    WebDriver driver;
    WebDriverWait wait;


    public CONTACT_DETAILS_PAGE(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By edit = By.id("edit-contact");
    By delete=By.id("Delete Contact");
    By view_contact_list=By.id("return");


    public void click_edit(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-contact")));
        driver.findElement(edit).click();
    }
    public void click_delete(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Delete Contact")));
        driver.findElement(delete).click();
    }

    public void click_view_contact_list(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("return")));
        driver.findElement(view_contact_list).click();
    }
}
