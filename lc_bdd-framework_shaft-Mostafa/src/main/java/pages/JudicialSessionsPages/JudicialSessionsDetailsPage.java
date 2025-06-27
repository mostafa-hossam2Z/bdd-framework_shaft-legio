package pages.JudicialSessionsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

  public class JudicialSessionsDetailsPage {
    By AddNewJudicialSessionsBtn= By.xpath("//button[contains(text(),'جلسة جديدة')]");
    By CheckDeletedSession=By.xpath("//div[contains(text(),'تم حذف الجلسة بنجاح')]");

   public void ClickOnAddNewJudicialSessionsBtn(){
     driver.element().click(AddNewJudicialSessionsBtn);}
      public String CheckDeletedSession(){
         return driver.element().getText(CheckDeletedSession);}

}
