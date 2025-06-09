package pages.Departments;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddNewDepartmentPopUp {
    public static String DepartmentName ;

    By ClickOnAddNewUserButton=By.xpath("//button[contains(text(),'مستخدم جديد')]");
    By DepartmentTextField=By.xpath("//input[@placeholder='أضف اسم الإدارة']");

    public void ClickOnAddNewUser(){
        driver.element().click(ClickOnAddNewUserButton);
    }
    public void EnterNameOfTheDepartment(){
        DepartmentName = faker.name().firstName();
        driver.element().type(DepartmentTextField, DepartmentName);
    }
}
