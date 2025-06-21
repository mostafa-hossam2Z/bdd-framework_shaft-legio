package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class TaskPopUpPage {
    public static String TaskAddress;
    public static String TaskContent;
    By TaskAddressTextField = By.xpath("//input[@placeholder='ادخل عنوان المهمة']");
    By TaskContentTextField=By.xpath("//textarea[@placeholder='ادخل محتوى المهمة']");
    By PriorityLevelList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/select[1]");
    By DateList = By.xpath("//input[@placeholder='yyyy/mm/dd']");
    By EnterDateList = By.xpath("//span[normalize-space()='29']");
    By LawyerList = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/div[1]/div[1]/div[2]");
    By ChooseLawyer = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/div[2]/div[1]/div[1]");
    By SaveAddedTask = By.xpath("//button[contains(text(),'حفظ')]");
    By CheckAddedTask=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
    By DeleteTaskButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]");
    By ConfirmDeleteTaskButton=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CheckDeletedTask=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");


    public void EnterTaskDataFields() {
        TaskAddress = faker.number().digits(12);
        driver.element().type(TaskAddressTextField,TaskAddress );
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        TaskContent=faker.name().toString();
        driver.element().type(TaskContentTextField,TaskContent);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().select(PriorityLevelList,"متوسط");
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(DateList);
        driver.element().click(EnterDateList);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(LawyerList);
        driver.element().click(ChooseLawyer);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(LawyerList);
        driver.element().click(SaveAddedTask);
    }

    public String CheckAddedTask(){
        return driver.element().getText(CheckAddedTask);
}
    public void ClickOnTheDeletedTask(){
         driver.element().click(DeleteTaskButton);
        driver.element().click(ConfirmDeleteTaskButton);
    }
    public String CheckTheDeletedTask(){
        return driver.element().getText(CheckDeletedTask);
    }

}
