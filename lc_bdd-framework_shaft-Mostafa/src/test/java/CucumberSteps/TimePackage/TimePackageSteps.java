package CucumberSteps.TimePackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.TimePackagePages.TimePackageListPage;

public class TimePackageSteps {
    Homepage homePage=new Homepage();
    TimePackageListPage TimePackageListPageObj=new TimePackageListPage();

    @And("Click on the time package page from side bar menu")
    public void clickOnTheTimePackagePageFromSideBarMenu() {
        homePage.ClickOnTimePackagePage();
    }
    @And("Click on the edit time package for quarter hour")
    public void clickOnTheEditTimePackageForQuarterHour() {
        TimePackageListPageObj.ClickOnEditQuarterButton();
    }
    @And("Change the price")
    public void changeThePrice() {
        TimePackageListPageObj.EnterPrice();
    }
    @And("Change the price for half hour")
    public void changeThePriceForHalfHour() {
        TimePackageListPageObj.EnterPriceForHalfHour();
    }
    @And("Click on the save edit price")
    public void clickOnTheSaveEditPrice() {
        TimePackageListPageObj.clickOnSaveQuarterBtn();
    }

    @Then("Check that price is changed Successfully")
    public void checkThatPriceIsChangedSuccessfully() {
        Assert.assertEquals(TimePackageListPageObj.CheckChangedQuarterTime(),"105.00 ريال");
    }

    @And("Click on the block time package for quarter hour")
    public void clickOnTheBlockTimePackageForQuarterHour() {
        TimePackageListPageObj.BlockTimePackageForQuarterTime();}

    @Then("Check that time package for quarter hour is blocked Successfully")
    public void checkThatTimePackageForQuarterHourIsBlockedSuccessfully() {
        TimePackageListPageObj.CheckBlockedQuarterTime();
    }

    @And("Click on the edit time package for half hour")
    public void clickOnTheEditTimePackageForHalfHour() {
        TimePackageListPageObj.ClickOnEditHalfButton();
    }

    @Then("Check that price for half hour is changed Successfully")
    public void checkThatPriceForHalfHourIsChangedSuccessfully() {
        Assert.assertEquals(TimePackageListPageObj.CheckChangedHalfHourTime(),"250.00 ريال");

    }


    @And("Click on the block time package for half hour")
    public void clickOnTheBlockTimePackageForHalfHour() {
        TimePackageListPageObj.BlockTimePackageForHalfHourTime();
    }

    @Then("Check that time package for half hour is blocked Successfully")
    public void checkThatTimePackageForHalfHourIsBlockedSuccessfully() {
        TimePackageListPageObj.CheckBlockedHalfHourTime();
    }

    @And("Click on the edit time package for forty five minute")
    public void clickOnTheEditTimePackageForFortyFiveMinute() {
        TimePackageListPageObj.ClickOnEditFortyFiveButton();
    }

    @And("Change the price for forty five minute")
    public void changeThePriceForFortyFiveMinute() {
        TimePackageListPageObj.EnterPriceForFortyFive();
    }

    @Then("Check that price for forty five minute is changed Successfully")
    public void checkThatPriceForFortyFiveMinuteIsChangedSuccessfully() {
        Assert.assertEquals(TimePackageListPageObj.CheckChangedFortyFiveTime(),"300.00 ريال");
    }

    @And("Click on the block time package for forty five minute")
    public void clickOnTheBlockTimePackageForFortyFiveMinute() {
        TimePackageListPageObj.BlockTimePackageForFortyFiveTime();
    }

    @Then("Check that time package for forty five minute is blocked Successfully")
    public void checkThatTimePackageForFortyFiveMinuteIsBlockedSuccessfully() {
        TimePackageListPageObj.CheckBlockedFortyFiveTime();
    }

    @And("Click on the edit time package for one hour")
    public void clickOnTheEditTimePackageForOneHour() {
        TimePackageListPageObj.ClickOnEditOneHourButton();
    }

    @And("Change the price for one hour")
    public void changeThePriceForOneHour() {
        TimePackageListPageObj.EnterPriceForOneHour();
    }

    @Then("Check that price for one hour is changed Successfully")
    public void checkThatPriceForOneHourIsChangedSuccessfully() {
        Assert.assertEquals(TimePackageListPageObj.CheckChangedForOneHourTime(),"500.00 ريال");


    }

    @And("Click on the block time package for one hour")
    public void clickOnTheBlockTimePackageForOneHour() {
        TimePackageListPageObj.BlockTimePackageForOneHourTime();
    }

    @Then("Check that time package for one hour is blocked Successfully")
    public void checkThatTimePackageForOneHourIsBlockedSuccessfully() {
        TimePackageListPageObj.CheckBlockedForOneHourTime();
    }
}
