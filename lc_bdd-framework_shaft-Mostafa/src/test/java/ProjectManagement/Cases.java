package ProjectManagement;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Case.*;
import pages.CommonPages.Homepage;

import static pages.Case.ReportsPage.ReportAddress;
import static pages.Case.TaskPopUpPage.TaskAddress;
import static pages.CommonPages.base.driver;

public class Cases {
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
    @And("Click on Cases From sidebar Menu")
    public void clickOnCasesFromSidebarMenu() {
        homepage.ClickOnCasesPage();
    }

    @When("User click on the Add new Case button")
    public void userClickOnTheAddNewCaseButton() {
        CaseDetailsPageObj.ClickOnAddNewCaseBtn();
    }

    @And("Add new address")
    public void addNewAddress() {
        AddNewCasePopUpObj.EnterAdressNameOfTheCase();
    }

    @And("Add the model")
    public void addTheModel() {
        AddNewCasePopUpObj.EnterTheModel();
    }

    @And("Add case type")
    public void addCaseType() {
        AddNewCasePopUpObj.EnterTheCaseType();
    }

    @And("Add case number")
    public void addCaseNumber() {
        AddNewCasePopUpObj.EnterCaseNumber();
    }

    @And("Add the court name")
    public void addTheCourtName() {
        AddNewCasePopUpObj.ChooseCourt();
    }

    @And("Add choose the lawyers names")
    public void addChooseTheLawyersNames() {
        AddNewCasePopUpObj.ChooseLawyers();
    }

    @And("click on  the save Case button")
    public void clickOnTheSaveCaseButton() {
        AddNewCasePopUpObj.ClickOnSaveAddedNewCase();
    }

    @Then("Check that new Case is added successfully")
    public void checkThatNewCaseIsAddedSuccessfully() {
        Assert.assertEquals(CaseDetailsPageObj.CheckAddedNewCase(),"تم اضافة القضية بنجاح");

    }

    @And("Click on the Edit case option")
    public void clickOnTheEditCaseOption() {
        CaseDetailsPageObj.ClickOnEditCaseBtn();
    }

    @And("Change the address name")
    public void changeTheAddressName() {
        AddNewCasePopUpObj.ChangeAddressName();
    }

    @Then("Check that new Case is Updated successfully")
    public void checkThatNewCaseIsUpdatedSuccessfully() throws InterruptedException {
        Assert.assertEquals(CaseDetailsPageObj.CheckUpdatedCase(),"تم تعديل القضية بنجاح");

    }

    @And("Click on the delete case button")
    public void clickOnTheDeleteCaseButton() {
        CaseDetailsPageObj.ClickOnDeleteCaseBtn();
    }

    @Then("Check that new Case is deleted successfully")
    public void checkThatNewCaseIsDeletedSuccessfully() throws InterruptedException {
        Assert.assertEquals(CaseDetailsPageObj.CheckThatCaseisDelted(),"تم حذف القضية");

    }

    @Given("Search by the case id and case address")
    public void searchByTheCaseIdAndCaseAddress() {
        CaseDetailsPageObj.SearchByAddressAndCaseNumber();

    }

    @Then("Check that  Case is founded successfully")
    public void checkThatCaseIsFoundedSuccessfully() {
    }

    @And("Click on the case details button")
    public void clickOnTheCaseDetailsButton() {
        CaseDetailsPageObj.ClickOnCaseDetailsPage();
    }

    @And("Click on the add field button")
    public void clickOnTheAddFieldButton() {
        DetailsPageObj.ClickOnAddFieldBtn();

    }

    @And("Choose text field")
    public void chooseTextField() {
        DetailsPageObj.ChooseText();
    }

    @And("Enter text name and value")
    public void enterTextNameAndValue() {
        DetailsPageObj.EnterTextNameValue();
    }

    @Then("Check that Case details are added successfully")
    public void checkThatCaseDetailsAreAddedSuccessfully() {
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        Assert.assertEquals(DetailsPageObj.CheckTextFieldtext(),"heloo:");

    }

    @And("Click on the delete case details button")
    public void clickOnTheDeleteCaseDetailsButton() {
        DetailsPageObj.ClickOnDeleteBtn();
    }

    @Then("Check that Case details are deleted successfully")
    public void checkThatCaseDetailsAreDeletedSuccessfully() throws InterruptedException {
        Thread.sleep(1500);
        boolean isDisplayed = new ElementActions(driver.getDriver()).isElementDisplayed(AddField);
        Assert.assertTrue(isDisplayed);
    }

    @And("Add comment to the case details")
    public void addCommentToTheCaseDetails() {
        DetailsPageObj.AddComment();
    }

    @And("Click on the save button")
    public void clickOnTheSaveButton() {
        DetailsPageObj.ClickOnSaveCommentButton();
    }

    @Then("Check that comment is added to the Case details successfully")
    public void checkThatCommentIsAddedToTheCaseDetailsSuccessfully() {
        Assert.assertEquals(DetailsPageObj.CheckCommentText(),"CasePostponed");}

