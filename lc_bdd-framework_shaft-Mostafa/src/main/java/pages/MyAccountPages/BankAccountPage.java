package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class BankAccountPage {
    By BankAccountTab=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]");
    By SaveSocialMedia=By.xpath("//button[@type='submit']");
    By CheckAddedAccountNumber=By.xpath("//input[@id='account_number']");


    public void ClickOnBankAccountTabTab() {
        driver.element().click(BankAccountTab);}

    public void ClickOnSaveSocialMedia() {
        driver.element().click(SaveSocialMedia);}

    public String CheckAddedBankAccountNumber() {
        return driver.element().getText(CheckAddedAccountNumber);}



}


