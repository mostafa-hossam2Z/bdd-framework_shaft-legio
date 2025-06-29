package pages.AgenciesAndDelegationsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewAgencies {
    public static String AgencyComment;
    public static String AgencyNumber;
    By AgencyNumberTextField=By.xpath("//input[@placeholder='اكتب رقم الوكالة']");
    By CaseLists=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
    By ChooseCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[3]");
    By StartDateList=By.xpath("//input[contains(@placeholder,'اختر تاريخ البدء')]");
    By ChooseStartDate=By.xpath("//span[normalize-space()='20']");
    By EndDateList=By.xpath("//input[contains(@placeholder,'اختر تاريخ النهاية')]");
    By ChooseEndDate=By.xpath("//span[normalize-space()='30']");
    By AgencyCommentTextField=By.xpath("//textarea[@placeholder='ملاحظات']");
    By SaveAddedNewAgency=By.xpath("//button[contains(text(),'حفظ')]");

    public void EnterAgencyNumber() {
        AgencyNumber = faker.number().digits(12);
        driver.element().type(AgencyNumberTextField, AgencyNumber);}
    public void SelectTheCase() {
        driver.element().click(CaseLists);
        driver.element().click(ChooseCase);
        driver.element().click(CaseLists);
    }
    public void ChooseStartDate() {
        driver.element().click(StartDateList);
        driver.element().click(ChooseStartDate);}
    public void ChooseEndDate() {
        driver.element().click(EndDateList);
        driver.element().click(ChooseEndDate);}
    public void EnterComment() {
        AgencyComment = faker.name().title();
        driver.element().type(AgencyCommentTextField, AgencyComment);
    }

    public void ClickOnSaveAddedNewAgency() {

        driver.element().click(SaveAddedNewAgency);
    }
    public void ChangeAddressName ()  {

        driver.element().clear(AgencyCommentTextField);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().type(SaveAddedNewAgency, "Edit");

    }
}
