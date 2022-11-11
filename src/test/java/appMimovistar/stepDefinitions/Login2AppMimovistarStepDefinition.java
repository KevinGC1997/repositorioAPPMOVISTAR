package appMimovistar.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Login2AppMimovistar;

import java.io.IOException;

public class Login2AppMimovistarStepDefinition {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^Brandon logins on the app$")
    public void brandonLoginsOnTheApp() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login2AppMimovistar.onThesite());
    }

    @Then("^Brandon will be able to close session$")
    public void brandonWillBeAbleToCloseSession() {

    }
}
