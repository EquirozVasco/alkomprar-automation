package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HeaderPage {
	public static final Target SEGUIR_PEDIDO = Target.the("Enlace seguir pedido").locatedByFirstMatching("//a[@href='/sigue-tu-pedido']");
	public static final Target TIENDAS = Target.the("Enlace tiendas").locatedByFirstMatching("//ul[@class = 'yCmsComponent']//li[@class = 'menu-stores']//a[@href='/nuestra-compania/tiendas']");
}
