package CommunicationLogs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CommonPages.Homepage;
import pages.CommunicationLogsPages.CommunicationLogsDetailsPage;

public class CommunicationLogsSteps {
    Homepage homePage=new Homepage();
    CommunicationLogsDetailsPage CommunicationLogsDetailsPageObj=new CommunicationLogsDetailsPage();
    @And("Click on communication logs page From sidebar Menu")
    public void clickOnCommunicationLogsPageFromSidebarMenu() {
        homePage.ClickOnCommunicationLogsPage();
    }

    @When("User click on the add new contact record button")
    public void userClickOnTheAddNewContactRecordButton() {
        CommunicationLogsDetailsPageObj.ClickOnAddNewContactRecord();
    }
}
