package pages.Rules;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class RulesDetailsPage {
    By AddNewRule=By.xpath("//button[contains(text(),'إضافة ادوار')]");
    By CheckNewRulr=By.xpath("//div[@role='alert']//div[2]");
    By UpdateRule=By.xpath("/html[1]/body[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[2]");
    By EditBtn=By.xpath("//*[@id=\"kt_app_content_container\"]/div/div/div/div/div[3]/div[1]/table/tbody/tr[1]/td[3]/div/button[2]");
    By DeleteBtn=By.xpath("(//button)[5]");
    By ConfirmDelete=By.xpath("(//button[@class='d-flex gap-3 align-items-center btn btn-danger'])[1]");
    By CheckDeletedRule=By.xpath("//div[contains(text(),'تم حذف الدور')]");
    public void ClickOnAddNewRuleBtn()
    {

        driver.element().click(AddNewRule);
    }
    public String CheckAddedNewRule()
    {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        return driver.element().getText(CheckNewRulr);
    }
    public String CheckUpdatedRule() throws InterruptedException {
        return driver.element().getText(UpdateRule);
    }
    public String CheckThatRuleisDelted() throws InterruptedException {
        Thread.sleep(3000);
        return driver.element().getText(CheckDeletedRule);
    }

    public void ClickOnEditBtn()
    {
        driver.element().click(EditBtn);
    }

    public void ClickOnDeleteBtn()
    {
        driver.element().click(DeleteBtn);
        driver.element().click(ConfirmDelete);


    }
}

