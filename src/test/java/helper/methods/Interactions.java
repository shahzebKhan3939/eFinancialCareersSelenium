package helper.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static WebDriver.BaseTest.getWebDriver;

public class Interactions {

    Interactions (String text) {
        this.text = text;
    }

    private static final ChromeDriver driver;
    private String text;

    static {
        driver = getWebDriver();
    }

    public static void clickOn(By locator) {
        driver.findElement(locator).click();
    }

    public static Interactions enter(String text) {
        return new Interactions(text);
    }

    public void into(By locator) {
        driver.findElement(locator).sendKeys(this.text);
    }
}
