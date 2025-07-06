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
import pages.SettingsPages.SessionsSettingsDetailsPage;

public class SessionsSettingsSteps {
    Homepage homepage=new Homepage();
    LegalProjectsSettingsDetailsPage LegalProjectsSettingsDetailsPageObj=new LegalProjectsSettingsDetailsPage();
    AddNewCasePopUp AddNewCasePopUpObj=new AddNewCasePopUp();
    AddNewLegalServicePopUp AddNewLegalServicePopUpObj=new AddNewLegalServicePopUp();
    CasesSettingsDetailsPage CasesSettingsDetailsPageObj=new CasesSettingsDetailsPage();
    LegalServicesSettingsDetailsPage LegalServicesSettingsDetailsPageObj=new LegalServicesSettingsDetailsPage();
    SessionsSettingsDetailsPage SessionsSettingsDetailsPageObj=new SessionsSettingsDetailsPage();
    @And("Click on Sessions types Settings From sidebar Menu")
    public void clickOnSessionsTypesSettingsFromSidebarMenu() {
        homepage.ClickOnTypesOfSessionsPage();
    }

    @When("User click on the Add new session type settings button")
    public void userClickOnTheAddNewSessionTypeSettingsButton() {
        SessionsSettingsDetailsPageObj.ClickOnAddNewSessionType();
    }

    @Then("Check that new Sessions type is added successfully")
    public void checkThatNewSessionsTypeIsAddedSuccessfully() {
        SessionsSettingsDetailsPageObj.CheckAddedNewSessions();
    }

    @And("Click on the delete session type button")
    public void clickOnTheDeleteSessionTypeButton() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();

    }

    @Then("Check that the new session type is updated successfully")
    public void checkThatTheNewSessionTypeIsUpdatedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckUpdatedSessionType(),"تم تعديل النوع بنجاح");

    }

    @Then("Check that the added session is deleted successfully")
    public void checkThatTheAddedSessionIsDeletedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckDeletedSessionType(),"تم حذف النوع بنجاح");
    }

    @And("Click on sub-session type Settings From sidebar Menu")
    public void clickOnSubSessionTypeSettingsFromSidebarMenu() {
        homepage.ClickOnSubSessionsTypePage();
    }

    @When("User click on the Add new sub-session type settings button")
    public void userClickOnTheAddNewSubSessionTypeSettingsButton() {
        SessionsSettingsDetailsPageObj.ClickOnAddNewSubSessionType();
    }

    @Then("Check that the new Sub Session type is updated successfully")
    public void checkThatTheNewSubSessionTypeIsUpdatedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckUpdatedSessionType(),"تم تعديل النوع بنجاح");

    }

    @And("click on  the save Sub Session type button")
    public void clickOnTheSaveSubSessionTypeButton() {
        AddNewCasePopUpObj.ClickOnSaveAddedNewCase();

    }

    @And("Click on the Edit Sub Session type option")
    public void clickOnTheEditSubSessionTypeOption() {
        CasesSettingsDetailsPageObj.EditCaseTypeOption();

    }

    @And("Click on the delete Sub session type button")
    public void clickOnTheDeleteSubSessionTypeButton() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();


    }

    @Then("Check that the added Sub session is deleted successfully")
    public void checkThatTheAddedSubSessionIsDeletedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckDeletedSessionType(),"تم حذف النوع بنجاح");


    }

    @And("Click on session procedure Settings From sidebar Menu")
    public void clickOnSessionProcedureSettingsFromSidebarMenu() {
        homepage.ClickOnSessionsActionPage();
    }

    @When("User click on the Add new session procedure settings button")
    public void userClickOnTheAddNewSessionProcedureSettingsButton() {
        SessionsSettingsDetailsPageObj.ClickOnAddNewSessionProcedure();
    }

    @Then("Check that new Sessions procedure is added successfully")
    public void checkThatNewSessionsProcedureIsAddedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckAddedNewSessionsProcedure(),"تم إضافة الإجراء بنجاح");
    }

    @And("Click on the delete session procedure button")
    public void clickOnTheDeleteSessionProcedureButton() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();


    }

    @And("Click on the Edit Session procedure option")
    public void clickOnTheEditSessionProcedureOption() {
        CasesSettingsDetailsPageObj.EditCaseTypeOption();
    }
    @Then("Check that the new Session procedure is updated successfully")
    public void checkThatTheNewSessionProcedureIsUpdatedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckUpdatedSessionsProcedure(),"تم تعديل الإجراء بنجاح");
    }

    @Then("Check that the added session procedure is deleted successfully")
    public void checkThatTheAddedSessionProcedureIsDeletedSuccessfully() {
        Assert.assertEquals(SessionsSettingsDetailsPageObj.CheckDeletedSessionProcedure(),"تم حذف الإجراء بنجاح");
    }
}
