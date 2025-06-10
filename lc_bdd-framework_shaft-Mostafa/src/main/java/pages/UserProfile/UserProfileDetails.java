package pages.UserProfile;

import org.openqa.selenium.By;

import static pages.CommonPages.base.driver;

public class UserProfileDetails {
    By uploadFileInput=By.xpath("//input[@type='file']");
    String UploadLocation = "C:/Users/mostafa.hossam/Downloads/image (1).png";
    By ConfirmUploadPhoto=By.xpath("(//button[@class='d-flex justify-content-center align-items-center bg-success rounded-circle border border-4 border-white text-white h-40px w-40px'])[1]");
    By CheckUploadedPhoto=By.xpath("//div[contains(text(),'تم تعديل الصورة الشخصية بنجاح')]");

    public void ChangeProfilePhoto(){
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().typeFileLocationForUpload(uploadFileInput,UploadLocation);
        driver.element().click(ConfirmUploadPhoto);
    }
    public void ConfirmUploadPhoto(){
        driver.element().click(ConfirmUploadPhoto);
    }
    public String CheckUploadedPhoto()
    {
        return driver.element().getText(CheckUploadedPhoto);
    }

}
