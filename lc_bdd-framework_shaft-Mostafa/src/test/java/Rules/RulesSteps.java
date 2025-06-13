package Rules;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.Rules.AddNewRulesPopUp;
import pages.Rules.RulesDetailsPage;

public class RulesSteps {
    Homepage homePage=new Homepage();
    AddNewRulesPopUp AddNewRulesObj=new AddNewRulesPopUp();
    RulesDetailsPage RulesDetailsPageObj = new RulesDetailsPage();


    @And("Click on Rules From sidebar Menu")
    public void clickOnRulesFromSidebarMenu() {
        homePage.ClickOnRulesPage();
    }

    @When("User click on the Add new rules button")
    public void userClickOnTheAddNewRulesButton() {
        RulesDetailsPageObj.ClickOnAddNewRuleBtn();
    }

    @And("Add new Rule name")
    public void addNewRuleName() {
        AddNewRulesObj.EnterNameOfTheRule();
    }

    @And("Add The Authorities")
    public void addTheAuthorities() {
        AddNewRulesObj.EnterTheAuthorities();
    }

    @And("click on  the save Rule button")
    public void clickOnTheSaveRuleButton() {
        AddNewRulesObj.ClickOnSaveAddedNewRule();
    }

    @Then("Check that new rule is added successfully")
    public void checkThatNewRuleIsAddedSuccessfully() {
        Assert.assertEquals(RulesDetailsPageObj.CheckAddedNewRule(),"تم اضافة دور");

    }

    @And("click on the edit button of the rule")
    public void clickOnTheEditButtonOfTheRule() {
        RulesDetailsPageObj.ClickOnEditBtn();
    }

    @And("Change the rule name")
    public void changeTheRuleName() {
        AddNewRulesObj.ChangeRuleName();
    }

    @Then("Check that new rule is updated successfully")
    public void checkThatNewRuleIsUpdatedSuccessfully() throws InterruptedException {
        Assert.assertEquals(RulesDetailsPageObj.CheckUpdatedRule(),"تم تعديل الدور");

    }

    @And("Click on the delete rule button")
    public void clickOnTheDeleteRuleButton() {
        RulesDetailsPageObj.ClickOnDeleteBtn();
    }

    @Then("Check that rule is deleted successfully")
    public void checkThatRuleIsDeletedSuccessfully() throws InterruptedException {

        Assert.assertEquals(RulesDetailsPageObj.CheckThatRuleisDelted(),"تم حذف الدور");

    }
}
