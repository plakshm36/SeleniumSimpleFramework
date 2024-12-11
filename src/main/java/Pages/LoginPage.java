package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

        WebDriver driver;

        // Locators
        private By emailField = By.id("login-username");
        private By passwordField = By.id("login-password");
        private By loginButton = By.id("js-login-btn");

        // Constructor
        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        // Actions
        public void enterEmail(String email) {
            driver.findElement(emailField).sendKeys(email);
        }

        public void enterPassword(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }

        public void clickLogin() {
            driver.findElement(loginButton).click();
        }
    }

