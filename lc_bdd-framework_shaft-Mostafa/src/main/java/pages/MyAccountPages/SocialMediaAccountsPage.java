package pages.MyAccountPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class SocialMediaAccountsPage {
    By InstagramTextField= By.xpath("//input[@id='instagram']");
    By SocialMediaTab=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]");
    By SaveSocialMedia=By.xpath("//button[@type='submit']");
    By CheckAddedSocialMedia=By.xpath("//div[@class='ant-notification-notice-message']");

    public void AddTheInstagramMail() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(InstagramTextField);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(InstagramTextField,"www.instagram.com");}

    public void ClickOnSocialMediaTab() {
        driver.element().click(SocialMediaTab);}

    public void ClickOnSaveSocialMedia() {
        driver.element().click(SaveSocialMedia);}

    public String CheckAddedSocialMedia() {
      return driver.element().getText(CheckAddedSocialMedia);}



}
