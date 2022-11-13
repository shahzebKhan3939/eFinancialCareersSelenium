package Tests;


import WebDriver.BaseTest;
import org.junit.Test;


public class SignIn extends BaseTest {

    @Test
    public void signIn() {
        System.out.println("firstTest in First Test Class, hehe");
        getWebDriver().get("https://www.google.com");
    }
}