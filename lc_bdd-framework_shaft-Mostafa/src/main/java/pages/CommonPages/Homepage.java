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






}
