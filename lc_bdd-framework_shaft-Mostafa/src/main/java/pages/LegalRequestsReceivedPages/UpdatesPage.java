package pages.LegalRequestsReceivedPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class UpdatesPage {
    By UpdatesTab=By.xpath("//a[contains(text(),'التحديثات')]");
    By AddUpdate=By.xpath("//button[contains(text(),'اضافة تحديث')]");
    By CheckAddedUpdates=By.xpath("//div[contains(text(),'تم اضافة تحديث بنجاح')]");

    public void ClickOnUpdatesTab(){
        driver.element().click(UpdatesTab);}
    public void ClickOnAddUpdate(){
        driver.element().click(AddUpdate);}


    public String CheckAddedUpdates(){
        return driver.element().getText(CheckAddedUpdates);}
}
