package AgenciesAndDelegations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AgenciesAndDelegationsPages.AddNewAgencies;
import pages.AgenciesAndDelegationsPages.AgenciesDetailsPage;
import pages.CommonPages.Homepage;

public class AgenciesAndDelegationsSteps {
    Homepage homePage=new Homepage();
    AddNewAgencies AddNewAgenciesObj=new AddNewAgencies();
    AgenciesDetailsPage AgenciesDetailsPageObj=new AgenciesDetailsPage();

    @And("Click on Agencies And Delegations From sidebar Menu")
    public void clickOnAgenciesAndDelegationsFromSidebarMenu() {
        homePage.ClickOnAgenciesAndDelegationsPage();
    }

    @When("User click on the Add new Agency button")
    public void userClickOnTheAddNewAgencyButton() {
        AgenciesDetailsPageObj.ClickOnTheAddNewAgencyBtn();
    }

    @And("Add Agency number")
    public void addAgencyNumber() {
        AddNewAgenciesObj.EnterAgencyNumber();
    }

    @And("Add Select the case")
    public void addSelectTheCase() {
        AddNewAgenciesObj.SelectTheCase();
    }

    @And("Choose start date")
    public void chooseStartDate() {
        AddNewAgenciesObj.ChooseStartDate();
    }

    @And("Choose end date")
    public void chooseEndDate() {
        AddNewAgenciesObj.ChooseEndDate();
    }

    @And("Enter the comments")
    public void enterTheComments() {
        AddNewAgenciesObj.EnterComment();
    }
    @And("Click on the save add new agency button")
    public void clickOnTheSaveAddNewAgencyButton() {
        AddNewAgenciesObj.ClickOnSaveAddedNewAgency();

    }
    @Then("Check that new Agency is added successfully")
    public void checkThatNewAgencyIsAddedSuccessfully() {
        Assert.assertEquals(AgenciesDetailsPageObj.CheckAddedNewAgency(),"تم الاضافة بنجاح");
    }

    @And("Delete the agency")
    public void deleteTheAgency() {
        AgenciesDetailsPageObj.DeleteAgency();
    }


    @Then("Check that  Agency is Deleted successfully")
    public void checkThatAgencyIsDeletedSuccessfully() {
        Assert.assertEquals(AgenciesDetailsPageObj.CheckDeletedAgency(),"تم حذف الوكالة بنجاح");
    }

    @And("Click on edit agency button")
    public void clickOnEditAgencyButton() {
        AgenciesDetailsPageObj.ClickOnEditAgencyBtn();
    }
}
