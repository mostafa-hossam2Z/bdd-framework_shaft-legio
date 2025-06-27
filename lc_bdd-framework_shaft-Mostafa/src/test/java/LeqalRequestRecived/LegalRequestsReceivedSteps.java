package LeqalRequestRecived;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.LegalRequestsReceivedPages.*;

public class LegalRequestsReceivedSteps {
    Homepage homePage=new Homepage();
    LegalRequestsReceivedDetailsPage LegalRequestsReceivedDetailsPageObj=new LegalRequestsReceivedDetailsPage();
    AddNewRequestPopUp AddNewRequestPopUpObj=new AddNewRequestPopUp();
    AttachmentLegalRequestPage AttachmentLegalRequestPageObj=new AttachmentLegalRequestPage();
    InquiryPage InquiryPageObj=new InquiryPage();
    UpdatesPage UpdatesPageObj=new UpdatesPage();

    @And("Click on Legal requests received From sidebar Menu")
    public void clickOnLegalRequestsReceivedFromSidebarMenu() {
        homePage.ClickOnLegalRequestsReceivedPage();
    }

    @When("User click on the Add new request button")
    public void userClickOnTheAddNewRequestButton() {
        LegalRequestsReceivedDetailsPageObj.ClickOnAddRequestBtn();
    }

    @And("Add address of request")
    public void addAddressOfRequest() {
        AddNewRequestPopUpObj.EnterLegalReceivedAddress();

    }

    @And("Add the content")
    public void addTheContent() {
        AddNewRequestPopUpObj.EnterLegalReceivedContent();
    }

    @And("Upload the attachment of the request")
    public void uploadTheAttachmentOfTheRequest() {
        AddNewRequestPopUpObj.UploadTheLegalReceivedAttachment();

    }

    @And("Click on the sent request button")
    public void clickOnTheSentRequestButton() {
        AddNewRequestPopUpObj.ClickOnSaveAddedNewLegalReceived();

    }

    @Then("Check that new Request is added successfully")
    public void checkThatNewRequestIsAddedSuccessfully() {
        Assert.assertEquals(LegalRequestsReceivedDetailsPageObj.CheckAddedRequest(),"تم اضافة طلب");
    }

    @And("Click on the delete Request button")
    public void clickOnTheDeleteRequestButton() {
    LegalRequestsReceivedDetailsPageObj.ClickOnDeleteRequestReceived();
    }

    @And("Search bt the legal received address")
    public void searchBtTheLegalReceivedAddress() {
        LegalRequestsReceivedDetailsPageObj.SearchByLegalReceivedAddress();
    }

    @Then("Check that the legal request received is deleted successfully")
    public void checkThatTheLegalRequestReceivedIsDeletedSuccessfully() {
    Assert.assertEquals(LegalRequestsReceivedDetailsPageObj.CheckDeletedRequest(),"لا يوجد بيانات");
    }

    @And("Click on the Add Attachment button")
    public void clickOnTheAddAttachmentButton() {

    }

    @And("Click on the legal request received details button")
    public void clickOnTheLegalRequestReceivedDetailsButton() {
        LegalRequestsReceivedDetailsPageObj.ClickOnLegalRequestReceivedDetailsBtn();
    }

    @And("Go to the attachment tab")
    public void goToTheAttachmentTab() {
        AttachmentLegalRequestPageObj.ClickOnAttachmentTab();
    }

    @And("Upload the attachment legal request")
    public void uploadTheAttachmentLegalRequest() {
        AttachmentLegalRequestPageObj.UploadFileAttachment();
    }

    @And("Click on the save add attachment button")
    public void clickOnTheSaveAddAttachmentButton() {
        AttachmentLegalRequestPageObj.ClickOnTheSaveUploadAttachment();
    }

    @Then("Check that attachment is added successfully")
    public void checkThatAttachmentIsAddedSuccessfully() {
        Assert.assertEquals(AttachmentLegalRequestPageObj.CheckUploadedAttachment(),"Competencies Template (2).xlsx");
    }

    @And("Click on the delete Request button from side bar menu")
    public void clickOnTheDeleteRequestButtonFromSideBarMenu() {
        LegalRequestsReceivedDetailsPageObj.ClickOnDeleteRequestReceivedFromSideBarMenu();
    }

    @And("Click on the download legal request received button")
    public void clickOnTheDownloadLegalRequestReceivedButton() {
        AttachmentLegalRequestPageObj.ClickOnTheDownloadBtn();

    }

    @Then("Check that request is downloaded successfully")
    public void checkThatRequestIsDownloadedSuccessfully() {
        AttachmentLegalRequestPageObj.CheckDownloadedFile();
    }

    @And("Go to the inquiry tab")
    public void goToTheInquiryTab() {
        InquiryPageObj.ClickOnInquiryTab();
    }

    @And("Click on the add new inquiry")
    public void clickOnTheAddNewInquiry() {
        InquiryPageObj.ClickOnAddInquiry();
    }

    @And("Click on the sent inquiry button")
    public void clickOnTheSentInquiryButton() {
        InquiryPageObj.ClickOnSentInquiry();
    }

    @Then("Check that new inquiry is added successfully")
    public void checkThatNewInquiryIsAddedSuccessfully() {
        Assert.assertEquals(LegalRequestsReceivedDetailsPageObj.CheckAddedInquiry(),"تم اضافة استفسار");
    }

    @And("Add address of Add InQuery")
    public void addAddressOfAddInQuery() {
        InquiryPageObj.EnterLegalReceivedInquiryAddress();
    }

    @And("Add the content of Add InQuery")
    public void addTheContentOfAddInQuery() {
        InquiryPageObj.EnterLegalReceivedInquiryContent();
    }

    @And("Click on Add response button")
    public void clickOnAddResponseButton() {
        InquiryPageObj.ClickOnAddResponseButton();
    }

    @And("Add the response")
    public void addTheResponse() {
        InquiryPageObj.AddResponseBody();
    }

    @Then("Check that response is added successfully")
    public void checkThatResponseIsAddedSuccessfully() {
        Assert.assertEquals(InquiryPageObj.CheckTheAddedResponse(),"Response");

    }

    @And("Close The Added Response pop up")
    public void closeTheAddedResponsePopUp() {
        InquiryPageObj.CloseSentRequestPopUp();
    }

    @And("Delete The response of an inquiry")
    public void deleteTheResponseOfAnInquiry() {
        InquiryPageObj.DeleteResponseBody();

    }

    @Then("Check that the response is deleted successfully")
    public void checkThatTheResponseIsDeletedSuccessfully() {
        Assert.assertEquals(InquiryPageObj.CheckTheDeletedResponse(),"لا يوجد ردود");

    }

    @And("Click on delete inquiry button")
    public void clickOnDeleteInquiryButton() {
        InquiryPageObj.DeleteInquiryBody();
    }

    @Then("Check that inquiry is deleted successfully")
    public void checkThatInquiryIsDeletedSuccessfully() {
        Assert.assertEquals(InquiryPageObj.CheckTheDeletedInquiry(),"لا يوجد بيانات");
    }

    @And("Go to the Updates tab")
    public void goToTheUpdatesTab() {
        UpdatesPageObj.ClickOnUpdatesTab();

    }

    @And("Click on the add new Update")
    public void clickOnTheAddNewUpdate() {
        UpdatesPageObj.ClickOnAddUpdate();
    }

    @Then("Check that Update is added successfully")
    public void checkThatUpdateIsAddedSuccessfully() {
        Assert.assertEquals(UpdatesPageObj.CheckAddedUpdates(),"تم اضافة تحديث بنجاح");
    }
}
