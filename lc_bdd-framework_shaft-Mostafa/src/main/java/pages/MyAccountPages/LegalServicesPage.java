package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class LegalServicesPage {
    public static String AboutYourServices;
    public static String ServiceName;
    By LegalServicesTab = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");
    By AboutYourServicesTextBox= By.xpath("//textarea[@id='bio']");
    By SaveAddedAboutYourServices=By.xpath("//button[@type='submit']");
    By CheckAddedAboutYourServices=By.xpath("//div[@class='ant-notification-notice-message']");
    By NewLegalServiceBtn=By.xpath("//span[contains(text(),'إضافة خدمة جديدة')]");
    By NewServiceNameTextBox=By.xpath("//input[@id='name']");
    By EditServiceNameTextBox=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]");
    By SaveAddNewService=By.xpath("(//button[@type='submit'])[2]");
    By CheckAddedNewServiceName=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]");
    By EditServiceBtn=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]");
    By DeleteService=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
    By ConfirmDeleteService=By.xpath("//span[contains(text(),'حذف الخدمة')]");
    public void ClickOnTheLegalServicesTab() {
        driver.element().click(LegalServicesTab);}

    public void AddAboutYourServices() throws InterruptedException {
        AboutYourServices = faker.name().title();
        driver.element().clear(AboutYourServicesTextBox);
        Thread.sleep(3000);
        driver.element().type(AboutYourServicesTextBox,AboutYourServices);}

    public void ClickOnSaveAddedAboutYourServices() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveAddedAboutYourServices);}

    public String CheckAddedAboutYourServices() {
       return driver.element().getText(CheckAddedAboutYourServices);
    }
    public void ClickOnAddNewLegalServiceBtn() {
        driver.element().click(NewLegalServiceBtn);}

    public void AddNewServiceName()  {
        ServiceName = faker.name().title();
        driver.element().type(NewServiceNameTextBox,ServiceName);}

    public void ClickOnTheSaveAddNewService() {
        driver.element().click(SaveAddNewService);}
    public String CheckAddedServicesName() {
        return driver.element().getText(CheckAddedNewServiceName);
    }
    public void ClickOnTheEditServiceBtn() {
        driver.element().click(EditServiceBtn);}

    public void EditServiceName()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(EditServiceNameTextBox);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(EditServiceNameTextBox,ServiceName+"edit");
         }
    public void DeleteService()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
          driver.element().click(DeleteService);
          driver.element().click(ConfirmDeleteService);

    }
}

