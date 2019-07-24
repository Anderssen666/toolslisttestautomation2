package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {
    @NonNull
    WebDriver driver;

    ToolsPageLocators locators = new ToolsPageLocators();


    public String getPageTitle() {
        return driver.getTitle();
    }

    public String checkForLoginSuccessfulMessage() {
        return driver.findElement(locators.getSuccessfulLoginMessage()).getText();
    }

    public void searchForTool (String toolname) {driver.findElement(locators.getSearchField()).sendKeys(toolname);}

    public void clickSearchButton () {driver.findElement(locators.getSearchButton()).click();}

    public String checkIfSearchSuccessful () {
        return driver.findElement(locators.getNoResultsReturnedMessage()).getText();
    }

    public String checkSearchResults () {
        return driver.findElement(locators.getSearchResult()).getText();
    }
}

