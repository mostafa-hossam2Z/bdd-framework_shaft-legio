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
import pages.SettingsPages.LegalServicesSettingsDetailsPage;

public class LegalServicesSettingsSteps {
    Homepage homepage=new Homepage();
    LegalProjectsSettingsDetailsPage LegalProjectsSettingsDetailsPageObj=new LegalProjectsSettingsDetailsPage();
    AddNewCasePopUp AddNewCasePopUpObj=new AddNewCasePopUp();
    AddNewLegalServicePopUp AddNewLegalServicePopUpObj=new AddNewLegalServicePopUp();
    CasesSettingsDetailsPage CasesSettingsDetailsPageObj=new CasesSettingsDetailsPage();
    LegalServicesSettingsDetailsPage LegalServicesSettingsDetailsPageObj=new LegalServicesSettingsDetailsPage();

    @And("Click on Legal services types Settings From sidebar Menu")
    public void clickOnLegalServicesTypesSettingsFromSidebarMenu() {
        homepage.ClickOnLegalServicesPage();
    }

    @When("User click on the Add new Legal services type settings button")
    public void userClickOnTheAddNewLegalServicesTypeSettingsButton() {
        LegalServicesSettingsDetailsPageObj.ClickOnAddNewLegalServiceType();
    }

    @Then("Check that new Legal services type is added successfully")
    public void checkThatNewLegalServicesTypeIsAddedSuccessfully() {
        Assert.assertEquals(LegalServicesSettingsDetailsPageObj.CheckAddedNewLegalProjectType(),"تم إضافة نوع الخدمة بنجاح");
    }
    @Then("Check that the new type legal service is updated successfully")
    public void checkThatTheNewTypeLegalServiceIsUpdatedSuccessfully() {
        Assert.assertEquals(LegalServicesSettingsDetailsPageObj.CheckUpdatedLegalProjectType(),"تم تعديل نوع الخدمة بنجاح");

    }

    @And("Click one delete legal service type btn")
    public void clickOneDeleteLegalProjectTypeBtn() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();

    }

    @Then("Check that new Legal service type is deleted successfully")
    public void checkThatNewLegalServiceTypeIsDeletedSuccessfully() {
        Assert.assertEquals(LegalServicesSettingsDetailsPageObj.CheckDeletedLegalProjectType(),"تم حذف نوع الخدمة بنجاح");
    }

    @And("Click on Legal service model Settings From sidebar Menu")
    public void clickOnLegalServiceModelSettingsFromSidebarMenu() {
        homepage.ClickOnLegalServicesModelPage();
    }

    @When("User click on the Add new Legal service model settings button")
    public void userClickOnTheAddNewLegalServiceModelSettingsButton() {
        LegalServicesSettingsDetailsPageObj.ClickOnAddNewLegalServiceModelBtn();
    }

    @Then("Check that new legal service model is added successfully")
    public void checkThatNewLegalServiceModelIsAddedSuccessfully() {
        Assert.assertEquals(LegalServicesSettingsDetailsPageObj.CheckAddedNewLegalServiceModel(),"تم إضافة النموذج بنجاح");
    }

    @When("User click on the Add new reasons for archiving legal service button")
    public void userClickOnTheAddNewReasonsForArchivingLegalServiceButton() {
        LegalProjectsSettingsDetailsPageObj.ClickOnAddLegalProjectArchiveReasons();

    }

    @And("Click on reasons for archiving legal service From sidebar Menu")
    public void clickOnReasonsForArchivingLegalServiceFromSidebarMenu() {
        homepage.ClickOnLegalServicesArchivePage();
    }


}
