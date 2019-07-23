package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    private static final String BROWSER = System.getProperty("browser","chrome");

    public static String getUrl(){
        return URL;
    }
    public static WebDriver getDriver(){
        ChromeOptions chromeOptions;
        FirefoxOptions firefoxOptions;

        switch (BROWSER.toUpperCase()){
            case "CHROME":
                System.out.print("Executing on Chrome");

                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "Firefox":
                System.out.print("Executing on Firefox");

                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

                default:
                    throw new IllegalArgumentException("The browser type is undefined");
        }
    }

}
