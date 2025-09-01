package pages.MeetingsAndAppointmentsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pages.CommonPages.base.driver;

public class MeetingsAndAppointmentsPage {
    By AddMeetingPeriodBtn= By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]");
    By StartTimeField=By.id("time_from");
    By EndTimeField=By.id("time_to");
    By AddStartAndEndDate=By.xpath("//button[@type='submit']");
    By DownArrow=By.xpath("(//button[@type='button'])[21]");
    By UpArrow=By.xpath("(//button[@type='button'])[18]");
    By CloseBtn=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]/*[name()='svg'][1]");
    By CheckAddedTime=By.xpath("/html/body/div[2]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div");
    public void ClickOnAddMeetingPeriodBtn() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(AddMeetingPeriodBtn);}


    public void EnterStartAndEndDATE() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(StartTimeField);
        driver.element().click(DownArrow);
      //  driver.element().type(StartTimeField,"08:15 AM");
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EndTimeField);
        driver.element().click(UpArrow);

        //   driver.element().type(EndTimeField,"08:55 PM");

    }
    public void AddStartAndEndDate() {
        try {Thread.sleep(4000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(AddStartAndEndDate);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(CloseBtn);}
    public String CheckAddedTime(){
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        WebElement CheckAddedTimee=driver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div"));

        return driver.element().getText(CheckAddedTime).replaceAll("\\s+", " ").trim();

    };
    public void DeleteMeetingsTime() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(AddMeetingPeriodBtn);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(StartTimeField);
        driver.element().click(DownArrow);
        //  driver.element().type(StartTimeField,"08:15 AM");
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(EndTimeField);
        driver.element().click(UpArrow);

        driver.element().click(AddStartAndEndDate);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        driver.element().click(CloseBtn);

    }

}
