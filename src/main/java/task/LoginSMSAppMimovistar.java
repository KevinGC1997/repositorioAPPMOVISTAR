package task;

import interactions.LoginSMSInteraction;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LoginSMSAppMimovistar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginSMSInteraction.here2()
        );
    }
    public static LoginSMSAppMimovistar onThesite2(){
        return Instrumented.instanceOf(LoginSMSAppMimovistar.class).withProperties();
    }
}
