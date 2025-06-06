package pages.CommonPages;


import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
public class DriverManager {

    //private static ShaftDriver driver;


    private static SHAFT.GUI.WebDriver driver;


    public static SHAFT.GUI.WebDriver getDriver(String browser) {
        if (browser == "chrome") {
            driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.CHROME);
        }
        else if (browser == "firefox") {
            driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.FIREFOX);
        }
        else if (browser == "edge") {
            driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.EDGE);
        }
        return driver;
    }

    public static void closeDriver() {
//        if (driver != null) {
//            driver.quit();
//        }
        driver.quit();
    }
}

