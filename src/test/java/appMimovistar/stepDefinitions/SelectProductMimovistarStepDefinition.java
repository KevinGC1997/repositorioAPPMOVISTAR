package appMimovistar.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.SelectProductMimovistar;

import java.io.IOException;

public class SelectProductMimovistarStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^Brandon select the product to user$")
    public void brandonSelectTheProductToUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProductMimovistar.onTheApp());
    }
}
