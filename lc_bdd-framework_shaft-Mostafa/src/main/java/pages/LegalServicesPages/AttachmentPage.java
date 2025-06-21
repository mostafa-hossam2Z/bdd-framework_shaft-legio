package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class AttachmentPage {
    By AttachmentButton = By.xpath("//button[contains(text(),'إضافة مرفق')]");
    By AddAttachment = By.xpath("//input[@name='attachment']");
    String AttachmentLocation = "C:\\Users\\mostafa.hossam\\Downloads\\Competencies Template (2).xlsx";
    By SaveAttachmentBtn=By.xpath("//button[contains(text(),'حفظ')]");
    By CheckAttachmentUploaded=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[2]");
   By CheckAttachmentDeleted=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    By ThreeDotsAttachment=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]");
    By DeleteAttachmentBtn=By.xpath("//a[contains(text(),'حذف')]");
    By ConfirmDeleteBtn=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
 public void UploadFileAttachment(){
     driver.element().click(AttachmentButton);
     try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
     driver.element().typeFileLocationForUpload(AddAttachment, AttachmentLocation);
     try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
     driver.element().click(SaveAttachmentBtn);
 }
 public String CheckUploadedAttachment(){
     return driver.element().getText(CheckAttachmentUploaded);

 }
    public void ClickOnTheDeleteBtn(){
        driver.element().click(ThreeDotsAttachment);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(DeleteAttachmentBtn);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ConfirmDeleteBtn);
    }
    public String CheckDeletedAttachment(){
        return driver.element().getText(CheckAttachmentDeleted);

 }
}
