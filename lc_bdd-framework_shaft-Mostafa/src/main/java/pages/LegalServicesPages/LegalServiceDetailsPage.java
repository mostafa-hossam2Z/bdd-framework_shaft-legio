package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.Case.AddNewCasePopUp.AddressName;
import static pages.Case.AddNewCasePopUp.CaseNumber;
import static pages.CommonPages.base.driver;
import static pages.LegalServicesPages.AddNewLegalServicePopUp.LegalServiceAddress;

public class LegalServiceDetailsPage {
    By AddNewLegalServiceBtn=By.xpath("//button[contains(text(),'خدمة قانونية جديدة')]");
    By CheckAddedNewLegal=By.xpath("//div[contains(text(),'تم اضافة الخدمة القانونية بنجاح')]");

    By UpdateCase=By.xpath("//div[contains(text(),'تم تعديل القضية بنجاح')]");
    By EditCaseBtn=By.xpath("//tbody/tr[1]/td[7]/div[1]/button[2]/i[1]");
    By DeleteLegalServiceBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[2]");
    By ConfirmDeleteLegalService=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CheckDeletedLegalServices=By.xpath("//div[contains(text(),'تم حذف الخدمة القانونية بنجاح')]");
    By CasesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]/span[2]");
    By SearchByLegalServiceAddress=By.xpath("//input[@id='filter-input-title']") ;
    By SearchCaseNumber=By.xpath("//input[@id='filter-input-number']");
    By LegalServicesDetailsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]/i[1]");
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
    By ProjectManagementBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/span[1]/span[2]");
    By CommunicationServiceLegalTab=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]");
    By ArchiveLegalService=By.xpath("//button[contains(text(),'أرشفة الخدمة')]");
    public void ClickOnAddNewLegalServiceBtn() {driver.element().click(AddNewLegalServiceBtn);}
    public void ClickOnLegalServicesDetailsPage()
    {driver.element().click(LegalServicesDetailsPage);}
    public String CheckAddedNewLegalServices() {return driver.element().getText(CheckAddedNewLegal);}
    public String CheckUpdatedCase() throws InterruptedException {
        Thread.sleep(3000);
        return driver.element().getText(UpdateCase);
    }
    public String CheckThatLegalServicesIsDeleted()  {
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        return driver.element().getText(CheckDeletedLegalServices);
    }

    public void ClickOnEditLegalServiceBtn()
    {
       // driver.element().click(CasesPage);
        driver.element().click(EditCaseBtn);
    }
    public void SearchByLegalServiceAddress()
    {
       // driver.browser().refreshCurrentPage();
        driver.element().type(SearchByLegalServiceAddress,LegalServiceAddress);
        //  driver.browser().refreshCurrentPage();

    }
    public void ClickOnDeleteLegalServiceBtn()
    {
        try {Thread.sleep(1700);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.browser().refreshCurrentPage();
        driver.element().click(DeleteLegalServiceBtn);
        driver.element().click(ConfirmDeleteLegalService);
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
    public void ClickOnContactTabBtn() {driver.element().click(ContactTabBtn);}
    public void ClickOnAddNewContactBtn() {driver.element().click(AddNewContactBtn);}
    public void ClickOnArchiveBtn() {driver.element().click(ArchiveBtn);}
    public void ClickOnUnArchiveBtn() {driver.element().click(UnArchiveBtn);}
    public void ClickOnLegalPage() {driver.element().click(LegalPage);}
    public void DeleteLegalService() {
        try {Thread.sleep(1400);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ProjectManagementBtn);
        driver.element().click(LegalPage);
        driver.element().type(SearchByLegalServiceAddress,LegalServiceAddress);
        driver.element().click(DeleteLegalServiceBtn);
        driver.element().click(ConfirmDeleteLegalService);
    }

    public void ClickOnCommunicationServiceLegalTab() {
        driver.element().click(CommunicationServiceLegalTab);}

    public void ClickOnArchiveService() {
        driver.element().click(ArchiveLegalService);}




}
