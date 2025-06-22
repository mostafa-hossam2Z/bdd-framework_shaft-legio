package pages.LegalServicesPages;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class DetailsPage {
By ReturnPage=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/button[1]");
By AddField =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/button[1]");
By ChooseText=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/a[1]");
By TextNameField=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/input[1]");
By TextNameValue=By.xpath("//input[@name='value']");
By ConfirmAddTextField=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/button[2]");
By CheckTextName=By.xpath("//p[@class='text-primary']");
By ReturnPage1=By.xpath("//button[contains(text(),'العودة')]");
By DeleteBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]");
By ConfirmDelete=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[2]");
By AddCommentTextField=By.xpath("//textarea[@placeholder='أضف ملاحظة']");
By SaveComment=By.xpath("//div[@id='kt_app_main']//div[3]");
By AddModelBtn=By.xpath("//button[contains(text(),'أضف إلى قائمة النماذج')]");
By ModelTextField=By.xpath("//input[@name='title']");
By SaveAddModel=By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/button[2]");
By CheckAddedModel=By.xpath("//div[contains(text(),'تم حفظ نموذج القضية بنجاح')]");
By CheckServiceDeleted=By.xpath("");

    public void ClickOnAddFieldBtn()
    {
        driver.element().click(ReturnPage);
        driver.element().click(AddField);
    }
    public void ChooseText()
    {
        driver.element().click(ChooseText);
    }
    public void EnterTextNameValue()
    {
        driver.element().type(TextNameField,"heloo");
        driver.element().type(TextNameValue,"hiiiiiiiiiiiiiiiii");
        driver.element().click(ConfirmAddTextField);
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        //driver.element().click(ReturnPage1);
    }
    public String CheckTextFieldtext()
    {
        return driver.element().getText(CheckTextName);

    }
    public String CheckLegalServiceDeleted()
    {
        return driver.element().getText(CheckServiceDeleted);

    }
    public void ClickOnDeleteBtn()
    {

         driver.element().click(DeleteBtn);
        driver.element().click(ConfirmDelete);

    }
    public void AddComment() {driver.element().type(AddCommentTextField,"CasePostponed");}
    public void ClickOnSaveCommentButton() {driver.element().click(SaveComment);}
    public String CheckCommentText() {return driver.element().getText(AddCommentTextField);}

    public void ClickOnAddModelButton() {driver.element().click(AddModelBtn);}
    public void AddModel() {driver.element().type(ModelTextField,"SaudiArabia");}
    public void ClickOnSaveModelButton() {driver.element().click(SaveAddModel);}
    public String CheckAddedModel() {return driver.element().getText(CheckAddedModel);}

}
