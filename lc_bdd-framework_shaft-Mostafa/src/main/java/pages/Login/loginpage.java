package pages.Login;


import org.openqa.selenium.By;
import pages.CommonPages.base;


public class loginpage extends base {

    By profileImage = By.id("user-menu");
    By LogOutButton = By.xpath("(//*[@id=\"btnWinjiLogOff\"])[1]");
    By logout = By.xpath("(//*[contains(text(),'My Profile')])[2]");
    By Emaill =By.xpath("//input[@type='email']");
    By Password = By.id("login_password");
    By login= By.xpath("//button[@type='submit']");


    public void login(String email, String password)
    {
        driver.element().type( Emaill, email);
        driver.element().type( Password, password);
        driver.element().click(login);
    }

    public void loginAsTrainee () throws InterruptedException {
        driver.element().click(profileImage);
        Thread.sleep(2000);
        driver.element().doubleClick(LogOutButton);

        driver.element().type( Emaill,"mostg3@lc.com");
        driver.element().type( Password,"Windows.2000" );
        driver.element().click(login);
        Thread.sleep(2000);



               }

    public void logout () throws InterruptedException {
        driver.element().click(profileImage);
        Thread.sleep(2000);
        driver.element().doubleClick(LogOutButton);


}}






