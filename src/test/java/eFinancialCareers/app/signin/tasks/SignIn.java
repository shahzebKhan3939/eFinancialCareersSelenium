package eFinancialCareers.app.signin.tasks;

import static eFinancialCareers.app.signin.interactions.SignIn.*;

public class SignIn {

    public static void using(String email, String password) {
        openLoginPage();
        verifySignIn();
        openSignInForm();
        fillSignInForm(email, password);
        openLoggedInDropdown();
        verifySignInEmail(email);
        closeLoggedInDropdown();
    }
}
