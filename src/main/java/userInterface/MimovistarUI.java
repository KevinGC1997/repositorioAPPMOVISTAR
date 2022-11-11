package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class MimovistarUI {

    public static final Target BTN_INICIAR_SESION = Target.the("Boton para loguearse")
            .locatedBy("(//*[@class='android.widget.Button'])[1]");
    public static final Target BTN_INGRESAR_CON_USUARIO = Target.the("Boton para ir a inicio de sesio")
            .locatedBy("(//*[@class='android.widget.Button'])[1]");
    public static final Target TXT_EMAIL = Target.the("ingresar usuario")
            .locatedBy("(//*[@class='android.widget.EditText'])[1]");
    public static final Target TXT_PASSWORD = Target.the("ungresar contraseña")
            .locatedBy("(//*[@class='android.widget.EditText'])[2]");
    public static final Target BTN_INICIA_SESION = Target.the("Boton para iniciar sesion al home de la app")
            .locatedBy("//*[@text='Iniciar sesión']");
    public static final Target LBL_NOMBRE_USUARIOS = Target.the("el nombre de los usuarios")
            .locatedBy("(//*[@class='android.widget.TextView'])[3]");
    public static final Target BTN_MENU_HAMBURGUESA = Target.the("boton menu hamburguesa")
            .locatedBy("//*[@text='menu']");
    public static final Target BTN_CERRAR_SESION = Target.the("boton cerrar sesion")
            .locatedBy("//*[@text='Cerrar sesión']");
    public static final Target BTN_INGRESAR_CON_LINEA_MOVIL = Target.the("boton para ingresar con sms")
            .locatedBy("//*[@text='Ingresar con una línea móvil']");
    public static final Target TXT_NUMERO_MOVIL = Target.the("caja para engresar numero movil")
            .locatedBy("//*[@class='android.widget.EditText']");
    public static final Target BTN_CONTINUAR = Target.the("boton para continuar y se envie SMS")
            .locatedBy("//*[@text='Continuar']");
    public static final Target BTN_DEPLEGAR_LISTA_PRODUCTOS = Target.the("boton para desplegar lista de productos")
            .locatedBy("(//*[@class='android.widget.TextView'])[6]");
    public static final Target LBL_LISTA_PRODUCTO = Target.the("lista de productos")
            .locatedBy("(//*[@class='android.view.View'])[31]");
    public static final Target TXT_NUMERO_LINEA = Target.the("numero de linea")
            .locatedBy("(//*[@class='android.widget.TextView'])[5]");
    public static final Target TXT_TIPO_LINEA = Target.the("tipo de lina")
            .locatedBy("(//*[@class='android.widget.TextView'])[4]");
}
