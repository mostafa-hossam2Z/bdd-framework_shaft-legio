package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class ReportsPage {
    public static String ReportAddress;
    public static String ReportDetails;

    By ReportAddressTextBox=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/input[1]");
    By ReportDetailsTextBox=By.xpath("//div[@aria-label='منطقة تحرير المحرر: main']");
    By SaveButton=By.xpath("//button[contains(text(),'حفظ')]");
    By CheckAddedReport=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]");

    public void EnterTheReportAddress() {
        ReportAddress = faker.name().title();
        driver.element().type(ReportAddressTextBox,ReportAddress);}

    public void EnterTheReportDetails() {
        ReportDetails = faker.toString();
        driver.element().type(ReportDetailsTextBox,ReportDetails);}

    public void ClickSaveReportBtn() {driver.element().click(SaveButton);}
    public String CheckAddedReport() {return driver.element().getText(CheckAddedReport);}


}
