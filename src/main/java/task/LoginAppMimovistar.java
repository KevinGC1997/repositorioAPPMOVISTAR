package task;

import interactions.ExplicitWait;
import interactions.LoginInteraction;
import interactions.Scroll;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static appiumDriver.AppiumAndroidDriver.driver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterface.MimovistarUI.*;

public class LoginAppMimovistar implements Task {

    private String email;
    private String password;

    private String validation;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(driver);

        actor.attemptsTo(
                ExplicitWait.here(10),
                Click.on(BTN_INICIAR_SESION),
                Click.on(BTN_INGRESAR_CON_USUARIO),
                ExplicitWait.here(10),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(password).into(TXT_PASSWORD)
        );
        //action.sendKeys(Keys.TAB).build().perform();
        //action.sendKeys(Keys.SPACE).build().perform();
        System.out.println("vamos al home");
        actor.attemptsTo(
                ExplicitWait.here(10),
                Click.on(BTN_INICIA_SESION),
                ExplicitWait.here(10),
                Ensure.that(LBL_NOMBRE_USUARIOS).text().contains(validation),
                LoginInteraction.here()
        );

    }
    public static LoginAppMimovistar onThesite(){
        return Instrumented.instanceOf(LoginAppMimovistar.class).withProperties();
    }
    public LoginAppMimovistar Email(String email) {
        this.email = email;
        return this;
    }
    public LoginAppMimovistar Password(String password) {
        this.password = password;
        return this;
    }
    public LoginAppMimovistar Validation(String validation){
        this.validation = validation;
        return this;
    }
}
