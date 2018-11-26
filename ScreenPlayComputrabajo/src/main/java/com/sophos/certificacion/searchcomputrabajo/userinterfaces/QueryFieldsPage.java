package com.sophos.certificacion.searchcomputrabajo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class QueryFieldsPage extends PageObject{
	
	public static final Target AREA_TEXTBOX = Target.the("Area textbox").located(By.id("sq"));
	public static final Target PLACE_TEXTBOX = Target.the("Place textbox").located(By.id("sl"));
	public static final Target BUTTON_SEARCH = Target.the("button search").located(By.id("search"));

}
