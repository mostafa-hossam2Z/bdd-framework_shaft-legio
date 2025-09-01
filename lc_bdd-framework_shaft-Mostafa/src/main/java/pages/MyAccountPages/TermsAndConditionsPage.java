package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class TermsAndConditionsPage {

    By TermsAndConditionsTab=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]");
    By TermsAndConditionsTextBox=By.xpath("//div[@role='textbox']");
    By SaveAddTermsAndConditions=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
    By CheckAddedTermsAndConditions=By.xpath("//div[@class='ant-notification-notice-message']");


    public void ClickOnTermsAndConditionsTab() {
        driver.element().click(TermsAndConditionsTab);}
    public void ClickOnSaveAddTermsAndConditions() {
        driver.element().click(SaveAddTermsAndConditions);}
    public void AddTermsAndConditions() {
        driver.element().type(TermsAndConditionsTextBox,"TermsAndConditions");}


    public String CheckAddedTermsAndConditions() {
        return driver.element().getText(CheckAddedTermsAndConditions);}
}
