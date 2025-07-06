package SettingsSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Case.AddNewCasePopUp;
import pages.CommonPages.Homepage;
import pages.LegalServicesPages.AddNewLegalServicePopUp;
import pages.SettingsPages.CasesSettingsDetailsPage;
import pages.SettingsPages.LegalProjectsSettingsDetailsPage;

public class LegalProjectsSettingsSteps {
    Homepage homepage=new Homepage();
    LegalProjectsSettingsDetailsPage LegalProjectsSettingsDetailsPageObj=new LegalProjectsSettingsDetailsPage();
    AddNewCasePopUp AddNewCasePopUpObj=new AddNewCasePopUp();
    AddNewLegalServicePopUp AddNewLegalServicePopUpObj=new AddNewLegalServicePopUp();
    CasesSettingsDetailsPage CasesSettingsDetailsPageObj=new CasesSettingsDetailsPage();
    @And("Click on Legal project types Settings From sidebar Menu")
    public void clickOnLegalProjectTypesSettingsFromSidebarMenu() {
        homepage.ClickOnLegalProjectsTypesPage();
    }

    @When("User click on the Add new Legal project type settings button")
    public void userClickOnTheAddNewLegalProjectTypeSettingsButton() {
        LegalProjectsSettingsDetailsPageObj.ClickOnNewLegalProjectBtn();
    }

    @Then("Check that new Legal project type is added successfully")
    public void checkThatNewLegalProjectTypeIsAddedSuccessfully() {
        Assert.assertEquals(LegalProjectsSettingsDetailsPageObj.CheckAddNewLegalTypeProject(),"تم إضافة نوع المشروع بنجاح");
    }

    @Then("Check that the new type legal project is updated successfully")
    public void checkThatTheNewTypeLegalProjectIsUpdatedSuccessfully() {
        Assert.assertEquals(LegalProjectsSettingsDetailsPageObj.CheckUpdatedLegalProjectType(),"تم تعديل نوع المشروع بنجاح");
    }

    @Then("Check that new Legal project type is deleted successfully")
    public void checkThatNewLegalProjectTypeIsDeletedSuccessfully() {
        Assert.assertEquals(LegalProjectsSettingsDetailsPageObj.CheckDeletedLegalProjectType(),"تم حذف نوع المشروع بنجاح");

    }

    @And("Click on Legal project model Settings From sidebar Menu")
    public void clickOnLegalProjectModelSettingsFromSidebarMenu() {
        homepage.ClickOnLegalProjectsModelsPage();
    }

    @When("User click on the Add new Legal project model settings button")
    public void userClickOnTheAddNewLegalProjectModelSettingsButton() {
        LegalProjectsSettingsDetailsPageObj.ClickOnNewLegalProjectModelBtn();
    }

    @And("Click on reasons for archiving legal projects From sidebar Menu")
    public void clickOnReasonsForArchivingLegalProjectsFromSidebarMenu() {
        homepage.ClickOnArchiveLegalProjectPage();
    }

    @When("User click on the Add new reasons for archiving legal projects button")
    public void userClickOnTheAddNewReasonsForArchivingLegalProjectsButton() {
        LegalProjectsSettingsDetailsPageObj.ClickOnAddLegalProjectArchiveReasons();
    }

    @And("Add new Archive reasons name")
    public void addNewArchiveReasonsName() {
        AddNewCasePopUpObj.EnterAdressNameOfTheCase();

    }

    @And("Click on the save Add a new reasons for archiving legal projects button")
    public void clickOnTheSaveAddANewReasonsForArchivingLegalProjectsButton() {
        AddNewLegalServicePopUpObj.ClickOnSaveAddedNewLegalService();

    }

    @Then("Check that new Archive reasons is added successfully")
    public void checkThatNewArchiveReasonsIsAddedSuccessfully() {
        Assert.assertEquals(LegalProjectsSettingsDetailsPageObj.CheckAddedLegalProjectArchived(),"تم إضافة سبب الأرشفة بنجاح");
    }

    @And("Click on the delete Archive reasons  button")
    public void clickOnTheDeleteArchiveReasonsButton() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();

    }

    @Then("Check that Archive reason is deleted successfully")
    public void checkThatArchiveReasonIsDeletedSuccessfully() {
        Assert.assertEquals(LegalProjectsSettingsDetailsPageObj.CheckDeletedLegalProjectArchived(),"تم حذف سبب الأرشفة بنجاح");
    }

    @And("Click on the edit archive legal project button")
    public void clickOnTheEditArchiveLegalProjectButton() {
        LegalProjectsSettingsDetailsPageObj.ClickOnEditReasonLegalProject();

    }

    @Then("Check that the archive legal project reason is updated successfully")
    public void checkThatTheArchiveLegalProjectReasonIsUpdatedSuccessfully() {
    }


}
