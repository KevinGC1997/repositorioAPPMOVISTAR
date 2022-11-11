package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static userInterface.MimovistarUI.*;
import static utils.ExcelDataTable.ReadData;

public class LoginSMSInteraction implements Interaction {

    public ArrayList<Map<String, String>> dataExcelSMS;

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("hola");
        try {
            dataExcelSMS = ReadData("Data.xlsx", "numeros");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i<dataExcelSMS.size();i++) {
            System.out.println(dataExcelSMS.size());
            actor.attemptsTo(
                    ExplicitWait.here(10),
                    Click.on(BTN_INICIAR_SESION),
                    Click.on(BTN_INGRESAR_CON_LINEA_MOVIL),
                    ExplicitWait.here(10),
                    Enter.theValue(dataExcelSMS.get(i).get("numero")).into(TXT_NUMERO_MOVIL),
                    Click.on(BTN_CONTINUAR),
                    ExplicitWait.here(15),
                    Click.on(BTN_MENU_HAMBURGUESA),
                    ExplicitWait.here(10),
                    Click.on(BTN_CERRAR_SESION),
                    ExplicitWait.here(10)
            );
        }
    }
    public static LoginSMSInteraction here2(){
        return Instrumented.instanceOf(LoginSMSInteraction.class).withProperties();
    }
}
