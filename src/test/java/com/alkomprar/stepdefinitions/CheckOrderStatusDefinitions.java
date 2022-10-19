package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
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

public class CheckOrderStatusDefinitions {

    @Cuando("^(.*) quiere consultar el estado del pedido con factura (.*)$")
    public void quiereConsultarElEstadoDelPedidoConFactura(String actor, String factura) {
        theActorCalled(actor).attemptsTo(
                BuscarEstadoPedido.factura(factura)
        );
    }
    @Entonces("debe buscar el estado por factura {string}")
    public void debeBuscarElEstadoPorFactura(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("{string} quiere consultar el estado del pedido con factura {string}")
    public void quiereConsultarElEstadoDelPedidoConFactura(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe buscar el estado por factura {string}")
    public void debeBuscarElEstadoPorFactura(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
