package pages.CommonPages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static pages.CommonPages.base.driver;

import com.shaft.api.RestActions;
import com.shaft.validation.Validations;

public class UserProfilePage {
    By ExternalCertificateTab = By.partialLinkText("External Certifica");
    By AddExternalCertificateBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[6]/app-external-certificate[1]/div[1]/div[1]/div[1]/button[1]");
    By ConfirmAddExternalCertificateBtn = By.xpath("//div[contains(text(),'External certificate added successfully')]");
    By ClickOnThreeDots = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[6]/app-external-certificate[1]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[3]/button[1]");
    By ClickOnEditButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[6]/app-external-certificate[1]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]");
    By CheckEditExternalCertificateBtn = By.xpath("//div[contains(text(),'External Certificate updated successfully')]");
    By ClickOnDeleteButton = By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[3]/div[1]/button[2]");
    By CheckDeleteExternalCertificatE = By.xpath("//div[contains(text(),'Certificate has been deleted successfully.')]");
    By CameraIcon = By.id("btnEditProfilePicture");
    By Achivement_Tab = By.xpath("(//a[normalize-space()='Achievements'])[1]");
    By SearchOnCourseName = By.xpath("//input[@class='certifiacte-search ng-untouched ng-pristine ng-valid']");
    By CheckCourseName = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[3]/app-achievements[1]/section[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[2]/span[1]/a[1]/span[1]");
    By MyProgressTab = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/nav[1]/div[2]/div[1]/div[1]/div[4]/a[1]");
    By FilterIcon = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[4]/app-my-progress[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-my-progress-courses[1]/div[1]/div[1]/div[1]/div[1]/div[2]/mat-table[1]/mat-header-row[1]/mat-header-cell[4]/div[1]");
    By FilterList = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[4]/app-my-progress[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-my-progress-courses[1]/div[1]/div[1]/div[1]/div[1]/div[2]/mat-table[1]/mat-header-row[1]/mat-header-cell[4]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]/span[1]");
    By FilterListIcon = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[4]/app-my-progress[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-my-progress-courses[1]/div[1]/div[1]/div[1]/div[1]/div[2]/mat-table[1]/mat-header-row[1]/mat-header-cell[4]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]");
    By ItemInprogress = By.xpath("//*[@id=\"mat-option-0\"]/span");
    By ItemRemoved = By.xpath("//*[@id=\"mat-option-1\"]/span");
    By itempassed = By.xpath("//*[@id=\"mat-option-2\"]/span");
    By itemfailed = By.xpath("//*[@id=\"mat-option-3\"]/span");
    By skipped = By.xpath("//*[@id=\"mat-option-4\"]/span");
    By ApplyBtn = By.cssSelector("button[class='mat-focus-indicator lms-btn-primary mat-button mat-button-base'] span[class='mat-button-wrapper']");
   // By RemovedStatus = By.xpath("//mat-row[2]//mat-cell[4]//span[1]");
    //By InProgress = By.xpath("//mat-row[2]//mat-cell[4]//span[1]");
   // By Failed = By.xpath("//mat-row[2]//mat-cell[4]//span[1]");
    By DisplayStatus = By.xpath("//mat-row[1]//mat-cell[4]//span[1]");
    By ParentCompetency = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[5]/app-my-competencies[1]/section[1]/div[1]/div[1]/div[1]/h2[1]");
    By ChildCompetency1=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[5]/app-my-competencies[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]");
    By FirstLevel = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-profile-index[1]/div[1]/div[2]/div[2]/div[1]/div[5]/app-my-competencies[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]");
    By ScoreButton=By.xpath("//button[normalize-space()='Score']");
    By CourseName = By.id("txtMyCourseProgressFilter");
    private RestActions api;
    //By FilterListItem1=By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/mat-pseudo-checkbox[1]");
    public void ClickOnExternalCertificateTab() {
        driver.element().click(ExternalCertificateTab);
    }

    public void ClickOnAddExternalCertificateBtn() {
        driver.element().click(AddExternalCertificateBtn);
    }

    public String CheckAddExternalCertificateBtn() {
        return driver.element().getText(ConfirmAddExternalCertificateBtn);
    }

    public String CheckRemovedAndListStatus() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(DisplayStatus);
    }

    public String CheckInProgressStatus() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(DisplayStatus);
    }
    public String CheckSkippedStatus() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(DisplayStatus);
    }

    public String CheckFailedStatus() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(DisplayStatus);
    }

    public String CheckPassedStatus() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.element().getText(DisplayStatus);
    }

    public String CheckCourseNameFoundedSucessfully() {
        return driver.element().getText(CheckCourseName);
    }

    public void ClickOnClickOnThreeDots() {

       // driver.element().scrollToElement(ClickOnThreeDots);
        driver.element().click(ClickOnThreeDots);
    }

    public void ClickOnEditButton() {
        driver.element().click(ClickOnEditButton);
    }

    public String CheckEditExternalCertificateBtn() {
        return driver.element().getText(CheckEditExternalCertificateBtn);
    }

    public void ClickOnDeleteButton() {
        driver.element().click(ClickOnDeleteButton);
    }

    public String CheckDeleteExternalCertificateBtn() {
        return driver.element().getText(CheckDeleteExternalCertificatE);
    }

    @SneakyThrows
    public void ClickOnCameraIcon() {
        Thread.sleep(1500);
        Actions actions = new Actions(driver.getDriver());
        // Scroll up using PAGE_UP key
        actions.sendKeys(Keys.PAGE_UP).perform();
        //driver.element().scrollToElement(CameraIcon);
        driver.element().click(CameraIcon);
    }

    @SneakyThrows
    public void ScrollToCameraIcon() {
        Thread.sleep(1500);
        Actions actions = new Actions(driver.getDriver());
        // Scroll up using PAGE_UP key
        actions.sendKeys(Keys.PAGE_UP).perform();
        //driver.element().scrollToElement(CameraIcon);
    }

    public void ClickOnAchievemetTab() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().doubleClick(Achivement_Tab);
    }

    public void SearchByCourseName() {
        driver.element().type(SearchOnCourseName, "test video completion criteria");
    }

    public void ClickOnMyProgressTab() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().doubleClick(MyProgressTab);
    }

    public void ClickOnFilterIcon() {

        driver.element().click(FilterIcon);
    }

    public void ClickOnDeleteOnFilterList() {

        driver.element().click(FilterList);
        //driver.element().click(FilterListIcon);
        driver.element().click(ItemInprogress);
        driver.element().click(itempassed);
        driver.element().click(itemfailed);
        driver.element().click(skipped);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(FilterIcon);
    }

    public void ClickOnInProgressOnFilterList() {

        driver.element().click(FilterList);


        driver.element().click(itempassed);
        driver.element().click(itemfailed);
        driver.element().click(skipped);
        driver.element().click(ItemRemoved);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(FilterIcon);
    }
    public void ClickOnSkippedOnFilterList() {

        driver.element().click(FilterList);


        driver.element().click(itempassed);
        driver.element().click(itemfailed);
        driver.element().click(ItemInprogress);
        driver.element().click(ItemRemoved);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(FilterIcon);
    }

    public void ClickOnFailedOnFilterList() {

        driver.element().click(FilterList);
        //driver.element().click(FilterListIcon);
        driver.element().click(ItemInprogress);
        driver.element().click(itempassed);

        driver.element().click(skipped);
        driver.element().click(ItemRemoved);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(FilterIcon);
    }

    public void ClickOnPassedOnFilterList() {

        driver.element().click(FilterList);
        //driver.element().click(FilterListIcon);
        driver.element().click(ItemInprogress);
        driver.element().click(itemfailed);
        driver.element().click(skipped);
        driver.element().click(ItemRemoved);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(FilterIcon);
    }

    public void ClickOnApplyButton() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.element().click(FilterIcon);
        driver.element().click(ApplyBtn);
    }

    public void GetCompetenciesOnMyProfile() {

      String parentCompetency=  driver.element().getText(ParentCompetency);
      String ChildCompetency= driver.element().getText(ChildCompetency1);
        String LevelCompetency= driver.element().getText(FirstLevel);
          //  String apiUrl = "https://staging-lc.azurewebsites.net/"; // Replace with your API URL

         //   var query = new HashMap<String, Object>();
         //   query.put("grant_type", "password");
          //  query.put("scope", "winjigo");
          //  query.put("username", " Mo1@mailinator.com");
          //  query.put("password", " Windows.2000");
          //  var loginResponse = RestAssured.given().baseUri(apiUrl).header("Authorization", "OTk2YWJhNzEtNzYxZi00NWFlLThjZWEtMDZkY2FmZTQ5N2MxOjc0NmQwNGQzLTdiYzUtNDg1Yi1hNDQwLTY3YzY2ZDRjZGMxMQ==").headers("Content-Type", "application/x-www-form-urlencoded").formParams(query).when().post("");
          //  String token = loginResponse.jsonPath().getString("access_token");
          //  var response = RestAssured.given().baseUri(apiUrl).header("Authorization", token).when().get("api/CourseApi/GetUserCourseCompetencies?userId=10161");


            //JSONObject json = new JSONObject(response.toString());
            //  int CompetencyId = json.getInt("CompetencyId");
        api = new RestActions("https://staging-lc.azurewebsites.net");

        // Step 2: Send the GET request
       // Response response = api.get("/api/CourseApi/GetUserCourseCompetencies?userId=10161"); // replace with your actual endpoint
        //Response response =   RestAssured.get("https://staging-lc.azurewebsites.net/api/CourseApi/GetUserCourseCompetencies?userId=10161");
        Response response = RestAssured
                .given()
                .baseUri("https://staging-lc.azurewebsites.net")
                .cookie("Cookie", "ARRAffinity=e62b947e6340589f02236fa9ca24cbc0ba3f5749107df36ea12aae4b8106c265; ARRAffinitySameSite=e62b947e6340589f02236fa9ca24cbc0ba3f5749107df36ea12aae4b8106c265; .AspNetCore.Antiforgery.9fXoN5jHCXs=CfDJ8Bk9W50c1ChDood-2BoKuBLgprI-Mezmp73xtf2JjNEyHXw9fAFiYeBe2VADSabrnpd1wAEEuY9eTy8fXMbRAaQOe-nCw2iH5s5TpE0FSma7t9uu7DNssKcbqUnzO9kpKrCDvEJUzaoHlX1rwTGoYJc; _ga=GA1.3.1226744737.1744627324; _gid=GA1.3.760575145.1744627324; _gat=1; _ga_EQ1MYLZLGT=GS1.3.1744627323.1.0.1744627323.0.0.0; idsrv.session=ED6771B82CD1A6FE34F7F8E30CEE80F7; .AspNetCore.Identity.Application=CfDJ8Bk9W50c1ChDood-2BoKuBKtg-aRh3kV1zkLSydOSUsM33uXv_YCEtULhbpL0qWwtytk-O9BfT1pCK1t3R2SjpiN0Jlpvd2lWytKvREkYoZj262O8rXV8fgEv6m4cAnt5eXlhcb6xTcqyOhMhgxx5sWVX-478T-fgTfBa4jMlliSOjVCAXBKxqx62NkfLdavAhHNM1Btocsk5EkA_kdBnGeQNclrxC-dKcFatzgU6Hqb-YYYHyZ4_gr4QFaLtfvg8ySlX5kw_lq94YvZhUEDpGfx3TmorR0o-MH_Rt_GW1Xzmyn3kUyYeUectJL5JuzDgrJFlECIhmZI5ioJxf5f-xcK4zoaZulcaHyxB1QxLoPPmGxD2c7Ujiikk7MeU7NQYM4LyioKCpCJ-akAA8relH4JQ7Z7rd2sC4gISiKg3g1V8n5OAuUbGoZT6IFP49PXyJP0XYTjaEnPfT8ie8ASAyKwNpt1LH80KCMyHAO9DUlBEPzEZANSuHXhVYVJQY3M2kkcPMPWYwgkFlvta-QWIfXw44-UzJIMZDjZH3ByyhOYXB8yrTXmdmk9ApEbgLKSg6Lt9-0R7M0t05gNVw4ktaaljz8RsuUhFS2FDzOBXidsJhvluuV_TO5axtTY4Mij_gGs5k8UrlIlzfT5LaO3-3st2nr97-NeDT4FIbaQ6Srb5uXzfkrzBhWnpLnos0oRwRNjJ39KG8qzun0GSvRArxOp9hWSaGnxV7P56KKtvNucuuDR83hq1vq42nN84EuAHigCxJ31eBffeOi0hy_1lzy_t7UCrTyBX8iMSm3nuhxUlAQxUTzgYip183L6xyx9kWmbq7_ktTlyaHu3eWNuXvOvRLClYn9g-901tmFEKRtGbxNKPCFtifA7CYz1XUjfydJedREBZRCgvKkTm3-KQfk84aPkauDEe9bYpN6Z5uAiJjttJvBszlSD92S1pzPDKuBOL2UfNBZXX8PZz4DwfeBn8exJgcwyqzfT6UNYR5ahH5SgPt_sN6-66WytxV3hqpzXrpnVHUSQWaUmBe3EgqpcqWredTGbRVlfr1fanGDh; CurentActiveUserId=10161; ShowAwardingSystemPopup=True; .AspNetCore.Mvc.CookieTempDataProvider=CfDJ8Bk9W50c1ChDood-2BoKuBJ7wxh7DUFIFSualBPCeu9iEn-jBCbk7gIUUdqkLh9_Bs52ayoEVwDTUriyzJ1jsztphhNJqUi0eburpcVEYh-_FhY_OoMGH6E3lCjmLWKp0SOP93W1PLuX-FF0ug1GssCnS_ojSkNa4rFETBm3YXz3; TrackingToken=; __stripe_mid=590f5b24-05cf-44c4-9c3a-7eb6f01e8a0dac8eb0; __stripe_sid=c4715d91-6235-47aa-99d0-35d11af87137ef989f; xsrf-token=CfDJ8Bk9W50c1ChDood-2BoKuBLbS3dtKUna80CV4ZE1xDeX9GS-BDR6SlkGaiXE72x3iFi0mYZZ5ydn5MEbKKYfACPpoSTThD0KddgA4sCYKttYWHmi4FqrQhrlwh7CtpQsEvyhf-j1k2Bx7ftsqm03Bw7utb4RD5YrbnHA1bEXbNSvrojGPsaaSOxS3gDBWgyEaQ; XSRF-TOKEN=CfDJ8Bk9W50c1ChDood-2BoKuBLbS3dtKUna80CV4ZE1xDeX9GS-BDR6SlkGaiXE72x3iFi0mYZZ5ydn5MEbKKYfACPpoSTThD0KddgA4sCYKttYWHmi4FqrQhrlwh7CtpQsEvyhf-j1k2Bx7ftsqm03Bw7utb4RD5YrbnHA1bEXbNSvrojGPsaaSOxS3gDBWgyEaQ") //
                .when()
                .get("/api/CourseApi/GetUserCourseCompetencies?userId=10161");
        // Step 3: Assert status code
        Validations.assertThat()
                .response(response)
                .extractedJsonValue("$.size()")
                .isNotNull()
                .withCustomReportMessage("List is not empty")
                .perform();
      //  response.prettyPrint();
        // Step 4: Assert ParentCompetency name
        Validations.assertThat()
                .response(response)
                .extractedJsonValue("[0].ParentCompetency.CompetencyName")
                .isEqualTo(parentCompetency)
                .withCustomReportMessage("parentCompetency")
                .perform();

        // Step 5: Assert first child competency name
        Validations.assertThat()
                .response(response)
                .extractedJsonValue("[0].ChildCompetencies[0].Competency.CompetencyName")
                .isEqualTo(ChildCompetency)
                .withCustomReportMessage("ChildCompetency")
                .perform();


        // Step 6: Assert second child's level name
        Validations.assertThat()
                .response(response)
                .extractedJsonValue("[0].ChildCompetencies[0].Level.LevelName")
                .isEqualTo(LevelCompetency)
                .withCustomReportMessage("LevelCompetency")
                .perform();
        response.prettyPrint();

    }


