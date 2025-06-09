package pages.Users;

import org.openqa.selenium.By;
import pages.CommonPages.base;

import static pages.CommonPages.base.driver;
import static pages.Users.AddNewUserPopUp.Name;
public class UsersDetailsPage extends base {

    By SearchOnUserName=By.id("filter-input-name");
    By CheckAddedUser=By.xpath("//div[contains(text(),'تم إضافة المستخدم بنجاح')]");
    By CheckUserName=By.cssSelector("tbody tr td:nth-child(2)");
    By EditBtn= By.xpath("(//i[@class='bi bi-pencil-square fs-3'])[1]");
    By CheckEditUserName=By.xpath("//div[contains(text(),'تم تعديل المستخدم بنجاح')]");
    By DeleteBtn=By.xpath("//i[@class='bi bi-trash fs-3']");
    By ConfirmDelete=By.cssSelector("button[class='d-flex gap-3 align-items-center btn btn-danger']");
    By CheckDeleteUser=By.xpath("//div[contains(text(),'تم حذف المستخدم بنجاح')]");
    By ResetPasswordButton= By.xpath("//tbody/tr[1]/td[4]/button[1]");
    By ConfirmResetPassword=By.xpath("(//button[@class='d-flex gap-3 align-items-center btn btn-danger'])[1]");
    By CheckResetPassword =By.xpath("//div[contains(text(),'تم إعادة ضبط كلمة المرور بنجاح')]");
    public String CheckUserName()
    {
       return driver.element().getText(CheckUserName);
    }
    public String CheckUserAdded()
    {
        return driver.element().getText(CheckAddedUser);
    }
    public void SearchOnUserName()
    {
        driver.browser().refreshCurrentPage();
        driver.element().type(SearchOnUserName,Name);
        driver.browser().refreshCurrentPage();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void ClickOnEditBtn()
    {

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

        driver.element().click(DeleteBtn);
        driver.element().click(ConfirmDelete);
    }
    public void ResetPasswordButton(){

        driver.element().click(ResetPasswordButton);
        driver.element().click(ConfirmResetPassword);
    }
    public String CheckResetPassword()
    {
        return driver.element().getText(CheckResetPassword);
    }
}
