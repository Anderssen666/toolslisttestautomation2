package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {
    @NonNull
    WebDriver driver;

    LoginPageLocators locators = new LoginPageLocators();

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void enterUsername(String userName) {
        driver.findElement(locators.getUsernameLocator()).sendKeys(userName);
    }

    public void enterPassword(String passWord) {
        driver.findElement(locators.getPasswordLocator()).sendKeys(passWord);
    }

    public void clickLoginButton() {
        driver.findElement(locators.getLoginButtonLocator()).click();
    }

    public String checkForFailedMessage() {
        return driver.findElement(locators.getWarningMessage()).getText();
    }
}
