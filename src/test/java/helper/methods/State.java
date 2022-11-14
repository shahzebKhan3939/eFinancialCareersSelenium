package helper.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import static WebDriver.BaseTest.getWebDriver;

public class State {
    private static final ChromeDriver driver;

    static {
        driver = getWebDriver();
    }

    public static Boolean elementPresent(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public static Boolean elementNotPresent(By locator) {
        try {
            driver.findElement(locator);
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    public static String textOf(By locator) {
        return driver.findElement(locator).getText();
    }
}
