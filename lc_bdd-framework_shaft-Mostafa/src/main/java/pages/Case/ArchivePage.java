package pages.Case;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class ArchivePage {
    public  static String ReportTitle;
    public  static String FinalReport;

    By ReportTitleTextField=By.xpath("//input[@name='title']");
    By ReportFinalTextField=By.xpath("//div[@aria-label='منطقة تحرير المحرر: main']");
    By SaveArchivedBtn=By.xpath("//button[contains(text(),'إتمام الأرشفة')]");
    By CheckArchived=By.xpath("//button[contains(text(),'إعادة فتح القضية')]");
    By UnArchiveBtn=By.xpath("//button[contains(text(),'أرشفة القضية')]");
    By UnArchivedBtn=By.xpath("//button[@type='submit'][contains(text(),'فتح القضية')]");

    public void EnterTheReportTitle(){
        ReportTitle=faker.name().title();
        driver.element().type(ReportTitleTextField,ReportTitle);
    }
    public void EnterTheFinalReport(){
        FinalReport=faker.toString().substring(0,20);
        driver.element().type(ReportFinalTextField,FinalReport);
    }
    public void ClickOnTheSaveArchivedBtn(){
        driver.element().click(SaveArchivedBtn);
    }
    public void ClickOnUnArchivedBtn(){
        driver.element().click(UnArchivedBtn);}
    public String CheckThatCaseArchived(){
        return driver.element().getText(CheckArchived);
    }

    public String CheckThatCaseUnArchived(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(UnArchiveBtn);}
}
