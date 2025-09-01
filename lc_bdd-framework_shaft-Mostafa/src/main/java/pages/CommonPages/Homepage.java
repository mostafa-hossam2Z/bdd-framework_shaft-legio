package pages.CommonPages;


import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class Homepage {

   By MyAccountPage=By.xpath("//a[contains(text(),'حسابي')]");
   By TimePackagePage=By.xpath("//a[contains(text(),'الباقات الزمنية')]");
   By MeetingsAndAppointmentsPage=By.xpath("//a[contains(text(),'الاجتماعات و المواعيد')]");
   By TechnicalSupportPage=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[7]/span[2]/a[1]");



    public void ClickOnMyAccountPage() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(MyAccountPage);}
    public void ClickOnTimePackagePage() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(TimePackagePage);}

    public void ClickOnTMeetingsAndAppointmentsPage() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(MeetingsAndAppointmentsPage);}

    public void ClickOnTechnicalSupportPage() {
        try {Thread.sleep(1500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(TechnicalSupportPage);}







}

