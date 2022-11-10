package eFinancialCareers.steps.auth;

import com.google.gson.JsonObject;
import eFinancialCareers.app.auth.signin.models.SignInParameters;
import eFinancialCareers.app.auth.signin.tasks.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;
import serenity.tasks.Navigate;

import static eFinancialCareers.app.auth.signin.interactions.SignIn.closeLoggedInDropdown;
import static eFinancialCareers.app.auth.signin.interactions.SignIn.openLoggedInDropdown;
import static eFinancialCareers.ui.HomePageUI.*;
import static eFinancialCareers.ui.LandingPageUI.HOME_LINK_IMAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.equalTo;
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

    @When("user Sign In using {jsonTestData}")
    public void userSignIn(JsonObject parameters) {
        signInParameters = deserializeJsonTo(parameters, SignInParameters.class);
        theActorInTheSpotlight().attemptsTo(SignIn.using(signInParameters));
    }

    @Then("verify that user is Singed In")
    public void verifyThatUserIsSignedIn() {
        theActorInTheSpotlight().attemptsTo(openLoggedInDropdown());
        theActorInTheSpotlight().should(
                seeThat(the(LOGGED_IN_EMAIL.of(signInParameters.email)), isPresent())
        );
        theActorInTheSpotlight().attemptsTo(closeLoggedInDropdown());
    }
}


//Ensure.that(LOGGED_IN_EMAIL.resolveFor(theActorInTheSpotlight()).getTextValue()).isEqualTo(signInParameters.email),