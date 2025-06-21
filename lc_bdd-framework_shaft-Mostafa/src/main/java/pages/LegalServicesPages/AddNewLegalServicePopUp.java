package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewLegalServicePopUp {
    public static String LegalServiceAddress;
    By LegalServiceAddressTextField=By.xpath("//input[@placeholder='اكتب العنوان']");
    By ModelList=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
    By EnterTheModel=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By LegalTypeList=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]");
    By EnterLegalType=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[2]/div[1]/div[2]");
   // By Courtlist=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/div[1]/div[1]/div[2]");
    //By CourtName=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/div[2]/div[1]/div[2]");
    By Lawyerslist=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[2]");
    By Lawyer1Name=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/div[2]/div[1]/div[3]");
    By SaveAddedNewLegalService=By.xpath("//button[contains(text(),'حفظ')]");

    public void EnterLegalServiceAddress() {
        LegalServiceAddress = faker.name().title();
        driver.element().type(LegalServiceAddressTextField, LegalServiceAddress);
    }
    public void EnterTheModelOfLegalService() {
        driver.element().click(ModelList);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EnterTheModel);
    }

    public void EnterTheLegalType() {
        driver.element().click(LegalTypeList);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EnterLegalType);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
     //   driver.element().click(LegalTypeList);
    }
//    public void ChooseCourt() {
//        driver.element().click(Courtlist);
//        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
//        driver.element().click(CourtName);
//
//    }
    public void ChooseTheLawyersOfTheLegal() {
        driver.element().click(Lawyerslist);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(Lawyer1Name);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(Lawyerslist);
    }
//    public void EnterCaseNumber() {
//        CaseNumber = faker.number().digits(12);
//        driver.element().type(CaseNumberTextField, CaseNumber);
//
//    }
    public void ClickOnSaveAddedNewLegalService() {

        driver.element().click(SaveAddedNewLegalService);
    }
    public void ChangeLegalServiceAddress ()  {

        driver.element().clear(LegalServiceAddressTextField);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().type(LegalServiceAddressTextField, "Edit");

    }
}
