package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class ReturnPolicyPage {

    By ReturnPolicyTab=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]");
    By ReturnPolicyTextBox=By.xpath("//div[@role='textbox']");
    By SaveAddReturnPolicy=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
    By CheckAddedReturnPolicy=By.xpath("//div[@class='ant-notification-notice-message']");


    public void ClickOnReturnPolicyTab() {
        driver.element().click(ReturnPolicyTab);}
    public void ClickOnSaveReturnPolicy() {
        driver.element().click(SaveAddReturnPolicy);}
    public void AddReturnPolicy() {
        driver.element().type(ReturnPolicyTextBox,"Return Policy");}


    public String CheckAddedReturnPolicy() {
        return driver.element().getText(CheckAddedReturnPolicy);}

}
