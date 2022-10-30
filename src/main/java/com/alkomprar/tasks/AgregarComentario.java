package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.*;
import static com.alkomprar.userinterfaces.MenuPage.TXT_BUSCAR;
import static com.alkomprar.userinterfaces.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarComentario implements Task {
    private String nombre;
    private String producto;
    private String estrellas;
    private String frase;
    private String opinion;
    private String recomendar;
    private String correo;

    public AgregarComentario(
            String nombre,
            String producto,
            String estrellas,
            String frase,
            String opinion,
            String recomendar,
            String correo
    ) {
        this.nombre = nombre;
        this.producto = producto;
        this.estrellas = estrellas;
        this.frase = frase;
        this.opinion = opinion;
        this.recomendar = recomendar;
        this.correo = correo;
    }

    public static Performable comentario(
            String nombre,
            String producto,
            String estrellas,
            String frase,
            String opinion,
            String recomendar,
            String correo
    ) {
        return instrumented(
                AgregarComentario.class,
                nombre,
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
                Hit.the(Keys.ENTER).into(TXT_BUSCAR),
                WaitUntil.the(SELECCIONAR_PRIMER_ELEMENTO, isClickable()),
                Click.on(SELECCIONAR_PRIMER_ELEMENTO),
                WaitUntil.the(BOTON_AGREGAR_COMENTARIO, isClickable()),
                Click.on(BOTON_AGREGAR_COMENTARIO),
                WaitUntil.the(SELECCIONAR_ESTRELLA.of(estrellas), isVisible()),
                Click.on(SELECCIONAR_ESTRELLA.of(estrellas)),
                Type.theValue(frase).into(TXT_FRASE),
                Type.theValue(opinion).into(TXT_OPINION),
                Click.on(RADIO_RECOMENDACION.of(recomendar)),
                Type.theValue(nombre).into(TXT_NOMBRE),
                Type.theValue(correo).into(TXT_CORREO),
                Click.on(BOTON_ENVIAR_COMENTARIO)
        );
    }
}
