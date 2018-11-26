package com.sophos.certificacion.searchcomputrabajo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OptionsComputrabajoPage extends PageObject {
	
	public static final Target OPTION_BUTTON = Target.the("Option button").located(By.linkText("https://www.computrabajo.com.pe/"));

}
