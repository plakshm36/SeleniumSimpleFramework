package tests;

import Pages.LoginPage;

import Utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

        @Test
        public void verifyLogin() throws InterruptedException {
            // Navigate to login page
            driver.navigate().to("https://app.vwo.com/#/login");

            // Use LoginPage object to perform actions
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterEmail("padmapri10@gmail.com");
            loginPage.enterPassword("Admin@123");
            loginPage.clickLogin();

            // Wait for navigation
            Thread.sleep(3000);

            // Verify URL
            Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/dashboard");
        }
    }


