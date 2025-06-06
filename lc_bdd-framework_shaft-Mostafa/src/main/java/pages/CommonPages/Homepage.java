package pages.CommonPages;


import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class Homepage {

   By ClickOnUserPage=By.xpath("//span[contains(text(),'المستخدمين')]");



    public void ClickOnUserPage(){
        driver.element().click(ClickOnUserPage);
    }
   // public void ClickOnAdministration(){
       // driver.element().click();
    //}







}
