package pages.Rules;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;
import static pages.LegalServicesPages.AddNewLegalServicePopUp.LegalServiceAddress;

public class AddNewRulesPopUp {
    public static String RuleName;
    By RuleNameTextField=By.xpath("//input[@placeholder='اكتب الاسم']");
    By AuthoritiesLists=By.xpath("(//div[@class='react-select__input-container css-19bb58m'])[1]");
    By EnterAuthorities=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[2]/div[1]/div[6]");
    By SaveAddedNewRule=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/button[2]");

    public void EnterNameOfTheRule() {
        RuleName = faker.name().title();
        driver.element().type(RuleNameTextField, RuleName);
    }
    public void EnterTheAuthorities() {
        driver.element().click(AuthoritiesLists);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EnterAuthorities);
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(AuthoritiesLists);

    }
    public void ClickOnSaveAddedNewRule() {
        driver.element().click(SaveAddedNewRule);
    }
    public void ChangeRuleName ()  {

        driver.element().clear(RuleNameTextField);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().type(RuleNameTextField, "Edit");

    }

}