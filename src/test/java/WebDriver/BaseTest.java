package WebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static ChromeDriver webDriver;

    @BeforeClass
    public static void setup() {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/mac/chromedriver");
        } else if (osName.startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
        }

        webDriver =new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    public static ChromeDriver getWebDriver() {
        return webDriver;
    }

    @AfterClass
    public static void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}