package pages.LegalProjectsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.LegalServicesPages.AddNewLegalServicePopUp.LegalServiceAddress;

public class LegalProjectDetailsPage {
    By AddNewLegalProjectBtn=By.xpath("//button[contains(text(),'مشروع قانوني جديد')]");
    By CheckAddedNewLegalProject=By.xpath("//div[contains(text(),'تم اضافة المشروع القانوني بنجاح')]");
    By CheckDeletedLegalProject=By.xpath("//div[contains(text(),'تم حذف المشروع القانوني بنجاح')]");
    By ProjectManagementBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/span[1]/span[2]");
    By LegalProjectsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[3]/a[1]/span[2]/span[1]");
    By SearchByLegalServiceAddress=By.xpath("//input[@id='filter-input-title']") ;
    By DeleteLegalServiceBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[2]");
    By ConfirmDeleteLegalService=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By ArchiveLegalProject=By.xpath("//button[contains(text(),'أرشفة المشروع')]");
    By UnArchiveLegalProject=By.xpath("//button[contains(text(),'إعادة فتح المشروع')]");

    public void ClickOnAddNewLegalProjectBtn() {driver.element().click(AddNewLegalProjectBtn);}
    public String CheckAddedNewLegalProjects() {return driver.element().getText(CheckAddedNewLegalProject);}
    public String CheckDeletedLegalProjects() {return driver.element().getText(CheckDeletedLegalProject);}

    public void DeleteLegalProject() {
        try {Thread.sleep(1400);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ProjectManagementBtn);
        driver.element().click(LegalProjectsPage);
        driver.element().type(SearchByLegalServiceAddress,LegalServiceAddress);
        driver.element().click(DeleteLegalServiceBtn);
        driver.element().click(ConfirmDeleteLegalService);}
    public void ClickOnArchiveProject() {
        driver.element().click(ArchiveLegalProject);}
    public void ClickOnUnArchiveProject() {
        driver.element().click(UnArchiveLegalProject);}


}
