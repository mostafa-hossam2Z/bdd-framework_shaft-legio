package pages.LegalRequestsReceivedPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewRequestPopUp {
    public static String LegalReceivedAddress;
    public static String LegalReceivedContent;

    By LegalReceivedAddressTextField=By.xpath("//input[@placeholder='اكتب الموضوع']");
    By LegalReceivedContentTextField=By.xpath("//textarea[@placeholder='اكتب المحتوى']");
    By AttachmentBtn=By.xpath("//button[contains(text(),'اضافة مرفق')]");
    By AttachmentInput=By.xpath("//input[@name='attachments.0.file']");
    String AttachmentLocation = "C:\\Users\\mostafa.hossam\\Downloads\\Competencies Template (2).xlsx";
    By SaveAddedNewLegalReceived=By.xpath("//button[contains(text(),'إرسال الطلب')]");

    public void EnterLegalReceivedAddress() {
        LegalReceivedAddress = faker.name().title();
        driver.element().type(LegalReceivedAddressTextField, LegalReceivedAddress);}

    public void EnterLegalReceivedContent() {
        LegalReceivedContent = faker.name().title();
        driver.element().type(LegalReceivedContentTextField, LegalReceivedContent);}



    public void UploadTheLegalReceivedAttachment() {
        driver.element().click(AttachmentBtn);
        driver.element().type(AttachmentInput,AttachmentLocation);
    }

    public void ClickOnSaveAddedNewLegalReceived() {
        try {Thread.sleep(1200);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveAddedNewLegalReceived);}

}
