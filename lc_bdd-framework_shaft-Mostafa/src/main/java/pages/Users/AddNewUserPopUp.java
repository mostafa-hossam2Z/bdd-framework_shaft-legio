package pages.Users;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPages.base;

import java.time.Duration;
import java.util.List;

public class AddNewUserPopUp extends base {

    By ClickOnAddNewUserButton=By.xpath("//button[contains(text(),'مستخدم جديد')]");
    public static String Name ;
    By NameTextField=By.xpath("//input[@placeholder='اكتب اسم المستخدم']");
    public static String Email ;
    By EmailTextField=By.xpath("//input[@placeholder='اكتب البريد الإلكتروني']");
    By SaveAddNewUser =By.xpath("//button[contains(text(),'حفظ')]");



    public void ClickOnAddNewUser(){
        driver.element().click(ClickOnAddNewUserButton);
        Name = faker.name().firstName();
    }
    public void EnterNameOfTheUser(){
        Name = faker.name().firstName();
        driver.element().type(NameTextField, Name);
    }
    public void EnterEmailOfTheUser(){
        Email = faker.name().lastName();
        driver.element().type(EmailTextField, Email+"@legio.com");
    }
    public void ChooseTheRule() throws InterruptedException {

      //  WebElement dropdownTrigger = driver.getDriver().findElement(By.cssSelector("div[class='react-select__value-container css-hlgwow'] div[class='react-select__input-container css-19bb58m']"));
        WebElement hiddenDropdown = driver.getDriver().findElement(By.cssSelector("div[class='react-select__value-container css-hlgwow'] div[class='react-select__input-container css-19bb58m']"));
        hiddenDropdown.click();
        WebElement Click= driver.getDriver().findElement(By.xpath("(//div[@id='react-select-2-option-0'])[1]"));
        Click.click();
        //JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript("arguments[0].style.display='block';", hiddenDropdown);
      //  js.executeScript("arguments[0].style.visibility='visible';", hiddenDropdown);
      //  hiddenDropdown.findElement(By.cssSelector("سكرتارية")).click();
        Thread.sleep(2000);
    }
        public void ChooseThePermission () {
            WebElement PermissionList = driver.getDriver().findElement(By.xpath("//div[@class='react-select__value-container react-select__value-container--is-multi css-hlgwow']//div[@class='react-select__input-container css-19bb58m']"));
            ((JavascriptExecutor) driver.getDriver())
                    .executeScript("arguments[0].click();", PermissionList);

        }
        public void ClickOnTheSaveAddNewUser () throws InterruptedException {
            driver.element().click(SaveAddNewUser);
            Thread.sleep(3000);
        }
    public void ChangeUserName ()  {

        driver.element().clear(NameTextField);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       driver.element().type(NameTextField, "Edit");

    }


    }
