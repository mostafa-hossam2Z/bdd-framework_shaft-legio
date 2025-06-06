package CucumberSteps;

import com.shaft.driver.SHAFT;

import io.cucumber.java.en.Given;

import pages.CommonPages.Homepage;
import pages.Login.loginpage;

import pages.CommonPages.base;

public class Steps extends base {

        Homepage homepageobj = new Homepage();
        loginpage loginpageobj=new  loginpage();

        static SHAFT.TestData.JSON testData;

        @Given("User Fill {string} And {string}")
        public void UserFillEmailAndPasswordasAdmin(String email,String password)
        {
            testData = new SHAFT.TestData.JSON("simpleJSON.json");
            //testData.getTestData("browser");
          // driver.browser().navigateToURL("https://testing-lc.azurewebsites.net/Account/Login");

            String Email=testData.getTestData(email);
            String Password=testData.getTestData(password);
            loginpageobj.login(Email,Password);
      }
//    @Given("User Fill {string} And {string}")
//    public void UserFillEmailAndPasswordastrainee(String email1,String password1)
//    {
//        testData = new SHAFT.TestData.JSON("simpleJSON.json");
//        //testData.getTestData("browser");
//        // driver.browser().navigateToURL("https://testing-lc.azurewebsites.net/Account/Login");
//
//        String Email1=testData.getTestData(email1);
//        String Password1=testData.getTestData(password1);
//        loginpageobj.login1(Email1,Password1);
//    }


//    @Given("User Fill {string} And {string}")
//    public void user_fill_and(String email, String password) {
//        // Write code here that turns the phrase above into concrete actions
//        //public void UserFillEmailAndPasswordasAdmin(String email,String password)
//        {
//           // testData = new SHAFT.TestData.JSON("simpleJSON.json");
//            //testData.getTestData("browser");
//            // driver.browser().navigateToURL("https://testing-lc.azurewebsites.net/Account/Login");
//
//            String Email=testData.getTestData(email);
//            String Password=testData.getTestData(password);
//            loginpageobj.login(Email,Password);
//        }


    }





