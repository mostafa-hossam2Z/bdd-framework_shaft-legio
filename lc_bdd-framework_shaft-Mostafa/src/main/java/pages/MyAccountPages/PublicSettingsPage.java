package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class PublicSettingsPage {
    public static String AgencyComment;
    public static String PhoneNumber;
    By ChangeBtnPhoneNumber=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/button[1]");
    By PhoneNumberTextField=By.xpath("//div[@class='ant-modal-body']//input[@id='phone']");
    By SavePublicSettingsBtn=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/button[1]");
    By ChooseCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[3]");
    By StartDateList=By.xpath("//input[contains(@placeholder,'اختر تاريخ البدء')]");
    By ChooseStartDate=By.xpath("//span[normalize-space()='20']");
    By EndDateList=By.xpath("//input[contains(@placeholder,'اختر تاريخ النهاية')]");
    By ChooseEndDate=By.xpath("//span[normalize-space()='30']");
    By AgencyCommentTextField=By.xpath("//textarea[@placeholder='ملاحظات']");
    By SaveAddedNewAgency=By.xpath("//button[contains(text(),'حفظ')]");

    public void EditPhoneNumber() throws InterruptedException {
        PhoneNumber = faker.number().digits(8);
        driver.element().click(ChangeBtnPhoneNumber);
        Thread.sleep(1000);
        driver.element().type(PhoneNumberTextField,"05"+PhoneNumber);
        Thread.sleep(1000);
        driver.element().clear(PhoneNumberTextField);
        driver.element().type(PhoneNumberTextField, PhoneNumber);
    }
    public void ClickOnTheSavePublicSettingsBtn() {
        driver.element().click(SavePublicSettingsBtn);

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
