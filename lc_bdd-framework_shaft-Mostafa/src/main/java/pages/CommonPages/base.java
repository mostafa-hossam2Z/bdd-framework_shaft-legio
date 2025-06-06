package pages.CommonPages;
import com.github.javafaker.Faker;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class base {
   // public  JavascriptExecutor js = (JavascriptExecutor)driver;

    public static SHAFT.GUI.WebDriver driver;
    public static SHAFT.TestData.JSON testData;
    public static Faker faker = new Faker();
    public static FluentWait<WebDriver> wait;
    public String FirstName = "Anew";
    public String LastName = "employee";
    public String PhoneNumber="0123456789";
    public String Activities = "New Activity";
    public static String courseName ;


}
