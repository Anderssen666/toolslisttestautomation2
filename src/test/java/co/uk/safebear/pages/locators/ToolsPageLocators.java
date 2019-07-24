package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {
private By successfulLoginMessage = By.xpath(".//body/div[@class='container']/p/b");
private By searchField = By.id("toolName");
private By searchResult = By.xpath("//*[@id='toolForm']/table/tbody/tr/td[2]");
private By searchButton = By.xpath("//*[@id='seachToolForm']/button");
private By noResultsReturnedMessage = By.xpath("//*[@id='toolForm']/div");


}
