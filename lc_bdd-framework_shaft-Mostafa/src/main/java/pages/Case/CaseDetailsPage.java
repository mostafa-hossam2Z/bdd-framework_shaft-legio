package pages.Case;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.Case.AddNewCasePopUp.AddressName;
import static pages.Case.AddNewCasePopUp.CaseNumber;

public class CaseDetailsPage {
    By AddNewCase=By.xpath("//button[contains(text(),'قضية جديدة')]");
    By CheckNewCase=By.xpath("//div[contains(text(),'تم اضافة القضية بنجاح')]");
    By UpdateCase=By.xpath("//div[contains(text(),'تم تعديل القضية بنجاح')]");
    By EditCaseBtn=By.xpath("//tbody/tr[1]/td[7]/div[1]/button[2]/i[1]");
    By DeleteCaseBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[3]");
    By ConfirmDeleteCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CheckDeletedCase=By.xpath("//div[contains(text(),'تم حذف القضية')]");
    By CasesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]/span[2]");
    By SearchAddressName=By.xpath("//input[@id='filter-input-title']") ;
    By SearchCaseNumber=By.xpath("//input[@id='filter-input-number']");
    By CaseDetailsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]/i[1]");
    By AddNewSession=By.xpath("//button[contains(text(),'جلسة جديدة')]");
    By SessionsBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
    By ChatTabBtn=By.xpath("//a[contains(text(),'المحادثات')]");
    By AttachmentTabBtn=By.xpath("//a[contains(text(),'المرفقات')]");
    By TaskTabBtn=By.xpath("//a[contains(text(),'المهام')]");
    By AddTaskBtn=By.xpath("//button[contains(text(),'إضافة مهمة')]");
    By ReportTabBtn=By.xpath("//a[contains(text(),'التقارير')]");
    By AddReportBtn=By.xpath("//button[contains(text(),'إضافة تقرير')]");
    By AgencyTabBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]");
    By AgencyBtn=By.xpath("//button[contains(text(),'وكالة جديدة')]");
    By ContactTabBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/a[1]");
    By AddNewContactBtn=By.xpath("//button[contains(text(),'سجل تواصل جديد')]");
    By ArchiveBtn=By.xpath("//button[contains(text(),'أرشفة القضية')]");
    By UnArchiveBtn=By.xpath("//button[contains(text(),'إعادة فتح القضية')]");
    By LegalPage=By.xpath("//span[contains(text(),'خدمات قانونية')]");


    public void ClickOnAddNewCaseBtn()
    {

        driver.element().click(AddNewCase);
    }
    public void ClickOnCaseDetailsPage()
    {
        driver.element().click(CaseDetailsPage);
    }
    public String CheckAddedNewCase()
    {
        return driver.element().getText(CheckNewCase);
    }
    public String CheckUpdatedCase() throws InterruptedException {
        Thread.sleep(3000);
        return driver.element().getText(UpdateCase);
    }
    public String CheckThatCaseisDelted() throws InterruptedException {
        Thread.sleep(3000);
        return driver.element().getText(CheckDeletedCase);
    }

    public void ClickOnEditCaseBtn()
    {
       // driver.element().click(CasesPage);
        driver.element().click(EditCaseBtn);
    }
    public void SearchByAddressAndCaseNumber()
    {
        driver.element().click(CasesPage);
        driver.browser().refreshCurrentPage();
        driver.element().type(SearchAddressName,AddressName);
        driver.element().type(SearchCaseNumber,CaseNumber);

        driver.browser().refreshCurrentPage();

    }
    public void ClickOnDeleteCaseBtn()
    {
        try {Thread.sleep(1700);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.browser().refreshCurrentPage();
        //driver.element().click(CasesPage);
        driver.element().click(DeleteCaseBtn);
        driver.element().click(ConfirmDeleteCase);
    }
    public void ClickOnAddNewSessionBtn() {
        driver.element().click(SessionsBtn);
        driver.element().click(AddNewSession);}

    public void ClickOnChatBtn() {driver.element().click(ChatTabBtn);}
    public void ClickOnAttachmentBtn() {driver.element().click(AttachmentTabBtn);}
    public void ClickOnTaskTabBtn() {driver.element().click(TaskTabBtn);}
    public void ClickOnAddTaskBtn() {driver.element().click(AddTaskBtn);}
    public void ClickOnReportTabBtn() {driver.element().click(ReportTabBtn);}
    public void ClickOnAddReportTabBtn() {driver.element().click(AddReportBtn);}
    public void ClickOnAgencyTabBtn() {driver.element().click(AgencyTabBtn);}
    public void ClickOnAddNewAgencyBtn() {driver.element().click(AgencyBtn);}
    public void ClickOnContactTabBtn() {try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ContactTabBtn);}

    public void ClickOnAddNewContactBtn() {driver.element().click(AddNewContactBtn);}
    public void ClickOnArchiveBtn() {driver.element().click(ArchiveBtn);}
    public void ClickOnUnArchiveBtn() {driver.element().click(UnArchiveBtn);}







}
