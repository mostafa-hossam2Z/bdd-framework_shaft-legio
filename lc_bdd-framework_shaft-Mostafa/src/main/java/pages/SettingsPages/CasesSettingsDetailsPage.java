package pages.SettingsPages;

import org.openqa.selenium.By;

import static pages.Case.AddNewCasePopUp.AddressName;
import static pages.CommonPages.base.driver;

public class CasesSettingsDetailsPage {
    By CheckAddedNewTypeCase=By.xpath("//div[contains(text(),'تم إضافة نوع القضية بنجاح')]");
    By SearchAddressCases=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
    By DeleteBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
    By ConfirmDeleteCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By EditCaseTypeOption=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]");
    By CheckUpdatedTypeCase=By.xpath("//div[contains(text(),'تم تعديل نوع القضية بنجاح')]");
    By CheckDeletedTypeCase=By.xpath("//div[contains(text(),'تم حذف نوع القضية بنجاح')]");

    public String CheckAddedNewTypeCase(){return driver.element().getText(CheckAddedNewTypeCase);}
    public void SearchNewTypeCase(){ driver.element().type(SearchAddressCases,AddressName);}
    public void DeleteCaseTypeBtn(){
        driver.element().click(DeleteBtn);
        driver.element().click(ConfirmDeleteCase);}
    public void EditCaseTypeOption() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EditCaseTypeOption);
    }
    public String CheckUpdatedTypeCase(){return driver.element().getText(CheckUpdatedTypeCase);}
    public String CheckDeletedTypeCase(){return driver.element().getText(CheckDeletedTypeCase);}

}
