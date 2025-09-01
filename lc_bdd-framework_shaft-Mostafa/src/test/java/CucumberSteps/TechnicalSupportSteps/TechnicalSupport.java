package CucumberSteps.TechnicalSupportSteps;

import io.cucumber.java.en.And;
import pages.CommonPages.Homepage;
import pages.TechnicalSupportPages.AddTechnicalSupportPage;

public class TechnicalSupport {
    Homepage homePage=new Homepage();
    AddTechnicalSupportPage AddTechnicalSupportPageObj=new AddTechnicalSupportPage();


    @And("Click on the technical support page from sidebar menu")
    public void clickOnTheTechnicalSupportPageFromSidebarMenu() {
        homePage.ClickOnTechnicalSupportPage();
    }

    @And("Click on the add new chat button")
    public void clickOnTheAddNewChatButton() {
        AddTechnicalSupportPageObj.ClickOnAddNewChatBtn();
    }

    @And("Enter the content")
    public void enterTheContent() {
        AddTechnicalSupportPageObj.EnterTheContent();
    }

    @And("Enter the description")
    public void enterTheDescription() {
        AddTechnicalSupportPageObj.EnterTheDescription();
    }

    @And("Click on the create button")
    public void clickOnTheCreateButton() {
        AddTechnicalSupportPageObj.ClickOnCreateNewChatBtn();
    }

    @And("Click on  the view chat button")
    public void clickOnTheViewChatButton() {
        AddTechnicalSupportPageObj.ClickOnViewChatBtn();}

    @And("Add your text")
    public void addYourText() {
        AddTechnicalSupportPageObj.EnterTheMessage();
    }
}
