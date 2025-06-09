package pages.Departments;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.Users.AddNewUserPopUp.Name;

public class DepartmentsDetailsPage {
    By AddNewDepartmentButton=By.xpath("//button[contains(text(),'إدارة جديدة')]");
    By CheckNewDepartment=By.xpath("//div[contains(text(),'تم إضافة الإدارة بنجاح')]");
    By EditBtn= By.xpath("(//i[@class='bi bi-pencil-square fs-3'])[1]");
    By CheckUpdatedDepartment=By.xpath("//div[contains(text(),'تم تعديل الإدارة بنجاح')]");
    By DeletDepartment=By.xpath("//div[contains(text(),'تم حذف الإدارة بنجاح')]");
    By ResetPasswordBtn=By.xpath("//tbody/tr[1]/td[5]/button[1]");
    By ConfirmResetPassword=By.xpath("(//button[@class='d-flex gap-3 align-items-center btn btn-danger'])[1]");

    public void ClickOnAddNewDepartmentButton(){
        driver.element().click(AddNewDepartmentButton);
    }
    public String CheckAddedNewDepartment()
    {
        return driver.element().getText(CheckNewDepartment);
    }
    public String CheckUpdatedDepartment()
    {
        return driver.element().getText(CheckUpdatedDepartment);
    }
    public void ClickOnEditBtn()
    {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EditBtn);
    }
    public String CheckDeleteDepartment()
    {
        return driver.element().getText(DeletDepartment);
    }
    public void ClickOnResetBtn()
    {
        driver.element().click(ResetPasswordBtn);
        driver.element().click(ConfirmResetPassword);

    }

}
