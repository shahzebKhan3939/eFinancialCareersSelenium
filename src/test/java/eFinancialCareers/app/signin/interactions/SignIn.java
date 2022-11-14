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
import static helper.methods.Interactions.*;
import static helper.methods.State.*;

public class SignIn {

    public  static void openSignInPage() {
        openPage("https://www.efinancialcareers.co.uk/");
    }

    public  static void verifySignInPageIsOpened() {
        Assert.assertTrue(elementPresent(HOME_LINK_IMAGE));
        Assert.assertTrue(elementPresent(SIGN_IN_BUTTON));
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
        WaitUntil.elementIsNotPresent(SIGN_IN_FORM);
        WaitUntil.elementIsNotPresent(PAGE_LOADER_SCREEN);
    }

    public static void verifySignInButtonNotPresent() {
        Assert.assertTrue(elementNotPresent(SIGN_IN_BUTTON));
    }

    public static void openLoggedInDropdown() {
        WaitUntil.elementIsPresent(USER_AVATAR, FIFTEEN);
        clickOn(USER_AVATAR);
        WaitUntil.elementIsPresent(USER_DROPDOWN_MENU);
    }

    public static void verifySignInEmail(String email) {
        Assert.assertEquals(textOf(LOGGED_IN_EMAIL), email);
    }

    public static void closeLoggedInDropdown() {
        clickOn(USER_AVATAR);
        WaitUntil.elementIsNotPresent(USER_DROPDOWN_MENU);
    }
}
