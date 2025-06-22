package pages.LegalProjectsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class LegalProjectDetailsPage {
    By AddNewLegalProjectBtn=By.xpath("//button[contains(text(),'مشروع قانوني جديد')]");
    By CheckAddedNewLegalProject=By.xpath("//div[contains(text(),'تم اضافة المشروع القانوني بنجاح')]");
    By CheckDeletedLegalProject=By.xpath("//div[contains(text(),'تم حذف المشروع القانوني بنجاح')]");


    public void ClickOnAddNewLegalProjectBtn() {driver.element().click(AddNewLegalProjectBtn);}
    public String CheckAddedNewLegalProjects() {return driver.element().getText(CheckAddedNewLegalProject);}
    public String CheckDeletedLegalProjects() {return driver.element().getText(CheckDeletedLegalProject);}


}
