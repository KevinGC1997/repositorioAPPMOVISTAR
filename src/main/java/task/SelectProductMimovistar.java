package task;

import interactions.SelectProductsOfUsers;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SelectProductMimovistar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectProductsOfUsers.here()
        );

    }
    public static SelectProductMimovistar onTheApp(){
        return Instrumented.instanceOf(SelectProductMimovistar.class).withProperties();
    }
}
