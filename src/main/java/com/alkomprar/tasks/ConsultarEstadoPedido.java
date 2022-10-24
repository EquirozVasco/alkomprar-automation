package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.HeaderPage.SEGUIR_PEDIDO;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static com.alkomprar.userinterfaces.OrderStatusPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarEstadoPedido implements Task {
    private String factura;

    public ConsultarEstadoPedido(String factura) {
        this.factura = factura;
    }

    public static Performable factura(String factura) {
        return instrumented(ConsultarEstadoPedido.class, factura);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEGUIR_PEDIDO),
                WaitUntil.the(BUSQUEDA_POR_FACTURA, isVisible()),
                Click.on(BUSQUEDA_POR_FACTURA),
                Type.theValue(factura).into(TXT_INGRESAR_NUMERO_FACTURA),
                Click.on(BUT_BUSCAR_FACTURA)
        );
    }
}
