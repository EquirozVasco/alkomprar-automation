package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TiendasPage {
	public static final Target CIUDAD = Target.the("Ciudad {0} del menu").locatedBy("//li[@role='presentation']/a[@aria-controls='{0}']");
	public static final Target DATOS_TIENDA = Target.the("Ciudad {0}").locatedBy("//div[@data-city='todas {0}']");
}
