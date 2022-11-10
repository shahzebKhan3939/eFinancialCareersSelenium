package eFinancialCareers.steps.auth;

import com.google.gson.JsonObject;
import eFinancialCareers.app.auth.login.models.LoginParameters;
import io.cucumber.java.en.Given;
import serenity.tasks.Navigate;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.indexed.pojo.model.IndexedPojoDeserializer.deserializeJsonTo;

public class LoginSteps {
    private LoginParameters loginParameters;

    @Given("user navigates to eFinancialCareers site")
    public void userNavigatesToSite() {
        theActorInTheSpotlight().attemptsTo(Navigate.to("login.page"));
    }

    @Given("user logins using {jsonTestData}")
    public void userNavigatesToSite(JsonObject parameters) {
        loginParameters = deserializeJsonTo(parameters, LoginParameters.class);
        System.out.println("Email: " + loginParameters.email);
        System.out.println("Password: " + loginParameters.password);
    }
}
