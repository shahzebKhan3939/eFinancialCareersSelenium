//package driver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class WebDriver {
//    private static ChromeDriver webDriver;
//
//    public static void initialize() {
//
//        String osName = System.getProperty("os.name");
//        if (osName.startsWith("Mac")) {
//            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/mac/chromedriver");
//        } else if (osName.startsWith("Windows")) {
//            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
//        }
//
//        webDriver =new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.manage().window().maximize();
//    }
//
//    public static ChromeDriver getWebDriver() {
//        return webDriver;
//    }
//
//    public static void stop() {
//        webDriver.quit();
//    }
//}
