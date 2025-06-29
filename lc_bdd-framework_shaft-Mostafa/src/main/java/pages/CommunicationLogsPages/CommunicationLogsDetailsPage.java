package pages.CommunicationLogsPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class CommunicationLogsDetailsPage {
    By AddNewContactRecord= By.xpath("//button[contains(text(),'سجل تواصل جديد')]");

    public void ClickOnAddNewContactRecord(){
        driver.element().click(AddNewContactRecord);
    }
}
