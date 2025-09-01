package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class ClientsPage {
    public static String AboutYourClients;
    public static String ClientsName;
    By ClientsTab = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]");
    By AboutYourClientsTextBox= By.xpath("//textarea[@id='bio']");
    By SaveAddedAboutYourClients=By.xpath("//span[contains(text(),'تعديل')]");
    By CheckAddedAboutYourServices=By.xpath("//div[@class='ant-notification-notice-message']");
    By AddClientsBtn=By.xpath("//span[contains(text(),'إضافة عميل')]");
    By ClientsNameTextBox=By.xpath("//input[@id='name']");
    By EditWorkExperienceNameTextBox=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By SaveAddNewClients=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/button[2]");
    By CheckAddedNewServiceName=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]");
    By EditClientsBtn=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/button[1]");
    By SaveEditClient=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/button[2]");
    By DeleteExperience=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
    By ConfirmDeleteExperience=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]");
    By UploadLogo=By.xpath("(//input[@id='logo'])[1]a");
    String AttachmentLocation = "\"C:\\Users\\mostafa.hossam\\Downloads\\Image (3).jpeg\"";
    By AttachmentBtn=By.xpath("//button[contains(text(),'إرفاق صورة العميل')]");
    public void ClickOnTheClientsTab() {
        driver.element().click(ClientsTab);}

    public void AddAboutYourClients() throws InterruptedException {
        AboutYourClients = faker.name().title();
        Thread.sleep(1500);
        driver.element().type(AboutYourClientsTextBox,AboutYourClients);}

    public void ClickOnSaveAddedAboutYourClients() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveAddedAboutYourClients);}


    public String CheckAddedAboutYourWorkExperience() {
        return driver.element().getText(CheckAddedAboutYourServices);
    }
    public void AddClientsBtn() {
        driver.element().click(AddClientsBtn);}



    public void AddNewClientsName()  {
        ClientsName = faker.name().title();
        driver.element().type(ClientsNameTextBox,ClientsName);
        driver.element().click(AttachmentBtn);
        driver.element().typeFileLocationForUpload(UploadLogo,AttachmentLocation);
    }

    public void ClickOnTheSaveAddNewClients() {
        driver.element().click(SaveAddNewClients);}

    public String CheckAddedServicesName() {
        return driver.element().getText(CheckAddedNewServiceName);
    }
    public void ClickOnTheEditClientsBtn() {
        driver.element().click(EditClientsBtn);}



    public void EditClientName()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(ClientsNameTextBox);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(ClientsNameTextBox,ClientsNameTextBox+"edit");
    }
    public void SaveEditClient()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveEditClient);}


    public void DeleteExperience()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(DeleteExperience);
        driver.element().click(ConfirmDeleteExperience);}
}
