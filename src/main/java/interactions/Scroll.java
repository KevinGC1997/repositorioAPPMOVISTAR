package interactions;

import appiumDriver.AppiumAndroidDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static appiumDriver.AppiumAndroidDriver.driver;

public class Scroll implements Interaction {

    Target element;

    public Scroll(Target element){
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("scroll");
        MobileElement listItem = driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().description(\"Cerrar sesión\"));"));
        System.out.println(listItem.getLocation());
        listItem.click();
    }
    public static Scroll here(){
        return Instrumented.instanceOf(Scroll.class).withProperties();
    }

}
