package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.AgregarComentario;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddOpinionProductStepDefinitions {

    @Cuando("{string} quiere agregar un comentario al producto {string}. Con {string} estrellas, la frase {string}, la opinion {string}, si lo recomienda como {string} y correo {string}")
    public void quiereAgregarUnComentarioAlProductoConEstrellasLaFraseLaOpinionSiLoRecomiendaComoYCorreo(
            String actor,
            String producto,
            String estrellas,
            String frase,
            String opinion,
            String recomendar,
            String correo
    ) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkomprar.com/"),
                AgregarComentario.comentario(
                        actor,
                        producto,
                        estrellas,
                        frase,
                        opinion,
                        recomendar,
                        correo
                )
        );
    }
    @Entonces("debe buscar el producto y agregar los datos")
    public void debeBuscarElProductoYAgregarLosDatos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
