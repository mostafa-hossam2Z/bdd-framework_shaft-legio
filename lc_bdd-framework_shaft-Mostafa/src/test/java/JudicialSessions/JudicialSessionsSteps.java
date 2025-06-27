package JudicialSessions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Case.TaskPopUpPage;
import pages.CommonPages.Homepage;
import pages.JudicialSessionsPages.AddNewJudicialSessionPopUp;
import pages.JudicialSessionsPages.JudicialSessionsDetailsPage;

public class JudicialSessionsSteps {
    Homepage homePage=new Homepage();
    AddNewJudicialSessionPopUp AddNewJudicialSessionPopUpObj=new AddNewJudicialSessionPopUp();
    JudicialSessionsDetailsPage JudicialSessionsDetailsPageObj=new JudicialSessionsDetailsPage();
    TaskPopUpPage TaskPopUpPageObj=new TaskPopUpPage();

    @And("Click on Judicial sessions page From sidebar Menu")
    public void clickOnJudicialSessionsPageFromSidebarMenu() {
        homePage.ClickOnJudicialSessionsPage();
    }

    @When("User click on the Add new Judicial session button")
    public void userClickOnTheAddNewJudicialSessionButton() {
        JudicialSessionsDetailsPageObj.ClickOnAddNewJudicialSessionsBtn();
    }

    @And("Choose the case")
    public void chooseTheCase() {
        AddNewJudicialSessionPopUpObj.ChooseCase();
    }

    @And("Add the session number")
    public void addTheSessionNumber() {
        AddNewJudicialSessionPopUpObj.AddSessionNumber();
    }

    @And("Choose the lawyer of Judicial session")
    public void chooseTheLawyerOfJudicialSession() {
        AddNewJudicialSessionPopUpObj.AddLawyer();
    }

    @And("Select session type")
    public void selectSessionType() {
        AddNewJudicialSessionPopUpObj.ChooseSessionType();
    }

    @And("Select the Date and Time")
    public void selectTheDateAndTime() {
        AddNewJudicialSessionPopUpObj.AddDateAndTime();
    }

    @And("Add the Judicial Circuit")
    public void addTheJudicialCircuit() {
        AddNewJudicialSessionPopUpObj.EnterJudicialCircuit();
    }
    @And("Select the Judicial department")
    public void selectTheJudicialDepartment() {
    }

    @And("Choose The court")
    public void chooseTheCourt() {
        AddNewJudicialSessionPopUpObj.ChooseCourt();
    }

    @And("Select Session subtype")
    public void selectSessionSubtype() {
        AddNewJudicialSessionPopUpObj.ChooseSessionSubtype();
    }

    @And("Add Judge's name")
    public void EnterJudgeSName() {
        AddNewJudicialSessionPopUpObj.EnterJudgeName();

    }

    @And("Select Session procedures")
    public void selectSessionProcedures() {
        AddNewJudicialSessionPopUpObj.SelectProcedure();
    }

    @And("Add Required documents")
    public void addRequiredDocuments() {
        AddNewJudicialSessionPopUpObj.UploadDocuments();
    }

    @And("Add Attachment of the Judicial session")
    public void addAttachmentOfTheJudicialSession() {
        AddNewJudicialSessionPopUpObj.UploadAttachment();
    }

    @And("Add task of the Judicial session")
    public void addTaskOfTheJudicialSession() {
        AddNewJudicialSessionPopUpObj.AddTask();

    }

    @And("Click on the save add new Judicial session")
    public void clickOnTheSaveAddNewJudicialSession() {
        AddNewJudicialSessionPopUpObj.ClickOnTheSaveAddNewJudicialSessionBtn();
    }

    @Then("Check that a new Judicial session is added successfully")
    public void checkThatANewJudicialSessionIsAddedSuccessfully() {
        Assert.assertEquals(AddNewJudicialSessionPopUpObj.CheckAddedNewJudicialSession(),"تم اضافة الجلسة بنجاح");
    }

    @And("Click on the delete Judicial session button")
    public void clickOnTheDeleteJudicialSessionButton() {
    }

}
