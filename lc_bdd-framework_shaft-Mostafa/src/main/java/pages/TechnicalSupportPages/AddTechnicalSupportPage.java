package pages.TechnicalSupportPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;
import static pages.CommonPages.base.faker;

public class AddTechnicalSupportPage {
    public static String Content;
    public static String Description;
    public static String Message;
    By AddNewChatBtn= By.xpath("//span[contains(text(),'إنشاء محادثة جديدة')]");
    By ContentTextBox=By.xpath("//input[@id='title']");
    By DescriptionTextBox=By.xpath("//textarea[@id='body']");
    By CreateNewChat=By.xpath("//button[@type='submit']");
    By ViewChatBtn=By.xpath("(//span[contains(text(),'عرض المحادثة')])[1]");
    By ChatTextBox=By.xpath("//textarea[@placeholder='اكتب رسالتك...']");
    By ReturnToChatsBtn=By.xpath("//span[contains(text(),'العودة إلى المحادثات')]");
    By CheckAddedTime=By.xpath("/html/body/div[2]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div");


    public void ClickOnAddNewChatBtn() {
        driver.element().click(AddNewChatBtn);}

    public void EnterTheContent() {
        Content = faker.name().title();
        driver.element().type(ContentTextBox,Content);}

    public void EnterTheDescription() {
        Description = faker.name().title();
        driver.element().type(DescriptionTextBox,Description);}

    public void ClickOnCreateNewChatBtn() {
        driver.element().click(CreateNewChat);}

    public void ClickOnViewChatBtn() {
        driver.element().click(ReturnToChatsBtn);
        driver.element().click(ViewChatBtn);}

    public void EnterTheMessage() {
        Message = faker.name().title();
        driver.element().type(ChatTextBox,Message);
        driver.element().click(CreateNewChat);

    }
}
