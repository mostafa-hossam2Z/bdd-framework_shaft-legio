package pages.SettingsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class LegalServicesSettingsDetailsPage {
    By AddNewLegalServiceType=By.xpath("//button[contains(text(),'نوع خدمة قانونية جديد')]");
    By CheckAddedNewLegalProjectType=By.xpath("//div[contains(text(),'تم إضافة نوع الخدمة بنجاح')]");
    By CheckUpdatedLegalProjectType=By.xpath("//div[contains(text(),'تم تعديل نوع الخدمة بنجاح')]");
    By CheckDeletedLegalProjectType=By.xpath("//div[contains(text(),'تم حذف نوع الخدمة بنجاح')]");
    By AddNewLegalServiceModelBtn=By.xpath("//button[contains(text(),'نموذج خدمة قانونية جديد')]");
    By CheckAddedNewLegalServiceModel=By.xpath("//div[contains(text(),'تم إضافة النموذج بنجاح')]");


    public void ClickOnAddNewLegalServiceType(){driver.element().click(AddNewLegalServiceType);}
    public String CheckAddedNewLegalProjectType(){return driver.element().getText(CheckAddedNewLegalProjectType);}
    public String CheckUpdatedLegalProjectType(){return driver.element().getText(CheckUpdatedLegalProjectType);}
    public String CheckDeletedLegalProjectType(){return driver.element().getText(CheckDeletedLegalProjectType);}
    public void ClickOnAddNewLegalServiceModelBtn(){driver.element().click(AddNewLegalServiceModelBtn);}
    public String CheckAddedNewLegalServiceModel(){return driver.element().getText(CheckAddedNewLegalServiceModel);}


}
