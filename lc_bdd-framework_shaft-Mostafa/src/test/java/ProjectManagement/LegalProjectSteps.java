package ProjectManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Case.*;
import pages.CommonPages.Homepage;
import pages.LegalProjectsPages.LegalProjectDetailsPage;
import pages.LegalServicesPages.AddNewLegalServicePopUp;
import pages.LegalServicesPages.ArchiveLegalServicesPage;
import pages.LegalServicesPages.LegalServiceDetailsPage;

public class LegalProjectSteps {
    Homepage homepage=new Homepage();
    CaseDetailsPage CaseDetailsPageObj= new CaseDetailsPage();
    AddNewCasePopUp AddNewCasePopUpObj=new AddNewCasePopUp();
    DetailsPage DetailsPageObj=new DetailsPage();
    AddNewSessionPopUpPage AddNewSessionPopUpPageObj=new AddNewSessionPopUpPage();
    ChatPage ChatPageObj=new ChatPage();
    AttachmentPage AttachmentPageObj=new AttachmentPage();
    TaskPopUpPage TaskPopUpPageObj=new TaskPopUpPage();
    ReportsPage ReportsPageObj =new ReportsPage();
    AgenciesPage AgenciesPageObj=new AgenciesPage();
    CommunicationLogsPage CommunicationLogsPageObj=new CommunicationLogsPage();
    ArchivePage ArchivePageObj=new ArchivePage();
    LegalServiceDetailsPage LegalServiceDetailsPageObj=new LegalServiceDetailsPage();
    AddNewLegalServicePopUp AddNewLegalServicePopUpObj=new AddNewLegalServicePopUp();
    ArchiveLegalServicesPage ArchiveLegalServicesPageObj=new ArchiveLegalServicesPage();
    LegalProjectDetailsPage LegalProjectDetailsPageObj=new LegalProjectDetailsPage();
    @When("Click on the legal Projects page from sidebar menu")
    public void clickOnTheLegalProjectsPageFromSidebarMenu() {
        homepage.ClickOnLegalProjectsPage();
    }

    @And("User click on the Add new legal Project button")
    public void userClickOnTheAddNewLegalProjectButton() {
        LegalProjectDetailsPageObj.ClickOnAddNewLegalProjectBtn();
    }

    @Then("Check that legal project is added successfully")
    public void checkThatLegalProjectIsAddedSuccessfully() {
        Assert.assertEquals(LegalProjectDetailsPageObj.CheckAddedNewLegalProjects(),"تم اضافة المشروع القانوني بنجاح");
    }

    @Then("Check that legal project is deleted successfully")
    public void checkThatLegalProjectIsDeletedSuccessfully() {
        Assert.assertEquals(LegalProjectDetailsPageObj.CheckDeletedLegalProjects(),"تم حذف المشروع القانوني بنجاح");

    }
}
