package appMimovistar.stepDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.LoginSMSAppMimovistar;

import java.io.IOException;

public class LoginSMSMimovistarStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^Brandon login with the SMS$")
    public void brandonLoginWithTheSMS() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginSMSAppMimovistar.onThesite2());
    }
}
