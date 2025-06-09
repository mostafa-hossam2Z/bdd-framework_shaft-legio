package pages.CommonPages;


import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class Homepage {

   By ClickOnUserPage=By.xpath("//span[contains(text(),'المستخدمين')]");
   By ClickOnDepartmentPage=By.xpath("//span[@class='menu-title'][contains(text(),'الإدارات')]");
    By RulesPage=By.xpath("//span[contains(text(),'الأدوار')]");

    public void ClickOnUserPage(){
        driver.element().click(ClickOnUserPage);
    }

   public void ClickOnDepartmentPage(){
        driver.element().click(ClickOnDepartmentPage);
    }


    public void ClickOnRulesPage(){
        driver.element().click(RulesPage);
    }







}
