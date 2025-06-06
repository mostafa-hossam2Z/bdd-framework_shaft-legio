package CucumberSteps;


import com.shaft.driver.SHAFT;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.FluentWait;

import pages.CommonPages.DriverManager;

import pages.CommonPages.base;

public class TestHooks extends base {

    SHAFT.TestData.JSON testData;

    //public static SHAFT.GUI.WebDriver driver;

//    public TestHooks() {
//
//        String browser = System.getProperty("browser", "edge");
//        driver = DriverManager.getDriver(browser);
//    }

    /*
    By ProfileImage = By.id("user-menu");
    By LogOutButton = By.id("btnWinjiLogOff");
    static SHAFT.TestData.JSON testData;
    private static String browserType;
    private static String url;
    @BeforeAll
    public static void start() {
        testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/simpleJSON.json");
        browserType = testData.getTestData("browser");
        url = testData.getTestData("url");
        System.setProperty("targetBrowser", browserType);
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(url);
    }
    * */


    @Before
    public void setUp() {
        //System.out.println("HH:"+browser1);
        //driver=new SHAFT.GUI.WebDriver(DriverFactory.DriverType.FIREFOX);
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
        String browser = System.getProperty("browser", "chrome");
        driver = DriverManager.getDriver(browser);
        wait = new FluentWait<>(driver.getDriver());
        //driver.browser().navigateToURL(testData.getTestData("testing"));
        driver.browser().navigateToURL(testData.getTestData("url"));

    }


    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }

/*
    @After
    public void logout() {


        //wait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
        try {Thread.sleep(5000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.element().click(ProfileImage);
        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        //wait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
        //A1.doubleClick().perform();
        driver.element().click(LogOutButton);


        // if (jsonNode.get("url").asText().equalsIgnoreCase("https://testing-lc.azurewebsites.net/account/login")) {
        // wait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
        // driver.findElement(LogInButton).click();

        //}
        //obj.logOut();
    }
    */


   // @AfterAll
   // public static void quit() {
        //driver.quit();
    //}


}

