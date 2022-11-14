package helper.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static WebDriver.BaseTest.getWebDriver;
import static helper.constants.Waits.FIVE;

public class WaitUntil {

    private static final ChromeDriver driver;

    static {
        driver = getWebDriver();
    }

    public static void elementIsPresent(By byLocator, Integer time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
    }

    public static void elementIsPresent(By byLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FIVE));
        wait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
    }

    public static void elementIsNotPresent(By byLocator, Integer time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(byLocator));
    }

    public static void elementIsNotPresent(By byLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FIVE));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(byLocator));
    }
}
