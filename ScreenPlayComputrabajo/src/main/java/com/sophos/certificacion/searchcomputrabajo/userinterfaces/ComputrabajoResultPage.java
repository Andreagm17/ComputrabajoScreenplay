package com.sophos.certificacion.searchcomputrabajo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ComputrabajoResultPage extends PageObject{
	
	public static final Target TITLE = Target.the("Title").located(By.className("breadtitle_mvl"));

}
