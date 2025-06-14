package pages.Case;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewCasePopUp {
    public static String AddressName;
    public static String CaseNumber;
    By CaseAddressTextField=By.xpath("//input[@placeholder='اكتب العنوان']");
    By ModelLists=By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
    By EnterModel=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By SaveAddedNewCase=By.xpath("//button[contains(text(),'حفظ')]");
    By CaseTypeList=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[2]");
    By EnterCaseType=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By CaseNumberTextField=By.xpath("//input[@placeholder='اكتب رقم القضية']");
    By Courtlist=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/div[1]/div[1]/div[2]");
    By CourtName=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/div[2]/div[1]/div[2]");
    By Lawyerslist=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[6]/div[1]/div[1]/div[1]/div[2]");
    By Lawyer1Name=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[6]/div[1]/div[2]/div[1]/div[3]");

    public void EnterAdressNameOfTheCase() {
        AddressName = faker.name().title();
        driver.element().type(CaseAddressTextField, AddressName);
    }
    public void EnterTheModel() {
        driver.element().click(ModelLists);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EnterModel);


    }
    public void EnterTheCaseType() {
        driver.element().click(CaseTypeList);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EnterCaseType);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(CaseTypeList);

    }
    public void ChooseCourt() {
        driver.element().click(Courtlist);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(CourtName);

    }
    public void ChooseLawyers() {
        driver.element().click(Lawyerslist);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(Lawyer1Name);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(Lawyerslist);

    }
    public void EnterCaseNumber() {
        CaseNumber = faker.number().digits(12);
        driver.element().type(CaseNumberTextField, CaseNumber);

    }
    public void ClickOnSaveAddedNewCase() {

        driver.element().click(SaveAddedNewCase);
    }
    public void ChangeAddressName ()  {

        driver.element().clear(CaseAddressTextField);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().type(CaseAddressTextField, "Edit");

    }
}
