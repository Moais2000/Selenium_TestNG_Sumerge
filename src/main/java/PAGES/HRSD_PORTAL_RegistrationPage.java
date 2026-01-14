package PAGES;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class HRSD_PORTAL_RegistrationPage extends BasePage{


    public HRSD_PORTAL_RegistrationPage(WebDriver driver) {

        super(driver);
    }

    String ArabicNameShadowRoot="input[placeholder='Organization Name in Arabic']";
    String ArabicNameHost="dga-field[id='OrganizationArabicNameField']";
    ArrayList<String> ArabicNameShadowRoots=new ArrayList<>();

    public void setArabicName(String arabicName) throws InterruptedException {

        ArabicNameShadowRoots.add(ArabicNameShadowRoot);
        ArabicNameShadowRoots.add(ArabicNameHost);

        try {
            locateElementsInShadowRoot(ArabicNameHost,ArabicNameShadowRoot).sendKeys(arabicName);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(ArabicNameHost,ArabicNameShadowRoot).sendKeys(arabicName);
        }
    }

    String EnglishNameShadowRoot="input[placeholder='Organization Name in English']";
    String EnglishNameHost="dga-field[id='OrganizationEnglishNameField']";
    ArrayList<String> EnglishNameShadowRoots=new ArrayList<>();

    public void setEnglishName(String englishName) throws InterruptedException {

        EnglishNameShadowRoots.add(EnglishNameShadowRoot);
        EnglishNameShadowRoots.add(EnglishNameHost);

        try {
            locateElementsInShadowRoot(EnglishNameHost,EnglishNameShadowRoot).sendKeys(englishName);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(EnglishNameHost,EnglishNameShadowRoot).sendKeys(englishName);
        }
    }

    String UnifiedNationalNumberShadowRoot="input[placeholder='The Unified National Number']";
    String UnifiedNationalNumberHost="dga-numeric-field[id='Number700Field']";
    ArrayList<String> UnifiedNationalNumberShadowRoots=new ArrayList<>();

    public void setUnifiedNationalNumber(String UNN) throws InterruptedException {

        EnglishNameShadowRoots.add(UnifiedNationalNumberShadowRoot);
        EnglishNameShadowRoots.add(UnifiedNationalNumberHost);

        try {
            locateElementsInShadowRoot(UnifiedNationalNumberHost,UnifiedNationalNumberShadowRoot).sendKeys(UNN);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(UnifiedNationalNumberHost,UnifiedNationalNumberShadowRoot).sendKeys(UNN);
        }
    }

    String OrganizationalSectorShadowRoot="input[placeholder='Organization Sector']";
    String OrganizationalSectorHost="dga-field[id='OrganizationOrientationField']";
    ArrayList<String> OrganizationalSectorShadowRoots=new ArrayList<>();

    public void setOrganizationalSector(String OS) throws InterruptedException {

        OrganizationalSectorShadowRoots.add(OrganizationalSectorShadowRoot);
        OrganizationalSectorShadowRoots.add(OrganizationalSectorHost);

        try {
            locateElementsInShadowRoot(OrganizationalSectorHost,OrganizationalSectorShadowRoot).sendKeys(OS);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(OrganizationalSectorHost,OrganizationalSectorShadowRoot).sendKeys(OS);
        }
    }

    String logoShadowRoot="input[type='file']";
    String logoHost="dga-upload[id='OrganizationSloganButton']";
    ArrayList<String> logoShadowRoots=new ArrayList<>();


    public void upload_logo(String fp) throws InterruptedException {

        logoShadowRoots.add(logoShadowRoot);
        logoShadowRoots.add(logoHost);

        try {
            locateElementsInShadowRoot(logoHost,logoShadowRoot).sendKeys(fp);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(logoHost,logoShadowRoot).sendKeys(fp);
        }
    }


    String TelephoneNumberShadowRoot="input[placeholder='111234567']";
    String TelephoneNumberHost="dga-field[id='OrganizationPhoneField']";
    ArrayList<String> TelephoneNumberShadowRoots=new ArrayList<>();

    public void setTelephoneNumber(String TN) throws InterruptedException {

        //scrollIntoView();
        TelephoneNumberShadowRoots.add(TelephoneNumberShadowRoot);
        TelephoneNumberShadowRoots.add(TelephoneNumberHost);

        try {
            locateElementsInShadowRoot(TelephoneNumberHost,TelephoneNumberShadowRoot).sendKeys(TN);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(TelephoneNumberHost,TelephoneNumberShadowRoot).sendKeys(TN);
        }
    }

    String ApplicantNameShadowRoot="input[placeholder='Applicant Name']";
    String ApplicantNameHost="dga-field[id='OrganizationRepresentativeNameField']";
    ArrayList<String> ApplicantNameShadowRoots=new ArrayList<>();

    public void setApplicantName(String AN) throws InterruptedException {

        //scrollIntoView();
        ApplicantNameShadowRoots.add(ApplicantNameShadowRoot);
        ApplicantNameShadowRoots.add(ApplicantNameHost);

        try {
            locateElementsInShadowRoot(ApplicantNameHost,ApplicantNameShadowRoot).sendKeys(AN);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(ApplicantNameHost,ApplicantNameShadowRoot).sendKeys(AN);
        }
    }

    String ApplicantNationalIDShadowRoot="input[placeholder='Applicant National ID']";
    String ApplicantNationalIDHost="dga-numeric-field[id='OrganizationRepresentativeIDField']";
    ArrayList<String> ApplicantNationalIDShadowRoots=new ArrayList<>();

    public void setApplicantNationalID(String NID) throws InterruptedException {

        ApplicantNationalIDShadowRoots.add(ApplicantNationalIDShadowRoot);
        ApplicantNationalIDShadowRoots.add(ApplicantNationalIDHost);

        try {
            locateElementsInShadowRoot(ApplicantNationalIDHost,ApplicantNationalIDShadowRoot).sendKeys(NID);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(ApplicantNationalIDHost,ApplicantNationalIDShadowRoot).sendKeys(NID);
        }
    }

    String ApplicantPhoneShadowRoot="input[placeholder='512345678']";
    String ApplicantPhoneHost="dga-field[id='OrganizationRepresentativePhoneField']";
    ArrayList<String> ApplicantPhoneShadowRoots=new ArrayList<>();

    public void setApplicantPhone(String phone) throws InterruptedException {

        ApplicantPhoneShadowRoots.add(ApplicantPhoneShadowRoot);
        ApplicantPhoneShadowRoots.add(ApplicantPhoneHost);

        try {
            locateElementsInShadowRoot(ApplicantPhoneHost,ApplicantPhoneShadowRoot).sendKeys(phone);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(ApplicantPhoneHost,ApplicantPhoneShadowRoot).sendKeys(phone);
        }
    }

    String ApplicantJobShadowRoot="input[placeholder='Applicant Job Title']";
    String ApplicantJobHost="dga-field[formcontrolname='applicantPosition']";
    ArrayList<String> ApplicantJobShadowRoots=new ArrayList<>();

    public void setApplicantJob(String title) throws InterruptedException {

        ApplicantJobShadowRoots.add(ApplicantJobShadowRoot);
        ApplicantJobShadowRoots.add(ApplicantJobHost);

        try {
            locateElementsInShadowRoot(ApplicantJobHost,ApplicantJobShadowRoot).sendKeys(title);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(ApplicantJobHost,ApplicantJobShadowRoot).sendKeys(title);
        }
    }


    String EmaildomainShadowRoot="input[placeholder='@example.com']";
    String EmaildomainHost="dga-field[id='DomainField']";
    ArrayList<String> EmaildomainShadowRoots=new ArrayList<>();

    public void setemaildomain(String email) throws InterruptedException {

        EmaildomainShadowRoots.add(EmaildomainShadowRoot);
        EmaildomainShadowRoots.add(EmaildomainHost);

        try {
            locateElementsInShadowRoot(EmaildomainHost,EmaildomainShadowRoot).sendKeys(email);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(EmaildomainHost,EmaildomainShadowRoot).sendKeys(email);
        }
    }

    String ApplicantEmailShadowRoot="input[placeholder='someone@example.com']";
    String ApplicantEmailHost="dga-field[id='EmailDomainField']";
    ArrayList<String> ApplicantEmailShadowRoots=new ArrayList<>();

    public void setapplicantemail(String mail) throws InterruptedException {

        ApplicantEmailShadowRoots.add(ApplicantEmailShadowRoot);
        ApplicantEmailShadowRoots.add(ApplicantEmailHost);

        try {
            locateElementsInShadowRoot(ApplicantEmailHost,ApplicantEmailShadowRoot).sendKeys(mail);
        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {
            locateElementsInShadowRoot(ApplicantEmailHost,ApplicantEmailShadowRoot).sendKeys(mail);
        }
    }


    String VF0ShadowRoot="input[id='-0']";
    String VF0Host="dga-sms-code-field[id='VerificationCodeField']";
    ArrayList<String> VF0ShadowRoots=new ArrayList<>();

    String VF1ShadowRoot="input[id='-1']";
    String VF1Host="dga-sms-code-field[id='VerificationCodeField']";
    ArrayList<String> VF1ShadowRoots=new ArrayList<>();

    String VF2ShadowRoot="input[id='-2']";
    String VF2Host="dga-sms-code-field[id='VerificationCodeField']";
    ArrayList<String> VF2ShadowRoots=new ArrayList<>();

    String VF3ShadowRoot="input[id='-3']";
    String VF3Host="dga-sms-code-field[id='VerificationCodeField']";
    ArrayList<String> VF3ShadowRoots=new ArrayList<>();

    public void setverificationcode(String code) throws InterruptedException {

        VF0ShadowRoots.add(VF0ShadowRoot);
        VF0ShadowRoots.add(VF0Host);

        VF1ShadowRoots.add(VF1ShadowRoot);
        VF1ShadowRoots.add(VF1Host);

        VF2ShadowRoots.add(VF2ShadowRoot);
        VF2ShadowRoots.add(VF2Host);

        VF3ShadowRoots.add(VF3ShadowRoot);
        VF3ShadowRoots.add(VF3Host);

        try {

            waitForVisibility(locateElementsInShadowRoot(VF0Host, VF0ShadowRoot));
            locateElementsInShadowRoot(VF0Host, VF0ShadowRoot).sendKeys(String.valueOf(code.charAt(0)));
            locateElementsInShadowRoot(VF1Host, VF1ShadowRoot).sendKeys(String.valueOf(code.charAt(1)));
            locateElementsInShadowRoot(VF2Host, VF2ShadowRoot).sendKeys(String.valueOf(code.charAt(2)));
            locateElementsInShadowRoot(VF3Host, VF3ShadowRoot).sendKeys(String.valueOf(code.charAt(3)));

        } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {

            waitForVisibility(locateElementsInShadowRoot(VF0Host, VF0ShadowRoot));
            locateElementsInShadowRoot(VF0Host, VF0ShadowRoot).sendKeys(String.valueOf(code.charAt(0)));

            locateElementsInShadowRoot(VF1Host, VF1ShadowRoot).sendKeys(String.valueOf(code.charAt(1)));
            locateElementsInShadowRoot(VF2Host, VF2ShadowRoot).sendKeys(String.valueOf(code.charAt(2)));
            locateElementsInShadowRoot(VF3Host, VF3ShadowRoot).sendKeys(String.valueOf(code.charAt(3)));
        }
    }


        String AlertMessageShadowRoot="dga-text[class='title dga_body_l_semibold success_strong hydrated']";
        String AlertfirstHost="dga-alert[class='alert hydrated']";
        String AlertsecondtHost="dga-message[class='alert-content hydrated']";

        ArrayList<String> AlertShadowRoots=new ArrayList<>();

        public String asserTAlert() throws InterruptedException {

            WebElement element;
            String message;

            AlertShadowRoots.add(AlertMessageShadowRoot);
            AlertShadowRoots.add(AlertfirstHost);
            AlertShadowRoots.add(AlertsecondtHost);

            try {
                element = locateElementInNestedShadowRoots(AlertfirstHost,AlertsecondtHost,AlertMessageShadowRoot);
                scrollIntoView(locateElementInNestedShadowRoots(AlertfirstHost,AlertsecondtHost,AlertMessageShadowRoot));
                message=element.getText();

            } catch (StaleElementReferenceException | NoSuchElementException | TimeoutException e) {

                element = locateElementInNestedShadowRoots(AlertfirstHost,AlertsecondtHost,AlertMessageShadowRoot);
                scrollIntoView(locateElementInNestedShadowRoots(AlertfirstHost,AlertsecondtHost,AlertMessageShadowRoot));
                message=element.getText();
            }

            return message;
        }
    }

