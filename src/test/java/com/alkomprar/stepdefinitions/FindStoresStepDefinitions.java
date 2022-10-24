package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import com.alkomprar.tasks.EncontrarTienda;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import static com.alkomprar.userinterfaces.TiendasPage.DATOS_TIENDA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FindStoresStepDefinitions {

    @Cuando("{string} quiere encontrar las tiendas en {string}")
    public void quiereEncontrarLasTiendasEn(String actor, String ciudad) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkomprar.com/"),
                EncontrarTienda.ciudad(ciudad)
        );
    }
    @Entonces("debe filtrar las tiendas por {string}")
    public void debeFiltrarLasTiendasPor(String ciudad) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that("//div[@id = 'stores']").hasSizeGreaterThan(1)
        );
    }

}
