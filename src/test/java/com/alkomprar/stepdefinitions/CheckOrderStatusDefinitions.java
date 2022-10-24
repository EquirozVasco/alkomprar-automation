package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.ConsultarEstadoPedido;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import static com.alkomprar.userinterfaces.OrderStatusPage.ALERTA_NEGATIVA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckOrderStatusDefinitions {

    @Cuando("^(.*) quiere consultar el estado del pedido con factura (.*)$")
    public void quiereConsultarElEstadoDelPedidoConFactura(String actor, String factura) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkomprar.com/"),
                ConsultarEstadoPedido.factura(factura)
        );
    }

    @Entonces("debe buscar el estado por factura {string}")
    public void debeBuscarElEstadoPorFactura(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ALERTA_NEGATIVA).isEnabled()
        );
    }
}
