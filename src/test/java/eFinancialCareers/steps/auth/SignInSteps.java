package eFinancialCareers.steps.auth;

import com.google.gson.JsonObject;
import eFinancialCareers.app.auth.signin.models.SignInParameters;
import eFinancialCareers.app.auth.signin.tasks.SignIn;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.waits.WaitUntil;
import serenity.tasks.Navigate;

import static eFinancialCareers.ui.HomePageUI.HOME_LINK_IMAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static serenity.constants.Waits.THIRTY;
import static utils.indexed.pojo.model.IndexedPojoDeserializer.deserializeJsonTo;

public class SignInSteps {
    private SignInParameters signInParameters;

    @Given("user navigates to eFinancialCareers site")
    public void userNavigatesToSite() {
        theActorInTheSpotlight().attemptsTo(
                Navigate.to("login.page"),
                WaitUntil.the(HOME_LINK_IMAGE, isPresent())
                        .forNoMoreThan(THIRTY).seconds()

        );
    }

    @Given("user Sign In using {jsonTestData}")
    public void userSignIn(JsonObject parameters) {
        signInParameters = deserializeJsonTo(parameters, SignInParameters.class);
        theActorInTheSpotlight().attemptsTo(SignIn.using(signInParameters));
    }
}
