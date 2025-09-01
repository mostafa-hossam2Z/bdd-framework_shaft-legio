package MyAccount;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import pages.CommonPages.Homepage;
import pages.MyAccountPages.*;

import static pages.MyAccountPages.LegalServicesPage.AboutYourServices;
import static pages.MyAccountPages.LegalServicesPage.ServiceName;

public class MyAccountSteps {
    Homepage homePage=new Homepage();
    PublicSettingsPage PublicSettingsPageObj=new PublicSettingsPage();
    LegalServicesPage LegalServicesPageObj=new LegalServicesPage();
    AcademicCertificatesPage AcademicCertificatesPageObj=new AcademicCertificatesPage();
    WorkExperiencePage WorkExperiencePageObg=new WorkExperiencePage();
    ClientsPage ClientsPageObj =new ClientsPage();
    SocialMediaAccountsPage SocialMediaAccountsPageObj=new SocialMediaAccountsPage();
    BankAccountPage BankAccountPageObj=new BankAccountPage();
    TermsAndConditionsPage TermsAndConditionsPageObj=new TermsAndConditionsPage();
    ReturnPolicyPage ReturnPolicyPageObj=new ReturnPolicyPage();

    @When("User click on the my account page from side bar menu")
    public void userClickOnTheMyAccountPageFromSideBarMenu() {
        homePage.ClickOnMyAccountPage();
    }

    @And("Change the phone number")
    public void changeThePhoneNumber() throws InterruptedException {
        PublicSettingsPageObj.EditPhoneNumber();
    }

    @And("Click on the save public settings button")
    public void clickOnTheSavePublicSettingsButton() {
    }

    @Then("Check that public settings is updated successfully")
    public void checkThatPublicSettingsIsUpdatedSuccessfully() {
    }

    @And("Click on the legal services tab")
    public void clickOnTheLegalServicesTab() {
        LegalServicesPageObj.ClickOnTheLegalServicesTab();
    }

    @And("Add About your services")
    public void addAboutYourServices() throws InterruptedException {
        LegalServicesPageObj.AddAboutYourServices();
    }

    @And("Click on the save add About your services button")
    public void clickOnTheSaveAddAboutYourServicesButton() {
        LegalServicesPageObj.ClickOnSaveAddedAboutYourServices();
    }

    @Then("Check that About your services is updated successfully")
    public void checkThatAboutYourServicesIsUpdatedSuccessfully() {
        Assert.assertEquals(LegalServicesPageObj.CheckAddedAboutYourServices(),"تم الحفظ بنجاح.");

    }

    @And("Click on Add new service button")
    public void clickOnAddNewServiceButton() {
        LegalServicesPageObj.ClickOnAddNewLegalServiceBtn();
    }

    @And("Add new service name")
    public void addNewServiceName() {
        LegalServicesPageObj.AddNewServiceName();
    }

    @And("Click on the save add new service button")
    public void clickOnTheSaveAddNewServiceButton() {
        LegalServicesPageObj.ClickOnTheSaveAddNewService();
    }

    @Then("Check that new service is added successfully")
    public void checkThatNewServiceIsAddedSuccessfully() {
        Assert.assertEquals(LegalServicesPageObj.CheckAddedServicesName(),ServiceName);

    }

    @And("Click on the edit services button")
    public void clickOnTheEditServicesButton() {
        LegalServicesPageObj.ClickOnTheEditServiceBtn();
    }

    @And("Edit the service name")
    public void editTheServiceName() {
        LegalServicesPageObj.EditServiceName();
    }

    @Then("Check that new service is Updated successfully")
    public void checkThatNewServiceIsUpdatedSuccessfully() {
    }

    @And("Click on the delete service button")
    public void clickOnTheDeleteServiceButton() {
        LegalServicesPageObj.DeleteService();

    }

    @Then("Check that new service is deleted successfully")
    public void checkThatNewServiceIsDeletedSuccessfully() {
    }

    @And("Click on the academic certificate tab")
    public void clickOnTheAcademicCertificateTab() {
        AcademicCertificatesPageObj.ClickOnTheAcademicCertificateTab();
    }

