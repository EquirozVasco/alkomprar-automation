package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class ProductPage {
	public static final Target BOTON_AGREGAR_COMENTARIO = Target.the("btn agregar comentario").locatedBy("//div[@class='yotpo-default-button yotpo-icon-btn pull-right yotpo-hidden-mobile write-button write-review-button']");
	public static final Target SELECCIONAR_ESTRELLA = Target.the("Estrella seleccionada").locatedBy("//span[@data-score='{0}']");
	public static final Target TXT_FRASE = Target.the("Frase resumen").locatedBy("//input[@name='review_title']");
	public static final Target TXT_OPINION = Target.the("Opinion").locatedBy("//textarea[@id='yotpo_input_review_content_81ec2d9f-2eb3-424e-aef0-239366ac0177']");
	public static final Target RADIO_RECOMENDACION = Target.the("Radio Recomendacion").locatedByFirstMatching("//input[@value='{0}']");
	public static final Target TXT_NOMBRE = Target.the("Nombre").locatedBy("//input[@id='yotpo_input_review_username_81ec2d9f-2eb3-424e-aef0-239366ac0177']");
	public static final Target TXT_CORREO = Target.the("Correo").locatedByFirstMatching("//input[@name='email']");
	public static final Target BOTON_ENVIAR_COMENTARIO = Target.the("btn enviar comentario").locatedBy("//form[@aria-label='Write A Review Form']/div[@class='write-review-wrapper write-form visible']/div[@class='write-review yotpo-regular-box']/div[@class='form-element submit-button']/input[@value='Enviar']");
	public static final Target VALIDACION_RECIBIDO = Target.the("mensaje confirmacion").locatedBy("//div[@data-type='pending-for-review-approval']/div[@class='yotpo-thankyou-content']/span");
}