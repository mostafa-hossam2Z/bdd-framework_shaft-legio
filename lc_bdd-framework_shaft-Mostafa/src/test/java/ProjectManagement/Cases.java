package ProjectManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.ProjectManagement.AddNewCasePopUp;
import pages.ProjectManagement.CaseDetailsPage;

public class Cases {
    Homepage homepage=new Homepage();
    CaseDetailsPage CaseDetailsPageObj= new CaseDetailsPage();
    AddNewCasePopUp AddNewCasePopUpObj=new AddNewCasePopUp();
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
}
