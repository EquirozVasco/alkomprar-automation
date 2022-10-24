package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.HeaderPage.SEGUIR_PEDIDO;
import static com.alkomprar.userinterfaces.HeaderPage.TIENDAS;
import static com.alkomprar.userinterfaces.OrderStatusPage.*;
import static com.alkomprar.userinterfaces.TiendasPage.CIUDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EncontrarTienda implements Task {
    private String ciudad;

    public EncontrarTienda(String ciudad) {
        this.ciudad = ciudad;
    }

    public static Performable ciudad(String ciudad) {
        return instrumented(EncontrarTienda.class, ciudad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TIENDAS),
                Click.on(CIUDAD.of(ciudad))
        );
    }
}
