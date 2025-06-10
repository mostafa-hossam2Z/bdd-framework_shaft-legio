package pages.CommonPages;


import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class Homepage {

   By ClickOnUserPage=By.xpath("//span[contains(text(),'المستخدمين')]");
   By ClickOnDepartmentPage=By.xpath("//span[@class='menu-title'][contains(text(),'الإدارات')]");
   By RulesPage=By.xpath("//span[contains(text(),'الأدوار')]");
   By MyProfilePage=By.xpath("//button[@id='user-dropdown-toggle']//img");
   By Profile=By.xpath("(//a[@class='menu-link px-5 d-flex gap-3 align-items-center'])[1]");
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







}
