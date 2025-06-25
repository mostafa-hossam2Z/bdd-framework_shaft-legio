package pages.LegalRequestsReceivedPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.LegalRequestsReceivedPages.AddNewRequestPopUp.LegalReceivedAddress;

public class LegalRequestsReceivedDetailsPage {
    By AddRequestBtn=By.xpath("//button[contains(text(),'اضافة طلب')]");
    By CheckAddedRequest=By.xpath("//div[@role='alert']");
    By SearchByLegalReceivedAddress=By.xpath("//input[@id='filter-input-subject']");
    By DeleteReceivedBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[2]/i[1]");
    By ConfirmDeleteReceivedBtn=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By CheckDeletedRequest=By.xpath("//h4[contains(text(),'لا يوجد بيانات')]");
    By LegalRequestReceivedDetailsBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]");
    By LegalRequestsReceived=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/span[2]");


    public void ClickOnAddRequestBtn(){driver.element().click(AddRequestBtn);}
    public String CheckAddedRequest(){return driver.element().getText(CheckAddedRequest);}
    public void SearchByLegalReceivedAddress()
    {
        try {Thread.sleep(1400);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(SearchByLegalReceivedAddress,LegalReceivedAddress);}

    public void ClickOnDeleteRequestReceived(){
        driver.element().click(DeleteReceivedBtn);
        driver.element().click(ConfirmDeleteReceivedBtn);}
    public String CheckDeletedRequest(){return driver.element().getText(CheckDeletedRequest);}

    public void ClickOnLegalRequestReceivedDetailsBtn(){
        driver.element().click(LegalRequestReceivedDetailsBtn);}

    public void ClickOnDeleteRequestReceivedFromSideBarMenu(){
        driver.element().click(LegalRequestsReceived);
        driver.element().type(SearchByLegalReceivedAddress,LegalReceivedAddress);
        driver.element().click(DeleteReceivedBtn);
        driver.element().click(ConfirmDeleteReceivedBtn);}

}
