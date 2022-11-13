package eFinancialCareers.app.signin.tasks;

import org.openqa.selenium.chrome.ChromeDriver;

import static WebDriver.BaseTest.getWebDriver;
import static eFinancialCareers.app.signin.interactions.SignIn.*;

public class SignIn {
    private static final ChromeDriver driver;

    static {
        driver = getWebDriver();
    }


    public static void using(String email, String password) {
        openLoginPage();
        verifySignIn();
        openSignInForm();
        fillSignInForm(email, password);
        openLoggedInDropdown();
        verifySignInEmail(email);
        closeLoggedInDropdown();
    }

//
//    public static Task using(SignInParameters signInParameters) {
//        return Task.where("{0} tries to Sing In",
//                openSignInForm(),
//                fillSignInForm(signInParameters),
//                waitForSignInFormToClose()
//        );
//    }
}
