package com.sophos.certificacion.searchcomputrabajo.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophos.certificacion.searchcomputrabajo.userinterfaces.ComputrabajoResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ComputrabajoResult implements Question<Boolean> {
	
	private static String message = "Can not show job offers";

	@Override
	public Boolean answeredBy(Actor actor) {
		//Devuelve true si el elemento esta visible
		 return the(ComputrabajoResultPage.TITLE).answeredBy(actor).isCurrentlyVisible();
	}
	
	//Constructor
	public static ComputrabajoResult page() {
		return new ComputrabajoResult();
	}
	
	public static String getmessage() {
		return message;
	}

}
