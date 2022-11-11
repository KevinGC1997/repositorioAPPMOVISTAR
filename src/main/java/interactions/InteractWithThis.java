package interactions;

import io.appium.java_client.MobileElement;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InteractWithThis implements Interaction {

    Target element;
    String text;

    public InteractWithThis(Target element, String text) {
        this.element = element;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement listLocation = element.resolveFor(actor);
        List<MobileElement> options = listLocation.findElements(By.xpath("(//*[@class='android.view.View'])[31]"));
        System.out.println(options + "poraqui");
        for(MobileElement i: options){
            System.out.println(i);
            System.out.println(i.getText());
            if(i.getText().contains(text)){
                i.click();
                break;
            }
        }

    }
    public static InteractWithThis list(Target element, String text){
        return Instrumented.instanceOf(InteractWithThis.class).withProperties(element, text);
    }
}
