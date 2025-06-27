package pages.LegalRequestsReceivedPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class InquiryPage {
    By SentInquiry=By.xpath("//button[contains(text(),'إرسال')]");
    By InquiryTab=By.xpath("//a[contains(text(),'الإستفسارات')]");
    By AddInquiry=By.xpath("//button[contains(text(),'اضافة استفسار')]");
    public static String LegalReceivedInquiryAddress;
    public static String LegalReceivedInquiryContent;
    By LegalReceivedInquiryAddressTextField=By.xpath("//input[@placeholder='اكتب العنوان']");
    By LegalReceivedInquiryContentTextField=By.xpath("//textarea[@placeholder='اكتب المحتوى']");
    By AddResponseButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]/i[1]");
    By AddResponseButton2=By.xpath("//button[contains(text(),'إضافة رد')]");
    By AddContentOfResponse=By.xpath("//textarea[@placeholder='اكتب المحتوى']");
    By SentResponse=By.xpath("//button[contains(text(),'إرسال')]");
    By CheckAddedResponse=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]");
    By Close=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/button[1]");
    By DeleteResponseBtn=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]");
    By ConfirmDeleteResponseBtn=By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/button[2]/p[1]");
    By CheckDeletedResponse=By.xpath("//h3[contains(text(),'لا يوجد ردود')]");
    By DeleteInquiryBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
    By ConfirmDeleteInquiry=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]/p[1]");
    By CheckDeletedInquiry=By.xpath("//h4[contains(text(),'لا يوجد بيانات')]");

    public void ClickOnInquiryTab(){driver.element().click(InquiryTab);}
    public void ClickOnSentInquiry(){driver.element().click(SentInquiry);}
    public void ClickOnAddInquiry(){driver.element().click(AddInquiry);}
    public void EnterLegalReceivedInquiryAddress() {
        LegalReceivedInquiryAddress = faker.name().title();
        driver.element().type(LegalReceivedInquiryAddressTextField, LegalReceivedInquiryAddress);}

    public void EnterLegalReceivedInquiryContent() {
        LegalReceivedInquiryContent = faker.name().title();
        driver.element().type(LegalReceivedInquiryContentTextField, LegalReceivedInquiryContent);}
    public void ClickOnAddResponseButton(){driver.element().click(AddResponseButton);}
    public void AddResponseBody(){
        driver.element().click(AddResponseButton2);
        driver.element().type(AddContentOfResponse,"Response");
        driver.element().click(SentResponse);
    }
    public String CheckTheAddedResponse(){
        return driver.element().getText(CheckAddedResponse);}
    public void CloseSentRequestPopUp(){
        driver.element().click(Close);}

    public void DeleteResponseBody(){
        driver.element().click(DeleteResponseBtn);
        driver.element().click(ConfirmDeleteResponseBtn);
    }
    public String CheckTheDeletedResponse(){
        return driver.element().getText(CheckDeletedResponse);}

    public void DeleteInquiryBody(){
        driver.element().click(DeleteInquiryBtn);
        driver.element().click(ConfirmDeleteInquiry);
    }
    public String CheckTheDeletedInquiry(){
        return driver.element().getText(CheckDeletedInquiry);}

}
