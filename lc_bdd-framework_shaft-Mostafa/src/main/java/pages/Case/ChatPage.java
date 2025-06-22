package pages.Case;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class ChatPage {
    By ChatTextField=By.xpath("//input[@placeholder='أضف رسالة']");
    By chatButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/button[1]");
    By CheckChatText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]/p[1]");
    public void EnterChat(){
        driver.element().scrollToElement(ChatTextField);
        driver.element().type(ChatTextField,"Welcome");
        driver.element().click(chatButton);
    }
    public String CheckChatTextDetails(){
        return driver.element().getText(CheckChatText);

    }
}
