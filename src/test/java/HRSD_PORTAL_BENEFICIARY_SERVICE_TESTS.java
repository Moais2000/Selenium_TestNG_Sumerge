import PAGES.HRSD_PORTAL_BENEFICIARY_SERIVICES;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HRSD_PORTAL_BENEFICIARY_SERVICE_TESTS {

    WebDriver driver;
    HRSD_PORTAL_BENEFICIARY_SERIVICES obj;
    WebDriverWait wait;
    public static String request_number;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 0)
    public void login_with_national_id() throws InterruptedException {
        obj=new HRSD_PORTAL_BENEFICIARY_SERIVICES(driver);

        driver.get("http://portal.individual.namaa.sumerge.com/login");
        obj.set_national_id_for_login("1000000008");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ad_login_btn"))).click();

    }

    @Test(priority = 1)
    public void navigate_to_beneficiary_services_page_to_add_medical_request_storing_request_number() throws InterruptedException {
        obj=new HRSD_PORTAL_BENEFICIARY_SERIVICES(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(5000);
        driver.get("http://portal.individual.namaa.sumerge.com/social-record/beneficiary-services");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//app-landing-page-card[@text=\"DISABILITY_ASSESSMENT_LANDING.SERVICE_CARD_TITLE\"]")).click();
        driver.findElement(By.xpath("//dga-button[@variant=\"primary\"]")).click();

        obj.click_on_dropdown();
        obj.select_from_dropdown();

        driver.findElement(By.id("check_btn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//dga-button[@variant=\"dark\"]")));
        driver.findElement(By.xpath("//dga-button[@variant=\"dark\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("value_RequestsPage_RequestNumber")));
        request_number=driver.findElement(By.id("value_RequestsPage_RequestNumber")).getText();

        System.out.println(request_number);

    }

    @Test(priority = 2)
    public void login_entity_and_navigate_to_disablities_requests() throws InterruptedException {
        obj=new HRSD_PORTAL_BENEFICIARY_SERIVICES(driver);
        driver.get("http://portal.entities.namaa.sumerge.com/login");

        obj.login_as_entity("1999988879");
        driver.findElement(By.id("ad_login_btn")).click();

        Thread.sleep(5000);
        obj.click_on_disability_requests();

        driver.navigate().refresh();

        Thread.sleep(2000);
        obj.search_by_request_number(request_number);
        driver.findElement(By.id("button_RequestsPage_Search")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("value_RequestsPage_RequestNumber")));
        String returned_request_number=driver.findElement(By.id("value_RequestsPage_RequestNumber")).getText();
        Assert.assertEquals(returned_request_number,request_number);
    }

}
