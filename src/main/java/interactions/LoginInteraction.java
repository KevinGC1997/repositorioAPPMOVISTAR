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

public class LoginInteraction implements Interaction {

    public ArrayList<Map<String, String>> dataExcel;
    public ArrayList<Map<String, String>> dataExcel2;


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            dataExcel = ReadData("Data.xlsx", "usuarios");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataExcel2 = ReadData("Data.xlsx", "validacion");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i<dataExcel.size();i++) {
            System.out.println(dataExcel.size());
            actor.attemptsTo(
                    ExplicitWait.here(10),
                    Click.on(BTN_INICIAR_SESION),
                    Click.on(BTN_INGRESAR_CON_USUARIO),
                    ExplicitWait.here(10),
                    Enter.theValue(dataExcel.get(i).get("usuario")).into(TXT_EMAIL),
                    Enter.theValue(dataExcel.get(i).get("contraseña")).into(TXT_PASSWORD),
                    Click.on(BTN_INICIA_SESION),
                    ExplicitWait.here(10),
                    Ensure.that(LBL_NOMBRE_USUARIOS).text().contains(dataExcel2.get(i).get("usuarios")),
                    ExplicitWait.here(10),
                    Click.on(BTN_MENU_HAMBURGUESA),
                    ExplicitWait.here(10),
                    Click.on(BTN_CERRAR_SESION),
                    ExplicitWait.here(10)
            );
        }
    }
    public static LoginInteraction here(){
        return Instrumented.instanceOf(LoginInteraction.class).withProperties();
    }


}
