package pages.TimePackagePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static pages.CommonPages.base.driver;

public class TimePackageListPage {
    By EditQuarterButton=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]");
    By PriceField=By.xpath("//input[@id='price']");
    By SaveAddQuarterTime=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[2]");
    By CheckChangedQuarterTime=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    By BlockTimePackageForQuarterTime=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
    By BlockTimePackageForHalfHourTime=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
    By EditHalfButton=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]");
    By EditFortyFiveButton=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]");
    By EditOneHourButton=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]");
    By CheckChangedHalfHourTime=By.xpath("//div[contains(text(),'250.00 ريال')]");
    By CheckChangedFortyFiveTime=By.xpath("//div[contains(text(),'300.00 ريال')]");
    By CheckChangedForOneHourTime=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    By BlockTimePackageForFortyFiveTime=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
    By BlockTimePackageForOneHourTime=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
    public void ClickOnEditQuarterButton() {
        driver.element().click(EditQuarterButton);}
    public void ClickOnEditHalfButton() {
        driver.element().click(EditHalfButton);}
    public void ClickOnEditFortyFiveButton() {
        driver.element().click(EditFortyFiveButton);}
    public void ClickOnEditOneHourButton() {
        driver.element().click(EditOneHourButton);}

    public void EnterPrice() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(PriceField);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(PriceField,"150");}

    public void EnterPriceForHalfHour() {
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(PriceField);
        try {Thread.sleep(4000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(PriceField,"250");}

    public void EnterPriceForFortyFive() {
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(PriceField);
        try {Thread.sleep(4000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(PriceField,"300");}
    public void EnterPriceForOneHour() {
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().clear(PriceField);
        try {Thread.sleep(4000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().type(PriceField,"500");}


    public void clickOnSaveQuarterBtn() {
        driver.element().click(SaveAddQuarterTime);}


    public String CheckChangedQuarterTime() {
        return driver.element().getText(CheckChangedQuarterTime);}
    public String CheckChangedHalfHourTime() {
        return driver.element().getText(CheckChangedHalfHourTime);}
    public String CheckChangedFortyFiveTime() {
        return driver.element().getText(CheckChangedFortyFiveTime);}
    public String CheckChangedForOneHourTime() {
        return driver.element().getText(CheckChangedForOneHourTime);}

    public void BlockTimePackageForQuarterTime() {
        driver.element().click(BlockTimePackageForQuarterTime);}
    public void BlockTimePackageForHalfHourTime() {
        driver.element().click(BlockTimePackageForHalfHourTime);}
    public void BlockTimePackageForFortyFiveTime() {
        driver.element().click(BlockTimePackageForFortyFiveTime);}
    public void BlockTimePackageForOneHourTime() {
        driver.element().click(BlockTimePackageForOneHourTime);}

    public void CheckBlockedQuarterTime() {
        WebElement CheckBlockQuarter = driver.getDriver().findElement(By.cssSelector("button.ant-btn-primary.ant-btn-color-primary"));
        //Assert.assertTrue(CheckBlockQuarter.isDisplayed(), "Button is not displayed");
        Assert.assertFalse(CheckBlockQuarter.isEnabled(), "Button should be disabled");
    }
    public void CheckBlockedHalfHourTime() {
        WebElement CheckBlockHalfHour = driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]"));
        //Assert.assertTrue(CheckBlockQuarter.isDisplayed(), "Button is not displayed");
        Assert.assertFalse(CheckBlockHalfHour.isEnabled(), "Button should be disabled");}

    public void CheckBlockedFortyFiveTime() {
        WebElement CheckBlockFortyFiveTime = driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
        Assert.assertFalse(CheckBlockFortyFiveTime.isEnabled(), "Button should be disabled");}
    public void CheckBlockedForOneHourTime() {
        WebElement CheckBlockForOneHour = driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
        Assert.assertFalse(CheckBlockForOneHour.isEnabled(), "Button should be disabled");}
}
