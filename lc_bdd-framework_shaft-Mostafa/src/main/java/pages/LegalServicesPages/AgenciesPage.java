package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AgenciesPage {
    public static String AgencyNumber;
    public static String AgencyContent;
    By AgencyNumberTextField = By.xpath("//input[@placeholder='اكتب رقم الوكالة']");
    By AgencyNoticeTextField=By.xpath("//textarea[@placeholder='ملاحظات']");
    By StartDateList = By.xpath("//input[@placeholder='اختر تاريخ البدء ']");
    By EnterStartDate = By.xpath("//span[normalize-space()='29']");
    By EndDateList = By.xpath("//input[contains(@placeholder,'اختر تاريخ النهاية')]");
    By EnterEndDate = By.xpath("//span[normalize-space()='29']");
    By SaveAddedAgency = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/button[2]");
    By CheckAddedAgency=By.xpath("//div[contains(text(),'تم الاضافة بنجاح')]");
   // By DeleteTaskButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]");
   // By ConfirmDeleteTaskButton=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
   // By CheckDeletedTask=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");
     By EditAgencyButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]");
     //By ConfirmDeleteTaskButton=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
     By CheckUpdatedAgency=By.xpath("//div[contains(text(),'تم التعديل بنجاح')]");


    public void EnterAgencyDataFields() {
        AgencyNumber = faker.number().digits(8);
        driver.element().type(AgencyNumberTextField,AgencyNumber );
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        AgencyContent=faker.name().toString();
        driver.element().type(AgencyNoticeTextField,AgencyContent);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(StartDateList);
        driver.element().click(EnterStartDate);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(EndDateList);
        driver.element().click(EnterEndDate);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }
    public void ClickOnTheSaveAddAgency(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveAddedAgency);}

    public String CheckAddedAgency(){
        return driver.element().getText(CheckAddedAgency);}

    public void ClickOnTheEditAgencyButton(){
        driver.element().click(EditAgencyButton);
    }
    public void EditTheAddedAgency(){
        driver.element().clear(AgencyNoticeTextField);
        driver.element().type(AgencyNoticeTextField,AgencyContent+"Edit");}

        public String CheckTheUpdatedAgency(){
        return driver.element().getText(CheckUpdatedAgency);
    }

   // public void ClickOnTheDeletedTask(){
       // driver.element().click(DeleteTaskButton);
      //  driver.element().click(ConfirmDeleteTaskButton);
    }
//    public String CheckTheDeletedTask(){
//        return driver.element().getText(CheckDeletedTask);
//    }


