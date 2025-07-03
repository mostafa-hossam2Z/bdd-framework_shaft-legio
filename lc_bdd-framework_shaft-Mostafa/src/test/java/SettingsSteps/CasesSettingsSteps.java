package SettingsSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Case.CaseDetailsPage;
import pages.CommonPages.Homepage;
import pages.SettingsPages.CasesSettingsDetailsPage;

public class CasesSettingsSteps {
   Homepage homepage=new Homepage();
    CaseDetailsPage CaseDetailsPageObj= new CaseDetailsPage();
    CasesSettingsDetailsPage CasesSettingsDetailsPageObj=new CasesSettingsDetailsPage();
    @And("Click on Cases Settings From sidebar Menu")
    public void clickOnCasesSettingsFromSidebarMenu() {
        homepage.ClickOnCasesSettingsPage();
    }

    @When("User click on the Add new Case settings button")
    public void userClickOnTheAddNewCaseSettingsButton() {
         CaseDetailsPageObj.ClickOnAddNewCaseSettingsBtn();


    }

    @Then("Check that new Case type is added successfully")
    public void checkThatNewCaseTypeIsAddedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckAddedNewTypeCase(),"تم إضافة نوع القضية بنجاح");
    }

    @And("Search by case address")
    public void searchByCaseAddress() {
        CasesSettingsDetailsPageObj.SearchNewTypeCase();

    }

    @And("Click on the delete case type button")
    public void clickOnTheDeleteCaseTypeButton() {
        CasesSettingsDetailsPageObj.DeleteCaseTypeBtn();
    }

    @And("Click on the Edit case type option")
    public void clickOnTheEditCaseTypeOption() {
        CasesSettingsDetailsPageObj.EditCaseTypeOption();
    }

    @Then("Check that new Case type is updated successfully")
    public void checkThatNewCaseTypeIsUpdatedSuccessfully() {
    Assert.assertEquals(CasesSettingsDetailsPageObj.CheckUpdatedTypeCase(),"تم تعديل نوع القضية بنجاح");
    }

    @Then("Check that new Case type is deleted successfully")
    public void checkThatNewCaseTypeIsDeletedSuccessfully() {
        Assert.assertEquals(CasesSettingsDetailsPageObj.CheckDeletedTypeCase(),"تم حذف نوع القضية بنجاح");

    }
}
