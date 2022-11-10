package eFinancialCareers.app.auth.signin.interactions;

import eFinancialCareers.app.auth.signin.models.SignInParameters;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static eFinancialCareers.ui.HomePageUI.*;
import static eFinancialCareers.ui.LandingPageUI.SIGN_IN_BUTTON;
import static eFinancialCareers.ui.SignInFormUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static serenity.constants.Waits.FIFTEEN;
import static serenity.constants.Waits.THIRTY;

public class SignIn {

    public static Task openSignInForm() {
        return Task.where("{0} opens Sing In form",
                WaitUntil.the(SIGN_IN_BUTTON, isPresent()),
                Click.on(SIGN_IN_BUTTON),
                WaitUntil.the(SIGN_IN_FORM, isPresent())
                        .forNoMoreThan(FIFTEEN).seconds()
        );
    }

    public static Task fillSignInForm(SignInParameters signInParameters) {
        return Task.where("{0} fills Sing In form",
                WaitUntil.the(EMAIL_INPUT_FIELD, isPresent())
                        .forNoMoreThan(FIFTEEN).seconds(),
                Enter.keyValues(signInParameters.email).into(EMAIL_INPUT_FIELD),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(PASSWORD_INPUT_FIELD, isPresent())
                        .forNoMoreThan(FIFTEEN).seconds(),
                Enter.keyValues(signInParameters.password).into(PASSWORD_INPUT_FIELD),
                WaitUntil.the(SUBMIT_BUTTON, isClickable()),
                Click.on(SUBMIT_BUTTON)
        );
    }

    public static Task waitForSignInFormToClose() {
        return Task.where("{0} waits for Sing In form to close",
                WaitUntil.the(SIGN_IN_FORM, isNotPresent())
                        .forNoMoreThan(FIFTEEN).seconds(),
                WaitUntil.the(PAGE_LOADER_SCREEN, isNotPresent())
                        .forNoMoreThan(THIRTY).seconds()
        );
    }

    public static Task openLoggedInDropdown() {
        return Task.where("{0} opens Logged In Dropdown",
                WaitUntil.the(USER_AVATAR, isPresent())
                        .forNoMoreThan(THIRTY).seconds(),
                WaitUntil.the(USER_AVATAR, isClickable()),
                Click.on(USER_AVATAR),
                WaitUntil.the(USER_DROPDOWN_MENU, isPresent())
        );
    }


    public static Task closeLoggedInDropdown() {
        return Task.where("{0} closes Logged In Dropdown",
                Click.on(USER_AVATAR),
                WaitUntil.the(USER_DROPDOWN_MENU, isNotPresent())
                        .forNoMoreThan(FIFTEEN).seconds()
        );
    }
}
