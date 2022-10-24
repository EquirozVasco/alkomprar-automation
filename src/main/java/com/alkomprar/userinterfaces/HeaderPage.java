package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HeaderPage {
	public static final Target SEGUIR_PEDIDO = Target.the("Enlace seguir pedido").locatedByFirstMatching("//a[@href='/sigue-tu-pedido']");

}
