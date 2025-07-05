package pages.SettingsPages;

import org.openqa.selenium.By;

import static pages.Case.AddNewCasePopUp.AddressName;
import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class CasesSettingsDetailsPage {
   By CheckAddedNewTypeCase=By.xpath("//div[contains(text(),'تم إضافة نوع القضية بنجاح')]");
   By SearchAddressCases=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
   By DeleteBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
   By ConfirmDeleteCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
   By EditCaseTypeOption=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]");
   By CheckUpdatedTypeCase=By.xpath("//div[contains(text(),'تم تعديل نوع القضية بنجاح')]");
   By CheckDeletedTypeCase=By.xpath("//div[contains(text(),'تم حذف نوع القضية بنجاح')]");
   By AddNewCaseModel=By.xpath("//button[contains(text(),'نموذج قضية جديد')]");By AddNewTypeModel=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[2]/button[1]/i[1]");
   By AddTextModelBtn=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[2]/div[1]/a[1]");
   By AddModelTextField=By.xpath("//input[@placeholder='أدخل مسمى']");By AddModelTextField2=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[2]/div[1]/div[1]/input[1]");By CheckAddedNewTypeModel=By.xpath("//div[contains(text(),'تم إضافة النموذج بنجاح')]");
   By SearchAddressCasesModels=By.xpath("//input[@id='filter-input-title']");
   By DeleteModelBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/button[2]");
   By ConfirmDeleteModelCase=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
   By CheckDeletedTypeModel=By.xpath("//div[contains(text(),'تم حذف النموذج بنجاح')]");
   By EditOption=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/button[1]");
   By CheckUpdatedTypeModel=By.xpath("//div[contains(text(),'تم تعديل النموذج بنجاح')]");
   By AddNewCourtBtn=By.xpath("//button[contains(text(),'محكمة جديدة')]");
   By CheckAddedCourt=By.xpath("//div[contains(text(),'تم إضافة المحكمة بنجاح')]");
   By DeleteCourtBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[2]");
   By ConfirmDeleteCourt=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
   public static String CourtName;
   By CourtNameTextField=By.xpath("//input[@placeholder='اكتب اسم المحكمة']");
   By CheckDeletedCourt=By.xpath("//div[contains(text(),'تم حذف المحكمة بنجاح')]");
   By EditCourtBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]");
   By CheckUpdateCourt=By.xpath("//div[contains(text(),'تم تعديل المحكمة بنجاح')]");



    public String CheckAddedNewTypeCase(){return driver.element().getText(CheckAddedNewTypeCase);}
    public void SearchNewTypeCase() throws InterruptedException {
        Thread.sleep(1400);
        driver.element().type(SearchAddressCases,AddressName);}
    public void DeleteCaseTypeBtn(){

        driver.element().click(DeleteBtn);
        driver.element().click(ConfirmDeleteCase);}
    public void EditCaseTypeOption() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EditCaseTypeOption);
    }
    public String CheckUpdatedTypeCase(){return driver.element().getText(CheckUpdatedTypeCase);}
    public String CheckDeletedTypeCase(){return driver.element().getText(CheckDeletedTypeCase);}
    public void ClickOnAddNewCaseModel(){ driver.element().click(AddNewCaseModel);}
    public void AddNewTypeModel(){
        driver.element().click(AddNewTypeModel);
        driver.element().click(AddTextModelBtn);
        driver.element().type(AddModelTextField,"SaudiArabia");
        driver.element().type(AddModelTextField2,"SaudiArabiaa");
    }
    public String CheckAddedNewTypeCaseModel(){return driver.element().getText(CheckAddedNewTypeModel);}
    public void SearchNewCaseModel()throws InterruptedException{
        Thread.sleep(1400);
        driver.element().type(SearchAddressCasesModels,AddressName);}

    public void DeleteCaseModelBtn(){
        driver.element().click(DeleteModelBtn);
        driver.element().click(ConfirmDeleteModelCase);}
    public String CheckDeletedTypeModel(){return driver.element().getText(CheckDeletedTypeModel);}
    public void EditCaseModelBtn(){driver.element().click(EditOption);}
    public String CheckUpdatedTypeModel(){return driver.element().getText(CheckUpdatedTypeModel);}
    public void ClickOnAddNewCourtBtn(){driver.element().click(AddNewCourtBtn);}
    public void AddNewCourtName()throws InterruptedException{
        Thread.sleep(1000);
        CourtName=faker.name().firstName();
        driver.element().type(CourtNameTextField,CourtName);}
    public String CheckAddedCourt(){return driver.element().getText(CheckAddedCourt);}
    public void DeleteCourtBtn(){
        driver.element().click(DeleteCourtBtn);
        driver.element().click(ConfirmDeleteCourt);}
    public String CheckDeletedCourt(){return driver.element().getText(CheckDeletedCourt);}
    public void ClickOnEditBtn(){driver.element().click(EditCourtBtn);}
    public void ChangeCourtName ()  {
        driver.element().clear(CourtNameTextField);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(CourtNameTextField, "Edit");}
    public String CheckUpdatedCourt(){return driver.element().getText(CheckUpdateCourt);}

}
