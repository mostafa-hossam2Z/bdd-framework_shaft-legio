package pages.LegalRequestsReceivedPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;

import static pages.CommonPages.base.driver;

public class AttachmentLegalRequestPage {
    By AttachmentTab=By.xpath("//a[contains(text(),'المرفقات')]");
    By AttachmentButton = By.xpath("//button[contains(text(),'إضافة مرفق')]");
    By AddAttachment = By.xpath("//input[@name='file']");
    String AttachmentLocation = "C:\\Users\\mostafa.hossam\\Downloads\\Competencies Template (2).xlsx";
    By SaveAttachmentBtn=By.xpath("//button[contains(text(),'حفظ')]");
    By CheckAttachmentUploaded=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[2]");

    By CheckAttachmentDeleted=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]");
    By ThreeDotsAttachment=By.xpath("//button[@class='rounded-circle position-absolute d-inline-flex align-items-center justify-content-center btn btn-primary btn-sm']");
    By DownloadAttachmentBtn=By.xpath("//a[contains(text(),'تحميل')]");
    By ConfirmDeleteBtn=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    String DownloadLocation = "C:/Users/mostafa.hossam/Downloads/Competencies-Template-(2).xlsx";
    File Folder = new File(DownloadLocation);
    public void ClickOnAttachmentTab(){
        driver.element().click(AttachmentTab);
    }

    public void UploadFileAttachment(){
        driver.element().click(AttachmentButton);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().typeFileLocationForUpload(AddAttachment, AttachmentLocation);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
    }
    public void ClickOnTheSaveUploadAttachment(){
        driver.element().click(SaveAttachmentBtn);}

    public String CheckUploadedAttachment(){
        try {Thread.sleep(1400);} catch (InterruptedException e) {throw new RuntimeException(e);}
        return driver.element().getText(CheckAttachmentUploaded);

    }
    public void ClickOnTheDownloadBtn(){
        driver.element().click(ThreeDotsAttachment);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(DownloadAttachmentBtn);

    }
    public String CheckDeletedAttachment(){
        return driver.element().getText(CheckAttachmentDeleted);
    }
    public void CheckDownloadedFile()
    {Assert.assertTrue(Folder.exists());}

}
