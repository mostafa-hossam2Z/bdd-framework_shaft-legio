package UserProfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CommonPages.Homepage;
import pages.UserProfile.UserProfileDetails;

public class UserProfileSteps {
    UserProfileDetails UserProfileDetailsObj =new UserProfileDetails();
    Homepage homePage=new Homepage();

    @And("Go to my profile page")
    public void goToMyProfilePage() {
        homePage.GoToProfile();
    }

    @And("Change profile picture")
    public void changeProfilePicture() {
        UserProfileDetailsObj.ChangeProfilePhoto();

    }

    @And("Confirm the upload photo")
    public void confirmTheUploadPhoto() {
        UserProfileDetailsObj.ConfirmUploadPhoto();
    }

    @Then("Check that profile picture is uploaded successfully")
    public void checkThatProfilePictureIsUploadedSuccessfully() {
        Assert.assertEquals(UserProfileDetailsObj.CheckUploadedPhoto(),"تم تعديل الصورة الشخصية بنجاح");

    }
}
