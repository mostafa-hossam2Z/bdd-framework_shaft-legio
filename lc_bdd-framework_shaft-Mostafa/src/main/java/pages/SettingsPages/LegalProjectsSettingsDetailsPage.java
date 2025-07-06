package pages.SettingsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class LegalProjectsSettingsDetailsPage {
    By NewLegalProjectBtn=By.xpath("//button[contains(text(),'نوع مشروع قانوني جديد')]");
    By CheckAddNewLegalProject=By.xpath("//div[contains(text(),'تم إضافة نوع المشروع بنجاح')]");
    By CheckUpdatedLegalProjectType=By.xpath("//div[contains(text(),'تم تعديل نوع المشروع بنجاح')]");
    By CheckDeletedLegalProjectType=By.xpath("//div[contains(text(),'تم حذف نوع المشروع بنجاح')]");
    By NewLegalProjectModelBtn=By.xpath("//button[contains(text(),'نموذج مشروع قانوني جديد')]");
    By AddLegalProjectArchiveReasons=By.xpath("//button[contains(text(),'سبب أرشفة جديد')]");
    By CheckAddedLegalProjectArchived=By.xpath("//div[contains(text(),'تم إضافة سبب الأرشفة بنجاح')]");
    By CheckDeletedLegalProjectArchived=By.xpath("//div[contains(text(),'تم حذف سبب الأرشفة بنجاح')]");
    By EditReasonLegalProject=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]");
    public void ClickOnNewLegalProjectBtn(){driver.element().click(NewLegalProjectBtn);}
    public String CheckAddNewLegalTypeProject(){return driver.element().getText(CheckAddNewLegalProject);}
    public String CheckUpdatedLegalProjectType(){return driver.element().getText(CheckUpdatedLegalProjectType);}
    public String CheckDeletedLegalProjectType(){return driver.element().getText(CheckDeletedLegalProjectType);}
    public void ClickOnNewLegalProjectModelBtn(){driver.element().click(NewLegalProjectModelBtn);}
    public void ClickOnAddLegalProjectArchiveReasons(){driver.element().click(AddLegalProjectArchiveReasons);}
    public String CheckAddedLegalProjectArchived(){return driver.element().getText(CheckAddedLegalProjectArchived);}
    public String CheckDeletedLegalProjectArchived(){return driver.element().getText(CheckDeletedLegalProjectArchived);}
    public void ClickOnEditReasonLegalProject(){driver.element().click(EditReasonLegalProject);}




}