    @And("Click on Add certificate button")
    public void clickOnAddCertificateButton() {
        AcademicCertificatesPageObj.ClickOnTheAddNewCertificate();
    }

    @And("Write new certificate name")
    public void writeNewCertificateName() throws InterruptedException {
        AcademicCertificatesPageObj.AddCertificateName();
    }

    @And("Click on the save add new certificate button")
    public void clickOnTheSaveAddNewCertificateButton() {
        AcademicCertificatesPageObj.ClickOnTheSaveAddNewCertificate();
    }

    @Then("Check that new certificate is added successfully")
    public void checkThatNewCertificateIsAddedSuccessfully() {

    }

    @And("Click on the edit certificate button")
    public void clickOnTheEditCertificateButton() {
        AcademicCertificatesPageObj.ClickOnTheEditCertificateBtn();
    }

    @And("Change the certificate name")
    public void changeTheCertificateName() {
        AcademicCertificatesPageObj.ChangeCertificateName();
    }

    @And("Click on the save edit certificate button")
    public void clickOnTheSaveEditCertificateButton() {
        AcademicCertificatesPageObj.ClickOnSaveUpdateCertificate();
    }

    @And("Click on the Delete certificate button")
    public void clickOnTheDeleteCertificateButton() {
        AcademicCertificatesPageObj.ClickOnDeleteCertificate();
    }

    @Then("Check that new certificate is deleted successfully")
    public void checkThatNewCertificateIsDeletedSuccessfully() {
    }

    @And("Click on the Work experience tab")
    public void clickOnTheWorkExperienceTab() {
        WorkExperiencePageObg.ClickOnTheWorkExperienceTab();
    }

    @And("Add About your Work experience")
    public void addAboutYourWorkExperience() throws InterruptedException {
        WorkExperiencePageObg.AddAboutYourWorkExperience();
    }

    @And("Click on the save add About your Work experience button")
    public void clickOnTheSaveAddAboutYourWorkExperienceButton() {
        WorkExperiencePageObg.ClickOnSaveAddedAboutYourWorkExperience();
    }

    @Then("Check that About your Work experience is updated successfully")
    public void checkThatAboutYourWorkExperienceIsUpdatedSuccessfully() {
        Assert.assertEquals(WorkExperiencePageObg.CheckAddedAboutYourWorkExperience(),"تم الحفظ بنجاح.");

    }

    @And("Click on Add experience button")
    public void clickOnAddExperienceButton() {
        WorkExperiencePageObg.AddWorkExperienceBtn();
    }

    @And("Add new experience name")
    public void addNewExperienceName() {
        WorkExperiencePageObg.AddNewWorkExperienceName();
    }

    @And("Click on the save add new experience button")
    public void clickOnTheSaveAddNewExperienceButton() {
        WorkExperiencePageObg.ClickOnTheSaveAddNewWorkExperience();
    }

    @Then("Check that new experience is added successfully")
    public void checkThatNewExperienceIsAddedSuccessfully() {
    }

    @And("Click on the edit experience button")
    public void clickOnTheEditExperienceButton() {
        WorkExperiencePageObg.ClickOnTheEditExperienceBtn();
    }

    @And("Edit the experience name")
    public void editTheExperienceName() {
        WorkExperiencePageObg.EditWorkExperienceName();
    }

    @And("Click on the save Edit experience button")
    public void clickOnTheSaveEditExperienceButton() {
        WorkExperiencePageObg.SaveEditWorkExperience();
    }

    @And("Click on the delete Experience button")
    public void clickOnTheDeleteExperienceButton() {
        WorkExperiencePageObg.DeleteExperience();
    }

    @And("Click on the clients tab")
    public void clickOnTheClientsTab() {
        ClientsPageObj.ClickOnTheClientsTab();
    }

    @And("Add About your clients")
    public void addAboutYourClients() throws InterruptedException {
        ClientsPageObj.AddAboutYourClients();
    }

