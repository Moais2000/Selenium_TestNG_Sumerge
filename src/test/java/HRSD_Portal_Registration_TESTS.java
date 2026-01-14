import PAGES.HRSD_PORTAL_RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class HRSD_Portal_Registration_TESTS {


    public static String generate_random_domain_email()
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        int length = 6; // length of random domain
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return "@" + sb.toString() + ".com";
    }


    WebDriver driver;
    HRSD_PORTAL_RegistrationPage obj;
    WebDriverWait wait;

    @BeforeTest
    public void setup()
    {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--ignore-certificate-errors");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://stg-dev.hrsdportal.hrsd.gov.sa/");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("langBtn"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("RegisterNewOrganizationButton"))).click();
    }

    @Test
    public void create_new_organization() throws InterruptedException {

        obj = new HRSD_PORTAL_RegistrationPage(driver);

        obj.setArabicName("المنظمة المصرية لحقوق الانسان");
        obj.setEnglishName("Egyptian Organization for Human Rights");


        Random rand = new Random();
        int last_7_digits=1000000 + rand.nextInt(9000000);
        String uun = "700"+last_7_digits;
        obj.setUnifiedNationalNumber(uun);

        obj.setOrganizationalSector("خاص");

        obj.upload_logo("C:\\Users\\mafifi\\Downloads\\images.jpg");

        obj.setTelephoneNumber("111234568");
        obj.setApplicantName("مؤمن");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        int last_8_digits=10000000 + rand.nextInt(90000000);
        String nid = "12"+last_8_digits;
        obj.setApplicantNationalID(nid);


        obj.setApplicantPhone("512345678");
        obj.setApplicantJob("Quality Engineer");


        String unique_domain=generate_random_domain_email();
        obj.setemaildomain(unique_domain);

        String app_email="moamen"+unique_domain;
        obj.setapplicantemail(app_email);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("RegisterButton"))).click();

        obj.setverificationcode("5555");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmButton"))).click();

        String actual_mess = obj.asserTAlert();
        Assert.assertTrue(actual_mess.contains("The request has been submitted"));

    }

    @AfterTest
    public void close_browser()
    {
        driver.quit();
    }

}
