package eFinancialCareers.app.signin.interactions;

import eFinancialCareers.app.signin.ui.LandingPageUI;
import org.openqa.selenium.chrome.ChromeDriver;

import static WebDriver.BaseTest.getWebDriver;
import static eFinancialCareers.app.signin.ui.LandingPageUI.SIGN_IN_BUTTON;
import static eFinancialCareers.app.signin.ui.SignInFormUI.*;

public class SignIn {
    private static final ChromeDriver driver;

    static {
        driver = getWebDriver();
    }

    public  static void openLoginPage() {
        driver.get("https://www.efinancialcareers.co.uk/");
    }

    public static void openSignInForm() {

        driver.findElement(SIGN_IN_BUTTON).click();

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
//        return Task.where("{0} waits for Sing In form to close",
//                WaitUntil.the(SIGN_IN_FORM, isNotPresent())
//                        .forNoMoreThan(FIFTEEN).seconds(),
//                WaitUntil.the(PAGE_LOADER_SCREEN, isNotPresent())
//                        .forNoMoreThan(THIRTY).seconds()
//        );
    }

    public static void openLoggedInDropdown() {
//        return Task.where("{0} opens Logged In Dropdown",
//                WaitUntil.the(USER_AVATAR, isPresent())
//                        .forNoMoreThan(THIRTY).seconds(),
//                WaitUntil.the(USER_AVATAR, isClickable()),
//                Click.on(USER_AVATAR),
//                WaitUntil.the(USER_DROPDOWN_MENU, isPresent())
//        );
    }


    public static void closeLoggedInDropdown() {
//        return Task.where("{0} closes Logged In Dropdown",
//                Click.on(USER_AVATAR),
//                WaitUntil.the(USER_DROPDOWN_MENU, isNotPresent())
//                        .forNoMoreThan(FIFTEEN).seconds()
//        );
    }
}
