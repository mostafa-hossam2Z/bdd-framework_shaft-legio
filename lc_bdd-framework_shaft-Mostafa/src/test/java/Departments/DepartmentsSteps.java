package Departments;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.Departments.AddNewDepartmentPopUp;
import pages.Departments.DepartmentsDetailsPage;
import pages.Login.loginpage;
import pages.Users.AddNewUserPopUp;
import pages.Users.UsersDetailsPage;

import static pages.Users.AddNewUserPopUp.Name;

public class DepartmentsSteps {
    Homepage homePage=new Homepage();
    AddNewDepartmentPopUp  AddNewDepartmentPopUpObj =new AddNewDepartmentPopUp();
    DepartmentsDetailsPage DepartmentsDetailsPageObj=new DepartmentsDetailsPage();
    UsersDetailsPage UsersDetailsPageObj=new UsersDetailsPage();


    @And("Click on Departments From sidebar Menu")
    public void clickOnDepartmentsFromSidebarMenu() {
        homePage.ClickOnDepartmentPage();
    }

    @Given("User click on the Add new Department button")
    public void userClickOnTheAddNewDepartmentButton() {
        DepartmentsDetailsPageObj.ClickOnAddNewDepartmentButton();
    }

    @And("Add department name")
    public void addDepartmentName() {
        AddNewDepartmentPopUpObj.EnterNameOfTheDepartment();

    }

    @And("click on  the save department button")
    public void clickOnTheSaveDepartmentButton() {
    }

    @And("Search by the username of the department")
    public void searchByTheUsernameOfTheDepartment() {
    }

    @Then("Check that new department is added successfully")
    public void checkThatNewDepartmentIsAddedSuccessfully() {
        Assert.assertEquals(DepartmentsDetailsPageObj.CheckAddedNewDepartment(),"تم إضافة الإدارة بنجاح");

    }

    @Then("Check that new department is founded successfully")
    public void checkThatNewDepartmentIsFoundedSuccessfully() {
        Assert.assertEquals(UsersDetailsPageObj.CheckUserName(),Name);

    }

    @And("Click on the Edit department option")
    public void clickOnTheEditDepartmentOption() {
        DepartmentsDetailsPageObj.ClickOnEditBtn();
    }

    @Then("Check that department name is updated successfully")
    public void checkThatDepartmentNameIsUpdatedSuccessfully() {
        Assert.assertEquals(DepartmentsDetailsPageObj.CheckUpdatedDepartment(),"تم تعديل الإدارة بنجاح");

    }

    @Then("Check that department name is deleted successfully")
    public void checkThatDepartmentNameIsDeletedSuccessfully() {
        Assert.assertEquals(DepartmentsDetailsPageObj.CheckDeleteDepartment(),"تم حذف الإدارة بنجاح");

    }

    @And("Click on the Reset password button")
    public void clickOnTheResetPasswordButton() {
        DepartmentsDetailsPageObj.ClickOnResetBtn();

    }


}
