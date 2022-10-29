package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarComentario implements Task {
    private String actor;
    private String producto;
    private String estrellas;
    private String frase;
    private String opinion;
    private String recomendar;
    private String correo;

    public AgregarComentario(
            String actor,
            String producto,
            String estrellas,
            String frase,
            String opinion,
            String recomendar,
            String correo
    ) {
        this.actor = actor;
        this.producto = producto;
        this.estrellas = estrellas;
        this.frase = frase;
        this.opinion = opinion;
        this.recomendar = recomendar;
        this.correo = correo;
    }

    public static Performable comentario(
            String actor,
            String producto,
            String estrellas,
            String frase,
            String opinion,
            String recomendar,
            String correo
    ) {
        return instrumented(
                AgregarComentario.class,
                actor,
                producto,
                estrellas,
                frase,
                opinion,
                recomendar,
                correo
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(producto).into(TXT_BUSCAR),
                DoubleClick.on(TXT_BUSCAR),
                Hit.the(Keys.ENTER).into(TXT_BUSCAR)
        );
    }
}
