package pages.AgenciesAndDelegationsPages;

import org.openqa.selenium.By;

import static pages.AgenciesAndDelegationsPages.AddNewAgencies.AgencyNumber;
import static pages.CommonPages.base.driver;

public class AgenciesDetailsPage {
    By AddNewAgencyBtn= By.xpath("//button[contains(text(),'وكالة جديدة')]");
    By CheckAddedNewAgency= By.xpath("//div[contains(text(),'تم الاضافة بنجاح')]");
    By SearchByAgencyNumber= By.xpath("//input[@id='filter-input-number']");
    By DeleteAgencyBtn= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[2]");
    By ConfirmDeleteAgencyBtn= By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CheckDeletedAgency= By.xpath("//div[contains(text(),'تم حذف الوكالة بنجاح')]");
    By EditAgencyBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[1]/i[1]");

    public void ClickOnTheAddNewAgencyBtn() {
        driver.element().click(AddNewAgencyBtn);}

    public String CheckAddedNewAgency() {
       return driver.element().getText(CheckAddedNewAgency);}

    public void DeleteAgency() {
        driver.element().type(SearchByAgencyNumber,AgencyNumber);
        driver.element().click(DeleteAgencyBtn);
        driver.element().click(ConfirmDeleteAgencyBtn);
    }
    public String CheckDeletedAgency() {
        return driver.element().getText(CheckDeletedAgency);}
    public void ClickOnEditAgencyBtn() {
        driver.element().click(EditAgencyBtn);}
}

