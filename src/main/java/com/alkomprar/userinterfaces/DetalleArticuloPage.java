package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleArticuloPage {
	public static final Target DIV_PRIMER_ELEMENTO = Target.the("Primer elemento").locatedByFirstMatching("//h2[@class='product__information--name']");
	public static final Target AGREGAR_ELEMENTO_CARRITO = Target.the("Agregar elemento al carrito").locatedByFirstMatching("//button[contains(text(), 'Agregar al carrito')]");
	public static final Target SELECCIONAR_PRIMER_ELEMENTO = Target.the("Seleccionar primer elemento").locatedByFirstMatching("//div[@class='product__item__information__image']/a[@class='js-algolia-product-click']");
}
