package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("enter");
    private By warningMessage = By.xpath(".//p[@id='rejectLogin']/b");
}