//    public static void main(String[] args) throws JSONException {
//        // API response stored as a String
//        String jsonResponse = """
//                [
//                    {
//                        "ParentCompetency": {
//                            "CompetencyId": 708,
//                            "CompetencyName": "Team Work"
//                        },
//                        "ChildCompetencies": [
//                            {
//                                "Competency": {
//                                    "CompetencyId": 710,
//                                    "CompetencyName": "Aware of the needs of others and responds flexibly"
//                                },
//                                "Level": {
//                                    "LevelId": 1,
//                                    "LevelName": "Beginner"
//                                }
//                            },
//                            {
//                                "Competency": {
//                                    "CompetencyId": 711,
//                                    "CompetencyName": "Shares information and supports other team members"
//                                },
//                                "Level": {
//                                    "LevelId": 2,
//                                    "LevelName": "Intermediate"
//                                }
//                            }
//                        ]
//                    }
//                ]
//                """;
//
//        JSONArray array = new JSONArray(jsonResponse);
//
//        for (int i = 0; i < array.length(); i++) {
//            JSONObject item = array.getJSONObject(i);
//
//            // Print parent competency name
//            JSONObject parent = item.getJSONObject("ParentCompetency");
//            System.out.println("Parent Competency: " + parent.getString("CompetencyName"));
//
//            // Print child competency names
//            JSONArray children = item.getJSONArray("ChildCompetencies");
//            for (int j = 0; j < children.length(); j++) {
//                JSONObject child = children.getJSONObject(j);
//                JSONObject competency = child.getJSONObject("Competency");
//                System.out.println("  - Child Competency: " + competency.getString("CompetencyName"));
//            }
//        }
//    }

    public void ClickOnScoreButton() {driver.element().click(ScoreButton);}
    public void SearchOnCourseName() {driver.element().type(CourseName,"Course");}
}