    @When("Click on the add model button")
    public void clickOnTheAddModelButton() {
        DetailsPageObj.ClickOnAddModelButton();

    }
    @When("Add to the list of models")
    public void addToTheListOfModels() {
        DetailsPageObj.AddModel();
    }

    @And("Click on the save model button")
    public void clickOnTheSaveModelButton() {
        DetailsPageObj.ClickOnSaveModelButton();
    }

    @Then("Check that model is added to the Case details successfully")
    public void checkThatModelIsAddedToTheCaseDetailsSuccessfully() {
        Assert.assertEquals(DetailsPageObj.CheckAddedModel(),"تم حفظ نموذج القضية بنجاح");}

    @When("Click on the add new session button")
    public void clickOnTheAddNewSessionButton() {
     CaseDetailsPageObj.ClickOnAddNewSessionBtn();
    }

    @And("Add Basic InFormations of the new session")
    public void addBasicInFormationsOfTheNewSession() {
        AddNewSessionPopUpPageObj.EnterBasicInformation();
    }
    @And("Add Optional InFormations of the new session")
    public void addOptionalInFormationsOfTheNewSession() {
        AddNewSessionPopUpPageObj.EnterOptionalInformation();
    }

    @And("Click on the save add new session button")
    public void clickOnTheSaveAddNewSessionButton() {
        AddNewSessionPopUpPageObj.ClickOnTheSaveAddNewSessionBtn();
    }

    @Then("check that new session is added to the case successfully")
    public void checkThatNewSessionIsAddedToTheCaseSuccessfully() {
        Assert.assertEquals(AddNewSessionPopUpPageObj.CheckAddedNewSession(),"تم اضافة الجلسة بنجاح");
    }


    @And("Click on the delete session button")
    public void clickOnTheDeleteSessionButton() {
        AddNewSessionPopUpPageObj.ClickOnTheDeleteSessionBtn();
    }

    @Then("check that new session is deleted successfully")
    public void checkThatNewSessionIsDeletedSuccessfully() {
    }

    @When("Click on the chats button of the case")
    public void clickOnTheChatsButtonOfTheCase() {
        CaseDetailsPageObj.ClickOnChatBtn();
    }

    @And("Enter the chat text")
    public void enterTheChatText() {
        ChatPageObj.EnterChat();
    }

    @Then("check that message is sent successfully")
    public void checkThatMessageIsSentSuccessfully() {
        Assert.assertEquals(ChatPageObj.CheckChatTextDetails(),"Welcome");
    }

    @When("Click on the attachment button of the case")
    public void clickOnTheAttachmentButtonOfTheCase() {
        CaseDetailsPageObj.ClickOnAttachmentBtn();
    }

    @And("Upload the attachment")
    public void uploadTheAttachment() {
        AttachmentPageObj.UploadFileAttachment();
    }

    @Then("check that file is Uploaded successfully")
    public void checkThatFileIsUploadedSuccessfully() {
        Assert.assertEquals(AttachmentPageObj.CheckUploadedAttachment(),"Competencies Template (2).xlsx");
    }

    @And("Click on the delete attachment button")
    public void clickOnTheDeleteAttachmentButton() {
        AttachmentPageObj.ClickOnTheDeleteBtn();
    }

