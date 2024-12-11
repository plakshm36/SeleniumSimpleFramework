package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Set up EdgeDriver with options
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);
    }

    @AfterMethod
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
