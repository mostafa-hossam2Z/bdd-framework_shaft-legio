package help;

import com.shaft.db.DatabaseActions;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;

public class DataBaseReader {

    public static SHAFT.TestData.JSON testData;
    public static DatabaseActions dataBaseConnection(Environment environment) {

        testData = environment == Environment.Testing ?
                new SHAFT.TestData.JSON("DataBaseData_Testing.json")
                : new SHAFT.TestData.JSON("DataBaseData_Staging.json");

        return DriverFactory.getDatabaseDriver(
                DatabaseActions.DatabaseType.SQL_SERVER,
                testData.getTestData("IP"),
                testData.getTestData("Port"),
                testData.getTestData("Name"),
                testData.getTestData("UserName"),
                testData.getTestData("Password")
        );

    }

    public enum Environment {
        Testing,
        Staging
    }


}
