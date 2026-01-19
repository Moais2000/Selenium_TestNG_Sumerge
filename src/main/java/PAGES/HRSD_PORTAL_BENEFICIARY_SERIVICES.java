package PAGES;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HRSD_PORTAL_BENEFICIARY_SERIVICES extends BasePage{

    public HRSD_PORTAL_BENEFICIARY_SERIVICES(WebDriver driver) {
        super(driver);
    }

    String loginshadowroot="input[id='national_id_val']";
    String loginHost="dga-numeric-field[id='national_id']";
    ArrayList<String> loginarraylist=new ArrayList<>();

    public void set_national_id_for_login(String ID) throws InterruptedException {

        loginarraylist.add(loginshadowroot);
        loginarraylist.add(loginHost);

        try {
            locateElementsInShadowRoot(loginHost,loginshadowroot).sendKeys(ID);
        }

        catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e)
        {
            locateElementsInShadowRoot(loginHost,loginshadowroot).sendKeys(ID);
        }

    }

    String dropdwonshadowroot="input[id='beneficiary']";
    String dropdownHost="dga-select[id='beneficiary']";
    ArrayList<String> dropdownarraylist=new ArrayList<>();

    public void click_on_dropdown() throws InterruptedException {

        dropdownarraylist.add(dropdwonshadowroot);
        dropdownarraylist.add(dropdownHost);

        try {
            locateElementsInShadowRoot(dropdownHost,dropdwonshadowroot).click();
        }

        catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e)
        {
            locateElementsInShadowRoot(dropdownHost,dropdwonshadowroot).click();
        }

    }

    String selectdropdwonshadowroot="dga-box[tabindex='-1']";
    String selectdropdownHost="dga-select-item[id='1000000008']";
    ArrayList<String> selectdropdownarraylist=new ArrayList<>();

    public void select_from_dropdown() throws InterruptedException {

        selectdropdownarraylist.add(selectdropdwonshadowroot);
        selectdropdownarraylist.add(selectdropdownHost);

        try {
            locateElementsInShadowRoot(selectdropdownHost,selectdropdwonshadowroot).click();
        }

        catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e)
        {
            locateElementsInShadowRoot(selectdropdownHost,selectdropdwonshadowroot).click();
        }

    }

    String loginentityshadowroot="input[id='national_id_val']";
    String loginentityHost="dga-numeric-field[id='national_id']";
    ArrayList<String> loginentityarraylist=new ArrayList<>();

    public void login_as_entity(String ID) throws InterruptedException {

        loginentityarraylist.add(loginentityshadowroot);
        loginentityarraylist.add(loginentityHost);

        try {
            locateElementsInShadowRoot(loginentityHost,loginentityshadowroot).sendKeys(ID);
        }

        catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e)
        {
            locateElementsInShadowRoot(loginentityHost,loginentityshadowroot).sendKeys(ID);
        }

    }

    String disableshadowroot="dga-box[aria-label='طلبات تقييم الإعاقة']";
    String disableHost="dga-navigation-group-item:nth-child(2)[class='default light hydrated']";
    ArrayList<String> disablearraylist=new ArrayList<>();

    public void click_on_disability_requests() throws InterruptedException {

        disablearraylist.add(disableshadowroot);
        disablearraylist.add(disableHost);

        try {
            locateElementsInShadowRoot(disableHost,disableshadowroot).click();
        }

        catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e)
        {
            locateElementsInShadowRoot(disableHost,disableshadowroot).click();
        }

    }


    String searchshadowroot="input[id='input_Uuid']";
    String searchHost="dga-field[id='input_Uuid']";
    ArrayList<String> searcharraylist=new ArrayList<>();

    public void search_by_request_number(String RN) throws InterruptedException {

        searcharraylist.add(searchshadowroot);
        searcharraylist.add(searchHost);

        try {
            locateElementsInShadowRoot(searchHost,searchshadowroot).sendKeys(RN);
        }

        catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e)
        {
            locateElementsInShadowRoot(searchHost,searchshadowroot).sendKeys(RN);
        }

    }




}
