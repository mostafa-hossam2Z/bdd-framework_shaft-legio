package pages.JudicialSessionsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

  public class JudicialSessionsDetailsPage {
    By AddNewJudicialSessionsBtn= By.xpath("//button[contains(text(),'جلسة جديدة')]");


   public void ClickOnAddNewJudicialSessionsBtn(){
     driver.element().click(AddNewJudicialSessionsBtn);}


}
