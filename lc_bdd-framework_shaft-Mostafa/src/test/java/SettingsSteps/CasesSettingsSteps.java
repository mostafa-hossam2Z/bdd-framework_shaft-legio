package SettingsSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Case.AddNewCasePopUp;
import pages.Case.CaseDetailsPage;
import pages.CommonPages.Homepage;
import pages.LegalServicesPages.AddNewLegalServicePopUp;
import pages.SettingsPages.CasesSettingsDetailsPage;

public class CasesSettingsSteps {
   Homepage homepage=new Homepage();
    CaseDetailsPage CaseDetailsPageObj= new CaseDetailsPage();
    CasesSettingsDetailsPage CasesSettingsDetailsPageObj=new CasesSettingsDetailsPage();
 AddNewLegalServicePopUp AddNewLegalServicePopUpObj=new AddNewLegalServicePopUp();
    AddNewCasePopUp AddNewCasePopUpObj=new AddNewCasePopUp();
    @And("Click on Cases Settings From sidebar Menu")
    public void clickOnCasesSettingsFromSidebarMenu() {
        homepage.ClickOnCasesSettingsPage();
    }

    @When("User click on the Add new Case settings button")
    public void userClickOnTheAddNewCaseSettingsButton() {
         CaseDetailsPageObj.ClickOnAddNewCaseSettingsBtn();


    }

    @Then("Check that new Case type is added successfully")
    public void checkThatNewCaseTypeIsAddedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckAddedNewTypeCase(),"تم إضافة نوع القضية بنجاح");
    }

    @And("Search by case address")
    public void searchByCaseAddress() throws InterruptedException {
        CasesSettingsDetailsPageObj.SearchNewTypeCase();

    }

    @And("Click on the delete case type button")
    public void clickOnTheDeleteCaseTypeButton() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();
    }

    @And("Click on the Edit case type option")
    public void clickOnTheEditCaseTypeOption() {
        CasesSettingsDetailsPageObj.EditCaseTypeOption();
    }

    @Then("Check that new Case type is updated successfully")
    public void checkThatNewCaseTypeIsUpdatedSuccessfully() {
    Assert.assertEquals(CasesSettingsDetailsPageObj.CheckUpdatedTypeCase(),"تم تعديل نوع القضية بنجاح");
    }

    @Then("Check that new Case type is deleted successfully")
    public void checkThatNewCaseTypeIsDeletedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckDeletedTypeCase(),"تم حذف نوع القضية بنجاح");

    }

    @And("Click on Case models From sidebar Menu")
    public void clickOnCaseModelsFromSidebarMenu() {
     homepage.ClickOnCasesModelPage();
    }

    @When("User click on the Add new Case model button")
    public void userClickOnTheAddNewCaseModelButton() {
     CasesSettingsDetailsPageObj.ClickOnAddNewCaseModel();
    }

    @And("Select type of models")
    public void selectTypeOfModels() {
    }

    @Then("Check that new Case model is added successfully")
    public void checkThatNewCaseModelIsAddedSuccessfully() {
    }

 @And("Add the type model")
 public void addTheTypeModel() {
  CasesSettingsDetailsPageObj.AddNewTypeModel();

 }

 @And("Click on the save type model button")
 public void clickOnTheSaveTypeModelButton() {
  AddNewLegalServicePopUpObj.ClickOnSaveAddedNewLegalService();

 }

    @Then("Check that new type Case model is added successfully")
    public void checkThatNewTypeCaseModelIsAddedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckAddedNewTypeCaseModel(),"تم إضافة النموذج بنجاح");
    }

    @And("Search by case model address")
    public void searchByCaseModelAddress()throws InterruptedException {
        CasesSettingsDetailsPageObj.SearchNewCaseModel();

    }

    @And("Click on the delete case Model button")
    public void clickOnTheDeleteCaseModelButton() {
        CasesSettingsDetailsPageObj.DeleteCaseModelBtn();
    }

    @Then("Check that new type Case model is deleted successfully")
    public void checkThatNewTypeCaseModelIsDeletedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckDeletedTypeModel(),"تم حذف النموذج بنجاح");

    }

    @And("Click on the edit case Model button")
    public void clickOnTheEditCaseModelButton() {
        CasesSettingsDetailsPageObj.EditCaseModelBtn();

    }

    @Then("Check that new type Case model is updated successfully")
    public void checkThatNewTypeCaseModelIsUpdatedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckUpdatedTypeModel(),"تم تعديل النموذج بنجاح");
    }

    @And("Click on Case courts setting From sidebar Menu")
    public void clickOnCaseCourtsSettingFromSidebarMenu() {
        homepage.ClickOnCasesCourtPage();

    }

    @When("User click on the Add new Court button")
    public void userClickOnTheAddNewCourtButton() {
        CasesSettingsDetailsPageObj.ClickOnAddNewCourtBtn();
    }

    @And("Add new court name")
    public void addNewCourtName() throws InterruptedException{
        CasesSettingsDetailsPageObj.AddNewCourtName();
    }

    @And("Click on the save court button")
    public void clickOnTheSaveCourtButton() {
        AddNewCasePopUpObj.ClickOnSaveAddedNewCase();

    }

    @Then("Check that new court is added successfully")
    public void checkThatNewCourtIsAddedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckAddedCourt(),"تم إضافة المحكمة بنجاح");

    }

    @And("Click on the delete case court button")
    public void clickOnTheDeleteCaseCourtButton() {
        CasesSettingsDetailsPageObj.DeleteCourtBtn();
    }

    @Then("Check that the added court is deleted successfully")
    public void checkThatTheAddedCourtIsDeletedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckDeletedCourt(),"تم حذف المحكمة بنجاح");
    }

    @And("Change the court name")
    public void changeTheCourtName() {
        CasesSettingsDetailsPageObj.ChangeCourtName();
    }
    @And("Click on edit court button")
    public void clickOnEditCourtButton() {
        CasesSettingsDetailsPageObj.ClickOnEditBtn();
    }
    @Then("Check that the court name is updated successfully")
    public void checkThatTheCourtNameIsUpdatedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckUpdatedCourt(),"تم تعديل المحكمة بنجاح");
    }


}
