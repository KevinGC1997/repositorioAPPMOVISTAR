package appMimovistar.stepDefinitions;

import appiumDriver.AppiumAndroidDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import models.MimovistarLogin;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.jetbrains.annotations.NotNull;
import task.LoginAppMimovistar;

import java.io.IOException;
import java.util.List;

import static appiumDriver.AppiumAndroidDriver.driver;
import static userInterface.MimovistarUI.LBL_NOMBRE_USUARIOS;

public class LoginAppMimovistarStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^That Brandon access successfully$")
    public void thatBrandonAccessSuccessfully() {
        OnStage.theActorCalled("Kevin").can(BrowseTheWeb.with((AppiumAndroidDriver.appium().on())));

    }

    @When("^Brandon logins on the site$")
    public void brandonLoginsOnTheSite(List<MimovistarLogin> mimovistarLogins) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginAppMimovistar.onThesite()
                .Email(mimovistarLogins.get(0).getEmail())
                .Password(mimovistarLogins.get(0).getPassword())
                .Validation(mimovistarLogins.get(0).getValidation()));
    }

    @Then("^Brandon will be able to close session after (.*) is done$")
    public void brandonWillBeAbleToCloseSessionAfterExploraYGestionaTusProductosIsDone(String validation) {
        //driver.closeApp();
        /*OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(LBL_NOMBRE_USUARIOS.of()), WebElementStateMatchers.containsText(validation)));*/
    }


}
