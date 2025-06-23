package pages.LegalProjectsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class ArchiveLegalProjectPage {
    public  static String UnArchivedLegalReason;
    public  static String FinalReport;

    By ArchiveReasonList=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    By SelectArchiveReason=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/div[2]");
    By SaveUnArchivedBtn=By.xpath("//button[contains(text(),'إعادة الفتح')]");
    By CheckArchived=By.xpath("//button[contains(text(),'إعادة فتح القضية')]");
    By UnArchiveLegalProjectBtn=By.xpath("//button[contains(text(),'أرشفة المشروع')]");
    By UnArchiveLegalServiceButton=By.xpath("//button[contains(text(),'إعادة فتح الخدمة')]");
    By CheckLegalProjectArchived=By.xpath("//button[contains(text(),'إعادة فتح المشروع')]");
    By UnArchivedLegalReasonTextBox=By.xpath("//div[@aria-label='منطقة تحرير المحرر: main']");
    public void EnterTheArchiveReason(){
        driver.element().click(ArchiveReasonList);
        driver.element().click(SelectArchiveReason);

    }
    public String CheckThatLegalProjectIsArchived(){
        return driver.element().getText(CheckLegalProjectArchived);}
    public void EnterTheReasonOfUnArchived(){
        UnArchivedLegalReason=faker.toString().substring(10);
        driver.element().type(UnArchivedLegalReasonTextBox,UnArchivedLegalReason);}

    public void ClickOnTheSaveUnArchivedBtn(){
        driver.element().click(SaveUnArchivedBtn);}

    public void ClickOnUnArchiveLegalServiceBtn(){driver.element().click(UnArchiveLegalServiceButton);}
    public String CheckThatCaseArchived(){
        return driver.element().getText(CheckArchived);
    }
    public String CheckThatLegalProjectIsUnArchived(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(UnArchiveLegalProjectBtn);}
}
