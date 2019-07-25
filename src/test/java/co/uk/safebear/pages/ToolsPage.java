package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public void searchForTool(String toolname) {
        driver.findElement(locators.getSearchField()).sendKeys(toolname);
    }

    public void clickSearchButton() {
        driver.findElement(locators.getSearchButton()).click();
    }

    public String checkIfSearchSuccessful() {
        return driver.findElement(locators.getNoResultsReturnedMessage()).getText();
    }

    public String checkSearchResults() {
        return driver.findElement(locators.getSearchResult()).getText();
    }

    public void clickNewToolButton() {
        driver.findElement(locators.getNewToolButton()).click();

    }

    public void enterNewToolName(String newToolName){
        driver.findElement(locators.getNewToolNameField()).sendKeys(newToolName);
    }

    public void enterNewToolUse(String toolUse){
        driver.findElement(locators.getNewToolUseField()).sendKeys(toolUse);
    }

    public void enterNewToolWebsite (String toolwebsite) {
        driver.findElement(locators.getNewToolWebField()).sendKeys(toolwebsite);
    }

    public void clickNewToolAcceptButton () {
        driver.findElement(locators.getAcceptNewToolButton()).click();
    }

    public String checkNewToolSuccessMessage () {
        return driver.findElement(locators.getNewToolSuccessMessage()).getText();
    }

    public boolean checkForToolInTable(String toolnameToCheckFor){

        List<WebElement> tableData;

        tableData = driver.findElements(locators.getAllTableData());

        for(int i=0; i < tableData.size(); i++){

            if(tableData.get(i).getText() == toolnameToCheckFor){
                return true;
            }

        }
        return false;
    }

}