package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class WorkExperiencePage {
    public static String AboutYourWorkExperience;
    public static String WorkExperienceName;
    By ClientsTab = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]");
    By AboutYourWorkExperienceTextBox= By.xpath("//textarea[@id='bio']");
    By SaveAddedAboutYourWorkExperience=By.xpath("//button[@type='submit']");
    By CheckAddedAboutYourServices=By.xpath("//div[@class='ant-notification-notice-message']");
    By AddWorkExperienceBtn=By.xpath("//span[contains(text(),'إضافة خبرة')]");
    By WorkExperienceNameTextBox=By.xpath("//input[@id='name']");
    By EditWorkExperienceNameTextBox=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By SaveAddNewWorkExperience=By.xpath("(//button[@type='submit'])[2]");
    By CheckAddedNewServiceName=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]");
    By EditExperienceBtn=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]");
    By SaveEditWorkExperience=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/button[2]");
    By DeleteExperience=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
    By ConfirmDeleteExperience=By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]");


    public void ClickOnTheWorkExperienceTab() {
        driver.element().click(ClientsTab);}

    public void AddAboutYourWorkExperience() throws InterruptedException {
        AboutYourWorkExperience = faker.name().title();
        Thread.sleep(1500);
        driver.element().type(AboutYourWorkExperienceTextBox,AboutYourWorkExperience);}

    public void ClickOnSaveAddedAboutYourWorkExperience() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveAddedAboutYourWorkExperience);}


    public String CheckAddedAboutYourWorkExperience() {
        return driver.element().getText(CheckAddedAboutYourServices);
    }
    public void AddWorkExperienceBtn() {
        driver.element().click(AddWorkExperienceBtn);}


    public void AddNewWorkExperienceName()  {
        WorkExperienceName = faker.name().title();
        driver.element().type(WorkExperienceNameTextBox,WorkExperienceName);}

    public void ClickOnTheSaveAddNewWorkExperience() {
        driver.element().click(SaveAddNewWorkExperience);}

    public String CheckAddedServicesName() {
        return driver.element().getText(CheckAddedNewServiceName);
    }
    public void ClickOnTheEditExperienceBtn() {
        driver.element().click(EditExperienceBtn);}


    public void EditWorkExperienceName()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(EditWorkExperienceNameTextBox);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(EditWorkExperienceNameTextBox,WorkExperienceName+"edit");
    }
    public void SaveEditWorkExperience()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(SaveEditWorkExperience);}

    public void DeleteExperience()  {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(DeleteExperience);
        driver.element().click(ConfirmDeleteExperience);}
}
