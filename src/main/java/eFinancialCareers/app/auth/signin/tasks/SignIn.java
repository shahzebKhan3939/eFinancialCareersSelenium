package eFinancialCareers.app.auth.signin.tasks;

import eFinancialCareers.app.auth.signin.models.SignInParameters;
import net.serenitybdd.screenplay.Task;

import static eFinancialCareers.app.auth.signin.interactions.SignIn.fillSignInForm;
import static eFinancialCareers.app.auth.signin.interactions.SignIn.openSignInForm;

public class SignIn {

    public static Task using(SignInParameters signInParameters) {
        return Task.where("{0} tries to Sing In",
                openSignInForm(),
                fillSignInForm(signInParameters)
        );
    }
}
