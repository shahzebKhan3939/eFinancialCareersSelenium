package eFinancialCareers.app.signin.interactions;

import helper.methods.WaitUntil;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import static WebDriver.BaseTest.getWebDriver;
import static eFinancialCareers.app.signin.ui.HomePageUI.*;
import static eFinancialCareers.app.signin.ui.LandingPageUI.HOME_LINK_IMAGE;
import static eFinancialCareers.app.signin.ui.LandingPageUI.SIGN_IN_BUTTON;
import static eFinancialCareers.app.signin.ui.SignInFormUI.*;
import static helper.constants.Waits.FIFTEEN;
import static helper.constants.Waits.THIRTY;
import static helper.methods.Interactions.clickOn;
import static helper.methods.Interactions.enter;

public class SignIn {
    private static final ChromeDriver driver;

    static {
        driver = getWebDriver();
    }

    public  static void openSignInPage() {
        driver.get("https://www.efinancialcareers.co.uk/");
    }

    public  static void verifySignInPageIsOpened() {
        Assert.assertTrue(driver.findElement(HOME_LINK_IMAGE).isDisplayed());
        Assert.assertTrue(driver.findElement(SIGN_IN_BUTTON).isDisplayed());
    }

    public static void openSignInForm() {
        clickOn(SIGN_IN_BUTTON);
        WaitUntil.elementIsPresent(SIGN_IN_FORM, FIFTEEN);
    }

    public static void fillSignInForm(String email, String password) {
        enter(email).into(EMAIL_INPUT_FIELD);
        clickOn(CONTINUE_BUTTON);
        enter(password).into(PASSWORD_INPUT_FIELD);
        clickOn(SUBMIT_BUTTON);
    }

    public static void waitForSignInFormToClose() {
        WaitUntil.elementIsNotPresent(SIGN_IN_FORM, FIFTEEN);
        WaitUntil.elementIsNotPresent(PAGE_LOADER_SCREEN, THIRTY);
    }

    public static void openLoggedInDropdown() {
        WaitUntil.elementIsPresent(USER_AVATAR, FIFTEEN);
        clickOn(USER_AVATAR);
        WaitUntil.elementIsPresent(USER_DROPDOWN_MENU);
    }

    public static void verifySignInEmail(String email) {
        Assert.assertEquals(driver.findElement(LOGGED_IN_EMAIL).getText(), email);
    }

    public static void closeLoggedInDropdown() {
        clickOn(USER_AVATAR);
        WaitUntil.elementIsNotPresent(USER_DROPDOWN_MENU);
    }
}
