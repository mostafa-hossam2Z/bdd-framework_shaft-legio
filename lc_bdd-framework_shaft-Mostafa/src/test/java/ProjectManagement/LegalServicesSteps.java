package ProjectManagement;

import com.shaft.gui.element.ElementActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Case.*;
import pages.CommonPages.Homepage;
import pages.LegalServicesPages.AddNewLegalServicePopUp;
import pages.LegalServicesPages.LegalServiceDetailsPage;

import static pages.Case.ReportsPage.ReportAddress;
import static pages.Case.TaskPopUpPage.TaskAddress;
import static pages.CommonPages.base.driver;

public class LegalServicesSteps {

    By CasesPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]/span[2]");
    By ProjectManagementBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/span[1]/span[2]");
    By AddField=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/button[1]");
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

    @When("Click on the legal services page from sidebar menu")
    public void userClickOnTheAddLegalServicesButton() {
        homepage.ClickOnLegalPage();
    }

    @And("User click on the Add new legal service button")
    public void userClickOnTheAddNewLegalServiceButton() {
        LegalServiceDetailsPageObj.ClickOnAddNewLegalServiceBtn();
    }


    @And("Add new legal service address")
    public void addNewLegalServiceAddress() {
        AddNewLegalServicePopUpObj.EnterLegalServiceAddress();
    }

    @And("Choose the model")
    public void chooseTheModel() {
        AddNewLegalServicePopUpObj.EnterTheModelOfLegalService();
    }

    @And("Add the Type of legal service")
    public void addTheTypeOfLegalService() {
        AddNewLegalServicePopUpObj.EnterTheLegalType();
    }

    @And("Choose the lawyer")
    public void chooseTheLawyer() {
        AddNewLegalServicePopUpObj.ChooseTheLawyersOfTheLegal();
    }

    @And("Click on the save add new legal button")
    public void clickOnTheSaveAddNewLegalButton() {
        AddNewLegalServicePopUpObj.ClickOnSaveAddedNewLegalService();
    }

    @And("Click on the legal services button")
    public void clickOnTheLegalServicesButton() {
    }

    @Then("Check that legal services is added successfully")
    public void checkThatLegalServicesIsAddedSuccessfully() {
        Assert.assertEquals(LegalServiceDetailsPageObj.CheckAddedNewLegalServices(),"تم اضافة الخدمة القانونية بنجاح");

    }

    @And("Click on the delete legal service button")
    public void clickOnTheDeleteLegalServiceButton() {
        LegalServiceDetailsPageObj.ClickOnDeleteLegalServiceBtn();
    }

    @And("Search by the legal address")
    public void searchByTheLegalAddress() {
        LegalServiceDetailsPageObj.SearchByLegalServiceAddress();
    }

    @Then("Check that legal services is deleted successfully")
    public void checkThatLegalServicesIsDeletedSuccessfully() {
       Assert.assertEquals(LegalServiceDetailsPageObj.CheckThatLegalServicesIsDeleted(),"تم حذف الخدمة القانونية بنجاح");
    }

    @And("Click on the edit legal service button")
    public void clickOnTheEditLegalServiceButton() {

    }

    @And("Change the legal service address")
    public void changeTheLegalServiceAddress() {
        AddNewLegalServicePopUpObj.ChangeLegalServiceAddress();
    }

    @And("Click on the legal services details page")
    public void clickOnTheLegalServicesDetailsPage() {
        LegalServiceDetailsPageObj.ClickOnLegalServicesDetailsPage();
    }

    @Then("Check that legal services details is added successfully")
    public void checkThatLegalServicesDetailsIsAddedSuccessfully() {
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        Assert.assertEquals(DetailsPageObj.CheckTextFieldtext(),"heloo:");

    }
}
