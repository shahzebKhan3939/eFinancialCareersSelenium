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
import static helper.methods.WaitUntil.elementIsNotPresent;
import static helper.methods.WaitUntil.elementIsPresent;

public class SignIn {
    private static final ChromeDriver driver;

    static {
        driver = getWebDriver();
    }

    public  static void openLoginPage() {
        driver.get("https://www.efinancialcareers.co.uk/");
    }

    public  static void verifySignIn() {
        Assert.assertTrue(driver.findElement(HOME_LINK_IMAGE).isDisplayed());
        Assert.assertTrue(driver.findElement(SIGN_IN_BUTTON).isDisplayed());
    }

    public static void openSignInForm() {

        driver.findElement(SIGN_IN_BUTTON).click();
        WaitUntil.elementIsPresent(SIGN_IN_FORM, FIFTEEN);

//        return Task.where("{0} opens Sing In form",
//                WaitUntil.the(SIGN_IN_BUTTON, isPresent()),
//                Click.on(SIGN_IN_BUTTON),
//                WaitUntil.the(SIGN_IN_FORM, isPresent())
//                        .forNoMoreThan(FIFTEEN).seconds()
//        );
    }

    public static void fillSignInForm(String email, String password) {
        driver.findElement(EMAIL_INPUT_FIELD).sendKeys(email);
        driver.findElement(CONTINUE_BUTTON).click();
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        driver.findElement(SUBMIT_BUTTON).click();

//        return Task.where("{0} fills Sing In form",
//                WaitUntil.the(EMAIL_INPUT_FIELD, isPresent())
//                        .forNoMoreThan(FIFTEEN).seconds(),
//                Enter.keyValues(signInParameters.email).into(EMAIL_INPUT_FIELD),
//                Click.on(CONTINUE_BUTTON),
//                WaitUntil.the(PASSWORD_INPUT_FIELD, isPresent())
//                        .forNoMoreThan(FIFTEEN).seconds(),
//                Enter.keyValues(signInParameters.password).into(PASSWORD_INPUT_FIELD),
//                WaitUntil.the(SUBMIT_BUTTON, isClickable()),
//                Click.on(SUBMIT_BUTTON)
//        );
    }

    public static void waitForSignInFormToClose() {

        WaitUntil.elementIsNotPresent(SIGN_IN_FORM, FIFTEEN);
        WaitUntil.elementIsNotPresent(PAGE_LOADER_SCREEN, THIRTY);

//        return Task.where("{0} waits for Sing In form to close",
//                WaitUntil.the(SIGN_IN_FORM, isNotPresent())
//                        .forNoMoreThan(FIFTEEN).seconds(),
//                WaitUntil.the(PAGE_LOADER_SCREEN, isNotPresent())
//                        .forNoMoreThan(THIRTY).seconds()
//        );
    }

    public static void openLoggedInDropdown() {
        WaitUntil.elementIsPresent(USER_AVATAR, FIFTEEN);
        driver.findElement(USER_AVATAR).click();
        WaitUntil.elementIsPresent(USER_DROPDOWN_MENU);
//        return Task.where("{0} opens Logged In Dropdown",
//                WaitUntil.the(USER_AVATAR, isPresent())
//                        .forNoMoreThan(THIRTY).seconds(),
//                WaitUntil.the(USER_AVATAR, isClickable()),
//                Click.on(USER_AVATAR),
//                WaitUntil.the(USER_DROPDOWN_MENU, isPresent())
//        );
    }

    public static void verifySignInEmail(String email) {

        Assert.assertEquals(driver.findElement(LOGGED_IN_EMAIL).getText(), email);

    }

    public static void closeLoggedInDropdown() {
        driver.findElement(USER_AVATAR).click();
        WaitUntil.elementIsNotPresent(USER_DROPDOWN_MENU);


//        return Task.where("{0} closes Logged In Dropdown",
//                Click.on(USER_AVATAR),
//                WaitUntil.the(USER_DROPDOWN_MENU, isNotPresent())
//                        .forNoMoreThan(FIFTEEN).seconds()
//        );
    }
}
