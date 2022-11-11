package task;

import interactions.LoginInteraction;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Login2AppMimovistar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginInteraction.here()
        );
    }
    public static Login2AppMimovistar onThesite(){
        return Instrumented.instanceOf(Login2AppMimovistar.class).withProperties();
    }
}
