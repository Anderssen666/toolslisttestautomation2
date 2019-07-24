package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    private static final String BROWSER = System.getProperty("browser","Chrome");

    public static String getUrl(){
        return URL;
    }
    public static WebDriver getDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        FirefoxOptions firefoxOptions;

        switch (BROWSER.toUpperCase()){
            case "CHROME":
                System.out.print("Executing on Chrome");

                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "FIREFOX":
                System.out.print("Executing on Firefox");

                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();


            case "CHROME_NODE":

                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                cap.setBrowserName("chrome");

                return new RemoteWebDriver(cap);

            case "CHROME_HEADLESS":
                System.out.println("Executing on Chrome Headless");
                chromeOptions.addArguments("headless");
                chromeOptions.addArguments("window-size=1920,1080");
                chromeOptions.addArguments("start maximized");
                WebDriverManager.chromedriver().setup();

                return new ChromeDriver(chromeOptions);

                default:
                    throw new IllegalArgumentException("The browser type is undefined");
        }
    }

}
