package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewSessionPopUpPage {
    public static String JudicialCircuit;
    public static String Judgename;
    public static String SessionNumber;
    //الدائرة القضائية
    By JudicialCircuitTextField = By.xpath("//input[@placeholder='اكتب الدائرة القضائية']");
    By AssignedLawyersLists = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]");
    By EnterAssignedLawyer = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By DeleteSessionBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[3]");
    By ConfirmDeleteSessionBtn = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CourtList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]");
    By EnterCourt = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/div[1]/div[2]");
    By SessionNumberTextField = By.xpath("//input[@placeholder='اكتب رقم الجلسة']");
    By JudgeNameTextField = By.xpath("//input[@placeholder='اكتب اسم القاضي']");
    By SessionTypeList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]");
    By SessionType = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/div[1]/div[3]");
    By Datelist = By.xpath("//input[@placeholder='اختر التاريخ']");
    By DateTime = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[6]/span[1]");
    By DateListOptional = By.xpath("//input[@placeholder='اختر الوقت']");
    By DateTimeOptional = By.xpath("//*[@id=\"kt_app_body\"]/div[5]/div/div/div[2]/form/div[7]/input");
    By CourtTypeList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]");
    By EnterCourtType = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]");
    By AttachmentButton = By.xpath("//button[contains(text(),'اضافة مرفق')]");
    By AddAttachment = By.xpath("(//input[@name='attachments.0.file'])[1]");
    String AttachmentLocation = "C:\\Users\\mostafa.hossam\\Downloads\\Competencies Template (2).xlsx";
    By SaveAddedNewSessionBtn = By.xpath("//button[contains(text(),'حفظ')]");
    By CheckAddedNewSession = By.xpath("//div[contains(text(),'تم اضافة الجلسة بنجاح')]");

    public void EnterBasicInformation() {
        SessionNumber = faker.number().digits(12);
        driver.element().type(SessionNumberTextField, SessionNumber);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(AssignedLawyersLists);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(EnterAssignedLawyer);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SessionTypeList);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(SessionType);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(Datelist);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(DateTime);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        JudicialCircuit = faker.name().title();
        driver.element().type(JudicialCircuitTextField, JudicialCircuit);
    }

    public void EnterOptionalInformation() {


        driver.element().click(CourtList);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(EnterCourt);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(CourtTypeList);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(EnterCourtType);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(DateListOptional);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(DateTimeOptional);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        Judgename = faker.name().title();
        driver.element().type(JudgeNameTextField, Judgename);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(AttachmentButton);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().typeFileLocationForUpload(AddAttachment, AttachmentLocation);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }


    public void ClickOnTheSaveAddNewSessionBtn() {
        driver.element().click(SaveAddedNewSessionBtn);
    }

    public String CheckAddedNewSession() {
        return driver.element().getText(CheckAddedNewSession);
    }
        public void ClickOnTheDeleteSessionBtn () {
            driver.element().click(DeleteSessionBtn);
            driver.element().click(ConfirmDeleteSessionBtn);

        }
     //public String CheckThatSessionIsDeleted() {
     // return driver.element().getText();
     //}
    }





