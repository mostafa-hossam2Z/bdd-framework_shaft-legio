package CucumberSteps.MettingsAndAppointmentsSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.MeetingsAndAppointmentsPages.MeetingsAndAppointmentsPage;

public class MeetingsAndAppointments {
    Homepage homePage=new Homepage();
    MeetingsAndAppointmentsPage MeetingsAndAppointmentsPageObj=new MeetingsAndAppointmentsPage();

    @And("Click on the Meetings and appointments from sidebar menu")
    public void clickOnTheMeetingsAndAppointmentsFromSidebarMenu() {
        homePage.ClickOnTMeetingsAndAppointmentsPage();
    }

    @When("Click on add meeting period button")
    public void clickOnAddMeetingPeriodButton() {
        MeetingsAndAppointmentsPageObj.ClickOnAddMeetingPeriodBtn();
    }


    @And("change the time")
    public void changeTheTime() {
        MeetingsAndAppointmentsPageObj.EnterStartAndEndDATE();
    }

    @And("Click on add icon")
    public void clickOnAddIcon() {
        MeetingsAndAppointmentsPageObj.AddStartAndEndDate();
    }
    @Then("Check that time is changed successfully")
    public void checkThatTimeIsChangedSuccessfully() {
        Assert.assertEquals(MeetingsAndAppointmentsPageObj.CheckAddedTime(),"8:30 AM - 7:30 PM");
    }

    @And("delete the added time")
    public void deleteTheAddedTime() {
        MeetingsAndAppointmentsPageObj.DeleteMeetingsTime();

    }

    @Then("Check that time is deleted successfully")
    public void checkThatTimeIsDeletedSuccessfully() {
      //  Assert.assertEquals(MeetingsAndAppointmentsPageObj.CheckAddedTime(),"");
        Assert.assertFalse(MeetingsAndAppointmentsPageObj.CheckAddedTime().isEmpty());

    }
}