    @And("Click on the save add About your clients button")
    public void clickOnTheSaveAddAboutYourClientsButton() {
        ClientsPageObj.ClickOnSaveAddedAboutYourClients();
    }

    @Then("Check that About your clients is updated successfully")
    public void checkThatAboutYourClientsIsUpdatedSuccessfully() {
    }

    @And("Click on Add clients button")
    public void clickOnAddClientsButton() {
        ClientsPageObj.AddClientsBtn();
    }

    @And("Add new clients name")
    public void addNewClientsName() {
        ClientsPageObj.AddNewClientsName();
    }

    @And("Click on the save add new clients button")
    public void clickOnTheSaveAddNewClientsButton() {
        ClientsPageObj.ClickOnTheSaveAddNewClients();
    }

    @And("Click on the edit client button")
    public void clickOnTheEditClientButton() {
        ClientsPageObj.ClickOnTheEditClientsBtn();
    }

    @And("Edit the client name")
    public void editTheClientName() {
        ClientsPageObj.EditClientName();
    }

    @And("Click on the delete client button")
    public void clickOnTheDeleteClientButton() {
        ClientsPageObj.SaveEditClient();
    }

    @And("Click on the social media accounts tab")
    public void clickOnTheSocialMediaAccountsTab() {
        SocialMediaAccountsPageObj.ClickOnSocialMediaTab();
    }

    @And("Add social media accounts")
    public void addSocialMediaAccounts() {
        SocialMediaAccountsPageObj.AddTheInstagramMail();
    }

    @And("Click on the save add social media accounts")
    public void clickOnTheSaveAddSocialMediaAccounts() {
        SocialMediaAccountsPageObj.ClickOnSaveSocialMedia();
    }

    @Then("Check that social media accounts is added successfully")
    public void checkThatSocialMediaAccountsIsAddedSuccessfully() {
       Assert.assertEquals(SocialMediaAccountsPageObj.CheckAddedSocialMedia(),"تم الحفظ بنجاح.");
    }

    @And("Click on the bank account tab")
    public void clickOnTheBankAccountTab() {
        BankAccountPageObj.ClickOnBankAccountTabTab();
    }

    @And("Add the bank account")
    public void addTheBankAccount() {
    }

    @Then("Check that bank account is added successfully")
    public void checkThatBankAccountIsAddedSuccessfully() {
   Assert.assertEquals(BankAccountPageObj.CheckAddedBankAccountNumber(),"4111111111111111");
    }

    @And("Click on the Terms and Conditions tab")
    public void clickOnTheTermsAndConditionsTab() {
        TermsAndConditionsPageObj.ClickOnTermsAndConditionsTab();
    }

    @And("Add the Terms and Conditions")
    public void addTheTermsAndConditions() {
        TermsAndConditionsPageObj.AddTermsAndConditions();
    }

    @Then("Check that Terms and Conditions is added successfully")
    public void checkThatTermsAndConditionsIsAddedSuccessfully() {
        Assert.assertEquals(TermsAndConditionsPageObj.CheckAddedTermsAndConditions(),"تم الحفظ بنجاح.");

    }

    @And("Click on the save terms And Conditions button")
    public void clickOnTheSaveTermsAndConditionsButton() {
        TermsAndConditionsPageObj.ClickOnSaveAddTermsAndConditions();
    }

    @And("Click on the Return Policy tab")
    public void clickOnTheReturnPolicyTab() {
        ReturnPolicyPageObj.ClickOnReturnPolicyTab();
    }

    @And("Add the Return Policy")
    public void addTheReturnPolicy() {
        ReturnPolicyPageObj.AddReturnPolicy();
    }

    @And("Click on the save Return Policy button")
    public void clickOnTheSaveReturnPolicyButton() {
        ReturnPolicyPageObj.ClickOnSaveReturnPolicy();
    }

    @Then("Check that Return Policy is added successfully")
    public void checkThatReturnPolicyIsAddedSuccessfully() {
        Assert.assertEquals(ReturnPolicyPageObj.CheckAddedReturnPolicy(),"تم الحفظ بنجاح.");
    }


}
