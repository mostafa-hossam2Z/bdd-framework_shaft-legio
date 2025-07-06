package pages.CommonPages;


import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class Homepage {

   By ClickOnUserPage=By.xpath("//span[contains(text(),'المستخدمين')]");
   By ClickOnDepartmentPage=By.xpath("//span[@class='menu-title'][contains(text(),'الإدارات')]");
   By RulesPage=By.xpath("//span[contains(text(),'الأدوار')]");
   By MyProfilePage=By.xpath("//button[@id='user-dropdown-toggle']//img");
   By Profile=By.xpath("(//a[@class='menu-link px-5 d-flex gap-3 align-items-center'])[1]");
   By ProjectManagementBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/span[1]/span[2]");
   By CasesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]/span[2]");
   By LegalPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/a[1]/span[2]/span[1]");
   By LegalProjectsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[3]/a[1]/span[2]/span[1]");
   By LegalRequestsReceived=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/span[2]");
   By JudicialSessionsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]");
   By AgenciesAndDelegationsPage=By.xpath("//span[contains(text(),'الوكالات والتفاويض')]");
   By CommunicationLogs=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[11]/a[1]/span[2]");
   By SettingsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/span[1]/span[2]");
   By CasesSettingsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[1]/span[1]/span[2]");
   By CasesTypeSettings=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]");
   By CasesModelSettings=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[2]/a[1]/span[2]");
   By CasesCourtPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[3]/a[1]/span[2]");
   By SessionsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[4]/span[1]/span[2]");
   By SessionsTypesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[4]/div[1]/div[1]/a[1]/span[2]");
   By LegalProjectPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[2]/span[1]/span[2]");
   By LegalProjectTypesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[2]/div[1]/div[1]/a[1]/span[2]");
   By LegalProjectModelsPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[2]/div[1]/div[2]/a[1]/span[2]");
   By ArchiveLegalProjectBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[2]/div[1]/div[3]/a[1]/span[2]");
   By LegalServicePage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[3]/span[1]/span[2]");
   By LegalServiceTypesBtn=By.xpath("//span[contains(text(),'أنواع الخدمات القانونية')]");
   By LegalServicesModel=By.xpath("//span[contains(text(),'نماذج الخدمات القانونية')]");
   By LegalServicesArchivePage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[3]/div[1]/div[3]/a[1]/span[2]");
   By SubSessionPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[4]/div[1]/div[2]/a[1]/span[2]");
   By SessionProcedurePage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]/div[4]/div[1]/div[3]/a[1]/span[2]");
   public void ClickOnUserPage(){
        driver.element().click(ClickOnUserPage);
    }

   public void ClickOnDepartmentPage(){
        driver.element().click(ClickOnDepartmentPage);
    }


    public void ClickOnRulesPage(){
        driver.element().click(RulesPage);
    }
    public void GoToProfile(){
        driver.element().click(MyProfilePage);
        driver.element().click(Profile);
    }
    public void ClickOnCasesPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ProjectManagementBtn);
        driver.element().click(CasesPage);

    }
    public void ClickOnLegalPage() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ProjectManagementBtn);
        driver.element().click(LegalPage);
    }
    public void ClickOnLegalProjectsPage() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ProjectManagementBtn);
        driver.element().click(LegalProjectsPage);
    }
    public void ClickOnLegalRequestsReceivedPage(){
        driver.element().click(LegalRequestsReceived);
    }
    public void ClickOnJudicialSessionsPage(){
        driver.element().click(JudicialSessionsPage);
    }
    public void ClickOnAgenciesAndDelegationsPage(){
        driver.element().click(AgenciesAndDelegationsPage);
    }
    public void ClickOnCommunicationLogsPage(){
        driver.element().click(CommunicationLogs);
    }
    public void ClickOnCasesSettingsPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(CasesSettingsPage);
        driver.element().click(CasesTypeSettings);
    }
    public void ClickOnCasesModelPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(CasesSettingsPage);
        driver.element().click(CasesModelSettings);}

    public void ClickOnCasesCourtPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(CasesSettingsPage);
        driver.element().click(CasesCourtPage);}

    public void ClickOnLegalProjectsTypesPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(LegalProjectPage);
        driver.element().click(LegalProjectTypesPage);}
    public void ClickOnLegalProjectsModelsPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(LegalProjectPage);
        driver.element().click(LegalProjectModelsPage);}
    public void ClickOnArchiveLegalProjectPage(){
        driver.element().click(SettingsPage);
        driver.element().click(LegalProjectPage);
        driver.element().click(ArchiveLegalProjectBtn);}

    public void ClickOnLegalServicesPage(){
        driver.element().click(SettingsPage);
        driver.element().click(LegalServicePage);
        driver.element().click(LegalServiceTypesBtn);}

    public void ClickOnLegalServicesModelPage(){
        driver.element().click(SettingsPage);
        driver.element().click(LegalServicePage);
        driver.element().click(LegalServicesModel);}
    public void ClickOnLegalServicesArchivePage(){
        driver.element().click(SettingsPage);
        driver.element().click(LegalServicePage);
        driver.element().click(LegalServicesArchivePage);}

    public void ClickOnTypesOfSessionsPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(SessionsPage);
        driver.element().click(SessionsTypesPage);}

    public void ClickOnSubSessionsTypePage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(SessionsPage);
        driver.element().click(SubSessionPage);}

    public void ClickOnSessionsActionPage(){
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SettingsPage);
        driver.element().click(SessionsPage);
        driver.element().click(SessionProcedurePage);}
}

