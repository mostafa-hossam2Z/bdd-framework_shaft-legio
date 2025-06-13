package pages.ProjectManagement;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.ProjectManagement.AddNewCasePopUp.AddressName;
import static pages.ProjectManagement.AddNewCasePopUp.CaseNumber;
import static pages.Users.AddNewUserPopUp.Name;

public class CaseDetailsPage {
    By AddNewCase=By.xpath("//button[contains(text(),'قضية جديدة')]");
    By CheckNewCase=By.xpath("//div[contains(text(),'تم اضافة القضية بنجاح')]");
    By UpdateCase=By.xpath("//div[contains(text(),'تم تعديل القضية بنجاح')]");
    By EditCaseBtn=By.xpath("//tbody/tr[1]/td[7]/div[1]/button[2]/i[1]");
    By DeleteCaseBtn=By.xpath("//tbody/tr[1]/td[7]/div[1]/button[3]");
    By ConfirmDeleteCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CheckDeletedCase=By.xpath("//div[contains(text(),'تم حذف القضية')]");
    By CasesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]/span[2]");
    By SearchAddressName=By.xpath("//input[@id='filter-input-title']") ;
    By SearchCaseNumber=By.xpath("//input[@id='filter-input-number']");
    public void ClickOnAddNewCaseBtn()
    {

        driver.element().click(AddNewCase);
    }
    public String CheckAddedNewCase()
    {
        return driver.element().getText(CheckNewCase);
    }
    public String CheckUpdatedCase() throws InterruptedException {
        Thread.sleep(3000);
        return driver.element().getText(UpdateCase);
    }
    public String CheckThatCaseisDelted() throws InterruptedException {
        Thread.sleep(3000);
        return driver.element().getText(CheckDeletedCase);
    }

    public void ClickOnEditCaseBtn()
    {
       // driver.element().click(CasesPage);
        driver.element().click(EditCaseBtn);
    }
    public void SearchByAddressAndCaseNumber()
    {
        driver.element().click(CasesPage);
        driver.browser().refreshCurrentPage();
        driver.element().type(SearchAddressName,AddressName);
        driver.element().type(SearchCaseNumber,CaseNumber);

        driver.browser().refreshCurrentPage();

    }
    public void ClickOnDeleteCaseBtn()
    {
        driver.element().click(CasesPage);
        driver.element().click(DeleteCaseBtn);
        driver.element().click(ConfirmDeleteCase);


    }
}
