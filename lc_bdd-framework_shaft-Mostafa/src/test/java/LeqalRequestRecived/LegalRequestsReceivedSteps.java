package LeqalRequestRecived;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.LegalRequestsReceivedPages.AddNewRequestPopUp;
import pages.LegalRequestsReceivedPages.AttachmentLegalRequestPage;
import pages.LegalRequestsReceivedPages.LegalRequestsReceivedDetailsPage;

public class LegalRequestsReceivedSteps {
    Homepage homePage=new Homepage();
    LegalRequestsReceivedDetailsPage LegalRequestsReceivedDetailsPageObj=new LegalRequestsReceivedDetailsPage();
    AddNewRequestPopUp AddNewRequestPopUpObj=new AddNewRequestPopUp();
    AttachmentLegalRequestPage AttachmentLegalRequestPageObj=new AttachmentLegalRequestPage();
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
}
