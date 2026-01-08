import PAGES.ADD_CONTACT_PAGE;
import PAGES.CONTACT_DETAILS_PAGE;
import PAGES.SIGN_UP_PAGE;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class First_Test {

    SIGN_UP_PAGE signup_obj;
    ADD_CONTACT_PAGE add_contact_obj;
    CONTACT_DETAILS_PAGE contact_details_obj;
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Test(priority = 0)
    public void SIGN_UP_WITH_VALID_DATA()
    {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");

        signup_obj = new SIGN_UP_PAGE(driver);

        signup_obj.set_first_name("Moamen");
        signup_obj.set_last_name("Ashraf");
        signup_obj.set_email("Moamenafifi@gmail.com");
        signup_obj.set_pass("Moamen123456");

        signup_obj.click_submit_btn();

        WebElement add_contact_btn = driver.findElement(By.id("add-contact"));
        add_contact_btn.click();
    }

    @Test(priority = 1)
    public void ADD_Contact()
    {
        add_contact_obj=new ADD_CONTACT_PAGE(driver);

        add_contact_obj.set_first_name("Moamen");
        add_contact_obj.set_last_name("Ashraf");
        add_contact_obj.set_date_of_birth("2000-10-22");
        add_contact_obj.set_email("ashrafmoamen56@gmail.com");
        add_contact_obj.set_phone("01148960104");
        add_contact_obj.set_add1("cairo");
        add_contact_obj.set_add2("cairo");
        add_contact_obj.set_city("Cairo");
        add_contact_obj.set_country("EGYPT");

        add_contact_obj.click_submit_btn();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]")));

        String name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[2]"))).getText();
        Assert.assertEquals(name, "Moamen Ashraf");

        String bdate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[3]"))).getText();
        Assert.assertEquals(bdate, "2000-10-22");


        String email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[4]"))).getText();
        Assert.assertEquals(email, "ashrafmoamen56@gmail.com");

        String phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[5]"))).getText();
        Assert.assertEquals(phone, "01148960104");

        String address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[6]"))).getText();
        Assert.assertEquals(address, "cairo cairo");

        String city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[7]"))).getText();
        Assert.assertEquals(city, "Cairo");

        String country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[8]"))).getText();
        Assert.assertEquals(country, "EGYPT");
    }

    @Test(priority = 2)
    public void EDIT_CONTACT() throws InterruptedException {
        contact_details_obj=new CONTACT_DETAILS_PAGE(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[2]"))).click();

        contact_details_obj.click_edit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']"))).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashrafmoamen56@sumerge.com");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit"))).click();

        Thread.sleep(10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("return")));
        contact_details_obj.click_view_contact_list();

       String new_email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='myTable']/tr[1]/td[4]"))).getText();
       Assert.assertEquals(new_email,"ashrafmoamen56@sumerge.com");

    }

}
