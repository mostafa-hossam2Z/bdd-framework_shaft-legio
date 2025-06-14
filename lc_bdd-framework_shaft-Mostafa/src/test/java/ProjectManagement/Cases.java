package ProjectManagement;

import com.shaft.gui.element.ElementActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Case.AddNewSessionPopUpPage;
import pages.Case.DetailsPage;
import pages.CommonPages.Homepage;
import pages.Case.AddNewCasePopUp;
import pages.Case.CaseDetailsPage;

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
    }

    @Then("check that message is sent successfully")
    public void checkThatMessageIsSentSuccessfully() {
    }
}


