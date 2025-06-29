package Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.Login.loginpage;
import pages.Users.AddNewUserPopUp;
import pages.Users.UsersDetailsPage;

import static pages.Users.AddNewUserPopUp.Name;

public class UsersSteps {

    loginpage loginpageobj =new loginpage();
    Homepage homePage=new Homepage();
    AddNewUserPopUp AddNewUserPopUpObj =new AddNewUserPopUp();
    UsersDetailsPage UsersDetailsPageObj=new UsersDetailsPage();


    @And("Assign the trainees")
    public void assignTheTrainees() {
    }

    @Given("User login as a trainee")
    public void userLoginAsATrainee() throws InterruptedException {
        loginpageobj.loginAsTrainee();
    }

    @And("logout")
    public void logout() throws InterruptedException {
        loginpageobj.logout();
    }

    @And("Click on users From sidebar Menu")
    public void clickOnUsersFromSidebarMenu() {
        homePage.ClickOnUserPage();
    }

    @Given("User click on the Add new user button")
    public void userClickOnTheAddNewUserButton() {
        AddNewUserPopUpObj.ClickOnAddNewUser();
    }

    @And("Add new username")
    public void Addnewusername() {
        AddNewUserPopUpObj.EnterNameOfTheUser();
    }

    @And("Add Email")
    public void addEmail() {
        AddNewUserPopUpObj.EnterEmailOfTheUser();
    }

    @And("choose rule")
    public void chooseRule() throws InterruptedException {
        AddNewUserPopUpObj.ChooseTheRule();
    }

    @And("Add permissions")
    public void addPermissions() {
        AddNewUserPopUpObj.ChooseThePermission();
    }

    @And("click on  the save button")
    public void clickOnTheSaveButton() throws InterruptedException {
        AddNewUserPopUpObj.ClickOnTheSaveAddNewUser();
    }

    @Then("Check that new user is added successfully")
    public void checkThatNewUserIsAddedSuccessfully() {
        Assert.assertEquals(UsersDetailsPageObj.CheckUserAdded(),"تم إضافة المستخدم بنجاح");


    }

    @And("Search by the username")
    public void searchByTheUsername() {
        UsersDetailsPageObj.SearchOnUserName();

    }

    @And("Click on the Edit option")
    public void clickOnTheEditOption() {
        UsersDetailsPageObj.ClickOnEditBtn();
    }

    @And("change the username")
    public void changeTheUsername() {
        AddNewUserPopUpObj.ChangeUserName();

    }

    @Then("Check that username is updated successfully")
    public void checkThatUsernameIsUpdatedSuccessfully() {
        Assert.assertEquals(UsersDetailsPageObj.CheckEditUserName(),"تم تعديل المستخدم بنجاح");

    }

    @And("Click on the delete button")
    public void clickOnTheDeleteButton() {
        UsersDetailsPageObj.ClickOnDeleteIcon();

    }

    @Then("Check that username is deleted successfully")
    public void checkThatUsernameIsDeletedSuccessfully() {
        Assert.assertEquals(UsersDetailsPageObj.CheckDeleteUser(),"تم حذف المستخدم بنجاح");

    }

    @And("Click on the reset password button")
    public void clickOnTheResetPasswordButton() {
        UsersDetailsPageObj.ResetPasswordButton();

    }

    @Then("Check that Password is updated successfully")
    public void checkThatPasswordIsUpdatedSuccessfully() {
        Assert.assertEquals(UsersDetailsPageObj.CheckResetPassword(),"تم إعادة ضبط كلمة المرور بنجاح");


    }



}