    @Then("check that file is deleted successfully")
    public void checkThatFileIsDeletedSuccessfully() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        Assert.assertEquals(AttachmentPageObj.CheckDeletedAttachment(),"لا يوجد مرفقات");

    }

    @When("Click on the tasks tab")
    public void clickOnTheTasksTab() {
        CaseDetailsPageObj.ClickOnTaskTabBtn();
    }

    @And("Click on the add new task button")
    public void clickOnTheAddNewTaskButton() {
        CaseDetailsPageObj.ClickOnAddTaskBtn();

    }

    @And("Fill the basic information of the tasks field")
    public void fillTheBasicInformationOfTheTasksField() {
        TaskPopUpPageObj.EnterTaskDataFields();

    }

    @Then("check that task is added successfully")
    public void checkThatTaskIsAddedSuccessfully() {
        Assert.assertEquals(TaskPopUpPageObj.CheckAddedTask(),TaskAddress);
    }

    @And("Click on the delete task button")
    public void clickOnTheDeleteTaskButton() {
        TaskPopUpPageObj.ClickOnTheDeletedTask();
    }

    @Then("check that task is deleted successfully")
    public void checkThatTaskIsDeletedSuccessfully() {
        Assert.assertEquals(TaskPopUpPageObj.CheckTheDeletedTask(),"لا يوجد مهام");

    }

    @When("Click on the report tab")
    public void clickOnTheReportTab() {
        CaseDetailsPageObj.ClickOnReportTabBtn();
    }

    @And("Click on the add new report button")
    public void clickOnTheAddNewReportButton() {
        CaseDetailsPageObj.ClickOnAddReportTabBtn();
    }

    @And("Fill the report address")
    public void fillTheReportAddress() {
        ReportsPageObj.EnterTheReportAddress();
    }

    @And("Add thr report details")
    public void addThrReportDetails() {
        ReportsPageObj.EnterTheReportDetails();
    }

    @And("click on the save add report button")
    public void clickOnTheSaveAddReportButton() {
        ReportsPageObj.ClickSaveReportBtn();
    }

    @Then("check that report is added successfully")
    public void checkThatReportIsAddedSuccessfully() {
        Assert.assertEquals(ReportsPageObj.CheckAddedReport(),ReportAddress);
    }

    @When("Click on the agency tab")
    public void clickOnTheAgencyTab() {
        CaseDetailsPageObj.ClickOnAgencyTabBtn();
    }

    @And("Click on the add new agency button")
    public void clickOnTheAddNewAgencyButton() {
        CaseDetailsPageObj.ClickOnAddNewAgencyBtn();
    }

    @And("Fill the Basic Data fields to add agency")
    public void fillTheBasicDataFieldsToAddAgency() {
        AgenciesPageObj.EnterAgencyDataFields();

    }

    @And("click on the save add agency button")
    public void clickOnTheSaveAddAgencyButton() {
        AgenciesPageObj.ClickOnTheSaveAddAgency();
    }

    @Then("check that agency is added successfully")
    public void checkThatAgencyIsAddedSuccessfully() {
        Assert.assertEquals(AgenciesPageObj.CheckAddedAgency(),"تم الاضافة بنجاح");
    }

    @And("Click on the edit agency btn")
    public void clickOnTheEditAgencyBtn() {
        AgenciesPageObj.ClickOnTheEditAgencyButton();

    }

    @And("Edit the agency")
    public void editTheAgency() {
        AgenciesPageObj.EditTheAddedAgency();

    }

    @Then("check that agency is updated successfully")
    public void checkThatAgencyIsUpdatedSuccessfully() {
       Assert.assertEquals(AgenciesPageObj.CheckTheUpdatedAgency(),"تم التعديل بنجاح");
    }

    @When("Click on the communication logs tab")
    public void clickOnTheCommunicationLogsTab() {
     CaseDetailsPageObj.ClickOnContactTabBtn();
    }

    @And("Click on the add new contact button")
    public void clickOnTheAddNewContactButton() {
        CaseDetailsPageObj.ClickOnAddNewContactBtn();

    }

    @And("Fill the Basic Data fields to add a new contact contact")
    public void fillTheBasicDataFieldsToAddANewContactContact() {
        CommunicationLogsPageObj.EnterDataOfAddNewContact();
    }

    @And("click on the save add contact button")
    public void clickOnTheSaveAddContactButton() {
        CommunicationLogsPageObj.ClickOnTheSaveAddNewContactBtn();
    }

    @Then("check that contact is added successfully")
    public void checkThatContactIsAddedSuccessfully() {
        Assert.assertEquals(CommunicationLogsPageObj.CheckAddedNewContact(),"تم إضافة السجل بنجاح");
    }

    @And("Click on the delete contact button")
    public void clickOnTheDeleteContactButton() {
        CommunicationLogsPageObj.ClickOnTheDeleteContactBtn();
    }

    @Then("check that contact is deleted successfully")
    public void checkThatContactIsDeletedSuccessfully() {
        Assert.assertEquals(CommunicationLogsPageObj.CheckDeletedNewContact(),"تم حذف السجل بنجاح");
    }

    @And("Click on the download contact button")
    public void clickOnTheDownloadContactButton() {
        CommunicationLogsPageObj.ClickOnThContactDownloadBtn();

    }

    @Then("Check that contact is downloaded successfully")
    public void checkThatContactIsDownloadedSuccessfully() {

        CommunicationLogsPageObj.CheckDownloadedFile();
    }

    @And("Click on the contact details button")
    public void clickOnTheContactDetailsButton() {
        CommunicationLogsPageObj.ClickOnThContactDetailsBtn();
    }

    @When("Click on the Archive button")
    public void clickOnTheArchiveButton() {
        CaseDetailsPageObj.ClickOnArchiveBtn();
    }

    @And("Add the Report title")
    public void addTheReportTitle() {
        ArchivePageObj.EnterTheReportTitle();
    }

    @And("Add the final report")
    public void addTheFinalReport() {
        ArchivePageObj.EnterTheFinalReport();
    }

    @And("Click on the Archiving completed button")
    public void ClickOnTheArchivingCompletedButton() {
        ArchivePageObj.ClickOnTheSaveArchivedBtn();
    }

    @Then("check that case is Archived successfully")
    public void checkThatCaseIsArchiviedSuccessfully() {
        Assert.assertEquals(ArchivePageObj.CheckThatCaseArchived(),"إعادة فتح القضية");
    }

    @And("Click on the UnArchiving completed button")
    public void clickOnTheUnArchivingCompletedButton() {
        CaseDetailsPageObj.ClickOnUnArchiveBtn();
    }

    @Then("check that case is UnArchived successfully")
    public void checkThatCaseIsUnArchivedSuccessfully() {
        Assert.assertEquals(ArchivePageObj.CheckThatCaseUnArchived(),"أرشفة القضية");

    }

    @And("Click on the UnArchive completed button")
    public void clickOnTheUnArchiveCompletedButton() {
        ArchivePageObj.ClickOnUnArchivedBtn();

    }


}


