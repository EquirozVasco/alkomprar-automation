package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OrderStatusPage {
    public static final Target BUSQUEDA_POR_FACTURA = Target.the("Búsqueda por factura").locatedBy("//li[@class='track-order__choose-type-number--type invoice active']");
    public static final Target TXT_INGRESAR_NUMERO_FACTURA = Target.the("Ingresar factura").locatedBy("//input[@name='invoiceNumber']");
    public static final Target BUT_BUSCAR_FACTURA = Target.the("Boton buscar factura").locatedByFirstMatching("//button[@class='button-primary js-check-order js-animateBeforeSend']");
    public static final Target ALERTA_NEGATIVA = Target.the("Factura no encontrada").locatedBy("//div[@class='alert negative']");

}
