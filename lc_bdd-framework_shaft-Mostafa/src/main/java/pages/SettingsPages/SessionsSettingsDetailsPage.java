package pages.SettingsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class SessionsSettingsDetailsPage {
    By AddNewSessionType=By.xpath("//button[contains(text(),'نوع جلسة جديد')]");
    By CheckAddedNewSessions=By.xpath("//div[contains(text(),'تم إضافة النوع بنجاح')]");
    By CheckUpdatedSessionType=By.xpath("//div[contains(text(),'تم تعديل النوع بنجاح')]");
    By CheckDeletedSessionType=By.xpath("//div[contains(text(),'تم حذف النوع بنجاح')]");
    By AddNewSubSessionType=By.xpath("//button[contains(text(),'نوع جلسة فرعية جديد')]");
    By AddNewSessionProcedureBtn=By.xpath("//button[contains(text(),'إجراء جلسة جديد')]");
    By CheckAddedNewSessionsProcedure=By.xpath("//div[contains(text(),'تم إضافة الإجراء بنجاح')]");
    By CheckUpdatedSessionsProcedure=By.xpath("//div[contains(text(),'تم تعديل الإجراء بنجاح')]");
    By CheckDeletedSessionProcedure=By.xpath("//div[contains(text(),'تم حذف الإجراء بنجاح')]");

    public void ClickOnAddNewSessionType(){driver.element().click(AddNewSessionType);}
    public String CheckAddedNewSessions(){return  driver.element().getText(CheckAddedNewSessions);}
    public String CheckUpdatedSessionType(){return  driver.element().getText(CheckUpdatedSessionType);}
    public String CheckDeletedSessionType(){return  driver.element().getText(CheckDeletedSessionType);}
    public void ClickOnAddNewSubSessionType(){driver.element().click(AddNewSubSessionType);}
    public void ClickOnAddNewSessionProcedure(){driver.element().click(AddNewSessionProcedureBtn);}
    public String CheckAddedNewSessionsProcedure(){return  driver.element().getText(CheckAddedNewSessionsProcedure);}
    public String CheckUpdatedSessionsProcedure(){return  driver.element().getText(CheckUpdatedSessionsProcedure);}
    public String CheckDeletedSessionProcedure(){return  driver.element().getText(CheckDeletedSessionProcedure);}


}
