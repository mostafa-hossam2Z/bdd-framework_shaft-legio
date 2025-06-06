package pages.Users;

import org.openqa.selenium.By;
import pages.CommonPages.base;

import static pages.CommonPages.base.driver;
import static pages.Users.AddNewUserPopUp.Name;
public class UsersDetailsPage extends base {

    By SearchOnUserName=By.id("filter-input-name");
    By CheckUserName=By.cssSelector("tbody tr td:nth-child(2)");
    By EditBtn= By.xpath("(//i[@class='bi bi-pencil-square fs-3'])[1]");
    By CheckEditUserName=By.xpath("//div[contains(text(),'تم تعديل المستخدم بنجاح')]");
    By DeleteBtn=By.xpath("//i[@class='bi bi-trash fs-3']");
    By ConfirmDelete=By.cssSelector("button[class='d-flex gap-3 align-items-center btn btn-danger']");
    By CheckDeleteUser=By.xpath("//div[contains(text(),'تم حذف المستخدم بنجاح')]");
    By ResetPasswordButton= By.xpath("//tbody/tr[1]/td[4]/button[1]");
    By ConfirmResetPassword=By.xpath("(//button[@class='d-flex gap-3 align-items-center btn btn-danger'])[1]");

    public String CheckUserName()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       return driver.element().getText(CheckUserName);
    }

    public void SearchOnUserName()
    {
        driver.browser().refreshCurrentPage();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().type(SearchOnUserName,Name);
        }
    public void ClickOnEditBtn()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(EditBtn);
    }
    public String CheckEditUserName()
    {
        return driver.element().getText(CheckEditUserName);
    }
    public String CheckDeleteUser()
    {
        return driver.element().getText(CheckDeleteUser);
    }
    public void ClickOnDeleteIcon(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(DeleteBtn);
        driver.element().click(ConfirmDelete);
    }
    public void ResetPasswordButton(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(ResetPasswordButton);
        driver.element().click(ConfirmResetPassword);
    }
}
