package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import co.uk.safebear.utils.Screenshots;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class Stepdefs {
    WebDriver driver;
    LoginPage loginPage;
    ToolsPage toolsPage;

    @Before
    public void setUp() {
        driver = Driver.getDriver();
        driver.get(Driver.getUrl());
        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);
    }

    @After
    public void tearDown(){
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


    @Given("I am logged out")
    public void i_am_logged_out() {
        assertEquals("We're not on the Login Page", "Login Page", loginPage.getPageTitle());
        Screenshots.capturescreenshot(driver, "loginscreenshots");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {
        assertThat("Login failed or the Login Successful message didn't appear", toolsPage.checkForLoginSuccessfulMessage(), containsString("Login Successful"));
        Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());}


    @Then("the user is informed that the login is unsuccessful")
    public void the_user_is_informed_that_the_login_is_unsuccessful() {
        assertThat("Login didn't fail", loginPage.checkForFailedMessage(), containsString("Username or Password is incorrect"));
        Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());}



    @Given("I am already logged in using username {string} and password {string}")
    public void i_am_already_logged_in_using_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        assertThat("Login failed or the Login Successful message didn't appear", toolsPage.checkForLoginSuccessfulMessage(), containsString("Login Successful"));
    }

    @When("I search for a valid tool name {string}")
    public void i_search_for_a_valid_tool_name(String toolname) {
        toolsPage.searchForTool(toolname);
        toolsPage.clickSearchButton();
        Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());
    }

    @Then("The tool is returned in the search results")
    public void the_tool_is_returned_in_the_search_results() {
        assertThat("Result not returned", toolsPage.checkSearchResults(), containsString("Selenium"));
        Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());;
    }

    @When("I create a new tool with Name {string}, Use {string} and Website {string}")
    public void i_create_a_new_tool_with_Name_Use_and_Website(String newToolName, String toolUse, String toolwebsite) {
        toolsPage.clickNewToolButton();
        toolsPage.enterNewToolName(newToolName);
        toolsPage.enterNewToolUse(toolUse);
        toolsPage.enterNewToolWebsite(toolwebsite);
        toolsPage.clickNewToolAcceptButton();
        Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());
    }

    @Then("The new tool is added to the website")
    public void the_new_tool_is_added_to_the_website() {
        assertThat("Tool not created", toolsPage.checkNewToolSuccessMessage(), containsString("The new tool has been successfully created"));
        Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());
    }

    @Given("a tool is no longer used")
    public void a_tool_is_no_longer_used() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I select to delete the tool")
    public void i_select_to_delete_the_tool() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("The tool is no longer available on the website")
    public void the_tool_is_no_longer_available_on_the_website() {
        //       // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
