package pages.LegalServicesPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class CommunicationLogsPage {
  public static String SubjectName;
  public static String Content;
  By TypeList=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]");
  By ChooseType=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
  By SubjectText=By.xpath("//input[@placeholder='اكتب الموضوع']");
  By ContentText=By.xpath("//textarea[@placeholder='اكتب المحتوى']");
  By DateList=By.xpath("//input[@name='date']");
  By ChooseDate=By.xpath("//span[normalize-space()='29']");
  By TimeList=By.xpath("//input[@name='time']");
 // By EnterTime=By.xpath("//input[@name='time']");
  By AddAttachment=By.xpath("//input[@name='attachment']");
   String AttachmentLocation="C:\\Users\\mostafa.hossam\\Downloads\\Competencies Template (2).xlsx";
  By SaveAddedNewContactBtn=By.xpath("//button[contains(text(),'حفظ')]");
  By CheckAddedNewContact=By.xpath("//div[contains(text(),'تم إضافة السجل بنجاح')]");
  By DeleteContactBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[2]/i[1]");
  By ConfirmDeleteContactBtn=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]/p[1]");
  By CheckDeletedNewContact=By.xpath("//div[contains(text(),'تم حذف السجل بنجاح')]");
  By ContactDetailsBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[1]/i[1]");
  By DownloadBtn=By.xpath("//a[contains(text(),'تحميل المرفق')]");
    String DownloadLocation = "C:/Users/mostafa.hossam/Downloads/Survey Results - Per Course.xlsx";
    File Folder = new File(DownloadLocation);
  public void EnterDataOfAddNewContact() {
        driver.element().click(TypeList);
        driver.element().click(ChooseType);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        SubjectName=faker.name().title();
        driver.element().type(SubjectText,SubjectName);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        Content=faker.name().title();
        driver.element().type(ContentText,Content);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(DateList);
        driver.element().click(ChooseDate);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().type(TimeList,"11:59PM");
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().typeFileLocationForUpload(AddAttachment, AttachmentLocation);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

    }


    public void ClickOnTheSaveAddNewContactBtn() {
        driver.element().click(SaveAddedNewContactBtn);
    }

    public String CheckAddedNewContact() {
        return driver.element().getText(CheckAddedNewContact);
    }
    public void ClickOnTheDeleteContactBtn () {
        driver.element().click(DeleteContactBtn);
        driver.element().click(ConfirmDeleteContactBtn);
    }
    public String CheckDeletedNewContact() {
        return driver.element().getText(CheckDeletedNewContact);
    }

    public void ClickOnThContactDetailsBtn() {
        driver.element().click(ContactDetailsBtn);
   }
    public void ClickOnThContactDownloadBtn() {
        driver.element().click(DownloadBtn);
    }
    public void CheckDownloadedFile()
    {Assert.assertTrue(Folder.exists());}
}
